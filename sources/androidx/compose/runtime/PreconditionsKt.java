package androidx.compose.runtime;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PreconditionsKt {
    public static final void checkPrecondition(boolean z11, @k x00.a<String> aVar) {
        if (z11) {
            return;
        }
        throwIllegalStateException(aVar.invoke());
    }

    public static final void requirePrecondition(boolean z11, @k x00.a<String> aVar) {
        if (z11) {
            return;
        }
        throwIllegalArgumentException(aVar.invoke());
    }

    public static final void throwIllegalArgumentException(@k String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(@k String str) {
        throw new IllegalStateException(str);
    }

    public static final void checkPrecondition(boolean z11) {
        if (z11) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }
}
