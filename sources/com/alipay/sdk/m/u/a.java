package com.alipay.sdk.m.u;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.m.k.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11045a = "ap_req";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11046b = "ap_args";

    /* renamed from: c, reason: collision with root package name */
    public static final String f11047c = "ap_resp";

    public static com.alipay.sdk.m.g.a a() {
        try {
            try {
                return com.alipay.sdk.m.h.a.a("NP", System.currentTimeMillis(), new com.alipay.sdk.m.h.c(com.alipay.sdk.m.s.b.d().c()), (short) a.c.a(com.alipay.sdk.m.s.b.d().b()), new com.alipay.sdk.m.h.f());
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return com.alipay.sdk.m.h.a.c();
        }
    }

    public static HashMap<String, String> a(com.alipay.sdk.m.s.a aVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            com.alipay.sdk.m.g.a a11 = a();
            JSONObject jSONObject = new JSONObject();
            Context a12 = aVar != null ? aVar.a() : null;
            if (a12 == null) {
                a12 = com.alipay.sdk.m.s.b.d().b().getApplicationContext();
            }
            String a13 = n.a(aVar, a12);
            String b11 = com.alipay.sdk.m.w.b.b(aVar, a12);
            jSONObject.put("ap_q", a11 != null ? a11.a() : "");
            jSONObject.put(com.alipay.sdk.m.s.a.f11012z, aVar != null ? aVar.f11016d : "");
            jSONObject.put("u_pd", String.valueOf(n.g()));
            jSONObject.put("u_lk", String.valueOf(n.e(n.b())));
            jSONObject.put("u_pi", String.valueOf(aVar != null ? aVar.f11019g : "_"));
            jSONObject.put("u_fu", a13);
            jSONObject.put("u_oi", b11);
            hashMap.put(f11045a, jSONObject.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a11 != null ? a11.a() : "");
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(a13);
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "ap_q", sb2.toString());
            return hashMap;
        } catch (Exception e11) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "APMEx1", e11);
            return hashMap;
        }
    }

    public static JSONObject a(com.alipay.sdk.m.s.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(f11047c);
        try {
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            return new JSONObject(optString);
        } catch (JSONException e11) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "APMEx2", e11);
            return null;
        }
    }

    public static void a(com.alipay.sdk.m.s.a aVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            jSONObject.putOpt(f11046b, jSONObject2);
        } catch (JSONException e11) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "APMEx2", e11);
        }
    }

    public static void a(com.alipay.sdk.m.s.a aVar, HashMap<String, String> hashMap) {
        JSONObject a11 = com.alipay.sdk.m.m.a.D().a();
        if (hashMap == null || a11 == null) {
            return;
        }
        com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "ap_r", a11.optString("ap_r"));
        hashMap.putAll(n.a(a11));
    }
}
