package com.alipay.sdk.m.i0;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10587a = "OpenIdHelper";

    /* renamed from: b, reason: collision with root package name */
    public static Method f10588b;

    public static String a(Context context) {
        f a11 = f.a();
        return a11.a(context.getApplicationContext(), a11.f10598c);
    }

    public static String b(Context context) {
        f a11 = f.a();
        return a11.a(context.getApplicationContext(), a11.f10597b);
    }

    public static String c(Context context) {
        f a11 = f.a();
        return a11.a(context.getApplicationContext(), a11.f10596a);
    }

    public static String d(Context context) {
        f a11 = f.a();
        return a11.a(context.getApplicationContext(), a11.f10599d);
    }

    public static void a(boolean z11) {
        f.a();
        f.a(z11);
    }

    public static final boolean a() {
        Context context = null;
        try {
            if (f10588b == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null);
                f10588b = method;
                method.setAccessible(true);
            }
            context = (Context) f10588b.invoke(null, null);
        } catch (Exception e11) {
            Log.e(f10587a, "ActivityThread:currentApplication --> " + e11.toString());
        }
        if (context == null) {
            return false;
        }
        return f.a().a(context, false);
    }
}
