package com.vivo.push.util;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final o f45113a = new n();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f45114b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f45115c;

    static {
        b();
    }

    public static boolean a() {
        return f45114b && f45115c;
    }

    private static void b() {
        f45114b = z.b("persist.sys.log.ctrl", ma.b.I0).equals(ma.b.H0);
    }

    public static int c(String str, String str2) {
        return f45113a.c(str, str2);
    }

    public static int d(String str, String str2) {
        return f45113a.d(str, str2);
    }

    public static int e(String str, String str2) {
        return f45113a.e(str, str2);
    }

    public static int b(String str, String str2) {
        return f45113a.b(str, str2);
    }

    public static void c(Context context, String str) {
        f45113a.c(context, str);
    }

    public static void a(boolean z11) {
        b();
        f45115c = z11;
    }

    public static int b(String str, String str2, Throwable th2) {
        return f45113a.b(str, str2, th2);
    }

    public static void b(Context context, String str) {
        f45113a.b(context, str);
    }

    public static int a(String str, String str2) {
        return f45113a.a(str, str2);
    }

    public static int a(String str, Throwable th2) {
        return f45113a.a(str, th2);
    }

    public static int a(String str, String str2, Throwable th2) {
        return f45113a.a(str, str2, th2);
    }

    public static String a(Throwable th2) {
        return f45113a.a(th2);
    }

    public static void a(Context context, String str) {
        f45113a.a(context, str);
    }
}
