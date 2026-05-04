package com.huawei.hms.support.hwid.result;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.AbstractAuthResult;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HuaweiIdAuthResult extends AbstractAuthResult {
    private AuthHuaweiId authHuaweiId;

    public HuaweiIdAuthResult fromJson(String str) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            jsonToSuper(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("signInHuaweiId");
            if (optJSONObject != null) {
                this.authHuaweiId = AuthHuaweiId.fromJson(optJSONObject);
            }
        }
        return this;
    }

    public AuthHuaweiId getHuaweiId() {
        return this.authHuaweiId;
    }

    public void setAuthHuaweiId(AuthHuaweiId authHuaweiId) {
        this.authHuaweiId = authHuaweiId;
    }

    public String toJson() throws JSONException {
        return toJsonObject().toString();
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject superToJson = superToJson();
        AuthHuaweiId authHuaweiId = this.authHuaweiId;
        if (authHuaweiId != null) {
            superToJson.put("signInHuaweiId", authHuaweiId.toJsonObject());
        }
        return superToJson;
    }
}
