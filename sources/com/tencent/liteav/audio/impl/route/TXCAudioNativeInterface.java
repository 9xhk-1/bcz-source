package com.tencent.liteav.audio.impl.route;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import com.tencent.liteav.audio.impl.route.a;
import com.tencent.liteav.audio.impl.route.f;
import com.tencent.liteav.basic.log.TXCLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCAudioNativeInterface {
    private static final int OUTPUT_MODE_HEADSET = 0;
    private static final int OUTPUT_MODE_SPEAKER = 1;
    private static final String TAG = "AudioNativeInterface";
    private final e mAudioRouteManager;
    private final Context mContext;
    private String[] mDeviceList = null;
    private AudioManager mAudioManager = null;
    private f mAudioSession = null;

    public TXCAudioNativeInterface(Context context) {
        this.mContext = context;
        this.mAudioRouteManager = new e(context);
        TXCLog.i(TAG, "AudioDeviceInterface SDK_INT: %d, MANUFACTURE: %s, MODEL: %s", Integer.valueOf(Build.VERSION.SDK_INT), Build.MANUFACTURER, Build.MODEL);
    }

    public static void LogTraceEntry(String str) {
        TXCLog.i(TAG, getTraceInfo() + " entry:" + str);
    }

    public static void LogTraceExit() {
        TXCLog.i(TAG, getTraceInfo() + " exit");
    }

    private AudioManager getAudioManager() {
        Context context;
        if (this.mAudioManager == null && (context = this.mContext) != null) {
            this.mAudioManager = (AudioManager) context.getSystemService("audio");
        }
        return this.mAudioManager;
    }

    private static String getTraceInfo() {
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        sb2.append(stackTrace[2].getClassName());
        sb2.append(".");
        sb2.append(stackTrace[2].getMethodName());
        sb2.append(": ");
        sb2.append(stackTrace[2].getLineNumber());
        return sb2.toString();
    }

    private a.EnumC0508a nativeValueToAudioIOScene(int i11) {
        a.EnumC0508a enumC0508a = a.EnumC0508a.STOPPED;
        return (i11 < 0 || i11 >= 7) ? enumC0508a : new a.EnumC0508a[]{enumC0508a, enumC0508a, a.EnumC0508a.VOICE_CHAT, a.EnumC0508a.MEDIA_PLAY_AND_RECORD, a.EnumC0508a.MEDIA_PLAYBACK, a.EnumC0508a.VOICE_PLAYBACK, a.EnumC0508a.IDLE}[i11];
    }

    private void updateVolumeTypeForMedia() {
        LogTraceEntry("");
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && audioManager.getMode() != 0) {
            audioManager.setMode(0);
        }
        this.mAudioSession.d();
        LogTraceExit();
    }

    private void updateVolumeTypeForVoIP(a.EnumC0508a enumC0508a) {
        LogTraceEntry("");
        this.mAudioSession.a(a.a(enumC0508a));
        this.mAudioSession.d();
        LogTraceExit();
    }

    private void waitAMomentIfInPhoneCall() {
        if (getAudioManager() == null) {
            return;
        }
        int i11 = 5;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0 || this.mAudioManager.getMode() != 2) {
                return;
            }
            TXCLog.e(TAG, "waiting.  mode:" + this.mAudioManager.getMode());
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
            }
            i11 = i12;
        }
    }

    public void initAudioRouteManager() {
        if (this.mContext == null) {
            return;
        }
        TXCLog.i(TAG, "initAudioManager, TXCAudioSession create");
        if (this.mAudioSession == null) {
            this.mAudioSession = new f(this.mContext, this.mAudioRouteManager, new f.a() { // from class: com.tencent.liteav.audio.impl.route.TXCAudioNativeInterface.1
                @Override // com.tencent.liteav.audio.impl.route.f.a
                public void a(String[] strArr, String str, String str2, String str3) {
                    TXCAudioNativeInterface.this.mDeviceList = strArr;
                }

                @Override // com.tencent.liteav.audio.impl.route.f.a
                public void a(int i11, String[] strArr, String str, String str2, String str3) {
                    TXCAudioNativeInterface.this.mDeviceList = strArr;
                }
            });
        }
        this.mAudioSession.a("DEVICE_EARPHONE;DEVICE_SPEAKERPHONE;DEVICE_BLUETOOTHHEADSET;DEVICE_WIREDHEADSET;");
    }

    public void notifyAudioIOSceneChanged(int i11, int i12) {
        a.EnumC0508a nativeValueToAudioIOScene = nativeValueToAudioIOScene(i11);
        a.EnumC0508a nativeValueToAudioIOScene2 = nativeValueToAudioIOScene(i12);
        TXCLog.i(TAG, "notify audio io scene changed, %s -> %s", nativeValueToAudioIOScene, nativeValueToAudioIOScene2);
        if (!nativeValueToAudioIOScene.a()) {
            this.mAudioSession.e();
        }
        this.mAudioRouteManager.a(nativeValueToAudioIOScene2);
        if (nativeValueToAudioIOScene2 != a.EnumC0508a.STOPPED) {
            AudioManager audioManager = getAudioManager();
            if (audioManager != null) {
                waitAMomentIfInPhoneCall();
                if (audioManager.isMicrophoneMute()) {
                    audioManager.setMicrophoneMute(false);
                    TXCLog.i(TAG, "setMicrophoneMute false when ioscene changed");
                }
            }
            if (nativeValueToAudioIOScene2.a()) {
                updateVolumeTypeForMedia();
            } else {
                updateVolumeTypeForVoIP(nativeValueToAudioIOScene2);
            }
        }
    }

    public int setAudioOutputMode(int i11) {
        f fVar;
        TXCLog.w(TAG, "TXCAudioSession SetAudioOutputMode: " + i11);
        if (i11 != 0) {
            if (1 != i11 || (fVar = this.mAudioSession) == null) {
                return -1;
            }
            fVar.b("DEVICE_SPEAKERPHONE");
            return 0;
        }
        if (this.mDeviceList == null || this.mAudioSession == null) {
            return -1;
        }
        boolean z11 = false;
        do {
            int i12 = 0;
            while (true) {
                String[] strArr = this.mDeviceList;
                if (i12 >= strArr.length || z11) {
                    break;
                }
                if ("DEVICE_WIREDHEADSET".equals(strArr[i12])) {
                    this.mAudioSession.b("DEVICE_WIREDHEADSET");
                    z11 = true;
                }
                i12++;
            }
            int i13 = 0;
            while (true) {
                String[] strArr2 = this.mDeviceList;
                if (i13 >= strArr2.length || z11) {
                    break;
                }
                if ("DEVICE_BLUETOOTHHEADSET".equals(strArr2[i13])) {
                    this.mAudioSession.b("DEVICE_BLUETOOTHHEADSET");
                    z11 = true;
                }
                i13++;
            }
            int i14 = 0;
            while (true) {
                String[] strArr3 = this.mDeviceList;
                if (i14 >= strArr3.length || z11) {
                    break;
                }
                if ("DEVICE_EARPHONE".equals(strArr3[i14])) {
                    this.mAudioSession.b("DEVICE_EARPHONE");
                    z11 = true;
                }
                i14++;
            }
        } while (!z11);
        return 0;
    }

    public int startService(String str) {
        TXCLog.i(TAG, "startService: " + this.mAudioSession + " deviceConfig:" + str);
        f fVar = this.mAudioSession;
        if (fVar != null) {
            return fVar.a(str);
        }
        return -1;
    }

    public int stopService() {
        TXCLog.i(TAG, "stopService: " + this.mAudioSession);
        f fVar = this.mAudioSession;
        if (fVar != null) {
            return fVar.c();
        }
        return -1;
    }

    public void uninitAudioRouteManager() {
        if (this.mContext == null) {
            TXCLog.w(TAG, "uninitTXCAudioManager , context null");
            return;
        }
        TXCLog.w(TAG, "uninitTXCAudioManager , stopService");
        f fVar = this.mAudioSession;
        if (fVar != null) {
            fVar.c();
            this.mAudioSession.b();
            this.mAudioSession = null;
        }
    }
}
