package y70;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpHost;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.nio.reactor.ssl.SSLMode;
import x70.i;
import x70.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes9.dex */
public class e implements x70.f, i, n {

    /* renamed from: o, reason: collision with root package name */
    public static final String f99492o = "http.session.ssl";

    /* renamed from: p, reason: collision with root package name */
    public static final ByteBuffer f99493p = ByteBuffer.allocate(0);

    /* renamed from: a, reason: collision with root package name */
    public final x70.f f99494a;

    /* renamed from: b, reason: collision with root package name */
    public final SSLEngine f99495b;

    /* renamed from: c, reason: collision with root package name */
    public final c f99496c;

    /* renamed from: d, reason: collision with root package name */
    public final c f99497d;

    /* renamed from: e, reason: collision with root package name */
    public final c f99498e;

    /* renamed from: f, reason: collision with root package name */
    public final b f99499f;

    /* renamed from: g, reason: collision with root package name */
    public final f f99500g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f99501h;

    /* renamed from: i, reason: collision with root package name */
    public int f99502i;

    /* renamed from: j, reason: collision with root package name */
    public i f99503j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f99504k;

    /* renamed from: l, reason: collision with root package name */
    public volatile SSLMode f99505l;

    /* renamed from: m, reason: collision with root package name */
    public volatile int f99506m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f99507n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99508a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f99509b;

