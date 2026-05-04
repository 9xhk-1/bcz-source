package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g {
    public static synchronized String a(Context context, String str) {
        synchronized (g.class) {
            String a11 = com.alipay.sdk.m.b0.e.a(context, "openapi_file_pri", "openApi" + str, "");
            if (com.alipay.sdk.m.z.a.a(a11)) {
                return "";
            }
            String b11 = com.alipay.sdk.m.y.c.b(com.alipay.sdk.m.y.c.a(), a11);
            return com.alipay.sdk.m.z.a.a(b11) ? "" : b11;
        }
    }

    public static synchronized void a() {
        synchronized (g.class) {
        }
    }

    public static synchronized void a(Context context) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (edit != null) {
                edit.clear();
                edit.commit();
            }
        }
    }

    public static synchronized void a(Context context, String str, String str2) {
        synchronized (g.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
                if (edit != null) {
                    edit.putString("openApi" + str, com.alipay.sdk.m.y.c.a(com.alipay.sdk.m.y.c.a(), str2));
                    edit.commit();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
