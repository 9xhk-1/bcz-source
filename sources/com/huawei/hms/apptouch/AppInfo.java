package com.huawei.hms.apptouch;

/* loaded from: classes7.dex */
public class AppInfo {

    /* renamed from: a, reason: collision with root package name */
    private String f35440a;

    /* renamed from: b, reason: collision with root package name */
    private String f35441b;

    /* renamed from: c, reason: collision with root package name */
    private String f35442c;

    /* renamed from: d, reason: collision with root package name */
    private String f35443d;

    /* renamed from: e, reason: collision with root package name */
    private String f35444e;

    /* renamed from: f, reason: collision with root package name */
    private String f35445f;

    public AppInfo() {
    }

    public String getAppId() {
        return this.f35442c;
    }

    public String getAppPackageName() {
        return this.f35443d;
    }

    public String getAppTouchPackageName() {
        return this.f35441b;
    }

    public String getBusiness() {
        return this.f35440a;
    }

    public String getCarrierId() {
        return this.f35444e;
    }

    public String getHomeCountry() {
        return this.f35445f;
    }

    public void setAppId(String str) {
        this.f35442c = str;
    }

    public void setAppPackageName(String str) {
        this.f35443d = str;
    }

    public void setAppTouchPackageName(String str) {
        this.f35441b = str;
    }

    public void setBusiness(String str) {
        this.f35440a = str;
    }

    public void setCarrierId(String str) {
        this.f35444e = str;
    }

    public void setHomeCountry(String str) {
        this.f35445f = str;
    }

    public String toString() {
        return "business:" + this.f35440a + ", appTouchPackageName:" + this.f35441b + ", appId:" + this.f35442c + ", appPackageName:" + this.f35443d + ", carrierId:" + this.f35444e + ", homeCountry:" + this.f35445f;
    }

    public AppInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f35440a = str;
        this.f35441b = str2;
        this.f35442c = str3;
        this.f35443d = str4;
        this.f35444e = str5;
        this.f35445f = str6;
    }
}
