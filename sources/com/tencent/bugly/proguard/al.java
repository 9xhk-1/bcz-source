package com.tencent.bugly.proguard;

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    public static String f42281a = "CrashReportInfo";

    /* renamed from: b, reason: collision with root package name */
    public static String f42282b = "CrashReport";

    /* renamed from: c, reason: collision with root package name */
    public static boolean f42283c = false;

    private static boolean a(int i11, String str, Object... objArr) {
        if (!f42283c) {
            return false;
        }
        if (str == null) {
            str = "null";
        } else if (objArr != null && objArr.length != 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (i11 == 0) {
            Log.i(f42282b, str);
            return true;
        }
        if (i11 == 1) {
            Log.d(f42282b, str);
            return true;
        }
        if (i11 == 2) {
            Log.w(f42282b, str);
            return true;
        }
        if (i11 == 3) {
            Log.e(f42282b, str);
            return true;
        }
        if (i11 != 5) {
            return false;
        }
        Log.i(f42281a, str);
        return true;
    }

    public static boolean b(String str, Object... objArr) {
        return a(5, str, objArr);
    }

    public static boolean c(String str, Object... objArr) {
        return a(1, str, objArr);
    }

    public static boolean d(String str, Object... objArr) {
        return a(2, str, objArr);
    }

    public static boolean e(String str, Object... objArr) {
        return a(3, str, objArr);
    }

    public static boolean b(Throwable th2) {
        return a(3, th2);
    }

    private static boolean a(int i11, Throwable th2) {
        if (f42283c) {
            return a(i11, ap.a(th2), new Object[0]);
        }
        return false;
    }

    public static boolean a(String str, Object... objArr) {
        return a(0, str, objArr);
    }

    public static boolean a(Class cls, String str, Object... objArr) {
        return a(0, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    public static boolean a(Throwable th2) {
        return a(2, th2);
    }
}
