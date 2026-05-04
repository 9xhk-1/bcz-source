package com.huawei.hms.push.ups.entity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CodeResult {

    /* renamed from: a, reason: collision with root package name */
    public int f36229a;

    /* renamed from: b, reason: collision with root package name */
    public String f36230b;

    public CodeResult() {
    }

    public String getReason() {
        return this.f36230b;
    }

    public int getReturnCode() {
        return this.f36229a;
    }

    public void setReason(String str) {
        this.f36230b = str;
    }

    public void setReturnCode(int i11) {
        this.f36229a = i11;
    }

    public CodeResult(int i11) {
        this.f36229a = i11;
    }

    public CodeResult(int i11, String str) {
        this.f36229a = i11;
        this.f36230b = str;
    }
}
