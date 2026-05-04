package zw;

import cx.d0;
import cx.j0;
import cx.y;
import io.ktor.client.plugins.sse.SSEClientException;
import ix.d1;
import ix.g1;
import ix.k;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import org.slf4j.Logger;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f102993a = ez.a.a("io.ktor.client.plugins.sse.SSE");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final sw.b<u> f102994b = sw.i.b("SSE", a.f102995a, new x00.l() { // from class: zw.v
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 b11;
            b11 = w.b((sw.d) obj);
            return b11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<u> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f102995a = new a();

        public a() {
            super(0, u.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u invoke() {
            return new u();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$1", f = "SSE.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nSSE.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SSE.kt\nio/ktor/client/plugins/sse/SSEKt$SSE$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    public static final class b extends SuspendLambda implements x00.q<y, mx.v, j00.c<? super mx.v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f102996a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f102997b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f102998c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f102999d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f103000e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f103001f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j11, boolean z11, boolean z12, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f102999d = j11;
            this.f103000e = z11;
            this.f103001f = z12;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y yVar, mx.v vVar, j00.c<? super mx.v> cVar) {
            b bVar = new b(this.f102999d, this.f103000e, this.f103001f, cVar);
            bVar.f102997b = yVar;
            bVar.f102998c = vVar;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f102996a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            y yVar = (y) this.f102997b;
            mx.v vVar = (mx.v) this.f102998c;
            if (!g0.g(w.d(yVar, o.u()), l00.a.a(true))) {
                return vVar;
            }
            w.e().trace("Sending SSE request " + yVar.j());
            yVar.n(s.f102985a, g2.f100423a);
            kotlin.time.e eVar = (kotlin.time.e) w.d(yVar, o.r());
            Boolean bool = (Boolean) w.d(yVar, o.s());
            Boolean bool2 = (Boolean) w.d(yVar, o.t());
            yVar.d().e(d0.c(), new j0());
            ix.k b11 = vVar.b();
            if (b11 != null) {
                d1.h(yVar, b11);
            }
            return new t(eVar != null ? eVar.k0() : this.f102999d, bool != null ? bool.booleanValue() : this.f103000e, bool2 != null ? bool2.booleanValue() : this.f103001f, vVar, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$2", f = "SSE.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<ex.d, mw.a>, ex.d, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f103002a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103003b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f103004c;

        public c(j00.c<? super c> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<ex.d, mw.a> dVar, ex.d dVar2, j00.c<? super g2> cVar) {
            c cVar2 = new c(cVar);
            cVar2.f103003b = dVar;
            cVar2.f103004c = dVar2;
            return cVar2.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f103002a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f103003b;
                ex.d dVar2 = (ex.d) this.f103004c;
                gz.a a11 = dVar2.a();
                Object b11 = dVar2.b();
                ex.c i12 = ((mw.a) dVar.d()).i();
                g1 i13 = i12.i();
                ix.k f11 = d1.f(i12);
                if (!(ex.e.h(i12).w() instanceof t)) {
                    w.e().trace("Skipping non SSE response from " + ex.e.h(i12).getUrl());
                    return g2.f100423a;
                }
                g1.a aVar = g1.f62797c;
                if (!g0.g(i13, aVar.C())) {
                    throw new SSEClientException(i12, null, "Expected status code " + aVar.C().p0() + " but was " + i13.p0(), 2, null);
                }
                ix.k k11 = f11 != null ? f11.k() : null;
                k.h hVar = k.h.f62902a;
                if (!g0.g(k11, hVar.d())) {
                    throw new SSEClientException(i12, null, "Expected Content-Type " + hVar.d() + " but was " + f11, 2, null);
                }
                if (!(b11 instanceof x)) {
                    throw new SSEClientException(i12, null, "Expected " + o0.d(x.class).C() + " content but was " + b11, 2, null);
                }
                w.e().trace("Receive SSE session from " + ex.e.h(i12).getUrl() + ": " + b11);
                ex.d dVar3 = new ex.d(a11, new p((mw.a) dVar.d(), (x) b11));
                this.f103003b = null;
                this.f103002a = 1;
                if (dVar.i(dVar3, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    public static final g2 b(sw.d createClientPlugin) {
        g0.p(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.g(zw.a.f102927a, new b(((u) createClientPlugin.f()).a(), ((u) createClientPlugin.f()).b(), ((u) createClientPlugin.f()).c(), null));
        createClientPlugin.b().o0().C(ex.f.f50195h.e(), new c(null));
        return g2.f100423a;
    }

    public static final <T> T d(y yVar, xy.a<T> aVar) {
        return (T) yVar.d().a(aVar);
    }

    @m80.k
    public static final Logger e() {
        return f102993a;
    }

    @m80.k
    public static final sw.b<u> f() {
        return f102994b;
    }

    public static /* synthetic */ void g() {
    }
}
