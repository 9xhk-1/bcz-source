package c20;

import a00.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJvmPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope\n+ 2 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,109:1\n92#2,14:110\n60#2,5:124\n60#2,5:129\n60#2,5:134\n10494#3,5:139\n10494#3,5:144\n1611#4,9:149\n1863#4:158\n1864#4:160\n1620#4:161\n1#5:159\n37#6,2:162\n*S KotlinDebug\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope\n*L\n58#1:110,14\n63#1:124,5\n68#1:129,5\n74#1:134,5\n76#1:139,5\n80#1:144,5\n46#1:149,9\n46#1:158\n46#1:160\n46#1:161\n46#1:159\n49#1:162,2\n*E\n"})
/* loaded from: classes8.dex */
public final class f implements x20.k {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f7542f = {kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(f.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b20.k f7543b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d0 f7544c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final g0 f7545d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final d30.i f7546e;

    public f(@m80.k b20.k c11, @m80.k f20.u jPackage, @m80.k d0 packageFragment) {
        kotlin.jvm.internal.g0.p(c11, "c");
        kotlin.jvm.internal.g0.p(jPackage, "jPackage");
        kotlin.jvm.internal.g0.p(packageFragment, "packageFragment");
        this.f7543b = c11;
        this.f7544c = packageFragment;
        this.f7545d = new g0(c11, jPackage, packageFragment);
        this.f7546e = c11.e().f(new e(this));
    }

    public static final x20.k[] l(f fVar) {
        Collection<h20.x> values = fVar.f7544c.J0().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            x20.k c11 = fVar.f7543b.a().b().c(fVar.f7544c, (h20.x) it.next());
            if (c11 != null) {
                arrayList.add(c11);
            }
        }
        return (x20.k[]) n30.a.b(arrayList).toArray(new x20.k[0]);
    }

    @Override // x20.k, x20.n
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        e(name, location);
        g0 g0Var = this.f7545d;
        x20.k[] k11 = k();
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> a11 = g0Var.a(name, location);
        int length = k11.length;
        int i11 = 0;
        Collection collection = a11;
        while (i11 < length) {
            Collection a12 = n30.a.a(collection, k11[i11].a(name, location));
            i11++;
            collection = a12;
        }
        return collection == null ? w1.k() : collection;
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> b() {
        x20.k[] k11 = k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (x20.k kVar : k11) {
            a00.m0.s0(linkedHashSet, kVar.b());
        }
        linkedHashSet.addAll(this.f7545d.b());
        return linkedHashSet;
    }

    @Override // x20.k
    @m80.k
    public Collection<p10.q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        e(name, location);
        g0 g0Var = this.f7545d;
        x20.k[] k11 = k();
        Collection<? extends p10.q0> c11 = g0Var.c(name, location);
        int length = k11.length;
        int i11 = 0;
        Collection collection = c11;
        while (i11 < length) {
            Collection a11 = n30.a.a(collection, k11[i11].c(name, location));
            i11++;
            collection = a11;
        }
        return collection == null ? w1.k() : collection;
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> d() {
        x20.k[] k11 = k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (x20.k kVar : k11) {
            a00.m0.s0(linkedHashSet, kVar.d());
        }
        linkedHashSet.addAll(this.f7545d.d());
        return linkedHashSet;
    }

    @Override // x20.n
    public void e(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        w10.a.b(this.f7543b.a().l(), location, this.f7544c, name);
    }

    @Override // x20.n
    @m80.k
    public Collection<p10.h> f(@m80.k x20.d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
        g0 g0Var = this.f7545d;
        x20.k[] k11 = k();
        Collection<p10.h> f11 = g0Var.f(kindFilter, nameFilter);
        for (x20.k kVar : k11) {
            f11 = n30.a.a(f11, kVar.f(kindFilter, nameFilter));
        }
        return f11 == null ? w1.k() : f11;
    }

    @Override // x20.k
    @m80.l
    public Set<n20.f> g() {
        Set<n20.f> a11 = x20.m.a(a00.a0.K5(k()));
        if (a11 == null) {
            return null;
        }
        a11.addAll(this.f7545d.g());
        return a11;
    }

    @Override // x20.n
    @m80.l
    public p10.d h(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        e(name, location);
        p10.b h11 = this.f7545d.h(name, location);
        if (h11 != null) {
            return h11;
        }
        p10.d dVar = null;
        for (x20.k kVar : k()) {
            p10.d h12 = kVar.h(name, location);
            if (h12 != null) {
                if (!(h12 instanceof p10.e) || !((p10.x) h12).q0()) {
                    return h12;
                }
                if (dVar == null) {
                    dVar = h12;
                }
            }
        }
        return dVar;
    }

    @m80.k
    public final g0 j() {
        return this.f7545d;
    }

    public final x20.k[] k() {
        return (x20.k[]) d30.m.a(this.f7546e, this, f7542f[0]);
    }

    @m80.k
    public String toString() {
        return "scope for " + this.f7544c;
    }
}
