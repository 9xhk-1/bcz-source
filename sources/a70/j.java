package a70;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class j implements k70.d<HttpRequest> {

    /* renamed from: c, reason: collision with root package name */
    public static final j f2252c = new j();

    /* renamed from: a, reason: collision with root package name */
    public final l70.q f2253a;

    /* renamed from: b, reason: collision with root package name */
    public final org.apache.http.p f2254b;

    public j(l70.q qVar, org.apache.http.p pVar) {
        this.f2253a = qVar == null ? l70.k.f70708c : qVar;
        this.f2254b = pVar == null ? x60.k.f97641a : pVar;
    }

    @Override // k70.d
    public k70.c<HttpRequest> a(k70.h hVar, v60.c cVar) {
        return new i(hVar, this.f2253a, this.f2254b, cVar);
    }

    public j() {
        this(null, null);
    }
}
