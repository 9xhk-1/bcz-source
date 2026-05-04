package ab0;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import oa0.g;
import org.koin.core.error.ScopeAlreadyCreatedException;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScopeRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeRegistry.kt\norg/koin/core/registry/ScopeRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1#2:117\n37#3:118\n36#3,3:119\n13472#4,2:122\n1869#5,2:124\n*S KotlinDebug\n*F\n+ 1 ScopeRegistry.kt\norg/koin/core/registry/ScopeRegistry\n*L\n94#1:118\n94#1:119,3\n94#1:122,2\n100#1:124,2\n*E\n"})
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f2509e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f2510f = "_root_";

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final za0.c f2511g = za0.b.a(f2510f);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final na0.a f2512a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<za0.a> f2513b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, cb0.b> f2514c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final cb0.b f2515d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final za0.c a() {
            return e.f2511g;
        }

        public a() {
        }

        @v0
        public static /* synthetic */ void b() {
        }
    }

    public e(@k na0.a _koin) {
        g0.p(_koin, "_koin");
        this.f2512a = _koin;
        jb0.c cVar = jb0.c.f64013a;
        Set<za0.a> i11 = cVar.i();
        this.f2513b = i11;
        Map<String, cb0.b> h11 = cVar.h();
        this.f2514c = h11;
        cb0.b bVar = new cb0.b(f2511g, f2510f, true, null, _koin, 8, null);
        this.f2515d = bVar;
        i11.add(bVar.G());
        h11.put(bVar.p(), bVar);
    }

    public static /* synthetic */ cb0.b e(e eVar, String str, za0.a aVar, Object obj, za0.d dVar, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            obj = null;
        }
        if ((i11 & 8) != 0) {
            dVar = null;
        }
        return eVar.d(str, aVar, obj, dVar);
    }

    public final void b() {
        c();
        this.f2514c.clear();
        this.f2513b.clear();
    }

    public final void c() {
        for (Object obj : this.f2514c.values().toArray(new cb0.b[0])) {
            ((cb0.b) obj).d();
        }
    }

    @v0
    @k
    public final cb0.b d(@k String scopeId, @k za0.a qualifier, @l Object obj, @l za0.d dVar) {
        g0.p(scopeId, "scopeId");
        g0.p(qualifier, "qualifier");
        this.f2512a.w().a("| (+) Scope - id:'" + scopeId + "' q:'" + qualifier + '\'');
        if (!this.f2513b.contains(qualifier)) {
            this.f2512a.w().a("| Scope '" + qualifier + "' not defined. Creating it ...");
            this.f2513b.add(qualifier);
        }
        if (this.f2514c.containsKey(scopeId)) {
            throw new ScopeAlreadyCreatedException("Scope with id '" + scopeId + "' is already created");
        }
        cb0.b bVar = new cb0.b(qualifier, scopeId, false, dVar, this.f2512a, 4, null);
        if (obj != null) {
            this.f2512a.w().a("|- Scope source set id:'" + scopeId + "' -> " + obj);
            bVar.e0(obj);
        }
        bVar.U(this.f2515d);
        this.f2514c.put(scopeId, bVar);
        return bVar;
    }

    public final void f(@k cb0.b scope) {
        g0.p(scope, "scope");
        this.f2512a.u().g(scope);
        this.f2514c.remove(scope.p());
    }

    public final void g(@k String scopeId) {
        g0.p(scopeId, "scopeId");
        cb0.b bVar = this.f2514c.get(scopeId);
        if (bVar != null) {
            f(bVar);
        }
    }

    @k
    public final cb0.b h() {
        return this.f2515d;
    }

    @k
    public final Set<za0.a> j() {
        return this.f2513b;
    }

    @l
    @v0
    public final cb0.b k(@k String scopeId) {
        g0.p(scopeId, "scopeId");
        return this.f2514c.get(scopeId);
    }

    public final void l(va0.c cVar) {
        this.f2513b.addAll(cVar.k());
    }

    public final void m(@k Set<va0.c> modules) {
        g0.p(modules, "modules");
        Iterator<T> it = modules.iterator();
        while (it.hasNext()) {
            l((va0.c) it.next());
        }
    }

    @g
    public static /* synthetic */ void i() {
    }
}
