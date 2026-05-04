package pw;

import a00.h0;
import c40.p2;
import c40.x;
import c40.x0;
import c40.z;
import e40.k0;
import e40.l0;
import io.ktor.client.plugins.websocket.WebSocketException;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.a;
import io.ktor.websocket.d;
import ix.g1;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import okio.ByteString;
import t50.s;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOkHttpWebsocketSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpWebsocketSession.kt\nio/ktor/client/engine/okhttp/OkHttpWebsocketSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* loaded from: classes8.dex */
public final class r extends t50.t implements io.ktor.websocket.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t50.q f81275a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final s.a f81276b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f81277c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x<r> f81278d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x<okhttp3.n> f81279e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final e40.o<io.ktor.websocket.d> f81280f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final x<CloseReason> f81281g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final l0<io.ktor.websocket.d> f81282h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1", f = "OkHttpWebsocketSession.kt", i = {0, 1, 1}, l = {64, 68}, m = "invokeSuspend", n = {"$this$actor", "websocket", "closeReason"}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements x00.p<e40.c<io.ktor.websocket.d>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f81283a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81284b;

        /* renamed from: c, reason: collision with root package name */
        public int f81285c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f81286d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ okhttp3.l f81288f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(okhttp3.l lVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f81288f = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = r.this.new a(this.f81288f, cVar);
            aVar.f81286d = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e40.c<io.ktor.websocket.d> cVar, j00.c<? super g2> cVar2) {
            return ((a) create(cVar, cVar2)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
        
            if (r10 != r0) goto L24;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0080 -> B:8:0x0083). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pw.r.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public r(@m80.k t50.q engine, @m80.k s.a webSocketFactory, @m80.k okhttp3.l engineRequest, @m80.k kotlin.coroutines.d coroutineContext) {
        g0.p(engine, "engine");
        g0.p(webSocketFactory, "webSocketFactory");
        g0.p(engineRequest, "engineRequest");
        g0.p(coroutineContext, "coroutineContext");
        this.f81275a = engine;
        this.f81276b = webSocketFactory;
        this.f81277c = coroutineContext;
        this.f81278d = z.c(null, 1, null);
        this.f81279e = z.c(null, 1, null);
        this.f81280f = e40.r.d(0, null, null, 7, null);
        this.f81281g = z.c(null, 1, null);
        this.f81282h = e40.b.b(this, null, 0, null, null, new a(engineRequest, null), 15, null);
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public List<io.ktor.websocket.z<?>> A0() {
        return h0.J();
    }

    @Override // io.ktor.websocket.j0
    public void E0(long j11) {
        throw new WebSocketException("Max frame size switch is not supported in OkHttp engine.");
    }

    @Override // io.ktor.websocket.a
    public void L0(long j11) {
        throw new WebSocketException("OkHttp doesn't support dynamic ping interval. You could switch it in the engine configuration.");
    }

    @Override // io.ktor.websocket.a
    public void N0(@m80.k List<? extends io.ktor.websocket.z<?>> negotiatedExtensions) {
        g0.p(negotiatedExtensions, "negotiatedExtensions");
        if (!negotiatedExtensions.isEmpty()) {
            throw new IllegalArgumentException("Extensions are not supported.");
        }
    }

    @Override // io.ktor.websocket.j0
    public boolean Q0() {
        return true;
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object U(@m80.k io.ktor.websocket.d dVar, @m80.k j00.c<? super g2> cVar) {
        return a.C0726a.a(this, dVar, cVar);
    }

    @Override // t50.t
    public void a(@m80.k t50.s webSocket, int i11, @m80.k String reason) {
        Object valueOf;
        g0.p(webSocket, "webSocket");
        g0.p(reason, "reason");
        super.a(webSocket, i11, reason);
        short s11 = (short) i11;
        this.f81281g.c0(new CloseReason(s11, reason));
        l0.a.a(this.f81280f, null, 1, null);
        l0<io.ktor.websocket.d> q11 = q();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WebSocket session closed with code ");
        CloseReason.Codes a11 = CloseReason.Codes.Companion.a(s11);
        if (a11 == null || (valueOf = a11.toString()) == null) {
            valueOf = Integer.valueOf(i11);
        }
        sb2.append(valueOf);
        sb2.append('.');
        q11.z(new CancellationException(sb2.toString()));
    }

    @Override // io.ktor.websocket.a
    public long a0() {
        return this.f81275a.r0();
    }

    @Override // t50.t
    public void b(@m80.k t50.s webSocket, int i11, @m80.k String reason) {
        g0.p(webSocket, "webSocket");
        g0.p(reason, "reason");
        super.b(webSocket, i11, reason);
        short s11 = (short) i11;
        this.f81281g.c0(new CloseReason(s11, reason));
        try {
            e40.u.m0(q(), new d.b(new CloseReason(s11, reason)));
        } catch (Throwable unused) {
        }
        l0.a.a(this.f81280f, null, 1, null);
    }

    @Override // t50.t
    public void d(@m80.k t50.s webSocket, @m80.k Throwable t11, @m80.l okhttp3.n nVar) {
        g0.p(webSocket, "webSocket");
        g0.p(t11, "t");
        super.d(webSocket, t11, nVar);
        Integer valueOf = nVar != null ? Integer.valueOf(nVar.Z()) : null;
        int p02 = g1.f62797c.W().p0();
        if (valueOf != null && valueOf.intValue() == p02) {
            this.f81279e.c0(nVar);
            l0.a.a(this.f81280f, null, 1, null);
            l0.a.a(q(), null, 1, null);
        } else {
            this.f81279e.r(t11);
            this.f81281g.r(t11);
            this.f81280f.z(t11);
            q().z(t11);
        }
    }

    @Override // io.ktor.websocket.j0
    public long d0() {
        return Long.MAX_VALUE;
    }

    @Override // t50.t
    public void e(@m80.k t50.s webSocket, @m80.k String text) {
        g0.p(webSocket, "webSocket");
        g0.p(text, "text");
        super.e(webSocket, text);
        e40.o<io.ktor.websocket.d> oVar = this.f81280f;
        byte[] bytes = text.getBytes(u30.d.f91599b);
        g0.o(bytes, "getBytes(...)");
        e40.u.m0(oVar, new d.f(true, bytes));
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object g(@m80.k j00.c<? super g2> cVar) {
        return g2.f100423a;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f81277c;
    }

    @Override // t50.t
    public void h(@m80.k t50.s webSocket, @m80.k ByteString bytes) {
        g0.p(webSocket, "webSocket");
        g0.p(bytes, "bytes");
        super.h(webSocket, bytes);
        e40.u.m0(this.f81280f, new d.a(true, bytes.toByteArray()));
    }

    @Override // io.ktor.websocket.a
    @m80.k
    public x0<CloseReason> h0() {
        return this.f81281g;
    }

    @Override // t50.t
    public void i(@m80.k t50.s webSocket, @m80.k okhttp3.n response) {
        g0.p(webSocket, "webSocket");
        g0.p(response, "response");
        super.i(webSocket, response);
        this.f81279e.c0(response);
    }

    @Override // io.ktor.websocket.j0
    public void i0(boolean z11) {
        throw new WebSocketException("Masking switch is not supported in OkHttp engine.");
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public k0<io.ktor.websocket.d> j() {
        return this.f81280f;
    }

    @Override // io.ktor.websocket.a
    public void k0(long j11) {
        throw new WebSocketException("Websocket timeout should be configured in OkHttp engine.");
    }

    @m80.k
    public final x<okhttp3.n> n() {
        return this.f81279e;
    }

    public final void p() {
        this.f81278d.c0(this);
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public l0<io.ktor.websocket.d> q() {
        return this.f81282h;
    }

    @Override // io.ktor.websocket.j0
    @yz.n(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @w0(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void s0() {
        p2.j(getCoroutineContext(), null, 1, null);
    }

    @Override // io.ktor.websocket.a
    public long x0() {
        return this.f81275a.m0();
    }

    public static /* synthetic */ void o() {
    }
}
