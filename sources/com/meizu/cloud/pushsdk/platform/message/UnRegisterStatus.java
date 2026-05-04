package com.meizu.cloud.pushsdk.platform.message;

import l50.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class UnRegisterStatus extends BasicPushStatus {
    private boolean isUnRegisterSuccess;

    public UnRegisterStatus() {
    }

    public boolean isUnRegisterSuccess() {
        return this.isUnRegisterSuccess;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public void parseValueData(JSONObject jSONObject) throws JSONException {
        if (jSONObject.isNull("result")) {
            return;
        }
        setIsUnRegisterSuccess(jSONObject.getBoolean("result"));
    }

    public void setIsUnRegisterSuccess(boolean z11) {
        this.isUnRegisterSuccess = z11;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public String toString() {
        return super.toString() + " UnRegisterStatus{isUnRegisterSuccess=" + this.isUnRegisterSuccess + b.f69928j;
    }

    public UnRegisterStatus(String str) {
        super(str);
    }
}
