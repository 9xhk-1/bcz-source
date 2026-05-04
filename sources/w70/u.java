package w70;

import com.badlogic.gdx.Net;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class u implements m70.i {

    /* renamed from: c, reason: collision with root package name */
    public static final int f95681c = 3000;

    /* renamed from: d, reason: collision with root package name */
    public static final String f95682d = "http.nio.exchange-handler";

    /* renamed from: e, reason: collision with root package name */
    public static final String f95683e = "http.nio.http-exchange-state";

    /* renamed from: a, reason: collision with root package name */
    public final int f95684a;

    /* renamed from: b, reason: collision with root package name */
    public final org.apache.http.c f95685b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        public volatile f0 f95687b;

        /* renamed from: c, reason: collision with root package name */
        public volatile f0 f95688c;

        /* renamed from: d, reason: collision with root package name */
        public volatile HttpRequest f95689d;

        /* renamed from: e, reason: collision with root package name */
        public volatile HttpResponse f95690e;

        /* renamed from: g, reason: collision with root package name */
        public volatile int f95692g;

        /* renamed from: a, reason: collision with root package name */
        public final Queue<HttpRequest> f95686a = new ConcurrentLinkedQueue();

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f95691f = true;

        public a() {
            f0 f0Var = f0.READY;
            this.f95687b = f0Var;
            this.f95688c = f0Var;
        }

        public HttpRequest a() {
            return this.f95689d;
        }

        public Queue<HttpRequest> b() {
            return this.f95686a;
        }

        public f0 c() {
            return this.f95687b;
        }

        public HttpResponse d() {
            return this.f95690e;
        }

        public f0 e() {
            return this.f95688c;
        }

        public int f() {
            return this.f95692g;
        }

        public void g() {
            this.f95691f = false;
        }

        public boolean h() {
            return this.f95691f;
        }

        public void i(HttpRequest httpRequest) {
            this.f95689d = httpRequest;
        }

        public void j(f0 f0Var) {
            this.f95687b = f0Var;
        }

        public void k(HttpResponse httpResponse) {
            this.f95690e = httpResponse;
        }

        public void l(f0 f0Var) {
            this.f95688c = f0Var;
        }

        public void m(int i11) {
            this.f95692g = i11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("request state: ");
            sb2.append(this.f95687b);
            sb2.append("; request: ");
            if (this.f95689d != null) {
                sb2.append(this.f95689d.getRequestLine());
            }
            sb2.append("; response state: ");
            sb2.append(this.f95688c);
            sb2.append("; response: ");
            if (this.f95690e != null) {
                sb2.append(this.f95690e.n());
            }
            sb2.append("; valid: ");
            sb2.append(this.f95691f);
            sb2.append(com.alipay.sdk.m.u.i.f11097b);
            return sb2.toString();
        }
    }

    public u(int i11, org.apache.http.c cVar) {
        this.f95684a = e80.a.k(i11, "Wait for continue time");
        this.f95685b = cVar == null ? org.apache.http.c.f77710a : cVar;
    }

    public static p f(m70.l lVar) {
        return (p) lVar.getContext().getAttribute(f95682d);
    }

    public static a g(m70.l lVar) {
        return (a) lVar.getContext().getAttribute("http.nio.http-exchange-state");
    }

    public static boolean l(p pVar) {
        return pVar.getClass().getAnnotation(p0.class) != null;
    }

    public final boolean a(HttpRequest httpRequest, HttpResponse httpResponse) {
        String method = httpRequest.getRequestLine().getMethod();
        int statusCode = httpResponse.n().getStatusCode();
        if (method.equalsIgnoreCase(Net.a.f11462a)) {
            return false;
        }
        return ((method.equalsIgnoreCase("CONNECT") && statusCode < 300) || statusCode < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    @Override // m70.i
    public void b(m70.h hVar, m70.a aVar) throws IOException, HttpException {
        a g11 = g(hVar);
        e80.b.f(g11, "Connection state");
        e80.b.b(g11.e() == f0.BODY_STREAM, "Unexpected request state %s", g11.e());
        p f11 = f(hVar);
        e80.b.f(f11, "Client exchange handler");
        f11.h(aVar, hVar);
        if (aVar.e()) {
            p(hVar, g11, f11);
        }
    }

    public final void c(p pVar) {
        if (pVar != null) {
            try {
                pVar.close();
            } catch (IOException e11) {
                j(e11);
            }
        }
    }

    @Override // m70.i
    public void d(m70.h hVar, m70.c cVar) throws IOException, HttpException {
        a g11 = g(hVar);
        e80.b.f(g11, "Connection state");
        e80.b.b(g11.c() == f0.BODY_STREAM || g11.c() == f0.ACK_EXPECTED, "Unexpected request state %s", g11.c());
        p f11 = f(hVar);
        e80.b.f(f11, "Client exchange handler");
        if (g11.c() == f0.ACK_EXPECTED) {
            hVar.q();
            return;
        }
        f11.d(cVar, hVar);
        if (cVar.e()) {
            f11.D5();
            g11.j(l(f11) ? f0.READY : f0.COMPLETED);
        }
    }

    @Override // m70.i
    public void e(m70.h hVar) throws HttpException, IOException {
        HttpRequest a11;
        a g11 = g(hVar);
        e80.b.f(g11, "Connection state");
        e80.b.b(g11.e() == f0.READY, "Unexpected request state %s", g11.e());
        p f11 = f(hVar);
        e80.b.f(f11, "Client exchange handler");
        if (l(f11)) {
            a11 = g11.b().poll();
            e80.b.f(a11, "HTTP request");
        } else {
            a11 = g11.a();
            if (a11 == null) {
                throw new HttpException("Out of sequence response");
            }
        }
        HttpResponse N6 = hVar.N6();
        int statusCode = N6.n().getStatusCode();
        if (statusCode < 100) {
            throw new ProtocolException("Invalid response: " + N6.n());
        }
        if (statusCode < 200) {
            if (statusCode != 100) {
                throw new ProtocolException("Unexpected response: " + N6.n());
            }
            if (g11.c() == f0.ACK_EXPECTED) {
                hVar.setSocketTimeout(g11.f());
                hVar.f();
                g11.j(f0.BODY_STREAM);
                return;
            }
            return;
        }
        g11.k(N6);
        if (g11.c() == f0.ACK_EXPECTED) {
            hVar.setSocketTimeout(g11.f());
            hVar.K();
            g11.j(f0.COMPLETED);
        } else if (g11.c() == f0.BODY_STREAM && statusCode >= 400) {
            hVar.K();
            hVar.q();
            g11.j(f0.COMPLETED);
            g11.g();
        }
        if (a(a11, N6)) {
            f11.B(N6);
            g11.l(f0.BODY_STREAM);
        } else {
            N6.setEntity(null);
            f11.B(N6);
            hVar.M();
            p(hVar, g11, f11);
        }
    }

    @Override // m70.i
    public void h(m70.h hVar, Object obj) throws IOException, HttpException {
        hVar.getContext().b("http.nio.http-exchange-state", new a());
        i(hVar);
    }

    @Override // m70.i
    public void i(m70.h hVar) throws IOException, HttpException {
        a g11 = g(hVar);
        e80.b.f(g11, "Connection state");
        f0 c11 = g11.c();
        f0 f0Var = f0.READY;
        e80.b.b(c11 == f0Var || g11.c() == f0.COMPLETED, "Unexpected request state %s", g11.c());
        f0 c12 = g11.c();
        f0 f0Var2 = f0.COMPLETED;
        if (c12 == f0Var2) {
            hVar.q();
            return;
        }
        synchronized (hVar.getContext()) {
            p f11 = f(hVar);
            if (f11 != null && !f11.isDone()) {
                boolean l11 = l(f11);
                HttpRequest G = f11.G();
                if (G == null) {
                    hVar.q();
                    return;
                }
                ProtocolVersion protocolVersion = G.getRequestLine().getProtocolVersion();
                if (l11 && protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                    throw new ProtocolException(protocolVersion + " cannot be used with request pipelining");
                }
                g11.i(G);
                if (l11) {
                    g11.b().add(G);
                }
                if (!(G instanceof org.apache.http.l)) {
                    hVar.G5(G);
                    f11.D5();
                    if (!l11) {
                        f0Var = f0Var2;
                    }
                    g11.j(f0Var);
                    return;
                }
                org.apache.http.l lVar = (org.apache.http.l) G;
                boolean expectContinue = lVar.expectContinue();
                if (expectContinue && l11) {
                    throw new ProtocolException("Expect-continue handshake cannot be used with request pipelining");
                }
                hVar.G5(G);
                if (expectContinue) {
                    g11.m(hVar.x());
                    hVar.setSocketTimeout(this.f95684a);
                    g11.j(f0.ACK_EXPECTED);
                    return;
                } else {
                    if (lVar.getEntity() != null) {
                        g11.j(f0.BODY_STREAM);
                        return;
                    }
                    f11.D5();
                    if (!l11) {
                        f0Var = f0Var2;
                    }
                    g11.j(f0Var);
                    return;
                }
            }
            hVar.q();
        }
    }

    public void j(Exception exc) {
        this.f95685b.a(exc);
    }

    @Override // m70.i
    public void k(m70.h hVar) {
        p f11 = f(hVar);
        if (f11 == null) {
            return;
        }
        a g11 = g(hVar);
        if (g11 != null) {
            f0 c11 = g11.c();
            f0 f0Var = f0.READY;
            if (c11 != f0Var || g11.e() != f0Var) {
                f11.b(new ConnectionClosedException("Connection closed unexpectedly"));
            }
        }
        if (!f11.isDone() && l(f11)) {
            f11.b(new ConnectionClosedException("Connection closed unexpectedly"));
        }
        if (g11 == null || f11.isDone()) {
            c(f11);
        }
    }

    @Override // m70.i
    public void m(m70.h hVar) throws IOException {
        a g11 = g(hVar);
        if (g11 != null) {
            if (g11.c() == f0.ACK_EXPECTED) {
                hVar.setSocketTimeout(g11.f());
                hVar.f();
                g11.j(f0.BODY_STREAM);
                g11.m(0);
                return;
            }
            g11.g();
            p f11 = f(hVar);
            if (f11 != null) {
                f11.b(new SocketTimeoutException(String.format("%,d milliseconds timeout on connection %s", Integer.valueOf(hVar.x()), hVar)));
                f11.close();
            }
        }
        if (hVar.getStatus() != 0) {
            hVar.shutdown();
            return;
        }
        hVar.close();
        if (hVar.getStatus() == 1) {
            hVar.setSocketTimeout(250);
        }
    }

    @Override // m70.i
    public void n(m70.h hVar) throws IOException {
        a g11 = g(hVar);
        synchronized (hVar.getContext()) {
            if (g11 != null) {
                try {
                    if (g11.c().compareTo(f0.READY) != 0) {
                        g11.g();
                    }
                    p f11 = f(hVar);
                    if (f11 != null) {
                        if (g11.h()) {
                            f11.W5();
                        } else {
                            f11.b(new ConnectionClosedException());
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (hVar.x() <= 0) {
                hVar.setSocketTimeout(1000);
            }
            hVar.close();
        }
    }

    @Override // m70.i
    public void o(m70.h hVar, Exception exc) {
        q(hVar);
        p f11 = f(hVar);
        if (f11 != null) {
            f11.b(exc);
        } else {
            j(exc);
        }
    }

    public final void p(m70.h hVar, a aVar, p pVar) throws IOException, HttpException {
        if (!aVar.h()) {
            hVar.close();
        }
        pVar.B2();
        if (!l(pVar)) {
            aVar.j(f0.READY);
            aVar.i(null);
        }
        aVar.l(f0.READY);
        aVar.k(null);
        if (pVar.isDone() || !hVar.isOpen()) {
            return;
        }
        hVar.f();
    }

    public final void q(m70.l lVar) {
        try {
            lVar.shutdown();
        } catch (IOException e11) {
            j(e11);
        }
    }

    public u(int i11) {
        this(i11, null);
    }

    public u() {
        this(3000, null);
    }
}
