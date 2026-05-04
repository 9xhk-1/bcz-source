package h20;

import e30.a2;
import e30.h2;
import e30.q0;
import e30.r0;
import e30.u1;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p10.b1;
import p10.c1;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\ndescriptorBasedTypeSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 descriptorBasedTypeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/DescriptorBasedTypeSignatureMappingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
/* loaded from: classes8.dex */
public final class j {
    @m80.k
    public static final String a(@m80.k p10.b klass, @m80.k g0<?> typeMappingConfiguration) {
        kotlin.jvm.internal.g0.p(klass, "klass");
        kotlin.jvm.internal.g0.p(typeMappingConfiguration, "typeMappingConfiguration");
        String f11 = typeMappingConfiguration.f(klass);
        if (f11 != null) {
            return f11;
        }
        p10.h b11 = klass.b();
        kotlin.jvm.internal.g0.o(b11, "getContainingDeclaration(...)");
        String d11 = n20.h.b(klass.getName()).d();
        kotlin.jvm.internal.g0.o(d11, "getIdentifier(...)");
        if (b11 instanceof p10.g0) {
            n20.c d12 = ((p10.g0) b11).d();
            if (d12.d()) {
                return d11;
            }
            StringBuilder sb2 = new StringBuilder();
            String b12 = d12.b();
            kotlin.jvm.internal.g0.o(b12, "asString(...)");
            sb2.append(u30.f0.y2(b12, '.', '/', false, 4, null));
            sb2.append('/');
            sb2.append(d11);
            return sb2.toString();
        }
        p10.b bVar = b11 instanceof p10.b ? (p10.b) b11 : null;
        if (bVar == null) {
            throw new IllegalArgumentException("Unexpected container: " + b11 + " for " + klass);
        }
        String b13 = typeMappingConfiguration.b(bVar);
        if (b13 == null) {
            b13 = a(bVar, typeMappingConfiguration);
        }
        return b13 + '$' + d11;
    }

