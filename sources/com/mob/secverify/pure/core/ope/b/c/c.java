package com.mob.secverify.pure.core.ope.b.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.util.Log;
import com.mob.tools.utils.DeviceHelper;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"NewApi"})
/* loaded from: classes7.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static Network f40869b;

    /* renamed from: d, reason: collision with root package name */
    private static List<ConnectivityManager.NetworkCallback> f40870d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public HttpURLConnection f40871a;

    /* renamed from: c, reason: collision with root package name */
    private long f40872c;

    public c(Context context, final URL url) {
        try {
            Network network = f40869b;
            if (network != null) {
                try {
                    this.f40871a = (HttpURLConnection) network.openConnection(url);
                } catch (IOException e11) {
                    Log.d("[SecPure][%s][%s] ==>%s", "ConnectManagerHelper" + e11.toString());
                }
            } else {
                System.currentTimeMillis();
                a(context, new ConnectivityManager.NetworkCallback() { // from class: com.mob.secverify.pure.core.ope.b.c.c.1
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onAvailable(Network network2) {
                        Network unused = c.f40869b = network2;
                        try {
                            c.this.f40871a = (HttpURLConnection) network2.openConnection(url);
                        } catch (Throwable th2) {
                            Log.d("[SecPure][%s][%s] ==>%s", "ConnectManagerHelper" + th2.toString());
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLost(Network network2) {
                        super.onLost(network2);
                    }
                });
            }
        } catch (Exception e12) {
            Log.d("[SecPure][%s][%s] ==>%s", "ConnectManagerHelper" + e12.toString());
        }
    }

    public final boolean b() {
        return System.currentTimeMillis() - this.f40872c > 2000;
    }

    public static void a(Context context, ConnectivityManager.NetworkCallback networkCallback) {
        try {
            if (DeviceHelper.getInstance(context).checkPermission("android.permission.CHANGE_NETWORK_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addCapability(12);
                builder.addTransportType(0);
                NetworkRequest build = builder.build();
                if (connectivityManager != null) {
                    f40870d.add(networkCallback);
                    connectivityManager.requestNetwork(build, networkCallback);
                }
            }
        } catch (Throwable th2) {
            Log.d("[SecPure] ==>%s", th2.toString());
        }
    }

    public final HttpURLConnection a() {
        this.f40872c = System.currentTimeMillis();
        while (!b()) {
            HttpURLConnection httpURLConnection = this.f40871a;
            if (httpURLConnection != null) {
                return httpURLConnection;
            }
        }
        return null;
    }
}
