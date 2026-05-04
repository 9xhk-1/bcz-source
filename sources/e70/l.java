package e70;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class l implements m70.o<HttpResponse> {

    /* renamed from: c, reason: collision with root package name */
    public static final l f49556c = new l();

    /* renamed from: a, reason: collision with root package name */
    public final l70.q f49557a;

    /* renamed from: b, reason: collision with root package name */
    public final org.apache.http.r f49558b;

    public l(l70.q qVar, org.apache.http.r rVar) {
        this.f49557a = qVar == null ? l70.k.f70708c : qVar;
        this.f49558b = rVar == null ? x60.l.f97646b : rVar;
    }

    @Override // m70.o
    public m70.n<HttpResponse> a(x70.j jVar, v60.c cVar) {
        return new k(jVar, this.f49557a, this.f49558b, cVar);
    }

    public l() {
        this(null, null);
    }
}