    public static /* synthetic */ String b(p10.b bVar, g0 g0Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            g0Var = h0.f58095a;
        }
        return a(bVar, g0Var);
    }

    public static final boolean c(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        if (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) {
            return true;
        }
        r0 returnType = descriptor.getReturnType();
        kotlin.jvm.internal.g0.m(returnType);
        if (!n10.j.C0(returnType)) {
            return false;
        }
        r0 returnType2 = descriptor.getReturnType();
        kotlin.jvm.internal.g0.m(returnType2);
        return (h2.l(returnType2) || (descriptor instanceof p10.r0)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v31, types: [T, java.lang.Object] */
    @m80.k
    public static final <T> T d(@m80.k r0 kotlinType, @m80.k t<T> factory, @m80.k i0 mode, @m80.k g0<? extends T> typeMappingConfiguration, @m80.l q<T> qVar, @m80.k x00.q<? super r0, ? super T, ? super i0, g2> writeGenericType) {
        T c11;
        r0 r0Var;
        Object d11;
        kotlin.jvm.internal.g0.p(kotlinType, "kotlinType");
        kotlin.jvm.internal.g0.p(factory, "factory");
        kotlin.jvm.internal.g0.p(mode, "mode");
        kotlin.jvm.internal.g0.p(typeMappingConfiguration, "typeMappingConfiguration");
        kotlin.jvm.internal.g0.p(writeGenericType, "writeGenericType");
        r0 a11 = typeMappingConfiguration.a(kotlinType);
        if (a11 != null) {
            return (T) d(a11, factory, mode, typeMappingConfiguration, qVar, writeGenericType);
        }
        if (n10.i.r(kotlinType)) {
            return (T) d(n10.p.a(kotlinType), factory, mode, typeMappingConfiguration, qVar, writeGenericType);
        }
        f30.u uVar = f30.u.f50458a;
        Object b11 = j0.b(uVar, kotlinType, factory, mode);
        if (b11 != null) {
            ?? r82 = (Object) j0.a(factory, b11, mode.d());
            writeGenericType.invoke(kotlinType, r82, mode);
            return r82;
        }
        u1 I0 = kotlinType.I0();
        if (I0 instanceof q0) {
            q0 q0Var = (q0) I0;
            r0 k11 = q0Var.k();
            if (k11 == null) {
                k11 = typeMappingConfiguration.e(q0Var.c());
            }
            return (T) d(j30.e.E(k11), factory, mode, typeMappingConfiguration, qVar, writeGenericType);
        }
        p10.d r11 = I0.r();
        if (r11 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (g30.i.m(r11)) {
            T t11 = (T) factory.f("error/NonExistentClass");
            typeMappingConfiguration.d(kotlinType, (p10.b) r11);
            if (qVar != 0) {
                qVar.c(t11);
            }
            return t11;
        }
        boolean z11 = r11 instanceof p10.b;
        if (z11 && n10.j.c0(kotlinType)) {
            if (kotlinType.G0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            a2 a2Var = kotlinType.G0().get(0);
            r0 type = a2Var.getType();
            kotlin.jvm.internal.g0.o(type, "getType(...)");
            if (a2Var.b() == Variance.IN_VARIANCE) {
                d11 = factory.f("java/lang/Object");
                if (qVar != 0) {
                    qVar.b();
                    qVar.c(d11);
                    qVar.a();
                }
            } else {
                if (qVar != 0) {
                    qVar.b();
                }
                Variance b12 = a2Var.b();
                kotlin.jvm.internal.g0.o(b12, "getProjectionKind(...)");
                d11 = d(type, factory, mode.f(b12, true), typeMappingConfiguration, qVar, writeGenericType);
                if (qVar != 0) {
                    qVar.a();
                }
            }
            return (T) factory.a('[' + factory.e(d11));
        }
        if (!z11) {
            if (!(r11 instanceof c1)) {
                if ((r11 instanceof b1) && mode.b()) {
                    return (T) d(((b1) r11).a0(), factory, mode, typeMappingConfiguration, qVar, writeGenericType);
                }
                throw new UnsupportedOperationException("Unknown type " + kotlinType);
            }
            r0 p11 = j30.e.p((c1) r11);
            if (kotlinType.J0()) {
                p11 = j30.e.C(p11);
            }
            T t12 = (T) d(p11, factory, mode, typeMappingConfiguration, null, o30.j.l());
            if (qVar != 0) {
                n20.f name = r11.getName();
                kotlin.jvm.internal.g0.o(name, "getName(...)");
                qVar.e(name, t12);
            }
            return t12;
        }
        if (q20.i.b(r11) && !mode.c() && (r0Var = (r0) e30.h0.a(uVar, kotlinType)) != null) {
            return (T) d(r0Var, factory, mode.g(), typeMappingConfiguration, qVar, writeGenericType);
        }
        if (mode.e() && n10.j.l0((p10.b) r11)) {
            c11 = (Object) factory.b();
        } else {
            p10.b bVar = (p10.b) r11;
            p10.b a12 = bVar.a();
            kotlin.jvm.internal.g0.o(a12, "getOriginal(...)");
            c11 = typeMappingConfiguration.c(a12);
            if (c11 == null) {
                if (bVar.getKind() == ClassKind.ENUM_ENTRY) {
                    p10.h b13 = bVar.b();
                    kotlin.jvm.internal.g0.n(b13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    bVar = (p10.b) b13;
                }
                p10.b a13 = bVar.a();
                kotlin.jvm.internal.g0.o(a13, "getOriginal(...)");
                c11 = (Object) factory.f(a(a13, typeMappingConfiguration));
            }
        }
        writeGenericType.invoke(kotlinType, c11, mode);
        return c11;
    }

    public static /* synthetic */ Object e(r0 r0Var, t tVar, i0 i0Var, g0 g0Var, q qVar, x00.q qVar2, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            qVar2 = o30.j.l();
        }
        return d(r0Var, tVar, i0Var, g0Var, qVar, qVar2);
    }
}
