package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class w0 {
    private static void a(String str, String str2) {
        b0.a().a(new j1(str, str2));
    }

    public static void b(String str, String str2) {
        n0 n0Var;
        String str3;
        String replace = "{url}/getPublicKey?keytype=4".replace("{url}", a1.f(str, str2));
        String f11 = q0.f();
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", f11);
        try {
            n0Var = w.a(replace, new byte[0], hashMap);
        } catch (Exception e11) {
            v.e("GetPublicKey", "get pubKey response Exception :" + e11.getMessage());
            n0Var = null;
        }
        if (n0Var == null) {
            str3 = "get pubKey response is null";
        } else if (n0Var.b() == 200) {
            if (TextUtils.isEmpty(n0Var.a())) {
                return;
            }
            d(n0Var.a(), str2);
            return;
        } else {
            str3 = "get pubKey fail HttpCode :" + n0Var.b();
        }
        v.e("GetPublicKey", str3);
    }

    public static String c(String str, String str2) {
        String o11;
        String c11 = q0.c();
        if (TextUtils.isEmpty(c11)) {
            c11 = d.a(q0.i(), "Privacy_MY", "public_key_version", "");
            q0.g(c11);
        }
        if (!"2.0".equals(c11)) {
            a(str, str2);
            return null;
        }
        if ("maint".equals(str2)) {
            o11 = q0.n();
            if (TextUtils.isEmpty(o11)) {
                o11 = rr.b.d("HiAnalytics_Sdk_Public_Sp_Key", d.a(q0.i(), "Privacy_MY", "public_key_maint", ""));
                q0.d(o11);
            }
        } else {
            o11 = q0.o();
            if (TextUtils.isEmpty(o11)) {
                o11 = rr.b.d("HiAnalytics_Sdk_Public_Sp_Key", d.a(q0.i(), "Privacy_MY", "public_key_oper", ""));
                q0.e(o11);
            }
        }
        if (!TextUtils.isEmpty(o11) && !a()) {
            return o11;
        }
        a(str, str2);
        return null;
    }

    private static void d(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("publicKey");
            String optString2 = jSONObject.optString("publicKeyOM");
            String optString3 = jSONObject.optString("pubkey_version");
            String str3 = System.currentTimeMillis() + "";
            String optString4 = jSONObject.optString("timeInterval");
            d.b(q0.i(), "Privacy_MY", "public_key_oper", rr.b.g("HiAnalytics_Sdk_Public_Sp_Key", optString));
            d.b(q0.i(), "Privacy_MY", "public_key_maint", rr.b.g("HiAnalytics_Sdk_Public_Sp_Key", optString2));
            d.b(q0.i(), "Privacy_MY", "public_key_time_interval", optString4);
            d.b(q0.i(), "Privacy_MY", "public_key_version", optString3);
            d.b(q0.i(), "Privacy_MY", "public_key_time_last", str3);
            q0.e(optString);
            q0.d(optString2);
            q0.g(optString3);
            q0.c(str3);
            q0.f(optString4);
        } catch (JSONException e11) {
            v.e("GetPublicKey", "get pubKey parse json JSONException :" + e11.getMessage());
        }
    }

    public static boolean a() {
        String a11 = q0.a();
        if (TextUtils.isEmpty(a11)) {
            a11 = d.a(q0.i(), "Privacy_MY", "public_key_time_interval", "");
            q0.f(a11);
        }
        String m11 = q0.m();
        if (TextUtils.isEmpty(m11)) {
            m11 = d.a(q0.i(), "Privacy_MY", "public_key_time_last", "");
            q0.c(m11);
        }
        if (!TextUtils.isEmpty(a11) && !TextUtils.isEmpty(m11)) {
            try {
                return System.currentTimeMillis() - Long.parseLong(m11) > ((long) Integer.parseInt(a11));
            } catch (NumberFormatException e11) {
                v.e("GetPublicKey", "checkCachePubKey NumberFormatException :" + e11.getMessage());
            }
        }
        return true;
    }
}
