package e30;

import e30.o1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTypeAliasExpander.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n1#2:279\n1628#3,3:280\n1567#3:283\n1598#3,4:284\n1567#3:288\n1598#3,4:289\n1872#3,3:293\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n*L\n148#1:280,3\n197#1:283\n197#1:284,4\n232#1:288\n232#1:289,4\n249#1:293,3\n*E\n"})
/* loaded from: classes8.dex */
public final class m1 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f48624c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final m1 f48625d = new m1(o1.a.f48644a, false);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o1 f48626a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48627b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final void b(int i11, p10.b1 b1Var) {
            if (i11 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + b1Var.getName());
        }

        public a() {
        }
    }

    public m1(@m80.k o1 reportStrategy, boolean z11) {
        kotlin.jvm.internal.g0.p(reportStrategy, "reportStrategy");
        this.f48626a = reportStrategy;
        this.f48627b = z11;
    }

    public final void a(q10.g gVar, q10.g gVar2) {
        HashSet hashSet = new HashSet();
        Iterator<q10.c> it = gVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().d());
        }
        for (q10.c cVar : gVar2) {
            if (hashSet.contains(cVar.d())) {
                this.f48626a.d(cVar);
            }
        }
    }

    public final void b(r0 r0Var, r0 r0Var2) {
        f2 f11 = f2.f(r0Var2);
        kotlin.jvm.internal.g0.o(f11, "create(...)");
        int i11 = 0;
        for (Object obj : r0Var2.G0()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            a2 a2Var = (a2) obj;
            if (!a2Var.a()) {
                r0 type = a2Var.getType();
                kotlin.jvm.internal.g0.o(type, "getType(...)");
                if (!j30.e.h(type)) {
                    a2 a2Var2 = r0Var.G0().get(i11);
                    p10.c1 c1Var = r0Var.I0().getParameters().get(i11);
                    if (this.f48627b) {
                        o1 o1Var = this.f48626a;
                        r0 type2 = a2Var2.getType();
                        kotlin.jvm.internal.g0.o(type2, "getType(...)");
                        r0 type3 = a2Var.getType();
                        kotlin.jvm.internal.g0.o(type3, "getType(...)");
                        kotlin.jvm.internal.g0.m(c1Var);
                        o1Var.a(f11, type2, type3, c1Var);
                    }
                }
            }
            i11 = i12;
        }
    }

    public final d0 c(d0 d0Var, r1 r1Var) {
        return d0Var.O0(h(d0Var, r1Var));
    }

    public final c1 d(c1 c1Var, r1 r1Var) {
        return v0.a(c1Var) ? c1Var : e2.f(c1Var, null, h(c1Var, r1Var), 1, null);
    }

    public final c1 e(c1 c1Var, r0 r0Var) {
        c1 r11 = h2.r(c1Var, r0Var.J0());
        kotlin.jvm.internal.g0.o(r11, "makeNullableIfNeeded(...)");
        return r11;
    }

    public final c1 f(c1 c1Var, r0 r0Var) {
        return d(e(c1Var, r0Var), r0Var.H0());
    }

    public final c1 g(n1 n1Var, r1 r1Var, boolean z11) {
        u1 o11 = n1Var.b().o();
        kotlin.jvm.internal.g0.o(o11, "getTypeConstructor(...)");
        return u0.o(r1Var, o11, n1Var.a(), z11, k.c.f97119b);
    }

    public final r1 h(r0 r0Var, r1 r1Var) {
        return v0.a(r0Var) ? r0Var.H0() : r1Var.h(r0Var.H0());
    }

    @m80.k
    public final c1 i(@m80.k n1 typeAliasExpansion, @m80.k r1 attributes) {
        kotlin.jvm.internal.g0.p(typeAliasExpansion, "typeAliasExpansion");
        kotlin.jvm.internal.g0.p(attributes, "attributes");
        return k(typeAliasExpansion, attributes, false, 0, true);
    }

    public final a2 j(a2 a2Var, n1 n1Var, int i11) {
        k2 L0 = a2Var.getType().L0();
        if (!e0.a(L0)) {
            c1 a11 = e2.a(L0);
            if (!v0.a(a11) && j30.e.F(a11)) {
                u1 I0 = a11.I0();
                p10.d r11 = I0.r();
                I0.getParameters().size();
                a11.G0().size();
                if (!(r11 instanceof p10.c1)) {
                    if (!(r11 instanceof p10.b1)) {
                        c1 m11 = m(a11, n1Var, i11);
                        b(a11, m11);
                        return new c2(a2Var.b(), m11);
                    }
                    p10.b1 b1Var = (p10.b1) r11;
                    if (n1Var.d(b1Var)) {
                        this.f48626a.b(b1Var);
                        return new c2(Variance.INVARIANT, g30.i.d(ErrorTypeKind.RECURSIVE_TYPE_ALIAS, b1Var.getName().toString()));
                    }
                    List<a2> G0 = a11.G0();
                    ArrayList arrayList = new ArrayList(a00.i0.d0(G0, 10));
                    int i12 = 0;
                    for (Object obj : G0) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            a00.h0.b0();
                        }
                        arrayList.add(l((a2) obj, n1Var, I0.getParameters().get(i12), i11 + 1));
                        i12 = i13;
                    }
                    c1 k11 = k(n1.f48631e.a(n1Var, b1Var, arrayList), a11.H0(), a11.J0(), i11 + 1, false);
                    c1 m12 = m(a11, n1Var, i11);
                    if (!e0.a(k11)) {
                        k11 = g1.j(k11, m12);
                    }
                    return new c2(a2Var.b(), k11);
                }
            }
        }
        return a2Var;
    }

    public final c1 k(n1 n1Var, r1 r1Var, boolean z11, int i11, boolean z12) {
        a2 l11 = l(new c2(Variance.INVARIANT, n1Var.b().x0()), n1Var, null, i11);
        r0 type = l11.getType();
        kotlin.jvm.internal.g0.o(type, "getType(...)");
        c1 a11 = e2.a(type);
        if (v0.a(a11)) {
            return a11;
        }
        l11.b();
        a(a11.getAnnotations(), s.a(r1Var));
        c1 r11 = h2.r(d(a11, r1Var), z11);
        kotlin.jvm.internal.g0.o(r11, "let(...)");
        return z12 ? g1.j(r11, g(n1Var, r1Var, z11)) : r11;
    }

    public final a2 l(a2 a2Var, n1 n1Var, p10.c1 c1Var, int i11) {
        Variance variance;
        Variance variance2;
        Variance variance3;
        f48624c.b(i11, n1Var.b());
        if (a2Var.a()) {
            kotlin.jvm.internal.g0.m(c1Var);
            a2 s11 = h2.s(c1Var);
            kotlin.jvm.internal.g0.o(s11, "makeStarProjection(...)");
            return s11;
        }
        r0 type = a2Var.getType();
        kotlin.jvm.internal.g0.o(type, "getType(...)");
        a2 c11 = n1Var.c(type.I0());
        if (c11 == null) {
            return j(a2Var, n1Var, i11);
        }
        if (c11.a()) {
            kotlin.jvm.internal.g0.m(c1Var);
            a2 s12 = h2.s(c1Var);
            kotlin.jvm.internal.g0.o(s12, "makeStarProjection(...)");
            return s12;
        }
        k2 L0 = c11.getType().L0();
        Variance b11 = c11.b();
        kotlin.jvm.internal.g0.o(b11, "getProjectionKind(...)");
        Variance b12 = a2Var.b();
        kotlin.jvm.internal.g0.o(b12, "getProjectionKind(...)");
        if (b12 != b11 && b12 != (variance3 = Variance.INVARIANT)) {
            if (b11 == variance3) {
                b11 = b12;
            } else {
                this.f48626a.c(n1Var.b(), c1Var, L0);
            }
        }
        if (c1Var == null || (variance = c1Var.j()) == null) {
            variance = Variance.INVARIANT;
        }
        if (variance != b11 && variance != (variance2 = Variance.INVARIANT)) {
            if (b11 == variance2) {
                b11 = variance2;
            } else {
                this.f48626a.c(n1Var.b(), c1Var, L0);
            }
        }
        a(type.getAnnotations(), L0.getAnnotations());
        return new c2(b11, L0 instanceof d0 ? c((d0) L0, type.H0()) : f(e2.a(L0), type));
    }

    public final c1 m(c1 c1Var, n1 n1Var, int i11) {
        u1 I0 = c1Var.I0();
        List<a2> G0 = c1Var.G0();
        ArrayList arrayList = new ArrayList(a00.i0.d0(G0, 10));
        int i12 = 0;
        for (Object obj : G0) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                a00.h0.b0();
            }
            a2 a2Var = (a2) obj;
            a2 l11 = l(a2Var, n1Var, I0.getParameters().get(i12), i11 + 1);
            if (!l11.a()) {
                l11 = new c2(l11.b(), h2.q(l11.getType(), a2Var.getType().J0()));
            }
            arrayList.add(l11);
            i12 = i13;
        }
        return e2.f(c1Var, arrayList, null, 2, null);
    }
}
