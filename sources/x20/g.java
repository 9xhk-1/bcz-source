package x20;

import a00.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import p10.b1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInnerClassesScopeWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerClassesScopeWrapper.kt\norg/jetbrains/kotlin/resolve/scopes/InnerClassesScopeWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n808#2,11:56\n*S KotlinDebug\n*F\n+ 1 InnerClassesScopeWrapper.kt\norg/jetbrains/kotlin/resolve/scopes/InnerClassesScopeWrapper\n*L\n35#1:56,11\n*E\n"})
/* loaded from: classes8.dex */
public final class g extends l {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k f97112b;

    public g(@m80.k k workerScope) {
        g0.p(workerScope, "workerScope");
        this.f97112b = workerScope;
    }

    @Override // x20.l, x20.k
    @m80.k
    public Set<n20.f> b() {
        return this.f97112b.b();
    }

    @Override // x20.l, x20.k
    @m80.k
    public Set<n20.f> d() {
        return this.f97112b.d();
    }

    @Override // x20.l, x20.n
    public void e(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        this.f97112b.e(name, location);
    }

    @Override // x20.l, x20.k
    @m80.l
    public Set<n20.f> g() {
        return this.f97112b.g();
    }

    @Override // x20.l, x20.n
    @m80.l
    public p10.d h(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        p10.d h11 = this.f97112b.h(name, location);
        if (h11 != null) {
            p10.b bVar = h11 instanceof p10.b ? (p10.b) h11 : null;
            if (bVar != null) {
                return bVar;
            }
            if (h11 instanceof b1) {
                return (b1) h11;
            }
        }
        return null;
    }

    @Override // x20.l, x20.n
    @m80.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public List<p10.d> f(@m80.k d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        g0.p(kindFilter, "kindFilter");
        g0.p(nameFilter, "nameFilter");
        d n11 = kindFilter.n(d.f97078c.c());
        if (n11 == null) {
            return h0.J();
        }
        Collection<p10.h> f11 = this.f97112b.f(n11, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f11) {
            if (obj instanceof p10.e) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @m80.k
    public String toString() {
        return "Classes from " + this.f97112b;
    }
}
