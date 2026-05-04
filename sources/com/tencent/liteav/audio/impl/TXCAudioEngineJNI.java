package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.media.AudioManager;
import com.tencent.liteav.audio.TXCAudioEncoderConfig;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.audio.d;
import com.tencent.liteav.audio.f;
import com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.StatusBucket;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.basic.util.h;
import java.io.File;
import java.lang.ref.WeakReference;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCAudioEngineJNI {
    private static final String TAG = "TXCAudioEngineJNI";
    public static final int kInvalidCacheSize = Integer.MAX_VALUE;
    private static WeakReference<f> mAudioCaptureDataListener;
    private static a mAudioDumpingListener;
    private static WeakReference<d> mMixedAllDataListener;
    private static AudioManager sAudioManager;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a();
    }

    static {
        h.d();
        nativeCacheClassForNative();
        mAudioDumpingListener = null;
        mAudioCaptureDataListener = null;
        mMixedAllDataListener = new WeakReference<>(null);
    }

    public static void InitTraeEngineLibrary(Context context) {
        if (context == null) {
            TXCLog.e(TAG, "InitTraeEngineLibrary failed, context is null!");
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String str = applicationInfo.nativeLibraryDir;
            String str2 = applicationInfo.dataDir + "/lib";
            String str3 = "/data/data/" + applicationInfo.packageName + "/lib";
            String e11 = h.e();
            if (e11 == null) {
                e11 = "";
            }
            nativeAppendLibraryPath("add_libpath:" + str);
            nativeAppendLibraryPath("add_libpath:" + str2);
            nativeAppendLibraryPath("add_libpath:" + str3);
            nativeAppendLibraryPath("add_libpath:" + e11);
        } catch (UnsatisfiedLinkError e12) {
            TXCLog.e(TAG, "init trae engine library failed.", e12);
        }
    }

    public static void SetAudioDumpingListener(a aVar) {
        mAudioDumpingListener = aVar;
    }

    private static AudioManager getAudioManager() {
        if (sAudioManager == null) {
            sAudioManager = (AudioManager) TXCAudioEngine.getInstance().getAppContext().getSystemService("audio");
        }
        return sAudioManager;
    }

    public static int getAudioMode() {
        try {
            AudioManager audioManager = getAudioManager();
            if (audioManager != null) {
                return audioManager.getMode();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static StatusBucket getStatus(int i11) {
        return nativeGetStatus(i11);
    }

    public static int getSystemVolume() {
        try {
            int i11 = getAudioMode() == 0 ? 3 : 0;
            AudioManager audioManager = getAudioManager();
            if (audioManager != null) {
                return audioManager.getStreamVolume(i11);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static boolean isAppInBackground() {
        return h.a(TXCAudioEngine.getInstance().getAppContext());
    }

    public static native void nativeAppendLibraryPath(String str);

    public static native void nativeCacheClassForNative();

    public static boolean nativeCheckTraeEngine(Context context) {
        if (context == null) {
            TXCLog.e(TAG, "nativeCheckTraeEngine failed, context is null!");
            return false;
        }
        if (h.a("traeimp-rtmp")) {
            TXCLog.e(TAG, "link traeimp-rtmp success !");
            return true;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String str = applicationInfo.nativeLibraryDir;
        String str2 = applicationInfo.dataDir + "/lib";
        String str3 = "/data/data/" + applicationInfo.packageName + "/lib";
        String e11 = h.e();
        if (e11 == null) {
            e11 = "";
        }
        if (!new File(str + "/libtraeimp-rtmp.so").exists()) {
            TXCLog.w(TAG, "nativeCheckTraeEngine load so error " + str + "/libtraeimp-rtmp.so");
            if (!new File(str2 + "/libtraeimp-rtmp.so").exists()) {
                TXCLog.w(TAG, "nativeCheckTraeEngine load so error " + str2 + "/libtraeimp-rtmp.so");
                if (!new File(str3 + "/libtraeimp-rtmp.so").exists()) {
                    TXCLog.w(TAG, "nativeCheckTraeEngine load so error " + str3 + "/libtraeimp-rtmp.so");
                    if (!new File(e11 + "/libtraeimp-rtmp.so").exists()) {
                        TXCLog.w(TAG, "nativeCheckTraeEngine load so error " + e11 + "/libtraeimp-rtmp.so");
                        TXCLog.e(TAG, "nativeCheckTraeEngine failed, can not find trae libs !");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static native void nativeClean();

    public static native void nativeCloseAudioTunnel(int i11);

    public static native void nativeDeleteAudioSessionDuplicate();

    public static native void nativeEnableAudioEarMonitoring(boolean z11);

    public static native void nativeEnableAudioVolumeEvaluation(boolean z11, int i11);

    public static native void nativeEnableAutoRestartDevice(boolean z11);

    public static native void nativeEnableCaptureEOSMode(boolean z11);

    public static native void nativeEnableCustomAudioRendering(boolean z11);

    public static native void nativeEnableDeviceAbnormalDetection(boolean z11);

    public static native void nativeEnableEncodedDataCallback(boolean z11);

    public static native void nativeEnableEncodedDataPackWithTRAEHeaderCallback(boolean z11);

    public static native void nativeEnableInbandFEC(boolean z11);

    public static native void nativeEnableMixMode(boolean z11);

    public static native void nativeEnableVolumeEvaluationWhenMuted(boolean z11);

    public static native void nativeForceCallbackMixedPlayAudioFrame(boolean z11);

    public static native void nativeGetCustomAudioRenderingFrame(byte[] bArr, int i11, int i12);

    public static native int nativeGetEncoderChannels();

    public static native TXCAudioEncoderConfig nativeGetEncoderConfig();

    public static native int nativeGetEncoderSampleRate();

    public static native int nativeGetMixingPlayoutVolumeLevel();

    public static native int nativeGetRemotePlayoutVolumeLevel(String str);

    public static native int nativeGetSoftwareCaptureVolumeLevel();

    public static native StatusBucket nativeGetStatus(int i11);

    public static native void nativeInitAudioDevice();

    public static native void nativeInitBeforeEngineCreate(Context context, String str);

    public static native boolean nativeIsAudioDeviceCapturing();

    public static native boolean nativeIsAudioDevicePlaying();

    public static native boolean nativeIsDataCallbackFormatInvalid(int i11, int i12, int i13);

    public static native boolean nativeIsRemoteAudioPlaying(String str);

    public static native void nativeMuteLocalAudio(boolean z11);

    public static native void nativeMuteRemoteAudio(String str, boolean z11);

    public static native void nativeMuteRemoteAudioInSpeaker(String str, boolean z11);

    public static native void nativeNewAudioSessionDuplicate(Context context);

    public static native void nativeNotifySystemEarMonitoringInitializing();

    public static native int nativeOpenAudioTunnel(boolean z11);

    public static native void nativePauseAudioCapture(boolean z11);

    public static native void nativePauseLocalAudio();

    public static native void nativeResumeAudioCapture();

    public static native void nativeResumeLocalAudio();

    public static native void nativeSendCustomPCMData(byte[] bArr, int i11, long j11, int i12, int i13);

    public static native void nativeSetAudioCacheParams(int i11, int i12);

    public static native void nativeSetAudioCompatibleConfig(String str);

    public static native void nativeSetAudioDeviceDSPEnabled(boolean z11);

    public static native void nativeSetAudioEarMonitoringVolume(int i11);

    public static native void nativeSetAudioEncoderParam(int i11, int i12);

    public static native void nativeSetAudioEngineCaptureDataCallback(boolean z11);

    public static native void nativeSetAudioEngineCaptureRawDataCallback(boolean z11);

    public static native void nativeSetAudioEngineEncodedDataCallback(boolean z11);

    public static native void nativeSetAudioEngineMixedAllDataCallback(boolean z11);

    public static native void nativeSetAudioEngineRemoteStreamDataListener(String str, boolean z11);

    public static native void nativeSetAudioFrameExtraData(byte[] bArr);

    public static native void nativeSetAudioPlayoutTunnelEnabled(boolean z11);

    public static native void nativeSetAudioQuality(int i11, int i12);

    public static native void nativeSetAudioQualityEx(int i11, int i12, int i13, int i14, int i15, int i16);

    public static native void nativeSetAudioRoute(int i11);

    public static native void nativeSetCaptureDataCallbackFormat(int i11, int i12, int i13);

    public static native void nativeSetCaptureVoiceChanger(int i11);

    public static native void nativeSetEncoderChannels(int i11);

    public static native void nativeSetEncoderFECPercent(float f11);

    public static native void nativeSetEncoderSampleRate(int i11);

    public static native void nativeSetEventCallbackEnabled(boolean z11);

    public static native void nativeSetLocalProcessedDataCallbackFormat(int i11, int i12, int i13);

    public static native void nativeSetMaxSelectedPlayStreams(int i11);

    public static native void nativeSetMixingPlayoutVolume(float f11);

    public static native void nativeSetPlayoutDataCallbackFormat(int i11, int i12, int i13);

    public static native void nativeSetPlayoutDataListener(boolean z11);

    public static native void nativeSetPlayoutDevice(int i11);

    public static native void nativeSetRecordReverb(int i11);

    public static native void nativeSetRecordReverbParam(int i11, float f11);

    public static native void nativeSetRemoteAudioBlockThreshold(String str, long j11);

    public static native void nativeSetRemoteAudioCacheParams(String str, boolean z11, int i11, int i12, int i13);

    public static native void nativeSetRemoteAudioJitterCycle(String str, long j11);

    public static native void nativeSetRemotePlayoutVolume(String str, int i11);

    public static native void nativeSetRemoteStreamDataCallbackFormat(String str, int i11, int i12, int i13);

    public static native void nativeSetSoftAEC(int i11);

    public static native void nativeSetSoftAGC(int i11);

    public static native void nativeSetSoftANS(int i11);

    public static native void nativeSetSoftwareCaptureVolume(float f11);

    public static native void nativeSetSystemEarMonitoring(TXSystemAudioKit tXSystemAudioKit);

    public static native void nativeSetSystemVolumeType(int i11);

    public static native void nativeSetVolumeToTunnel(int i11, int i12);

    public static native void nativeStartLocalAudio(int i11, boolean z11);

    public static native int nativeStartLocalAudioDumping(int i11, int i12, int i13, String str);

    public static native String nativeStartRemoteAudio(TXCAudioEngine tXCAudioEngine, boolean z11, String str);

    public static native void nativeStopLocalAudio();

    public static native void nativeStopLocalAudioDumping();

    public static native void nativeStopRemoteAudio(String str);

    public static native void nativeUseSysAudioDevice(boolean z11);

    public static native int nativeWriteDataToTunnel(int i11, int i12, int i13, int i14, byte[] bArr);

    public static void onError(String str, int i11, String str2, String str3) {
        TXCAudioEngine.getInstance().onError(str, i11, str2, str3);
    }

    public static void onEvent(String str, int i11, String str2, String str3) {
        TXCAudioEngine.getInstance().onEvent(str, i11, str2, str3);
    }

    public static void onLocalAudioWriteFail() {
        a aVar = mAudioDumpingListener;
        if (aVar != null) {
            aVar.a();
        }
    }

    public static void onMixedAllData(byte[] bArr, int i11, int i12) {
        d dVar = mMixedAllDataListener.get();
        if (dVar != null) {
            dVar.a(bArr, i11, i12);
        }
    }

    public static void onRecordEncData(byte[] bArr, long j11, int i11, int i12) {
        WeakReference<f> weakReference = mAudioCaptureDataListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().b(bArr, j11, i11, i12, 16);
    }

    public static void onRecordError(int i11, String str) {
        TXCLog.e(TAG, "onRecordError: " + i11 + j2.O + str);
        WeakReference<f> weakReference = mAudioCaptureDataListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().a(i11, str);
    }

    public static void onRecordPcmData(byte[] bArr, long j11, int i11, int i12, int i13) {
        WeakReference<f> weakReference = mAudioCaptureDataListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().a(bArr, j11, i11, i12, i13);
    }

    public static void onRecordRawPcmData(byte[] bArr, long j11, int i11, int i12, int i13) {
        WeakReference<f> weakReference = mAudioCaptureDataListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().a(bArr, j11, i11, i12, i13, false);
    }

    public static void onWarning(String str, int i11, String str2, String str3) {
        TXCAudioEngine.getInstance().onWarning(str, i11, str2, str3);
    }

    public static void pauseAudioCapture(boolean z11) {
        nativePauseAudioCapture(z11);
    }

    public static void resumeAudioCapture() {
        nativeResumeAudioCapture();
    }

    public static void sendCustomPCMData(byte[] bArr, int i11, int i12) {
        nativeSendCustomPCMData(bArr, bArr.length, TXCTimeUtil.generatePtsMS(), i11, i12);
    }

    public static void setAudioCaptureDataListener(WeakReference<f> weakReference) {
        mAudioCaptureDataListener = weakReference;
        nativeSetAudioEngineCaptureDataCallback(weakReference != null);
        nativeSetAudioEngineCaptureRawDataCallback(mAudioCaptureDataListener != null);
        nativeSetAudioEngineEncodedDataCallback(mAudioCaptureDataListener != null);
    }

    public static void setMixedAllDataListener(d dVar) {
        mMixedAllDataListener = new WeakReference<>(dVar);
        nativeSetAudioEngineMixedAllDataCallback(dVar != null);
    }

    public static void sendCustomPCMData(com.tencent.liteav.basic.structs.a aVar) {
        byte[] bArr = aVar.f43401f;
        nativeSendCustomPCMData(bArr, bArr.length, aVar.f43400e, aVar.f43396a, aVar.f43397b);
    }
}
