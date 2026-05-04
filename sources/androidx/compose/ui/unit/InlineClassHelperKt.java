package androidx.compose.ui.unit;

import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class InlineClassHelperKt {
    public static final long DualFloatSignBit = -9223372034707292160L;

    public static final void checkPrecondition(boolean z11, @k a<String> aVar) {
        if (z11) {
            return;
        }
        throwIllegalStateException(aVar.invoke());
    }

    public static final void requirePrecondition(boolean z11, @k a<String> aVar) {
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
}
