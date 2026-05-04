package b70;

import java.io.IOException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import m70.t;
import m70.u;
import org.apache.http.impl.nio.reactor.SSLMode;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class p implements x70.c {

    /* renamed from: f, reason: collision with root package name */
    public static final String f6359f = "SSL_SESSION";

    /* renamed from: b, reason: collision with root package name */
    public final u f6360b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLContext f6361c;

    /* renamed from: d, reason: collision with root package name */
    public final h70.p f6362d;

    /* renamed from: e, reason: collision with root package name */
    public final HttpParams f6363e;

    public p(u uVar, SSLContext sSLContext, h70.p pVar, HttpParams httpParams) {
        e80.a.j(uVar, "HTTP service handler");
        e80.a.j(sSLContext, "SSL context");
        e80.a.j(httpParams, "HTTP parameters");
        this.f6360b = uVar;
        this.f6363e = httpParams;
        this.f6361c = sSLContext;
        this.f6362d = pVar;
    }

    @Override // x70.c
    public void a(x70.f fVar) {
        t tVar = (t) fVar.getAttribute("http.connection");
        h70.o oVar = (h70.o) fVar.getAttribute("SSL_SESSION");
        try {
            if (oVar.B()) {
                tVar.K1(this.f6360b);
            }
            oVar.F();
        } catch (IOException e11) {
            this.f6360b.r(tVar, e11);
            oVar.shutdown();
        }
    }

    @Override // x70.c
    public void b(x70.f fVar) {
        h70.o i11 = i(fVar, this.f6361c, this.f6362d);
        t g11 = g(i11);
        fVar.b("http.connection", g11);
        fVar.b("SSL_SESSION", i11);
        this.f6360b.c(g11);
        try {
            i11.L(SSLMode.SERVER, this.f6363e);
        } catch (SSLException e11) {
            this.f6360b.r(g11, e11);
            i11.shutdown();
        }
    }

    @Override // x70.c
    public void c(x70.f fVar) {
        t tVar = (t) fVar.getAttribute("http.connection");
        h70.o oVar = (h70.o) fVar.getAttribute("SSL_SESSION");
        this.f6360b.n(tVar);
        synchronized (oVar) {
            try {
                if (oVar.E() && !oVar.C()) {
                    oVar.shutdown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x70.c
    public void d(x70.f fVar) {
        t tVar = (t) fVar.getAttribute("http.connection");
        if (tVar != null) {
            this.f6360b.l(tVar);
        }
    }

    @Override // x70.c
    public void e(x70.f fVar) {
        t tVar = (t) fVar.getAttribute("http.connection");
        h70.o oVar = (h70.o) fVar.getAttribute("SSL_SESSION");
        try {
            if (oVar.A()) {
                tVar.v6(this.f6360b);
            }
            oVar.w();
        } catch (IOException e11) {
            this.f6360b.r(tVar, e11);
            oVar.shutdown();
        }
    }

    public z70.b f() {
        return z70.g.f101095a;
    }

    public t g(x70.f fVar) {
        return new f(fVar, h(), f(), this.f6363e);
    }

    public org.apache.http.p h() {
        return x60.k.f97641a;
    }

    public h70.o i(x70.f fVar, SSLContext sSLContext, h70.p pVar) {
        return new h70.o(fVar, sSLContext, pVar);
    }

    public p(u uVar, SSLContext sSLContext, HttpParams httpParams) {
        this(uVar, sSLContext, null, httpParams);
    }
}
