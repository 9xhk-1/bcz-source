package com.huawei.hms.hwid;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b extends am {
    public static b a(String str) throws JSONException {
        return new b().a(new JSONObject(str));
    }

    public b a(JSONObject jSONObject) {
        this.f35944a = jSONObject.optString("appId", null);
        this.f35945b = jSONObject.optString(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, null);
        this.f35946c = jSONObject.optLong("hmsSdkVersion");
        this.f35947d = jSONObject.optString("subAppId", null);
        return this;
    }
}
