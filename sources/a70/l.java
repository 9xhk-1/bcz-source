package a70;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class l implements k70.f<HttpRequest> {

    /* renamed from: b, reason: collision with root package name */
    public static final l f2255b = new l();

    /* renamed from: a, reason: collision with root package name */
    public final l70.p f2256a;

    public l(l70.p pVar) {
        this.f2256a = pVar == null ? l70.j.f70706b : pVar;
    }

    @Override // k70.f
    public k70.e<HttpRequest> a(k70.i iVar) {
        return new k(iVar, this.f2256a);
    }

    public l() {
        this(null);
    }
}
