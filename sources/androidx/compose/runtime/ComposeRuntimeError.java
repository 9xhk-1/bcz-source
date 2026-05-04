package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {
    public static final int $stable = 0;

    @k
    private final String message;

    public ComposeRuntimeError(@k String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    @k
    public String getMessage() {
        return this.message;
    }
}
