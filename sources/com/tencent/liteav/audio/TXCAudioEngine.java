package com.tencent.liteav.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.alipay.sdk.m.u.i;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.impl.Play.TXCMultAudioTrackPlayer;
import com.tencent.liteav.audio.impl.Record.TXCAudioSysRecord;
import com.tencent.liteav.audio.impl.TXCAudioEngineJNI;
import com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit;
import com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.StatusBucket;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCAudioEngine implements com.tencent.liteav.audio.impl.b, com.tencent.liteav.audio.impl.earmonitor.a {
    private static final int EVT_AUDIO_DEVICE_RESTART_WHEN_USING_STABLE_SAMPLERATE = 10056;
    private static final int EVT_AUDIO_DEVICE_ROLLBACK_TO_STABLE_SAMPLERATE = 10055;
    private static final String TAG = "AudioEngine :TXCAudioEngine_java";
    private TXSystemAudioKit mAudioKit;
    private static final long SYSTEM_AUDIO_KIT_RESTART_INTERVAL = TimeUnit.SECONDS.toMillis(2);
    static TXCAudioEngine sInstance = new TXCAudioEngine();
    protected static Context mContext = null;
    private static boolean has_trae = false;
    private static WeakReference<e> mAudioCoreDataListener = null;
    protected static final HashMap<String, WeakReference<e>> mJitterDataListenerMap = new HashMap<>();
    private static final Object mJitterDataListenerMapLock = new Object();
    protected static final HashMap<String, WeakReference<c>> mJitterEventListenerMap = new HashMap<>();
    private static final Object mJitterEventListenerMapLock = new Object();
    private static volatile boolean has_init = false;
    private final ArrayList<WeakReference<com.tencent.liteav.basic.b.a>> mCallbackList = new ArrayList<>();
    protected boolean mDeviceIsRecording = false;
    protected boolean mIsCustomRecord = false;
    private final Object mStartStopRemoteAudioMutex = new Object();
    protected boolean mIsCallComed = false;

    private TXCAudioEngine() {
    }

    public static synchronized void CreateInstance(Context context, String str, boolean z11) {
        synchronized (TXCAudioEngine.class) {
            CreateInstanceWithoutInitDevice(context, str, z11);
            TXCAudioEngineJNI.nativeInitAudioDevice();
        }
    }

    public static synchronized void CreateInstanceWithoutInitDevice(Context context, String str, boolean z11) {
        synchronized (TXCAudioEngine.class) {
            TXCLog.i(TAG, "CreateInstance: ");
            mContext = context.getApplicationContext();
            if (has_init) {
                TXCLog.i(TAG, "CreateInstance already created~ ");
                return;
            }
            if (TXCAudioEngineJNI.nativeCheckTraeEngine(context)) {
                has_trae = true;
            }
            TXCAudioEngineJNI.nativeUseSysAudioDevice(!has_trae);
            TXCAudioEngineJNI.nativeSetAudioDeviceDSPEnabled(z11);
            if (has_trae) {
                TXCAudioEngineJNI.InitTraeEngineLibrary(context);
                TXCAudioEngineJNI.nativeSetAudioCompatibleConfig(str);
                TXCAudioEngineJNI.nativeInitBeforeEngineCreate(context, getAudioResourceDirectory(mContext));
                com.tencent.liteav.audio.impl.a.a().a(context.getApplicationContext());
                com.tencent.liteav.audio.impl.a.a().a(sInstance);
                TXCAudioEngineJNI.nativeNewAudioSessionDuplicate(mContext);
            } else {
                TXCMultAudioTrackPlayer.getInstance();
                TXCAudioSysRecord.getInstance();
            }
            has_init = true;
        }
    }

    public static String buildTRAEConfig(Context context, Boolean bool, boolean z11, long j11) {
        String str = ((("sharp {\n") + "  os android\n") + "  trae {\n") + "    dev {\n";
        if (bool != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  closeOpensl ");
            sb2.append(bool.booleanValue() ? "n" : "y");
            sb2.append("\n");
            str = sb2.toString();
        }
        boolean z12 = System.currentTimeMillis() - TXCAudioSettings.getInstance().getLong(TXCAudioSettings.TIMESTAMP_ROLLBACK_TO_STABLE_SAMPLERATE, 0L) < j11;
        TXCLog.i(TAG, "low latency samplerate, enable: %b, isBlocked: %b, blockTime: %d", Boolean.valueOf(z11), Boolean.valueOf(z12), Long.valueOf(j11));
        if (!z12 && z11 && getLowLatencySampleRate(context) == 48000) {
            str = ((((((str + "  traemodes 1|2\n") + "  cap {\n") + "    hw_sr 48000\n") + "  }\n") + "  play {\n") + "    hw_sr 48000\n") + "  }";
        }
        return ((str + "    }\n") + "  }\n") + i.f11099d;
    }

    private TXSystemAudioKit createManufacturerAudioKit(Context context) {
        if (com.tencent.liteav.basic.util.e.f43439c.equalsIgnoreCase("huawei")) {
            return new HuaweiAudioKit();
        }
        return null;
    }

    public static void enableAudioEarMonitoring(boolean z11) {
        TXCLog.i(TAG, "enableAudioEarMonitoring: " + z11);
        TXCAudioEngineJNI.nativeEnableAudioEarMonitoring(z11);
    }

    public static boolean enableAudioVolumeEvaluation(boolean z11, int i11) {
        TXCLog.i(TAG, "enableAudioVolumeEvaluation : " + z11 + "interval:" + i11);
        TXCAudioEngineJNI.nativeEnableAudioVolumeEvaluation(z11, i11);
        return true;
    }

    private static String getAudioResourceDirectory(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(absolutePath);
        String str = File.separator;
        sb2.append(str);
        sb2.append("liteav");
        sb2.append(str);
        sb2.append("audiores");
        String sb3 = sb2.toString();
        if (new File(sb3).mkdirs()) {
            TXCLog.e(TAG, "create audio resource directory failed.");
        }
        return sb3;
    }

    public static TXCAudioEngine getInstance() {
        return sInstance;
    }

    private static int getLowLatencySampleRate(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        try {
            return Integer.parseInt(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"));
        } catch (NumberFormatException e11) {
            TXCLog.e(TAG, "can't parse low latency samplerate", e11);
            return -1;
        }
    }

    public static int getMixingPlayoutVolumeLevel() {
        return TXCAudioEngineJNI.nativeGetMixingPlayoutVolumeLevel();
    }

    private void handleAudioEvent(String str, int i11, String str2, String str3) {
        if (i11 == EVT_AUDIO_DEVICE_ROLLBACK_TO_STABLE_SAMPLERATE) {
            TXCAudioSettings.getInstance().setLong(TXCAudioSettings.TIMESTAMP_ROLLBACK_TO_STABLE_SAMPLERATE, System.currentTimeMillis());
        } else if (i11 == EVT_AUDIO_DEVICE_RESTART_WHEN_USING_STABLE_SAMPLERATE) {
            TXCAudioSettings.getInstance().setLong(TXCAudioSettings.TIMESTAMP_ROLLBACK_TO_STABLE_SAMPLERATE, 0L);
            TXCLog.i(TAG, "audio device restart when using stable samplerate");
        }
    }

    public static boolean hasTrae() {
        return has_trae;
    }

    public static void onAudioJitterBufferNotify(String str, int i11, String str2) {
        c cVar;
        synchronized (mJitterEventListenerMapLock) {
            try {
                HashMap<String, WeakReference<c>> hashMap = mJitterEventListenerMap;
                cVar = hashMap.get(str) != null ? hashMap.get(str).get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            TXCLog.i(TAG, "onAudioJitterBufferNotify  cur state " + i11);
            cVar.a(str, i11, str2);
        }
    }

    public static void onAudioPlayPcmData(String str, byte[] bArr, long j11, int i11, int i12, byte[] bArr2) {
        e eVar;
        synchronized (mJitterDataListenerMapLock) {
            try {
                HashMap<String, WeakReference<e>> hashMap = mJitterDataListenerMap;
                eVar = hashMap.get(str) != null ? hashMap.get(str).get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (eVar != null) {
            eVar.a(str, bArr, j11, i11, i12, bArr2);
        }
    }

    public static void onCorePlayPcmData(byte[] bArr, long j11, int i11, int i12) {
        e eVar;
        WeakReference<e> weakReference = mAudioCoreDataListener;
        if (weakReference == null || (eVar = weakReference.get()) == null) {
            return;
        }
        eVar.a(null, bArr, j11, i11, i12, null);
    }

    public static void setAudioEarMonitoringVolume(int i11) {
        TXCLog.i(TAG, "setAudioEarMonitoringVolume: " + i11);
        TXCAudioEngineJNI.nativeSetAudioEarMonitoringVolume(i11);
    }

    public static void setAudioRoute(int i11) {
        TXCLog.i(TAG, "setAudioRoute: " + i11);
        TXCAudioEngineJNI.nativeSetAudioRoute(i11);
    }

    public static void setPlayoutDataListener(e eVar) {
        mAudioCoreDataListener = new WeakReference<>(eVar);
        TXCAudioEngineJNI.nativeSetPlayoutDataListener(eVar != null);
    }

    public static void setSystemVolumeType(int i11) {
        TXCLog.i(TAG, "setSystemVolumeType: " + i11);
        TXCAudioEngineJNI.nativeSetSystemVolumeType(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSystemAudioKit() {
        Context context;
        if (this.mAudioKit != null || (context = mContext) == null) {
            return;
        }
        TXSystemAudioKit createManufacturerAudioKit = createManufacturerAudioKit(context);
        this.mAudioKit = createManufacturerAudioKit;
        if (createManufacturerAudioKit == null) {
            TXCAudioEngineJNI.nativeSetSystemEarMonitoring(null);
        } else {
            TXCAudioEngineJNI.nativeNotifySystemEarMonitoringInitializing();
            this.mAudioKit.initialize(mContext, this);
        }
    }

    public void EnableMixMode(boolean z11) {
        TXCAudioEngineJNI.nativeEnableMixMode(z11);
    }

    public boolean IsDataCallbackFormatInvalid(int i11, int i12, int i13) {
        return TXCAudioEngineJNI.nativeIsDataCallbackFormatInvalid(i11, i12, i13);
    }

    public void SetAudioCacheParams(int i11, int i12) {
        TXCAudioEngineJNI.nativeSetAudioCacheParams(i11, i12);
    }

    public void addEventCallback(WeakReference<com.tencent.liteav.basic.b.a> weakReference) {
        if (weakReference == null) {
            return;
        }
        synchronized (this.mCallbackList) {
            this.mCallbackList.add(weakReference);
            TXCAudioEngineJNI.nativeSetEventCallbackEnabled(true);
        }
    }

    public void clean() {
        TXCAudioEngineJNI.nativeClean();
    }

    public void enableAutoRestartDevice(boolean z11) {
        TXCAudioEngineJNI.nativeEnableAutoRestartDevice(z11);
    }

    public boolean enableCaptureEOSMode(boolean z11) {
        TXCLog.i(TAG, "enableEosMode " + z11);
        TXCAudioEngineJNI.nativeEnableCaptureEOSMode(z11);
        return true;
    }

    public void enableDeviceAbnormalDetection(boolean z11) {
        TXCAudioEngineJNI.nativeEnableDeviceAbnormalDetection(z11);
    }

    public void enableEncodedDataCallback(boolean z11) {
        TXCAudioEngineJNI.nativeEnableEncodedDataCallback(z11);
    }

    public void enableEncodedDataPackWithTRAEHeaderCallback(boolean z11) {
        TXCAudioEngineJNI.nativeEnableEncodedDataPackWithTRAEHeaderCallback(z11);
    }

    public void enableInbandFEC(boolean z11) {
        TXCAudioEngineJNI.nativeEnableInbandFEC(z11);
    }

    public void enableSoftAEC(boolean z11, int i11) {
        TXCLog.i(TAG, "enableSoftAEC: enable = " + z11 + " level = " + i11);
        if (!z11) {
            i11 = 0;
        }
        TXCAudioEngineJNI.nativeSetSoftAEC(i11);
    }

    public void enableSoftAGC(boolean z11, int i11) {
        TXCLog.i(TAG, "enableSoftAGC: enable = " + z11 + " level = " + i11);
        if (!z11) {
            i11 = 0;
        }
        TXCAudioEngineJNI.nativeSetSoftAGC(i11);
    }

    public void enableSoftANS(boolean z11, int i11) {
        TXCLog.i(TAG, "enableSoftANS: enable = " + z11 + " level = " + i11);
        if (!z11) {
            i11 = 0;
        }
        TXCAudioEngineJNI.nativeSetSoftANS(i11);
    }

    public void enableVolumeEvaluationWhenMuted(boolean z11) {
        TXCAudioEngineJNI.nativeEnableVolumeEvaluationWhenMuted(z11);
    }

    public void forceCallbackMixedPlayAudioFrame(boolean z11) {
        TXCAudioEngineJNI.nativeForceCallbackMixedPlayAudioFrame(z11);
    }

    public int getAECType() {
        return 2;
    }

    public Context getAppContext() {
        return mContext;
    }

    public TXCAudioEncoderConfig getAudioEncoderConfig() {
        return TXCAudioEngineJNI.nativeGetEncoderConfig();
    }

    public int getEncoderChannels() {
        return TXCAudioEngineJNI.nativeGetEncoderChannels();
    }

    public int getEncoderSampleRate() {
        return TXCAudioEngineJNI.nativeGetEncoderSampleRate();
    }

    public int getPlayAECType() {
        return has_trae ? 2 : 0;
    }

    public int getPlayChannels() {
        return 2;
    }

    public int getPlaySampleRate() {
        return 48000;
    }

    public int getRemotePlayoutVolumeLevel(String str) {
        if (str == null) {
            return 0;
        }
        return TXCAudioEngineJNI.nativeGetRemotePlayoutVolumeLevel(str);
    }

    public int getSoftwareCaptureVolumeLevel() {
        return TXCAudioEngineJNI.nativeGetSoftwareCaptureVolumeLevel();
    }

    public StatusBucket getStatus(int i11) {
        return TXCAudioEngineJNI.getStatus(i11);
    }

    public boolean isAudioDeviceCapturing() {
        boolean nativeIsAudioDeviceCapturing = TXCAudioEngineJNI.nativeIsAudioDeviceCapturing();
        TXCLog.i(TAG, "isRecording: " + nativeIsAudioDeviceCapturing);
        return nativeIsAudioDeviceCapturing;
    }

    public boolean isRemoteAudioPlaying(String str) {
        if (str == null) {
            return false;
        }
        return TXCAudioEngineJNI.nativeIsRemoteAudioPlaying(str);
    }

    public boolean muteLocalAudio(boolean z11) {
        TXCLog.i(TAG, "setRecordMute: " + z11);
        TXCAudioEngineJNI.nativeMuteLocalAudio(z11);
        return true;
    }

    public void muteRemoteAudio(String str, boolean z11) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeMuteRemoteAudio(str, z11);
    }

    public void muteRemoteAudioInSpeaker(String str, boolean z11) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeMuteRemoteAudioInSpeaker(str, z11);
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.a
    public void onAudioKitError(TXSystemAudioKit tXSystemAudioKit) {
        if (this.mAudioKit != tXSystemAudioKit) {
            return;
        }
        TXCLog.i(TAG, "onAudioKitError");
        TXSystemAudioKit tXSystemAudioKit2 = this.mAudioKit;
        if (tXSystemAudioKit2 != null) {
            tXSystemAudioKit2.stopSystemEarMonitoring();
            this.mAudioKit.uninitialize();
            this.mAudioKit = null;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.tencent.liteav.audio.TXCAudioEngine.1
            @Override // java.lang.Runnable
            public void run() {
                TXCAudioEngine.this.startSystemAudioKit();
            }
        }, SYSTEM_AUDIO_KIT_RESTART_INTERVAL);
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.a
    public void onAudioKitInitFinished(TXSystemAudioKit tXSystemAudioKit, boolean z11) {
        if (this.mAudioKit != tXSystemAudioKit) {
            return;
        }
        TXCLog.i(TAG, "system audio kit init finished, ret: %b.", Boolean.valueOf(z11));
        if (z11) {
            return;
        }
        TXCAudioEngineJNI.nativeSetSystemEarMonitoring(null);
    }

    @Override // com.tencent.liteav.audio.impl.b
    public void onCallStateChanged(int i11) {
        if (i11 == 0) {
            TXCLog.i(TAG, "TelephonyManager.CALL_STATE_IDLE!");
            if (this.mIsCallComed) {
                this.mIsCallComed = false;
                TXCAudioEngineJNI.resumeAudioCapture();
                TXAudioEffectManagerImpl.getInstance().recoverAllMusics();
                TXAudioEffectManagerImpl.getCacheInstance().recoverAllMusics();
                TXAudioEffectManagerImpl.getAutoCacheHolder().recoverAllMusics();
                return;
            }
            return;
        }
        if (i11 == 1) {
            TXCLog.i(TAG, "TelephonyManager.CALL_STATE_RINGING!");
            return;
        }
        if (i11 != 2) {
            return;
        }
        TXCLog.i(TAG, "TelephonyManager.CALL_STATE_OFFHOOK!");
        TXCAudioEngineJNI.pauseAudioCapture(true);
        TXAudioEffectManagerImpl.getInstance().interruptAllMusics();
        TXAudioEffectManagerImpl.getCacheInstance().interruptAllMusics();
        TXAudioEffectManagerImpl.getAutoCacheHolder().interruptAllMusics();
        this.mIsCallComed = true;
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.a
    public void onEarMonitoringInitialized(TXSystemAudioKit tXSystemAudioKit, boolean z11) {
        if (this.mAudioKit != tXSystemAudioKit) {
            return;
        }
        TXCLog.i(TAG, "onEarMonitoringInitialized result: %b", Boolean.valueOf(z11));
        if (z11) {
            TXCAudioEngineJNI.nativeSetSystemEarMonitoring(this.mAudioKit);
        } else {
            TXCAudioEngineJNI.nativeSetSystemEarMonitoring(null);
        }
    }

    public void onError(String str, int i11, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mCallbackList) {
            try {
                if (this.mCallbackList.size() <= 0) {
                    return;
                }
                Iterator<WeakReference<com.tencent.liteav.basic.b.a>> it = this.mCallbackList.iterator();
                while (it.hasNext()) {
                    com.tencent.liteav.basic.b.a aVar = it.next().get();
                    if (aVar != null) {
                        arrayList.add(aVar);
                    } else {
                        it.remove();
                    }
                }
                if (this.mCallbackList.size() <= 0) {
                    TXCAudioEngineJNI.nativeSetEventCallbackEnabled(false);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((com.tencent.liteav.basic.b.a) it2.next()).c(str, i11, str2, str3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onEvent(String str, int i11, String str2, String str3) {
        handleAudioEvent(str, i11, str2, str3);
        ArrayList arrayList = new ArrayList();
        synchronized (this.mCallbackList) {
            try {
                if (this.mCallbackList.size() <= 0) {
                    return;
                }
                Iterator<WeakReference<com.tencent.liteav.basic.b.a>> it = this.mCallbackList.iterator();
                while (it.hasNext()) {
                    com.tencent.liteav.basic.b.a aVar = it.next().get();
                    if (aVar != null) {
                        arrayList.add(aVar);
                    } else {
                        it.remove();
                    }
                }
                if (this.mCallbackList.size() <= 0) {
                    TXCAudioEngineJNI.nativeSetEventCallbackEnabled(false);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((com.tencent.liteav.basic.b.a) it2.next()).a(str, i11, str2, str3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onWarning(String str, int i11, String str2, String str3) {
        handleAudioEvent(str, i11, str2, str3);
        ArrayList arrayList = new ArrayList();
        synchronized (this.mCallbackList) {
            try {
                if (this.mCallbackList.size() <= 0) {
                    return;
                }
                Iterator<WeakReference<com.tencent.liteav.basic.b.a>> it = this.mCallbackList.iterator();
                while (it.hasNext()) {
                    com.tencent.liteav.basic.b.a aVar = it.next().get();
                    if (aVar != null) {
                        arrayList.add(aVar);
                    } else {
                        it.remove();
                    }
                }
                if (this.mCallbackList.size() <= 0) {
                    TXCAudioEngineJNI.nativeSetEventCallbackEnabled(false);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((com.tencent.liteav.basic.b.a) it2.next()).b(str, i11, str2, str3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int pauseAudioCapture(boolean z11) {
        TXCLog.i(TAG, "pauseAudioCapture: " + z11);
        TXCAudioEngineJNI.pauseAudioCapture(z11);
        return 0;
    }

    public void pauseLocalAudio() {
        TXCAudioEngineJNI.nativePauseLocalAudio();
    }

    public int resumeAudioCapture() {
        TXCLog.i(TAG, "resumeRecord");
        TXCAudioEngineJNI.resumeAudioCapture();
        return 0;
    }

    public void resumeLocalAudio() {
        TXCAudioEngineJNI.nativeResumeLocalAudio();
    }

    public void sendCustomPCMData(byte[] bArr, int i11, int i12) {
        TXCAudioEngineJNI.sendCustomPCMData(bArr, i11, i12);
    }

    public boolean setAudioCaptureDataListener(f fVar) {
        TXCLog.i(TAG, "setRecordListener ");
        if (fVar == null) {
            TXCAudioEngineJNI.setAudioCaptureDataListener(null);
            return true;
        }
        TXCAudioEngineJNI.setAudioCaptureDataListener(new WeakReference(fVar));
        return true;
    }

    public void setAudioDumpingListener(TXCAudioEngineJNI.a aVar) {
        TXCAudioEngineJNI.SetAudioDumpingListener(aVar);
    }

    public boolean setAudioEncoderParam(int i11, int i12) {
        TXCAudioEngineJNI.nativeSetAudioEncoderParam(i11, i12);
        return true;
    }

    public void setAudioFrameExtraData(byte[] bArr) {
        TXCAudioEngineJNI.nativeSetAudioFrameExtraData(bArr);
    }

    public void setAudioQuality(int i11, int i12) {
        TXCAudioEngineJNI.nativeSetAudioQuality(i11, i12);
    }

    public void setCaptureDataCallbackFormat(int i11, int i12, int i13) {
        TXCLog.i(TAG, "setCaptureDataCallbackFormat: sampleRate-" + i11 + " channels-" + i12 + " length-" + i13);
        TXCAudioEngineJNI.nativeSetCaptureDataCallbackFormat(i11, i12, i13);
    }

    public void setEncoderChannels(int i11) {
        TXCAudioEngineJNI.nativeSetEncoderChannels(i11);
    }

    public boolean setEncoderFECPercent(float f11) {
        TXCAudioEngineJNI.nativeSetEncoderFECPercent(f11);
        return true;
    }

    public void setEncoderSampleRate(int i11) {
        TXCAudioEngineJNI.nativeSetEncoderSampleRate(i11);
    }

    public void setLocalProcessedDataCallbackFormat(int i11, int i12, int i13) {
        TXCLog.i(TAG, "setLocalProcessedDataCallbackFormat: sampleRate-" + i11 + " channels-" + i12 + " length-" + i13);
        TXCAudioEngineJNI.nativeSetLocalProcessedDataCallbackFormat(i11, i12, i13);
    }

    public void setMaxSelectedPlayStreams(int i11) {
        TXCAudioEngineJNI.nativeSetMaxSelectedPlayStreams(i11);
    }

    public void setMixedAllDataListener(d dVar) {
        TXCAudioEngineJNI.setMixedAllDataListener(dVar);
    }

    public boolean setMixingPlayoutVolume(float f11) {
        TXCLog.i(TAG, "setPlayoutVolume: " + f11);
        TXCAudioEngineJNI.nativeSetMixingPlayoutVolume(f11);
        return true;
    }

    public void setPlayoutDataCallbackFormat(int i11, int i12, int i13) {
        TXCLog.i(TAG, "setPlayoutDataCallbackFormat: sampleRate-" + i11 + " channels-" + i12 + " length-" + i13);
        TXCAudioEngineJNI.nativeSetPlayoutDataCallbackFormat(i11, i12, i13);
    }

    public void setRemoteAudioCacheParams(String str, boolean z11, int i11, int i12, int i13) {
        TXCAudioEngineJNI.nativeSetRemoteAudioCacheParams(str, z11, i11, i12, i13);
    }

    public void setRemoteAudioStreamEventListener(String str, c cVar) {
        if (str == null) {
            return;
        }
        synchronized (mJitterEventListenerMapLock) {
            mJitterEventListenerMap.put(str, new WeakReference<>(cVar));
        }
    }

    public void setRemotePlayoutVolume(String str, int i11) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeSetRemotePlayoutVolume(str, i11);
    }

    public void setRemoteStreamDataCallbackFormat(String str, int i11, int i12, int i13) {
        TXCLog.i(TAG, "setRemoteStreamDataCallbackFormat: id-" + str + " sampleRate-" + i11 + " channels-" + i12 + " length-" + i13);
        TXCAudioEngineJNI.nativeSetRemoteStreamDataCallbackFormat(str, i11, i12, i13);
    }

    public boolean setReverbParamType(int i11, float f11) {
        TXCLog.i(TAG, "setReverbParamType: reverbParamType =" + i11 + " value = " + f11);
        TXCAudioEngineJNI.nativeSetRecordReverbParam(i11, f11);
        return true;
    }

    public boolean setReverbType(int i11) {
        TXCAudioEngineJNI.nativeSetRecordReverb(i11);
        return true;
    }

    public void setSetAudioEngineRemoteStreamDataListener(String str, e eVar) {
        if (str == null) {
            return;
        }
        synchronized (mJitterDataListenerMapLock) {
            mJitterDataListenerMap.put(str, new WeakReference<>(eVar));
        }
        TXCAudioEngineJNI.nativeSetAudioEngineRemoteStreamDataListener(str, eVar != null);
    }

    public boolean setSoftwareCaptureVolume(float f11) {
        TXCLog.i(TAG, "setRecordVolume: " + f11);
        TXCAudioEngineJNI.nativeSetSoftwareCaptureVolume(f11);
        return true;
    }

    public void setSystemAudioKitEnabled() {
        startSystemAudioKit();
    }

    public boolean setVoiceChangerType(TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType) {
        TXCLog.i(TAG, "setVoiceChangerType " + tXVoiceChangerType.getNativeValue());
        TXCAudioEngineJNI.nativeSetCaptureVoiceChanger(tXVoiceChangerType.getNativeValue());
        return true;
    }

    public int startLocalAudio(int i11, boolean z11) {
        TXCLog.i(TAG, "startLocalAudio audioFormat:" + i11);
        Context context = mContext;
        if (context == null) {
            TXCLog.i(TAG, "Please call CreateInstance fisrt!!!");
            return TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
        }
        TXCAudioEngineJNI.InitTraeEngineLibrary(context);
        TXCAudioEngineJNI.nativeStartLocalAudio(i11, z11);
        this.mDeviceIsRecording = true;
        return 0;
    }

    public int startLocalAudioDumping(int i11, int i12, int i13, String str) {
        return TXCAudioEngineJNI.nativeStartLocalAudioDumping(i11, i12, i13, str);
    }

    public void startRemoteAudio(String str, boolean z11) {
        synchronized (this.mStartStopRemoteAudioMutex) {
            TXCAudioEngineJNI.nativeStartRemoteAudio(sInstance, z11, str);
        }
        TXCAudioEngineJNI.nativeSetRemoteAudioJitterCycle(str, com.tencent.liteav.basic.d.c.a().a("Audio", "LIVE_JitterCycle"));
        TXCAudioEngineJNI.nativeSetRemoteAudioBlockThreshold(str, com.tencent.liteav.basic.d.c.a().a("Audio", "LoadingThreshold"));
    }

    public int stopLocalAudio() {
        TXCLog.i(TAG, "stopLocalAudio");
        TXCAudioEngineJNI.nativeStopLocalAudio();
        this.mDeviceIsRecording = false;
        return 0;
    }

    public void stopLocalAudioDumping() {
        TXCAudioEngineJNI.nativeStopLocalAudioDumping();
    }

    public void stopRemoteAudio(String str) {
        if (str == null) {
            return;
        }
        synchronized (this.mStartStopRemoteAudioMutex) {
            TXCAudioEngineJNI.nativeStopRemoteAudio(str);
        }
    }

    public void sendCustomPCMData(com.tencent.liteav.basic.structs.a aVar) {
        TXCAudioEngineJNI.sendCustomPCMData(aVar);
    }

    public void setAudioQuality(int i11, int i12, int i13, int i14, int i15, int i16) {
        TXCAudioEngineJNI.nativeSetAudioQualityEx(i11, i12, i13, i14, i15, i16);
    }
}
