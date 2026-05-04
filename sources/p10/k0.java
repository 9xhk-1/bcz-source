package p10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPackageFragmentProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageFragmentProviderImpl.kt\norg/jetbrains/kotlin/descriptors/PackageFragmentProviderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n865#2,2:43\n2632#2,3:45\n774#2:48\n865#2,2:49\n*S KotlinDebug\n*F\n+ 1 PackageFragmentProviderImpl.kt\norg/jetbrains/kotlin/descriptors/PackageFragmentProviderImpl\n*L\n26#1:43,2\n30#1:45,3\n34#1:48\n34#1:49,2\n*E\n"})
/* loaded from: classes8.dex */
public final class k0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Collection<g0> f78572a;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(@m80.k Collection<? extends g0> packageFragments) {
        kotlin.jvm.internal.g0.p(packageFragments, "packageFragments");
        this.f78572a = packageFragments;
    }

    public static final n20.c f(g0 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.d();
    }

    public static final boolean g(n20.c cVar, n20.c it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return !it.d() && kotlin.jvm.internal.g0.g(it.e(), cVar);
    }

    @Override // p10.m0
    public boolean a(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        Collection<g0> collection = this.f78572a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.g0.g(((g0) it.next()).d(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // p10.h0
    @yz.n(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @m80.k
    public List<g0> b(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        Collection<g0> collection = this.f78572a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (kotlin.jvm.internal.g0.g(((g0) obj).d(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p10.m0
    public void c(@m80.k n20.c fqName, @m80.k Collection<g0> packageFragments) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        kotlin.jvm.internal.g0.p(packageFragments, "packageFragments");
        for (Object obj : this.f78572a) {
            if (kotlin.jvm.internal.g0.g(((g0) obj).d(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // p10.h0
    @m80.k
    public Collection<n20.c> m(@m80.k n20.c fqName, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
        return q30.k0.I3(q30.k0.P0(q30.k0.N1(a00.r0.E1(this.f78572a), i0.f78570a), new j0(fqName)));
    }
}
