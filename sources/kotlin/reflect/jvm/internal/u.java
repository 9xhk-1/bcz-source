package kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import c30.n0;
import h20.c0;
import java.lang.reflect.Method;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.c;
import kotlin.reflect.jvm.internal.d;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import m20.d;
import n10.o;
import n20.b;
import p10.q0;
import p10.r0;
import p10.s0;
import p10.x0;
import u30.f0;
import u30.k0;
import v10.w;
import v10.z;
import y10.d0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/RuntimeTypeMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final u f67731a = new u();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final n20.b f67732b = n20.b.f74280d.c(new n20.c("java.lang.Void"));

    public final PrimitiveType a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    public final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (q20.g.p(eVar) || q20.g.q(eVar)) {
            return true;
        }
        return g0.g(eVar.getName(), kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f67221e.a()) && eVar.g().isEmpty();
    }

    @m80.k
    public final n20.b c(@m80.k Class<?> klass) {
        n20.b m11;
        g0.p(klass, "klass");
        if (!klass.isArray()) {
            if (g0.g(klass, Void.TYPE)) {
                return f67732b;
            }
            PrimitiveType a11 = a(klass);
            if (a11 != null) {
                return new n20.b(n10.o.A, a11.getTypeName());
            }
            n20.b e11 = v10.f.e(klass);
            return (e11.i() || (m11 = o10.a.f75522a.m(e11.a())) == null) ? e11 : m11;
        }
        Class<?> componentType = klass.getComponentType();
        g0.o(componentType, "getComponentType(...)");
        PrimitiveType a12 = a(componentType);
        if (a12 != null) {
            return new n20.b(n10.o.A, a12.getArrayTypeName());
        }
        b.a aVar = n20.b.f74280d;
        n20.c l11 = o.a.f74045i.l();
        g0.o(l11, "toSafe(...)");
        return aVar.c(l11);
    }

    public final c.e d(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return new c.e(new d.b(e(eVar), c0.c(eVar, false, false, 1, null)));
    }

    public final String e(CallableMemberDescriptor callableMemberDescriptor) {
        String e11 = kotlin.reflect.jvm.internal.impl.load.java.d.e(callableMemberDescriptor);
        if (e11 != null) {
            return e11;
        }
        if (callableMemberDescriptor instanceof r0) {
            String b11 = u20.e.w(callableMemberDescriptor).getName().b();
            g0.o(b11, "asString(...)");
            return d0.b(b11);
        }
        if (callableMemberDescriptor instanceof s0) {
            String b12 = u20.e.w(callableMemberDescriptor).getName().b();
            g0.o(b12, "asString(...)");
            return d0.e(b12);
        }
        String b13 = callableMemberDescriptor.getName().b();
        g0.o(b13, "asString(...)");
        return b13;
    }

    @m80.k
    public final d f(@m80.k q0 possiblyOverriddenProperty) {
        g0.p(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        q0 a11 = ((q0) q20.h.L(possiblyOverriddenProperty)).a();
        g0.o(a11, "getOriginal(...)");
        if (a11 instanceof n0) {
            n0 n0Var = (n0) a11;
            ProtoBuf.Property M = n0Var.M();
            GeneratedMessageLite.f<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f67474d;
            g0.o(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) k20.e.a(M, propertySignature);
            if (jvmPropertySignature != null) {
                return new d.c(a11, M, jvmPropertySignature, n0Var.b0(), n0Var.D());
            }
        } else if (a11 instanceof a20.f) {
            a20.f fVar = (a20.f) a11;
            x0 source = fVar.getSource();
            e20.a aVar = source instanceof e20.a ? (e20.a) source : null;
            f20.l c11 = aVar != null ? aVar.c() : null;
            if (c11 instanceof w) {
                return new d.a(((w) c11).P());
            }
            if (c11 instanceof z) {
                Method P = ((z) c11).P();
                s0 setter = fVar.getSetter();
                x0 source2 = setter != null ? setter.getSource() : null;
                e20.a aVar2 = source2 instanceof e20.a ? (e20.a) source2 : null;
                f20.l c12 = aVar2 != null ? aVar2.c() : null;
                z zVar = c12 instanceof z ? (z) c12 : null;
                return new d.b(P, zVar != null ? zVar.P() : null);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + a11 + " (source = " + c11 + ')');
        }
        r0 getter = a11.getGetter();
        g0.m(getter);
        c.e d11 = d(getter);
        s0 setter2 = a11.getSetter();
        return new d.C0788d(d11, setter2 != null ? d(setter2) : null);
    }

    @m80.k
    public final c g(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e possiblySubstitutedFunction) {
        Method P;
        d.b b11;
        d.b e11;
        g0.p(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        kotlin.reflect.jvm.internal.impl.descriptors.e a11 = ((kotlin.reflect.jvm.internal.impl.descriptors.e) q20.h.L(possiblySubstitutedFunction)).a();
        g0.o(a11, "getOriginal(...)");
        if (!(a11 instanceof c30.c)) {
            if (a11 instanceof a20.e) {
                x0 source = ((a20.e) a11).getSource();
                e20.a aVar = source instanceof e20.a ? (e20.a) source : null;
                f20.l c11 = aVar != null ? aVar.c() : null;
                z zVar = c11 instanceof z ? (z) c11 : null;
                if (zVar != null && (P = zVar.P()) != null) {
                    return new c.C0782c(P);
                }
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + a11);
            }
            if (!(a11 instanceof a20.b)) {
                if (b(a11)) {
                    return d(a11);
                }
                throw new KotlinReflectionInternalError("Unknown origin of " + a11 + " (" + a11.getClass() + ')');
            }
            x0 source2 = ((a20.b) a11).getSource();
            e20.a aVar2 = source2 instanceof e20.a ? (e20.a) source2 : null;
            f20.l c12 = aVar2 != null ? aVar2.c() : null;
            if (c12 instanceof v10.t) {
                return new c.b(((v10.t) c12).P());
            }
            if (c12 instanceof v10.q) {
                v10.q qVar = (v10.q) c12;
                if (qVar.p()) {
                    return new c.a(qVar.e());
                }
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + a11 + " (" + c12 + ')');
        }
        c30.t tVar = (c30.t) a11;
        kotlin.reflect.jvm.internal.impl.protobuf.n M = tVar.M();
        if ((M instanceof ProtoBuf.Function) && (e11 = m20.i.f71820a.e((ProtoBuf.Function) M, tVar.b0(), tVar.D())) != null) {
            return new c.e(e11);
        }
        if (!(M instanceof ProtoBuf.Constructor) || (b11 = m20.i.f71820a.b((ProtoBuf.Constructor) M, tVar.b0(), tVar.D())) == null) {
            return d(a11);
        }
        p10.h b12 = possiblySubstitutedFunction.b();
        g0.o(b12, "getContainingDeclaration(...)");
        if (q20.i.b(b12)) {
            return new c.e(b11);
        }
        p10.h b13 = possiblySubstitutedFunction.b();
        g0.o(b13, "getContainingDeclaration(...)");
        if (!q20.i.d(b13)) {
            return new c.d(b11);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.c cVar = (kotlin.reflect.jvm.internal.impl.descriptors.c) possiblySubstitutedFunction;
        if (cVar.n0()) {
            if (!g0.g(b11.e(), "constructor-impl") || !f0.b2(b11.d(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + b11).toString());
            }
        } else {
            if (!g0.g(b11.e(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + b11).toString());
            }
            p10.b L = cVar.L();
            g0.o(L, "getConstructedClass(...)");
            String u11 = l10.i.u(L);
            if (f0.b2(b11.d(), ")V", false, 2, null)) {
                b11 = d.b.c(b11, null, k0.D4(b11.d(), ExifInterface.GPS_MEASUREMENT_INTERRUPTED) + u11, 1, null);
            } else if (!f0.b2(b11.d(), u11, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + b11).toString());
            }
        }
        return new c.e(b11);
    }
}
