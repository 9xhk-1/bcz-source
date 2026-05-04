package yz;

import kotlin.InitializedLazyImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f0 extends e0 {
    @o00.f
    public static final <T> T d(c0<? extends T> c0Var, Object obj, h10.n<?> property) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        kotlin.jvm.internal.g0.p(property, "property");
        return c0Var.getValue();
    }

    @m80.k
    public static <T> c0<T> e(T t11) {
        return new InitializedLazyImpl(t11);
    }
}
