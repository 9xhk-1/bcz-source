package com.huawei.updatesdk.a.a.d.j;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f36839a;

    public static int a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            int type = networkInfo.getType();
            if (1 == type || 13 == type) {
                return 1;
            }
            if (type == 0) {
                switch (networkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 3;
                    case 13:
                        return 4;
                    default:
                        return 0;
                }
            }
        }
        return 0;
    }

    private static ConnectivityManager b(Context context) {
        if (f36839a == null) {
            f36839a = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        }
        return f36839a;
    }

    public static int c(Context context) {
        return a(a(context));
    }

    public static boolean d(Context context) {
        ConnectivityManager b11;
        if (context == null || (b11 = b(context)) == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = b11.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return a(b11);
        }
        return true;
    }

    private static NetworkInfo a(Context context) {
        ConnectivityManager b11 = b(context);
        if (b11 != null) {
            return b11.getActiveNetworkInfo();
        }
        return null;
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasCapability(16);
    }
}
