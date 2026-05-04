package d20;

import a00.i0;
import e30.a2;
import e30.c1;
import e30.c2;
import e30.d2;
import e30.f0;
import e30.l0;
import e30.r0;
import e30.r1;
import e30.u1;
import e30.v0;
import e30.z1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import m80.k;
import m80.l;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRawSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawSubstitution.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawSubstitution\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1557#2:96\n1628#2,3:97\n*S KotlinDebug\n*F\n+ 1 RawSubstitution.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawSubstitution\n*L\n73#1:96\n73#1:97,3\n*E\n"})
/* loaded from: classes8.dex */
public final class h extends d2 {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f47083e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final d20.a f47084f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final d20.a f47085g;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f47086c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final z1 f47087d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f47084f = b.b(typeUsage, false, true, null, 5, null).l(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f47085g = b.b(typeUsage, false, true, null, 5, null).l(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final c1 k(p10.b bVar, h hVar, c1 c1Var, d20.a aVar, f30.g kotlinTypeRefiner) {
        p10.b b11;
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        n20.b n11 = u20.e.n(bVar);
        if (n11 == null || (b11 = kotlinTypeRefiner.b(n11)) == null || g0.g(b11, bVar)) {
            return null;
        }
        return hVar.j(c1Var, b11, aVar).getFirst();
    }

    public static /* synthetic */ r0 m(h hVar, r0 r0Var, d20.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = new d20.a(TypeUsage.COMMON, null, false, false, null, null, 62, null);
        }
        return hVar.l(r0Var, aVar);
    }

    @Override // e30.d2
    public boolean f() {
        return false;
    }

    public final Pair<c1, Boolean> j(c1 c1Var, p10.b bVar, d20.a aVar) {
        if (c1Var.I0().getParameters().isEmpty()) {
            return h1.a(c1Var, Boolean.FALSE);
        }
        if (n10.j.c0(c1Var)) {
            a2 a2Var = c1Var.G0().get(0);
            Variance b11 = a2Var.b();
            r0 type = a2Var.getType();
            g0.o(type, "getType(...)");
            return h1.a(e30.u0.m(c1Var.H0(), c1Var.I0(), a00.g0.l(new c2(b11, l(type, aVar))), c1Var.J0(), null, 16, null), Boolean.FALSE);
        }
        if (v0.a(c1Var)) {
            return h1.a(g30.i.d(ErrorTypeKind.ERROR_RAW_TYPE, c1Var.I0().toString()), Boolean.FALSE);
        }
        x20.k K = bVar.K(this);
        g0.o(K, "getMemberScope(...)");
        r1 H0 = c1Var.H0();
        u1 o11 = bVar.o();
        g0.o(o11, "getTypeConstructor(...)");
        List<p10.c1> parameters = bVar.o().getParameters();
        g0.o(parameters, "getParameters(...)");
        List<p10.c1> list = parameters;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (p10.c1 c1Var2 : list) {
            f fVar = this.f47086c;
            g0.m(c1Var2);
            arrayList.add(f0.b(fVar, c1Var2, aVar, this.f47087d, null, 8, null));
        }
        return h1.a(e30.u0.p(H0, o11, arrayList, c1Var.J0(), K, new g(bVar, this, c1Var, aVar)), Boolean.TRUE);
    }

    public final r0 l(r0 r0Var, d20.a aVar) {
        p10.d r11 = r0Var.I0().r();
        if (r11 instanceof p10.c1) {
            return l(this.f47087d.e((p10.c1) r11, aVar.j(true)), aVar);
        }
        if (!(r11 instanceof p10.b)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + r11).toString());
        }
        p10.d r12 = l0.d(r0Var).I0().r();
        if (r12 instanceof p10.b) {
            Pair<c1, Boolean> j11 = j(l0.c(r0Var), (p10.b) r11, f47084f);
            c1 component1 = j11.component1();
            boolean booleanValue = j11.component2().booleanValue();
            Pair<c1, Boolean> j12 = j(l0.d(r0Var), (p10.b) r12, f47085g);
            c1 component12 = j12.component1();
            return (booleanValue || j12.component2().booleanValue()) ? new j(component1, component12) : e30.u0.e(component1, component12);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + r12 + "\" while for lower it's \"" + r11 + '\"').toString());
    }

    @Override // e30.d2
    @k
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public c2 e(@k r0 key) {
        g0.p(key, "key");
        return new c2(m(this, key, null, 2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@l z1 z1Var) {
        f fVar = new f();
        this.f47086c = fVar;
        if (z1Var == null) {
            z1Var = new z1(fVar, null, 2, 0 == true ? 1 : 0);
        }
        this.f47087d = z1Var;
    }

    public /* synthetic */ h(z1 z1Var, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : z1Var);
    }
}
