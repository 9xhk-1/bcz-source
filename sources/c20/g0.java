package c20;

import a00.w1;
import c20.c;
import h20.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import x20.d;
import y10.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLazyJavaPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1628#2,3:190\n1619#2:193\n1863#2:194\n1864#2:196\n1620#2:197\n774#2:198\n865#2,2:199\n1#3:195\n1#3:201\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n*L\n160#1:190,3\n162#1:193\n162#1:194\n162#1:196\n162#1:197\n185#1:198\n185#1:199,2\n162#1:195\n*E\n"})
/* loaded from: classes8.dex */
public final class g0 extends a1 {

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final f20.u f7550n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final d0 f7551o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final d30.j<Set<String>> f7552p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final d30.h<a, p10.b> f7553q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final n20.f f7554a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final f20.g f7555b;

        public a(@m80.k n20.f name, @m80.l f20.g gVar) {
            kotlin.jvm.internal.g0.p(name, "name");
            this.f7554a = name;
            this.f7555b = gVar;
        }

        @m80.l
        public final f20.g a() {
            return this.f7555b;
        }

        @m80.k
        public final n20.f b() {
            return this.f7554a;
        }

        public boolean equals(@m80.l Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f7554a, ((a) obj).f7554a);
        }

        public int hashCode() {
            return this.f7554a.hashCode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final p10.b f7556a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@m80.k p10.b descriptor) {
                super(null);
                kotlin.jvm.internal.g0.p(descriptor, "descriptor");
                this.f7556a = descriptor;
            }

            @m80.k
            public final p10.b a() {
                return this.f7556a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: c20.g0$b$b, reason: collision with other inner class name */
        public static final class C0128b extends b {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final C0128b f7557a = new C0128b();

            public C0128b() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final c f7558a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(@m80.k b20.k c11, @m80.k f20.u jPackage, @m80.k d0 ownerDescriptor) {
        super(c11);
        kotlin.jvm.internal.g0.p(c11, "c");
        kotlin.jvm.internal.g0.p(jPackage, "jPackage");
        kotlin.jvm.internal.g0.p(ownerDescriptor, "ownerDescriptor");
        this.f7550n = jPackage;
        this.f7551o = ownerDescriptor;
        this.f7552p = c11.e().e(new e0(c11, this));
        this.f7553q = c11.e().h(new f0(this, c11));
    }

    public static final p10.b j0(g0 g0Var, b20.k kVar, a request) {
        kotlin.jvm.internal.g0.p(request, "request");
        n20.b bVar = new n20.b(g0Var.S().d(), request.b());
        v.a a11 = request.a() != null ? kVar.a().j().a(request.a(), g0Var.n0()) : kVar.a().j().c(bVar, g0Var.n0());
        h20.x a12 = a11 != null ? a11.a() : null;
        n20.b a13 = a12 != null ? a12.a() : null;
        if (a13 != null && (a13.j() || a13.i())) {
            return null;
        }
        b q02 = g0Var.q0(a12);
        if (q02 instanceof b.a) {
            return ((b.a) q02).a();
        }
        if (q02 instanceof b.c) {
            return null;
        }
        if (!(q02 instanceof b.C0128b)) {
            throw new NoWhenBranchMatchedException();
        }
        f20.g a14 = request.a();
        if (a14 == null) {
            y10.r d11 = kVar.a().d();
            v.a.C0656a c0656a = a11 instanceof v.a.C0656a ? (v.a.C0656a) a11 : null;
            a14 = d11.b(new r.a(bVar, c0656a != null ? c0656a.b() : null, null, 4, null));
        }
        f20.g gVar = a14;
        if ((gVar != null ? gVar.B() : null) != LightClassOriginKind.BINARY) {
            n20.c d12 = gVar != null ? gVar.d() : null;
            if (d12 == null || d12.d() || !kotlin.jvm.internal.g0.g(d12.e(), g0Var.S().d())) {
                return null;
            }
            n nVar = new n(kVar, g0Var.S(), gVar, null, 8, null);
            kVar.a().e().a(nVar);
            return nVar;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + h20.w.a(kVar.a().j(), gVar, g0Var.n0()) + "\nfindKotlinClass(ClassId) = " + h20.w.b(kVar.a().j(), bVar, g0Var.n0()) + '\n');
    }

    public static final Set p0(b20.k kVar, g0 g0Var) {
        return kVar.a().d().a(g0Var.S().d());
    }

    @Override // c20.t0
    @m80.k
    public c A() {
        return c.a.f7527a;
    }

    @Override // c20.t0
    public void C(@m80.k Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> result, @m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(result, "result");
        kotlin.jvm.internal.g0.p(name, "name");
    }

    @Override // c20.t0
    @m80.k
    public Set<n20.f> E(@m80.k x20.d kindFilter, @m80.l x00.l<? super n20.f, Boolean> lVar) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        return w1.k();
    }

    @Override // c20.t0, x20.l, x20.k
    @m80.k
    public Collection<p10.q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        return a00.h0.J();
    }

    @Override // c20.t0, x20.l, x20.n
    @m80.k
    public Collection<p10.h> f(@m80.k x20.d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
        d.a aVar = x20.d.f97078c;
        if (!kindFilter.a(aVar.e() | aVar.c())) {
            return a00.h0.J();
        }
        Collection<p10.h> invoke = L().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : invoke) {
            p10.h hVar = (p10.h) obj;
            if (hVar instanceof p10.b) {
                n20.f name = ((p10.b) hVar).getName();
                kotlin.jvm.internal.g0.o(name, "getName(...)");
                if (nameFilter.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final p10.b k0(n20.f fVar, f20.g gVar) {
        if (!n20.h.f74300a.a(fVar)) {
            return null;
        }
        Set<String> invoke = this.f7552p.invoke();
        if (gVar != null || invoke == null || invoke.contains(fVar.b())) {
            return this.f7553q.invoke(new a(fVar, gVar));
        }
        return null;
    }

    @m80.l
    public final p10.b l0(@m80.k f20.g javaClass) {
        kotlin.jvm.internal.g0.p(javaClass, "javaClass");
        return k0(javaClass.getName(), javaClass);
    }

    @Override // x20.l, x20.n
    @m80.l
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public p10.b h(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        return k0(name, null);
    }

    public final m20.e n0() {
        return o30.c.a(M().a().b().f().g());
    }

    @Override // c20.t0
    @m80.k
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public d0 S() {
        return this.f7551o;
    }

    public final b q0(h20.x xVar) {
        if (xVar == null) {
            return b.C0128b.f7557a;
        }
        if (xVar.b().c() != KotlinClassHeader.Kind.CLASS) {
            return b.c.f7558a;
        }
        p10.b n11 = M().a().b().n(xVar);
        return n11 != null ? new b.a(n11) : b.C0128b.f7557a;
    }

    @Override // c20.t0
    @m80.k
    public Set<n20.f> w(@m80.k x20.d kindFilter, @m80.l x00.l<? super n20.f, Boolean> lVar) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        if (!kindFilter.a(x20.d.f97078c.e())) {
            return w1.k();
        }
        Set<String> invoke = this.f7552p.invoke();
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = invoke.iterator();
            while (it.hasNext()) {
                hashSet.add(n20.f.f((String) it.next()));
            }
            return hashSet;
        }
        f20.u uVar = this.f7550n;
        if (lVar == null) {
            lVar = o30.j.k();
        }
        Collection<f20.g> F = uVar.F(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (f20.g gVar : F) {
            n20.f name = gVar.B() == LightClassOriginKind.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // c20.t0
    @m80.k
    public Set<n20.f> y(@m80.k x20.d kindFilter, @m80.l x00.l<? super n20.f, Boolean> lVar) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        return w1.k();
    }
}
