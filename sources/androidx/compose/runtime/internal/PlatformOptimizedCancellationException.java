package androidx.compose.runtime.internal;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformOptimizedCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    @k
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public PlatformOptimizedCancellationException(@l String str) {
        super(str);
    }

    public /* synthetic */ PlatformOptimizedCancellationException(String str, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : str);
    }
}
