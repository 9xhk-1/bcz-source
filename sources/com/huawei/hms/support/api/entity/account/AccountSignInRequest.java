package com.huawei.hms.support.api.entity.account;

import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.api.account.AccountGetTokenOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AccountSignInRequest {

    /* renamed from: a, reason: collision with root package name */
    AccountAuthParams f36280a;

    /* renamed from: b, reason: collision with root package name */
    AccountGetTokenOptions f36281b;

    public static AccountSignInRequest fromJson(String str) throws JSONException {
        if (str == null) {
            return null;
        }
        return new AccountSignInRequest().objectFromJson(new JSONObject(str));
    }

    public AccountAuthParams getAccountAuthParams() {
        return this.f36280a;
    }

    public AccountGetTokenOptions getAccountGetTokenOptions() {
        return this.f36281b;
    }

    public AccountSignInRequest objectFromJson(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = jSONObject.getJSONObject("huaweiIdSignInOptions");
        if (jSONObject3 != null) {
            this.f36280a = AccountAuthParams.fromJsonObject(jSONObject3);
        }
        if (jSONObject.has("huaweiIdGetTokenOptions") && (jSONObject2 = jSONObject.getJSONObject("accountGetTokenOptions")) != null && jSONObject2.length() > 0) {
            this.f36281b = AccountGetTokenOptions.fromJsonObject(jSONObject2);
        }
        return this;
    }

    public void setAccountAuthParams(AccountAuthParams accountAuthParams) {
        this.f36280a = accountAuthParams;
    }

    public void setAccountGetTokenOptions(AccountGetTokenOptions accountGetTokenOptions) {
        this.f36281b = accountGetTokenOptions;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AccountAuthParams accountAuthParams = this.f36280a;
        if (accountAuthParams != null) {
            jSONObject.put("huaweiIdSignInOptions", accountAuthParams.toJsonObject());
        }
        AccountGetTokenOptions accountGetTokenOptions = this.f36281b;
        if (accountGetTokenOptions != null) {
            jSONObject.put("accountGetTokenOptions", accountGetTokenOptions.toJsonObject());
        }
        return jSONObject.toString();
    }
}
