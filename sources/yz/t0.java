package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
/* loaded from: classes8.dex */
public class t0 extends s0 {
    @o00.f
    public static final void c(boolean z11) {
        if (!z11) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @o00.f
    public static final void d(boolean z11, x00.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.g0.p(lazyMessage, "lazyMessage");
        if (!z11) {
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }
    }

    @o00.f
    public static final <T> T e(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @o00.f
    public static final <T> T f(T t11, x00.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.g0.p(lazyMessage, "lazyMessage");
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException(lazyMessage.invoke().toString());
    }

    @o00.f
    public static final Void g(Object message) {
        kotlin.jvm.internal.g0.p(message, "message");
        throw new IllegalStateException(message.toString());
    }

    @o00.f
    public static final void h(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @o00.f
    public static final void i(boolean z11, x00.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.g0.p(lazyMessage, "lazyMessage");
        if (!z11) {
            throw new IllegalArgumentException(lazyMessage.invoke().toString());
        }
    }

    @o00.f
    public static final <T> T j(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @o00.f
    public static final <T> T k(T t11, x00.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.g0.p(lazyMessage, "lazyMessage");
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }
}
