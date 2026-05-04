package com.xiaomi.clientreport.data;

import com.heytap.mcssdk.constant.IntentConstant;
import com.vivo.push.PushClientConstants;
import com.xiaomi.push.bs;
import com.xiaomi.push.j;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class a {
    public String clientInterfaceId;
    private String pkgName;
    public int production;
    public int reportType;
    private String sdkVersion;

    /* renamed from: os, reason: collision with root package name */
    private String f45147os = bs.a();
    private String miuiVersion = j.m6168a();

    public String getPackageName() {
        return this.pkgName;
    }

    public void setAppPackageName(String str) {
        this.pkgName = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("production", this.production);
            jSONObject.put("reportType", this.reportType);
            jSONObject.put("clientInterfaceId", this.clientInterfaceId);
            jSONObject.put("os", this.f45147os);
            jSONObject.put("miuiVersion", this.miuiVersion);
            jSONObject.put(PushClientConstants.TAG_PKG_NAME, this.pkgName);
            jSONObject.put(IntentConstant.SDK_VERSION, this.sdkVersion);
            return jSONObject;
        } catch (JSONException e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return null;
        }
    }

    public String toJsonString() {
        JSONObject json = toJson();
        return json == null ? "" : json.toString();
    }
}
