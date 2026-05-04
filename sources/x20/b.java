package x20;

import a00.a0;
import a00.h0;
import a00.m0;
import a00.w1;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import p10.q0;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nChainedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope\n+ 2 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,91:1\n92#2,14:92\n47#2,11:106\n47#2,11:117\n47#2,11:128\n10494#3,5:139\n10494#3,5:144\n13409#3,2:149\n*S KotlinDebug\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope\n*L\n35#1:92,14\n38#1:106,11\n41#1:117,11\n44#1:128,11\n46#1:139,5\n47#1:144,5\n51#1:149,2\n*E\n"})
/* loaded from: classes8.dex */
public final class b implements k {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f97072d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f97073b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final k[] f97074c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nChainedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,91:1\n37#2,2:92\n*S KotlinDebug\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope$Companion\n*L\n87#1:92,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final k a(@m80.k String debugName, @m80.k Iterable<? extends k> scopes) {
            g0.p(debugName, "debugName");
            g0.p(scopes, "scopes");
            o30.k kVar = new o30.k();
            for (k kVar2 : scopes) {
                if (kVar2 != k.c.f97119b) {
                    if (kVar2 instanceof b) {
                        m0.u0(kVar, ((b) kVar2).f97074c);
                    } else {
                        kVar.add(kVar2);
                    }
                }
            }
            return b(debugName, kVar);
        }

        @m80.k
        public final k b(@m80.k String debugName, @m80.k List<? extends k> scopes) {
            g0.p(debugName, "debugName");
            g0.p(scopes, "scopes");
            int size = scopes.size();
            return size != 0 ? size != 1 ? new b(debugName, (k[]) scopes.toArray(new k[0]), null) : scopes.get(0) : k.c.f97119b;
        }

        public a() {
        }
    }

    public /* synthetic */ b(String str, k[] kVarArr, kotlin.jvm.internal.v vVar) {
        this(str, kVarArr);
    }

    @Override // x20.k, x20.n
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        k[] kVarArr = this.f97074c;
        int length = kVarArr.length;
        if (length == 0) {
            return h0.J();
        }
        if (length == 1) {
            return kVarArr[0].a(name, location);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> collection = null;
        for (k kVar : kVarArr) {
            collection = n30.a.a(collection, kVar.a(name, location));
        }
        return collection == null ? w1.k() : collection;
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> b() {
        k[] kVarArr = this.f97074c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : kVarArr) {
            m0.s0(linkedHashSet, kVar.b());
        }
        return linkedHashSet;
    }

    @Override // x20.k
    @m80.k
    public Collection<q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        k[] kVarArr = this.f97074c;
        int length = kVarArr.length;
        if (length == 0) {
            return h0.J();
        }
        if (length == 1) {
            return kVarArr[0].c(name, location);
        }
        Collection<q0> collection = null;
        for (k kVar : kVarArr) {
            collection = n30.a.a(collection, kVar.c(name, location));
        }
        return collection == null ? w1.k() : collection;
    }

    @Override // x20.k
    @m80.k
    public Set<n20.f> d() {
        k[] kVarArr = this.f97074c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : kVarArr) {
            m0.s0(linkedHashSet, kVar.d());
        }
        return linkedHashSet;
    }

    @Override // x20.n
    public void e(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        for (k kVar : this.f97074c) {
            kVar.e(name, location);
        }
    }

    @Override // x20.n
    @m80.k
    public Collection<p10.h> f(@m80.k d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        g0.p(kindFilter, "kindFilter");
        g0.p(nameFilter, "nameFilter");
        k[] kVarArr = this.f97074c;
        int length = kVarArr.length;
        if (length == 0) {
            return h0.J();
        }
        if (length == 1) {
            return kVarArr[0].f(kindFilter, nameFilter);
        }
        Collection<p10.h> collection = null;
        for (k kVar : kVarArr) {
            collection = n30.a.a(collection, kVar.f(kindFilter, nameFilter));
        }
        return collection == null ? w1.k() : collection;
    }

    @Override // x20.k
    @m80.l
    public Set<n20.f> g() {
        return m.a(a0.K5(this.f97074c));
    }

    @Override // x20.n
    @m80.l
    public p10.d h(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        p10.d dVar = null;
        for (k kVar : this.f97074c) {
            p10.d h11 = kVar.h(name, location);
            if (h11 != null) {
                if (!(h11 instanceof p10.e) || !((p10.x) h11).q0()) {
                    return h11;
                }
                if (dVar == null) {
                    dVar = h11;
                }
            }
        }
        return dVar;
    }

    @m80.k
    public String toString() {
        return this.f97073b;
    }

    public b(String str, k[] kVarArr) {
        this.f97073b = str;
        this.f97074c = kVarArr;
    }
}
