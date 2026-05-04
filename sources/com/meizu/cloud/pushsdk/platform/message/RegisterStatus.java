package com.meizu.cloud.pushsdk.platform.message;

import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import l50.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class RegisterStatus extends BasicPushStatus {
    private int expireTime;
    private String pushId;

    public RegisterStatus() {
    }

    public int getExpireTime() {
        return this.expireTime;
    }

    public String getPushId() {
        return this.pushId;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public void parseValueData(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull("pushId")) {
            setPushId(jSONObject.getString("pushId"));
        }
        if (jSONObject.isNull(HwPayConstant.KEY_EXPIRETIME)) {
            return;
        }
        setExpireTime(jSONObject.getInt(HwPayConstant.KEY_EXPIRETIME));
    }

    public void setExpireTime(int i11) {
        this.expireTime = i11;
    }

    public void setPushId(String str) {
        this.pushId = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public String toString() {
        return super.toString() + "pushId='" + this.pushId + "', Become invalid after " + this.expireTime + " seconds " + b.f69928j;
    }

    public RegisterStatus(String str) {
        super(str);
    }
}
