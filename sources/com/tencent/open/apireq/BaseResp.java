package com.tencent.open.apireq;

import l50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class BaseResp {
    public static final int CODE_ERROR_PARAMS = -2000;
    public static final int CODE_NOT_LOGIN = -2001;
    public static final int CODE_PERMISSION_NOT_GRANTED = -1003;
    public static final int CODE_QQ_LOW_VERSION = -1001;
    public static final int CODE_QQ_NOT_INSTALLED = -1000;
    public static final int CODE_SUCCESS = 0;
    public static final int CODE_UNSUPPORTED_BRANCH = -1002;

    /* renamed from: a, reason: collision with root package name */
    private int f44443a = 0;

    /* renamed from: b, reason: collision with root package name */
    private String f44444b = "";

    public String a(int i11) {
        return "Api call failed.";
    }

    public int getCode() {
        return this.f44443a;
    }

    public String getErrorMsg() {
        return this.f44444b;
    }

    public boolean isSuccess() {
        return this.f44443a == 0;
    }

    public void setCode(int i11) {
        String str;
        this.f44443a = i11;
        if (i11 == -2001) {
            str = "Not login.";
        } else if (i11 == -2000) {
            str = "The given params check failed.";
        } else if (i11 != 0) {
            switch (i11) {
                case CODE_UNSUPPORTED_BRANCH /* -1002 */:
                    str = "The QQ branch (e.g. TIM) is not supported";
                    break;
                case -1001:
                    str = "QQ version is too low.";
                    break;
                case -1000:
                    str = "QQ is not installed.";
                    break;
                default:
                    str = a(i11);
                    break;
            }
        } else {
            str = "";
        }
        setErrorMsg(str);
    }

    public void setErrorMsg(String str) {
        this.f44444b = str;
    }

    public String toString() {
        return "BaseResp{mCode=" + this.f44443a + ", mErrorMsg='" + this.f44444b + '\'' + b.f69928j;
    }
}
