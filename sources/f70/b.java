package f70;

import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.routing.HttpRoute;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public class b extends v70.a<HttpRoute, q70.e, c> {

    /* renamed from: p, reason: collision with root package name */
    public final Log f51144p;

    /* renamed from: q, reason: collision with root package name */
    public final long f51145q;

    /* renamed from: r, reason: collision with root package name */
    public final TimeUnit f51146r;

    public b(x70.a aVar, v70.c<HttpRoute, q70.e> cVar, v70.e<HttpRoute> eVar, int i11, int i12, long j11, TimeUnit timeUnit) {
        super(aVar, cVar, eVar, i11, i12);
        this.f51144p = org.apache.commons.logging.g.q(b.class);
        this.f51145q = j11;
        this.f51146r = timeUnit;
    }

    @Override // v70.a
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public c i(HttpRoute httpRoute, q70.e eVar) {
        c cVar = new c(this.f51144p, eVar.getId(), httpRoute, eVar, this.f51145q, this.f51146r);
        cVar.s(eVar.x());
        return cVar;
    }

    @Override // v70.a
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void y(c cVar) {
        cVar.b().setSocketTimeout(cVar.p());
    }

    @Override // v70.a
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void z(c cVar) {
        cVar.b().setSocketTimeout(0);
    }
}