        static {
            int[] iArr = new int[SSLEngineResult.HandshakeStatus.values().length];
            f99509b = iArr;
            try {
                iArr[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99509b[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99509b[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99509b[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99509b[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[SSLMode.values().length];
            f99508a = iArr2;
            try {
                iArr2[SSLMode.CLIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99508a[SSLMode.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ByteChannel {
        public b() {
        }

        @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            e.this.close();
        }

        @Override // java.nio.channels.Channel
        public boolean isOpen() {
            return !e.this.isClosed();
        }

        @Override // java.nio.channels.ReadableByteChannel
        public int read(ByteBuffer byteBuffer) throws IOException {
            return e.this.G(byteBuffer);
        }

        @Override // java.nio.channels.WritableByteChannel
        public int write(ByteBuffer byteBuffer) throws IOException {
            return e.this.K(byteBuffer);
        }

        public /* synthetic */ b(e eVar, a aVar) {
            this();
        }
    }

    public e(x70.f fVar, SSLMode sSLMode, HttpHost httpHost, SSLContext sSLContext, f fVar2) {
        this(fVar, sSLMode, httpHost, sSLContext, fVar2, new y70.a());
    }

    private static void t(StringBuilder sb2, int i11) {
        if ((i11 & 1) > 0) {
            sb2.append('r');
        }
        if ((i11 & 4) > 0) {
            sb2.append('w');
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r2.f99506m == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean A() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
        L1:
            r2.H()     // Catch: java.lang.Throwable -> L16
            r2.p()     // Catch: java.lang.Throwable -> L16
            javax.net.ssl.SSLEngine r0 = r2.f99495b     // Catch: java.lang.Throwable -> L16
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch: java.lang.Throwable -> L16
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.Throwable -> L16
            if (r0 == r1) goto L18
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch: java.lang.Throwable -> L16
            if (r0 != r1) goto L1b
            goto L18
        L16:
            r0 = move-exception
            goto L49
        L18:
            r2.o()     // Catch: java.lang.Throwable -> L16
        L1b:
            javax.net.ssl.SSLEngine r0 = r2.f99495b     // Catch: java.lang.Throwable -> L16
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch: java.lang.Throwable -> L16
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.Throwable -> L16
            if (r0 == r1) goto L1
            int r0 = r2.f99502i     // Catch: java.lang.Throwable -> L16
            r1 = 1
            r0 = r0 & r1
            if (r0 <= 0) goto L46
            y70.c r0 = r2.f99498e     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L47
            x70.i r0 = r2.f99503j     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L3d
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L47
        L3d:
            boolean r0 = r2.f99504k     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L46
            int r0 = r2.f99506m     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L46
            goto L47
        L46:
            r1 = 0
        L47:
            monitor-exit(r2)
            return r1
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y70.e.A():boolean");
    }

    public synchronized boolean B() throws IOException {
        boolean z11;
        if ((this.f99502i & 4) > 0 && this.f99506m == 0) {
            z11 = this.f99495b.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        }
        return z11;
    }

    public synchronized boolean C() {
        return this.f99495b.isInboundDone();
    }

    public boolean D() {
        return this.f99507n;
    }

    public synchronized boolean E() {
        return this.f99495b.isOutboundDone();
    }

    public synchronized void F() throws IOException {
        I();
        p();
        J();
    }

    public final synchronized int G(ByteBuffer byteBuffer) {
        try {
            e80.a.j(byteBuffer, "Byte buffer");
            if (!this.f99498e.a()) {
                return this.f99504k ? -1 : 0;
            }
            ByteBuffer acquire = this.f99498e.acquire();
            acquire.flip();
            int min = Math.min(acquire.remaining(), byteBuffer.remaining());
            while (r1 < min) {
                byteBuffer.put(acquire.get());
                r1++;
            }
            acquire.compact();
            if (acquire.position() == 0) {
                this.f99498e.release();
            }
            return min;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final int H() throws IOException {
        if (this.f99504k) {
            return -1;
        }
        ByteBuffer acquire = this.f99496c.acquire();
        int read = this.f99494a.g().read(acquire);
        if (acquire.position() == 0) {
            this.f99496c.release();
        }
        if (read == -1) {
            this.f99504k = true;
        }
        return read;
    }

    public final int I() throws IOException {
        if (!this.f99497d.a()) {
            return this.f99494a.g().write(f99493p);
        }
        ByteBuffer acquire = this.f99497d.acquire();
        acquire.flip();
        try {
            int write = this.f99494a.g().write(acquire);
            acquire.compact();
            if (acquire.position() == 0) {
                this.f99497d.release();
            }
            return write;
        } catch (Throwable th2) {
            acquire.compact();
            throw th2;
        }
    }

    public final void J() {
        i iVar;
        i iVar2;
        if (this.f99506m == 0 && (this.f99504k || this.f99495b.isInboundDone())) {
            this.f99506m = 1;
        }
        if (this.f99506m == 1 && !this.f99497d.a()) {
            this.f99495b.closeOutbound();
            this.f99501h.incrementAndGet();
        }
        if (this.f99506m == 1 && this.f99495b.isOutboundDone() && ((this.f99504k || this.f99495b.isInboundDone()) && !this.f99498e.a() && (iVar2 = this.f99503j) != null && !iVar2.a())) {
            this.f99506m = Integer.MAX_VALUE;
        }
        if (this.f99506m <= 1 && this.f99504k && this.f99495b.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            this.f99506m = Integer.MAX_VALUE;
        }
        if (this.f99506m == Integer.MAX_VALUE) {
            this.f99494a.close();
            return;
        }
        int d11 = this.f99494a.d();
        int i11 = a.f99509b[this.f99495b.getHandshakeStatus().ordinal()];
        int i12 = i11 != 1 ? i11 != 2 ? i11 != 4 ? d11 : this.f99502i : 1 : 5;
        if (this.f99504k && !this.f99498e.a() && ((iVar = this.f99503j) == null || !iVar.a())) {
            i12 &= -2;
        } else if (this.f99506m == 1) {
            i12 |= 1;
        }
        if (this.f99497d.a()) {
            i12 |= 4;
        } else if (this.f99495b.isOutboundDone()) {
            i12 &= -5;
        }
        if (d11 != i12) {
            this.f99494a.i(i12);
        }
    }

    public final synchronized int K(ByteBuffer byteBuffer) throws IOException {
        SSLEngineResult s11;
        try {
            e80.a.j(byteBuffer, "Byte buffer");
            if (this.f99506m != 0) {
                throw new ClosedChannelException();
            }
            s11 = s(byteBuffer, this.f99497d.acquire());
            if (s11.getStatus() == SSLEngineResult.Status.CLOSED) {
                this.f99506m = Integer.MAX_VALUE;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return s11.bytesConsumed();
    }

    @Override // x70.f
    public synchronized boolean a() {
        boolean z11;
        try {
            i iVar = this.f99503j;
            if (iVar != null) {
                if (!iVar.a()) {
                }
            }
            if (!this.f99496c.a()) {
                z11 = this.f99498e.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z11;
    }

    @Override // x70.f
    public void b(String str, Object obj) {
        this.f99494a.b(str, obj);
    }

    @Override // x70.f
    public synchronized boolean c() {
        boolean z11;
        try {
            i iVar = this.f99503j;
            if (iVar != null) {
                if (!iVar.c()) {
                }
            }
            z11 = this.f99497d.a();
        } catch (Throwable th2) {
            throw th2;
        }
        return z11;
    }

    @Override // x70.f
    public synchronized void close() {
        if (this.f99506m >= 1) {
            return;
        }
        this.f99506m = 1;
        if (this.f99494a.x() == 0) {
            this.f99494a.setSocketTimeout(1000);
        }
        try {
            J();
        } catch (CancelledKeyException unused) {
            shutdown();
        }
    }

    @Override // x70.f
    public synchronized int d() {
        return this.f99502i;
    }

    @Override // x70.f
    public synchronized void e(i iVar) {
        this.f99503j = iVar;
    }

    @Override // x70.f
    public synchronized void f(int i11) {
        this.f99502i = (~i11) & this.f99502i;
        J();
    }

    @Override // x70.f
    public ByteChannel g() {
        return this.f99499f;
    }

    @Override // x70.f
    public Object getAttribute(String str) {
        return this.f99494a.getAttribute(str);
    }

    @Override // x70.f
    public SocketAddress getLocalAddress() {
        return this.f99494a.getLocalAddress();
    }

    @Override // x70.f
    public int getStatus() {
        return this.f99506m;
    }

    @Override // x70.f
    public synchronized void h(int i11) {
        this.f99502i = i11 | this.f99502i;
        J();
    }

    @Override // x70.f
    public synchronized void i(int i11) {
        this.f99502i = i11;
        J();
    }

    @Override // x70.f
    public boolean isClosed() {
        return this.f99506m >= 1 || this.f99494a.isClosed();
    }

    @Override // x70.n
    public Socket k() {
        x70.f fVar = this.f99494a;
        if (fVar instanceof n) {
            return ((n) fVar).k();
        }
        return null;
    }

    @Override // x70.f
    public SocketAddress l() {
        return this.f99494a.l();
    }

    public final SSLException n(RuntimeException runtimeException) {
        Throwable cause = runtimeException.getCause();
        if (cause != null) {
            runtimeException = cause;
        }
        return new SSLException(runtimeException);
    }

    public final boolean o() throws SSLException {
        boolean z11 = false;
        while (true) {
            if (!this.f99496c.a()) {
                break;
            }
            ByteBuffer acquire = this.f99496c.acquire();
            ByteBuffer acquire2 = this.f99498e.acquire();
            acquire.flip();
            try {
                SSLEngineResult r11 = r(acquire, acquire2);
                try {
                    if (!acquire.hasRemaining() && r11.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                        throw new SSLException("Unable to complete SSL handshake");
                    }
                    SSLEngineResult.Status status = r11.getStatus();
                    if (status == SSLEngineResult.Status.OK) {
                        if (this.f99496c.acquire().position() == 0) {
                            this.f99496c.release();
                        }
                        z11 = true;
                    } else if (status == SSLEngineResult.Status.BUFFER_UNDERFLOW && this.f99504k) {
                        throw new SSLException("Unable to decrypt incoming data due to unexpected end of stream");
                    }
                } finally {
                    if (this.f99496c.acquire().position() == 0) {
                        this.f99496c.release();
                    }
                }
            } finally {
                acquire.compact();
            }
        }
        if (this.f99495b.isInboundDone()) {
            this.f99504k = true;
        }
        return z11;
    }

    public final void p() throws SSLException {
        f fVar;
        SSLEngineResult sSLEngineResult = null;
        boolean z11 = true;
        while (z11) {
            SSLEngineResult.HandshakeStatus handshakeStatus = this.f99495b.getHandshakeStatus();
            if (handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING && this.f99501h.get() > 0) {
                handshakeStatus = SSLEngineResult.HandshakeStatus.NEED_WRAP;
            }
            int i11 = a.f99509b[handshakeStatus.ordinal()];
            if (i11 == 1) {
                sSLEngineResult = s(ByteBuffer.allocate(0), this.f99497d.acquire());
                if (sSLEngineResult.getStatus() == SSLEngineResult.Status.OK && sSLEngineResult.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                }
                z11 = false;
            } else if (i11 == 2) {
                ByteBuffer acquire = this.f99496c.acquire();
                ByteBuffer acquire2 = this.f99498e.acquire();
                acquire.flip();
                try {
                    SSLEngineResult r11 = r(acquire, acquire2);
                    try {
                        if (!acquire.hasRemaining() && r11.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                            throw new SSLException("Input buffer is full");
                        }
                        if (this.f99506m >= 1) {
                            this.f99498e.release();
                        }
                        if (r11.getStatus() != SSLEngineResult.Status.OK) {
                            sSLEngineResult = r11;
                            z11 = false;
                        } else {
                            sSLEngineResult = r11;
                        }
                    } finally {
                        if (acquire.position() == 0) {
                            this.f99496c.release();
                        }
                    }
                } finally {
                    acquire.compact();
                }
            } else if (i11 == 3) {
                q();
            } else if (i11 == 4) {
                z11 = false;
            }
        }
        if (sSLEngineResult == null || sSLEngineResult.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.FINISHED || (fVar = this.f99500g) == null) {
            return;
        }
        try {
            fVar.a(this.f99494a, this.f99495b.getSession());
        } catch (RuntimeException e11) {
            throw n(e11);
        }
    }

    public final void q() throws SSLException {
        try {
            Runnable delegatedTask = this.f99495b.getDelegatedTask();
            if (delegatedTask != null) {
                delegatedTask.run();
            }
        } catch (RuntimeException e11) {
            throw n(e11);
        }
    }

    public final SSLEngineResult r(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException {
        try {
            return this.f99495b.unwrap(byteBuffer, byteBuffer2);
        } catch (RuntimeException e11) {
            throw n(e11);
        }
    }

    @Override // x70.f
    public Object removeAttribute(String str) {
        return this.f99494a.removeAttribute(str);
    }

    public final SSLEngineResult s(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException {
        try {
            return this.f99495b.wrap(byteBuffer, byteBuffer2);
        } catch (RuntimeException e11) {
            throw n(e11);
        }
    }

    @Override // x70.f
    public void setSocketTimeout(int i11) {
        this.f99494a.setSocketTimeout(i11);
    }

    @Override // x70.f
    public synchronized void shutdown() {
        if (this.f99506m == Integer.MAX_VALUE) {
            return;
        }
        this.f99506m = Integer.MAX_VALUE;
        this.f99494a.shutdown();
        this.f99496c.release();
        this.f99497d.release();
        this.f99498e.release();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f99494a);
        sb2.append("[");
        int i11 = this.f99506m;
        if (i11 == 0) {
            sb2.append("ACTIVE");
        } else if (i11 == 1) {
            sb2.append("CLOSING");
        } else if (i11 == Integer.MAX_VALUE) {
            sb2.append("CLOSED");
        }
        sb2.append("][");
        t(sb2, this.f99502i);
        sb2.append("][");
        sb2.append(this.f99495b.getHandshakeStatus());
        if (this.f99495b.isInboundDone()) {
            sb2.append("][inbound done][");
        }
        if (this.f99495b.isOutboundDone()) {
            sb2.append("][outbound done][");
        }
        if (this.f99504k) {
            sb2.append("][EOF][");
        }
        sb2.append("][");
        sb2.append(!this.f99496c.a() ? 0 : this.f99496c.acquire().position());
        sb2.append("][");
        sb2.append(!this.f99498e.a() ? 0 : this.f99498e.acquire().position());
        sb2.append("][");
        sb2.append(this.f99497d.a() ? this.f99497d.acquire().position() : 0);
        sb2.append("]");
        return sb2.toString();
    }

    public synchronized SSLSession u() {
        return this.f99495b.getSession();
    }

    public f v() {
        return this.f99500g;
    }

    public synchronized void w() throws IOException {
        J();
    }

    @Override // x70.f
    public int x() {
        return this.f99494a.x();
    }

    public synchronized void y() throws SSLException {
        try {
            e80.b.a(!this.f99507n, "SSL I/O session already initialized");
            if (this.f99506m >= 1) {
                return;
            }
            int i11 = a.f99508a[this.f99505l.ordinal()];
            if (i11 == 1) {
                this.f99495b.setUseClientMode(true);
            } else if (i11 == 2) {
                this.f99495b.setUseClientMode(false);
            }
            f fVar = this.f99500g;
            if (fVar != null) {
                try {
                    fVar.b(this.f99495b);
                } catch (RuntimeException e11) {
                    throw n(e11);
                }
            }
            this.f99507n = true;
            this.f99495b.beginHandshake();
            this.f99496c.release();
            this.f99497d.release();
            this.f99498e.release();
            p();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Deprecated
    public synchronized void z(SSLMode sSLMode) throws SSLException {
        this.f99505l = sSLMode;
        y();
    }

    public e(x70.f fVar, SSLMode sSLMode, HttpHost httpHost, SSLContext sSLContext, f fVar2, d dVar) {
        e80.a.j(fVar, "IO session");
        e80.a.j(sSLContext, "SSL context");
        e80.a.j(dVar, "Buffer management strategy");
        this.f99494a = fVar;
        this.f99505l = sSLMode;
        this.f99502i = fVar.d();
        this.f99499f = new b(this, null);
        this.f99500g = fVar2;
        fVar.e(this);
        if (this.f99505l != SSLMode.CLIENT || httpHost == null) {
            this.f99495b = sSLContext.createSSLEngine();
        } else {
            this.f99495b = sSLContext.createSSLEngine(httpHost.getHostName(), httpHost.getPort());
        }
        int packetBufferSize = this.f99495b.getSession().getPacketBufferSize();
        this.f99496c = dVar.a(packetBufferSize);
        this.f99497d = dVar.a(packetBufferSize);
        this.f99498e = dVar.a(this.f99495b.getSession().getApplicationBufferSize());
        this.f99501h = new AtomicInteger(0);
    }

    public e(x70.f fVar, SSLMode sSLMode, SSLContext sSLContext, f fVar2) {
        this(fVar, sSLMode, null, sSLContext, fVar2);
    }
}
