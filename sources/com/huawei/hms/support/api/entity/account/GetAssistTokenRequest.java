package com.huawei.hms.support.api.entity.account;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class GetAssistTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private String f36283a;

    /* renamed from: b, reason: collision with root package name */
    private String f36284b;

    /* renamed from: c, reason: collision with root package name */
    private String f36285c;

    public GetAssistTokenRequest(String str) {
        this.f36283a = str;
    }

    public String getSessionId() {
        return this.f36285c;
    }

    public String getUserIdentify() {
        return this.f36284b;
    }

    public void setSessionId(String str) {
        this.f36285c = str;
    }

    public void setUserIdentify(String str) {
        this.f36284b = str;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f36283a)) {
            jSONObject.putOpt(CommonConstant.KEY_ACCESS_TOKEN, this.f36283a);
        }
        if (!TextUtils.isEmpty(this.f36284b)) {
            jSONObject.putOpt(CommonConstant.KEY_USER_IDENTIFY, this.f36284b);
        }
        if (!TextUtils.isEmpty(this.f36285c)) {
            jSONObject.putOpt("sessionId", this.f36285c);
        }
        return jSONObject.toString();
    }
}
