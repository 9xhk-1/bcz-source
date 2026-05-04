package com.alipay.sdk.m.h0;

import android.content.Context;
import com.alipay.sdk.m.a.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {
    public static String a(Context context) {
        if (a.b.f10458a) {
            return a.c.b.f10466a.a(context.getApplicationContext(), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String b(Context context) {
        if (a.b.f10458a) {
            return a.c.b.f10466a.a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String c(Context context) {
        if (a.b.f10458a) {
            return a.c.b.f10466a.a(context.getApplicationContext(), "GUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String d(Context context) {
        if (a.b.f10458a) {
            return a.c.b.f10466a.a(context.getApplicationContext(), "DUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static void e(Context context) {
        a.b.f10459b = a.c.b.f10466a.a(context.getApplicationContext());
        a.b.f10458a = true;
    }

    public static boolean a() {
        if (a.b.f10458a) {
            return a.b.f10459b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
