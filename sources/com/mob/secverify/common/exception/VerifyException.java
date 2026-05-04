package com.mob.secverify.common.exception;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class VerifyException extends Exception {
    protected int code;
    private int innerCode;
    private String innerDesc;
    private int resCode;
    private String resDesc;

    public VerifyException(Throwable th2) {
        super(th2);
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "{\"code\": " + this.code + ", \"message\": \"" + getMessage() + "\"}";
    }

    public VerifyException(VerifyErr verifyErr) {
        super(verifyErr.getMessage());
        this.code = verifyErr.getCode();
    }

    public VerifyException(VerifyErr verifyErr, Throwable th2) {
        super(verifyErr.getMessage(), th2);
        this.code = verifyErr.getCode();
    }

    public VerifyException(int i11, String str) {
        super(str);
        this.code = i11;
    }

    public VerifyException(int i11, String str, Throwable th2) {
        super(str, th2);
        this.code = i11;
    }
}
