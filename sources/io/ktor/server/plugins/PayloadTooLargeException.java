package io.ktor.server.plugins;

import c40.g0;
import io.ktor.util.internal.c;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class PayloadTooLargeException extends ContentTransformationException implements g0<PayloadTooLargeException> {
    private final long sizeLimit;

    public PayloadTooLargeException(long j11) {
        super("Request is larger than the limit of " + j11 + " bytes");
        this.sizeLimit = j11;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c40.g0
    @k
    public PayloadTooLargeException createCopy() {
        PayloadTooLargeException payloadTooLargeException = new PayloadTooLargeException(this.sizeLimit);
        c.a(payloadTooLargeException, this);
        return payloadTooLargeException;
    }
}
