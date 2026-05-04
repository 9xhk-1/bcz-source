package io.ktor.client.engine;

import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ClientEngineClosedException extends IllegalStateException {

    @l
    private final Throwable cause;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientEngineClosedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    @l
    public Throwable getCause() {
        return this.cause;
    }

    public /* synthetic */ ClientEngineClosedException(Throwable th2, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : th2);
    }

    public ClientEngineClosedException(@l Throwable th2) {
        super("Client already closed");
        this.cause = th2;
    }
}
