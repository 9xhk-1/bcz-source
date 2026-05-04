package b70;

import java.io.IOException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import org.apache.http.impl.nio.reactor.SSLMode;
import org.apache.http.params.HttpParams;
import org.apache.http.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class l implements x70.c {

    /* renamed from: f, reason: collision with root package name */
    public static final String f6337f = "SSL_SESSION";

    /* renamed from: b, reason: collision with root package name */
    public final m70.j f6338b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLContext f6339c;

    /* renamed from: d, reason: collision with root package name */
    public final h70.p f6340d;

    /* renamed from: e, reason: collision with root package name */
    public final HttpParams f6341e;

    public l(m70.j jVar, SSLContext sSLContext, h70.p pVar, HttpParams httpParams) {
        e80.a.j(jVar, "HTTP client handler");
        e80.a.j(sSLContext, "SSL context");
        e80.a.j(httpParams, "HTTP parameters");
        this.f6338b = jVar;
        this.f6341e = httpParams;
        this.f6339c = sSLContext;
        this.f6340d = pVar;
    }

    @Override // x70.c
    public void a(x70.f fVar) {
        m70.k kVar = (m70.k) fVar.getAttribute("http.connection");
        h70.o oVar = (h70.o) fVar.getAttribute("SSL_SESSION");
        try {
            if (oVar.B()) {
                kVar.M6(this.f6338b);
            }
            oVar.F();
        } catch (IOException e11) {
            this.f6338b.p(kVar, e11);
            oVar.shutdown();
        }
    }

    @Override // x70.c
    public void b(x70.f fVar) {
        h70.o i11 = i(fVar, this.f6339c, this.f6340d);
        m70.k g11 = g(i11);
        fVar.b("http.connection", g11);
        fVar.b("SSL_SESSION", i11);
        this.f6338b.h(g11, fVar.getAttribute(x70.f.f97672c1));
        try {
            i11.L(SSLMode.CLIENT, this.f6341e);
        } catch (SSLException e11) {
            this.f6338b.p(g11, e11);
            i11.shutdown();
        }
    }

    @Override // x70.c
    public void c(x70.f fVar) {
        m70.k kVar = (m70.k) fVar.getAttribute("http.connection");
        h70.o oVar = (h70.o) fVar.getAttribute("SSL_SESSION");
        this.f6338b.m(kVar);
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
        m70.k kVar = (m70.k) fVar.getAttribute("http.connection");
        if (kVar != null) {
            this.f6338b.k(kVar);
        }
    }

    @Override // x70.c
    public void e(x70.f fVar) {
        m70.k kVar = (m70.k) fVar.getAttribute("http.connection");
        h70.o oVar = (h70.o) fVar.getAttribute("SSL_SESSION");
        try {
            if (oVar.A()) {
                kVar.X7(this.f6338b);
            }
            oVar.w();
        } catch (IOException e11) {
            this.f6338b.p(kVar, e11);
            oVar.shutdown();
        }
    }

    public z70.b f() {
        return z70.g.f101095a;
    }

    public m70.k g(x70.f fVar) {
        return new d(fVar, h(), f(), this.f6341e);
    }

    public r h() {
        return x60.l.f97646b;
    }

    public h70.o i(x70.f fVar, SSLContext sSLContext, h70.p pVar) {
        return new h70.o(fVar, sSLContext, pVar);
    }

    public l(m70.j jVar, SSLContext sSLContext, HttpParams httpParams) {
        this(jVar, sSLContext, null, httpParams);
    }
}
