package com.huawei.hms.hatool;

import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class l extends t {

    /* renamed from: b, reason: collision with root package name */
    private String f35849b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f35850c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f35851d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f35852e = "";

    /* renamed from: f, reason: collision with root package name */
    protected String f35853f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f35854g;

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("androidid", this.f35918a);
        jSONObject.put("oaid", this.f35854g);
        jSONObject.put("uuid", this.f35853f);
        jSONObject.put("upid", this.f35852e);
        jSONObject.put("imei", this.f35849b);
        jSONObject.put("sn", this.f35850c);
        jSONObject.put("udid", this.f35851d);
        return jSONObject;
    }

    public void b(String str) {
        this.f35849b = str;
    }

    public void c(String str) {
        this.f35854g = str;
    }

    public void d(String str) {
        this.f35850c = str;
    }

    public void e(String str) {
        this.f35851d = str;
    }

    public void f(String str) {
        this.f35852e = str;
    }

    public void g(String str) {
        this.f35853f = str;
    }
}
