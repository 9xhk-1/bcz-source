package kotlin.reflect.jvm.internal;

import a00.a0;
import a00.r0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import k10.l2;
import k10.n1;
import k10.o1;
import k10.q2;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.calls.e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.t;
import org.junit.jupiter.api.j2;
import p10.j1;
import p10.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKParameterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KParameterImpl.kt\nkotlin/reflect/jvm/internal/KParameterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,113:1\n1#2:114\n37#3,2:115\n37#3,2:117\n*S KotlinDebug\n*F\n+ 1 KParameterImpl.kt\nkotlin/reflect/jvm/internal/KParameterImpl\n*L\n89#1:115,2\n92#1:117,2\n*E\n"})
/* loaded from: classes8.dex */
public final class l implements KParameter {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f67686f = {o0.u(new PropertyReference1Impl(o0.d(l.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), o0.u(new PropertyReference1Impl(o0.d(l.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e<?> f67687a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67688b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final KParameter.Kind f67689c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final t.a f67690d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final t.a f67691e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Type {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Type[] f67692a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67693b;

        public a(@m80.k Type[] types) {
            g0.p(types, "types");
            this.f67692a = types;
            this.f67693b = Arrays.hashCode(types);
        }

        public boolean equals(@m80.l Object obj) {
            return (obj instanceof a) && Arrays.equals(this.f67692a, ((a) obj).f67692a);
        }

        @Override // java.lang.reflect.Type
        @m80.k
        public String getTypeName() {
            return a0.Eh(this.f67692a, j2.O, "[", "]", 0, null, null, 56, null);
        }

        public int hashCode() {
            return this.f67693b;
        }

        @m80.k
        public String toString() {
            return getTypeName();
        }
    }

    public l(@m80.k e<?> callable, int i11, @m80.k KParameter.Kind kind, @m80.k x00.a<? extends p10.o0> computeDescriptor) {
        g0.p(callable, "callable");
        g0.p(kind, "kind");
        g0.p(computeDescriptor, "computeDescriptor");
        this.f67687a = callable;
        this.f67688b = i11;
        this.f67689c = kind;
        this.f67690d = t.c(computeDescriptor);
        this.f67691e = t.c(new n1(this));
    }

    public static final Type a(l lVar) {
        List q52;
        p10.o0 o11 = lVar.o();
        if ((o11 instanceof t0) && g0.g(q2.k(lVar.f67687a.c0()), o11) && lVar.f67687a.c0().getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            p10.h b11 = lVar.f67687a.c0().b();
            g0.n(b11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> s11 = q2.s((p10.b) b11);
            if (s11 != null) {
                return s11;
            }
            throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + o11);
        }
        kotlin.reflect.jvm.internal.calls.a<?> U = lVar.f67687a.U();
        if (!(U instanceof kotlin.reflect.jvm.internal.calls.e)) {
            if (!(U instanceof e.b)) {
                return U.a().get(lVar.getIndex());
            }
            Class[] clsArr = (Class[]) ((e.b) U).d().get(lVar.getIndex()).toArray(new Class[0]);
            return lVar.l((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (lVar.f67687a.a0()) {
            kotlin.reflect.jvm.internal.calls.e eVar = (kotlin.reflect.jvm.internal.calls.e) U;
            g10.l f11 = eVar.f(lVar.getIndex() + 1);
            int f12 = eVar.f(0).f() + 1;
            q52 = r0.q5(eVar.a(), new g10.l(f11.d() - f12, f11.f() - f12));
        } else {
            kotlin.reflect.jvm.internal.calls.e eVar2 = (kotlin.reflect.jvm.internal.calls.e) U;
            q52 = r0.q5(eVar2.a(), eVar2.f(lVar.getIndex()));
        }
        Type[] typeArr = (Type[]) q52.toArray(new Type[0]);
        return lVar.l((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }

    public static final List j(l lVar) {
        return q2.e(lVar.o());
    }

    @Override // kotlin.reflect.KParameter
    public boolean b() {
        p10.o0 o11 = o();
        return (o11 instanceof j1) && ((j1) o11).y0() != null;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return g0.g(this.f67687a, lVar.f67687a) && getIndex() == lVar.getIndex();
    }

    @Override // h10.b
    @m80.k
    public List<Annotation> getAnnotations() {
        T b11 = this.f67691e.b(this, f67686f[1]);
        g0.o(b11, "getValue(...)");
        return (List) b11;
    }

    @Override // kotlin.reflect.KParameter
    public int getIndex() {
        return this.f67688b;
    }

    @Override // kotlin.reflect.KParameter
    @m80.k
    public KParameter.Kind getKind() {
        return this.f67689c;
    }

    @Override // kotlin.reflect.KParameter
    @m80.l
    public String getName() {
        p10.o0 o11 = o();
        j1 j1Var = o11 instanceof j1 ? (j1) o11 : null;
        if (j1Var == null || j1Var.b().o0()) {
            return null;
        }
        n20.f name = j1Var.getName();
        g0.o(name, "getName(...)");
        if (name.g()) {
            return null;
        }
        return name.b();
    }

    @Override // kotlin.reflect.KParameter
    @m80.k
    public h10.r getType() {
        e30.r0 type = o().getType();
        g0.o(type, "getType(...)");
        return new r(type, new o1(this));
    }

    public int hashCode() {
        return (this.f67687a.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    @Override // kotlin.reflect.KParameter
    public boolean isOptional() {
        p10.o0 o11 = o();
        j1 j1Var = o11 instanceof j1 ? (j1) o11 : null;
        if (j1Var != null) {
            return u20.e.f(j1Var);
        }
        return false;
    }

    public final Type l(Type... typeArr) {
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new a(typeArr) : (Type) a0.At(typeArr);
        }
        throw new KotlinReflectionNotSupportedError("Expected at least 1 type for compound type");
    }

    @m80.k
    public final e<?> n() {
        return this.f67687a;
    }

    public final p10.o0 o() {
        T b11 = this.f67690d.b(this, f67686f[0]);
        g0.o(b11, "getValue(...)");
        return (p10.o0) b11;
    }

    @m80.k
    public String toString() {
        return l2.f64961a.j(this);
    }
}
