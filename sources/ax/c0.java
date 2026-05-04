package ax;

import a00.m0;
import a00.r0;
import androidx.collection.SieveCacheKt;
import com.jiongji.andriod.card.R;
import cx.e0;
import cx.k0;
import io.ktor.client.plugins.websocket.WebSocketException;
import io.ktor.websocket.h0;
import io.ktor.websocket.j0;
import ix.g1;
import ix.i2;
import ix.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import org.slf4j.Logger;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebSockets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Attributes.kt\nio/ktor/util/AttributesKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,224:1\n1368#2:225\n1454#2,5:226\n774#2:232\n865#2,2:233\n1#3:231\n18#4:235\n58#5,16:236\n*S KotlinDebug\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets\n*L\n68#1:225\n68#1:226,5\n81#1:232\n81#1:233,2\n135#1:235\n135#1:236,16\n*E\n"})
/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f5501e = new b(0 == true ? 1 : 0);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final xy.a<c0> f5502f;

    /* renamed from: a, reason: collision with root package name */
    public final long f5503a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5504b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final h0 f5505c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final io.ktor.serialization.d f5506d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @io.ktor.utils.io.c0
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public long f5508b;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public io.ktor.serialization.d f5510d;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final h0 f5507a = new h0();

        /* renamed from: c, reason: collision with root package name */
        public long f5509c = SieveCacheKt.NodeLinkMask;

        public final void a(@m80.k x00.l<? super h0, g2> block) {
            g0.p(block, "block");
            block.invoke(this.f5507a);
        }

        @m80.l
        public final io.ktor.serialization.d b() {
            return this.f5510d;
        }

        @m80.k
        public final h0 c() {
            return this.f5507a;
        }

        public final long d() {
            return this.f5509c;
        }

        public final long e() {
            return this.f5508b;
        }

        public final void f(@m80.l io.ktor.serialization.d dVar) {
            this.f5510d = dVar;
        }

        public final void g(long j11) {
            this.f5509c = j11;
        }

        public final void h(long j11) {
            this.f5508b = j11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements rw.y<a, c0> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1", f = "WebSockets.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
        @u0({"SMAP\nWebSockets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n*L\n1#1,224:1\n33#2,2:225\n33#2,2:227\n*S KotlinDebug\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1\n*L\n153#1:225,2\n157#1:227,2\n*E\n"})
        public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, cx.y>, Object, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f5511a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5512b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f5513c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c0 f5514d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z11, c0 c0Var, j00.c<? super a> cVar) {
                super(3, cVar);
                this.f5513c = z11;
                this.f5514d = c0Var;
            }

            @Override // x00.q
            public final Object invoke(io.ktor.util.pipeline.d<Object, cx.y> dVar, Object obj, j00.c<? super g2> cVar) {
                a aVar = new a(this.f5513c, this.f5514d, cVar);
                aVar.f5512b = dVar;
                return aVar.invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f5511a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f5512b;
                    if (!i2.b(((cx.y) dVar.d()).j().o())) {
                        Logger b11 = d0.b();
                        if (ez.b.a(b11)) {
                            b11.trace("Skipping WebSocket plugin for non-websocket request: " + ((cx.y) dVar.d()).j());
                        }
                        return g2.f100423a;
                    }
                    Logger b12 = d0.b();
                    if (ez.b.a(b12)) {
                        b12.trace("Sending WebSocket request " + ((cx.y) dVar.d()).j());
                    }
                    ((cx.y) dVar.d()).n(y.f5554a, g2.f100423a);
                    if (this.f5513c) {
                        this.f5514d.j((cx.y) dVar.d());
                    }
                    z zVar = new z();
                    this.f5511a = 1;
                    if (dVar.i(zVar, this) == l11) {
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2", f = "WebSockets.kt", i = {}, l = {R.styleable.Theme_drawable_review_sound}, m = "invokeSuspend", n = {}, s = {})
        @u0({"SMAP\nWebSockets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets$Plugin$install$2\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n*L\n1#1,224:1\n33#2,2:225\n33#2,2:227\n*S KotlinDebug\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSockets$Plugin$install$2\n*L\n173#1:225,2\n187#1:227,2\n*E\n"})
        /* renamed from: ax.c0$b$b, reason: collision with other inner class name */
        public static final class C0099b extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<ex.d, mw.a>, ex.d, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f5515a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5516b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f5517c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c0 f5518d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f5519e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0099b(c0 c0Var, boolean z11, j00.c<? super C0099b> cVar) {
                super(3, cVar);
                this.f5518d = c0Var;
                this.f5519e = z11;
            }

            @Override // x00.q
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.d<ex.d, mw.a> dVar, ex.d dVar2, j00.c<? super g2> cVar) {
                C0099b c0099b = new C0099b(this.f5518d, this.f5519e, cVar);
                c0099b.f5516b = dVar;
                c0099b.f5517c = dVar2;
                return c0099b.invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v16, types: [ax.v] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                w wVar;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f5515a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f5516b;
                    ex.d dVar2 = (ex.d) this.f5517c;
                    gz.a a11 = dVar2.a();
                    Object b11 = dVar2.b();
                    ex.c i12 = ((mw.a) dVar.d()).i();
                    g1 i13 = i12.i();
                    mx.v w11 = ex.e.h(i12).w();
                    if (!(w11 instanceof z)) {
                        Logger b12 = d0.b();
                        if (ez.b.a(b12)) {
                            b12.trace("Skipping non-websocket response from " + ((mw.a) dVar.d()).h().getUrl() + ": " + w11);
                        }
                        return g2.f100423a;
                    }
                    g1.a aVar = g1.f62797c;
                    if (!g0.g(i13, aVar.S())) {
                        throw new WebSocketException("Handshake exception, expected status code " + aVar.S().p0() + " but was " + i13.p0());
                    }
                    if (!(b11 instanceof j0)) {
                        throw new WebSocketException("Handshake exception, expected `WebSocketSession` content but was " + o0.d(b11.getClass()));
                    }
                    Logger b13 = d0.b();
                    if (ez.b.a(b13)) {
                        b13.trace("Receive websocket session from " + ((mw.a) dVar.d()).h().getUrl() + ": " + b11);
                    }
                    if (this.f5518d.h() != SieveCacheKt.NodeLinkMask) {
                        ((j0) b11).E0(this.f5518d.h());
                    }
                    if (g0.g(a11.b(), o0.d(v.class))) {
                        ?? vVar = new v((mw.a) dVar.d(), this.f5518d.f((j0) b11));
                        vVar.N0(this.f5519e ? this.f5518d.e((mw.a) dVar.d()) : a00.h0.J());
                        wVar = vVar;
                    } else {
                        wVar = new w((mw.a) dVar.d(), (j0) b11);
                    }
                    ex.d dVar3 = new ex.d(a11, wVar);
                    this.f5516b = null;
                    this.f5515a = 1;
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

        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @Override // rw.y
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@m80.k c0 plugin, @m80.k lw.c scope) {
            g0.p(plugin, "plugin");
            g0.p(scope, "scope");
            boolean contains = scope.S().D2().contains(b0.f5500a);
            scope.m0().C(e0.f46866h.b(), new a(contains, plugin, null));
            scope.o0().C(ex.f.f50195h.e(), new C0099b(plugin, contains, null));
        }

        @Override // rw.y
        @m80.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c0 a(@m80.k x00.l<? super a, g2> block) {
            g0.p(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new c0(aVar.e(), aVar.d(), aVar.c(), aVar.b());
        }

        @Override // rw.y
        @m80.k
        public xy.a<c0> getKey() {
            return c0.f5502f;
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        h10.r rVar = null;
        h10.d d11 = o0.d(c0.class);
        try {
            rVar = o0.B(c0.class);
        } catch (Throwable unused) {
        }
        f5502f = new xy.a<>("Websocket", new gz.a(d11, rVar));
    }

    public c0(long j11, long j12, @m80.k h0 extensionsConfig, @m80.l io.ktor.serialization.d dVar) {
        g0.p(extensionsConfig, "extensionsConfig");
        this.f5503a = j11;
        this.f5504b = j12;
        this.f5505c = extensionsConfig;
        this.f5506d = dVar;
    }

    public final void d(cx.y yVar, List<io.ktor.websocket.c0> list) {
        if (list.isEmpty()) {
            return;
        }
        k0.h(yVar, y0.f63006a.w0(), r0.r3(list, com.alipay.sdk.m.u.i.f11097b, null, null, 0, null, null, 62, null));
    }

    public final List<io.ktor.websocket.z<?>> e(mw.a aVar) {
        List<io.ktor.websocket.c0> J;
        xy.a aVar2;
        String str = aVar.i().a().get(y0.f63006a.w0());
        if (str == null || (J = io.ktor.websocket.d0.a(str)) == null) {
            J = a00.h0.J();
        }
        xy.b attributes = aVar.getAttributes();
        aVar2 = d0.f5520a;
        List list = (List) attributes.g(aVar2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((io.ktor.websocket.z) obj).f(J)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @m80.k
    public final io.ktor.websocket.a f(@m80.k j0 session) {
        g0.p(session, "session");
        if (session instanceof io.ktor.websocket.a) {
            return (io.ktor.websocket.a) session;
        }
        long j11 = this.f5503a;
        io.ktor.websocket.a a11 = io.ktor.websocket.c.a(session, j11, 2 * j11);
        a11.E0(this.f5504b);
        return a11;
    }

    @m80.l
    public final io.ktor.serialization.d g() {
        return this.f5506d;
    }

    public final long h() {
        return this.f5504b;
    }

    public final long i() {
        return this.f5503a;
    }

    public final void j(cx.y yVar) {
        xy.a aVar;
        List<io.ktor.websocket.z<?>> c11 = this.f5505c.c();
        xy.b d11 = yVar.d();
        aVar = d0.f5520a;
        d11.e(aVar, c11);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, ((io.ktor.websocket.z) it.next()).b());
        }
        d(yVar, arrayList);
    }

    public /* synthetic */ c0(long j11, long j12, h0 h0Var, io.ktor.serialization.d dVar, int i11, kotlin.jvm.internal.v vVar) {
        this(j11, j12, h0Var, (i11 & 8) != 0 ? null : dVar);
    }

    public /* synthetic */ c0(long j11, long j12, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? SieveCacheKt.NodeLinkMask : j12);
    }

    public c0(long j11, long j12) {
        this(j11, j12, new h0(), null, 8, null);
    }

    public c0() {
        this(0L, SieveCacheKt.NodeLinkMask, new h0(), null, 8, null);
    }
}
