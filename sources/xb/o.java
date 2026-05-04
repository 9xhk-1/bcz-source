package xb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import k3.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static String f97975a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f97976b = null;

    /* renamed from: c, reason: collision with root package name */
    public static float f97977c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public static int f97978d;

    /* renamed from: e, reason: collision with root package name */
    public static String f97979e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f97980a;

        /* renamed from: b, reason: collision with root package name */
        public String f97981b;

        /* renamed from: c, reason: collision with root package name */
        public String f97982c;

        public String toString() {
            return "SimpleAppInfo [version=" + this.f97980a + ", pkg=" + this.f97981b + ", name=" + this.f97982c + "]";
        }
    }

    public static String a(Context context) {
        if (f97976b == null) {
            synchronized (o.class) {
                if (f97976b == null) {
                    try {
                        f97976b = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    } catch (Exception e11) {
                        f97976b = "null";
                        qb.c.c("PackageUtils", "androidId", e11);
                    }
                }
            }
        }
        return f97976b;
    }

    public static String b(Context context) {
        String str = f97979e;
        if (str != null) {
            return str;
        }
        try {
            f97979e = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("UMENG_CHANNEL");
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            f97979e = "unknown";
        }
        return f97979e;
    }

    public static float c(Context context) {
        float f11 = f97977c;
        float f12 = 0.0f;
        if (f11 >= 0.0f) {
            return f11;
        }
        String f13 = f(context);
        if (f13 == null) {
            return 0.0f;
        }
        float f14 = 1.0f;
        for (int i11 = 0; i11 < f13.split("\\.").length; i11++) {
            f12 += Integer.valueOf(r5[i11]).intValue() * f14;
            f14 *= 0.1f;
        }
        f97977c = f12;
        return f12;
    }

    public static List<a> d(Context context) {
        LinkedList linkedList = new LinkedList();
        PackageManager packageManager = context.getPackageManager();
        for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
            a aVar = new a();
            aVar.f97982c = packageInfo.applicationInfo.loadLabel(packageManager).toString();
            aVar.f97981b = packageInfo.packageName;
            aVar.f97980a = packageInfo.versionName;
            linkedList.add(aVar);
        }
        return linkedList;
    }

    public static String e(Context context, String key) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(key);
        } catch (Exception e11) {
            qb.c.a(nt.a.f75376c, "", e11);
            return null;
        }
    }

    public static String f(Context context) {
        String str = f97975a;
        if (str != null) {
            return str;
        }
        try {
            String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f97975a = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            f97975a = "";
            return "";
        }
    }

    public static int g(Context context) {
        int i11 = f97978d;
        if (i11 > 0) {
            return i11;
        }
        try {
            int i12 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            f97978d = i12;
            return i12;
        } catch (PackageManager.NameNotFoundException unused) {
            f97978d = 0;
            return 0;
        }
    }

    public static boolean h(Context context) {
        String e11 = e(context, "DEBUG_MODE");
        if (TextUtils.isEmpty(e11)) {
            return false;
        }
        return e11.equals(u0.f65628b);
    }
}
