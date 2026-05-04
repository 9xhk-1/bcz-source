package h20;

import androidx.exifinterface.media.ExifInterface;
import e30.r0;
import h20.s;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import n10.o;
import p10.j1;
import p10.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nmethodSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/MethodSignatureMappingKt\n+ 2 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n*L\n1#1,200:1\n13#2:201\n*S KotlinDebug\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/MethodSignatureMappingKt\n*L\n81#1:201\n*E\n"})
/* loaded from: classes8.dex */
public final class c0 {
    public static final void a(StringBuilder sb2, r0 r0Var) {
        sb2.append(g(r0Var));
    }

    @m80.k
    public static final String b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z11, boolean z12) {
        String b11;
        kotlin.jvm.internal.g0.p(eVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z12) {
            if (eVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) {
                b11 = "<init>";
            } else {
                b11 = eVar.getName().b();
                kotlin.jvm.internal.g0.o(b11, "asString(...)");
            }
            sb2.append(b11);
        }
        sb2.append(pn.j.f81006c);
        t0 f02 = eVar.f0();
        if (f02 != null) {
            r0 type = f02.getType();
            kotlin.jvm.internal.g0.o(type, "getType(...)");
            a(sb2, type);
        }
        Iterator<j1> it = eVar.g().iterator();
        while (it.hasNext()) {
            r0 type2 = it.next().getType();
            kotlin.jvm.internal.g0.o(type2, "getType(...)");
            a(sb2, type2);
        }
        sb2.append(pn.j.f81007d);
        if (z11) {
            if (j.c(eVar)) {
                sb2.append(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
            } else {
                r0 returnType = eVar.getReturnType();
                kotlin.jvm.internal.g0.m(returnType);
                a(sb2, returnType);
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static /* synthetic */ String c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return b(eVar, z11, z12);
    }

    @m80.l
    public static final String d(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        f0 f0Var = f0.f58067a;
        if (q20.h.E(aVar)) {
            return null;
        }
        p10.h b11 = aVar.b();
        p10.b bVar = b11 instanceof p10.b ? (p10.b) b11 : null;
        if (bVar == null || bVar.getName().g()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a a11 = aVar.a();
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar = a11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g ? (kotlin.reflect.jvm.internal.impl.descriptors.g) a11 : null;
        if (gVar == null) {
            return null;
        }
        return b0.a(f0Var, bVar, c(gVar, false, false, 3, null));
    }

    public static final boolean e(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a f11) {
        kotlin.reflect.jvm.internal.impl.descriptors.e l11;
        kotlin.jvm.internal.g0.p(f11, "f");
        if (!(f11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) f11;
        if (kotlin.jvm.internal.g0.g(eVar.getName().b(), "remove") && eVar.g().size() == 1 && !kotlin.reflect.jvm.internal.impl.load.java.d.n((CallableMemberDescriptor) f11)) {
            List<j1> g11 = eVar.a().g();
            kotlin.jvm.internal.g0.o(g11, "getValueParameters(...)");
            r0 type = ((j1) a00.r0.m5(g11)).getType();
            kotlin.jvm.internal.g0.o(type, "getType(...)");
            s g12 = g(type);
            s.d dVar = g12 instanceof s.d ? (s.d) g12 : null;
            if ((dVar != null ? dVar.i() : null) != JvmPrimitiveType.INT || (l11 = kotlin.reflect.jvm.internal.impl.load.java.b.l(eVar)) == null) {
                return false;
            }
            List<j1> g13 = l11.a().g();
            kotlin.jvm.internal.g0.o(g13, "getValueParameters(...)");
            r0 type2 = ((j1) a00.r0.m5(g13)).getType();
            kotlin.jvm.internal.g0.o(type2, "getType(...)");
            s g14 = g(type2);
            p10.h b11 = l11.b();
            kotlin.jvm.internal.g0.o(b11, "getContainingDeclaration(...)");
            if (kotlin.jvm.internal.g0.g(u20.e.p(b11), o.a.f74040f0.j()) && (g14 instanceof s.c) && kotlin.jvm.internal.g0.g(((s.c) g14).i(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final String f(@m80.k p10.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        o10.a aVar = o10.a.f75522a;
        n20.d j11 = u20.e.o(bVar).j();
        kotlin.jvm.internal.g0.o(j11, "toUnsafe(...)");
        n20.b n11 = aVar.n(j11);
        if (n11 == null) {
            return j.b(bVar, null, 2, null);
        }
        String h11 = v20.d.h(n11);
        kotlin.jvm.internal.g0.o(h11, "internalNameByClassId(...)");
        return h11;
    }

    @m80.k
    public static final s g(@m80.k r0 r0Var) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        return (s) j.e(r0Var, u.f58154a, i0.f58100o, h0.f58095a, null, null, 32, null);
    }
}
