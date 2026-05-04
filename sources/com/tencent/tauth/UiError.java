package com.tencent.tauth;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UiError {
    public int errorCode;
    public String errorDetail;
    public String errorMessage;

    public UiError(int i11, String str, String str2) {
        this.errorMessage = str;
        this.errorCode = i11;
        this.errorDetail = str2;
    }

    public String toString() {
        return "errorCode: " + this.errorCode + ", errorMsg: " + this.errorMessage + ", errorDetail: " + this.errorDetail;
    }
}
