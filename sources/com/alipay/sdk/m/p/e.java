package com.alipay.sdk.m.p;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.o.a;
import com.alipay.sdk.m.u.m;
import com.alipay.sdk.m.u.n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public static final String f10899c = "msp-gzip";

    /* renamed from: d, reason: collision with root package name */
    public static final String f10900d = "Msp-Param";

    /* renamed from: e, reason: collision with root package name */
    public static final String f10901e = "Operation-Type";

    /* renamed from: f, reason: collision with root package name */
    public static final String f10902f = "content-type";

    /* renamed from: g, reason: collision with root package name */
    public static final String f10903g = "Version";

    /* renamed from: h, reason: collision with root package name */
    public static final String f10904h = "AppId";

    /* renamed from: i, reason: collision with root package name */
    public static final String f10905i = "des-mode";

    /* renamed from: j, reason: collision with root package name */
    public static final String f10906j = "namespace";

    /* renamed from: k, reason: collision with root package name */
    public static final String f10907k = "api_name";

    /* renamed from: l, reason: collision with root package name */
    public static final String f10908l = "api_version";

    /* renamed from: m, reason: collision with root package name */
    public static final String f10909m = "data";

    /* renamed from: n, reason: collision with root package name */
    public static final String f10910n = "params";

    /* renamed from: o, reason: collision with root package name */
    public static final String f10911o = "public_key";

    /* renamed from: p, reason: collision with root package name */
    public static final String f10912p = "device";

    /* renamed from: q, reason: collision with root package name */
    public static final String f10913q = "action";

    /* renamed from: r, reason: collision with root package name */
    public static final String f10914r = "type";

    /* renamed from: s, reason: collision with root package name */
    public static final String f10915s = "method";

    /* renamed from: a, reason: collision with root package name */
    public boolean f10916a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10917b = true;

    public Map<String, String> a(boolean z11, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(f10899c, String.valueOf(z11));
        hashMap.put(f10901e, "alipay.msp.cashier.dispatch.bytes");
        hashMap.put(f10902f, "application/octet-stream");
        hashMap.put(f10903g, "2.0");
        hashMap.put(f10904h, "TAOBAO");
        hashMap.put(f10900d, a.a(str));
        hashMap.put(f10905i, pr.a.f81159d);
        return hashMap;
    }

    public abstract JSONObject a() throws JSONException;

    public String b() {
        return "4.9.0";
    }

    public abstract boolean c();

    public String a(com.alipay.sdk.m.s.a aVar) throws JSONException {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("device", Build.MODEL);
        hashMap.put("namespace", "com.alipay.mobilecashier");
        hashMap.put("api_name", "com.alipay.mcpay");
        hashMap.put(f10908l, b());
        return a(aVar, hashMap, new HashMap<>());
    }

    public static JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put("method", str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public String a(com.alipay.sdk.m.s.a aVar, String str, JSONObject jSONObject) {
        com.alipay.sdk.m.s.b d11 = com.alipay.sdk.m.s.b.d();
        com.alipay.sdk.m.t.a a11 = com.alipay.sdk.m.t.a.a(d11.b());
        JSONObject a12 = com.alipay.sdk.m.u.d.a(new JSONObject(), jSONObject);
        try {
            a12.put(com.alipay.sdk.m.l.b.f10727d, str);
            a12.put("tid", a11.d());
            a12.put(com.alipay.sdk.m.l.b.f10725b, d11.a().a(aVar, a11, c()));
            a12.put(com.alipay.sdk.m.l.b.f10728e, n.a(aVar, d11.b(), com.alipay.sdk.m.j.a.f10605d, false));
            a12.put(com.alipay.sdk.m.l.b.f10729f, n.h(d11.b()));
            a12.put(com.alipay.sdk.m.l.b.f10731h, com.alipay.sdk.m.l.a.f10704g);
            a12.put(com.alipay.sdk.m.l.b.f10730g, d11.c());
            a12.put(com.alipay.sdk.m.l.b.f10733j, a11.c());
            a12.put(com.alipay.sdk.m.l.b.f10734k, com.alipay.sdk.m.m.b.b(d11.b()));
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "BodyErr", th2);
            com.alipay.sdk.m.u.e.a(th2);
        }
        return a12.toString();
    }

    public static boolean a(a.b bVar) {
        return Boolean.valueOf(a(bVar, f10899c)).booleanValue();
    }

    public static String a(a.b bVar, String str) {
        Map<String, List<String>> map;
        List<String> list;
        if (bVar == null || str == null || (map = bVar.f10886a) == null || (list = map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(",", list);
    }

    public String a(com.alipay.sdk.m.s.a aVar, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (hashMap != null) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    public static boolean a(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            jSONObject = new JSONObject(str).getJSONObject("data");
        } catch (JSONException e11) {
            com.alipay.sdk.m.u.e.a(e11);
        }
        if (!jSONObject.has("params")) {
            return false;
        }
        String optString = jSONObject.getJSONObject("params").optString(f10911o, null);
        if (!TextUtils.isEmpty(optString)) {
            com.alipay.sdk.m.m.b.a(optString);
            return true;
        }
        return false;
    }

    public b a(com.alipay.sdk.m.s.a aVar, Context context) throws Throwable {
        return a(aVar, context, "");
    }

    public b a(com.alipay.sdk.m.s.a aVar, Context context, String str) throws Throwable {
        return a(aVar, context, str, m.b(context));
    }

    public b a(com.alipay.sdk.m.s.a aVar, Context context, String str, String str2) throws Throwable {
        return a(aVar, context, str, str2, true);
    }

    public b a(com.alipay.sdk.m.s.a aVar, Context context, String str, String str2, boolean z11) throws Throwable {
        com.alipay.sdk.m.u.e.b(com.alipay.sdk.m.l.a.A, "Packet: " + str2);
        c cVar = new c(this.f10917b);
        b bVar = new b(a(aVar), a(aVar, str, a()));
        Map<String, String> a11 = a(false, str);
        d a12 = cVar.a(bVar, this.f10916a, a11.get("iSr"));
        a.b a13 = com.alipay.sdk.m.o.a.a(context, new a.C0171a(str2, a(a12.b(), str), a12.a()));
        if (a13 != null) {
            b a14 = cVar.a(new d(a(a13), a13.f10888c), a11.get("iSr"));
            return (a14 != null && a(a14.b()) && z11) ? a(aVar, context, str, str2, false) : a14;
        }
        throw new RuntimeException("Response is null.");
    }
}
