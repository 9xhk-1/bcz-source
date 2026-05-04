package j60;

import a00.g0;
import io.ktor.websocket.y;
import j60.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.m;
import m80.k;
import okhttp3.Protocol;
import okhttp3.l;
import okhttp3.n;
import okio.ByteString;
import t50.q;
import t50.s;
import t50.t;
import u30.f0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRealWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,654:1\n1#2:655\n84#3,4:656\n90#3,13:664\n608#4,4:660\n*S KotlinDebug\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n269#1:656,4\n512#1:664,13\n457#1:660,4\n*E\n"})
/* loaded from: classes8.dex */
public final class e implements s, h.a {
    public static final long B = 16777216;
    public static final long C = 60000;
    public static final long D = 1024;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f63572a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final t f63573b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Random f63574c;

    /* renamed from: d, reason: collision with root package name */
    public final long f63575d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public j60.f f63576e;

    /* renamed from: f, reason: collision with root package name */
    public long f63577f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f63578g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public t50.b f63579h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public y50.a f63580i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public j60.h f63581j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public i f63582k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public y50.c f63583l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public String f63584m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    public d f63585n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final ArrayDeque<ByteString> f63586o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final ArrayDeque<Object> f63587p;

    /* renamed from: q, reason: collision with root package name */
    public long f63588q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f63589r;

    /* renamed from: s, reason: collision with root package name */
    public int f63590s;

    /* renamed from: t, reason: collision with root package name */
    @m80.l
    public String f63591t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f63592u;

    /* renamed from: v, reason: collision with root package name */
    public int f63593v;

    /* renamed from: w, reason: collision with root package name */
    public int f63594w;

    /* renamed from: x, reason: collision with root package name */
    public int f63595x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f63596y;

    /* renamed from: z, reason: collision with root package name */
    @k
    public static final b f63571z = new b(null);

