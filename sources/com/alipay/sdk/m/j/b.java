package com.alipay.sdk.m.j;

import com.alipay.sdk.m.u.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f10606a = false;

    /* renamed from: b, reason: collision with root package name */
    public static String f10607b;

    public static void a(String str) {
        f10607b = str;
    }

    public static String b() {
        c b11 = c.b(c.DOUBLE_REQUEST.b());
        return a(b11.b(), b11.a(), "");
    }

    public static boolean c() {
        return f10606a;
    }

    public static String d() {
        return f10607b;
    }

    public static String e() {
        c b11 = c.b(c.PARAMS_ERROR.b());
        return a(b11.b(), b11.a(), "");
    }

    public static void a(boolean z11) {
        f10606a = z11;
    }

    public static String a() {
        c b11 = c.b(c.CANCELED.b());
        return a(b11.b(), b11.a(), "");
    }

    public static String a(int i11, String str, String str2) {
        return "resultStatus={" + i11 + "};memo={" + str + "};result={" + str2 + i.f11099d;
    }
}
