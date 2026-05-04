package com.huawei.hms.support.api.account;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AccountGetTokenOptions {

    /* renamed from: a, reason: collision with root package name */
    private String f36276a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36277b;

    public AccountGetTokenOptions(String str, boolean z11) {
        this.f36276a = str;
        this.f36277b = z11;
    }

    public static AccountGetTokenOptions fromJsonObject(JSONObject jSONObject) throws JSONException {
        return new AccountGetTokenOptions(jSONObject.optString("accountName"), jSONObject.optBoolean("fromGetToken", false));
    }

    public String getAccountName() {
        return this.f36276a;
    }

    public boolean isFromGetToken() {
        return this.f36277b;
    }

    public void setAccountName(String str) {
        this.f36276a = str;
    }

    public void setFromGetToken(boolean z11) {
        this.f36277b = z11;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f36276a)) {
            jSONObject.put("accountName", this.f36276a);
        }
        jSONObject.put("fromGetToken", this.f36277b);
        return jSONObject;
    }
}
