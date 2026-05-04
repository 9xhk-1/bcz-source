package org.conscrypt;

import javax.crypto.ShortBufferException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class ShortBufferWithoutStackTraceException extends ShortBufferException {
    private static final long serialVersionUID = 676150236007842683L;

    public ShortBufferWithoutStackTraceException() {
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    public ShortBufferWithoutStackTraceException(String str) {
        super(str);
    }
}
