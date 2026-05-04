package com.igexin.push.config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37608a = "IDCConfigParse";

    public static void a(String str, boolean z11) {
        JSONObject jSONObject;
        String[] a11;
        String[] a12;
        String[] a13;
        String[] a14;
        String[] a15;
        com.igexin.c.a.c.a.b(f37608a, " parse idc config data : ".concat(String.valueOf(str)));
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        if (jSONObject.has("N")) {
            try {
                SDKUrlConfig.setLocation(jSONObject.getString("N"));
            } catch (JSONException e12) {
                com.igexin.c.a.c.a.a(e12);
            }
        }
        if (jSONObject.has("X1") && (a15 = a(jSONObject, "X1")) != null && a15.length > 0) {
            SDKUrlConfig.setXfrAddressIps(a15);
            if (z11) {
                com.igexin.c.a.c.a.b("Detect_IDCConfigParse", "parse idc success, set new xfr address, reset and redetect +++++++++++++++++");
                com.igexin.push.c.c.a().e();
            }
        }
        if (jSONObject.has("X2") && (a14 = a(jSONObject, "X2")) != null && a14.length > 0) {
            SDKUrlConfig.XFR_ADDRESS_BAK = a14;
        }
        if (jSONObject.has("B") && (a13 = a(jSONObject, "B")) != null && a13.length > 0) {
            SDKUrlConfig.BI_ADDRESS_IPS = a13;
        }
        if (jSONObject.has("C") && (a12 = a(jSONObject, "C")) != null && a12.length > 0) {
            SDKUrlConfig.CONFIG_ADDRESS_IPS = a12;
        }
        if (!jSONObject.has("LO") || (a11 = a(jSONObject, "LO")) == null || a11.length <= 0) {
            return;
        }
        SDKUrlConfig.LOG_ADDRESS_IPS = a11;
    }

    private static String[] a(JSONObject jSONObject, String str) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            String[] strArr = new String[length];
            for (int i11 = 0; i11 < length; i11++) {
                if (!"X1".equals(str) && !"X2".equals(str)) {
                    strArr[i11] = "https://" + jSONArray.getString(i11);
                }
                strArr[i11] = "socket://" + jSONArray.getString(i11);
            }
            return strArr;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }
}
