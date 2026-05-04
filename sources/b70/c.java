package b70;

import java.io.IOException;
import javax.net.ssl.SSLContext;
import m70.s;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class c<H extends s> extends h70.a<f> {

    /* renamed from: b, reason: collision with root package name */
    public final H f6294b;

    /* renamed from: c, reason: collision with root package name */
    public final m70.m<? extends f> f6295c;

    public c(H h11, m70.m<? extends f> mVar) {
        this.f6294b = (H) e80.a.j(h11, "HTTP server handler");
        this.f6295c = (m70.m) e80.a.j(mVar, "HTTP server connection factory");
    }

    public static <T extends s> c<T> n(T t11, SSLContext sSLContext, v60.a aVar) {
        return sSLContext == null ? new c<>(t11, aVar) : new c<>(t11, sSLContext, aVar);
    }

    public static <T extends s> c<T> o(T t11, SSLContext sSLContext, v60.a aVar, org.apache.http.p pVar) {
        e70.h hVar = new e70.h(null, pVar);
        return sSLContext == null ? new c<>(t11, new g(null, hVar, null, aVar)) : new c<>(t11, new o(sSLContext, (y70.f) null, hVar, (m70.q<HttpResponse>) null, aVar));
    }

    public static <T extends s> c<T> p(T t11, SSLContext sSLContext, y70.f fVar, v60.a aVar) {
        return sSLContext == null ? new c<>(t11, aVar) : new c<>(t11, sSLContext, fVar, aVar);
    }

    @Override // h70.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public f f(x70.f fVar) {
        return this.f6295c.a(fVar);
    }

    public m70.m<? extends f> r() {
        return this.f6295c;
    }

    public H s() {
        return this.f6294b;
    }

    @Override // h70.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void h(f fVar) {
        this.f6294b.l(fVar);
    }

    @Override // h70.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void i(f fVar) {
        try {
            this.f6294b.c(fVar);
        } catch (Exception e11) {
            this.f6294b.o(fVar, e11);
        }
    }

    @Override // h70.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void j(f fVar, IOException iOException) {
        this.f6294b.o(fVar, iOException);
    }

    @Override // h70.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void k(f fVar) {
        fVar.Z(this.f6294b);
    }

    @Override // h70.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void l(f fVar) {
        fVar.h0(this.f6294b);
    }

    @Override // h70.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m(f fVar) {
        try {
            this.f6294b.n(fVar);
        } catch (Exception e11) {
            this.f6294b.o(fVar, e11);
        }
    }

    @Deprecated
    public c(H h11, HttpParams httpParams) {
        this(h11, new g(httpParams));
    }

    @Deprecated
    public c(H h11, SSLContext sSLContext, y70.f fVar, HttpParams httpParams) {
        this(h11, new o(sSLContext, fVar, httpParams));
    }

    @Deprecated
    public c(H h11, SSLContext sSLContext, HttpParams httpParams) {
        this(h11, sSLContext, (y70.f) null, httpParams);
    }

    public c(H h11, v60.a aVar) {
        this(h11, new g(aVar));
    }

    public c(H h11, SSLContext sSLContext, y70.f fVar, v60.a aVar) {
        this(h11, new o(sSLContext, fVar, aVar));
    }

    public c(H h11, SSLContext sSLContext, v60.a aVar) {
        this(h11, new o(sSLContext, (y70.f) null, aVar));
    }
}
