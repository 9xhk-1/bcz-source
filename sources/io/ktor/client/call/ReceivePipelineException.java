package io.ktor.client.call;

import gz.a;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ReceivePipelineException extends IllegalStateException {

    @k
    private final Throwable cause;

    @k
    private final a info;

    @k
    private final mw.a request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivePipelineException(@k mw.a request, @k a info, @k Throwable cause) {
        super("Fail to run receive pipeline: " + cause);
        g0.p(request, "request");
        g0.p(info, "info");
        g0.p(cause, "cause");
        this.request = request;
        this.info = info;
        this.cause = cause;
    }

    @Override // java.lang.Throwable
    @k
    public Throwable getCause() {
        return this.cause;
    }

    @k
    public final a getInfo() {
        return this.info;
    }

    @k
    public final mw.a getRequest() {
        return this.request;
    }
}
