package cn.com.chinatelecom.account.sdk.a;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9187a = "c";

    public static e a(String str) {
        e eVar = new e();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("result");
            String optString = jSONObject.optString("msg");
            String optString2 = jSONObject.optString("ifaaMsg");
            eVar.a(optInt);
            eVar.a(optString);
            eVar.g(optString2);
            jSONObject.remove("ifaaMsg");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optInt != 0 || optJSONObject == null) {
                eVar.e(jSONObject.toString());
            } else {
                long optLong = (optJSONObject.optLong("expiredTime") * 1000) + System.currentTimeMillis();
                eVar.a(optLong);
                eVar.c(optJSONObject.optString("number"));
                eVar.b(optJSONObject.optString("operatorType"));
                eVar.d(cn.com.chinatelecom.account.api.b.a(optJSONObject.optString("gwAuth")));
                optJSONObject.put("expiredTime", optLong);
                optJSONObject.remove("gwAuth");
                optJSONObject.remove("number");
                jSONObject.put("data", optJSONObject);
                eVar.e(jSONObject.toString());
                jSONObject.put("data", optJSONObject);
            }
            eVar.f(jSONObject.toString());
            return eVar;
        } catch (Throwable th2) {
            cn.com.chinatelecom.account.api.a.a(f9187a, "parse result exception", th2);
            return eVar;
        }
    }

    public static String a(String str, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.optInt("result") == 0) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            optJSONObject.put("authCode", str2);
            jSONObject.put("data", optJSONObject);
        }
        return jSONObject.toString();
    }
}
