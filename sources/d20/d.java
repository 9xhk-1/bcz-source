package d20;

import a00.i0;
import b20.p;
import e30.a2;
import e30.c2;
import e30.h2;
import e30.r0;
import e30.r1;
import e30.s1;
import e30.u1;
import e30.x0;
import e30.z1;
import f20.a0;
import f20.c0;
import f20.v;
import f20.x;
import f20.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import m80.k;
import m80.l;
import p10.c1;
import q10.n;
import y10.n0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJavaTypeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTypeResolver.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1#2:322\n19#3:323\n1557#4:324\n1628#4,3:325\n1557#4:328\n1628#4,3:329\n1557#4:332\n1628#4,3:333\n*S KotlinDebug\n*F\n+ 1 JavaTypeResolver.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeResolver\n*L\n144#1:323\n205#1:324\n205#1:325,3\n263#1:328\n263#1:329,3\n267#1:332\n267#1:333,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b20.k f47073a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f47074b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f47075c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final z1 f47076d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k b20.k c11, @k p typeParameterResolver) {
        g0.p(c11, "c");
        g0.p(typeParameterResolver, "typeParameterResolver");
        this.f47073a = c11;
        this.f47074b = typeParameterResolver;
        f fVar = new f();
        this.f47075c = fVar;
        this.f47076d = new z1(fVar, null, 2, 0 == true ? 1 : 0);
    }

    public static final r0 e(d dVar, c1 c1Var, a aVar, u1 u1Var, f20.j jVar) {
        z1 z1Var = dVar.f47076d;
        p10.d r11 = u1Var.r();
        return z1Var.e(c1Var, aVar.k(r11 != null ? r11.s() : null).j(jVar.I()));
    }

    public static /* synthetic */ r0 m(d dVar, f20.f fVar, a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return dVar.l(fVar, aVar, z11);
    }

    public static final g30.g o(f20.j jVar) {
        return g30.i.d(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, jVar.y());
    }

    public final boolean b(f20.j jVar, p10.b bVar) {
        Variance j11;
        if (!a0.a((x) a00.r0.A3(jVar.t()))) {
            return false;
        }
        List<c1> parameters = o10.b.f75542a.b(bVar).o().getParameters();
        g0.o(parameters, "getParameters(...)");
        c1 c1Var = (c1) a00.r0.A3(parameters);
        return (c1Var == null || (j11 = c1Var.j()) == null || j11 == Variance.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r0.isEmpty() == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<e30.a2> c(f20.j r10, d20.a r11, e30.u1 r12) {
        /*
            r9 = this;
            boolean r0 = r10.I()
            java.lang.String r1 = "getParameters(...)"
            if (r0 != 0) goto L24
            java.util.List r0 = r10.t()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.List r0 = r12.getParameters()
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            goto L24
        L22:
            r0 = 0
            goto L25
        L24:
            r0 = 1
        L25:
            java.util.List r2 = r12.getParameters()
            kotlin.jvm.internal.g0.o(r2, r1)
            if (r0 == 0) goto L33
            java.util.List r10 = r9.d(r10, r2, r12, r11)
            return r10
        L33:
            int r11 = r2.size()
            java.util.List r12 = r10.t()
            int r12 = r12.size()
            r0 = 10
            if (r11 == r12) goto L7e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = a00.i0.d0(r2, r0)
            r10.<init>(r11)
            java.util.Iterator r11 = r2.iterator()
        L52:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L79
            java.lang.Object r12 = r11.next()
            p10.c1 r12 = (p10.c1) r12
            e30.c2 r0 = new e30.c2
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            n20.f r12 = r12.getName()
            java.lang.String r12 = r12.b()
            java.lang.String[] r12 = new java.lang.String[]{r12}
            g30.g r12 = g30.i.d(r1, r12)
            r0.<init>(r12)
            r10.add(r0)
            goto L52
        L79:
            java.util.List r10 = a00.r0.a6(r10)
            return r10
        L7e:
            java.util.List r10 = r10.t()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Iterable r10 = a00.r0.m6(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = a00.i0.d0(r10, r0)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L95:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lca
            java.lang.Object r12 = r10.next()
            a00.a1 r12 = (a00.a1) r12
            int r0 = r12.a()
            java.lang.Object r12 = r12.b()
            f20.x r12 = (f20.x) r12
            r2.size()
            java.lang.Object r0 = r2.get(r0)
            p10.c1 r0 = (p10.c1) r0
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r3 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r7 = 7
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            d20.a r1 = d20.b.b(r3, r4, r5, r6, r7, r8)
            kotlin.jvm.internal.g0.m(r0)
            e30.a2 r12 = r9.q(r12, r1, r0)
            r11.add(r12)
            goto L95
        Lca:
            java.util.List r10 = a00.r0.a6(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d20.d.c(f20.j, d20.a, e30.u1):java.util.List");
    }

    public final List<a2> d(f20.j jVar, List<? extends c1> list, u1 u1Var, a aVar) {
        f20.j jVar2;
        u1 u1Var2;
        a aVar2;
        a2 a11;
        List<? extends c1> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        for (c1 c1Var : list2) {
            if (j30.e.r(c1Var, null, aVar.c())) {
                a11 = h2.t(c1Var, aVar);
                jVar2 = jVar;
                u1Var2 = u1Var;
                aVar2 = aVar;
            } else {
                jVar2 = jVar;
                u1Var2 = u1Var;
                aVar2 = aVar;
                a11 = this.f47075c.a(c1Var, aVar2.j(jVar2.I()), this.f47076d, new x0(this.f47073a.e(), new c(this, c1Var, aVar2, u1Var2, jVar2)));
            }
            arrayList.add(a11);
            aVar = aVar2;
            u1Var = u1Var2;
            jVar = jVar2;
        }
        return arrayList;
    }

    public final e30.c1 f(f20.j jVar, a aVar, e30.c1 c1Var) {
        f20.j jVar2;
        r1 b11;
        if (c1Var == null || (b11 = c1Var.H0()) == null) {
            jVar2 = jVar;
            b11 = s1.b(new b20.g(this.f47073a, jVar2, false, 4, null));
        } else {
            jVar2 = jVar;
        }
        r1 r1Var = b11;
        u1 g11 = g(jVar2, aVar);
        if (g11 == null) {
            return null;
        }
        boolean j11 = j(aVar);
        return (g0.g(c1Var != null ? c1Var.I0() : null, g11) && !jVar2.I() && j11) ? c1Var.M0(true) : e30.u0.m(r1Var, g11, c(jVar2, aVar, g11), j11, null, 16, null);
    }

    public final u1 g(f20.j jVar, a aVar) {
        u1 o11;
        f20.i m11 = jVar.m();
        if (m11 == null) {
            return h(jVar);
        }
        if (!(m11 instanceof f20.g)) {
            if (m11 instanceof y) {
                c1 a11 = this.f47074b.a((y) m11);
                if (a11 != null) {
                    return a11.o();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + m11);
        }
        f20.g gVar = (f20.g) m11;
        n20.c d11 = gVar.d();
        if (d11 != null) {
            p10.b k11 = k(jVar, aVar, d11);
            if (k11 == null) {
                k11 = this.f47073a.a().n().a(gVar);
            }
            return (k11 == null || (o11 = k11.o()) == null) ? h(jVar) : o11;
        }
        throw new AssertionError("Class type should have a FQ name: " + m11);
    }

    public final u1 h(f20.j jVar) {
        u1 o11 = this.f47073a.a().b().f().r().d(n20.b.f74280d.c(new n20.c(jVar.A())), a00.g0.l(0)).o();
        g0.o(o11, "getTypeConstructor(...)");
        return o11;
    }

    public final boolean i(Variance variance, c1 c1Var) {
        return (c1Var.j() == Variance.INVARIANT || variance == c1Var.j()) ? false : true;
    }

    public final boolean j(a aVar) {
        return (aVar.g() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || aVar.h() || aVar.b() == TypeUsage.SUPERTYPE) ? false : true;
    }

    public final p10.b k(f20.j jVar, a aVar, n20.c cVar) {
        n20.c cVar2;
        if (aVar.h()) {
            cVar2 = e.f47077a;
            if (g0.g(cVar, cVar2)) {
                return this.f47073a.a().p().d();
            }
        }
        o10.b bVar = o10.b.f75542a;
        p10.b f11 = o10.b.f(bVar, cVar, this.f47073a.d().q(), null, 4, null);
        if (f11 == null) {
            return null;
        }
        return (bVar.d(f11) && (aVar.g() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || aVar.b() == TypeUsage.SUPERTYPE || b(jVar, f11))) ? bVar.b(f11) : f11;
    }

    @k
    public final r0 l(@k f20.f arrayType, @k a attr, boolean z11) {
        g0.p(arrayType, "arrayType");
        g0.p(attr, "attr");
        x o11 = arrayType.o();
        v vVar = o11 instanceof v ? (v) o11 : null;
        PrimitiveType type = vVar != null ? vVar.getType() : null;
        b20.g gVar = new b20.g(this.f47073a, arrayType, true);
        if (type != null) {
            e30.c1 O = this.f47073a.d().q().O(type);
            g0.m(O);
            r0 D = j30.e.D(O, new n(O.getAnnotations(), gVar));
            g0.n(D, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            e30.c1 c1Var = (e30.c1) D;
            return attr.h() ? c1Var : e30.u0.e(c1Var, c1Var.M0(true));
        }
        r0 p11 = p(o11, b.b(TypeUsage.COMMON, attr.h(), false, null, 6, null));
        if (attr.h()) {
            e30.c1 m11 = this.f47073a.d().q().m(z11 ? Variance.OUT_VARIANCE : Variance.INVARIANT, p11, gVar);
            g0.o(m11, "getArrayType(...)");
            return m11;
        }
        e30.c1 m12 = this.f47073a.d().q().m(Variance.INVARIANT, p11, gVar);
        g0.o(m12, "getArrayType(...)");
        return e30.u0.e(m12, this.f47073a.d().q().m(Variance.OUT_VARIANCE, p11, gVar).M0(true));
    }

    public final r0 n(f20.j jVar, a aVar) {
        boolean z11 = (aVar.h() || aVar.b() == TypeUsage.SUPERTYPE) ? false : true;
        boolean I = jVar.I();
        if (!I && !z11) {
            e30.c1 f11 = f(jVar, aVar, null);
            return f11 != null ? f11 : o(jVar);
        }
        e30.c1 f12 = f(jVar, aVar.l(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (f12 == null) {
            return o(jVar);
        }
        e30.c1 f13 = f(jVar, aVar.l(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), f12);
        return f13 == null ? o(jVar) : I ? new j(f12, f13) : e30.u0.e(f12, f13);
    }

    @k
    public final r0 p(@l x xVar, @k a attr) {
        r0 p11;
        g0.p(attr, "attr");
        if (xVar instanceof v) {
            PrimitiveType type = ((v) xVar).getType();
            e30.c1 R = type != null ? this.f47073a.d().q().R(type) : this.f47073a.d().q().Z();
            g0.m(R);
            return R;
        }
        if (xVar instanceof f20.j) {
            return n((f20.j) xVar, attr);
        }
        if (xVar instanceof f20.f) {
            return m(this, (f20.f) xVar, attr, false, 4, null);
        }
        if (xVar instanceof c0) {
            x s11 = ((c0) xVar).s();
            if (s11 != null && (p11 = p(s11, attr)) != null) {
                return p11;
            }
            e30.c1 y11 = this.f47073a.d().q().y();
            g0.o(y11, "getDefaultBound(...)");
            return y11;
        }
        if (xVar == null) {
            e30.c1 y12 = this.f47073a.d().q().y();
            g0.o(y12, "getDefaultBound(...)");
            return y12;
        }
        throw new UnsupportedOperationException("Unsupported type: " + xVar);
    }

    public final a2 q(x xVar, a aVar, c1 c1Var) {
        if (!(xVar instanceof c0)) {
            return new c2(Variance.INVARIANT, p(xVar, aVar));
        }
        c0 c0Var = (c0) xVar;
        x s11 = c0Var.s();
        Variance variance = c0Var.M() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
        if (s11 == null || i(variance, c1Var)) {
            a2 t11 = h2.t(c1Var, aVar);
            g0.o(t11, "makeStarProjection(...)");
            return t11;
        }
        q10.c a11 = n0.a(this.f47073a, c0Var);
        r0 p11 = p(s11, b.b(TypeUsage.COMMON, false, false, null, 7, null));
        if (a11 != null) {
            p11 = j30.e.D(p11, q10.g.A0.a(a00.r0.F4(p11.getAnnotations(), a11)));
        }
        return j30.e.l(p11, variance, c1Var);
    }
}
