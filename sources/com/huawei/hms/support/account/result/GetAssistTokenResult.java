package com.huawei.hms.support.account.result;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.AbstractAuthResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class GetAssistTokenResult extends AbstractAuthResult {
    private String assistToken;

    public GetAssistTokenResult fromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        JSONObject jSONObject = new JSONObject(str);
        this.assistToken = jSONObject.getString(CommonConstant.KEY_ASSIST_TOKEN);
        jsonToSuper(jSONObject);
        return this;
    }

    public String getAssistToken() {
        return this.assistToken;
    }
}
