package j30;

import a00.a1;
import e30.a2;
import e30.c1;
import e30.c2;
import e30.e2;
import e30.h2;
import e30.i0;
import e30.j1;
import e30.j2;
import e30.k2;
import e30.l1;
import e30.r0;
import e30.s1;
import e30.u1;
import e30.v0;
import e30.x;
import g30.g;
import i30.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m80.k;
import m80.l;
import n10.j;
import p10.b1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTypeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n245#1,14:415\n260#1:433\n249#1,12:434\n245#1,14:446\n260#1:464\n249#1,12:465\n256#1,3:483\n260#1:490\n256#1,3:491\n260#1:498\n256#1,3:499\n260#1:506\n381#1:532\n381#1:533\n381#1:534\n1755#2,3:391\n1557#2:394\n1628#2,3:395\n1611#2,9:399\n1863#2:408\n1864#2:410\n1620#2:411\n774#2:412\n865#2,2:413\n1557#2:429\n1628#2,3:430\n1557#2:460\n1628#2,3:461\n1755#2,3:477\n1755#2,3:480\n1557#2:486\n1628#2,3:487\n1557#2:494\n1628#2,3:495\n1557#2:502\n1628#2,3:503\n1557#2:507\n1628#2,3:508\n1557#2:511\n1628#2,3:512\n1755#2,3:515\n295#2,2:518\n1557#2:520\n1628#2,3:521\n1557#2:524\n1628#2,3:525\n1557#2:528\n1628#2,3:529\n1#3:398\n1#3:409\n*S KotlinDebug\n*F\n+ 1 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n*L\n184#1:415,14\n184#1:433\n184#1:434,12\n185#1:446,14\n185#1:464\n185#1:465,12\n248#1:483,3\n248#1:490\n249#1:491,3\n249#1:498\n251#1:499,3\n251#1:506\n373#1:532\n376#1:533\n379#1:534\n80#1:391,3\n131#1:394\n131#1:395,3\n167#1:399,9\n167#1:408\n167#1:410\n167#1:411\n173#1:412\n173#1:413,2\n184#1:429\n184#1:430,3\n185#1:460\n185#1:461,3\n223#1:477,3\n235#1:480,3\n248#1:486\n248#1:487,3\n249#1:494\n249#1:495,3\n251#1:502\n251#1:503,3\n258#1:507\n258#1:508,3\n265#1:511\n265#1:512,3\n291#1:515,3\n298#1:518,2\n308#1:520\n308#1:521,3\n327#1:524\n327#1:525,3\n335#1:528\n335#1:529,3\n167#1:409\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    public static final boolean A(@k r0 type) {
        g0.p(type, "type");
        return (type instanceof g) && ((g) type).S0().isUnresolved();
    }

    @k
    public static final r0 B(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        r0 n11 = h2.n(r0Var);
        g0.o(n11, "makeNotNullable(...)");
        return n11;
    }

    @k
    public static final r0 C(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        r0 o11 = h2.o(r0Var);
        g0.o(o11, "makeNullable(...)");
        return o11;
    }

    @k
    public static final r0 D(@k r0 r0Var, @k q10.g newAnnotations) {
        g0.p(r0Var, "<this>");
        g0.p(newAnnotations, "newAnnotations");
        return (r0Var.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? r0Var : r0Var.L0().O0(s1.a(r0Var.H0(), newAnnotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [e30.k2] */
    @k
    public static final r0 E(@k r0 r0Var) {
        c1 c1Var;
        g0.p(r0Var, "<this>");
        k2 L0 = r0Var.L0();
        if (L0 instanceof i0) {
            i0 i0Var = (i0) L0;
            c1 Q0 = i0Var.Q0();
            if (!Q0.I0().getParameters().isEmpty() && Q0.I0().r() != null) {
                List<p10.c1> parameters = Q0.I0().getParameters();
                g0.o(parameters, "getParameters(...)");
                List<p10.c1> list = parameters;
                ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new j1((p10.c1) it.next()));
                }
                Q0 = e2.f(Q0, arrayList, null, 2, null);
            }
            c1 R0 = i0Var.R0();
            if (!R0.I0().getParameters().isEmpty() && R0.I0().r() != null) {
                List<p10.c1> parameters2 = R0.I0().getParameters();
                g0.o(parameters2, "getParameters(...)");
                List<p10.c1> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(a00.i0.d0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new j1((p10.c1) it2.next()));
                }
                R0 = e2.f(R0, arrayList2, null, 2, null);
            }
            c1Var = e30.u0.e(Q0, R0);
        } else {
            if (!(L0 instanceof c1)) {
                throw new NoWhenBranchMatchedException();
            }
            c1 c1Var2 = (c1) L0;
            boolean isEmpty = c1Var2.I0().getParameters().isEmpty();
            c1Var = c1Var2;
            if (!isEmpty) {
                p10.d r11 = c1Var2.I0().r();
                c1Var = c1Var2;
                if (r11 != null) {
                    List<p10.c1> parameters3 = c1Var2.I0().getParameters();
                    g0.o(parameters3, "getParameters(...)");
                    List<p10.c1> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(a00.i0.d0(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new j1((p10.c1) it3.next()));
                    }
                    c1Var = e2.f(c1Var2, arrayList3, null, 2, null);
                }
            }
        }
        return j2.b(c1Var, L0);
    }

    public static final boolean F(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return f(r0Var, c.f63180a);
    }

    public static final boolean G(k2 it) {
        g0.p(it, "it");
        p10.d r11 = it.I0().r();
        if (r11 != null) {
            return (r11 instanceof b1) || (r11 instanceof p10.c1);
        }
        return false;
    }

    public static final boolean H(@l r0 r0Var) {
        return r0Var == null || f(r0Var, d.f63181a);
    }

    public static final boolean I(k2 it) {
        g0.p(it, "it");
        return (it instanceof l1) || (it.I0() instanceof s) || v0.a(it);
    }

    @k
    public static final a2 e(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return new c2(r0Var);
    }

    public static final boolean f(@k r0 r0Var, @k x00.l<? super k2, Boolean> predicate) {
        g0.p(r0Var, "<this>");
        g0.p(predicate, "predicate");
        return h2.c(r0Var, predicate);
    }

    public static final boolean g(r0 r0Var, u1 u1Var, Set<? extends p10.c1> set) {
        boolean g11;
        if (g0.g(r0Var.I0(), u1Var)) {
            return true;
        }
        p10.d r11 = r0Var.I0().r();
        p10.e eVar = r11 instanceof p10.e ? (p10.e) r11 : null;
        List<p10.c1> t11 = eVar != null ? eVar.t() : null;
        Iterable<a1> m62 = a00.r0.m6(r0Var.G0());
        if ((m62 instanceof Collection) && ((Collection) m62).isEmpty()) {
            return false;
        }
        for (a1 a1Var : m62) {
            int a11 = a1Var.a();
            a2 a2Var = (a2) a1Var.b();
            p10.c1 c1Var = t11 != null ? (p10.c1) a00.r0.b3(t11, a11) : null;
            if ((c1Var == null || set == null || !set.contains(c1Var)) && !a2Var.a()) {
                r0 type = a2Var.getType();
                g0.o(type, "getType(...)");
                g11 = g(type, u1Var, set);
            } else {
                g11 = false;
            }
            if (g11) {
                return true;
            }
        }
        return false;
    }

    public static final boolean h(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return f(r0Var, b.f63179a);
    }

    public static final boolean i(k2 it) {
        g0.p(it, "it");
        p10.d r11 = it.I0().r();
        if (r11 != null) {
            return y(r11);
        }
        return false;
    }

    public static final boolean j(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return h2.c(r0Var, a.f63178a);
    }

    public static final Boolean k(k2 k2Var) {
        return Boolean.valueOf(h2.m(k2Var));
    }

    @k
    public static final a2 l(@k r0 type, @k Variance projectionKind, @l p10.c1 c1Var) {
        g0.p(type, "type");
        g0.p(projectionKind, "projectionKind");
        if ((c1Var != null ? c1Var.j() : null) == projectionKind) {
            projectionKind = Variance.INVARIANT;
        }
        return new c2(projectionKind, type);
    }

    @k
    public static final Set<p10.c1> m(@k r0 r0Var, @l Set<? extends p10.c1> set) {
        g0.p(r0Var, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        n(r0Var, r0Var, linkedHashSet, set);
        return linkedHashSet;
    }

    public static final void n(r0 r0Var, r0 r0Var2, Set<p10.c1> set, Set<? extends p10.c1> set2) {
        p10.d r11 = r0Var.I0().r();
        if (r11 instanceof p10.c1) {
            if (!g0.g(r0Var.I0(), r0Var2.I0())) {
                set.add(r11);
                return;
            }
            for (r0 r0Var3 : ((p10.c1) r11).getUpperBounds()) {
                g0.m(r0Var3);
                n(r0Var3, r0Var2, set, set2);
            }
            return;
        }
        p10.d r12 = r0Var.I0().r();
        p10.e eVar = r12 instanceof p10.e ? (p10.e) r12 : null;
        List<p10.c1> t11 = eVar != null ? eVar.t() : null;
        int i11 = 0;
        for (a2 a2Var : r0Var.G0()) {
            int i12 = i11 + 1;
            p10.c1 c1Var = t11 != null ? (p10.c1) a00.r0.b3(t11, i11) : null;
            if ((c1Var == null || set2 == null || !set2.contains(c1Var)) && !a2Var.a() && !a00.r0.a2(set, a2Var.getType().I0().r()) && !g0.g(a2Var.getType().I0(), r0Var2.I0())) {
                r0 type = a2Var.getType();
                g0.o(type, "getType(...)");
                n(type, r0Var2, set, set2);
            }
            i11 = i12;
        }
    }

    @k
    public static final j o(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        j q11 = r0Var.I0().q();
        g0.o(q11, "getBuiltIns(...)");
        return q11;
    }

    @k
    public static final r0 p(@k p10.c1 c1Var) {
        Object obj;
        g0.p(c1Var, "<this>");
        List<r0> upperBounds = c1Var.getUpperBounds();
        g0.o(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List<r0> upperBounds2 = c1Var.getUpperBounds();
        g0.o(upperBounds2, "getUpperBounds(...)");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            p10.d r11 = ((r0) next).I0().r();
            p10.b bVar = r11 instanceof p10.b ? (p10.b) r11 : null;
            if (bVar != null && bVar.getKind() != ClassKind.INTERFACE && bVar.getKind() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        r0 r0Var = (r0) obj;
        if (r0Var != null) {
            return r0Var;
        }
        List<r0> upperBounds3 = c1Var.getUpperBounds();
        g0.o(upperBounds3, "getUpperBounds(...)");
        Object G2 = a00.r0.G2(upperBounds3);
        g0.o(G2, "first(...)");
        return (r0) G2;
    }

    @w00.k
    public static final boolean q(@k p10.c1 typeParameter) {
        g0.p(typeParameter, "typeParameter");
        return s(typeParameter, null, null, 6, null);
    }

    @w00.k
    public static final boolean r(@k p10.c1 typeParameter, @l u1 u1Var, @l Set<? extends p10.c1> set) {
        g0.p(typeParameter, "typeParameter");
        List<r0> upperBounds = typeParameter.getUpperBounds();
        g0.o(upperBounds, "getUpperBounds(...)");
        List<r0> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (r0 r0Var : list) {
            g0.m(r0Var);
            if (g(r0Var, typeParameter.s().I0(), set) && (u1Var == null || g0.g(r0Var.I0(), u1Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean s(p10.c1 c1Var, u1 u1Var, Set set, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            u1Var = null;
        }
        if ((i11 & 4) != 0) {
            set = null;
        }
        return r(c1Var, u1Var, set);
    }

    public static final boolean t(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return j.f0(r0Var);
    }

    public static final boolean u(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return j.n0(r0Var);
    }

    public static final boolean v(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        if (r0Var instanceof e30.d) {
            return true;
        }
        return (r0Var instanceof x) && (((x) r0Var).U0() instanceof e30.d);
    }

    public static final boolean w(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        if (r0Var instanceof l1) {
            return true;
        }
        return (r0Var instanceof x) && (((x) r0Var).U0() instanceof l1);
    }

    public static final boolean x(@k r0 r0Var, @k r0 superType) {
        g0.p(r0Var, "<this>");
        g0.p(superType, "superType");
        return f30.e.f50430a.a(r0Var, superType);
    }

    public static final boolean y(@k p10.d dVar) {
        g0.p(dVar, "<this>");
        return (dVar instanceof p10.c1) && (((p10.c1) dVar).b() instanceof b1);
    }

    public static final boolean z(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return h2.m(r0Var);
    }
}
