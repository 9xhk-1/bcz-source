package hy;

import a1.p;
import io.ktor.http.CacheControl;
import io.ktor.server.http.content.CompressedFileType;
import ix.k;
import java.io.File;
import java.net.URL;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x0<Resource> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.l<Resource, ix.k> f59999a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public x00.l<? super Resource, ix.k> f60000b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public x00.l<? super Resource, ? extends List<? extends CacheControl>> f60001c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public x00.q<? super Resource, ? super zx.b, ? super j00.c<? super g2>, ? extends Object> f60002d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public x00.l<? super Resource, Boolean> f60003e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public List<String> f60004f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public String f60005g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public List<? extends CompressedFileType> f60006h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f60007i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentConfig$modifier$1", f = "StaticContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.q<Resource, zx.b, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f60008a;

        public a(j00.c<? super a> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Resource resource, zx.b bVar, j00.c<? super g2> cVar) {
            return new a(cVar).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f60008a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return g2.f100423a;
        }
    }

    public x0() {
        p.a aVar = (x00.l<Resource, ix.k>) new x00.l() { // from class: hy.s0
            @Override // x00.l
            public final Object invoke(Object obj) {
                ix.k k11;
                k11 = x0.k(obj);
                return k11;
            }
        };
        this.f59999a = aVar;
        this.f60000b = aVar;
        this.f60001c = new x00.l() { // from class: hy.t0
            @Override // x00.l
            public final Object invoke(Object obj) {
                List g11;
                g11 = x0.g(obj);
                return g11;
            }
        };
        this.f60002d = new a(null);
        this.f60003e = new x00.l() { // from class: hy.u0
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean n11;
                n11 = x0.n(obj);
                return Boolean.valueOf(n11);
            }
        };
        this.f60004f = a00.h0.J();
        this.f60006h = a00.h0.J();
    }

    public static final List g(Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return a00.h0.J();
    }

    public static final ix.k i(x00.l lVar, x0 x0Var, Object resource) {
        kotlin.jvm.internal.g0.p(resource, "resource");
        ix.k kVar = (ix.k) lVar.invoke(resource);
        return kVar == null ? x0Var.f59999a.invoke(resource) : kVar;
    }

    public static final ix.k k(Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (it instanceof File) {
            return ix.h0.a(ix.k.f62843f, (File) it);
        }
        if (it instanceof URL) {
            k.c cVar = ix.k.f62843f;
            String path = ((URL) it).getPath();
            kotlin.jvm.internal.g0.o(path, "getPath(...)");
            return ix.l0.f(cVar, path);
        }
        if (r0.a(it)) {
            return ix.h0.b(ix.k.f62843f, io.ktor.server.engine.u0.a(it));
        }
        throw new IllegalArgumentException("Argument can be only of type File, Path or URL, but was " + kotlin.jvm.internal.o0.d(it.getClass()));
    }

    public static final boolean n(Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return false;
    }

    public static final boolean o(x00.l lVar, x00.l lVar2, Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (((Boolean) lVar.invoke(it)).booleanValue()) {
            return true;
        }
        return ((Boolean) lVar2.invoke(it)).booleanValue();
    }

    public final void A(boolean z11) {
        this.f60007i = z11;
    }

    public final void B(@m80.k x00.l<? super Resource, ? extends List<? extends CacheControl>> lVar) {
        kotlin.jvm.internal.g0.p(lVar, "<set-?>");
        this.f60001c = lVar;
    }

    public final void C(@m80.k x00.l<? super Resource, ix.k> lVar) {
        kotlin.jvm.internal.g0.p(lVar, "<set-?>");
        this.f60000b = lVar;
    }

    public final void D(@m80.l String str) {
        this.f60005g = str;
    }

    public final void E(@m80.k x00.l<? super Resource, Boolean> lVar) {
        kotlin.jvm.internal.g0.p(lVar, "<set-?>");
        this.f60003e = lVar;
    }

    public final void F(@m80.k List<String> list) {
        kotlin.jvm.internal.g0.p(list, "<set-?>");
        this.f60004f = list;
    }

    public final void G(@m80.k x00.q<? super Resource, ? super zx.b, ? super j00.c<? super g2>, ? extends Object> qVar) {
        kotlin.jvm.internal.g0.p(qVar, "<set-?>");
        this.f60002d = qVar;
    }

    public final void H(@m80.k List<? extends CompressedFileType> list) {
        kotlin.jvm.internal.g0.p(list, "<set-?>");
        this.f60006h = list;
    }

    public final void f(@m80.k x00.l<? super Resource, ? extends List<? extends CacheControl>> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        this.f60001c = block;
    }

    public final void h(@m80.k final x00.l<? super Resource, ix.k> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        this.f60000b = new x00.l() { // from class: hy.w0
            @Override // x00.l
            public final Object invoke(Object obj) {
                ix.k i11;
                i11 = x0.i(x00.l.this, this, obj);
                return i11;
            }
        };
    }

    public final void j(@m80.l String str) {
        this.f60005g = str;
    }

    public final void l() {
        this.f60007i = true;
    }

    public final void m(@m80.k final x00.l<? super Resource, Boolean> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        final x00.l<? super Resource, Boolean> lVar = this.f60003e;
        this.f60003e = new x00.l() { // from class: hy.v0
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean o11;
                o11 = x0.o(x00.l.this, block, obj);
                return Boolean.valueOf(o11);
            }
        };
    }

    public final void p(@m80.k String... extensions) {
        kotlin.jvm.internal.g0.p(extensions, "extensions");
        this.f60004f = a00.a0.dz(extensions);
    }

    public final boolean q() {
        return this.f60007i;
    }

    @m80.k
    public final x00.l<Resource, List<CacheControl>> r() {
        return this.f60001c;
    }

    @m80.k
    public final x00.l<Resource, ix.k> s() {
        return this.f60000b;
    }

    @m80.l
    public final String t() {
        return this.f60005g;
    }

    @m80.k
    public final x00.l<Resource, Boolean> u() {
        return this.f60003e;
    }

    @m80.k
    public final List<String> v() {
        return this.f60004f;
    }

    @m80.k
    public final x00.q<Resource, zx.b, j00.c<? super g2>, Object> w() {
        return this.f60002d;
    }

    @m80.k
    public final List<CompressedFileType> x() {
        return this.f60006h;
    }

    public final void y(@m80.k x00.q<? super Resource, ? super zx.b, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        this.f60002d = block;
    }

    public final void z(@m80.k CompressedFileType... types) {
        kotlin.jvm.internal.g0.p(types, "types");
        this.f60006h = a00.a0.dz(types);
    }
}
