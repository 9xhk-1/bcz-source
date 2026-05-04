package com.huawei.hms.support.api.hwid;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HuaweiIdGetTokenOptions {

    /* renamed from: a, reason: collision with root package name */
    private String f36302a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36303b;

    public HuaweiIdGetTokenOptions(String str, boolean z11) {
        this.f36302a = str;
        this.f36303b = z11;
    }

    public static HuaweiIdGetTokenOptions fromJsonObject(JSONObject jSONObject) throws JSONException {
        return new HuaweiIdGetTokenOptions(jSONObject.optString("accountName"), jSONObject.optBoolean("fromGetToken", false));
    }

    public String getAccountName() {
        return this.f36302a;
    }

    public boolean isFromGetToken() {
        return this.f36303b;
    }

    public void setAccountName(String str) {
        this.f36302a = str;
    }

    public void setFromGetToken(boolean z11) {
        this.f36303b = z11;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f36302a)) {
            jSONObject.put("accountName", this.f36302a);
        }
        jSONObject.put("fromGetToken", this.f36303b);
        return jSONObject;
    }
}
