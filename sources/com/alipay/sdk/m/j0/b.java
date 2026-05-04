package com.alipay.sdk.m.j0;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10627a = "IdentifierManager";

    /* renamed from: b, reason: collision with root package name */
    public static Object f10628b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f10629c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f10630d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f10631e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f10632f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f10633g;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f10629c = cls;
            f10628b = cls.newInstance();
            f10630d = f10629c.getMethod("getUDID", Context.class);
            f10631e = f10629c.getMethod("getOAID", Context.class);
            f10632f = f10629c.getMethod("getVAID", Context.class);
            f10633g = f10629c.getMethod("getAAID", Context.class);
        } catch (Exception e11) {
            Log.e(f10627a, "reflect exception!", e11);
        }
    }

    public static boolean a() {
        return (f10629c == null || f10628b == null) ? false : true;
    }

    public static String b(Context context) {
        return a(context, f10631e);
    }

    public static String c(Context context) {
        return a(context, f10630d);
    }

    public static String d(Context context) {
        return a(context, f10632f);
    }

    public static String a(Context context) {
        return a(context, f10633g);
    }

    public static String a(Context context, Method method) {
        Object obj = f10628b;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e11) {
            Log.e(f10627a, "invoke exception!", e11);
            return null;
        }
    }
}
