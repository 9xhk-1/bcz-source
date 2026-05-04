package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class WakeLockManager {
    private static final String TAG = "WakeLockManager";
    private static final String WAKE_LOCK_TAG = "ExoPlayer:WakeLockManager";
    private boolean enabled;
    private boolean stayAwake;
    private final HandlerWrapper wakeLockHandler;
    private final WakeLockManagerInternal wakeLockManagerInternal;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class WakeLockManagerInternal {
        private final Context applicationContext;

        @Nullable
        private PowerManager.WakeLock wakeLock;

        public WakeLockManagerInternal(Context context) {
            this.applicationContext = context;
        }

        @SuppressLint({"WakelockTimeout"})
        public void updateWakeLock(boolean z11, boolean z12) {
            if (z11 && this.wakeLock == null) {
                PowerManager powerManager = (PowerManager) this.applicationContext.getSystemService(c6.d.f8118j);
                if (powerManager == null) {
                    Log.w(WakeLockManager.TAG, "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, WakeLockManager.WAKE_LOCK_TAG);
                    this.wakeLock = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock == null) {
                return;
            }
            if (z11 && z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public WakeLockManager(Context context, Looper looper, Clock clock) {
        this.wakeLockManagerInternal = new WakeLockManagerInternal(context.getApplicationContext());
        this.wakeLockHandler = clock.createHandler(looper, null);
    }

    public void setEnabled(final boolean z11) {
        if (this.enabled == z11) {
            return;
        }
        this.enabled = z11;
        final boolean z12 = this.stayAwake;
        this.wakeLockHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.i4
            @Override // java.lang.Runnable
            public final void run() {
                WakeLockManager.this.wakeLockManagerInternal.updateWakeLock(z11, z12);
            }
        });
    }

    public void setStayAwake(final boolean z11) {
        if (this.stayAwake == z11) {
            return;
        }
        this.stayAwake = z11;
        if (this.enabled) {
            this.wakeLockHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.h4
                @Override // java.lang.Runnable
                public final void run() {
                    WakeLockManager.this.wakeLockManagerInternal.updateWakeLock(true, z11);
                }
            });
        }
    }
}
