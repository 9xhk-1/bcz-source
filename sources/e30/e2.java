package e30;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e2 {
    @m80.k
    public static final c1 a(@m80.k r0 r0Var) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        k2 L0 = r0Var.L0();
        c1 c1Var = L0 instanceof c1 ? (c1) L0 : null;
        if (c1Var != null) {
            return c1Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + r0Var).toString());
    }

    @w00.k
    @m80.k
    public static final r0 b(@m80.k r0 r0Var, @m80.k List<? extends a2> newArguments, @m80.k q10.g newAnnotations) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(newArguments, "newArguments");
        kotlin.jvm.internal.g0.p(newAnnotations, "newAnnotations");
        return e(r0Var, newArguments, newAnnotations, null, 4, null);
    }

    @w00.k
    @m80.k
    public static final r0 c(@m80.k r0 r0Var, @m80.k List<? extends a2> newArguments, @m80.k q10.g newAnnotations, @m80.k List<? extends a2> newArgumentsForUpperBound) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(newArguments, "newArguments");
        kotlin.jvm.internal.g0.p(newAnnotations, "newAnnotations");
        kotlin.jvm.internal.g0.p(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == r0Var.G0()) && newAnnotations == r0Var.getAnnotations()) {
            return r0Var;
        }
        r1 H0 = r0Var.H0();
        if ((newAnnotations instanceof q10.o) && ((q10.o) newAnnotations).isEmpty()) {
            newAnnotations = q10.g.A0.b();
        }
        r1 a11 = s1.a(H0, newAnnotations);
        k2 L0 = r0Var.L0();
        if (L0 instanceof i0) {
            i0 i0Var = (i0) L0;
            return u0.e(d(i0Var.Q0(), newArguments, a11), d(i0Var.R0(), newArgumentsForUpperBound, a11));
        }
        if (L0 instanceof c1) {
            return d((c1) L0, newArguments, a11);
        }
        throw new NoWhenBranchMatchedException();
    }

    @w00.k
    @m80.k
    public static final c1 d(@m80.k c1 c1Var, @m80.k List<? extends a2> newArguments, @m80.k r1 newAttributes) {
        kotlin.jvm.internal.g0.p(c1Var, "<this>");
        kotlin.jvm.internal.g0.p(newArguments, "newArguments");
        kotlin.jvm.internal.g0.p(newAttributes, "newAttributes");
        return (newArguments.isEmpty() && newAttributes == c1Var.H0()) ? c1Var : newArguments.isEmpty() ? c1Var.O0(newAttributes) : c1Var instanceof g30.g ? ((g30.g) c1Var).U0(newArguments) : u0.m(newAttributes, c1Var.I0(), newArguments, c1Var.J0(), null, 16, null);
    }

    public static /* synthetic */ r0 e(r0 r0Var, List list, q10.g gVar, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = r0Var.G0();
        }
        if ((i11 & 2) != 0) {
            gVar = r0Var.getAnnotations();
        }
        if ((i11 & 4) != 0) {
            list2 = list;
        }
        return c(r0Var, list, gVar, list2);
    }

    public static /* synthetic */ c1 f(c1 c1Var, List list, r1 r1Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = c1Var.G0();
        }
        if ((i11 & 2) != 0) {
            r1Var = c1Var.H0();
        }
        return d(c1Var, list, r1Var);
    }
}
