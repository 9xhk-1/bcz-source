package com.huawei.hms.common.internal;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.tencent.connect.common.Constants;
import ma.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ResponseWrap {

    /* renamed from: a, reason: collision with root package name */
    private String f35587a;

    /* renamed from: b, reason: collision with root package name */
    private ResponseHeader f35588b;

    public ResponseWrap(ResponseHeader responseHeader) {
        this.f35588b = responseHeader;
    }

    public boolean fromJson(String str) {
        if (this.f35588b == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f35588b.setStatusCode(JsonUtil.getIntValue(jSONObject, "status_code"));
            this.f35588b.setErrorCode(JsonUtil.getIntValue(jSONObject, b.f72948u));
            this.f35588b.setErrorReason(JsonUtil.getStringValue(jSONObject, "error_reason"));
            this.f35588b.setSrvName(JsonUtil.getStringValue(jSONObject, "srv_name"));
            this.f35588b.setApiName(JsonUtil.getStringValue(jSONObject, "api_name"));
            this.f35588b.setAppID(JsonUtil.getStringValue(jSONObject, "app_id"));
            this.f35588b.setPkgName(JsonUtil.getStringValue(jSONObject, Constants.PARAM_PKG_NAME));
            this.f35588b.setSessionId(JsonUtil.getStringValue(jSONObject, "session_id"));
            this.f35588b.setTransactionId(JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.TRANSACTION_ID));
            this.f35588b.setResolution(JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.HAS_RESOLUTION));
            this.f35587a = JsonUtil.getStringValue(jSONObject, TtmlNode.TAG_BODY);
            return true;
        } catch (JSONException e11) {
            HMSLog.e("ResponseWrap", "fromJson failed: " + e11.getMessage());
            return false;
        }
    }

    public String getBody() {
        if (TextUtils.isEmpty(this.f35587a)) {
            this.f35587a = new JSONObject().toString();
        }
        return this.f35587a;
    }

    public ResponseHeader getResponseHeader() {
        return this.f35588b;
    }

    public void setBody(String str) {
        this.f35587a = str;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.f35588b = responseHeader;
    }

    public String toJson() {
        if (this.f35588b == null) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", this.f35588b.getStatusCode());
            jSONObject.put(b.f72948u, this.f35588b.getErrorCode());
            jSONObject.put("error_reason", this.f35588b.getErrorReason());
            jSONObject.put("srv_name", this.f35588b.getSrvName());
            jSONObject.put("api_name", this.f35588b.getApiName());
            jSONObject.put("app_id", this.f35588b.getAppID());
            jSONObject.put(Constants.PARAM_PKG_NAME, this.f35588b.getPkgName());
            jSONObject.put(CommonCode.MapKey.TRANSACTION_ID, this.f35588b.getTransactionId());
            jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, this.f35588b.getResolution());
            String sessionId = this.f35588b.getSessionId();
            if (!TextUtils.isEmpty(sessionId)) {
                jSONObject.put("session_id", sessionId);
            }
            if (!TextUtils.isEmpty(this.f35587a)) {
                jSONObject.put(TtmlNode.TAG_BODY, this.f35587a);
            }
        } catch (JSONException e11) {
            HMSLog.e("ResponseWrap", "toJson failed: " + e11.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "ResponseWrap{body='" + this.f35587a + "', responseHeader=" + this.f35588b + l50.b.f69928j;
    }
}
