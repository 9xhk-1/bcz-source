package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class WifiLockManager {
    private static final String TAG = "WifiLockManager";
    private static final String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private boolean enabled;
    private boolean stayAwake;
    private final HandlerWrapper wifiLockHandler;
    private final WifiLockManagerInternal wifiLockManagerInternal;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class WifiLockManagerInternal {
        private final Context applicationContext;

        @Nullable
        private WifiManager.WifiLock wifiLock;

        public WifiLockManagerInternal(Context context) {
            this.applicationContext = context;
        }

        public void updateWifiLock(boolean z11, boolean z12) {
            if (z11 && this.wifiLock == null) {
                WifiManager wifiManager = (WifiManager) this.applicationContext.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    Log.w(WifiLockManager.TAG, "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, WifiLockManager.WIFI_LOCK_TAG);
                    this.wifiLock = createWifiLock;
                    createWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.wifiLock;
            if (wifiLock == null) {
                return;
            }
            if (z11 && z12) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public WifiLockManager(Context context, Looper looper, Clock clock) {
        this.wifiLockManagerInternal = new WifiLockManagerInternal(context.getApplicationContext());
        this.wifiLockHandler = clock.createHandler(looper, null);
    }

    public void setEnabled(final boolean z11) {
        if (this.enabled == z11) {
            return;
        }
        this.enabled = z11;
        final boolean z12 = this.stayAwake;
        this.wifiLockHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.j4
            @Override // java.lang.Runnable
            public final void run() {
                WifiLockManager.this.wifiLockManagerInternal.updateWifiLock(z11, z12);
            }
        });
    }

    public void setStayAwake(final boolean z11) {
        if (this.stayAwake == z11) {
            return;
        }
        this.stayAwake = z11;
        if (this.enabled) {
            this.wifiLockHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.k4
                @Override // java.lang.Runnable
                public final void run() {
                    WifiLockManager.this.wifiLockManagerInternal.updateWifiLock(true, z11);
                }
            });
        }
    }
}
