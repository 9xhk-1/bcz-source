package com.tencent.liteav.audio.impl.earmonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.multimedia.liteav.audiokit.interfaces.HwAudioKaraokeFeatureKit;
import com.huawei.multimedia.liteav.audiokit.interfaces.HwAudioKit;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.j;
import java.util.concurrent.TimeUnit;
import jr.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class HuaweiAudioKit implements c, TXSystemAudioKit, j.a {
    private static final int BACKGROUND_CHECK_INTERVAL = (int) TimeUnit.SECONDS.toMillis(1);
    private static final String TAG = "HuaweiAudioKit";
    private a mAudioKitCallback;
    private j mBackgroundCheckTimer;
    private HwAudioKit mHwAudioKit;
    private HwAudioKaraokeFeatureKit mKaraokeKit;
    private final Handler mUiHandler = new Handler(Looper.getMainLooper());
    private boolean mIsAudioKitIniting = false;
    private boolean mIsEarMonitoringEnabled = false;
    private boolean mIsBackgroundWhenLastCheck = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void dealWithAudioKitResultInternal(int i11) {
        a aVar;
        TXCLog.i(TAG, "on audio kit callback: %d", Integer.valueOf(i11));
        if (i11 == 0) {
            this.mIsAudioKitIniting = false;
            a aVar2 = this.mAudioKitCallback;
            if (aVar2 != null) {
                aVar2.onAudioKitInitFinished(this, true);
            }
            HwAudioKit hwAudioKit = this.mHwAudioKit;
            HwAudioKit.FeatureType featureType = HwAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE;
            if (hwAudioKit.p(featureType)) {
                this.mKaraokeKit = (HwAudioKaraokeFeatureKit) this.mHwAudioKit.l(featureType);
                return;
            }
            a aVar3 = this.mAudioKitCallback;
            if (aVar3 != null) {
                aVar3.onEarMonitoringInitialized(this, false);
                return;
            }
            return;
        }
        if (i11 == 1000) {
            a aVar4 = this.mAudioKitCallback;
            if (aVar4 != null) {
                aVar4.onEarMonitoringInitialized(this, true);
                return;
            }
            return;
        }
        if (i11 == 1805 || (aVar = this.mAudioKitCallback) == null) {
            return;
        }
        if (!this.mIsAudioKitIniting) {
            aVar.onAudioKitError(this);
        } else {
            aVar.onAudioKitInitFinished(this, false);
            this.mIsAudioKitIniting = false;
        }
    }

    private boolean isAppInBackground() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance != 100;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemEarMonitoringVolumeInternal(int i11) {
        TXCLog.i(TAG, "setSystemEarMonitoringVolumeInternal: %d, kit: %s", Integer.valueOf(i11), this.mKaraokeKit);
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = this.mKaraokeKit;
        if (hwAudioKaraokeFeatureKit != null) {
            int s11 = hwAudioKaraokeFeatureKit.s(HwAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i11);
            if (s11 == 1806 || s11 == -2) {
                dealWithAudioKitResultInternal(-2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSystemEarMonitoringInternal() {
        TXCLog.i(TAG, "startSystemEarMonitoring kit: %s", this.mKaraokeKit);
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = this.mKaraokeKit;
        if (hwAudioKaraokeFeatureKit == null) {
            return;
        }
        int m11 = hwAudioKaraokeFeatureKit.m(true);
        if (m11 == 0 || m11 == 1805) {
            this.mIsEarMonitoringEnabled = true;
        } else {
            dealWithAudioKitResultInternal(1003);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTimer() {
        if (this.mBackgroundCheckTimer != null) {
            return;
        }
        TXCLog.i(TAG, "start background checking timer");
        j jVar = new j(Looper.getMainLooper(), this);
        this.mBackgroundCheckTimer = jVar;
        jVar.a(0, BACKGROUND_CHECK_INTERVAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopSystemEarMonitoringInternal() {
        TXCLog.i(TAG, "stopSystemEarMonitoring");
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = this.mKaraokeKit;
        if (hwAudioKaraokeFeatureKit != null) {
            hwAudioKaraokeFeatureKit.m(false);
            this.mIsEarMonitoringEnabled = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopTimer() {
        if (this.mBackgroundCheckTimer != null) {
            TXCLog.i(TAG, "stop background checking timer");
            this.mBackgroundCheckTimer.a();
            this.mBackgroundCheckTimer = null;
        }
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void initialize(final Context context, final a aVar) {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.1
            @Override // java.lang.Runnable
            public void run() {
                if (HuaweiAudioKit.this.mHwAudioKit != null) {
                    TXCLog.e(HuaweiAudioKit.TAG, "it's already initialized.");
                    return;
                }
                TXCLog.i(HuaweiAudioKit.TAG, "start initialize audio kit");
                HuaweiAudioKit.this.mIsAudioKitIniting = true;
                HuaweiAudioKit.this.mAudioKitCallback = aVar;
                HuaweiAudioKit.this.mHwAudioKit = new HwAudioKit(context.getApplicationContext(), HuaweiAudioKit.this);
                HuaweiAudioKit.this.mHwAudioKit.o();
            }
        });
    }

    @Override // jr.c
    public void onResult(final int i11) {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.6
            @Override // java.lang.Runnable
            public void run() {
                HuaweiAudioKit.this.dealWithAudioKitResultInternal(i11);
            }
        });
    }

    @Override // com.tencent.liteav.basic.util.j.a
    public void onTimeout() {
        boolean isAppInBackground = isAppInBackground();
        if (this.mIsEarMonitoringEnabled && this.mIsBackgroundWhenLastCheck && !isAppInBackground) {
            stopSystemEarMonitoringInternal();
            startSystemEarMonitoringInternal();
        } else if (isAppInBackground && !this.mIsBackgroundWhenLastCheck) {
            TXCLog.i(TAG, "app has gone to background.");
        }
        this.mIsBackgroundWhenLastCheck = isAppInBackground;
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void setSystemEarMonitoringVolume(final int i11) {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.5
            @Override // java.lang.Runnable
            public void run() {
                HuaweiAudioKit.this.setSystemEarMonitoringVolumeInternal(i11);
            }
        });
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void startSystemEarMonitoring() {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.3
            @Override // java.lang.Runnable
            public void run() {
                HuaweiAudioKit.this.startTimer();
                HuaweiAudioKit.this.startSystemEarMonitoringInternal();
            }
        });
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void stopSystemEarMonitoring() {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.4
            @Override // java.lang.Runnable
            public void run() {
                HuaweiAudioKit.this.stopTimer();
                HuaweiAudioKit.this.stopSystemEarMonitoringInternal();
            }
        });
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void uninitialize() {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.2
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.i(HuaweiAudioKit.TAG, "uninitialize");
                if (HuaweiAudioKit.this.mKaraokeKit != null) {
                    HuaweiAudioKit.this.mKaraokeKit.l();
                    HuaweiAudioKit.this.mKaraokeKit = null;
                }
                if (HuaweiAudioKit.this.mHwAudioKit != null) {
                    HuaweiAudioKit.this.mHwAudioKit.m();
                    HuaweiAudioKit.this.mHwAudioKit = null;
                }
                HuaweiAudioKit.this.mIsAudioKitIniting = false;
            }
        });
    }
}
