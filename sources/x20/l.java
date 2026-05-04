package x20;

import a00.h0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import p10.q0;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMemberScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScopeImpl.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeImpl\n+ 2 CollectionUtil.kt\norg/jetbrains/kotlin/utils/CollectionUtilKt\n*L\n1#1,56:1\n18#2,6:57\n18#2,6:63\n*S KotlinDebug\n*F\n+ 1 MemberScopeImpl.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeImpl\n*L\n44#1:57,6\n49#1:63,6\n*E\n"})
/* loaded from: classes8.dex */
public abstract class l implements k {
    @Override // x20.k, x20.n
    @m80.k
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return h0.J();
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> b() {
        Collection<p10.h> f11 = f(d.f97097v, o30.j.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : f11) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) {
                n20.f name = ((kotlin.reflect.jvm.internal.impl.descriptors.g) obj).getName();
                g0.o(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // x20.k
    @m80.k
    public Collection<? extends q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return h0.J();
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> d() {
        Collection<p10.h> f11 = f(d.f97098w, o30.j.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : f11) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) {
                n20.f name = ((kotlin.reflect.jvm.internal.impl.descriptors.g) obj).getName();
                g0.o(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
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
        return h0.J();
    }

    @Override // x20.k
    @m80.l
    public Set<n20.f> g() {
        return null;
    }

    @Override // x20.n
    @m80.l
    public p10.d h(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return null;
    }
}
