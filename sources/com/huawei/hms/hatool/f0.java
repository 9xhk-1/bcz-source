package com.huawei.hms.hatool;

import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f0 extends k0 {

    /* renamed from: g, reason: collision with root package name */
    private String f35792g = "";

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("protocol_version", "3");
        jSONObject.put("compress_mode", "1");
        jSONObject.put("serviceid", this.f35846d);
        jSONObject.put("appid", this.f35843a);
        jSONObject.put("hmac", this.f35792g);
        jSONObject.put("chifer", this.f35848f);
        jSONObject.put(com.alipay.sdk.m.t.a.f11034k, this.f35844b);
        jSONObject.put("servicetag", this.f35845c);
        jSONObject.put("requestid", this.f35847e);
        return jSONObject;
    }

    public void g(String str) {
        this.f35792g = str;
    }
}
