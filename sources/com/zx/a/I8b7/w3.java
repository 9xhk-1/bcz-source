package com.zx.a.I8b7;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.zx.a.I8b7.r2;
import com.zx.module.annotation.Java2C;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class w3 {

    /* renamed from: a, reason: collision with root package name */
    public static PackageManager f46733a;

    /* renamed from: b, reason: collision with root package name */
    public static a2 f46734b;

    /* renamed from: c, reason: collision with root package name */
    public static HashMap<String, String> f46735c = new HashMap<>();

    @TargetApi(26)
    @Java2C.Method2C
    public static native String a();

    @Java2C.Method2C
    public static native String a(Context context);

    @Java2C.Method2C
    public static native String a(String str);

    public static boolean a(Context context, String str, boolean z11) {
        try {
            return c(context).checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable th2) {
            try {
                r2.a.f46680a.f46679a.f46672a.a(4, null, null, th2);
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            return z11;
        }
    }

    @Java2C.Method2C
    public static native PackageInfo b(String str);

    public static String b() {
        try {
            String str = Build.BRAND;
            if (!TextUtils.isEmpty(str) && !str.equals("unknown")) {
                return str;
            }
            return Build.MANUFACTURER;
        } catch (Throwable th2) {
            r2.a(th2);
            return "";
        }
    }

    @Java2C.Method2C
    public static native String b(Context context);

    public static PackageManager c(Context context) {
        if (f46733a == null) {
            f46733a = context.getPackageManager();
        }
        return f46733a;
    }

    @Java2C.Method2C
    public static native a2 d(Context context);

    @Java2C.Method2C
    public static native String d();

    @Java2C.Method2C
    public static native long e(Context context);

    @Java2C.Method2C
    public static native String e();

    @Java2C.Method2C
    public static native String f();

    @Java2C.Method2C
    private static native boolean f(Context context);

    @Java2C.Method2C
    public static native String g();

    @Java2C.Method2C
    public static native long h();

    @Java2C.Method2C
    public static native boolean i();

    public static String c() {
        String[] strArr = Build.SUPPORTED_ABIS;
        String str = "";
        if (strArr != null && strArr.length > 0) {
            for (String str2 : strArr) {
                str = str + str2 + ",";
            }
        }
        return str;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean a(Context context, boolean z11) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isAvailable();
            }
            return false;
        } catch (Throwable unused) {
            return z11;
        }
    }

    public static String a(HashMap<String, String> hashMap, String str) {
        return hashMap.containsKey(str) ? hashMap.get(str) : "";
    }
}
