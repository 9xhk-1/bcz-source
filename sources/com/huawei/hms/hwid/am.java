package com.huawei.hms.hwid;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class am {

    /* renamed from: a, reason: collision with root package name */
    protected String f35944a;

    /* renamed from: b, reason: collision with root package name */
    protected String f35945b;

    /* renamed from: c, reason: collision with root package name */
    protected long f35946c;

    /* renamed from: d, reason: collision with root package name */
    protected String f35947d;

    public String a() {
        return this.f35944a;
    }

    public void b(String str) {
        this.f35944a = str;
    }

    public void c(String str) {
        this.f35945b = str;
    }

    public void d(String str) {
        this.f35947d = str;
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("appId", this.f35944a);
        jSONObject.putOpt(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, this.f35945b);
        jSONObject.put("hmsSdkVersion", this.f35946c);
        jSONObject.putOpt("subAppId", this.f35947d);
        return jSONObject;
    }

    public String toString() {
        return "HuaweiIdCpClientInfo{appId='" + this.f35944a + "', packageName='" + this.f35945b + "', hmsSdkVersion=" + this.f35946c + "', subAppId=" + this.f35947d + l50.b.f69928j;
    }

    public void a(long j11) {
        this.f35946c = j11;
    }

    public long b() {
        return this.f35946c;
    }

    public String c() {
        return this.f35947d;
    }

    public String d() throws JSONException {
        return e().toString();
    }
}
