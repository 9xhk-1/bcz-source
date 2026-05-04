package p10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\ndescriptorUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 descriptorUtil.kt\norg/jetbrains/kotlin/descriptors/DescriptorUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n*L\n1#1,115:1\n1#2:116\n19#3:117\n*S KotlinDebug\n*F\n+ 1 descriptorUtil.kt\norg/jetbrains/kotlin/descriptors/DescriptorUtilKt\n*L\n38#1:117\n*E\n"})
/* loaded from: classes8.dex */
public final class n {
    @m80.l
    public static final d a(@m80.k h hVar) {
        kotlin.jvm.internal.g0.p(hVar, "<this>");
        h b11 = hVar.b();
        if (b11 != null && !(hVar instanceof g0)) {
            if (!b(b11)) {
                return a(b11);
            }
            if (b11 instanceof d) {
                return (d) b11;
            }
        }
        return null;
    }

    public static final boolean b(@m80.k h hVar) {
        kotlin.jvm.internal.g0.p(hVar, "<this>");
        return hVar.b() instanceof g0;
    }

    public static final boolean c(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        e30.c1 s11;
        e30.r0 E;
        e30.r0 returnType;
        kotlin.jvm.internal.g0.p(eVar, "<this>");
        h b11 = eVar.b();
        b bVar = b11 instanceof b ? (b) b11 : null;
        if (bVar != null) {
            b bVar2 = q20.i.g(bVar) ? bVar : null;
            if (bVar2 != null && (s11 = bVar2.s()) != null && (E = j30.e.E(s11)) != null && (returnType = eVar.getReturnType()) != null && kotlin.jvm.internal.g0.g(eVar.getName(), l30.t.f69810e) && ((j30.e.t(returnType) || j30.e.u(returnType)) && eVar.g().size() == 1)) {
                e30.r0 type = eVar.g().get(0).getType();
                kotlin.jvm.internal.g0.o(type, "getType(...)");
                if (kotlin.jvm.internal.g0.g(j30.e.E(type), E) && eVar.z0().isEmpty() && eVar.f0() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @m80.l
    public static final b d(@m80.k a0 a0Var, @m80.k n20.c fqName, @m80.k x10.b lookupLocation) {
        d dVar;
        x20.k I;
        kotlin.jvm.internal.g0.p(a0Var, "<this>");
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        kotlin.jvm.internal.g0.p(lookupLocation, "lookupLocation");
        if (fqName.d()) {
            return null;
        }
        n20.c e11 = fqName.e();
        kotlin.jvm.internal.g0.o(e11, "parent(...)");
        x20.k r11 = a0Var.h0(e11).r();
        n20.f g11 = fqName.g();
        kotlin.jvm.internal.g0.o(g11, "shortName(...)");
        d h11 = r11.h(g11, lookupLocation);
        b bVar = h11 instanceof b ? (b) h11 : null;
        if (bVar != null) {
            return bVar;
        }
        n20.c e12 = fqName.e();
        kotlin.jvm.internal.g0.o(e12, "parent(...)");
        b d11 = d(a0Var, e12, lookupLocation);
        if (d11 == null || (I = d11.I()) == null) {
            dVar = null;
        } else {
            n20.f g12 = fqName.g();
            kotlin.jvm.internal.g0.o(g12, "shortName(...)");
            dVar = I.h(g12, lookupLocation);
        }
        if (dVar instanceof b) {
            return (b) dVar;
        }
        return null;
    }
}
