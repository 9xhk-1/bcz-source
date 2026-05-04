package com.mob.apc;

/* loaded from: classes7.dex */
public class APCException extends Exception {
    public int errorCode;

    public APCException(String str) {
        super(str);
        this.errorCode = 0;
    }

    public APCException(int i11, String str) {
        super(str);
        this.errorCode = i11;
    }

    public APCException(Throwable th2) {
        super(th2);
        this.errorCode = 0;
    }
}
