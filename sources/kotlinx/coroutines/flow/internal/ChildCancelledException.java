package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ChildCancelledException extends CancellationException {
    public ChildCancelledException() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    @m80.k
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
