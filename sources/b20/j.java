package b20;

import a00.h0;
import b20.p;
import c20.d0;
import f20.u;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import p10.m0;
import y10.q;
import yz.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j implements m0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k f5733a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final d30.a<n20.c, d0> f5734b;

    public j(@m80.k d components) {
        g0.p(components, "components");
        k kVar = new k(components, p.a.f5747a, f0.e(null));
        this.f5733a = kVar;
        this.f5734b = kVar.e().g();
    }

    public static final d0 f(j jVar, u uVar) {
        return new d0(jVar.f5733a, uVar);
    }

    @Override // p10.m0
    public boolean a(@m80.k n20.c fqName) {
        g0.p(fqName, "fqName");
        return q.a(this.f5733a.a().d(), fqName, false, 2, null) == null;
    }

    @Override // p10.h0
    @yz.n(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @m80.k
    public List<d0> b(@m80.k n20.c fqName) {
        g0.p(fqName, "fqName");
        return h0.R(e(fqName));
    }

    @Override // p10.m0
    public void c(@m80.k n20.c fqName, @m80.k Collection<p10.g0> packageFragments) {
        g0.p(fqName, "fqName");
        g0.p(packageFragments, "packageFragments");
        o30.a.a(packageFragments, e(fqName));
    }

    public final d0 e(n20.c cVar) {
        u a11 = q.a(this.f5733a.a().d(), cVar, false, 2, null);
        if (a11 == null) {
            return null;
        }
        return this.f5734b.a(cVar, new i(this, a11));
    }

    @Override // p10.h0
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public List<n20.c> m(@m80.k n20.c fqName, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        g0.p(fqName, "fqName");
        g0.p(nameFilter, "nameFilter");
        d0 e11 = e(fqName);
        List<n20.c> L0 = e11 != null ? e11.L0() : null;
        return L0 == null ? h0.J() : L0;
    }

    @m80.k
    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f5733a.a().m();
    }
}
