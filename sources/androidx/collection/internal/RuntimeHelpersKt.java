package androidx.collection.internal;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.a;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class RuntimeHelpersKt {
    public static final void checkPrecondition(boolean z11, @k a<String> lazyMessage) {
        g0.p(lazyMessage, "lazyMessage");
        if (z11) {
            return;
        }
        throwIllegalStateException(lazyMessage.invoke());
    }

    public static final void requirePrecondition(boolean z11, @k a<String> lazyMessage) {
        g0.p(lazyMessage, "lazyMessage");
        if (z11) {
            return;
        }
        throwIllegalArgumentException(lazyMessage.invoke());
    }

    public static final void throwIllegalArgumentException(@k String message) {
        g0.p(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void throwIllegalStateException(@k String message) {
        g0.p(message, "message");
        throw new IllegalStateException(message);
    }

    public static final void throwIndexOutOfBoundsException(@k String message) {
        g0.p(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void throwNoSuchElementException(@k String message) {
        g0.p(message, "message");
        throw new NoSuchElementException(message);
    }

    @v0
    @k
    public static final Void throwNoSuchElementExceptionForInline(@k String message) {
        g0.p(message, "message");
        throw new NoSuchElementException(message);
    }
}