    @k
    public static final List<Protocol> A = g0.l(Protocol.HTTP_1_1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f63597a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final ByteString f63598b;

        /* renamed from: c, reason: collision with root package name */
        public final long f63599c;

        public a(int i11, @m80.l ByteString byteString, long j11) {
            this.f63597a = i11;
            this.f63598b = byteString;
            this.f63599c = j11;
        }

        public final long a() {
            return this.f63599c;
        }

        public final int b() {
            return this.f63597a;
        }

        @m80.l
        public final ByteString c() {
            return this.f63598b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f63600a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ByteString f63601b;

        public c(int i11, @k ByteString data) {
            kotlin.jvm.internal.g0.p(data, "data");
            this.f63600a = i11;
            this.f63601b = data;
        }

        @k
        public final ByteString a() {
            return this.f63601b;
        }

        public final int b() {
            return this.f63600a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f63602a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final m f63603b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final l60.l f63604c;

        public d(boolean z11, @k m source, @k l60.l sink) {
            kotlin.jvm.internal.g0.p(source, "source");
            kotlin.jvm.internal.g0.p(sink, "sink");
            this.f63602a = z11;
            this.f63603b = source;
            this.f63604c = sink;
        }

        public final boolean a() {
            return this.f63602a;
        }

        @k
        public final l60.l c() {
            return this.f63604c;
        }

        @k
        public final m e() {
            return this.f63603b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: j60.e$e, reason: collision with other inner class name */
    public final class C0736e extends y50.a {
        public C0736e() {
            super(e.this.f63584m + " writer", false, 2, null);
        }

        @Override // y50.a
        public long f() {
            try {
                return e.this.E() ? 0L : -1L;
            } catch (IOException e11) {
                e.this.r(e11, null);
                return -1L;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements t50.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f63607b;

        public f(l lVar) {
            this.f63607b = lVar;
        }

        @Override // t50.c
        public void c(@k t50.b call, @k n response) {
            kotlin.jvm.internal.g0.p(call, "call");
            kotlin.jvm.internal.g0.p(response, "response");
            z50.c a02 = response.a0();
            try {
                e.this.o(response, a02);
                kotlin.jvm.internal.g0.m(a02);
                d n11 = a02.n();
                j60.f a11 = j60.f.f63611g.a(response.k0());
                e.this.f63576e = a11;
                if (!e.this.u(a11)) {
                    e eVar = e.this;
                    synchronized (eVar) {
                        eVar.f63587p.clear();
                        eVar.d(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    e.this.t(u50.f.f91854i + " WebSocket " + this.f63607b.q().V(), n11);
                    e.this.s().i(e.this, response);
                    e.this.v();
                } catch (Exception e11) {
                    e.this.r(e11, null);
                }
            } catch (IOException e12) {
                e.this.r(e12, response);
                u50.f.o(response);
                if (a02 != null) {
                    a02.w();
                }
            }
        }

        @Override // t50.c
        public void d(@k t50.b call, @k IOException e11) {
            kotlin.jvm.internal.g0.p(call, "call");
            kotlin.jvm.internal.g0.p(e11, "e");
            e.this.r(e11, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n+ 2 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n1#1,218:1\n270#2,2:219\n*E\n"})
    public static final class g extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e f63608e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f63609f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, e eVar, long j11) {
            super(str, false, 2, null);
            this.f63608e = eVar;
            this.f63609f = j11;
        }

        @Override // y50.a
        public long f() {
            this.f63608e.F();
            return this.f63609f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n1#1,218:1\n513#2,2:219\n*E\n"})
    public static final class h extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e f63610e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z11, e eVar) {
            super(str, z11);
            this.f63610e = eVar;
        }

        @Override // y50.a
        public long f() {
            this.f63610e.cancel();
            return -1L;
        }
    }

    public e(@k y50.d taskRunner, @k l originalRequest, @k t listener, @k Random random, long j11, @m80.l j60.f fVar, long j12) {
        kotlin.jvm.internal.g0.p(taskRunner, "taskRunner");
        kotlin.jvm.internal.g0.p(originalRequest, "originalRequest");
        kotlin.jvm.internal.g0.p(listener, "listener");
        kotlin.jvm.internal.g0.p(random, "random");
        this.f63572a = originalRequest;
        this.f63573b = listener;
        this.f63574c = random;
        this.f63575d = j11;
        this.f63576e = fVar;
        this.f63577f = j12;
        this.f63583l = taskRunner.j();
        this.f63586o = new ArrayDeque<>();
        this.f63587p = new ArrayDeque<>();
        this.f63590s = -1;
        if (!kotlin.jvm.internal.g0.g("GET", originalRequest.m())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.m()).toString());
        }
        ByteString.a aVar = ByteString.Companion;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        g2 g2Var = g2.f100423a;
        this.f63578g = ByteString.a.p(aVar, bArr, 0, 0, 3, null).base64();
    }

    public final void A() {
        if (!u50.f.f91853h || Thread.holdsLock(this)) {
            y50.a aVar = this.f63580i;
            if (aVar != null) {
                y50.c.p(this.f63583l, aVar, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final synchronized boolean B(ByteString byteString, int i11) {
        if (!this.f63592u && !this.f63589r) {
            if (this.f63588q + byteString.size() > B) {
                d(1001, null);
                return false;
            }
            this.f63588q += byteString.size();
            this.f63587p.add(new c(i11, byteString));
            A();
            return true;
        }
        return false;
    }

    public final synchronized int C() {
        return this.f63593v;
    }

    public final void D() throws InterruptedException {
        this.f63583l.u();
        this.f63583l.l().await(10L, TimeUnit.SECONDS);
    }

    public final boolean E() throws IOException {
        String str;
        j60.h hVar;
        i iVar;
        int i11;
        d dVar;
        synchronized (this) {
            try {
                if (this.f63592u) {
                    return false;
                }
                i iVar2 = this.f63582k;
                ByteString poll = this.f63586o.poll();
                Object obj = null;
                if (poll == null) {
                    Object poll2 = this.f63587p.poll();
                    if (poll2 instanceof a) {
                        i11 = this.f63590s;
                        str = this.f63591t;
                        if (i11 != -1) {
                            dVar = this.f63585n;
                            this.f63585n = null;
                            hVar = this.f63581j;
                            this.f63581j = null;
                            iVar = this.f63582k;
                            this.f63582k = null;
                            this.f63583l.u();
                        } else {
                            long a11 = ((a) poll2).a();
                            this.f63583l.n(new h(this.f63584m + " cancel", true, this), TimeUnit.MILLISECONDS.toNanos(a11));
                            dVar = null;
                            hVar = null;
                            iVar = null;
                        }
                    } else {
                        if (poll2 == null) {
                            return false;
                        }
                        str = null;
                        hVar = null;
                        iVar = null;
                        i11 = -1;
                        dVar = null;
                    }
                    obj = poll2;
                } else {
                    str = null;
                    hVar = null;
                    iVar = null;
                    i11 = -1;
                    dVar = null;
                }
                g2 g2Var = g2.f100423a;
                try {
                    if (poll != null) {
                        kotlin.jvm.internal.g0.m(iVar2);
                        iVar2.k(poll);
                    } else if (obj instanceof c) {
                        c cVar = (c) obj;
                        kotlin.jvm.internal.g0.m(iVar2);
                        iVar2.i(cVar.b(), cVar.a());
                        synchronized (this) {
                            this.f63588q -= cVar.a().size();
                        }
                    } else {
                        if (!(obj instanceof a)) {
                            throw new AssertionError();
                        }
                        a aVar = (a) obj;
                        kotlin.jvm.internal.g0.m(iVar2);
                        iVar2.e(aVar.b(), aVar.c());
                        if (dVar != null) {
                            t tVar = this.f63573b;
                            kotlin.jvm.internal.g0.m(str);
                            tVar.a(this, i11, str);
                        }
                    }
                    return true;
                } finally {
                    if (dVar != null) {
                        u50.f.o(dVar);
                    }
                    if (hVar != null) {
                        u50.f.o(hVar);
                    }
                    if (iVar != null) {
                        u50.f.o(iVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void F() {
        synchronized (this) {
            try {
                if (this.f63592u) {
                    return;
                }
                i iVar = this.f63582k;
                if (iVar == null) {
                    return;
                }
                int i11 = this.f63596y ? this.f63593v : -1;
                this.f63593v++;
                this.f63596y = true;
                g2 g2Var = g2.f100423a;
                if (i11 == -1) {
                    try {
                        iVar.j(ByteString.EMPTY);
                        return;
                    } catch (IOException e11) {
                        r(e11, null);
                        return;
                    }
                }
                r(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f63575d + "ms (after " + (i11 - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j60.h.a
    public synchronized void a(@k ByteString payload) {
        try {
            kotlin.jvm.internal.g0.p(payload, "payload");
            if (!this.f63592u && (!this.f63589r || !this.f63587p.isEmpty())) {
                this.f63586o.add(payload);
                A();
                this.f63594w++;
            }
        } finally {
        }
    }

    @Override // t50.s
    public synchronized long b() {
        return this.f63588q;
    }

    @Override // j60.h.a
    public synchronized void c(@k ByteString payload) {
        kotlin.jvm.internal.g0.p(payload, "payload");
        this.f63595x++;
        this.f63596y = false;
    }

    @Override // t50.s
    public void cancel() {
        t50.b bVar = this.f63579h;
        kotlin.jvm.internal.g0.m(bVar);
        bVar.cancel();
    }

    @Override // t50.s
    public boolean d(int i11, @m80.l String str) {
        return p(i11, str, 60000L);
    }

    @Override // j60.h.a
    public void e(int i11, @k String reason) {
        d dVar;
        j60.h hVar;
        i iVar;
        kotlin.jvm.internal.g0.p(reason, "reason");
        if (i11 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            try {
                if (this.f63590s != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f63590s = i11;
                this.f63591t = reason;
                dVar = null;
                if (this.f63589r && this.f63587p.isEmpty()) {
                    d dVar2 = this.f63585n;
                    this.f63585n = null;
                    hVar = this.f63581j;
                    this.f63581j = null;
                    iVar = this.f63582k;
                    this.f63582k = null;
                    this.f63583l.u();
                    dVar = dVar2;
                } else {
                    hVar = null;
                    iVar = null;
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            this.f63573b.b(this, i11, reason);
            if (dVar != null) {
                this.f63573b.a(this, i11, reason);
            }
        } finally {
            if (dVar != null) {
                u50.f.o(dVar);
            }
            if (hVar != null) {
                u50.f.o(hVar);
            }
            if (iVar != null) {
                u50.f.o(iVar);
            }
        }
    }

    @Override // t50.s
    public boolean f(@k ByteString bytes) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return B(bytes, 2);
    }

    @Override // t50.s
    public boolean g(@k String text) {
        kotlin.jvm.internal.g0.p(text, "text");
        return B(ByteString.Companion.l(text), 1);
    }

    @Override // j60.h.a
    public void h(@k ByteString bytes) throws IOException {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        this.f63573b.h(this, bytes);
    }

    @Override // j60.h.a
    public void i(@k String text) throws IOException {
        kotlin.jvm.internal.g0.p(text, "text");
        this.f63573b.e(this, text);
    }

    public final void n(long j11, @k TimeUnit timeUnit) throws InterruptedException {
        kotlin.jvm.internal.g0.p(timeUnit, "timeUnit");
        this.f63583l.l().await(j11, timeUnit);
    }

    public final void o(@k n response, @m80.l z50.c cVar) throws IOException {
        kotlin.jvm.internal.g0.p(response, "response");
        if (response.Z() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.Z() + ' ' + response.o0() + '\'');
        }
        String h02 = n.h0(response, "Connection", null, 2, null);
        if (!f0.c2("Upgrade", h02, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + h02 + '\'');
        }
        String h03 = n.h0(response, "Upgrade", null, 2, null);
        if (!f0.c2("websocket", h03, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + h03 + '\'');
        }
        String h04 = n.h0(response, qo.c.Y1, null, 2, null);
        String base64 = ByteString.Companion.l(this.f63578g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
        if (kotlin.jvm.internal.g0.g(base64, h04)) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + h04 + '\'');
    }

    public final synchronized boolean p(int i11, @m80.l String str, long j11) {
        ByteString byteString;
        try {
            j60.g.f63619a.d(i11);
            if (str != null) {
                byteString = ByteString.Companion.l(str);
                if (byteString.size() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                byteString = null;
            }
            if (!this.f63592u && !this.f63589r) {
                this.f63589r = true;
                this.f63587p.add(new a(i11, byteString, j11));
                A();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void q(@k q client) {
        kotlin.jvm.internal.g0.p(client, "client");
        if (this.f63572a.i("Sec-WebSocket-Extensions") != null) {
            r(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        q f11 = client.l0().r(t50.m.f89630b).f0(A).f();
        l b11 = this.f63572a.n().n("Upgrade", "websocket").n("Connection", "Upgrade").n(qo.c.f82375a2, this.f63578g).n(qo.c.f82383c2, "13").n("Sec-WebSocket-Extensions", y.f62578e).b();
        z50.e eVar = new z50.e(f11, b11, true);
        this.f63579h = eVar;
        kotlin.jvm.internal.g0.m(eVar);
        eVar.U(new f(b11));
    }

    public final void r(@k Exception e11, @m80.l n nVar) {
        kotlin.jvm.internal.g0.p(e11, "e");
        synchronized (this) {
            if (this.f63592u) {
                return;
            }
            this.f63592u = true;
            d dVar = this.f63585n;
            this.f63585n = null;
            j60.h hVar = this.f63581j;
            this.f63581j = null;
            i iVar = this.f63582k;
            this.f63582k = null;
            this.f63583l.u();
            g2 g2Var = g2.f100423a;
            try {
                this.f63573b.d(this, e11, nVar);
            } finally {
                if (dVar != null) {
                    u50.f.o(dVar);
                }
                if (hVar != null) {
                    u50.f.o(hVar);
                }
                if (iVar != null) {
                    u50.f.o(iVar);
                }
            }
        }
    }

    @Override // t50.s
    @k
    public l request() {
        return this.f63572a;
    }

    @k
    public final t s() {
        return this.f63573b;
    }

    public final void t(@k String name, @k d streams) throws IOException {
        Throwable th2;
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(streams, "streams");
        j60.f fVar = this.f63576e;
        kotlin.jvm.internal.g0.m(fVar);
        synchronized (this) {
            try {
                this.f63584m = name;
                this.f63585n = streams;
                this.f63582k = new i(streams.a(), streams.c(), this.f63574c, fVar.f63613a, fVar.i(streams.a()), this.f63577f);
                this.f63580i = new C0736e();
                long j11 = this.f63575d;
                if (j11 != 0) {
                    try {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j11);
                        this.f63583l.n(new g(name + " ping", this, nanos), nanos);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (!this.f63587p.isEmpty()) {
                    A();
                }
                g2 g2Var = g2.f100423a;
                this.f63581j = new j60.h(streams.a(), streams.e(), this, fVar.f63613a, fVar.i(!streams.a()));
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    public final boolean u(j60.f fVar) {
        if (!fVar.f63618f && fVar.f63614b == null) {
            return fVar.f63616d == null || new g10.l(8, 15).k(fVar.f63616d.intValue());
        }
        return false;
    }

    public final void v() throws IOException {
        while (this.f63590s == -1) {
            j60.h hVar = this.f63581j;
            kotlin.jvm.internal.g0.m(hVar);
            hVar.c();
        }
    }

    public final synchronized boolean w(@k ByteString payload) {
        try {
            kotlin.jvm.internal.g0.p(payload, "payload");
            if (!this.f63592u && (!this.f63589r || !this.f63587p.isEmpty())) {
                this.f63586o.add(payload);
                A();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final boolean x() throws IOException {
        try {
            j60.h hVar = this.f63581j;
            kotlin.jvm.internal.g0.m(hVar);
            hVar.c();
            return this.f63590s == -1;
        } catch (Exception e11) {
            r(e11, null);
            return false;
        }
    }

    public final synchronized int y() {
        return this.f63594w;
    }

    public final synchronized int z() {
        return this.f63595x;
    }
}
