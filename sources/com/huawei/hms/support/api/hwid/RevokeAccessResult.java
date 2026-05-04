package com.huawei.hms.support.api.hwid;

import android.text.TextUtils;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class RevokeAccessResult extends Result {
    private static final String TAG = "[HUAWEIIDSDK]RevokeAccessResult";

    private void jsonToSuper(JSONObject jSONObject) {
        if (jSONObject.has("errorCode")) {
            setStatus(new Status(jSONObject.optInt("errorCode"), jSONObject.has("errorMsg") ? jSONObject.optString("errorMsg") : ""));
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("status");
        if (optJSONObject != null) {
            setStatus(new Status(optJSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT), optJSONObject.optString("statusMessage", null)));
        }
    }

    public RevokeAccessResult fromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        jsonToSuper(new JSONObject(str));
        return this;
    }

    public boolean isSuccess() {
        return getStatus().isSuccess();
    }
}
