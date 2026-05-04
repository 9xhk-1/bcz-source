package com.mob.secverify.pure.core.ope.cm.d;

import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i extends com.mob.secverify.pure.b.a {
    public static String a() {
        String string = com.mob.secverify.pure.b.a.f40740a.getString("AID");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            com.mob.secverify.pure.b.a.f40740a.remove("getConfigDate");
        } else {
            com.mob.secverify.pure.b.a.f40740a.putString("getConfigDate", str);
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            com.mob.secverify.pure.b.a.f40740a.remove("httpHost");
        } else {
            com.mob.secverify.pure.b.a.f40740a.putString("httpHost", str);
        }
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            com.mob.secverify.pure.b.a.f40740a.remove("httpsHost");
        } else {
            com.mob.secverify.pure.b.a.f40740a.putString("httpsHost", str);
        }
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            com.mob.secverify.pure.b.a.f40740a.remove("logHost");
        } else {
            com.mob.secverify.pure.b.a.f40740a.putString("logHost", str);
        }
    }

    public static long f() {
        return com.mob.secverify.pure.b.a.f40740a.getLong("logCloseTime", 0L);
    }

    public static int g() {
        return com.mob.secverify.pure.b.a.f40740a.getInt("logFailTimes", 0);
    }

    public static String h() {
        String string = com.mob.secverify.pure.b.a.f40740a.getString("phoneScrip");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public static long i() {
        return com.mob.secverify.pure.b.a.f40740a.getLong("scripBuffTime", 0L);
    }

    public static void f(String str) {
        if (TextUtils.isEmpty(str)) {
            com.mob.secverify.pure.b.a.f40740a.remove("phoneScrip");
        } else {
            com.mob.secverify.pure.b.a.f40740a.putString("phoneScrip", str);
        }
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            com.mob.secverify.pure.b.a.f40740a.remove("AID");
        } else {
            com.mob.secverify.pure.b.a.f40740a.putString("AID", str);
        }
    }

    public static String b() {
        String string = com.mob.secverify.pure.b.a.f40740a.getString("httpsHost");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public static String c() {
        String string = com.mob.secverify.pure.b.a.f40740a.getString("logHost");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public static int d() {
        return com.mob.secverify.pure.b.a.f40740a.getInt("maxFailedLogTimes");
    }

    public static int e() {
        return com.mob.secverify.pure.b.a.f40740a.getInt("pauseTime");
    }

    public static void a(long j11) {
        com.mob.secverify.pure.b.a.f40740a.putLong("client_valid", Long.valueOf(j11));
    }

    public static void b(int i11) {
        com.mob.secverify.pure.b.a.f40740a.putInt("pauseTime", Integer.valueOf(i11));
    }

    public static void c(int i11) {
        com.mob.secverify.pure.b.a.f40740a.putInt("logFailTimes", Integer.valueOf(i11));
    }

    public static void a(int i11) {
        com.mob.secverify.pure.b.a.f40740a.putInt("maxFailedLogTimes", Integer.valueOf(i11));
    }

    public static void b(long j11) {
        com.mob.secverify.pure.b.a.f40740a.putLong("logCloseTime", Long.valueOf(j11));
    }

    public static void c(long j11) {
        if (j11 == 0) {
            com.mob.secverify.pure.b.a.f40740a.remove("scripBuffTime");
        } else {
            com.mob.secverify.pure.b.a.f40740a.putLong("scripBuffTime", Long.valueOf(j11));
        }
    }
}
