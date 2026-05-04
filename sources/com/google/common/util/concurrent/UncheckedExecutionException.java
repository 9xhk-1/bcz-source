package com.google.common.util.concurrent;

import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b
/* loaded from: classes7.dex */
public class UncheckedExecutionException extends RuntimeException {
    private static final long serialVersionUID = 0;

    @Deprecated
    public UncheckedExecutionException() {
    }

    @Deprecated
    public UncheckedExecutionException(@CheckForNull String message) {
        super(message);
    }

    public UncheckedExecutionException(@CheckForNull String message, @CheckForNull Throwable cause) {
        super(message, cause);
    }

    public UncheckedExecutionException(@CheckForNull Throwable cause) {
        super(cause);
    }
}
