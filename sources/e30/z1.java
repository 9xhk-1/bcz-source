package e30;

import e30.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1187#2,2:159\n1261#2,4:161\n1557#2:166\n1628#2,3:167\n1#3:165\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n*L\n77#1:159,2\n77#1:161,4\n100#1:166\n100#1:167,3\n*E\n"})
/* loaded from: classes8.dex */
public final class z1 {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f48691f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f0 f48692a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final w1 f48693b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d30.f f48694c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final yz.c0 f48695d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final d30.g<b, r0> f48696e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n+ 2 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n245#2,14:159\n260#2:177\n1557#3:173\n1628#3,3:174\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n*L\n140#1:159,14\n140#1:177\n140#1:173\n140#1:174,3\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final r0 a(@m80.k r0 r0Var, @m80.k f2 substitutor, @m80.l Set<? extends p10.c1> set, boolean z11) {
            k2 k2Var;
            r0 type;
            r0 type2;
            r0 type3;
            kotlin.jvm.internal.g0.p(r0Var, "<this>");
            kotlin.jvm.internal.g0.p(substitutor, "substitutor");
            k2 L0 = r0Var.L0();
            if (L0 instanceof i0) {
                i0 i0Var = (i0) L0;
                c1 Q0 = i0Var.Q0();
                if (!Q0.I0().getParameters().isEmpty() && Q0.I0().r() != null) {
                    List<p10.c1> parameters = Q0.I0().getParameters();
                    kotlin.jvm.internal.g0.o(parameters, "getParameters(...)");
                    List<p10.c1> list = parameters;
                    ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
                    for (p10.c1 c1Var : list) {
                        a2 a2Var = (a2) a00.r0.b3(r0Var.G0(), c1Var.getIndex());
                        if (!z11 || a2Var == null || (type3 = a2Var.getType()) == null || j30.e.j(type3)) {
                            boolean z12 = set != null && set.contains(c1Var);
                            if (a2Var != null && !z12) {
                                d2 j11 = substitutor.j();
                                r0 type4 = a2Var.getType();
                                kotlin.jvm.internal.g0.o(type4, "getType(...)");
                                if (j11.e(type4) != null) {
                                }
                            }
                            a2Var = new j1(c1Var);
                        }
                        arrayList.add(a2Var);
                    }
                    Q0 = e2.f(Q0, arrayList, null, 2, null);
                }
                c1 R0 = i0Var.R0();
                if (!R0.I0().getParameters().isEmpty() && R0.I0().r() != null) {
                    List<p10.c1> parameters2 = R0.I0().getParameters();
                    kotlin.jvm.internal.g0.o(parameters2, "getParameters(...)");
                    List<p10.c1> list2 = parameters2;
                    ArrayList arrayList2 = new ArrayList(a00.i0.d0(list2, 10));
                    for (p10.c1 c1Var2 : list2) {
                        a2 a2Var2 = (a2) a00.r0.b3(r0Var.G0(), c1Var2.getIndex());
                        if (!z11 || a2Var2 == null || (type2 = a2Var2.getType()) == null || j30.e.j(type2)) {
                            boolean z13 = set != null && set.contains(c1Var2);
                            if (a2Var2 != null && !z13) {
                                d2 j12 = substitutor.j();
                                r0 type5 = a2Var2.getType();
                                kotlin.jvm.internal.g0.o(type5, "getType(...)");
                                if (j12.e(type5) != null) {
                                }
                            }
                            a2Var2 = new j1(c1Var2);
                        }
                        arrayList2.add(a2Var2);
                    }
                    R0 = e2.f(R0, arrayList2, null, 2, null);
                }
                k2Var = u0.e(Q0, R0);
            } else {
                if (!(L0 instanceof c1)) {
                    throw new NoWhenBranchMatchedException();
                }
                c1 c1Var3 = (c1) L0;
                if (c1Var3.I0().getParameters().isEmpty() || c1Var3.I0().r() == null) {
                    k2Var = c1Var3;
                } else {
                    List<p10.c1> parameters3 = c1Var3.I0().getParameters();
                    kotlin.jvm.internal.g0.o(parameters3, "getParameters(...)");
                    List<p10.c1> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(a00.i0.d0(list3, 10));
                    for (p10.c1 c1Var4 : list3) {
                        a2 a2Var3 = (a2) a00.r0.b3(r0Var.G0(), c1Var4.getIndex());
                        if (!z11 || a2Var3 == null || (type = a2Var3.getType()) == null || j30.e.j(type)) {
                            boolean z14 = set != null && set.contains(c1Var4);
                            if (a2Var3 != null && !z14) {
                                d2 j13 = substitutor.j();
                                r0 type6 = a2Var3.getType();
                                kotlin.jvm.internal.g0.o(type6, "getType(...)");
                                if (j13.e(type6) != null) {
                                }
                            }
                            a2Var3 = new j1(c1Var4);
                        }
                        arrayList3.add(a2Var3);
                    }
                    k2Var = e2.f(c1Var3, arrayList3, null, 2, null);
                }
            }
            r0 n11 = substitutor.n(j2.b(k2Var, L0), Variance.OUT_VARIANCE);
            kotlin.jvm.internal.g0.o(n11, "safeSubstitute(...)");
            return n11;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final p10.c1 f48697a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g0 f48698b;

        public b(@m80.k p10.c1 typeParameter, @m80.k g0 typeAttr) {
            kotlin.jvm.internal.g0.p(typeParameter, "typeParameter");
            kotlin.jvm.internal.g0.p(typeAttr, "typeAttr");
            this.f48697a = typeParameter;
            this.f48698b = typeAttr;
        }

