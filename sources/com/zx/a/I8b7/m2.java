package com.zx.a.I8b7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @SuppressLint({"NewApi"})
    public class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public ConnectivityManager f46578a;

        /* renamed from: b, reason: collision with root package name */
        public b f46579b;

        /* renamed from: d, reason: collision with root package name */
        public TimerTask f46581d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f46582e = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public Timer f46580c = new Timer();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.zx.a.I8b7.m2$a$a, reason: collision with other inner class name */
        public class C0536a extends TimerTask {
            public C0536a(m2 m2Var) {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    b bVar = a.this.f46579b;
                    if (bVar != null) {
                        bVar.a(1, "time out 7s!");
                    }
                } catch (Throwable th2) {
                    r2.a(th2);
                }
            }
        }

        public a(m2 m2Var, ConnectivityManager connectivityManager, b bVar) {
            this.f46578a = connectivityManager;
            this.f46579b = bVar;
            C0536a c0536a = new C0536a(m2Var);
            this.f46581d = c0536a;
            this.f46580c.schedule(c0536a, 7000L);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            try {
                if (this.f46582e.getAndSet(true)) {
                    return;
                }
                this.f46581d.cancel();
                this.f46580c.cancel();
                this.f46579b.a(network);
                this.f46578a.unregisterNetworkCallback(this);
            } catch (Throwable th2) {
                r2.a(th2);
                b bVar = this.f46579b;
                if (bVar != null) {
                    try {
                        bVar.a(1, th2.getMessage());
                        this.f46578a.unregisterNetworkCallback(this);
                    } catch (Throwable th3) {
                        r2.a(th3);
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a();

        void a(int i11, String str);

        void a(Network network);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final m2 f46584a = new m2();
    }

    public void a(b bVar) throws Throwable {
        boolean a11 = w3.a(m3.f46585a, "android.permission.ACCESS_WIFI_STATE", false);
        boolean a12 = w3.a(m3.f46585a, "android.permission.CHANGE_NETWORK_STATE", false);
        if (a11 && a12 && a(m3.f46585a)) {
            if (!b(m3.f46585a)) {
                bVar.a();
                return;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) m3.f46585a.getSystemService("connectivity");
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            builder.addTransportType(0);
            connectivityManager.requestNetwork(builder.build(), new a(this, connectivityManager, bVar));
        }
    }

    public boolean b(Context context) {
        if (((WifiManager) context.getSystemService("wifi")).isWifiEnabled()) {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            int ipAddress = connectionInfo == null ? 0 : connectionInfo.getIpAddress();
            if (wifiManager.isWifiEnabled() && ipAddress != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return ((Boolean) telephonyManager.getClass().getDeclaredMethod("getDataEnabled", null).invoke(telephonyManager, null)).booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }
}
