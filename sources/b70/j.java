package b70;

import e70.s;
import e70.t;
import e70.u;
import h70.v;
import h70.w;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j implements m70.l, org.apache.http.n, x70.i, x70.n {

    /* renamed from: a, reason: collision with root package name */
    public final w60.e f6317a;

    /* renamed from: b, reason: collision with root package name */
    public final w60.e f6318b;

    /* renamed from: c, reason: collision with root package name */
    public final v f6319c;

    /* renamed from: d, reason: collision with root package name */
    public final w f6320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6321e;

    /* renamed from: f, reason: collision with root package name */
    public final v60.c f6322f;

    /* renamed from: g, reason: collision with root package name */
    public final a70.v f6323g;

    /* renamed from: h, reason: collision with root package name */
    public final a70.v f6324h;

    /* renamed from: i, reason: collision with root package name */
    public final x60.o f6325i;

    /* renamed from: j, reason: collision with root package name */
    public HttpContext f6326j;

    /* renamed from: k, reason: collision with root package name */
    public x70.f f6327k;

    /* renamed from: l, reason: collision with root package name */
    public SocketAddress f6328l;

    /* renamed from: m, reason: collision with root package name */
    public volatile m70.a f6329m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f6330n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m70.c f6331o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f6332p;

    /* renamed from: q, reason: collision with root package name */
    public volatile HttpRequest f6333q;

    /* renamed from: r, reason: collision with root package name */
    public volatile HttpResponse f6334r;

    /* renamed from: s, reason: collision with root package name */
    public volatile int f6335s;

    @Deprecated
    public j(x70.f fVar, z70.b bVar, HttpParams httpParams) {
        CharsetDecoder charsetDecoder;
        CharsetEncoder charsetEncoder;
        e80.a.j(fVar, "I/O session");
        e80.a.j(httpParams, "HTTP params");
        int intParameter = httpParams.getIntParameter(a80.b.f2293c, -1);
        intParameter = intParameter <= 0 ? 4096 : intParameter;
        int i11 = intParameter <= 512 ? intParameter : 512;
        if (e80.c.b((String) httpParams.getParameter(a80.c.f2303b)) != null) {
            Charset charset = org.apache.http.b.f77708f;
            charsetDecoder = charset.newDecoder();
            charsetEncoder = charset.newEncoder();
            CodingErrorAction codingErrorAction = (CodingErrorAction) httpParams.getParameter(a80.c.f2310i);
            CodingErrorAction codingErrorAction2 = (CodingErrorAction) httpParams.getParameter(a80.c.f2311j);
            charsetDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction2);
            charsetEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction2);
        } else {
            charsetDecoder = null;
            charsetEncoder = null;
        }
        this.f6319c = new v(intParameter, i11, charsetDecoder, bVar);
        this.f6320d = new w(intParameter, i11, charsetEncoder, bVar);
        this.f6321e = intParameter;
        this.f6322f = v60.c.f93129c;
        this.f6317a = H();
        this.f6318b = I();
        a70.v L = L();
        this.f6323g = L;
        a70.v L2 = L();
        this.f6324h = L2;
        this.f6325i = w(L, L2);
        V(fVar);
        this.f6335s = 0;
    }

    public m70.a C(long j11, ReadableByteChannel readableByteChannel, x70.j jVar, a70.v vVar) {
        return j11 == -2 ? new e70.e(readableByteChannel, jVar, this.f6322f, vVar) : j11 == -1 ? new s(readableByteChannel, jVar, vVar) : new u(readableByteChannel, jVar, vVar, j11);
    }

    public m70.c E(long j11, WritableByteChannel writableByteChannel, x70.k kVar, a70.v vVar) {
        return j11 == -2 ? new e70.f(writableByteChannel, kVar, vVar, this.f6321e) : j11 == -1 ? new t(writableByteChannel, kVar, vVar, this.f6321e) : new e70.v(writableByteChannel, kVar, vVar, j11, this.f6321e);
    }

    @Deprecated
    public w60.e H() {
        return new z60.d();
    }

    @Deprecated
    public w60.e I() {
        return new z60.e();
    }

    @Deprecated
    public a70.v L() {
        return new a70.v();
    }

    @Override // m70.l
    public HttpResponse N6() {
        return this.f6334r;
    }

    public HttpEntity S(org.apache.http.o oVar) throws HttpException {
        w60.b bVar = new w60.b();
        long a11 = this.f6317a.a(oVar);
        this.f6329m = C(a11, this.f6327k.g(), this.f6319c, this.f6323g);
        if (a11 == -2) {
            bVar.c(true);
            bVar.h0(-1L);
        } else if (a11 == -1) {
            bVar.c(false);
            bVar.h0(-1L);
        } else {
            bVar.c(false);
            bVar.h0(a11);
        }
        org.apache.http.e w11 = oVar.w("Content-Type");
        if (w11 != null) {
            bVar.j(w11);
        }
        org.apache.http.e w12 = oVar.w("Content-Encoding");
        if (w12 != null) {
            bVar.f(w12);
        }
        return bVar;
    }

    public void S0(x70.f fVar) {
        e80.a.j(fVar, "I/O session");
        V(fVar);
    }

    public void U(org.apache.http.o oVar) throws HttpException {
        this.f6331o = E(this.f6318b.a(oVar), this.f6327k.g(), this.f6320d, this.f6324h);
    }

    public final void V(x70.f fVar) {
        this.f6327k = fVar;
        this.f6326j = new q(fVar);
        this.f6327k.e(this);
        this.f6328l = this.f6327k.l();
    }

    @Override // org.apache.http.HttpConnection
    public boolean X1() {
        return this.f6327k.isClosed();
    }

    @Override // x70.i
    public boolean a() {
        return this.f6330n;
    }

    @Override // x70.i
    public boolean c() {
        return this.f6332p;
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f6335s != 0) {
            return;
        }
        this.f6335s = 1;
        this.f6319c.p();
        this.f6330n = false;
        if (this.f6320d.a()) {
            this.f6327k.h(4);
        } else {
            this.f6327k.close();
            this.f6335s = 2;
        }
    }

    @Override // m70.g
    public void e() {
        this.f6327k.f(1);
    }

    @Override // m70.g
    public void f() {
        this.f6327k.h(4);
    }

    @Override // m70.l
    public HttpContext getContext() {
        return this.f6326j;
    }

    @Override // org.apache.http.n
    public InetAddress getLocalAddress() {
        SocketAddress localAddress = this.f6327k.getLocalAddress();
        if (localAddress instanceof InetSocketAddress) {
            return ((InetSocketAddress) localAddress).getAddress();
        }
        return null;
    }

    @Override // org.apache.http.n
    public int getLocalPort() {
        SocketAddress localAddress = this.f6327k.getLocalAddress();
        if (localAddress instanceof InetSocketAddress) {
            return ((InetSocketAddress) localAddress).getPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpConnection
    public org.apache.http.k getMetrics() {
        return this.f6325i;
    }

    @Override // m70.l
    public int getStatus() {
        return this.f6335s;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        return this.f6335s == 0 && !this.f6327k.isClosed();
    }

    @Override // m70.g
    public void j() {
        this.f6327k.h(1);
    }

    @Override // x70.n
    public Socket k() {
        x70.f fVar = this.f6327k;
        if (fVar instanceof x70.n) {
            return ((x70.n) fVar).k();
        }
        return null;
    }

    @Override // org.apache.http.n
    public InetAddress l() {
        SocketAddress l11 = this.f6327k.l();
        if (l11 instanceof InetSocketAddress) {
            return ((InetSocketAddress) l11).getAddress();
        }
        return null;
    }

    @Override // m70.l
    public HttpRequest n0() {
        return this.f6333q;
    }

    @Override // m70.g
    public void q() {
        synchronized (this.f6327k) {
            try {
                if (!this.f6320d.a()) {
                    this.f6327k.f(4);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void r() throws ConnectionClosedException {
        if (this.f6335s != 0) {
            throw new ConnectionClosedException();
        }
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i11) {
        this.f6327k.setSocketTimeout(i11);
    }

    @Override // org.apache.http.HttpConnection, m70.g
    public void shutdown() throws IOException {
        this.f6335s = 2;
        this.f6327k.shutdown();
    }

    public String toString() {
        SocketAddress l11 = this.f6327k.l();
        SocketAddress localAddress = this.f6327k.getLocalAddress();
        if (l11 == null || localAddress == null) {
            return "[Not bound]";
        }
        StringBuilder sb2 = new StringBuilder();
        e80.h.a(sb2, localAddress);
        sb2.append("<->");
        e80.h.a(sb2, l11);
        return sb2.toString();
    }

    @Deprecated
    public x60.o w(k70.g gVar, k70.g gVar2) {
        return new x60.o(gVar, gVar2);
    }

    @Override // org.apache.http.HttpConnection
    public int x() {
        return this.f6327k.x();
    }

    @Override // org.apache.http.n
    public int y() {
        SocketAddress l11 = this.f6327k.l();
        if (l11 instanceof InetSocketAddress) {
            return ((InetSocketAddress) l11).getPort();
        }
        return -1;
    }

    public j(x70.f fVar, int i11, int i12, z70.b bVar, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, v60.c cVar, w60.e eVar, w60.e eVar2) {
        e80.a.j(fVar, "I/O session");
        e80.a.k(i11, "Buffer size");
        int i13 = i11 <= 512 ? i11 : 512;
        this.f6319c = new v(i11, i13, charsetDecoder, bVar);
        this.f6320d = new w(i11, i13, charsetEncoder, bVar);
        this.f6321e = i12 >= 0 ? i12 : i11;
        a70.v vVar = new a70.v();
        this.f6323g = vVar;
        a70.v vVar2 = new a70.v();
        this.f6324h = vVar2;
        this.f6325i = new x60.o(vVar, vVar2);
        this.f6322f = cVar == null ? v60.c.f93129c : cVar;
        this.f6317a = eVar == null ? z60.d.f101038d : eVar;
        this.f6318b = eVar2 == null ? z60.e.f101040d : eVar2;
        V(fVar);
        this.f6335s = 0;
    }

    public j(x70.f fVar, int i11, int i12, z70.b bVar, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, w60.e eVar, w60.e eVar2) {
        this(fVar, i11, i12, bVar, charsetDecoder, charsetEncoder, null, eVar, eVar2);
    }
}
