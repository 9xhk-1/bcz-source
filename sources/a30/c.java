package a30;

import a00.w1;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c implements p10.m0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d30.n f1739a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final z f1740b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p10.a0 f1741c;

    /* renamed from: d, reason: collision with root package name */
    public m f1742d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final d30.h<n20.c, p10.g0> f1743e;

    public c(@m80.k d30.n storageManager, @m80.k z finder, @m80.k p10.a0 moduleDescriptor) {
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(finder, "finder");
        kotlin.jvm.internal.g0.p(moduleDescriptor, "moduleDescriptor");
        this.f1739a = storageManager;
        this.f1740b = finder;
        this.f1741c = moduleDescriptor;
        this.f1743e = storageManager.h(new b(this));
    }

    public static final p10.g0 f(c cVar, n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        q e11 = cVar.e(fqName);
        if (e11 == null) {
            return null;
        }
        e11.G0(cVar.g());
        return e11;
    }

    @Override // p10.m0
    public boolean a(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        return (this.f1743e.h(fqName) ? (p10.g0) this.f1743e.invoke(fqName) : e(fqName)) == null;
    }

    @Override // p10.h0
    @yz.n(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @m80.k
    public List<p10.g0> b(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        return a00.h0.R(this.f1743e.invoke(fqName));
    }

    @Override // p10.m0
    public void c(@m80.k n20.c fqName, @m80.k Collection<p10.g0> packageFragments) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        kotlin.jvm.internal.g0.p(packageFragments, "packageFragments");
        o30.a.a(packageFragments, this.f1743e.invoke(fqName));
    }

    @m80.l
    public abstract q e(@m80.k n20.c cVar);

    @m80.k
    public final m g() {
        m mVar = this.f1742d;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.g0.S("components");
        return null;
    }

    @m80.k
    public final z h() {
        return this.f1740b;
    }

    @m80.k
    public final p10.a0 i() {
        return this.f1741c;
    }

    @m80.k
    public final d30.n j() {
        return this.f1739a;
    }

    public final void k(@m80.k m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<set-?>");
        this.f1742d = mVar;
    }

    @Override // p10.h0
    @m80.k
    public Collection<n20.c> m(@m80.k n20.c fqName, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
        return w1.k();
    }
}
