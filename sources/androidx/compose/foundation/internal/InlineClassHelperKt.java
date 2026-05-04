package androidx.compose.foundation.internal;

import kotlin.KotlinNothingValueException;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final void checkPrecondition(boolean z11, @k a<String> aVar) {
        if (z11) {
            return;
        }
        throwIllegalStateException(aVar.invoke());
    }

    @k
    public static final <T> T checkPreconditionNotNull(@l T t11, @k a<String> aVar) {
        if (t11 != null) {
            return t11;
        }
        throwIllegalStateExceptionForNullCheck(aVar.invoke());
        throw new KotlinNothingValueException();
    }

    public static final void requirePrecondition(boolean z11, @k a<String> aVar) {
        if (z11) {
            return;
        }
        throwIllegalArgumentException(aVar.invoke());
    }

    @k
    public static final <T> T requirePreconditionNotNull(@l T t11, @k a<String> aVar) {
        if (t11 != null) {
            return t11;
        }
        throwIllegalArgumentExceptionForNullCheck(aVar.invoke());
        throw new KotlinNothingValueException();
    }

    public static final void throwIllegalArgumentException(@k String str) {
        throw new IllegalArgumentException(str);
    }

    @k
    public static final Void throwIllegalArgumentExceptionForNullCheck(@k String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(@k String str) {
        throw new IllegalStateException(str);
    }

    @k
    public static final Void throwIllegalStateExceptionForNullCheck(@k String str) {
        throw new IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(@k String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void checkPrecondition(boolean z11) {
        if (z11) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }

    @k
    public static final <T> T checkPreconditionNotNull(@l T t11) {
        if (t11 != null) {
            return t11;
        }
        throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    }
}
