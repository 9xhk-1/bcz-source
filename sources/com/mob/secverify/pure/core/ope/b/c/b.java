package com.mob.secverify.pure.core.ope.b.c;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {
    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String a11 = i.a(jSONObject.optString("aesKey"), str2);
            return d.b(jSONObject.optString("data"), a11.substring(0, 16), a11.substring(16));
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "CacheUtils", "decrypted", th2.toString());
            return null;
        }
    }

    public static com.mob.secverify.a.a b(String str, String str2) {
        JSONObject jSONObject;
        int optInt;
        try {
            jSONObject = new JSONObject(str);
            optInt = jSONObject.optInt("code");
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "RequestHelper", "getAccessCode", "server data format error" + th2.toString());
        }
        if (optInt != 0) {
            return null;
        }
        String optString = jSONObject.optString("msg");
        int optInt2 = jSONObject.optInt("status");
        String optString2 = jSONObject.optString("obj");
        String optString3 = jSONObject.optString(ma.b.f72887a);
        if (TextUtils.isEmpty(optString)) {
            if (TextUtils.isEmpty(optString3)) {
                if (!TextUtils.isEmpty(optString2)) {
                }
                return null;
            }
        }
        String a11 = a(optString2, str2);
        if (!TextUtils.isEmpty(a11)) {
            return new com.mob.secverify.a.d(optInt, optString, optInt2, a11, optString3);
        }
        com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "RequestHelper", "getAccessCode", "server data format error" + str);
        return null;
    }

    public static com.mob.secverify.a.a a(String str) {
        com.mob.secverify.a.a b11;
        String b12 = j.b();
        if (TextUtils.isEmpty(b12) || (b11 = b(b12, str)) == null || b11.d() <= System.currentTimeMillis() - 30000) {
            return null;
        }
        return b11;
    }
}
