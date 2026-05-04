package com.zx.a.I8b7;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.xiaomi.mipush.sdk.Constants;
import com.zx.sdk.api.ZXID;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class z0 {
    public ZXID a(String str, String str2) {
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        ZXID zxid = new ZXID();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("ext"));
            JSONObject optJSONObject = jSONObject2.optJSONObject("aids");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
            if (optJSONObject2 == null) {
                try {
                    Context context = m3.f46585a;
                    if (m3.f46589e == null) {
                        x1.d(context);
                    }
                    if (TextUtils.isEmpty(m3.f46589e)) {
                        optJSONObject2 = optJSONObject.optJSONObject(x1.a(x1.c(m3.f46585a)).trim());
                    } else {
                        try {
                            str3 = x1.b(m3.f46585a).getString("ZX_APPID");
                        } catch (Exception e11) {
                            r2.a(e11);
                            str3 = null;
                        }
                        optJSONObject2 = optJSONObject.optJSONObject(str3.trim());
                    }
                } catch (Throwable unused) {
                }
            }
            zxid.setAids(optJSONObject2 == null ? "" : optJSONObject2.toString());
            JSONArray optJSONArray = jSONObject2.optJSONArray("tags");
            if (optJSONArray != null) {
                str4 = optJSONArray.toString();
            }
            zxid.setTags(str4);
            String optString = jSONObject.optString("zid");
            zxid.setValue(optString);
            String[] split = optString.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            zxid.setVersion(split[0]);
            zxid.setExpiredTime(Long.parseLong(split[1]) * 1000);
            String optString2 = jSONObject2.optString("openid");
            if (!TextUtils.isEmpty(optString2) && !"OPENID_CLOSED".equals(optString2)) {
                zxid.setOpenid(optString2);
            }
            zxid.setOT(jSONObject2.optInt(CmcdConfiguration.KEY_OBJECT_TYPE));
        } catch (Exception e12) {
            try {
                JSONObject jSONObject3 = new JSONObject(str2);
                String string = jSONObject3.getString("ext");
                zxid.setValue(jSONObject3.getString("zid"));
                zxid.setAids(string);
            } catch (Throwable unused2) {
            }
            r2.a(e12);
        }
        return zxid;
    }

    public abstract void a(String str);
}
