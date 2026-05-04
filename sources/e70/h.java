package e70;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class h implements m70.o<HttpRequest> {

    /* renamed from: c, reason: collision with root package name */
    public static final h f49550c = new h();

    /* renamed from: a, reason: collision with root package name */
    public final l70.q f49551a;

    /* renamed from: b, reason: collision with root package name */
    public final org.apache.http.p f49552b;

    public h(l70.q qVar, org.apache.http.p pVar) {
        this.f49551a = qVar == null ? l70.k.f70708c : qVar;
        this.f49552b = pVar == null ? x60.k.f97641a : pVar;
    }

    @Override // m70.o
    public m70.n<HttpRequest> a(x70.j jVar, v60.c cVar) {
        return new g(jVar, this.f49551a, this.f49552b, cVar);
    }

    public h() {
        this(null, null);
    }
}
