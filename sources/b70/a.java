package b70;

import java.io.IOException;
import org.apache.http.params.HttpParams;
import org.apache.http.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class a extends h70.a<m70.k> {

    /* renamed from: b, reason: collision with root package name */
    public final m70.j f6289b;

    /* renamed from: c, reason: collision with root package name */
    public final z70.b f6290c;

    /* renamed from: d, reason: collision with root package name */
    public final HttpParams f6291d;

    public a(m70.j jVar, HttpParams httpParams) {
        e80.a.j(jVar, "HTTP client handler");
        e80.a.j(httpParams, "HTTP parameters");
        this.f6290c = n();
        this.f6289b = jVar;
        this.f6291d = httpParams;
    }

    public z70.b n() {
        return z70.g.f101095a;
    }

    @Override // h70.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public m70.k f(x70.f fVar) {
        return new d(fVar, p(), this.f6290c, this.f6291d);
    }

    public r p() {
        return x60.l.f97646b;
    }

    @Override // h70.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(m70.k kVar) {
        this.f6289b.k(kVar);
    }

    @Override // h70.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void i(m70.k kVar) {
        kVar.setSocketTimeout(a80.g.e(this.f6291d));
        this.f6289b.h(kVar, kVar.getContext().getAttribute(x70.f.f97672c1));
    }

    @Override // h70.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void j(m70.k kVar, IOException iOException) {
        this.f6289b.p(kVar, iOException);
    }

    @Override // h70.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void k(m70.k kVar) {
        kVar.X7(this.f6289b);
    }

    @Override // h70.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void l(m70.k kVar) {
        kVar.M6(this.f6289b);
    }

    @Override // h70.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(m70.k kVar) {
        this.f6289b.m(kVar);
    }
}
