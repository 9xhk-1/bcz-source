package s10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCompositePackageFragmentProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositePackageFragmentProvider.kt\norg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1734#2,3:64\n*S KotlinDebug\n*F\n+ 1 CompositePackageFragmentProvider.kt\norg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider\n*L\n51#1:64,3\n*E\n"})
/* loaded from: classes8.dex */
public final class l implements p10.m0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<p10.h0> f87248a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f87249b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@m80.k List<? extends p10.h0> providers, @m80.k String debugName) {
        kotlin.jvm.internal.g0.p(providers, "providers");
        kotlin.jvm.internal.g0.p(debugName, "debugName");
        this.f87248a = providers;
        this.f87249b = debugName;
        providers.size();
        a00.r0.f6(providers).size();
    }

    @Override // p10.m0
    public boolean a(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        List<p10.h0> list = this.f87248a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!p10.l0.b((p10.h0) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // p10.h0
    @yz.n(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @m80.k
    public List<p10.g0> b(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<p10.h0> it = this.f87248a.iterator();
        while (it.hasNext()) {
            p10.l0.a(it.next(), fqName, arrayList);
        }
        return a00.r0.a6(arrayList);
    }

    @Override // p10.m0
    public void c(@m80.k n20.c fqName, @m80.k Collection<p10.g0> packageFragments) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        kotlin.jvm.internal.g0.p(packageFragments, "packageFragments");
        Iterator<p10.h0> it = this.f87248a.iterator();
        while (it.hasNext()) {
            p10.l0.a(it.next(), fqName, packageFragments);
        }
    }

    @Override // p10.h0
    @m80.k
    public Collection<n20.c> m(@m80.k n20.c fqName, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator<p10.h0> it = this.f87248a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().m(fqName, nameFilter));
        }
        return hashSet;
    }

    @m80.k
    public String toString() {
        return this.f87249b;
    }
}
