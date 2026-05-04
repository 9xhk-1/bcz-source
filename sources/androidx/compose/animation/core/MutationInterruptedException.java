package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class MutationInterruptedException extends CancellationException {
    public static final int $stable = 0;

    public MutationInterruptedException() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    @k
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
