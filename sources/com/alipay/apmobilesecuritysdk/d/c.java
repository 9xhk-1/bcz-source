package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.f;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {
    public static Map<String, String> a(Context context) {
        com.alipay.sdk.m.a0.b a11 = com.alipay.sdk.m.a0.b.a(APSecuritySdk.getInstance(context));
        HashMap hashMap = new HashMap();
        f a12 = com.alipay.apmobilesecuritysdk.e.e.a(context);
        String a13 = a11.a(context);
        String d11 = a11.d(context);
        if (a12 != null) {
            if (com.alipay.sdk.m.z.a.a(a13)) {
                a13 = a12.b();
            }
            if (com.alipay.sdk.m.z.a.a(d11)) {
                d11 = a12.e();
            }
        }
        String str = a13;
        String str2 = d11;
        f fVar = new f("", str, "", "", str2);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", fVar.a());
                jSONObject.put("imsi", fVar.b());
                jSONObject.put("mac", fVar.c());
                jSONObject.put("bluetoothmac", fVar.d());
                jSONObject.put("gsi", fVar.e());
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key", jSONObject2);
            } catch (Exception e11) {
                com.alipay.apmobilesecuritysdk.c.a.a(e11);
            }
        }
        hashMap.put("AD1", "");
        hashMap.put("AD2", str);
        hashMap.put("AD3", com.alipay.sdk.m.a0.b.h(context));
        hashMap.put("AD5", com.alipay.sdk.m.a0.b.j(context));
        hashMap.put("AD6", com.alipay.sdk.m.a0.b.k(context));
        hashMap.put("AD7", com.alipay.sdk.m.a0.b.l(context));
        hashMap.put("AD9", a11.c(context));
        hashMap.put("AD10", str2);
        hashMap.put("AD11", com.alipay.sdk.m.a0.b.d());
        hashMap.put("AD12", a11.a());
        hashMap.put("AD13", com.alipay.sdk.m.a0.b.e());
        hashMap.put("AD14", com.alipay.sdk.m.a0.b.g());
        hashMap.put("AD15", com.alipay.sdk.m.a0.b.h());
        hashMap.put("AD16", com.alipay.sdk.m.a0.b.i());
        hashMap.put("AD17", "");
        hashMap.put("AD19", com.alipay.sdk.m.a0.b.m(context));
        hashMap.put("AD20", com.alipay.sdk.m.a0.b.j());
        hashMap.put("AD22", "");
        hashMap.put("AD23", com.alipay.sdk.m.a0.b.n(context));
        hashMap.put("AD24", com.alipay.sdk.m.z.a.g(com.alipay.sdk.m.a0.b.i(context)));
        hashMap.put("AD26", a11.b(context));
        hashMap.put("AD27", com.alipay.sdk.m.a0.b.o());
        hashMap.put("AD28", com.alipay.sdk.m.a0.b.q());
        hashMap.put("AD29", com.alipay.sdk.m.a0.b.s());
        hashMap.put("AD30", com.alipay.sdk.m.a0.b.p());
        hashMap.put("AD31", com.alipay.sdk.m.a0.b.r());
        hashMap.put("AD32", com.alipay.sdk.m.a0.b.m());
        hashMap.put("AD33", com.alipay.sdk.m.a0.b.n());
        hashMap.put("AD34", com.alipay.sdk.m.a0.b.o(context));
        hashMap.put("AD35", com.alipay.sdk.m.a0.b.p(context));
        hashMap.put("AD36", a11.e(context));
        hashMap.put("AD37", com.alipay.sdk.m.a0.b.l());
        hashMap.put("AD38", com.alipay.sdk.m.a0.b.k());
        hashMap.put("AD39", com.alipay.sdk.m.a0.b.f(context));
        hashMap.put("AD40", com.alipay.sdk.m.a0.b.g(context));
        hashMap.put("AD41", com.alipay.sdk.m.a0.b.b());
        hashMap.put("AD42", com.alipay.sdk.m.a0.b.c());
        return hashMap;
    }
}
