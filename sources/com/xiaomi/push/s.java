package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;

/* loaded from: classes8.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static Context f46195a;

    /* renamed from: a, reason: collision with other field name */
    private static String f861a;

    public static int a() {
        try {
            Class<?> a11 = a(null, "miui.os.Build");
            if (a11.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return a11.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String b() {
        String a11 = C1403r.a(com.alipay.sdk.m.c.a.f10484a, "");
        f861a = a11;
        return a11;
    }

    private static String c() {
        String a11 = C1403r.a("ro.build.version.opporom", "");
        if (!TextUtils.isEmpty(a11) && !a11.startsWith("ColorOS_")) {
            f861a = "ColorOS_" + a11;
        }
        return f861a;
    }

    private static String d() {
        String a11 = C1403r.a("ro.vivo.os.version", "");
        if (!TextUtils.isEmpty(a11) && !a11.startsWith("FuntouchOS_")) {
            f861a = "FuntouchOS_" + a11;
        }
        return f861a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Context m6183a() {
        return f46195a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m6187b() {
        try {
            return a(null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(Boolean.FALSE);
        } catch (ClassNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.b.d("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return false;
        }
    }

    public static Class<?> a(Context context, String str) {
        if (str == null || str.trim().length() == 0) {
            throw new ClassNotFoundException("class is empty");
        }
        boolean z11 = context != null;
        if (z11 && Build.VERSION.SDK_INT >= 29) {
            try {
                return context.getClassLoader().loadClass(str);
            } catch (Throwable unused) {
            }
        }
        try {
            return Class.forName(str);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("loadClass fail hasContext= %s, errMsg = %s", Boolean.valueOf(z11), th2.getLocalizedMessage()));
            throw new ClassNotFoundException("loadClass fail ", th2);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized String m6184a() {
        synchronized (s.class) {
            try {
                String str = f861a;
                if (str != null) {
                    return str;
                }
                String str2 = Build.VERSION.INCREMENTAL;
                if (a() <= 0) {
                    String b11 = b();
                    if (TextUtils.isEmpty(b11)) {
                        b11 = c();
                        if (TextUtils.isEmpty(b11)) {
                            b11 = d();
                            if (TextUtils.isEmpty(b11)) {
                                str2 = String.valueOf(C1403r.a(SystemUtils.PRODUCT_BRAND, "Android") + "_" + str2);
                            }
                        }
                    }
                    str2 = b11;
                }
                f861a = str2;
                return str2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(Context context) {
        f46195a = context.getApplicationContext();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6185a() {
        return TextUtils.equals((String) bj.a("android.os.SystemProperties", ct.d.f46852f, "sys.boot_completed"), "1");
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6186a(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return false;
        }
    }
}
