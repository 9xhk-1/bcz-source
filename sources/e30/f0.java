package e30;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f0 {
    public static /* synthetic */ a2 b(f0 f0Var, p10.c1 c1Var, g0 g0Var, z1 z1Var, r0 r0Var, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i11 & 8) != 0) {
            r0Var = z1Var.e(c1Var, g0Var);
        }
        return f0Var.a(c1Var, g0Var, z1Var, r0Var);
    }

    @m80.k
    public a2 a(@m80.k p10.c1 parameter, @m80.k g0 typeAttr, @m80.k z1 typeParameterUpperBoundEraser, @m80.k r0 erasedUpperBound) {
        kotlin.jvm.internal.g0.p(parameter, "parameter");
        kotlin.jvm.internal.g0.p(typeAttr, "typeAttr");
        kotlin.jvm.internal.g0.p(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        kotlin.jvm.internal.g0.p(erasedUpperBound, "erasedUpperBound");
        return new c2(Variance.OUT_VARIANCE, erasedUpperBound);
    }
}
