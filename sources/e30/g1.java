package e30;

import e30.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSpecialTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialTypes.kt\norg/jetbrains/kotlin/types/SpecialTypesKt\n+ 2 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n102#2,2:217\n104#2,6:222\n112#2,7:229\n1557#3:219\n1628#3,2:220\n1630#3:228\n*S KotlinDebug\n*F\n+ 1 SpecialTypes.kt\norg/jetbrains/kotlin/types/SpecialTypesKt\n*L\n214#1:217,2\n214#1:222,6\n214#1:229,7\n214#1:219\n214#1:220,2\n214#1:228\n*E\n"})
/* loaded from: classes8.dex */
public final class g1 {
    @m80.l
    public static final a a(@m80.k r0 r0Var) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        k2 L0 = r0Var.L0();
        if (L0 instanceof a) {
            return (a) L0;
        }
        return null;
    }

    @m80.l
    public static final c1 b(@m80.k r0 r0Var) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        a a11 = a(r0Var);
        if (a11 != null) {
            return a11.U0();
        }
        return null;
    }

    public static final boolean c(@m80.k r0 r0Var) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        return r0Var.L0() instanceof x;
    }

    public static final q0 d(q0 q0Var) {
        r0 r0Var;
        Collection<r0> c11 = q0Var.c();
        ArrayList arrayList = new ArrayList(a00.i0.d0(c11, 10));
        Iterator<T> it = c11.iterator();
        boolean z11 = false;
        while (true) {
            r0Var = null;
            if (!it.hasNext()) {
                break;
            }
            r0 r0Var2 = (r0) it.next();
            if (h2.l(r0Var2)) {
                r0Var2 = f(r0Var2.L0(), false, 1, null);
                z11 = true;
            }
            arrayList.add(r0Var2);
        }
        if (!z11) {
            return null;
        }
        r0 k11 = q0Var.k();
        if (k11 != null) {
            if (h2.l(k11)) {
                k11 = f(k11.L0(), false, 1, null);
            }
            r0Var = k11;
        }
        return new q0(arrayList).t(r0Var);
    }

    @m80.k
    public static final k2 e(@m80.k k2 k2Var, boolean z11) {
        kotlin.jvm.internal.g0.p(k2Var, "<this>");
        x c11 = x.a.c(x.f48682d, k2Var, z11, false, 4, null);
        if (c11 != null) {
            return c11;
        }
        c1 g11 = g(k2Var);
        return g11 != null ? g11 : k2Var.M0(false);
    }

    public static /* synthetic */ k2 f(k2 k2Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return e(k2Var, z11);
    }

    public static final c1 g(r0 r0Var) {
        q0 d11;
        u1 I0 = r0Var.I0();
        q0 q0Var = I0 instanceof q0 ? (q0) I0 : null;
        if (q0Var == null || (d11 = d(q0Var)) == null) {
            return null;
        }
        return d11.i();
    }

    @m80.k
    public static final c1 h(@m80.k c1 c1Var, boolean z11) {
        kotlin.jvm.internal.g0.p(c1Var, "<this>");
        x c11 = x.a.c(x.f48682d, c1Var, z11, false, 4, null);
        if (c11 != null) {
            return c11;
        }
        c1 g11 = g(c1Var);
        return g11 == null ? c1Var.M0(false) : g11;
    }

    public static /* synthetic */ c1 i(c1 c1Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return h(c1Var, z11);
    }

    @m80.k
    public static final c1 j(@m80.k c1 c1Var, @m80.k c1 abbreviatedType) {
        kotlin.jvm.internal.g0.p(c1Var, "<this>");
        kotlin.jvm.internal.g0.p(abbreviatedType, "abbreviatedType");
        return v0.a(c1Var) ? c1Var : new a(c1Var, abbreviatedType);
    }

    @m80.k
    public static final f30.i k(@m80.k f30.i iVar) {
        kotlin.jvm.internal.g0.p(iVar, "<this>");
        return new f30.i(iVar.R0(), iVar.I0(), iVar.T0(), iVar.H0(), iVar.J0(), true);
    }
}
