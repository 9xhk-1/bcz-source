package e30;

import java.util.HashSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h0 {
    @m80.l
    public static final i30.g a(@m80.k g2 g2Var, @m80.k i30.g inlineClassType) {
        kotlin.jvm.internal.g0.p(g2Var, "<this>");
        kotlin.jvm.internal.g0.p(inlineClassType, "inlineClassType");
        return b(g2Var, inlineClassType, new HashSet());
    }

    public static final i30.g b(g2 g2Var, i30.g gVar, HashSet<i30.l> hashSet) {
        i30.g b11;
        i30.l A0 = g2Var.A0(gVar);
        if (!hashSet.add(A0)) {
            return null;
        }
        i30.m k11 = g2Var.k(A0);
        if (k11 != null) {
            i30.g E = g2Var.E(k11);
            i30.g b12 = b(g2Var, E, hashSet);
            if (b12 != null) {
                return ((b12 instanceof i30.h) && g2Var.i0((i30.h) b12) && g2Var.t0(gVar) && (g2Var.I0(g2Var.A0(E)) || ((E instanceof i30.h) && g2Var.i0((i30.h) E)))) ? g2Var.E0(E) : (g2Var.t0(b12) || !g2Var.S(gVar)) ? b12 : g2Var.E0(b12);
            }
            return null;
        }
        if (g2Var.I0(A0)) {
            i30.g e02 = g2Var.e0(gVar);
            if (e02 == null || (b11 = b(g2Var, e02, hashSet)) == null) {
                return null;
            }
            if (!g2Var.t0(gVar)) {
                return b11;
            }
            if (!g2Var.t0(b11) && (!(b11 instanceof i30.h) || !g2Var.i0((i30.h) b11))) {
                return g2Var.E0(b11);
            }
        }
        return gVar;
    }
}
