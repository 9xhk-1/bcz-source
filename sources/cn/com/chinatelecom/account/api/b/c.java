package cn.com.chinatelecom.account.api.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import java.net.InetAddress;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8885a = "c";

    /* renamed from: b, reason: collision with root package name */
    private static Handler f8886b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private boolean f8887c;

    /* renamed from: d, reason: collision with root package name */
    private Context f8888d;

    /* renamed from: e, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f8889e;

    public c(Context context) {
        this.f8888d = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(String str) {
        try {
            Class<?> cls = Class.forName("android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f8888d.getSystemService("connectivity");
            int compareTo = connectivityManager.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED);
            Class cls2 = Integer.TYPE;
            if (compareTo != 0) {
                cls.getMethod("startUsingNetworkFeature", cls2, String.class).invoke(connectivityManager, 0, "enableHIPRI");
                for (int i11 = 0; i11 < 5; i11++) {
                    try {
                        if (connectivityManager.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) == 0) {
                            break;
                        }
                        Thread.sleep(500L);
                    } catch (Throwable th2) {
                        cn.com.chinatelecom.account.api.a.a(f8885a, "STMN_V4", th2);
                    }
                }
            }
            boolean booleanValue = ((Boolean) cls.getMethod("requestRouteToHost", cls2, cls2).invoke(connectivityManager, 5, Integer.valueOf(a(b(str))))).booleanValue();
            cn.com.chinatelecom.account.api.a.a(f8885a, "STMN_V4 ：" + booleanValue);
            return booleanValue ? 0 : -2;
        } catch (Throwable th3) {
            cn.com.chinatelecom.account.api.a.a(f8885a, "STMN_V4_T", th3);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean d() {
        return this.f8887c;
    }

    public static int a(String str) {
        try {
            byte[] address = InetAddress.getByName(str).getAddress();
            return (address[0] & 255) | ((address[3] & 255) << 24) | ((address[2] & 255) << 16) | ((address[1] & 255) << 8);
        } catch (Throwable th2) {
            cn.com.chinatelecom.account.api.a.a(f8885a, "When InetAddress.getByName(),throws exception", th2);
            return -1;
        }
    }

    public static String b(String str) {
        int indexOf = str.indexOf("://");
        if (indexOf > 0) {
            str = str.substring(indexOf + 3);
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 >= 0) {
            str = str.substring(0, indexOf2);
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 >= 0) {
            str = str.substring(0, indexOf3);
        }
        int indexOf4 = str.indexOf(63);
        return indexOf4 >= 0 ? str.substring(0, indexOf4) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        this.f8887c = true;
    }

    private void b(final b bVar) {
        f8886b.postDelayed(new Runnable() { // from class: cn.com.chinatelecom.account.api.b.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.d() || bVar == null) {
                    return;
                }
                c.this.c();
                bVar.a();
            }
        }, 2500L);
    }

    @TargetApi(21)
    public void a() {
        try {
            if (this.f8889e != null) {
                ((ConnectivityManager) this.f8888d.getSystemService("connectivity")).unregisterNetworkCallback(this.f8889e);
                this.f8889e = null;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @TargetApi(21)
    public void a(final b bVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            b(bVar);
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f8888d.getSystemService("connectivity");
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            builder.addTransportType(0);
            NetworkRequest build = builder.build();
            ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: cn.com.chinatelecom.account.api.b.c.2
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    if (c.this.d() || bVar == null) {
                        return;
                    }
                    c.this.c();
                    bVar.a(network, System.currentTimeMillis() - currentTimeMillis);
                }
            };
            this.f8889e = networkCallback;
            connectivityManager.requestNetwork(build, networkCallback);
        } catch (Throwable unused) {
            if (d() || bVar == null) {
                return;
            }
            bVar.a(System.currentTimeMillis() - currentTimeMillis);
        }
    }

    public void a(final b bVar, final String str) {
        new d().a(new e() { // from class: cn.com.chinatelecom.account.api.b.c.3
            @Override // cn.com.chinatelecom.account.api.b.e
            public void a() {
                final long currentTimeMillis = System.currentTimeMillis();
                int c11 = c.this.c(str);
                if (c11 == 0) {
                    bVar.a(null, System.currentTimeMillis() - currentTimeMillis);
                } else if (c11 == -1) {
                    c.f8886b.post(new Runnable() { // from class: cn.com.chinatelecom.account.api.b.c.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            bVar.a(System.currentTimeMillis() - currentTimeMillis);
                        }
                    });
                } else {
                    c.f8886b.post(new Runnable() { // from class: cn.com.chinatelecom.account.api.b.c.3.2
                        @Override // java.lang.Runnable
                        public void run() {
                            bVar.a();
                        }
                    });
                }
            }
        });
    }
}
