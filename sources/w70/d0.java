package w70;

import com.badlogic.gdx.Net;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.ProtocolException;
import org.apache.http.UnsupportedHttpVersionException;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.entity.ContentType;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class d0 implements m70.s {

    /* renamed from: g, reason: collision with root package name */
    public static final String f95522g = "http.nio.http-exchange-state";

    /* renamed from: a, reason: collision with root package name */
    public final c80.j f95523a;

    /* renamed from: b, reason: collision with root package name */
    public final org.apache.http.a f95524b;

    /* renamed from: c, reason: collision with root package name */
    public final org.apache.http.r f95525c;

    /* renamed from: d, reason: collision with root package name */
    public final w f95526d;

    /* renamed from: e, reason: collision with root package name */
    public final r f95527e;

    /* renamed from: f, reason: collision with root package name */
    public final org.apache.http.c f95528f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f95529a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final HttpRequest f95530b;

        /* renamed from: c, reason: collision with root package name */
        public final HttpResponse f95531c;

        /* renamed from: d, reason: collision with root package name */
        public final f f95532d;

        /* renamed from: e, reason: collision with root package name */
        public final m70.r f95533e;

        /* renamed from: f, reason: collision with root package name */
        public final HttpContext f95534f;

        public a(HttpRequest httpRequest, HttpResponse httpResponse, f fVar, m70.r rVar, HttpContext httpContext) {
            this.f95530b = httpRequest;
            this.f95531c = httpResponse;
            this.f95532d = fVar;
            this.f95533e = rVar;
            this.f95534f = httpContext;
        }

        @Override // w70.q
        public boolean e() {
            return this.f95529a.get();
        }

        @Override // w70.q
        public HttpRequest f() {
            return this.f95530b;
        }

        @Override // w70.q
        public HttpResponse k() {
            return this.f95531c;
        }

        @Override // w70.q
        public int l() {
            return this.f95533e.x();
        }

        @Override // w70.q
        public void m(int i11) {
            this.f95533e.setSocketTimeout(i11);
        }

        @Override // w70.q
        public void n(Cancellable cancellable) {
            if (this.f95529a.get()) {
                d0.this.y(cancellable, this.f95534f);
            } else if (!this.f95532d.g() || cancellable == null) {
                this.f95532d.h(cancellable);
            } else {
                cancellable.cancel();
            }
        }

        @Override // w70.q
        public void o(c0 c0Var) {
            e80.a.j(c0Var, "Response producer");
            if (this.f95529a.getAndSet(true)) {
                d0.this.z(c0Var, this.f95534f);
                return;
            }
            if (this.f95532d.g()) {
                try {
                    c0Var.close();
                    return;
                } catch (IOException e11) {
                    d0.this.B(e11);
                    return;
                }
            }
            d dVar = new d(this.f95530b, c0Var.k5(), c0Var, this.f95534f);
            synchronized (this.f95532d) {
                this.f95532d.j(dVar);
                this.f95532d.h(null);
                this.f95533e.f();
            }
        }

        @Override // w70.q
        public void p() {
            o(new k(this.f95531c));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Deprecated
    public static class b implements w {

        /* renamed from: a, reason: collision with root package name */
        public final y f95536a;

        public b(y yVar) {
            this.f95536a = yVar;
        }

        @Override // w70.w
        public v<?> a(HttpRequest httpRequest) {
            return this.f95536a.a(httpRequest.getRequestLine().getUri());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final HttpRequest f95537a;

        /* renamed from: b, reason: collision with root package name */
        public final v<Object> f95538b;

        /* renamed from: c, reason: collision with root package name */
        public final s<Object> f95539c;

        /* renamed from: d, reason: collision with root package name */
        public final HttpContext f95540d;

        public c(HttpRequest httpRequest, v<Object> vVar, s<Object> sVar, HttpContext httpContext) {
            this.f95537a = httpRequest;
            this.f95538b = vVar;
            this.f95539c = sVar;
            this.f95540d = httpContext;
        }

        public s<Object> a() {
            return this.f95539c;
        }

        public HttpContext b() {
            return this.f95540d;
        }

        public v<Object> c() {
            return this.f95538b;
        }

        public HttpRequest d() {
            return this.f95537a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final HttpRequest f95541a;

        /* renamed from: b, reason: collision with root package name */
        public final HttpResponse f95542b;

        /* renamed from: c, reason: collision with root package name */
        public final c0 f95543c;

        /* renamed from: d, reason: collision with root package name */
        public final HttpContext f95544d;

        public d(HttpRequest httpRequest, HttpResponse httpResponse, c0 c0Var, HttpContext httpContext) {
            this.f95541a = httpRequest;
            this.f95542b = httpResponse;
            this.f95543c = c0Var;
            this.f95544d = httpContext;
        }

        public HttpContext a() {
            return this.f95544d;
        }

        public c0 b() {
            return this.f95543c;
        }

        public HttpRequest c() {
            return this.f95541a;
        }

        public HttpResponse d() {
            return this.f95542b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final HttpRequest f95545a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f95546b;

        /* renamed from: c, reason: collision with root package name */
        public final Exception f95547c;

        /* renamed from: d, reason: collision with root package name */
        public final v<Object> f95548d;

        /* renamed from: e, reason: collision with root package name */
        public final HttpContext f95549e;

        public e(HttpRequest httpRequest, Object obj, Exception exc, v<Object> vVar, HttpContext httpContext) {
            this.f95545a = httpRequest;
            this.f95546b = obj;
            this.f95547c = exc;
            this.f95548d = vVar;
            this.f95549e = httpContext;
        }

        public HttpContext a() {
            return this.f95549e;
        }

        public Exception b() {
            return this.f95547c;
        }

        public v<Object> c() {
            return this.f95548d;
        }

        public HttpRequest d() {
            return this.f95545a;
        }

        public Object e() {
            return this.f95546b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Queue<e> f95550a = new ConcurrentLinkedQueue();

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f95551b;

        /* renamed from: c, reason: collision with root package name */
        public volatile f0 f95552c;

        /* renamed from: d, reason: collision with root package name */
        public volatile f0 f95553d;

        /* renamed from: e, reason: collision with root package name */
        public volatile c f95554e;

        /* renamed from: f, reason: collision with root package name */
        public volatile d f95555f;

        /* renamed from: g, reason: collision with root package name */
        public volatile Cancellable f95556g;

        public f() {
            f0 f0Var = f0.READY;
            this.f95552c = f0Var;
            this.f95553d = f0Var;
        }

        public Cancellable a() {
            return this.f95556g;
        }

        public c b() {
            return this.f95554e;
        }

        public d c() {
            return this.f95555f;
        }

        public Queue<e> d() {
            return this.f95550a;
        }

        public f0 e() {
            return this.f95552c;
        }

        public f0 f() {
            return this.f95553d;
        }

        public boolean g() {
            return this.f95551b;
        }

        public void h(Cancellable cancellable) {
            this.f95556g = cancellable;
        }

        public void i(c cVar) {
            this.f95554e = cVar;
        }

        public void j(d dVar) {
            this.f95555f = dVar;
        }

        public void k(f0 f0Var) {
            this.f95552c = f0Var;
        }

        public void l(f0 f0Var) {
            this.f95553d = f0Var;
        }

        public void m() {
            this.f95551b = true;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[incoming ");
            sb2.append(this.f95552c);
            if (this.f95554e != null) {
                sb2.append(" ");
                sb2.append(this.f95554e.d().getRequestLine());
            }
            sb2.append("; outgoing ");
            sb2.append(this.f95553d);
            if (this.f95555f != null) {
                sb2.append(" ");
                sb2.append(this.f95555f.d().n());
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    @Deprecated
    public d0(c80.j jVar, org.apache.http.a aVar, org.apache.http.r rVar, y yVar, r rVar2, HttpParams httpParams) {
        this(jVar, aVar, rVar, new b(yVar), rVar2);
    }

    public c0 A(Exception exc, HttpContext httpContext) {
        String message = exc.getMessage();
        if (message == null) {
            message = exc.toString();
        }
        return new n(m(D(exc, httpContext), httpContext), new t70.m(message, ContentType.DEFAULT_TEXT), false);
    }

    public void B(Exception exc) {
        this.f95528f.a(exc);
    }

    public final void C(m70.l lVar) {
        try {
            lVar.shutdown();
        } catch (IOException e11) {
            B(e11);
        }
    }

    public int D(Exception exc, HttpContext httpContext) {
        if (exc instanceof MethodNotSupportedException) {
            return 501;
        }
        if (exc instanceof UnsupportedHttpVersionException) {
            return 505;
        }
        return exc instanceof ProtocolException ? 400 : 500;
    }

    @Override // m70.s
    public void a(m70.r rVar) throws IOException, HttpException {
        m70.r rVar2;
        f x11 = x(rVar);
        e80.b.f(x11, "Connection state");
        f0 f11 = x11.f();
        f0 f0Var = f0.READY;
        e80.b.b(f11 == f0Var || x11.f() == f0.INIT, "Unexpected response state %s", x11.f());
        if (x11.e() == f0.ACK_EXPECTED) {
            synchronized (x11) {
                try {
                    d c11 = x11.c();
                    if (c11 == null) {
                        rVar.q();
                        return;
                    }
                    HttpResponse d11 = c11.d();
                    int statusCode = d11.n().getStatusCode();
                    if (statusCode != 100) {
                        if (statusCode >= 400) {
                            rVar.M();
                            x11.k(f0Var);
                            h(rVar, x11);
                            return;
                        } else {
                            throw new HttpException("Invalid response: " + d11.n());
                        }
                    }
                    HttpContext a11 = c11.a();
                    c0 b11 = c11.b();
                    try {
                        d11.setEntity(null);
                        rVar.j();
                        x11.k(f0.BODY_STREAM);
                        x11.j(null);
                        rVar.t(d11);
                        b11.p(a11);
                        return;
                    } finally {
                        b11.close();
                    }
                } finally {
                }
            }
        }
        if (x11.f() == f0Var) {
            e poll = x11.d().poll();
            if (poll == null) {
                rVar.q();
                return;
            }
            x11.l(f0.INIT);
            Object e11 = poll.e();
            HttpRequest d12 = poll.d();
            HttpContext a12 = poll.a();
            rVar2 = rVar;
            a aVar = new a(d12, m(200, a12), x11, rVar2, a12);
            if (e11 != null) {
                v<Object> c12 = poll.c();
                rVar2.q();
                try {
                    c12.b(e11, aVar, a12);
                } catch (RuntimeException e12) {
                    throw e12;
                } catch (Exception e13) {
                    if (!aVar.e()) {
                        aVar.o(A(e13, a12));
                        return;
                    } else {
                        B(e13);
                        rVar2.close();
                        return;
                    }
                }
            } else {
                Exception b12 = poll.b();
                if (b12 == null) {
                    b12 = new HttpException("Internal error processing request");
                }
                aVar.o(A(b12, a12));
            }
        } else {
            rVar2 = rVar;
        }
        if (x11.f() == f0.INIT) {
            synchronized (x11) {
                try {
                    d c13 = x11.c();
                    if (c13 == null) {
                        rVar2.q();
                        return;
                    }
                    HttpResponse d13 = c13.d();
                    if (d13.n().getStatusCode() >= 200) {
                        h(rVar2, x11);
                        return;
                    }
                    throw new HttpException("Invalid response: " + d13.n());
                } finally {
                }
            }
        }
    }

    public final boolean b(HttpRequest httpRequest, HttpResponse httpResponse) {
        int statusCode;
        return ((httpRequest != null && Net.a.f11462a.equalsIgnoreCase(httpRequest.getRequestLine().getMethod())) || (statusCode = httpResponse.n().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    @Override // m70.s
    public void c(m70.r rVar) {
        rVar.getContext().b("http.nio.http-exchange-state", new f());
    }

    public final void d(f fVar) {
        s<Object> a11 = fVar.b() != null ? fVar.b().a() : null;
        if (a11 != null) {
            try {
                a11.close();
            } catch (IOException e11) {
                B(e11);
            }
        }
        c0 b11 = fVar.c() != null ? fVar.c().b() : null;
        if (b11 != null) {
            try {
                b11.close();
            } catch (IOException e12) {
                B(e12);
            }
        }
    }

    public final void e(f fVar, Exception exc) {
        s<Object> a11 = fVar.b() != null ? fVar.b().a() : null;
        if (a11 != null) {
            try {
                a11.b(exc);
            } finally {
                try {
                    a11.close();
                } catch (IOException e11) {
                    B(e11);
                }
            }
        }
        a11 = fVar.c() != null ? fVar.c().b() : null;
        if (a11 != null) {
            try {
                a11.b(exc);
                try {
                    a11.close();
                } catch (IOException e12) {
                    B(e12);
                }
            } finally {
                try {
                    a11.close();
                } catch (IOException e13) {
                    B(e13);
                }
            }
        }
    }

    @Override // m70.s
    public void f(m70.r rVar, m70.c cVar) throws HttpException, IOException {
        f x11 = x(rVar);
        e80.b.f(x11, "Connection state");
        e80.b.b(x11.f() == f0.BODY_STREAM, "Unexpected response state %s", x11.f());
        d c11 = x11.c();
        e80.b.f(c11, "Outgoing response");
        c11.b().d(cVar, rVar);
        if (cVar.e()) {
            k(c11, rVar, x11);
        }
    }

    @Override // m70.s
    public void g(m70.r rVar) throws IOException, HttpException {
        f x11 = x(rVar);
        e80.b.f(x11, "Connection state");
        f0 e11 = x11.e();
        f0 f0Var = f0.READY;
        e80.b.b(e11 == f0Var, "Unexpected request state %s", x11.e());
        HttpRequest n02 = rVar.n0();
        c80.a aVar = new c80.a();
        aVar.b("http.request", n02);
        aVar.b("http.connection", rVar);
        this.f95523a.process(n02, aVar);
        v<Object> v11 = v(n02);
        s<Object> a11 = v11.a(n02, aVar);
        a11.d6(n02);
        c cVar = new c(n02, v11, a11, aVar);
        x11.i(cVar);
        if (!(n02 instanceof org.apache.http.l)) {
            i(cVar, rVar, x11);
            return;
        }
        if (!((org.apache.http.l) n02).expectContinue() || x11.f() != f0Var || !x11.d().isEmpty() || ((rVar instanceof x70.i) && ((x70.i) rVar).a())) {
            x11.k(f0.BODY_STREAM);
            return;
        }
        x11.k(f0.ACK_EXPECTED);
        HttpResponse m11 = m(100, aVar);
        if (this.f95527e == null) {
            rVar.t(m11);
            x11.k(f0.BODY_STREAM);
        } else {
            rVar.e();
            rVar.q();
            this.f95527e.a(new a(n02, m11, x11, rVar, aVar), aVar);
        }
    }

    public final void h(m70.r rVar, f fVar) throws IOException, HttpException {
        d c11 = fVar.c();
        e80.b.f(c11, "Outgoing response");
        HttpRequest c12 = c11.c();
        HttpResponse d11 = c11.d();
        HttpContext a11 = c11.a();
        a11.b("http.response", d11);
        this.f95523a.g(d11, a11);
        HttpEntity entity = d11.getEntity();
        if (entity != null && !b(c12, d11)) {
            entity = null;
            d11.setEntity(null);
        }
        rVar.t(d11);
        if (entity == null) {
            k(c11, rVar, fVar);
        } else {
            fVar.l(f0.BODY_STREAM);
        }
    }

    public final void i(c cVar, m70.r rVar, f fVar) throws IOException {
        f0 f0Var = f0.READY;
        fVar.k(f0Var);
        fVar.i(null);
        s<Object> a11 = cVar.a();
        try {
            HttpContext b11 = cVar.b();
            a11.s(b11);
            e eVar = new e(cVar.d(), a11.getResult(), a11.m(), cVar.c(), b11);
            a11.close();
            fVar.d().add(eVar);
            if (fVar.f() == f0Var) {
                rVar.f();
            }
        } catch (Throwable th2) {
            a11.close();
            throw th2;
        }
    }

    @Override // m70.s
    public void j(m70.r rVar, m70.a aVar) throws IOException, HttpException {
        f x11 = x(rVar);
        e80.b.f(x11, "Connection state");
        e80.b.b(x11.e() == f0.BODY_STREAM, "Unexpected request state %s", x11.e());
        c b11 = x11.b();
        e80.b.f(b11, "Incoming request");
        b11.a().h(aVar, rVar);
        if (aVar.e()) {
            i(b11, rVar, x11);
        }
    }

    public final void k(d dVar, m70.r rVar, f fVar) throws IOException {
        HttpContext a11 = dVar.a();
        HttpResponse d11 = dVar.d();
        c0 b11 = dVar.b();
        try {
            b11.p(a11);
            fVar.j(null);
            fVar.h(null);
            fVar.l(f0.READY);
            b11.close();
            if (this.f95524b.a(d11, a11)) {
                rVar.j();
            } else {
                rVar.close();
            }
        } catch (Throwable th2) {
            b11.close();
            throw th2;
        }
    }

    @Override // m70.s
    public void l(m70.r rVar) {
        f fVar = (f) rVar.getContext().removeAttribute("http.nio.http-exchange-state");
        if (fVar != null) {
            fVar.m();
            d(fVar);
            Cancellable a11 = fVar.a();
            if (a11 != null) {
                a11.cancel();
            }
        }
    }

    public HttpResponse m(int i11, HttpContext httpContext) {
        return this.f95525c.a(HttpVersion.HTTP_1_1, i11, httpContext);
    }

    @Override // m70.s
    public void n(m70.r rVar) throws IOException {
        f x11 = x(rVar);
        if (x11 != null) {
            e(x11, new SocketTimeoutException(String.format("%,d milliseconds timeout on connection %s", Integer.valueOf(rVar.x()), rVar)));
        }
        if (rVar.getStatus() != 0) {
            rVar.shutdown();
            return;
        }
        rVar.close();
        if (rVar.getStatus() == 1) {
            rVar.setSocketTimeout(250);
        }
    }

    @Override // m70.s
    public void o(m70.r rVar, Exception exc) {
        e poll;
        c b11;
        B(exc);
        f x11 = x(rVar);
        if (x11 == null) {
            C(rVar);
            return;
        }
        x11.m();
        e(x11, exc);
        try {
            Cancellable a11 = x11.a();
            if (a11 != null) {
                a11.cancel();
            }
            if (!(exc instanceof SocketException) && exc.getClass() != IOException.class) {
                if (exc instanceof SocketTimeoutException) {
                    rVar.close();
                    return;
                }
                if (!rVar.t0()) {
                    f0 f11 = x11.f();
                    f0 f0Var = f0.INIT;
                    if (f11.compareTo(f0Var) <= 0) {
                        HttpRequest n02 = rVar.n0();
                        if (n02 == null && (b11 = x11.b()) != null) {
                            n02 = b11.d();
                        }
                        if (n02 == null && (poll = x11.d().poll()) != null) {
                            n02 = poll.d();
                        }
                        if (n02 == null) {
                            rVar.close();
                            return;
                        }
                        rVar.M();
                        c80.g c11 = c80.g.c();
                        c0 A = A(exc, c11);
                        d dVar = new d(n02, A.k5(), A, c11);
                        x11.l(f0Var);
                        x11.j(dVar);
                        h(rVar, x11);
                        return;
                    }
                }
                rVar.close();
                return;
            }
            rVar.shutdown();
        } catch (Exception e11) {
            C(rVar);
            d(x11);
            if (e11 instanceof RuntimeException) {
                throw ((RuntimeException) e11);
            }
            B(e11);
        }
    }

    @Override // m70.s
    public void p(m70.r rVar) throws IOException {
        if (rVar.x() <= 0) {
            rVar.setSocketTimeout(1000);
        }
        rVar.close();
    }

    public org.apache.http.a q() {
        return this.f95524b;
    }

    public org.apache.http.c r() {
        return this.f95528f;
    }

    public r s() {
        return this.f95527e;
    }

    public w t() {
        return this.f95526d;
    }

    public c80.j u() {
        return this.f95523a;
    }

    public final v<Object> v(HttpRequest httpRequest) {
        w wVar = this.f95526d;
        v<?> a11 = wVar != null ? wVar.a(httpRequest) : null;
        return a11 == null ? o0.f95612a : a11;
    }

    public org.apache.http.r w() {
        return this.f95525c;
    }

    public final f x(m70.l lVar) {
        return (f) lVar.getContext().getAttribute("http.nio.http-exchange-state");
    }

    public void y(Cancellable cancellable, HttpContext httpContext) {
        throw new IllegalStateException("Response already submitted");
    }

    public void z(c0 c0Var, HttpContext httpContext) {
        throw new IllegalStateException("Response already submitted");
    }

    @Deprecated
    public d0(c80.j jVar, org.apache.http.a aVar, y yVar, HttpParams httpParams) {
        this(jVar, aVar, x60.l.f97646b, new b(yVar), null);
    }

    public d0(c80.j jVar, org.apache.http.a aVar, org.apache.http.r rVar, w wVar, r rVar2) {
        this(jVar, aVar, rVar, wVar, rVar2, (org.apache.http.c) null);
    }

    public d0(c80.j jVar, org.apache.http.a aVar, org.apache.http.r rVar, w wVar, r rVar2, org.apache.http.c cVar) {
        this.f95523a = (c80.j) e80.a.j(jVar, "HTTP processor");
        this.f95524b = aVar == null ? x60.i.f97640a : aVar;
        this.f95525c = rVar == null ? x60.l.f97646b : rVar;
        this.f95526d = wVar;
        this.f95527e = rVar2;
        this.f95528f = cVar == null ? org.apache.http.c.f77710a : cVar;
    }

    public d0(c80.j jVar, w wVar) {
        this(jVar, null, null, wVar, null);
    }

    public d0(c80.j jVar, w wVar, org.apache.http.c cVar) {
        this(jVar, (org.apache.http.a) null, (org.apache.http.r) null, wVar, (r) null, cVar);
    }
}
