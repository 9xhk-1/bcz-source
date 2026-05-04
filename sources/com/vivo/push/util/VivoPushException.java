package com.vivo.push.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class VivoPushException extends Exception {
    public static final int REASON_CODE_ACCESS = 10000;
    private int mReasonCode;

    public VivoPushException(String str) {
        this(10000, str);
    }

    public int getCode() {
        return this.mReasonCode;
    }

    public VivoPushException(int i11, String str) {
        super(str);
        this.mReasonCode = i11;
    }
}
