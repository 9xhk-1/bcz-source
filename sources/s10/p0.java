package s10;

import a00.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import x20.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class p0 extends x20.l {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p10.a0 f87261b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final n20.c f87262c;

    public p0(@m80.k p10.a0 moduleDescriptor, @m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        this.f87261b = moduleDescriptor;
        this.f87262c = fqName;
    }

    @Override // x20.l, x20.n
    @m80.k
    public Collection<p10.h> f(@m80.k x20.d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
        if (!kindFilter.a(x20.d.f97078c.f())) {
            return a00.h0.J();
        }
        if (this.f87262c.d() && kindFilter.l().contains(c.b.f97077a)) {
            return a00.h0.J();
        }
        Collection<n20.c> m11 = this.f87261b.m(this.f87262c, nameFilter);
        ArrayList arrayList = new ArrayList(m11.size());
        Iterator<n20.c> it = m11.iterator();
        while (it.hasNext()) {
            n20.f g11 = it.next().g();
            kotlin.jvm.internal.g0.o(g11, "shortName(...)");
            if (nameFilter.invoke(g11).booleanValue()) {
                o30.a.a(arrayList, i(g11));
            }
        }
        return arrayList;
    }

    @Override // x20.l, x20.k
    @m80.k
    public Set<n20.f> g() {
        return w1.k();
    }

    @m80.l
    public final p10.n0 i(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        if (name.g()) {
            return null;
        }
        p10.a0 a0Var = this.f87261b;
        n20.c c11 = this.f87262c.c(name);
        kotlin.jvm.internal.g0.o(c11, "child(...)");
        p10.n0 h02 = a0Var.h0(c11);
        if (h02.isEmpty()) {
            return null;
        }
        return h02;
    }

    @m80.k
    public String toString() {
        return "subpackages of " + this.f87262c + " from " + this.f87261b;
    }
}
