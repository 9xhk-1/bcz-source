package kotlin.reflect.jvm.internal;

import a00.h0;
import a30.j0;
import java.util.Collection;
import java.util.List;
import k10.h1;
import k10.i1;
import k10.j1;
import k10.k1;
import k10.l1;
import k10.m1;
import k10.q2;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.t;
import p10.q0;
import u30.f0;
import x20.k;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKPackageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPackageImpl.kt\nkotlin/reflect/jvm/internal/KPackageImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes8.dex */
public final class k extends KDeclarationContainerImpl {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Class<?> f67676d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c0<a> f67677e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends KDeclarationContainerImpl.b {

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ h10.n<Object>[] f67678j = {o0.u(new PropertyReference1Impl(o0.d(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), o0.u(new PropertyReference1Impl(o0.d(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final t.a f67679d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final t.a f67680e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final c0 f67681f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final c0 f67682g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final t.a f67683h;

        public a() {
            super();
            this.f67679d = t.c(new i1(k.this));
            this.f67680e = t.c(new j1(this));
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            this.f67681f = e0.b(lazyThreadSafetyMode, new k1(this, k.this));
            this.f67682g = e0.b(lazyThreadSafetyMode, new l1(this));
            this.f67683h = t.c(new m1(k.this, this));
        }

        public static final u10.f n(k kVar) {
            return u10.f.f91513c.a(kVar.g());
        }

        public static final Collection o(k kVar, a aVar) {
            return kVar.Q(aVar.m(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }

        public static final Triple p(a aVar) {
            KotlinClassHeader b11;
            u10.f i11 = aVar.i();
            if (i11 != null && (b11 = i11.b()) != null) {
                String[] a11 = b11.a();
                String[] g11 = b11.g();
                if (a11 != null && g11 != null) {
                    Pair<m20.f, ProtoBuf.Package> m11 = m20.i.m(a11, g11);
                    return new Triple(m11.component1(), m11.component2(), b11.d());
                }
            }
            return null;
        }

        public static final Class q(a aVar, k kVar) {
            KotlinClassHeader b11;
            u10.f i11 = aVar.i();
            String e11 = (i11 == null || (b11 = i11.b()) == null) ? null : b11.e();
            if (e11 == null || e11.length() <= 0) {
                return null;
            }
            return kVar.g().getClassLoader().loadClass(f0.y2(e11, '/', '.', false, 4, null));
        }

        public static final x20.k r(a aVar) {
            u10.f i11 = aVar.i();
            return i11 != null ? aVar.b().c().a(i11) : k.c.f97119b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final u10.f i() {
            return (u10.f) this.f67679d.b(this, f67678j[0]);
        }

        @m80.k
        public final Collection<e<?>> j() {
            T b11 = this.f67683h.b(this, f67678j[2]);
            g0.o(b11, "getValue(...)");
            return (Collection) b11;
        }

        @m80.l
        public final Triple<m20.f, ProtoBuf.Package, m20.e> k() {
            return (Triple) this.f67682g.getValue();
        }

        @m80.l
        public final Class<?> l() {
            return (Class) this.f67681f.getValue();
        }

        @m80.k
        public final x20.k m() {
            T b11 = this.f67680e.b(this, f67678j[1]);
            g0.o(b11, "getValue(...)");
            return (x20.k) b11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReference implements x00.p<j0, ProtoBuf.Property, q0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f67685a = new b();

        public b() {
            super(2);
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 invoke(j0 p02, ProtoBuf.Property p12) {
            g0.p(p02, "p0");
            g0.p(p12, "p1");
            return p02.u(p12);
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return o0.d(j0.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }
    }

    public k(@m80.k Class<?> jClass) {
        g0.p(jClass, "jClass");
        this.f67676d = jClass;
        this.f67677e = e0.b(LazyThreadSafetyMode.PUBLICATION, new h1(this));
    }

    public static final a Z(k kVar) {
        return kVar.new a();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> N() {
        return h0.J();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> O(@m80.k n20.f name) {
        g0.p(name, "name");
        return a0().a(name, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @m80.l
    public q0 P(int i11) {
        Triple<m20.f, ProtoBuf.Package, m20.e> k11 = this.f67677e.getValue().k();
        if (k11 != null) {
            m20.f component1 = k11.component1();
            ProtoBuf.Package component2 = k11.component2();
            m20.e component3 = k11.component3();
            GeneratedMessageLite.f<ProtoBuf.Package, List<ProtoBuf.Property>> packageLocalVariable = JvmProtoBuf.f67484n;
            g0.o(packageLocalVariable, "packageLocalVariable");
            ProtoBuf.Property property = (ProtoBuf.Property) k20.e.b(component2, packageLocalVariable, i11);
            if (property != null) {
                Class<?> g11 = g();
                ProtoBuf.TypeTable typeTable = component2.getTypeTable();
                g0.o(typeTable, "getTypeTable(...)");
                return (q0) q2.h(g11, property, component1, new k20.g(typeTable), component3, b.f67685a);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @m80.k
    public Class<?> R() {
        Class<?> l11 = this.f67677e.getValue().l();
        return l11 == null ? g() : l11;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @m80.k
    public Collection<q0> S(@m80.k n20.f name) {
        g0.p(name, "name");
        return a0().c(name, NoLookupLocation.FROM_REFLECTION);
    }

    public final x20.k a0() {
        return this.f67677e.getValue().m();
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof k) && g0.g(g(), ((k) obj).g());
    }

    @Override // kotlin.jvm.internal.s
    @m80.k
    public Class<?> g() {
        return this.f67676d;
    }

    public int hashCode() {
        return g().hashCode();
    }

    @Override // h10.h
    @m80.k
    public Collection<h10.c<?>> q() {
        return this.f67677e.getValue().j();
    }

    @m80.k
    public String toString() {
        return "file class " + v10.f.e(g()).a();
    }
}
