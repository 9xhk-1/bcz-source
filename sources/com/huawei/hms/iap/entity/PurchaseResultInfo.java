package com.huawei.hms.iap.entity;

/* loaded from: classes7.dex */
public class PurchaseResultInfo {

    /* renamed from: a, reason: collision with root package name */
    private int f36007a;

    /* renamed from: b, reason: collision with root package name */
    private String f36008b;

    /* renamed from: c, reason: collision with root package name */
    private String f36009c;

    /* renamed from: d, reason: collision with root package name */
    private String f36010d;

    /* renamed from: e, reason: collision with root package name */
    private String f36011e;

    public String getErrMsg() {
        return this.f36010d;
    }

    public String getInAppDataSignature() {
        return this.f36009c;
    }

    public String getInAppPurchaseData() {
        return this.f36008b;
    }

    public int getReturnCode() {
        return this.f36007a;
    }

    public String getSignatureAlgorithm() {
        return this.f36011e;
    }

    public void setErrMsg(String str) {
        this.f36010d = str;
    }

    public void setInAppDataSignature(String str) {
        this.f36009c = str;
    }

    public void setInAppPurchaseData(String str) {
        this.f36008b = str;
    }

    public void setReturnCode(int i11) {
        this.f36007a = i11;
    }

    public void setSignatureAlgorithm(String str) {
        this.f36011e = str;
    }
}
