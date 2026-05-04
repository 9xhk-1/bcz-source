package com.mob.secverify.pure.core.ope.wo.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.mob.secverify.pure.core.ope.wo.c.b;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class WoNetwork {

    /* renamed from: a, reason: collision with root package name */
    private static volatile WoNetwork f41099a;

    /* renamed from: b, reason: collision with root package name */
    private ConnectivityManager f41100b = null;

    /* renamed from: c, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f41101c = null;

    /* renamed from: d, reason: collision with root package name */
    private volatile a f41102d = null;

    /* renamed from: e, reason: collision with root package name */
    private ExecutorService f41103e = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.mob.secverify.pure.core.ope.wo.net.WoNetwork$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41104a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41105b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ NetInterface f41106c;

        public AnonymousClass1(Context context, String str, NetInterface netInterface) {
            this.f41104a = context;
            this.f41105b = str;
            this.f41106c = netInterface;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean a11 = WoNetwork.this.a(this.f41104a, this.f41105b);
            NetInterface netInterface = this.f41106c;
            if (netInterface != null) {
                netInterface.onSwitch(a11, null);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface NetInterface {
        void onSwitch(boolean z11, Network network);
    }

    public void b() {
        try {
            ConnectivityManager connectivityManager = this.f41100b;
            if (connectivityManager != null) {
                ConnectivityManager.NetworkCallback networkCallback = this.f41101c;
                if (networkCallback != null) {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                    this.f41101c = null;
                }
                this.f41100b = null;
            }
            if (this.f41102d != null) {
                this.f41102d.cancel();
                this.f41102d = null;
            }
            ExecutorService executorService = this.f41103e;
            if (executorService != null) {
                executorService.shutdownNow();
                this.f41103e = null;
            }
        } catch (Throwable unused) {
        }
    }

    public static WoNetwork a() {
        if (f41099a == null) {
            synchronized (WoNetwork.class) {
                try {
                    if (f41099a == null) {
                        f41099a = new WoNetwork();
                    }
                } finally {
                }
            }
        }
        return f41099a;
    }

    public void a(Context context, String str, NetInterface netInterface) {
        a(context, netInterface);
    }

    private void a(Context context, final NetInterface netInterface) {
        try {
            this.f41100b = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            builder.addTransportType(0);
            NetworkRequest build = builder.build();
            this.f41101c = new ConnectivityManager.NetworkCallback() { // from class: com.mob.secverify.pure.core.ope.wo.net.WoNetwork.2
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    try {
                        if (WoNetwork.this.f41102d != null) {
                            WoNetwork.this.f41102d.cancel();
                            WoNetwork.this.f41102d = null;
                            NetInterface netInterface2 = netInterface;
                            if (netInterface2 != null) {
                                netInterface2.onSwitch(true, network);
                            }
                        }
                    } catch (Exception unused) {
                        NetInterface netInterface3 = netInterface;
                        if (netInterface3 != null) {
                            netInterface3.onSwitch(false, null);
                        }
                    }
                }
            };
            if (this.f41102d != null) {
                this.f41102d.cancel();
                this.f41102d = null;
            }
            this.f41102d = new a(netInterface);
            this.f41102d.start();
            this.f41100b.requestNetwork(build, this.f41101c);
        } catch (Throwable unused) {
            if (netInterface != null) {
                netInterface.onSwitch(false, null);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends CountDownTimer {

        /* renamed from: b, reason: collision with root package name */
        private NetInterface f41111b;

        public a(NetInterface netInterface) {
            super(3000L, 1000L);
            this.f41111b = netInterface;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (this.f41111b != null && WoNetwork.this.f41102d != null) {
                this.f41111b.onSwitch(false, null);
            }
            WoNetwork.this.f41102d = null;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context, String str) {
        Class cls = Integer.TYPE;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            this.f41100b = connectivityManager;
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo.State state = connectivityManager.getNetworkInfo(5).getState();
            if (state.compareTo(NetworkInfo.State.CONNECTED) != 0 && state.compareTo(NetworkInfo.State.CONNECTING) != 0) {
                Method method = ConnectivityManager.class.getMethod("startUsingNetworkFeature", cls, String.class);
                method.setAccessible(true);
                int intValue = ((Integer) method.invoke(this.f41100b, 0, "enableHIPRI")).intValue();
                if (intValue == -1) {
                    return false;
                }
                if (intValue == 0) {
                    return true;
                }
                String b11 = b.b(str);
                if (!TextUtils.isEmpty(b11)) {
                    str = b11;
                }
                if (b.c(str) == -1) {
                    return false;
                }
                int i11 = 0;
                while (i11 < 3) {
                    if (this.f41100b.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) == 0) {
                        break;
                    }
                    Thread.sleep(1000L);
                    i11++;
                }
                Method method2 = ConnectivityManager.class.getMethod("requestRouteToHost", cls, cls);
                method2.setAccessible(true);
                boolean booleanValue = ((Boolean) method2.invoke(this.f41100b, 5, 2)).booleanValue();
                this.f41100b.getNetworkInfo(5).getState();
                return booleanValue;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
