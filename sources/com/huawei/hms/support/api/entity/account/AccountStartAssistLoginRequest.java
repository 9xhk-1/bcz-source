package com.huawei.hms.support.api.entity.account;

import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AccountStartAssistLoginRequest {

    /* renamed from: a, reason: collision with root package name */
    private String f36282a;

    public AccountStartAssistLoginRequest() {
    }

    public static AccountStartAssistLoginRequest fromJson(String str) throws JSONException {
        if (str == null) {
            return null;
        }
        return new AccountStartAssistLoginRequest().objectFromJson(new JSONObject(str));
    }

    public AccountStartAssistLoginRequest objectFromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f36282a = jSONObject.getString(CommonConstant.KEY_ASSIST_TOKEN);
        }
        return this;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f36282a;
        if (str != null) {
            jSONObject.put(CommonConstant.KEY_ASSIST_TOKEN, str);
        }
        return jSONObject.toString();
    }

    public AccountStartAssistLoginRequest(String str) {
        this.f36282a = str;
    }
}
