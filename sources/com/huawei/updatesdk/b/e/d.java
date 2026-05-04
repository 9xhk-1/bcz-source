package com.huawei.updatesdk.b.e;

import android.content.Context;
import android.text.TextUtils;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class d {
    private static String a(Context context, String str) {
        InputStream open = context.getAssets().open(str);
        byte[] bArr = new byte[open.available()];
        com.huawei.updatesdk.a.a.a.b("JsonPareUrl", "loadJSONFromAsset code: " + open.read(bArr));
        open.close();
        return new String(bArr, "UTF-8");
    }

    public static String a(Context context, String str, String str2) {
        String str3 = "";
        try {
            JSONArray jSONArray = new JSONObject(a(context, str)).getJSONArray("services");
            JSONArray jSONArray2 = jSONArray.getJSONObject(0).getJSONArray("servings");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i11);
                if (TextUtils.equals(str2, jSONObject.getString("countryOrAreaGroup"))) {
                    str3 = jSONObject.getJSONObject("addresses").getString(Logger.ROOT_LOGGER_NAME);
                }
            }
            return str3;
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.a.a("JsonPareUrl", "Failed to obtain the default url.");
            return str3;
        }
    }
}
