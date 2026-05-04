package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f35895a = {1, 6, 7, 9};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f35896b = {0, 2, 3, 4, 5};

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Integer, String> f35897c = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends HashMap<Integer, String> {
        public a() {
            put(1, "2G");
            put(2, "2G");
            put(4, "2G");
            put(7, "2G");
            put(11, "2G");
            put(3, "3G");
            put(8, "3G");
            put(9, "3G");
            put(10, "3G");
            put(15, "3G");
            put(5, "3G");
            put(6, "3G");
            put(12, "3G");
            put(14, "3G");
            put(13, "4G");
            if (Build.VERSION.SDK_INT >= 29) {
                put(20, "5G");
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private static NetworkInfo a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th2) {
            v.b("hmsSdk", "cannot get network state, ensure permission android.permission.ACCESS_NETWORK_STATE in the manifest: " + th2.getMessage());
            return null;
        }
    }

    public static String b(Context context) {
        NetworkInfo a11;
        if (context == null) {
            return "unknown";
        }
        try {
            a11 = a(context);
        } catch (Throwable unused) {
        }
        if (!b(a11)) {
            return "none";
        }
        if (c(a11)) {
            return "WIFI";
        }
        if (a(a11)) {
            return a(a11.getSubtype());
        }
        return "unknown";
    }

    private static boolean c(NetworkInfo networkInfo) {
        return (networkInfo == null || Arrays.binarySearch(f35895a, networkInfo.getType()) == -1) ? false : true;
    }

    private static String a(int i11) {
        Map<Integer, String> map = f35897c;
        String str = map.containsKey(Integer.valueOf(i11)) ? map.get(Integer.valueOf(i11)) : "unknown";
        return (!"unknown".equals(str) || Build.VERSION.SDK_INT < 25) ? str : i11 != 16 ? i11 != 17 ? "unknown" : "3G" : "2G";
    }

    private static boolean b(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected();
    }

    private static boolean a(NetworkInfo networkInfo) {
        return (networkInfo == null || Arrays.binarySearch(f35896b, networkInfo.getType()) == -1) ? false : true;
    }
}
