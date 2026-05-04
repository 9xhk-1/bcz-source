package com.huawei.hms.hwid;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class af {

    /* renamed from: a, reason: collision with root package name */
    private String f35941a;

    public af() {
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, this.f35941a);
            return jSONObject.toString();
        } catch (JSONException unused) {
            as.d("ReadSmsInputBean", "toJson failed", true);
            return null;
        }
    }

    public af(String str) {
        this.f35941a = str;
    }
}
