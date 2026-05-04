package com.huawei.hms.activity.internal;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ForegroundInnerHeader {

    /* renamed from: a, reason: collision with root package name */
    private int f35261a;

    /* renamed from: b, reason: collision with root package name */
    private String f35262b;

    /* renamed from: c, reason: collision with root package name */
    private String f35263c;

    public void fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f35261a = JsonUtil.getIntValue(jSONObject, "apkVersion");
            this.f35262b = JsonUtil.getStringValue(jSONObject, "action");
            this.f35263c = JsonUtil.getStringValue(jSONObject, "responseCallbackKey");
        } catch (JSONException e11) {
            HMSLog.e("ForegroundInnerHeader", "fromJson failed: " + e11.getMessage());
        }
    }

    public String getAction() {
        return this.f35262b;
    }

    public int getApkVersion() {
        return this.f35261a;
    }

    public String getResponseCallbackKey() {
        return this.f35263c;
    }

    public void setAction(String str) {
        this.f35262b = str;
    }

    public void setApkVersion(int i11) {
        this.f35261a = i11;
    }

    public void setResponseCallbackKey(String str) {
        this.f35263c = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apkVersion", this.f35261a);
            jSONObject.put("action", this.f35262b);
            jSONObject.put("responseCallbackKey", this.f35263c);
        } catch (JSONException e11) {
            HMSLog.e("ForegroundInnerHeader", "ForegroundInnerHeader toJson failed: " + e11.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "apkVersion:" + this.f35261a + ", action:" + this.f35262b + ", responseCallbackKey:" + this.f35263c;
    }
}
