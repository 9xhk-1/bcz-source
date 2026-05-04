package i70;

import a80.g;
import h70.o;
import h70.r;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import m70.j;
import m70.k;
import org.apache.http.params.HttpParams;
import x70.f;
import y70.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class a extends b70.a {

    /* renamed from: e, reason: collision with root package name */
    public final SSLContext f60246e;

    /* renamed from: f, reason: collision with root package name */
    public final r f60247f;

    public a(j jVar, SSLContext sSLContext, r rVar, HttpParams httpParams) {
        super(jVar, httpParams);
        e80.a.j(sSLContext, "SSL context");
        e80.a.j(httpParams, "HTTP parameters");
        this.f60246e = sSLContext;
        this.f60247f = rVar;
    }

    @Override // b70.a, h70.a
    /* renamed from: o */
    public k f(f fVar) {
        o x11 = x(fVar, this.f60246e, this.f60247f);
        fVar.b(e.f99492o, x11);
        k w11 = w(x11);
        try {
            x11.y();
            return w11;
        } catch (SSLException e11) {
            this.f6289b.p(w11, e11);
            x11.shutdown();
            return w11;
        }
    }

    @Override // b70.a, h70.a
    /* renamed from: r */
    public void i(k kVar) {
        kVar.setSocketTimeout(g.e(this.f6291d));
        this.f6289b.h(kVar, kVar.getContext().getAttribute(f.f97672c1));
    }

    public k w(o oVar) {
        return super.f(oVar);
    }

    public o x(f fVar, SSLContext sSLContext, r rVar) {
        return new o(fVar, sSLContext, rVar);
    }

    public a(j jVar, SSLContext sSLContext, HttpParams httpParams) {
        this(jVar, sSLContext, null, httpParams);
    }
}
