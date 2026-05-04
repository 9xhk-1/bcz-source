package b70;

import java.io.IOException;
import m70.t;
import m70.u;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
@Deprecated
/* loaded from: classes9.dex */
public class h extends h70.a<t> {

    /* renamed from: b, reason: collision with root package name */
    public final z70.b f6313b;

    /* renamed from: c, reason: collision with root package name */
    public final u f6314c;

    /* renamed from: d, reason: collision with root package name */
    public final HttpParams f6315d;

    public h(u uVar, HttpParams httpParams) {
        e80.a.j(uVar, "HTTP service handler");
        e80.a.j(httpParams, "HTTP parameters");
        this.f6313b = n();
        this.f6314c = uVar;
        this.f6315d = httpParams;
    }

    public z70.b n() {
        return z70.g.f101095a;
    }

    @Override // h70.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public t f(x70.f fVar) {
        return new f(fVar, p(), this.f6313b, this.f6315d);
    }

    public org.apache.http.p p() {
        return x60.k.f97641a;
    }

    @Override // h70.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(t tVar) {
        this.f6314c.l(tVar);
    }

    @Override // h70.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void i(t tVar) {
        tVar.setSocketTimeout(a80.g.e(this.f6315d));
        this.f6314c.c(tVar);
    }

    @Override // h70.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void j(t tVar, IOException iOException) {
        this.f6314c.r(tVar, iOException);
    }

    @Override // h70.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void k(t tVar) {
        tVar.v6(this.f6314c);
    }

    @Override // h70.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void l(t tVar) {
        tVar.K1(this.f6314c);
    }

    @Override // h70.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(t tVar) {
        this.f6314c.n(tVar);
    }
}
