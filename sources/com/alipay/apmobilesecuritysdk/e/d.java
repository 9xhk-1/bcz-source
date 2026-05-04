package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {
    public static c a(String str) {
        try {
            if (com.alipay.sdk.m.z.a.a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString(com.alipay.sdk.m.t.a.f11034k), jSONObject.optString("tid"), jSONObject.optString(com.alipay.sdk.m.l.b.f10730g));
        } catch (Exception e11) {
            com.alipay.apmobilesecuritysdk.c.a.a(e11);
            return null;
        }
    }

    public static synchronized c b() {
        synchronized (d.class) {
            String a11 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4");
            if (com.alipay.sdk.m.z.a.a(a11)) {
                return null;
            }
            return a(a11);
        }
    }

    public static synchronized c c(Context context) {
        synchronized (d.class) {
            String a11 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (com.alipay.sdk.m.z.a.a(a11)) {
                return null;
            }
            return a(a11);
        }
    }

    public static synchronized void a() {
        synchronized (d.class) {
        }
    }

    public static synchronized c b(Context context) {
        c a11;
        synchronized (d.class) {
            try {
                String a12 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
                if (com.alipay.sdk.m.z.a.a(a12)) {
                    a12 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4");
                }
                a11 = a(a12);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a11;
    }

    public static synchronized void a(Context context) {
        synchronized (d.class) {
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4", "");
        }
    }

    public static synchronized void a(Context context, c cVar) {
        synchronized (d.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", cVar.f10356a);
                jSONObject.put("deviceInfoHash", cVar.f10357b);
                jSONObject.put(com.alipay.sdk.m.t.a.f11034k, cVar.f10358c);
                jSONObject.put("tid", cVar.f10359d);
                jSONObject.put(com.alipay.sdk.m.l.b.f10730g, cVar.f10360e);
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4", jSONObject2);
            } catch (Exception e11) {
                com.alipay.apmobilesecuritysdk.c.a.a(e11);
            }
        }
    }
}
