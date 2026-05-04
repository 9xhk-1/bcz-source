package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ModifierNodeDetachedCancellationException extends CancellationException {
    public static final int $stable = 0;

    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    @k
    public Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArr;
        stackTraceElementArr = Modifier_jvmKt.EmptyStackTraceElements;
        setStackTrace(stackTraceElementArr);
        return this;
    }
}
