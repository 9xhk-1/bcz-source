package com.meizu.cloud.pushsdk.platform.message;

import l50.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class PushSwitchStatus extends BasicPushStatus {
    private String pushId;
    private boolean switchNotificationMessage;
    private boolean switchThroughMessage;

    public PushSwitchStatus() {
    }

    public String getPushId() {
        return this.pushId;
    }

    public boolean isSwitchNotificationMessage() {
        return this.switchNotificationMessage;
    }

    public boolean isSwitchThroughMessage() {
        return this.switchThroughMessage;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public void parseValueData(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull("pushId")) {
            setPushId(jSONObject.getString("pushId"));
        }
        if (!jSONObject.isNull("barTypeSwitch")) {
            setSwitchNotificationMessage(jSONObject.getInt("barTypeSwitch") == 1);
        }
        if (jSONObject.isNull("directTypeSwitch")) {
            return;
        }
        setSwitchThroughMessage(jSONObject.getInt("directTypeSwitch") == 1);
    }

    public void setPushId(String str) {
        this.pushId = str;
    }

    public void setSwitchNotificationMessage(boolean z11) {
        this.switchNotificationMessage = z11;
    }

    public void setSwitchThroughMessage(boolean z11) {
        this.switchThroughMessage = z11;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public String toString() {
        return super.toString() + "PushSwitchStatus{switchNotificationMessage=" + this.switchNotificationMessage + ", switchThroughMessage=" + this.switchThroughMessage + ", pushId='" + this.pushId + '\'' + b.f69928j;
    }

    public PushSwitchStatus(String str) {
        super(str);
    }
}
