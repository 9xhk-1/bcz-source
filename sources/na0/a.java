package na0;

import a00.h0;
import ab0.e;
import androidx.exifinterface.media.ExifInterface;
import h10.d;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.time.n;
import m80.k;
import m80.l;
import oa0.g;
import org.koin.core.definition.Kind;
import org.koin.core.error.ScopeNotCreatedException;
import pa0.f;
import ta0.h;
import x00.p;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKoin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Koin.kt\norg/koin/core/Koin\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n+ 3 InstanceRegistry.kt\norg/koin/core/registry/InstanceRegistry\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,354:1\n115#2:355\n130#2:356\n142#2:357\n166#2:358\n387#2:393\n170#3,2:359\n172#3,2:368\n174#3,2:377\n176#3,3:380\n179#3:384\n172#3,8:385\n122#4,7:361\n99#4,7:370\n1869#5:379\n1870#5:383\n24#6:394\n63#6,3:395\n*S KotlinDebug\n*F\n+ 1 Koin.kt\norg/koin/core/Koin\n*L\n102#1:355\n116#1:356\n127#1:357\n140#1:358\n195#1:393\n187#1:359,2\n187#1:368,2\n187#1:377,2\n187#1:380,3\n187#1:384\n187#1:385,8\n187#1:361,7\n187#1:370,7\n187#1:379\n187#1:383\n348#1:394\n348#1:395,3\n*E\n"})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public ua0.b f75021a = new ua0.a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final bb0.a f75022b = new bb0.a(this);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f75023c = new e(this);

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ab0.a f75024d = new ab0.a(this);

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ab0.c f75025e = new ab0.c(this);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final sa0.a f75026f = new sa0.a(this);

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ab0.b f75027g = new ab0.b();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: na0.a$a, reason: collision with other inner class name */
    public static final class C0909a<T> implements p<cb0.b, ya0.a, T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f75028a;

        public C0909a(Object obj) {
            this.f75028a = obj;
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(cb0.b _createDefinition, ya0.a it) {
            g0.p(_createDefinition, "$this$_createDefinition");
            g0.p(it, "it");
            return (T) this.f75028a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$inject$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,444:1\n142#2:445\n*S KotlinDebug\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$inject$1\n*L\n115#1:445\n*E\n"})
    public static final class b<T> implements x00.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cb0.b f75029a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f75030b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f75031c;

        public b(cb0.b bVar, za0.a aVar, x00.a aVar2) {
            this.f75029a = bVar;
            this.f75030b = aVar;
            this.f75031c = aVar2;
        }

        @Override // x00.a
        public final T invoke() {
            cb0.b bVar = this.f75029a;
            za0.a aVar = this.f75030b;
            x00.a<? extends ya0.a> aVar2 = this.f75031c;
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) bVar.i(o0.d(Object.class), aVar, aVar2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$injectOrNull$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,444:1\n166#2:445\n*S KotlinDebug\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$injectOrNull$1\n*L\n130#1:445\n*E\n"})
    public static final class c<T> implements x00.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cb0.b f75032a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f75033b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f75034c;

        public c(cb0.b bVar, za0.a aVar, x00.a aVar2) {
            this.f75032a = bVar;
            this.f75033b = aVar;
            this.f75034c = aVar2;
        }

        @Override // x00.a
        public final T invoke() {
            cb0.b bVar = this.f75032a;
            za0.a aVar = this.f75033b;
            x00.a<? extends ya0.a> aVar2 = this.f75034c;
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) bVar.u(o0.d(Object.class), aVar, aVar2);
        }
    }

    public static /* synthetic */ cb0.b C(a aVar, String str, za0.a aVar2, Object obj, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            obj = null;
        }
        return aVar.B(str, aVar2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object F(a aVar, d dVar, za0.a aVar2, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar2 = null;
        }
        if ((i11 & 4) != 0) {
            aVar3 = null;
        }
        return aVar.D(dVar, aVar2, aVar3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object G(a aVar, za0.a aVar2, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar2 = null;
        }
        if ((i11 & 2) != 0) {
            aVar3 = null;
        }
        cb0.b h11 = aVar.P().h();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return h11.u(o0.d(Object.class), aVar2, aVar3);
    }

    public static /* synthetic */ c0 S(a aVar, za0.a aVar2, LazyThreadSafetyMode mode, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar2 = null;
        }
        if ((i11 & 2) != 0) {
            mode = jb0.c.f64013a.b();
        }
        if ((i11 & 4) != 0) {
            aVar3 = null;
        }
        g0.p(mode, "mode");
        cb0.b h11 = aVar.P().h();
        g0.w();
        return e0.b(mode, new b(h11, aVar2, aVar3));
    }

    public static /* synthetic */ c0 U(a aVar, za0.a aVar2, LazyThreadSafetyMode mode, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar2 = null;
        }
        if ((i11 & 2) != 0) {
            mode = jb0.c.f64013a.b();
        }
        if ((i11 & 4) != 0) {
            aVar3 = null;
        }
        g0.p(mode, "mode");
        cb0.b h11 = aVar.P().h();
        g0.w();
        return e0.b(mode, new c(h11, aVar2, aVar3));
    }

    public static /* synthetic */ void W(a aVar, List list, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        aVar.V(list, z11, z12);
    }

    public static /* synthetic */ cb0.b g(a aVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = jb0.e.a(jb0.c.f64013a);
        }
        String scopeId = str;
        g0.p(scopeId, "scopeId");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return e.e(aVar.P(), scopeId, new za0.d(o0.d(Object.class)), null, null, 8, null);
    }

    public static /* synthetic */ cb0.b h(a aVar, String scopeId, Object obj, za0.d dVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            dVar = null;
        }
        g0.p(scopeId, "scopeId");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return aVar.P().d(scopeId, new za0.d(o0.d(Object.class)), obj, dVar);
    }

    public static /* synthetic */ cb0.b i(a aVar, String str, za0.a aVar2, Object obj, za0.d dVar, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            obj = null;
        }
        if ((i11 & 8) != 0) {
            dVar = null;
        }
        return aVar.e(str, aVar2, obj, dVar);
    }

    public static /* synthetic */ void k(a aVar, Object obj, za0.a aVar2, List list, boolean z11, int i11, Object obj2) {
        String str;
        String str2;
        za0.a aVar3 = (i11 & 2) != 0 ? null : aVar2;
        List secondaryTypes = (i11 & 4) != 0 ? h0.J() : list;
        boolean z12 = (i11 & 8) != 0 ? true : z11;
        g0.p(secondaryTypes, "secondaryTypes");
        ab0.a u11 = aVar.u();
        za0.a G = u11.j().P().h().G();
        Kind kind = Kind.Scoped;
        g0.w();
        C0909a c0909a = new C0909a(obj);
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ra0.b bVar = new ra0.b(G, o0.d(Object.class), aVar3, c0909a, kind, secondaryTypes);
        h hVar = new h(bVar);
        d<?> e11 = bVar.e();
        za0.a f11 = bVar.f();
        za0.a g11 = bVar.g();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fb0.b.a(e11));
        sb2.append(':');
        if (f11 == null || (str = f11.getValue()) == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(':');
        sb2.append(g11);
        ab0.a.q(u11, z12, sb2.toString(), hVar, false, 8, null);
        Iterator<T> it = bVar.h().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            za0.a f12 = bVar.f();
            za0.a g12 = bVar.g();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(fb0.b.a(dVar));
            sb3.append(':');
            if (f12 == null || (str2 = f12.getValue()) == null) {
                str2 = "";
            }
            sb3.append(str2);
            sb3.append(':');
            sb3.append(g12);
            ab0.a.q(u11, z12, sb3.toString(), hVar, false, 8, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object p(a aVar, d dVar, za0.a aVar2, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar2 = null;
        }
        if ((i11 & 4) != 0) {
            aVar3 = null;
        }
        return aVar.n(dVar, aVar2, aVar3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object q(a aVar, za0.a aVar2, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar2 = null;
        }
        if ((i11 & 2) != 0) {
            aVar3 = null;
        }
        cb0.b h11 = aVar.P().h();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return h11.i(o0.d(Object.class), aVar2, aVar3);
    }

    public final /* synthetic */ <T> cb0.b A(String scopeId) {
        g0.p(scopeId, "scopeId");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        za0.d dVar = new za0.d(o0.d(Object.class));
        cb0.b k11 = P().k(scopeId);
        return k11 == null ? i(this, scopeId, dVar, null, null, 12, null) : k11;
    }

    @k
    public final cb0.b B(@k String scopeId, @k za0.a qualifier, @l Object obj) {
        g0.p(scopeId, "scopeId");
        g0.p(qualifier, "qualifier");
        cb0.b k11 = this.f75023c.k(scopeId);
        return k11 == null ? i(this, scopeId, qualifier, obj, null, 8, null) : k11;
    }

    @l
    public final <T> T D(@k d<?> clazz, @l za0.a aVar, @l x00.a<? extends ya0.a> aVar2) {
        g0.p(clazz, "clazz");
        return (T) this.f75023c.h().u(clazz, aVar, aVar2);
    }

    public final /* synthetic */ <T> T E(za0.a aVar, x00.a<? extends ya0.a> aVar2) {
        cb0.b h11 = P().h();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) h11.u(o0.d(Object.class), aVar, aVar2);
    }

    @l
    public final <T> T H(@k String key) {
        g0.p(key, "key");
        return (T) this.f75025e.c(key);
    }

    @k
    public final <T> T I(@k String key, @k T defaultValue) {
        g0.p(key, "key");
        g0.p(defaultValue, "defaultValue");
        T t11 = (T) this.f75025e.c(key);
        return t11 == null ? defaultValue : t11;
    }

    @k
    public final ab0.c J() {
        return this.f75025e;
    }

    @k
    public final bb0.a L() {
        return this.f75022b;
    }

    @k
    public final cb0.b N(@k String scopeId) {
        g0.p(scopeId, "scopeId");
        cb0.b k11 = this.f75023c.k(scopeId);
        if (k11 != null) {
            return k11;
        }
        throw new ScopeNotCreatedException("No scope found for id '" + scopeId + '\'');
    }

    @l
    public final cb0.b O(@k String scopeId) {
        g0.p(scopeId, "scopeId");
        return this.f75023c.k(scopeId);
    }

    @k
    public final e P() {
        return this.f75023c;
    }

    public final /* synthetic */ <T> c0<T> R(za0.a aVar, LazyThreadSafetyMode mode, x00.a<? extends ya0.a> aVar2) {
        g0.p(mode, "mode");
        cb0.b h11 = P().h();
        g0.w();
        return e0.b(mode, new b(h11, aVar, aVar2));
    }

    public final /* synthetic */ <T> c0<T> T(za0.a aVar, LazyThreadSafetyMode mode, x00.a<? extends ya0.a> aVar2) {
        g0.p(mode, "mode");
        cb0.b h11 = P().h();
        g0.w();
        return e0.b(mode, new c(h11, aVar, aVar2));
    }

    public final void V(@k List<va0.c> modules, boolean z11, boolean z12) {
        g0.p(modules, "modules");
        Set<va0.c> g11 = va0.d.g(modules);
        this.f75024d.l(g11, z11);
        this.f75023c.m(g11);
        if (z12) {
            b();
        }
    }

    public final void X(@k String key, @k Object value) {
        g0.p(key, "key");
        g0.p(value, "value");
        this.f75025e.f(key, value);
    }

    @g
    public final void Y(@k ua0.b logger) {
        g0.p(logger, "logger");
        if (this.f75021a instanceof ua0.a) {
            this.f75021a = logger;
            return;
        }
        throw new IllegalStateException(("Trying to register Koin logger '" + logger + "' but " + this.f75021a + " is already registered!").toString());
    }

    public final void Z(@k List<va0.c> modules) {
        g0.p(modules, "modules");
        this.f75024d.v(va0.d.g(modules));
    }

    public final void a() {
        this.f75023c.b();
        this.f75024d.b();
        this.f75025e.a();
        this.f75026f.a();
    }

    public final void b() {
        this.f75021a.a("Create eager instances ...");
        long b11 = n.b.f67794b.b();
        this.f75024d.c();
        long i11 = n.b.a.i(b11);
        this.f75021a.a("Created eager instances in " + db0.a.a(i11) + " ms");
    }

    public final /* synthetic */ <T> cb0.b c(String scopeId) {
        g0.p(scopeId, "scopeId");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return e.e(P(), scopeId, new za0.d(o0.d(Object.class)), null, null, 8, null);
    }

    public final /* synthetic */ <T> cb0.b d(String scopeId, Object obj, za0.d dVar) {
        g0.p(scopeId, "scopeId");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return P().d(scopeId, new za0.d(o0.d(Object.class)), obj, dVar);
    }

    @k
    public final cb0.b e(@k String scopeId, @k za0.a qualifier, @l Object obj, @l za0.d dVar) {
        g0.p(scopeId, "scopeId");
        g0.p(qualifier, "qualifier");
        return this.f75023c.d(scopeId, qualifier, obj, dVar);
    }

    @k
    public final <T extends pa0.c> cb0.b f(@k T t11) {
        g0.p(t11, "t");
        return e.e(this.f75023c, f.i(t11), f.j(t11), null, null, 8, null);
    }

    public final /* synthetic */ <T> void j(T t11, za0.a aVar, List<? extends d<?>> secondaryTypes, boolean z11) {
        String str;
        String str2;
        g0.p(secondaryTypes, "secondaryTypes");
        ab0.a u11 = u();
        za0.a G = u11.j().P().h().G();
        Kind kind = Kind.Scoped;
        g0.w();
        C0909a c0909a = new C0909a(t11);
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ra0.b bVar = new ra0.b(G, o0.d(Object.class), aVar, c0909a, kind, secondaryTypes);
        h hVar = new h(bVar);
        d<?> e11 = bVar.e();
        za0.a f11 = bVar.f();
        za0.a g11 = bVar.g();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fb0.b.a(e11));
        sb2.append(':');
        if (f11 == null || (str = f11.getValue()) == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(':');
        sb2.append(g11);
        ab0.a.q(u11, z11, sb2.toString(), hVar, false, 8, null);
        Iterator<T> it = bVar.h().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            za0.a f12 = bVar.f();
            za0.a g12 = bVar.g();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(fb0.b.a(dVar));
            sb3.append(':');
            if (f12 == null || (str2 = f12.getValue()) == null) {
                str2 = "";
            }
            sb3.append(str2);
            sb3.append(':');
            sb3.append(g12);
            ab0.a.q(u11, z11, sb3.toString(), hVar, false, 8, null);
        }
    }

    public final void l(@k String key) {
        g0.p(key, "key");
        this.f75025e.b(key);
    }

    public final void m(@k String scopeId) {
        g0.p(scopeId, "scopeId");
        this.f75023c.g(scopeId);
    }

    public final <T> T n(@k d<?> clazz, @l za0.a aVar, @l x00.a<? extends ya0.a> aVar2) {
        g0.p(clazz, "clazz");
        return (T) this.f75023c.h().i(clazz, aVar, aVar2);
    }

    public final /* synthetic */ <T> T o(za0.a aVar, x00.a<? extends ya0.a> aVar2) {
        cb0.b h11 = P().h();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) h11.i(o0.d(Object.class), aVar, aVar2);
    }

    public final /* synthetic */ <T> List<T> r() {
        cb0.b h11 = P().h();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return h11.n(o0.d(Object.class));
    }

    @k
    public final sa0.a s() {
        return this.f75026f;
    }

    @k
    public final ab0.a u() {
        return this.f75024d;
    }

    @k
    public final ua0.b w() {
        return this.f75021a;
    }

    @k
    public final ab0.b y() {
        return this.f75027g;
    }

    @g
    public static /* synthetic */ void K() {
    }

    @g
    public static /* synthetic */ void M() {
    }

    @g
    public static /* synthetic */ void Q() {
    }

    @g
    public static /* synthetic */ void t() {
    }

    @g
    public static /* synthetic */ void v() {
    }

    @g
    public static /* synthetic */ void x() {
    }

    @g
    public static /* synthetic */ void z() {
    }
}
