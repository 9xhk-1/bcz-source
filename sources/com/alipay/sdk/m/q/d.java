package com.alipay.sdk.m.q;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends com.alipay.sdk.m.p.e {

    /* renamed from: t, reason: collision with root package name */
    public static final String f10966t = "log_v";

    @Override // com.alipay.sdk.m.p.e
    public String a(com.alipay.sdk.m.s.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.m.p.e
    public boolean c() {
        return false;
    }

    @Override // com.alipay.sdk.m.p.e
    public JSONObject a() throws JSONException {
        return null;
    }

    @Override // com.alipay.sdk.m.p.e
    public Map<String, String> a(boolean z11, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(com.alipay.sdk.m.p.e.f10899c, String.valueOf(z11));
        hashMap.put(com.alipay.sdk.m.p.e.f10902f, "application/octet-stream");
        hashMap.put(com.alipay.sdk.m.p.e.f10905i, pr.a.f81159d);
        return hashMap;
    }

    @Override // com.alipay.sdk.m.p.e
    public String a(com.alipay.sdk.m.s.a aVar) throws JSONException {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("api_name", "/sdk/log");
        hashMap.put(com.alipay.sdk.m.p.e.f10908l, "1.0.0");
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put(f10966t, "1.0");
        return a(aVar, hashMap, hashMap2);
    }

    @Override // com.alipay.sdk.m.p.e
    public com.alipay.sdk.m.p.b a(com.alipay.sdk.m.s.a aVar, Context context, String str) throws Throwable {
        return a(aVar, context, str, com.alipay.sdk.m.l.a.f10701d, true);
    }
}
