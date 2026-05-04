package com.mob.secverify.pure.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.SystemClock;
import com.mob.secverify.common.exception.VerifyException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static e f40758b;

    /* renamed from: a, reason: collision with root package name */
    public ConnectivityManager f40759a;

    /* renamed from: c, reason: collision with root package name */
    private Network f40760c;

    /* renamed from: d, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f40761d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f40762e;

    /* renamed from: f, reason: collision with root package name */
    private long f40763f = 3000;

    /* renamed from: g, reason: collision with root package name */
    private String f40764g;

    private e(Context context) {
        this.f40759a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    private Network b(final String str) throws VerifyException {
        this.f40760c = null;
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addCapability(12);
        builder.addTransportType(0);
        NetworkRequest build = builder.build();
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.mob.secverify.pure.b.e.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                e.this.f40764g = str;
                e.this.f40760c = network;
                e.this.f40762e = false;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                e.this.f40762e = true;
            }
        };
        this.f40761d = networkCallback;
        this.f40759a.requestNetwork(build, networkCallback);
        long j11 = 0;
        do {
            Network network = this.f40760c;
            if (network != null) {
                return network;
            }
            j11++;
            SystemClock.sleep(50L);
        } while (j11 <= this.f40763f / 50);
        com.mob.secverify.b.c.a().b("[SecPure] ==>%s", ">>>>> Nt switch: timeout");
        throw new VerifyException(1, f.a("switch_timeout", "switch timeout"));
    }

    private boolean c(String str) throws VerifyException {
        try {
            com.mob.secverify.pure.a.a.a(this.f40759a).a(0, "enableHIPRI");
            for (int i11 = 0; i11 < this.f40763f / 50 && this.f40759a.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) != 0; i11++) {
                Thread.sleep(50L);
            }
            boolean a11 = com.mob.secverify.pure.a.a.a(this.f40759a).a(5, d(e(str)));
            com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "switch mobile network result >>> " + a11);
            if (!a11) {
                com.mob.secverify.b.c.a().b("[SecPure] ==>%s", ">>>>> Nt switch: switch mobile network failed or mobile network not exist ");
                throw new VerifyException(2, f.a("switch_failed", "switch failed"));
            }
            com.mob.secverify.b.c.a().b("[SecPure] ==>%s", ">>>>> Nt switch: switch mobile network success ");
            a(str, (Network) null);
            return true;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", ">>>>> Nt switch: switch mobile network occurs exception");
            throw new VerifyException(3, f.a("switch_exception", "switch failed"));
        }
    }

    private int d(String str) {
        try {
            byte[] address = InetAddress.getByName(str).getAddress();
            return (address[0] & 255) | ((address[3] & 255) << 24) | ((address[2] & 255) << 16) | ((address[1] & 255) << 8);
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return -1;
        }
    }

    private String e(String str) {
        int indexOf = str.indexOf("://");
        if (indexOf > 0) {
            str = str.substring(indexOf + 3);
        }
        int indexOf2 = str.indexOf(":");
        if (indexOf2 >= 0) {
            str = str.substring(0, indexOf2);
        }
        int indexOf3 = str.indexOf("/");
        if (indexOf3 >= 0) {
            str = str.substring(0, indexOf3);
        }
        int indexOf4 = str.indexOf("?");
        return indexOf4 >= 0 ? str.substring(0, indexOf4) : str;
    }

    public static e a(Context context) {
        if (f40758b == null) {
            synchronized (e.class) {
                try {
                    if (f40758b == null) {
                        f40758b = new e(context);
                    }
                } finally {
                }
            }
        }
        return f40758b;
    }

    public Network a(String str) throws VerifyException {
        com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "Force switch network");
        com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "Nt switch. API >= 21: true");
        return b(str);
    }

    public void a() {
        ConnectivityManager.NetworkCallback networkCallback = this.f40761d;
        if (networkCallback != null) {
            try {
                this.f40759a.unregisterNetworkCallback(networkCallback);
                this.f40761d = null;
                this.f40760c = null;
            } catch (Throwable th2) {
                com.mob.secverify.b.c.a().a(th2);
            }
            com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "release");
        }
    }

    private HttpURLConnection a(String str, Network network) {
        try {
            URL url = new URL(str);
            if (network != null) {
                return (HttpURLConnection) network.openConnection(url);
            }
            return (HttpURLConnection) url.openConnection();
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2);
            return null;
        }
    }
}
