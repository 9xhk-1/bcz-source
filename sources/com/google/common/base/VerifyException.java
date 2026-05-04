package com.google.common.base;

import go.b;
import ho.j;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@b
/* loaded from: classes7.dex */
public class VerifyException extends RuntimeException {
    public VerifyException() {
    }

    public VerifyException(@CheckForNull String message) {
        super(message);
    }

    public VerifyException(@CheckForNull Throwable cause) {
        super(cause);
    }

    public VerifyException(@CheckForNull String message, @CheckForNull Throwable cause) {
        super(message, cause);
    }
}
