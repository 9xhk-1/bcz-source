package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SecurityCommonException extends Exception {

    /* renamed from: c, reason: collision with root package name */
    private static final long f36792c = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f36793a;

    /* renamed from: b, reason: collision with root package name */
    private String f36794b;

    public SecurityCommonException() {
    }

    public String getMsgDes() {
        return this.f36794b;
    }

    public String getRetCd() {
        return this.f36793a;
    }

    public SecurityCommonException(Throwable th2) {
        super(th2);
    }

    public SecurityCommonException(String str, Throwable th2) {
        super(str, th2);
    }

    public SecurityCommonException(String str) {
        super(str);
        this.f36794b = str;
    }

    public SecurityCommonException(String str, String str2) {
        this.f36793a = str;
        this.f36794b = str2;
    }
}
