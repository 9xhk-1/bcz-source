package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    public static b a(String str) {
        try {
            if (com.alipay.sdk.m.z.a.a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString(com.alipay.sdk.m.t.a.f11034k));
        } catch (Exception e11) {
            com.alipay.apmobilesecuritysdk.c.a.a(e11);
            return null;
        }
    }

    public static synchronized b b() {
        synchronized (a.class) {
            String a11 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            if (com.alipay.sdk.m.z.a.a(a11)) {
                return null;
            }
            return a(a11);
        }
    }

    public static synchronized b c(Context context) {
        synchronized (a.class) {
            String a11 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
            if (com.alipay.sdk.m.z.a.a(a11)) {
                return null;
            }
            return a(a11);
        }
    }

    public static synchronized void a() {
        synchronized (a.class) {
        }
    }

    public static synchronized b b(Context context) {
        b a11;
        synchronized (a.class) {
            try {
                String a12 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
                if (com.alipay.sdk.m.z.a.a(a12)) {
                    a12 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
                }
                a11 = a(a12);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a11;
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", "");
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", "");
        }
    }

    public static synchronized void a(Context context, b bVar) {
        synchronized (a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", bVar.f10353a);
                jSONObject.put("deviceInfoHash", bVar.f10354b);
                jSONObject.put(com.alipay.sdk.m.t.a.f11034k, bVar.f10355c);
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", jSONObject2);
            } catch (Exception e11) {
                com.alipay.apmobilesecuritysdk.c.a.a(e11);
            }
        }
    }
}
