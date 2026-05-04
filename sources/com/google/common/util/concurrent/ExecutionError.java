package com.google.common.util.concurrent;

import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b
/* loaded from: classes7.dex */
public class ExecutionError extends Error {
    private static final long serialVersionUID = 0;

    @Deprecated
    public ExecutionError() {
    }

    @Deprecated
    public ExecutionError(@CheckForNull String message) {
        super(message);
    }

    public ExecutionError(@CheckForNull String message, @CheckForNull Error cause) {
        super(message, cause);
    }

    public ExecutionError(@CheckForNull Error cause) {
        super(cause);
    }
}
