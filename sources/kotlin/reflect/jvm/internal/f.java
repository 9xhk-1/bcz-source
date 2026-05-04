package kotlin.reflect.jvm.internal;

import a00.a0;
import a00.w1;
import e30.c1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k10.b0;
import k10.d0;
import k10.f0;
import k10.g0;
import k10.g2;
import k10.h0;
import k10.i0;
import k10.j0;
import k10.k0;
import k10.l0;
import k10.m0;
import k10.n0;
import k10.p0;
import k10.q0;
import k10.q2;
import k10.r0;
import k10.s0;
import k10.t0;
import k10.v0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.t;
import x20.n;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f<T> extends KDeclarationContainerImpl implements h10.d<T>, v0, g2 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Class<T> f67151d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c0<f<T>.a> f67152e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKClassImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,361:1\n1557#2:362\n1628#2,3:363\n827#2:366\n855#2,2:367\n1611#2,9:369\n1863#2:378\n1864#2:381\n1620#2:382\n1557#2:383\n1628#2,3:384\n1628#2,3:387\n1734#2,3:390\n1611#2,9:393\n1863#2:402\n1864#2:404\n1620#2:405\n1#3:379\n1#3:380\n1#3:403\n*S KotlinDebug\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data\n*L\n105#1:362\n105#1:363,3\n111#1:366\n111#1:367,2\n112#1:369,9\n112#1:378\n112#1:381\n112#1:382\n132#1:383\n132#1:384,3\n138#1:387,3\n155#1:390,3\n165#1:393,9\n165#1:402\n165#1:404\n165#1:405\n112#1:380\n165#1:403\n*E\n"})
    public final class a extends KDeclarationContainerImpl.b {

        /* renamed from: w, reason: collision with root package name */
        public static final /* synthetic */ h10.n<Object>[] f67153w = {o0.u(new PropertyReference1Impl(o0.d(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "annotations", "getAnnotations()Ljava/util/List;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final t.a f67154d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final t.a f67155e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final t.a f67156f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final t.a f67157g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final t.a f67158h;

        /* renamed from: i, reason: collision with root package name */
        @m80.k
        public final t.a f67159i;

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final c0 f67160j;

        /* renamed from: k, reason: collision with root package name */
        @m80.k
        public final t.a f67161k;

        /* renamed from: l, reason: collision with root package name */
        @m80.k
        public final t.a f67162l;

        /* renamed from: m, reason: collision with root package name */
        @m80.k
        public final t.a f67163m;

        /* renamed from: n, reason: collision with root package name */
        @m80.k
        public final t.a f67164n;

        /* renamed from: o, reason: collision with root package name */
        @m80.k
        public final t.a f67165o;

        /* renamed from: p, reason: collision with root package name */
        @m80.k
        public final t.a f67166p;

        /* renamed from: q, reason: collision with root package name */
        @m80.k
        public final t.a f67167q;

        /* renamed from: r, reason: collision with root package name */
        @m80.k
        public final t.a f67168r;

        /* renamed from: s, reason: collision with root package name */
        @m80.k
        public final t.a f67169s;

        /* renamed from: t, reason: collision with root package name */
        @m80.k
        public final t.a f67170t;

        /* renamed from: u, reason: collision with root package name */
        @m80.k
        public final t.a f67171u;

        public a() {
            super();
            this.f67154d = t.c(new b0(f.this));
            this.f67155e = t.c(new m0(this));
            this.f67156f = t.c(new n0(f.this, this));
            this.f67157g = t.c(new k10.o0(f.this));
            this.f67158h = t.c(new p0(f.this));
            this.f67159i = t.c(new q0(this));
            this.f67160j = e0.b(LazyThreadSafetyMode.PUBLICATION, new r0(this, f.this));
            this.f67161k = t.c(new s0(this, f.this));
            this.f67162l = t.c(new t0(this, f.this));
            this.f67163m = t.c(new k10.u0(this));
            this.f67164n = t.c(new k10.c0(f.this));
            this.f67165o = t.c(new d0(f.this));
            this.f67166p = t.c(new k10.e0(f.this));
            this.f67167q = t.c(new f0(f.this));
            this.f67168r = t.c(new g0(this));
            this.f67169s = t.c(new h0(this));
            this.f67170t = t.c(new i0(this));
            this.f67171u = t.c(new j0(this));
        }

        public static final List A(a aVar) {
            return q2.e(aVar.P());
        }

        public static final List C(f fVar) {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> N = fVar.N();
            ArrayList arrayList = new ArrayList(a00.i0.d0(N, 10));
            Iterator<T> it = N.iterator();
            while (it.hasNext()) {
                arrayList.add(new g(fVar, (kotlin.reflect.jvm.internal.impl.descriptors.c) it.next()));
            }
            return arrayList;
        }

        public static final List D(a aVar) {
            return a00.r0.I4(aVar.N(), aVar.O());
        }

        public static final Collection E(f fVar) {
            return fVar.Q(fVar.h0(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }

        public static final Collection F(f fVar) {
            return fVar.Q(fVar.i0(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }

        public static final p10.b G(f fVar) {
            n20.b e02 = fVar.e0();
            u10.k b11 = fVar.f0().getValue().b();
            p10.b b12 = (e02.i() && fVar.g().isAnnotationPresent(Metadata.class)) ? b11.a().b(e02) : p10.t.b(b11.b(), e02);
            return b12 == null ? fVar.c0(e02, b11) : b12;
        }

        public static final Collection Z(f fVar) {
            return fVar.Q(fVar.h0(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
        }

        public static final Collection a0(f fVar) {
            return fVar.Q(fVar.i0(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
        }

        public static final List b0(a aVar) {
            Collection a11 = n.a.a(aVar.P().I(), null, null, 3, null);
            ArrayList<p10.h> arrayList = new ArrayList();
            for (T t11 : a11) {
                if (!q20.h.B((p10.h) t11)) {
                    arrayList.add(t11);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (p10.h hVar : arrayList) {
                p10.b bVar = hVar instanceof p10.b ? (p10.b) hVar : null;
                Class<?> s11 = bVar != null ? q2.s(bVar) : null;
                f fVar = s11 != null ? new f(s11) : null;
                if (fVar != null) {
                    arrayList2.add(fVar);
                }
            }
            return arrayList2;
        }

        public static final Object c0(a aVar, f fVar) {
            p10.b P = aVar.P();
            if (P.getKind() != ClassKind.OBJECT) {
                return null;
            }
            Object obj = ((!P.m0() || n10.e.a(n10.d.f73966a, P)) ? fVar.g().getDeclaredField("INSTANCE") : fVar.g().getEnclosingClass().getDeclaredField(P.getName().b())).get(null);
            kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance_delegate$lambda$11");
            return obj;
        }

        public static final String d0(f fVar) {
            if (fVar.g().isAnonymousClass()) {
                return null;
            }
            n20.b e02 = fVar.e0();
            if (e02.i()) {
                return null;
            }
            return e02.a().b();
        }

        public static final List e0(a aVar) {
            Collection<p10.b> p11 = aVar.P().p();
            kotlin.jvm.internal.g0.o(p11, "getSealedSubclasses(...)");
            ArrayList arrayList = new ArrayList();
            for (p10.b bVar : p11) {
                kotlin.jvm.internal.g0.n(bVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class<?> s11 = q2.s(bVar);
                f fVar = s11 != null ? new f(s11) : null;
                if (fVar != null) {
                    arrayList.add(fVar);
                }
            }
            return arrayList;
        }

        public static final String f0(f fVar, a aVar) {
            if (fVar.g().isAnonymousClass()) {
                return null;
            }
            n20.b e02 = fVar.e0();
            if (e02.i()) {
                return aVar.B(fVar.g());
            }
            String b11 = e02.h().b();
            kotlin.jvm.internal.g0.o(b11, "asString(...)");
            return b11;
        }

        public static final List g0(a aVar, f fVar) {
            Collection<e30.r0> c11 = aVar.P().o().c();
            kotlin.jvm.internal.g0.o(c11, "getSupertypes(...)");
            ArrayList arrayList = new ArrayList(c11.size());
            for (e30.r0 r0Var : c11) {
                kotlin.jvm.internal.g0.m(r0Var);
                arrayList.add(new r(r0Var, new k0(r0Var, aVar, fVar)));
            }
            if (!n10.j.u0(aVar.P())) {
                if (!arrayList.isEmpty()) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        ClassKind kind = q20.h.e(((r) it.next()).D()).getKind();
                        kotlin.jvm.internal.g0.o(kind, "getKind(...)");
                        if (kind != ClassKind.INTERFACE && kind != ClassKind.ANNOTATION_CLASS) {
                            break;
                        }
                    }
                }
                c1 i11 = u20.e.m(aVar.P()).i();
                kotlin.jvm.internal.g0.o(i11, "getAnyType(...)");
                arrayList.add(new r(i11, l0.f64959a));
            }
            return o30.a.c(arrayList);
        }

        public static final Type h0(e30.r0 r0Var, a aVar, f fVar) {
            p10.d r11 = r0Var.I0().r();
            if (!(r11 instanceof p10.b)) {
                throw new KotlinReflectionInternalError("Supertype not a class: " + r11);
            }
            Class<?> s11 = q2.s((p10.b) r11);
            if (s11 == null) {
                throw new KotlinReflectionInternalError("Unsupported superclass of " + aVar + ": " + r11);
            }
            if (kotlin.jvm.internal.g0.g(fVar.g().getSuperclass(), s11)) {
                Type genericSuperclass = fVar.g().getGenericSuperclass();
                kotlin.jvm.internal.g0.m(genericSuperclass);
                return genericSuperclass;
            }
            Class<?>[] interfaces = fVar.g().getInterfaces();
            kotlin.jvm.internal.g0.o(interfaces, "getInterfaces(...)");
            int bg2 = a0.bg(interfaces, s11);
            if (bg2 >= 0) {
                Type type = fVar.g().getGenericInterfaces()[bg2];
                kotlin.jvm.internal.g0.m(type);
                return type;
            }
            throw new KotlinReflectionInternalError("No superclass of " + aVar + " in Java reflection for " + r11);
        }

        public static final Type i0() {
            return Object.class;
        }

        public static final List j0(a aVar, f fVar) {
            List<p10.c1> t11 = aVar.P().t();
            kotlin.jvm.internal.g0.o(t11, "getDeclaredTypeParameters(...)");
            List<p10.c1> list = t11;
            ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
            for (p10.c1 c1Var : list) {
                kotlin.jvm.internal.g0.m(c1Var);
                arrayList.add(new s(fVar, c1Var));
            }
            return arrayList;
        }

        public static final List x(a aVar) {
            return a00.r0.I4(aVar.I(), aVar.J());
        }

        public static final List y(a aVar) {
            return a00.r0.I4(aVar.N(), aVar.Q());
        }

        public static final List z(a aVar) {
            return a00.r0.I4(aVar.O(), aVar.R());
        }

        public final String B(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                kotlin.jvm.internal.g0.m(simpleName);
                return u30.k0.M5(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                kotlin.jvm.internal.g0.m(simpleName);
                return u30.k0.L5(simpleName, '$', null, 2, null);
            }
            kotlin.jvm.internal.g0.m(simpleName);
            return u30.k0.M5(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        @m80.k
        public final Collection<e<?>> H() {
            T b11 = this.f67171u.b(this, f67153w[16]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (Collection) b11;
        }

        @m80.k
        public final Collection<e<?>> I() {
            T b11 = this.f67168r.b(this, f67153w[13]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (Collection) b11;
        }

        @m80.k
        public final Collection<e<?>> J() {
            T b11 = this.f67169s.b(this, f67153w[14]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (Collection) b11;
        }

        @m80.k
        public final List<Annotation> K() {
            T b11 = this.f67155e.b(this, f67153w[1]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (List) b11;
        }

        @m80.k
        public final Collection<h10.i<T>> L() {
            T b11 = this.f67158h.b(this, f67153w[4]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (Collection) b11;
        }

        @m80.k
        public final Collection<e<?>> M() {
            T b11 = this.f67170t.b(this, f67153w[15]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (Collection) b11;
        }

        @m80.k
        public final Collection<e<?>> N() {
            T b11 = this.f67164n.b(this, f67153w[9]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (Collection) b11;
        }

        public final Collection<e<?>> O() {
            T b11 = this.f67165o.b(this, f67153w[10]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (Collection) b11;
        }

        @m80.k
        public final p10.b P() {
            T b11 = this.f67154d.b(this, f67153w[0]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (p10.b) b11;
        }

        public final Collection<e<?>> Q() {
            T b11 = this.f67166p.b(this, f67153w[11]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (Collection) b11;
        }

        public final Collection<e<?>> R() {
            T b11 = this.f67167q.b(this, f67153w[12]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (Collection) b11;
        }

        @m80.k
        public final Collection<h10.d<?>> S() {
            T b11 = this.f67159i.b(this, f67153w[5]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (Collection) b11;
        }

        @m80.l
        public final T T() {
            return (T) this.f67160j.getValue();
        }

        @m80.l
        public final String U() {
            return (String) this.f67157g.b(this, f67153w[3]);
        }

        @m80.k
        public final List<h10.d<? extends T>> V() {
            T b11 = this.f67163m.b(this, f67153w[8]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (List) b11;
        }

        @m80.l
        public final String W() {
            return (String) this.f67156f.b(this, f67153w[2]);
        }

        @m80.k
        public final List<h10.r> X() {
            T b11 = this.f67162l.b(this, f67153w[7]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (List) b11;
        }

        @m80.k
        public final List<h10.s> Y() {
            T b11 = this.f67161k.b(this, f67153w[6]);
            kotlin.jvm.internal.g0.o(b11, "getValue(...)");
            return (List) b11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67173a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f67173a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends x20.f {
        public c(s10.k kVar, d30.n nVar) {
            super(nVar, kVar);
        }

        @Override // x20.f
        public List<kotlin.reflect.jvm.internal.impl.descriptors.e> k() {
            return a00.h0.J();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class d extends FunctionReference implements x00.p<a30.j0, ProtoBuf.Property, p10.q0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f67174a = new d();

        public d() {
            super(2);
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p10.q0 invoke(a30.j0 p02, ProtoBuf.Property p12) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            kotlin.jvm.internal.g0.p(p12, "p1");
            return p02.u(p12);
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return o0.d(a30.j0.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }
    }

    public f(@m80.k Class<T> jClass) {
        kotlin.jvm.internal.g0.p(jClass, "jClass");
        this.f67151d = jClass;
        this.f67152e = e0.b(LazyThreadSafetyMode.PUBLICATION, new k10.a0(this));
    }

    public static final a d0(f fVar) {
        return new a();
    }

    @Override // h10.d
    public boolean A() {
        return a().m0();
    }

    @Override // h10.d
    public boolean B(@m80.l Object obj) {
        Integer g11 = v10.f.g(g());
        if (g11 != null) {
            return x0.B(obj, g11.intValue());
        }
        Class k11 = v10.f.k(g());
        if (k11 == null) {
            k11 = g();
        }
        return k11.isInstance(obj);
    }

    @Override // h10.d
    @m80.l
    public String C() {
        return this.f67152e.getValue().W();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> N() {
        p10.b a11 = a();
        if (a11.getKind() == ClassKind.INTERFACE || a11.getKind() == ClassKind.OBJECT) {
            return a00.h0.J();
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> f11 = a11.f();
        kotlin.jvm.internal.g0.o(f11, "getConstructors(...)");
        return f11;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> O(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        x20.k h02 = h0();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return a00.r0.I4(h02.a(name, noLookupLocation), i0().a(name, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @m80.l
    public p10.q0 P(int i11) {
        Class<?> declaringClass;
        if (kotlin.jvm.internal.g0.g(g().getSimpleName(), "DefaultImpls") && (declaringClass = g().getDeclaringClass()) != null && declaringClass.isInterface()) {
            h10.d i12 = w00.b.i(declaringClass);
            kotlin.jvm.internal.g0.n(i12, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((f) i12).P(i11);
        }
        p10.b a11 = a();
        c30.n nVar = a11 instanceof c30.n ? (c30.n) a11 : null;
        if (nVar != null) {
            ProtoBuf.Class Z0 = nVar.Z0();
            GeneratedMessageLite.f<ProtoBuf.Class, List<ProtoBuf.Property>> classLocalVariable = JvmProtoBuf.f67480j;
            kotlin.jvm.internal.g0.o(classLocalVariable, "classLocalVariable");
            ProtoBuf.Property property = (ProtoBuf.Property) k20.e.b(Z0, classLocalVariable, i11);
            if (property != null) {
                return (p10.q0) q2.h(g(), property, nVar.Y0().g(), nVar.Y0().j(), nVar.b1(), d.f67174a);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @m80.k
    public Collection<p10.q0> S(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        x20.k h02 = h0();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return a00.r0.I4(h02.c(name, noLookupLocation), i0().c(name, noLookupLocation));
    }

    public final p10.b b0(n20.b bVar, u10.k kVar) {
        s10.k kVar2 = new s10.k(new s10.p(kVar.b(), bVar.f()), bVar.h(), Modality.FINAL, ClassKind.CLASS, a00.g0.l(kVar.b().q().h().s()), p10.x0.f78622a, false, kVar.a().u());
        kVar2.F0(new c(kVar2, kVar.a().u()), w1.k(), null);
        return kVar2;
    }

    @Override // h10.d
    @m80.k
    public List<h10.r> c() {
        return this.f67152e.getValue().X();
    }

    public final p10.b c0(n20.b bVar, u10.k kVar) {
        KotlinClassHeader b11;
        if (g().isSynthetic()) {
            return b0(bVar, kVar);
        }
        u10.f a11 = u10.f.f91513c.a(g());
        KotlinClassHeader.Kind c11 = (a11 == null || (b11 = a11.b()) == null) ? null : b11.c();
        switch (c11 == null ? -1 : b.f67173a[c11.ordinal()]) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError("Unresolved class: " + g() + " (kind = " + c11 + ')');
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                return b0(bVar, kVar);
            case 5:
                throw new KotlinReflectionInternalError("Unknown class: " + g() + " (kind = " + c11 + ')');
        }
    }

    public final n20.b e0() {
        return u.f67731a.c(g());
    }

    @Override // h10.d
    public boolean equals(@m80.l Object obj) {
        return (obj instanceof f) && kotlin.jvm.internal.g0.g(w00.b.g(this), w00.b.g((h10.d) obj));
    }

    @Override // h10.d
    @m80.k
    public Collection<h10.i<T>> f() {
        return this.f67152e.getValue().L();
    }

    @m80.k
    public final c0<f<T>.a> f0() {
        return this.f67152e;
    }

    @Override // kotlin.jvm.internal.s
    @m80.k
    public Class<T> g() {
        return this.f67151d;
    }

    @Override // k10.v0
    @m80.k
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public p10.b a() {
        return this.f67152e.getValue().P();
    }

    @Override // h10.b
    @m80.k
    public List<Annotation> getAnnotations() {
        return this.f67152e.getValue().K();
    }

    @Override // h10.d
    @m80.k
    public List<h10.s> getTypeParameters() {
        return this.f67152e.getValue().Y();
    }

    @Override // h10.d
    @m80.l
    public KVisibility getVisibility() {
        p10.p visibility = a().getVisibility();
        kotlin.jvm.internal.g0.o(visibility, "getVisibility(...)");
        return q2.t(visibility);
    }

    @m80.k
    public final x20.k h0() {
        return a().s().r();
    }

    @Override // h10.d
    public int hashCode() {
        return w00.b.g(this).hashCode();
    }

    @Override // h10.d
    public boolean i() {
        return a().i();
    }

    @m80.k
    public final x20.k i0() {
        x20.k r02 = a().r0();
        kotlin.jvm.internal.g0.o(r02, "getStaticScope(...)");
        return r02;
    }

    @Override // h10.d
    public boolean isAbstract() {
        return a().k() == Modality.ABSTRACT;
    }

    @Override // h10.d
    public boolean isFinal() {
        return a().k() == Modality.FINAL;
    }

    @Override // h10.d
    public boolean isOpen() {
        return a().k() == Modality.OPEN;
    }

    @Override // h10.d
    public boolean k() {
        return a().k() == Modality.SEALED;
    }

    @Override // h10.d
    @m80.k
    public List<h10.d<? extends T>> p() {
        return this.f67152e.getValue().V();
    }

    @Override // h10.h
    @m80.k
    public Collection<h10.c<?>> q() {
        return this.f67152e.getValue().H();
    }

    @m80.k
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        n20.b e02 = e0();
        n20.c f11 = e02.f();
        if (f11.d()) {
            str = "";
        } else {
            str = f11.b() + '.';
        }
        String b11 = e02.g().b();
        kotlin.jvm.internal.g0.o(b11, "asString(...)");
        sb2.append(str + u30.f0.y2(b11, '.', '$', false, 4, null));
        return sb2.toString();
    }

    @Override // h10.d
    public boolean u() {
        return a().u();
    }

    @Override // h10.d
    public boolean v() {
        return a().v();
    }

    @Override // h10.d
    public boolean w() {
        return a().w();
    }

    @Override // h10.d
    @m80.l
    public String x() {
        return this.f67152e.getValue().U();
    }

    @Override // h10.d
    @m80.k
    public Collection<h10.d<?>> y() {
        return this.f67152e.getValue().S();
    }

    @Override // h10.d
    @m80.l
    public T z() {
        return this.f67152e.getValue().T();
    }
}
