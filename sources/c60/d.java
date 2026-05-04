package c60;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.e1;
import l60.g1;
import l60.i;
import l60.i1;
import l60.m;
import m80.k;
import m80.l;
import okhttp3.h;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n615#3,4:699\n615#3,4:703\n563#3:707\n563#3:708\n615#3,4:709\n563#3:713\n557#3:714\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n*L\n176#1:690,4\n255#1:694,4\n263#1:698\n274#1:699,4\n281#1:703,4\n295#1:707\n305#1:708\n491#1:709,4\n637#1:713\n657#1:714\n*E\n"})
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f8179o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final long f8180p = 16384;

    /* renamed from: a, reason: collision with root package name */
    public final int f8181a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final okhttp3.internal.http2.b f8182b;

    /* renamed from: c, reason: collision with root package name */
    public long f8183c;

    /* renamed from: d, reason: collision with root package name */
    public long f8184d;

    /* renamed from: e, reason: collision with root package name */
    public long f8185e;

    /* renamed from: f, reason: collision with root package name */
    public long f8186f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayDeque<h> f8187g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8188h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final c f8189i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final b f8190j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C0134d f8191k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final C0134d f8192l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public ErrorCode f8193m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public IOException f8194n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n563#3:699\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n*L\n407#1:690,4\n418#1:694,4\n458#1:698\n480#1:699\n*E\n"})
    public final class c implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public final long f8200a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f8201b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final l60.k f8202c = new l60.k();

        /* renamed from: d, reason: collision with root package name */
        @k
        public final l60.k f8203d = new l60.k();

        /* renamed from: e, reason: collision with root package name */
        @l
        public h f8204e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8205f;

        public c(long j11, boolean z11) {
            this.f8200a = j11;
            this.f8201b = z11;
        }

        public final void C(long j11) {
            d dVar = d.this;
            if (!u50.f.f91853h || !Thread.holdsLock(dVar)) {
                d.this.h().k1(j11);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dVar);
        }

        @Override // l60.g1
        @k
        public i1 D() {
            return d.this.n();
        }

        @Override // l60.g1
        public long L3(@k l60.k sink, long j11) throws IOException {
            IOException iOException;
            boolean z11;
            long j12;
            g0.p(sink, "sink");
            long j13 = 0;
            if (j11 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
            }
            while (true) {
                d dVar = d.this;
                synchronized (dVar) {
                    dVar.n().x();
                    try {
                        if (dVar.i() == null || this.f8201b) {
                            iOException = null;
                        } else {
                            iOException = dVar.j();
                            if (iOException == null) {
                                ErrorCode i11 = dVar.i();
                                g0.m(i11);
                                iOException = new StreamResetException(i11);
                            }
                        }
                        if (this.f8205f) {
                            throw new IOException("stream closed");
                        }
                        z11 = false;
                        if (this.f8203d.size() > j13) {
                            l60.k kVar = this.f8203d;
                            j12 = kVar.L3(sink, Math.min(j11, kVar.size()));
                            dVar.E(dVar.m() + j12);
                            long m11 = dVar.m() - dVar.l();
                            if (iOException == null && m11 >= dVar.h().m0().e() / 2) {
                                dVar.h().t1(dVar.k(), m11);
                                dVar.D(dVar.m());
                            }
                        } else {
                            if (!this.f8201b && iOException == null) {
                                dVar.J();
                                z11 = true;
                            }
                            j12 = -1;
                        }
                        dVar.n().I();
                        g2 g2Var = g2.f100423a;
                    } finally {
                    }
                }
                if (!z11) {
                    if (j12 != -1) {
                        return j12;
                    }
                    if (iOException == null) {
                        return -1L;
                    }
                    throw iOException;
                }
                j13 = 0;
            }
        }

        public final boolean a() {
            return this.f8205f;
        }

        public final boolean c() {
            return this.f8201b;
        }

        @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            d dVar = d.this;
            synchronized (dVar) {
                this.f8205f = true;
                size = this.f8203d.size();
                this.f8203d.e();
                g0.n(dVar, "null cannot be cast to non-null type java.lang.Object");
                dVar.notifyAll();
                g2 g2Var = g2.f100423a;
            }
            if (size > 0) {
                C(size);
            }
            d.this.b();
        }

        @k
        public final l60.k e() {
            return this.f8203d;
        }

        @k
        public final l60.k f() {
            return this.f8202c;
        }

        @l
        public final h j() {
            return this.f8204e;
        }

        public final void k(@k m source, long j11) throws IOException {
            boolean z11;
            boolean z12;
            g0.p(source, "source");
            d dVar = d.this;
            if (u50.f.f91853h && Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dVar);
            }
            long j12 = j11;
            while (j12 > 0) {
                synchronized (d.this) {
                    z11 = this.f8201b;
                    z12 = this.f8203d.size() + j12 > this.f8200a;
                    g2 g2Var = g2.f100423a;
                }
                if (z12) {
                    source.skip(j12);
                    d.this.f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z11) {
                    source.skip(j12);
                    return;
                }
                long L3 = source.L3(this.f8202c, j12);
                if (L3 == -1) {
                    throw new EOFException();
                }
                j12 -= L3;
                d dVar2 = d.this;
                synchronized (dVar2) {
                    try {
                        if (this.f8205f) {
                            this.f8202c.e();
                        } else {
                            boolean z13 = this.f8203d.size() == 0;
                            this.f8203d.V2(this.f8202c);
                            if (z13) {
                                g0.n(dVar2, "null cannot be cast to non-null type java.lang.Object");
                                dVar2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            C(j11);
        }

        public final void q(boolean z11) {
            this.f8205f = z11;
        }

        public final void r(boolean z11) {
            this.f8201b = z11;
        }

        public final void w(@l h hVar) {
            this.f8204e = hVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: c60.d$d, reason: collision with other inner class name */
    public final class C0134d extends i {
        public C0134d() {
        }

        @Override // l60.i
        @k
        public IOException A(@l IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(com.alipay.sdk.m.m.a.f10784h0);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // l60.i
        public void G() {
            d.this.f(ErrorCode.CANCEL);
            d.this.h().Y0();
        }

        public final void I() throws IOException {
            if (y()) {
                throw A(null);
            }
        }
    }

    public d(int i11, @k okhttp3.internal.http2.b connection, boolean z11, boolean z12, @l h hVar) {
        g0.p(connection, "connection");
        this.f8181a = i11;
        this.f8182b = connection;
        this.f8186f = connection.o0().e();
        ArrayDeque<h> arrayDeque = new ArrayDeque<>();
        this.f8187g = arrayDeque;
        this.f8189i = new c(connection.m0().e(), z12);
        this.f8190j = new b(z11);
        this.f8191k = new C0134d();
        this.f8192l = new C0134d();
        if (hVar == null) {
            if (!v()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (v()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(hVar);
        }
    }

    public final synchronized void A(@k ErrorCode errorCode) {
        g0.p(errorCode, "errorCode");
        if (this.f8193m == null) {
            this.f8193m = errorCode;
            g0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void B(@l ErrorCode errorCode) {
        this.f8193m = errorCode;
    }

    public final void C(@l IOException iOException) {
        this.f8194n = iOException;
    }

    public final void D(long j11) {
        this.f8184d = j11;
    }

    public final void E(long j11) {
        this.f8183c = j11;
    }

    public final void F(long j11) {
        this.f8186f = j11;
    }

    public final void G(long j11) {
        this.f8185e = j11;
    }

    @k
    public final synchronized h H() throws IOException {
        h removeFirst;
        this.f8191k.x();
        while (this.f8187g.isEmpty() && this.f8193m == null) {
            try {
                J();
            } catch (Throwable th2) {
                this.f8191k.I();
                throw th2;
            }
        }
        this.f8191k.I();
        if (this.f8187g.isEmpty()) {
            IOException iOException = this.f8194n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f8193m;
            g0.m(errorCode);
            throw new StreamResetException(errorCode);
        }
        removeFirst = this.f8187g.removeFirst();
        g0.o(removeFirst, "headersQueue.removeFirst()");
        return removeFirst;
    }

    @k
    public final synchronized h I() throws IOException {
        h j11;
        if (!this.f8189i.c() || !this.f8189i.f().J() || !this.f8189i.e().J()) {
            if (this.f8193m == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            IOException iOException = this.f8194n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f8193m;
            g0.m(errorCode);
            throw new StreamResetException(errorCode);
        }
        j11 = this.f8189i.j();
        if (j11 == null) {
            j11 = u50.f.f91847b;
        }
        return j11;
    }

    public final void J() throws InterruptedIOException {
        try {
            g0.n(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void K(@k List<c60.a> responseHeaders, boolean z11, boolean z12) throws IOException {
        boolean z13;
        g0.p(responseHeaders, "responseHeaders");
        if (u50.f.f91853h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                this.f8188h = true;
                if (z11) {
                    this.f8190j.j(true);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z12) {
            synchronized (this.f8182b) {
                z13 = this.f8182b.C0() >= this.f8182b.A0();
            }
            z12 = z13;
        }
        this.f8182b.m1(this.f8181a, z11, responseHeaders);
        if (z12) {
            this.f8182b.flush();
        }
    }

    @k
    public final i1 L() {
        return this.f8192l;
    }

    public final void a(long j11) {
        this.f8186f += j11;
        if (j11 > 0) {
            g0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() throws IOException {
        boolean z11;
        boolean w11;
        if (u50.f.f91853h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f8189i.c() || !this.f8189i.a() || (!this.f8190j.e() && !this.f8190j.c())) {
                    z11 = false;
                    w11 = w();
                    g2 g2Var = g2.f100423a;
                }
                z11 = true;
                w11 = w();
                g2 g2Var2 = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            d(ErrorCode.CANCEL, null);
        } else {
            if (w11) {
                return;
            }
            this.f8182b.W0(this.f8181a);
        }
    }

    public final void c() throws IOException {
        if (this.f8190j.c()) {
            throw new IOException("stream closed");
        }
        if (this.f8190j.e()) {
            throw new IOException("stream finished");
        }
        if (this.f8193m != null) {
            IOException iOException = this.f8194n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f8193m;
            g0.m(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void d(@k ErrorCode rstStatusCode, @l IOException iOException) throws IOException {
        g0.p(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, iOException)) {
            this.f8182b.r1(this.f8181a, rstStatusCode);
        }
    }

    public final boolean e(ErrorCode errorCode, IOException iOException) {
        if (u50.f.f91853h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f8193m != null) {
                return false;
            }
            this.f8193m = errorCode;
            this.f8194n = iOException;
            g0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f8189i.c() && this.f8190j.e()) {
                return false;
            }
            g2 g2Var = g2.f100423a;
            this.f8182b.W0(this.f8181a);
            return true;
        }
    }

    public final void f(@k ErrorCode errorCode) {
        g0.p(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f8182b.s1(this.f8181a, errorCode);
        }
    }

    public final void g(@k h trailers) {
        g0.p(trailers, "trailers");
        synchronized (this) {
            if (this.f8190j.e()) {
                throw new IllegalStateException("already finished");
            }
            if (trailers.size() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0");
            }
            this.f8190j.k(trailers);
            g2 g2Var = g2.f100423a;
        }
    }

    @k
    public final okhttp3.internal.http2.b h() {
        return this.f8182b;
    }

    @l
    public final synchronized ErrorCode i() {
        return this.f8193m;
    }

    @l
    public final IOException j() {
        return this.f8194n;
    }

    public final int k() {
        return this.f8181a;
    }

    public final long l() {
        return this.f8184d;
    }

    public final long m() {
        return this.f8183c;
    }

    @k
    public final C0134d n() {
        return this.f8191k;
    }

    @k
    public final e1 o() {
        synchronized (this) {
            try {
                if (!this.f8188h && !v()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f8190j;
    }

    @k
    public final b p() {
        return this.f8190j;
    }

    @k
    public final g1 q() {
        return this.f8189i;
    }

    @k
    public final c r() {
        return this.f8189i;
    }

    public final long s() {
        return this.f8186f;
    }

    public final long t() {
        return this.f8185e;
    }

    @k
    public final C0134d u() {
        return this.f8192l;
    }

    public final boolean v() {
        return this.f8182b.d0() == ((this.f8181a & 1) == 1);
    }

    public final synchronized boolean w() {
        try {
            if (this.f8193m != null) {
                return false;
            }
            if (!this.f8189i.c()) {
                if (this.f8189i.a()) {
                }
                return true;
            }
            if (this.f8190j.e() || this.f8190j.c()) {
                if (this.f8188h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @k
    public final i1 x() {
        return this.f8191k;
    }

    public final void y(@k m source, int i11) throws IOException {
        g0.p(source, "source");
        if (!u50.f.f91853h || !Thread.holdsLock(this)) {
            this.f8189i.k(source, i11);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:10:0x0038, B:14:0x0040, B:16:0x0051, B:17:0x0056, B:24:0x0048), top: B:9:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(@m80.k okhttp3.h r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = u50.f.f91853h
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L37:
            monitor-enter(r2)
            boolean r0 = r2.f8188h     // Catch: java.lang.Throwable -> L46
            r1 = 1
            if (r0 == 0) goto L48
            if (r4 != 0) goto L40
            goto L48
        L40:
            c60.d$c r0 = r2.f8189i     // Catch: java.lang.Throwable -> L46
            r0.w(r3)     // Catch: java.lang.Throwable -> L46
            goto L4f
        L46:
            r3 = move-exception
            goto L6f
        L48:
            r2.f8188h = r1     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque<okhttp3.h> r0 = r2.f8187g     // Catch: java.lang.Throwable -> L46
            r0.add(r3)     // Catch: java.lang.Throwable -> L46
        L4f:
            if (r4 == 0) goto L56
            c60.d$c r3 = r2.f8189i     // Catch: java.lang.Throwable -> L46
            r3.r(r1)     // Catch: java.lang.Throwable -> L46
        L56:
            boolean r3 = r2.w()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r2, r4)     // Catch: java.lang.Throwable -> L46
            r2.notifyAll()     // Catch: java.lang.Throwable -> L46
            yz.g2 r4 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L46
            monitor-exit(r2)
            if (r3 != 0) goto L6e
            okhttp3.internal.http2.b r3 = r2.f8182b
            int r4 = r2.f8181a
            r3.W0(r4)
        L6e:
            return
        L6f:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c60.d.z(okhttp3.h, boolean):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n615#2,4:689\n615#2,4:693\n615#2,4:697\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n528#1:689,4\n573#1:693,4\n589#1:697,4\n*E\n"})
    public final class b implements e1 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f8195a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final l60.k f8196b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public h f8197c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f8198d;

        public b(boolean z11) {
            this.f8195a = z11;
            this.f8196b = new l60.k();
        }

        @Override // l60.e1
        @k
        public i1 D() {
            return d.this.u();
        }

        /* JADX WARN: Finally extract failed */
        public final void a(boolean z11) throws IOException {
            long min;
            boolean z12;
            d dVar = d.this;
            synchronized (dVar) {
                try {
                    dVar.u().x();
                    while (dVar.t() >= dVar.s() && !this.f8195a && !this.f8198d && dVar.i() == null) {
                        try {
                            dVar.J();
                        } catch (Throwable th2) {
                            dVar.u().I();
                            throw th2;
                        }
                    }
                    dVar.u().I();
                    dVar.c();
                    min = Math.min(dVar.s() - dVar.t(), this.f8196b.size());
                    dVar.G(dVar.t() + min);
                    z12 = z11 && min == this.f8196b.size();
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            d.this.u().x();
            try {
                d.this.h().l1(d.this.k(), z12, this.f8196b, min);
            } finally {
                d.this.u().I();
            }
        }

        public final boolean c() {
            return this.f8198d;
        }

        @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            d dVar = d.this;
            if (u50.f.f91853h && Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dVar);
            }
            d dVar2 = d.this;
            synchronized (dVar2) {
                if (this.f8198d) {
                    return;
                }
                boolean z11 = dVar2.i() == null;
                g2 g2Var = g2.f100423a;
                if (!d.this.p().f8195a) {
                    boolean z12 = this.f8196b.size() > 0;
                    if (this.f8197c != null) {
                        while (this.f8196b.size() > 0) {
                            a(false);
                        }
                        okhttp3.internal.http2.b h11 = d.this.h();
                        int k11 = d.this.k();
                        h hVar = this.f8197c;
                        g0.m(hVar);
                        h11.m1(k11, z11, u50.f.b0(hVar));
                    } else if (z12) {
                        while (this.f8196b.size() > 0) {
                            a(true);
                        }
                    } else if (z11) {
                        d.this.h().l1(d.this.k(), true, null, 0L);
                    }
                }
                synchronized (d.this) {
                    this.f8198d = true;
                    g2 g2Var2 = g2.f100423a;
                }
                d.this.h().flush();
                d.this.b();
            }
        }

        public final boolean e() {
            return this.f8195a;
        }

        @l
        public final h f() {
            return this.f8197c;
        }

        @Override // l60.e1, java.io.Flushable
        public void flush() throws IOException {
            d dVar = d.this;
            if (u50.f.f91853h && Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dVar);
            }
            d dVar2 = d.this;
            synchronized (dVar2) {
                dVar2.c();
                g2 g2Var = g2.f100423a;
            }
            while (this.f8196b.size() > 0) {
                a(false);
                d.this.h().flush();
            }
        }

        public final void i(boolean z11) {
            this.f8198d = z11;
        }

        public final void j(boolean z11) {
            this.f8195a = z11;
        }

        public final void k(@l h hVar) {
            this.f8197c = hVar;
        }

        @Override // l60.e1
        public void y8(@k l60.k source, long j11) throws IOException {
            g0.p(source, "source");
            d dVar = d.this;
            if (!u50.f.f91853h || !Thread.holdsLock(dVar)) {
                this.f8196b.y8(source, j11);
                while (this.f8196b.size() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dVar);
            }
        }

        public /* synthetic */ b(d dVar, boolean z11, int i11, v vVar) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }
}
