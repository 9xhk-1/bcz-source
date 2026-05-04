package com.huawei.hms.support.api.push;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PushException extends RuntimeException {
    public static final String EXCEPTION_SEND_FAILED = "send message failed";

    public PushException() {
    }

    public PushException(String str, Throwable th2) {
        super(str, th2);
    }

    public PushException(String str) {
        super(str);
    }

    public PushException(Throwable th2) {
        super(th2);
    }
}
