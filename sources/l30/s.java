package l30;

import a00.h0;
import a00.r0;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l30.a0;
import l30.k;
import l30.v;
import p10.b1;
import p10.j1;
import p10.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 modifierChecks.kt\norg/jetbrains/kotlin/util/AbstractModifierChecks\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,264:1\n1#2:265\n171#3:266\n171#3:270\n171#3:271\n1755#4,3:267\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks\n*L\n189#1:266\n203#1:270\n220#1:271\n203#1:267,3\n*E\n"})
/* loaded from: classes8.dex */
public final class s extends b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final s f69800a = new s();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final List<h> f69801b;

    static {
        n20.f fVar = t.f69822k;
        k.b bVar = k.b.f69789b;
        h hVar = new h(fVar, new f[]{bVar, new a0.a(1)}, (x00.l) null, 4, (kotlin.jvm.internal.v) null);
        h hVar2 = new h(t.f69823l, new f[]{bVar, new a0.a(2)}, p.f69797a);
        n20.f fVar2 = t.f69804b;
        m mVar = m.f69791a;
        a0.a aVar = new a0.a(2);
        j jVar = j.f69785a;
        h hVar3 = new h(fVar2, new f[]{bVar, mVar, aVar, jVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null);
        h hVar4 = new h(t.f69806c, new f[]{bVar, mVar, new a0.a(3), jVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null);
        h hVar5 = new h(t.f69808d, new f[]{bVar, mVar, new a0.b(2), jVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null);
        h hVar6 = new h(t.f69818i, new f[]{bVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null);
        n20.f fVar3 = t.f69816h;
        a0.d dVar = a0.d.f69765b;
        v.a aVar2 = v.a.f69842d;
        h hVar7 = new h(fVar3, new f[]{bVar, dVar, mVar, aVar2}, (x00.l) null, 4, (kotlin.jvm.internal.v) null);
        n20.f fVar4 = t.f69820j;
        a0.c cVar = a0.c.f69764b;
        f69801b = h0.Q(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, new h(fVar4, new f[]{bVar, cVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null), new h(t.f69824m, new f[]{bVar, cVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null), new h(t.f69825n, new f[]{bVar, cVar, aVar2}, (x00.l) null, 4, (kotlin.jvm.internal.v) null), new h(t.I, new f[]{bVar, dVar, mVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null), new h(t.J, new f[]{bVar, dVar, mVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null), new h(t.f69810e, new f[]{k.a.f69788b}, q.f69798a), new h(t.f69814g, new f[]{bVar, v.b.f69843d, dVar, mVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null), new h(t.Z, new f[]{bVar, dVar, mVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null), new h(t.Y, new f[]{bVar, cVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null), new h(h0.Q(t.f69835x, t.f69836y), new f[]{bVar}, r.f69799a), new h(t.f69811e0, new f[]{bVar, v.c.f69844d, dVar, mVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null), new h(t.f69827p, new f[]{bVar, cVar}, (x00.l) null, 4, (kotlin.jvm.internal.v) null));
    }

    public static final String f(kotlin.reflect.jvm.internal.impl.descriptors.e Checks) {
        g0.p(Checks, "$this$Checks");
        List<j1> g11 = Checks.g();
        g0.o(g11, "getValueParameters(...)");
        j1 j1Var = (j1) r0.A3(g11);
        boolean z11 = false;
        if (j1Var != null && !u20.e.f(j1Var) && j1Var.y0() == null) {
            z11 = true;
        }
        if (z11) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String g(kotlin.reflect.jvm.internal.impl.descriptors.e r3) {
        /*
            java.lang.String r0 = "$this$Checks"
            kotlin.jvm.internal.g0.p(r3, r0)
            p10.h r0 = r3.b()
            java.lang.String r1 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r0 = h(r0)
            if (r0 != 0) goto L50
            java.util.Collection r0 = r3.e()
            java.lang.String r2 = "getOverriddenDescriptors(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L29
            goto L47
        L29:
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r2
            p10.h r2 = r2.b()
            kotlin.jvm.internal.g0.o(r2, r1)
            boolean r2 = h(r2)
            if (r2 == 0) goto L2d
            goto L50
        L47:
            boolean r0 = p10.n.c(r3)
            if (r0 == 0) goto L4e
            goto L50
        L4e:
            r0 = 0
            goto L51
        L50:
            r0 = 1
        L51:
            if (r0 != 0) goto Lab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "must override ''equals()'' in Any"
            r0.append(r2)
            p10.h r2 = r3.b()
            kotlin.jvm.internal.g0.o(r2, r1)
            boolean r1 = q20.i.g(r2)
            if (r1 == 0) goto La1
            p20.m r1 = p20.m.f78749j
            p10.h r3 = r3.b()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.g0.n(r3, r2)
            p10.b r3 = (p10.b) r3
            e30.c1 r3 = r3.s()
            java.lang.String r2 = "getDefaultType(...)"
            kotlin.jvm.internal.g0.o(r3, r2)
            e30.r0 r3 = j30.e.E(r3)
            java.lang.String r3 = r1.W(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " or define ''equals(other: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "): Boolean''"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
        La1:
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            return r3
        Lab:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l30.s.g(kotlin.reflect.jvm.internal.impl.descriptors.e):java.lang.String");
    }

    public static final boolean h(p10.h hVar) {
        return (hVar instanceof p10.b) && n10.j.a0((p10.b) hVar);
    }

    public static final String i(kotlin.reflect.jvm.internal.impl.descriptors.e Checks) {
        boolean z11;
        g0.p(Checks, "$this$Checks");
        t0 d02 = Checks.d0();
        if (d02 == null) {
            d02 = Checks.f0();
        }
        s sVar = f69800a;
        boolean z12 = false;
        if (d02 != null) {
            e30.r0 returnType = Checks.getReturnType();
            if (returnType != null) {
                e30.r0 type = d02.getType();
                g0.o(type, "getType(...)");
                z11 = j30.e.x(returnType, type);
            } else {
                z11 = false;
            }
            if (z11 || sVar.j(Checks, d02)) {
                z12 = true;
            }
        }
        if (z12) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }

    @Override // l30.b
    @m80.k
    public List<h> b() {
        return f69801b;
    }

    public final boolean j(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, t0 t0Var) {
        n20.b n11;
        e30.r0 returnType;
        y20.h value = t0Var.getValue();
        g0.o(value, "getValue(...)");
        if (!(value instanceof y20.e)) {
            return false;
        }
        p10.b l11 = ((y20.e) value).l();
        if (!l11.q0() || (n11 = u20.e.n(l11)) == null) {
            return false;
        }
        p10.d c11 = p10.t.c(u20.e.s(l11), n11);
        b1 b1Var = c11 instanceof b1 ? (b1) c11 : null;
        if (b1Var == null || (returnType = eVar.getReturnType()) == null) {
            return false;
        }
        return j30.e.x(returnType, b1Var.a0());
    }
}
