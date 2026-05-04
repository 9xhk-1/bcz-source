package i70;

import a80.g;
import b70.h;
import h70.o;
import h70.r;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import m70.t;
import m70.u;
import org.apache.http.params.HttpParams;
import x70.f;
import y70.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class b extends h {

    /* renamed from: e, reason: collision with root package name */
    public final SSLContext f60248e;

    /* renamed from: f, reason: collision with root package name */
    public final r f60249f;

    public b(u uVar, SSLContext sSLContext, r rVar, HttpParams httpParams) {
        super(uVar, httpParams);
        e80.a.j(sSLContext, "SSL context");
        e80.a.j(httpParams, "HTTP parameters");
        this.f60248e = sSLContext;
        this.f60249f = rVar;
    }

    @Override // b70.h, h70.a
    /* renamed from: o */
    public t f(f fVar) {
        o x11 = x(fVar, this.f60248e, this.f60249f);
        fVar.b(e.f99492o, x11);
        t w11 = w(x11);
        try {
            x11.y();
            return w11;
        } catch (SSLException e11) {
            this.f6314c.r(w11, e11);
            x11.shutdown();
            return w11;
        }
    }

    @Override // b70.h, h70.a
    /* renamed from: r */
    public void i(t tVar) {
        tVar.setSocketTimeout(g.e(this.f6315d));
        this.f6314c.c(tVar);
    }

    public t w(o oVar) {
        return super.f(oVar);
    }

    public o x(f fVar, SSLContext sSLContext, r rVar) {
        return new o(fVar, sSLContext, rVar);
    }

    public b(u uVar, SSLContext sSLContext, HttpParams httpParams) {
        this(uVar, sSLContext, null, httpParams);
    }
}
