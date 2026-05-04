package io.ktor.client.plugins.sse;

import ex.c;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class SSEClientException extends IllegalStateException {

    @l
    private final Throwable cause;

    @l
    private final String message;

    @l
    private final c response;

    public SSEClientException() {
        this(null, null, null, 7, null);
    }

    @Override // java.lang.Throwable
    @l
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    @l
    public String getMessage() {
        return this.message;
    }

    @l
    public final c getResponse() {
        return this.response;
    }

    public /* synthetic */ SSEClientException(c cVar, Throwable th2, String str, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : cVar, (i11 & 2) != 0 ? null : th2, (i11 & 4) != 0 ? null : str);
    }

    public SSEClientException(@l c cVar, @l Throwable th2, @l String str) {
        this.response = cVar;
        this.cause = th2;
        this.message = str;
    }
}
