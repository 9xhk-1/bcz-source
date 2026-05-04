package k30;

import a00.i0;
import e30.a2;
import e30.c1;
import e30.c2;
import e30.e2;
import e30.f2;
import e30.h2;
import e30.j2;
import e30.k2;
import e30.l0;
import e30.r0;
import e30.u1;
import e30.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m80.k;
import m80.l;
import n10.j;
import p20.a;
import p20.u;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCapturedTypeApproximation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeApproximation.kt\norg/jetbrains/kotlin/types/typesApproximation/CapturedTypeApproximationKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1755#2,3:179\n1557#2:183\n1628#2,3:184\n1#3:182\n*S KotlinDebug\n*F\n+ 1 CapturedTypeApproximation.kt\norg/jetbrains/kotlin/types/typesApproximation/CapturedTypeApproximationKt\n*L\n158#1:179,3\n167#1:183\n167#1:184,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65738a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65738a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends v1 {
        @Override // e30.v1
        public a2 k(u1 key) {
            g0.p(key, "key");
            r20.b bVar = key instanceof r20.b ? (r20.b) key : null;
            if (bVar == null) {
                return null;
            }
            return bVar.b().a() ? new c2(Variance.OUT_VARIANCE, bVar.b().getType()) : bVar.b();
        }
    }

    @k
    public static final k30.a<r0> c(@k r0 type) {
        Object h11;
        g0.p(type, "type");
        if (l0.b(type)) {
            k30.a<r0> c11 = c(l0.c(type));
            k30.a<r0> c12 = c(l0.d(type));
            return new k30.a<>(j2.b(e30.u0.e(l0.c(c11.c()), l0.d(c12.c())), type), j2.b(e30.u0.e(l0.c(c11.d()), l0.d(c12.d())), type));
        }
        u1 I0 = type.I0();
        if (r20.e.f(type)) {
            g0.n(I0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            a2 b11 = ((r20.b) I0).b();
            r0 type2 = b11.getType();
            g0.o(type2, "getType(...)");
            r0 d11 = d(type2, type);
            int i11 = a.f65738a[b11.b().ordinal()];
            if (i11 == 2) {
                return new k30.a<>(d11, j30.e.o(type).I());
            }
            if (i11 == 3) {
                c1 H = j30.e.o(type).H();
                g0.o(H, "getNothingType(...)");
                return new k30.a<>(d(H, type), d11);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + b11);
        }
        if (type.G0().isEmpty() || type.G0().size() != I0.getParameters().size()) {
            return new k30.a<>(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<a2> G0 = type.G0();
        List<p10.c1> parameters = I0.getParameters();
        g0.o(parameters, "getParameters(...)");
        for (Pair pair : a00.r0.o6(G0, parameters)) {
            a2 a2Var = (a2) pair.component1();
            p10.c1 c1Var = (p10.c1) pair.component2();
            g0.m(c1Var);
            e j11 = j(a2Var, c1Var);
            if (a2Var.a()) {
                arrayList.add(j11);
                arrayList2.add(j11);
            } else {
                k30.a<e> g11 = g(j11);
                e a11 = g11.a();
                e b12 = g11.b();
                arrayList.add(a11);
                arrayList2.add(b12);
            }
        }
        boolean z11 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((e) it.next()).d()) {
                    z11 = true;
                    break;
                }
            }
        }
        if (z11) {
            h11 = j30.e.o(type).H();
            g0.o(h11, "getNothingType(...)");
        } else {
            h11 = h(type, arrayList);
        }
        return new k30.a<>(h11, h(type, arrayList2));
    }

    public static final r0 d(r0 r0Var, r0 r0Var2) {
        r0 q11 = h2.q(r0Var, r0Var2.J0());
        g0.o(q11, "makeNullableIfNeeded(...)");
        return q11;
    }

    @l
    public static final a2 e(@l a2 a2Var, boolean z11) {
        if (a2Var == null) {
            return null;
        }
        if (!a2Var.a()) {
            r0 type = a2Var.getType();
            g0.o(type, "getType(...)");
            if (h2.c(type, c.f65737a)) {
                Variance b11 = a2Var.b();
                g0.o(b11, "getProjectionKind(...)");
                return b11 == Variance.OUT_VARIANCE ? new c2(b11, c(type).d()) : z11 ? new c2(b11, c(type).c()) : i(a2Var);
            }
        }
        return a2Var;
    }

    public static final Boolean f(k2 k2Var) {
        g0.m(k2Var);
        return Boolean.valueOf(r20.e.f(k2Var));
    }

    public static final k30.a<e> g(e eVar) {
        k30.a<r0> c11 = c(eVar.a());
        r0 a11 = c11.a();
        r0 b11 = c11.b();
        k30.a<r0> c12 = c(eVar.b());
        return new k30.a<>(new e(eVar.c(), b11, c12.a()), new e(eVar.c(), a11, c12.b()));
    }

    public static final r0 h(r0 r0Var, List<e> list) {
        r0Var.G0().size();
        list.size();
        List<e> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(k((e) it.next()));
        }
        return e2.e(r0Var, arrayList, null, null, 6, null);
    }

    public static final a2 i(a2 a2Var) {
        f2 g11 = f2.g(new b());
        g0.o(g11, "create(...)");
        return g11.t(a2Var);
    }

    public static final e j(a2 a2Var, p10.c1 c1Var) {
        int i11 = a.f65738a[f2.c(c1Var.j(), a2Var).ordinal()];
        if (i11 == 1) {
            r0 type = a2Var.getType();
            g0.o(type, "getType(...)");
            r0 type2 = a2Var.getType();
            g0.o(type2, "getType(...)");
            return new e(c1Var, type, type2);
        }
        if (i11 == 2) {
            r0 type3 = a2Var.getType();
            g0.o(type3, "getType(...)");
            c1 I = u20.e.m(c1Var).I();
            g0.o(I, "getNullableAnyType(...)");
            return new e(c1Var, type3, I);
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        c1 H = u20.e.m(c1Var).H();
        g0.o(H, "getNothingType(...)");
        r0 type4 = a2Var.getType();
        g0.o(type4, "getType(...)");
        return new e(c1Var, H, type4);
    }

    public static final a2 k(e eVar) {
        eVar.d();
        if (!g0.g(eVar.a(), eVar.b())) {
            Variance j11 = eVar.c().j();
            Variance variance = Variance.IN_VARIANCE;
            if (j11 != variance) {
                return (!j.n0(eVar.a()) || eVar.c().j() == variance) ? j.p0(eVar.b()) ? new c2(m(eVar, variance), eVar.a()) : new c2(m(eVar, Variance.OUT_VARIANCE), eVar.b()) : new c2(m(eVar, Variance.OUT_VARIANCE), eVar.b());
            }
        }
        return new c2(eVar.a());
    }

    public static final g2 l(u withOptions) {
        g0.p(withOptions, "$this$withOptions");
        withOptions.s(a.C0969a.f78726a);
        return g2.f100423a;
    }

    public static final Variance m(e eVar, Variance variance) {
        return variance == eVar.c().j() ? Variance.INVARIANT : variance;
    }
}
