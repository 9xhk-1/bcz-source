package com.alipay.sdk.m.u;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static String f11103a;

    public static synchronized boolean a(Context context, String str) {
        boolean z11;
        synchronized (j.class) {
            try {
                z11 = PreferenceManager.getDefaultSharedPreferences(context).contains(str);
            } catch (Throwable th2) {
                e.a(th2);
                z11 = false;
            }
        }
        return z11;
    }

    public static synchronized void b(Context context, String str) {
        synchronized (j.class) {
            try {
                PreferenceManager.getDefaultSharedPreferences(context).edit().remove(str).apply();
            } finally {
            }
        }
    }

    public static synchronized String a(com.alipay.sdk.m.s.a aVar, Context context, String str, String str2) {
        String str3;
        synchronized (j.class) {
            try {
                try {
                    String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
                    str3 = TextUtils.isEmpty(string) ? null : com.alipay.sdk.m.n.e.a(a(context), string, str);
                    if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(str3)) {
                        com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.f10655m, com.alipay.sdk.m.k.b.F, String.format("%s,%s", str, string));
                    }
                } catch (Exception e11) {
                    e.a(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str3;
    }

    public static synchronized void b(com.alipay.sdk.m.s.a aVar, Context context, String str, String str2) {
        synchronized (j.class) {
            try {
                String b11 = com.alipay.sdk.m.n.e.b(a(context), str2, str);
                if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(b11)) {
                    com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.f10655m, com.alipay.sdk.m.k.b.G, String.format("%s,%s", str, str2));
                }
                PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, b11).apply();
            } catch (Throwable th2) {
                try {
                    e.a(th2);
                } finally {
                }
            }
        }
    }

    public static String a(Context context) {
        String str;
        if (TextUtils.isEmpty(f11103a)) {
            try {
                str = context.getApplicationContext().getPackageName();
            } catch (Throwable th2) {
                e.a(th2);
                str = "";
            }
            f11103a = (str + "0000000000000000000000000000").substring(0, 24);
        }
        return f11103a;
    }
}
