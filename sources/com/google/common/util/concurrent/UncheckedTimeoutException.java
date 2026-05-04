package com.google.common.util.concurrent;

import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public class UncheckedTimeoutException extends RuntimeException {
    private static final long serialVersionUID = 0;

    public UncheckedTimeoutException() {
    }

    public UncheckedTimeoutException(@CheckForNull String message) {
        super(message);
    }

    public UncheckedTimeoutException(@CheckForNull Throwable cause) {
        super(cause);
    }

    public UncheckedTimeoutException(@CheckForNull String message, @CheckForNull Throwable cause) {
        super(message, cause);
    }
}
