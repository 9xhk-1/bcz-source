package x20;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.g0;
import p10.q0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a implements k {
    @Override // x20.k, x20.n
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return j().a(name, location);
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> b() {
        return j().b();
    }

    @Override // x20.k
    @m80.k
    public Collection<q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return j().c(name, location);
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> d() {
        return j().d();
    }

    @Override // x20.n
    public void e(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        j().e(name, location);
    }

    @Override // x20.n
    @m80.k
    public Collection<p10.h> f(@m80.k d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        g0.p(kindFilter, "kindFilter");
        g0.p(nameFilter, "nameFilter");
        return j().f(kindFilter, nameFilter);
    }

    @Override // x20.k
    @m80.l
    public Set<n20.f> g() {
        return j().g();
    }

    @Override // x20.n
    @m80.l
    public p10.d h(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return j().h(name, location);
    }

    @m80.k
    public final k i() {
        if (!(j() instanceof a)) {
            return j();
        }
        k j11 = j();
        g0.n(j11, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((a) j11).i();
    }

    @m80.k
    public abstract k j();
}
