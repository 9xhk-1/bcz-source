package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class AbortFlowException extends CancellationException {

    @w00.g
    @m80.k
    public final transient Object owner;

    public AbortFlowException(@m80.k Object obj) {
        super("Flow was aborted, no more elements needed");
        this.owner = obj;
    }

    @Override // java.lang.Throwable
    @m80.k
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
