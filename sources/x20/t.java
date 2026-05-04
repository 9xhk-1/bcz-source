package x20;

import e30.d2;
import e30.f2;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import p10.q0;
import p10.z0;
import x20.k;
import x20.n;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSubstitutingScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubstitutingScope.kt\norg/jetbrains/kotlin/resolve/scopes/SubstitutingScope\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n381#2,3:112\n384#2,4:116\n19#3:115\n1#4:120\n*S KotlinDebug\n*F\n+ 1 SubstitutingScope.kt\norg/jetbrains/kotlin/resolve/scopes/SubstitutingScope\n*L\n52#1:112,3\n52#1:116,4\n54#1:115\n*E\n"})
/* loaded from: classes8.dex */
public final class t implements k {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k f97129b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f97130c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final f2 f97131d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public Map<p10.h, p10.h> f97132e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final c0 f97133f;

    public t(@m80.k k workerScope, @m80.k f2 givenSubstitutor) {
        g0.p(workerScope, "workerScope");
        g0.p(givenSubstitutor, "givenSubstitutor");
        this.f97129b = workerScope;
        this.f97130c = e0.c(new r(givenSubstitutor));
        d2 j11 = givenSubstitutor.j();
        g0.o(j11, "getSubstitution(...)");
        this.f97131d = r20.e.h(j11, false, 1, null).c();
        this.f97133f = e0.c(new s(this));
    }

    public static final Collection i(t tVar) {
        return tVar.m(n.a.a(tVar.f97129b, null, null, 3, null));
    }

    public static final f2 o(f2 f2Var) {
        return f2Var.j().c();
    }

    @Override // x20.k, x20.n
    @m80.k
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return m(this.f97129b.a(name, location));
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> b() {
        return this.f97129b.b();
    }

    @Override // x20.k
    @m80.k
    public Collection<? extends q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return m(this.f97129b.c(name, location));
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> d() {
        return this.f97129b.d();
    }

    @Override // x20.n
    public void e(@m80.k n20.f fVar, @m80.k x10.b bVar) {
        k.b.a(this, fVar, bVar);
    }

    @Override // x20.n
    @m80.k
    public Collection<p10.h> f(@m80.k d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        g0.p(kindFilter, "kindFilter");
        g0.p(nameFilter, "nameFilter");
        return l();
    }

    @Override // x20.k
    @m80.l
    public Set<n20.f> g() {
        return this.f97129b.g();
    }

    @Override // x20.n
    @m80.l
    public p10.d h(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        p10.d h11 = this.f97129b.h(name, location);
        if (h11 != null) {
            return (p10.d) n(h11);
        }
        return null;
    }

    public final Collection<p10.h> l() {
        return (Collection) this.f97133f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends p10.h> Collection<D> m(Collection<? extends D> collection) {
        if (this.f97131d.k()) {
            return collection;
        }
        if (collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet g11 = o30.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g11.add(n((p10.h) it.next()));
        }
        return g11;
    }

    public final <D extends p10.h> D n(D d11) {
        if (this.f97131d.k()) {
            return d11;
        }
        if (this.f97132e == null) {
            this.f97132e = new HashMap();
        }
        Map<p10.h, p10.h> map = this.f97132e;
        g0.m(map);
        p10.h hVar = map.get(d11);
        if (hVar == null) {
            if (!(d11 instanceof z0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d11).toString());
            }
            hVar = ((z0) d11).c(this.f97131d);
            if (hVar == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d11 + " substitution fails");
            }
            map.put(d11, hVar);
        }
        D d12 = (D) hVar;
        g0.n(d12, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d12;
    }
}
