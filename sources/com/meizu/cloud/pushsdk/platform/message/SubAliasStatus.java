package com.meizu.cloud.pushsdk.platform.message;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import l50.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class SubAliasStatus extends BasicPushStatus {
    private String alias;
    private String pushId;

    public SubAliasStatus() {
    }

    public String getAlias() {
        return this.alias;
    }

    public String getPushId() {
        return this.pushId;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public void parseValueData(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull("pushId")) {
            setPushId(jSONObject.getString("pushId"));
        }
        if (jSONObject.isNull(PushConstants.SUB_ALIAS_STATUS_NAME)) {
            return;
        }
        setAlias(jSONObject.getString(PushConstants.SUB_ALIAS_STATUS_NAME));
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setPushId(String str) {
        this.pushId = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public String toString() {
        return super.toString() + " SubAliasStatus{pushId='" + this.pushId + "', alias='" + this.alias + '\'' + b.f69928j;
    }

    public SubAliasStatus(String str) {
        super(str);
    }
}
