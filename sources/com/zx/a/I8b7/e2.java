package com.zx.a.I8b7;

import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class e2 {
    public static String a(int i11, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i11);
            jSONObject.put("message", str);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}
