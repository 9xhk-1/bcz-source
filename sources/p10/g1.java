package p10;

import e30.a2;
import e30.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\ntypeParameterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n+ 2 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n15#2,2:101\n1557#3:103\n1628#3,3:104\n*S KotlinDebug\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n*L\n37#1:101,2\n42#1:103\n42#1:104,3\n*E\n"})
/* loaded from: classes8.dex */
public final class g1 {
    @m80.l
    public static final p0 d(@m80.k e30.r0 r0Var) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        d r11 = r0Var.I0().r();
        return e(r0Var, r11 instanceof e ? (e) r11 : null, 0);
    }

    public static final p0 e(e30.r0 r0Var, e eVar, int i11) {
        if (eVar == null || g30.i.m(eVar)) {
            return null;
        }
        int size = eVar.t().size() + i11;
        if (eVar.i()) {
            List<a2> subList = r0Var.G0().subList(i11, size);
            h b11 = eVar.b();
            return new p0(eVar, subList, e(r0Var, b11 instanceof e ? (e) b11 : null, size));
        }
        if (size != r0Var.G0().size()) {
            q20.h.E(eVar);
        }
        return new p0(eVar, r0Var.G0().subList(i11, r0Var.G0().size()), null);
    }

    public static final a f(c1 c1Var, h hVar, int i11) {
        return new a(c1Var, hVar, i11);
    }

    @m80.k
    public static final List<c1> g(@m80.k e eVar) {
        List<c1> list;
        h hVar;
        u1 o11;
        kotlin.jvm.internal.g0.p(eVar, "<this>");
        List<c1> t11 = eVar.t();
        kotlin.jvm.internal.g0.o(t11, "getDeclaredTypeParameters(...)");
        if (!eVar.i() && !(eVar.b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            return t11;
        }
        List I3 = q30.k0.I3(q30.k0.k1(q30.k0.P0(q30.k0.F3(u20.e.u(eVar), d1.f78556a), e1.f78558a), f1.f78569a));
        Iterator<h> it = u20.e.u(eVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                hVar = null;
                break;
            }
            hVar = it.next();
            if (hVar instanceof b) {
                break;
            }
        }
        b bVar = (b) hVar;
        if (bVar != null && (o11 = bVar.o()) != null) {
            list = o11.getParameters();
        }
        if (list == null) {
            list = a00.h0.J();
        }
        if (I3.isEmpty() && list.isEmpty()) {
            List<c1> t12 = eVar.t();
            kotlin.jvm.internal.g0.o(t12, "getDeclaredTypeParameters(...)");
            return t12;
        }
        List<c1> I4 = a00.r0.I4(I3, list);
        ArrayList arrayList = new ArrayList(a00.i0.d0(I4, 10));
        for (c1 c1Var : I4) {
            kotlin.jvm.internal.g0.m(c1Var);
            arrayList.add(f(c1Var, eVar, t11.size()));
        }
        return a00.r0.I4(t11, arrayList);
    }

    public static final boolean h(h it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it instanceof kotlin.reflect.jvm.internal.impl.descriptors.a;
    }

    public static final boolean i(h it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return !(it instanceof kotlin.reflect.jvm.internal.impl.descriptors.c);
    }

    public static final q30.m j(h it) {
        kotlin.jvm.internal.g0.p(it, "it");
        List<c1> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.a) it).getTypeParameters();
        kotlin.jvm.internal.g0.o(typeParameters, "getTypeParameters(...)");
        return a00.r0.E1(typeParameters);
    }
}
