package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.NetworkTypeObserver;
import com.igexin.sdk.PushConsts;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class NetworkTypeObserver {

    @Nullable
    private static NetworkTypeObserver staticInstance;
    private final Executor backgroundExecutor;

    @GuardedBy(vb.a.f93813p)
    private boolean isInitialized;
    private final CopyOnWriteArrayList<ListenerHolder> listeners;
    private final Object lock;

    @GuardedBy(vb.a.f93813p)
    private int networkType;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(31)
    public static final class Api31 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class DisplayInfoCallback extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            private final NetworkTypeObserver instance;

            public DisplayInfoCallback(NetworkTypeObserver networkTypeObserver) {
                this.instance = networkTypeObserver;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.instance.updateNetworkType(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        private Api31() {
        }

        public static void disambiguate4gAnd5gNsa(Context context, NetworkTypeObserver networkTypeObserver) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) Assertions.checkNotNull((TelephonyManager) context.getSystemService("phone"));
                DisplayInfoCallback displayInfoCallback = new DisplayInfoCallback(networkTypeObserver);
                telephonyManager.registerTelephonyCallback(networkTypeObserver.backgroundExecutor, displayInfoCallback);
                telephonyManager.unregisterTelephonyCallback(displayInfoCallback);
            } catch (RuntimeException unused) {
                networkTypeObserver.updateNetworkType(5);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Listener {
        void onNetworkTypeChanged(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ListenerHolder {
        private final Executor executor;
        private final WeakReference<Listener> listener;

        public ListenerHolder(Listener listener, Executor executor) {
            this.listener = new WeakReference<>(listener);
            this.executor = executor;
        }

        public static /* synthetic */ void a(ListenerHolder listenerHolder) {
            Listener listener = listenerHolder.listener.get();
            if (listener != null) {
                listener.onNetworkTypeChanged(NetworkTypeObserver.this.getNetworkType());
            }
        }

        public void callOnNetworkTypeChanged() {
            this.executor.execute(new Runnable() { // from class: androidx.media3.common.util.j
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkTypeObserver.ListenerHolder.a(NetworkTypeObserver.ListenerHolder.this);
                }
            });
        }

        public boolean canBeRemoved() {
            return this.listener.get() == null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class Receiver extends BroadcastReceiver {
        private Receiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            NetworkTypeObserver.this.backgroundExecutor.execute(new Runnable() { // from class: androidx.media3.common.util.k
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkTypeObserver.this.handleConnectivityActionBroadcast(context);
                }
            });
        }
    }

    private NetworkTypeObserver(final Context context) {
        Executor executor = BackgroundExecutor.get();
        this.backgroundExecutor = executor;
        this.listeners = new CopyOnWriteArrayList<>();
        this.lock = new Object();
        this.networkType = 0;
        executor.execute(new Runnable() { // from class: androidx.media3.common.util.f
            @Override // java.lang.Runnable
            public final void run() {
                NetworkTypeObserver.this.init(context);
            }
        });
    }

    public static synchronized NetworkTypeObserver getInstance(Context context) {
        NetworkTypeObserver networkTypeObserver;
        synchronized (NetworkTypeObserver.class) {
            try {
                if (staticInstance == null) {
                    staticInstance = new NetworkTypeObserver(context);
                }
                networkTypeObserver = staticInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return networkTypeObserver;
    }

    private static int getMobileNetworkType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return Util.SDK_INT >= 29 ? 9 : 0;
        }
    }

    private static int getNetworkTypeFromConnectivityManager(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i11 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i11 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return getMobileNetworkType(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnectivityActionBroadcast(Context context) {
        int networkTypeFromConnectivityManager = getNetworkTypeFromConnectivityManager(context);
        if (Util.SDK_INT < 31 || networkTypeFromConnectivityManager != 5) {
            updateNetworkType(networkTypeFromConnectivityManager);
        } else {
            Api31.disambiguate4gAnd5gNsa(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UnprotectedReceiver"})
    public void init(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE);
        context.registerReceiver(new Receiver(), intentFilter);
    }

    private void removeClearedReferences() {
        Iterator<ListenerHolder> it = this.listeners.iterator();
        while (it.hasNext()) {
            ListenerHolder next = it.next();
            if (next.canBeRemoved()) {
                this.listeners.remove(next);
            }
        }
    }

    @VisibleForTesting
    public static synchronized void resetForTests() {
        synchronized (NetworkTypeObserver.class) {
            staticInstance = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNetworkType(int i11) {
        removeClearedReferences();
        synchronized (this.lock) {
            try {
                if (this.isInitialized && this.networkType == i11) {
                    return;
                }
                this.isInitialized = true;
                this.networkType = i11;
                Iterator<ListenerHolder> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().callOnNetworkTypeChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getNetworkType() {
        int i11;
        synchronized (this.lock) {
            i11 = this.networkType;
        }
        return i11;
    }

    @uo.l(imports = {"android.os.Handler", "android.os.Looper"}, replacement = "this.register(listener, new Handler(Looper.getMainLooper())::post)")
    @Deprecated
    public void register(Listener listener) {
        register(listener, new androidx.emoji2.text.a(new Handler(Looper.getMainLooper())));
    }

    public void register(Listener listener, Executor executor) {
        boolean z11;
        removeClearedReferences();
        ListenerHolder listenerHolder = new ListenerHolder(listener, executor);
        synchronized (this.lock) {
            this.listeners.add(listenerHolder);
            z11 = this.isInitialized;
        }
        if (z11) {
            listenerHolder.callOnNetworkTypeChanged();
        }
    }
}
