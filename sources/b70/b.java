package b70;

import java.io.IOException;
import javax.net.ssl.SSLContext;
import m70.i;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class b<H extends m70.i> extends h70.a<d> {

    /* renamed from: b, reason: collision with root package name */
    public final H f6292b;

    /* renamed from: c, reason: collision with root package name */
    public final m70.m<? extends d> f6293c;

    public b(H h11, m70.m<? extends d> mVar) {
        this.f6292b = (H) e80.a.j(h11, "HTTP client handler");
        this.f6293c = (m70.m) e80.a.j(mVar, "HTTP client connection factory");
    }

    public static <T extends m70.i> b<T> n(T t11, SSLContext sSLContext, v60.a aVar) {
        return sSLContext == null ? new b<>(t11, aVar) : new b<>(t11, sSLContext, aVar);
    }

    public static <T extends m70.i> b<T> o(T t11, SSLContext sSLContext, y70.f fVar, v60.a aVar) {
        return sSLContext == null ? new b<>(t11, aVar) : new b<>(t11, sSLContext, fVar, aVar);
    }

    @Override // h70.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public d f(x70.f fVar) {
        return this.f6293c.a(fVar);
    }

    public m70.m<? extends d> q() {
        return this.f6293c;
    }

    public H r() {
        return this.f6292b;
    }

    @Override // h70.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void h(d dVar) {
        this.f6292b.k(dVar);
    }

    @Override // h70.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void i(d dVar) {
        try {
            this.f6292b.h(dVar, dVar.getContext().getAttribute(x70.f.f97672c1));
        } catch (Exception e11) {
            this.f6292b.o(dVar, e11);
        }
    }

    @Override // h70.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void j(d dVar, IOException iOException) {
        this.f6292b.o(dVar, iOException);
    }

    @Override // h70.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void k(d dVar) {
        dVar.Z(this.f6292b);
    }

    @Override // h70.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void l(d dVar) {
        dVar.h0(this.f6292b);
    }

    @Override // h70.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m(d dVar) {
        try {
            this.f6292b.m(dVar);
        } catch (Exception e11) {
            this.f6292b.o(dVar, e11);
        }
    }

    @Deprecated
    public b(H h11, HttpParams httpParams) {
        this(h11, new e(httpParams));
    }

    @Deprecated
    public b(H h11, SSLContext sSLContext, y70.f fVar, HttpParams httpParams) {
        this(h11, new n(sSLContext, fVar, httpParams));
    }

    @Deprecated
    public b(H h11, SSLContext sSLContext, HttpParams httpParams) {
        this(h11, sSLContext, (y70.f) null, httpParams);
    }

    public b(H h11, v60.a aVar) {
        this(h11, new e(aVar));
    }

    public b(H h11, SSLContext sSLContext, y70.f fVar, v60.a aVar) {
        this(h11, new n(sSLContext, fVar, aVar));
    }

    public b(H h11, SSLContext sSLContext, v60.a aVar) {
        this(h11, new n(sSLContext, (y70.f) null, aVar));
    }
}