        @m80.k
        public final g0 a() {
            return this.f48698b;
        }

        @m80.k
        public final p10.c1 b() {
            return this.f48697a;
        }

        public boolean equals(@m80.l Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(bVar.f48697a, this.f48697a) && kotlin.jvm.internal.g0.g(bVar.f48698b, this.f48698b);
        }

        public int hashCode() {
            int hashCode = this.f48697a.hashCode();
            return hashCode + (hashCode * 31) + this.f48698b.hashCode();
        }

        @m80.k
        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f48697a + ", typeAttr=" + this.f48698b + ')';
        }
    }

    public z1(@m80.k f0 projectionComputer, @m80.k w1 options) {
        kotlin.jvm.internal.g0.p(projectionComputer, "projectionComputer");
        kotlin.jvm.internal.g0.p(options, "options");
        this.f48692a = projectionComputer;
        this.f48693b = options;
        d30.f fVar = new d30.f("Type parameter upper bound erasure results");
        this.f48694c = fVar;
        this.f48695d = yz.e0.c(new x1(this));
        d30.g<b, r0> b11 = fVar.b(new y1(this));
        kotlin.jvm.internal.g0.o(b11, "createMemoizedFunction(...)");
        this.f48696e = b11;
    }

    public static final g30.g c(z1 z1Var) {
        return g30.i.d(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, z1Var.toString());
    }

    public static final r0 f(z1 z1Var, b bVar) {
        return z1Var.g(bVar.b(), bVar.a());
    }

    public final r0 d(g0 g0Var) {
        r0 E;
        c1 a11 = g0Var.a();
        return (a11 == null || (E = j30.e.E(a11)) == null) ? h() : E;
    }

    @m80.k
    public final r0 e(@m80.k p10.c1 typeParameter, @m80.k g0 typeAttr) {
        kotlin.jvm.internal.g0.p(typeParameter, "typeParameter");
        kotlin.jvm.internal.g0.p(typeAttr, "typeAttr");
        r0 invoke = this.f48696e.invoke(new b(typeParameter, typeAttr));
        kotlin.jvm.internal.g0.o(invoke, "invoke(...)");
        return invoke;
    }

    public final r0 g(p10.c1 c1Var, g0 g0Var) {
        a2 a11;
        Set<p10.c1> c11 = g0Var.c();
        if (c11 != null && c11.contains(c1Var.a())) {
            return d(g0Var);
        }
        c1 s11 = c1Var.s();
        kotlin.jvm.internal.g0.o(s11, "getDefaultType(...)");
        Set<p10.c1> m11 = j30.e.m(s11, c11);
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(a00.k1.j(a00.i0.d0(m11, 10)), 16));
        for (p10.c1 c1Var2 : m11) {
            if (c11 == null || !c11.contains(c1Var2)) {
                a11 = this.f48692a.a(c1Var2, g0Var, this, e(c1Var2, g0Var.d(c1Var)));
            } else {
                a11 = h2.t(c1Var2, g0Var);
                kotlin.jvm.internal.g0.o(a11, "makeStarProjection(...)");
            }
            Pair a12 = yz.h1.a(c1Var2.o(), a11);
            linkedHashMap.put(a12.getFirst(), a12.getSecond());
        }
        f2 g11 = f2.g(v1.a.e(v1.f48674c, linkedHashMap, false, 2, null));
        kotlin.jvm.internal.g0.o(g11, "create(...)");
        List<r0> upperBounds = c1Var.getUpperBounds();
        kotlin.jvm.internal.g0.o(upperBounds, "getUpperBounds(...)");
        Set<r0> i11 = i(g11, upperBounds, g0Var);
        if (i11.isEmpty()) {
            return d(g0Var);
        }
        if (!this.f48693b.a()) {
            if (i11.size() == 1) {
                return (r0) a00.r0.k5(i11);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List a62 = a00.r0.a6(i11);
        ArrayList arrayList = new ArrayList(a00.i0.d0(a62, 10));
        Iterator it = a62.iterator();
        while (it.hasNext()) {
            arrayList.add(((r0) it.next()).L0());
        }
        return f30.d.a(arrayList);
    }

    public final g30.g h() {
        return (g30.g) this.f48695d.getValue();
    }

    public final Set<r0> i(f2 f2Var, List<? extends r0> list, g0 g0Var) {
        Set d11 = a00.v1.d();
        for (r0 r0Var : list) {
            p10.d r11 = r0Var.I0().r();
            if (r11 instanceof p10.b) {
                d11.add(f48691f.a(r0Var, f2Var, g0Var.c(), this.f48693b.b()));
            } else if (r11 instanceof p10.c1) {
                Set<p10.c1> c11 = g0Var.c();
                if (c11 == null || !c11.contains(r11)) {
                    List<r0> upperBounds = ((p10.c1) r11).getUpperBounds();
                    kotlin.jvm.internal.g0.o(upperBounds, "getUpperBounds(...)");
                    d11.addAll(i(f2Var, upperBounds, g0Var));
                } else {
                    d11.add(d(g0Var));
                }
            }
            if (!this.f48693b.a()) {
                break;
            }
        }
        return a00.v1.a(d11);
    }

    public /* synthetic */ z1(f0 f0Var, w1 w1Var, int i11, kotlin.jvm.internal.v vVar) {
        this(f0Var, (i11 & 2) != 0 ? new w1(false, false) : w1Var);
    }
}
