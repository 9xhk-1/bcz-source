package com.huawei.hms.support.account.result;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.AbstractAuthResult;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AccountAuthResult extends AbstractAuthResult {
    private static final String TAG_ENTITY = "signInHuaweiId";
    private AuthAccount authAccount;

    public AccountAuthResult fromJson(String str) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            jsonToSuper(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject(TAG_ENTITY);
            if (optJSONObject != null) {
                this.authAccount = AuthAccount.fromJson(optJSONObject);
            }
        }
        return this;
    }

    public AuthAccount getAccount() {
        return this.authAccount;
    }

    public void setAuthAccount(AuthAccount authAccount) {
        this.authAccount = authAccount;
    }

    public String toJson() throws JSONException {
        return toJsonObject().toString();
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject superToJson = superToJson();
        AuthAccount authAccount = this.authAccount;
        if (authAccount != null) {
            superToJson.put(TAG_ENTITY, authAccount.toJsonObject());
        }
        return superToJson;
    }
}
