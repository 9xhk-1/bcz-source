package io.ktor.client.network.sockets;

import java.net.ConnectException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ConnectTimeoutException extends ConnectException {

    @l
    private final Throwable cause;

    public /* synthetic */ ConnectTimeoutException(String str, Throwable th2, int i11, v vVar) {
        this(str, (i11 & 2) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    @l
    public Throwable getCause() {
        return this.cause;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectTimeoutException(@k String message, @l Throwable th2) {
        super(message);
        g0.p(message, "message");
        this.cause = th2;
    }
}
