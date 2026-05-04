package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FlingCancellationException extends CancellationException {
    public static final int $stable = 0;

    public FlingCancellationException() {
        super("The fling animation was cancelled");
    }

    @Override // java.lang.Throwable
    @k
    public Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArr;
        stackTraceElementArr = Scrollable_jvmKt.EmptyStackTraceElements;
        setStackTrace(stackTraceElementArr);
        return this;
    }
}
