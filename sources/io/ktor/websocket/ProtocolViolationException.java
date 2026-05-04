package io.ktor.websocket;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ProtocolViolationException extends Exception implements c40.g0<ProtocolViolationException> {

    @m80.k
    private final String violation;

    public ProtocolViolationException(@m80.k String violation) {
        kotlin.jvm.internal.g0.p(violation, "violation");
        this.violation = violation;
    }

    @Override // java.lang.Throwable
    @m80.k
    public String getMessage() {
        return "Received illegal frame: " + this.violation;
    }

    @m80.k
    public final String getViolation() {
        return this.violation;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c40.g0
    @m80.k
    public ProtocolViolationException createCopy() {
        ProtocolViolationException protocolViolationException = new ProtocolViolationException(this.violation);
        io.ktor.util.internal.c.a(protocolViolationException, this);
        return protocolViolationException;
    }
}
