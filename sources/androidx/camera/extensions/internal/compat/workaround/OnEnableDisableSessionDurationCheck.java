package androidx.camera.extensions.internal.compat.workaround;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class OnEnableDisableSessionDurationCheck {

    @VisibleForTesting
    static final long MIN_DURATION_FOR_ENABLE_DISABLE_SESSION = 100;
    private static final String TAG = "OnEnableDisableSessionDurationCheck";
    private final boolean mEnabledMinimumDuration;
    private long mOnEnableSessionTimeStamp;

    public OnEnableDisableSessionDurationCheck() {
        this(DeviceQuirks.get(CrashWhenOnDisableTooSoon.class) != null);
    }

    private void ensureMinDurationAfterOnEnableSession() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.mOnEnableSessionTimeStamp;
        while (true) {
            long j12 = elapsedRealtime - j11;
            if (j12 >= 100) {
                return;
            }
            long j13 = 100 - j12;
            try {
                Logger.d(TAG, "onDisableSession too soon, wait " + j13 + " ms");
                Thread.sleep(j13);
                elapsedRealtime = SystemClock.elapsedRealtime();
                j11 = this.mOnEnableSessionTimeStamp;
            } catch (InterruptedException unused) {
                Logger.e(TAG, "sleep interrupted");
                return;
            }
        }
    }

    public void onDisableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            ensureMinDurationAfterOnEnableSession();
        }
    }

    public void onEnableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            this.mOnEnableSessionTimeStamp = SystemClock.elapsedRealtime();
        }
    }

    @VisibleForTesting
    public OnEnableDisableSessionDurationCheck(boolean z11) {
        this.mOnEnableSessionTimeStamp = 0L;
        this.mEnabledMinimumDuration = z11;
    }
}
