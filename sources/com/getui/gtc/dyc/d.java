package com.getui.gtc.dyc;

import android.text.TextUtils;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.http.GtHttpClient;
import com.getui.gtc.base.http.Interceptor;
import com.getui.gtc.base.http.LoggerInterceptor;
import com.getui.gtc.base.http.MediaType;
import com.getui.gtc.base.http.Request;
import com.getui.gtc.base.http.RequestBody;
import com.getui.gtc.base.http.Response;
import com.getui.gtc.base.http.crypt.GtRASCryptoInterceptor;
import com.getui.gtc.base.util.NetworkUtil;
import com.getui.gtc.dyc.b.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    static String f29999a = "MHwwDQYJKoZIhvcNAQEBBQADawAwaAJhAJp1rROuvBF7sBSnvLaesj2iFhMcY8aXyLvpnNLKs2wjL3JmEnyr++SlVa35liUlzi83tnAFkn3A9GB7pHBNzawyUkBh8WUhq5bnFIkk2RaDa6+5MpG84DEv52p7RR+aWwIDAQAB";

    /* renamed from: c, reason: collision with root package name */
    static String f30000c = "69d747c4b9f641baf4004be4297e9f3b";

    /* renamed from: d, reason: collision with root package name */
    static GtHttpClient f30001d = new GtHttpClient.Builder().addInterceptor(new LoggerInterceptor(com.getui.gtc.dyc.a.a.a.a())).addInterceptor(new Interceptor() { // from class: com.getui.gtc.dyc.d.1
        @Override // com.getui.gtc.base.http.Interceptor
        public final Response intercept(Interceptor.Chain chain) throws IOException {
            if (NetworkUtil.isNetWorkAvailable(GtcProvider.context())) {
                return chain.proceed(chain.request());
            }
            throw new IllegalStateException("network is not available");
        }
    }).build();

    private String c(b bVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", bVar.d());
        jSONObject.put("cid", bVar.e());
        jSONObject.put("appid", bVar.c());
        jSONObject.put("sdk_version", bVar.g());
        jSONObject.put("tag", bVar.f());
        return jSONObject.toString();
    }

    public h a(b bVar) throws Exception {
        return a(bVar, f30001d.newCall(new Request.Builder().url(bVar.a()).method("POST").body(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), c(bVar))).cryptInterceptor(new GtRASCryptoInterceptor(f30000c, f29999a)).tag("sdk config" + bVar.g()).build()).execute());
    }

    public h a(b bVar, Response response) throws Exception {
        JSONObject jSONObject = new JSONObject(response.body().string());
        if (!com.igexin.push.core.b.B.equalsIgnoreCase(jSONObject.getString("result"))) {
            throw new Exception(jSONObject.toString());
        }
        h hVar = new h();
        hVar.a(System.currentTimeMillis());
        hVar.a(bVar.g());
        hVar.d(bVar.c());
        String optString = jSONObject.optString("tag");
        if (!TextUtils.isEmpty(optString)) {
            hVar.c(optString);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("config");
        if (optJSONObject != null) {
            HashMap hashMap = new HashMap(optJSONObject.length());
            hVar.a(hashMap);
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
        }
        return hVar;
    }
}
