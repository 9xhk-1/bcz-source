package yz;

import kotlin.NotImplementedError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a1 {
    @o00.f
    public static final Void a() {
        throw new NotImplementedError(null, 1, null);
    }

    @o00.f
    public static final Void b(String reason) {
        kotlin.jvm.internal.g0.p(reason, "reason");
        throw new NotImplementedError("An operation is not implemented: " + reason);
    }

    @y0(version = "1.1")
    @o00.f
    public static final <T> T c(T t11, x00.l<? super T, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        block.invoke(t11);
        return t11;
    }

    @o00.f
    public static final <T> T d(T t11, x00.l<? super T, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        block.invoke(t11);
        return t11;
    }

    @o00.f
    public static final <T, R> R e(T t11, x00.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        return block.invoke(t11);
    }

    @o00.f
    public static final void f(int i11, x00.l<? super Integer, g2> action) {
        kotlin.jvm.internal.g0.p(action, "action");
        for (int i12 = 0; i12 < i11; i12++) {
            action.invoke(Integer.valueOf(i12));
        }
    }

    @o00.f
    public static final <T, R> R g(T t11, x00.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        return block.invoke(t11);
    }

    @o00.f
    public static final <R> R h(x00.a<? extends R> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        return block.invoke();
    }

    @y0(version = "1.1")
    @o00.f
    public static final <T> T i(T t11, x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        if (predicate.invoke(t11).booleanValue()) {
            return t11;
        }
        return null;
    }

    @y0(version = "1.1")
    @o00.f
    public static final <T> T j(T t11, x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        if (predicate.invoke(t11).booleanValue()) {
            return null;
        }
        return t11;
    }

    @o00.f
    public static final <T, R> R k(T t11, x00.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        return block.invoke(t11);
    }
}
