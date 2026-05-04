package a70;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class n implements k70.d<HttpResponse> {

    /* renamed from: c, reason: collision with root package name */
    public static final n f2259c = new n();

    /* renamed from: a, reason: collision with root package name */
    public final l70.q f2260a;

    /* renamed from: b, reason: collision with root package name */
    public final org.apache.http.r f2261b;

    public n(l70.q qVar, org.apache.http.r rVar) {
        this.f2260a = qVar == null ? l70.k.f70708c : qVar;
        this.f2261b = rVar == null ? x60.l.f97646b : rVar;
    }

    @Override // k70.d
    public k70.c<HttpResponse> a(k70.h hVar, v60.c cVar) {
        return new m(hVar, this.f2260a, this.f2261b, cVar);
    }

    public n() {
        this(null, null);
    }
}
