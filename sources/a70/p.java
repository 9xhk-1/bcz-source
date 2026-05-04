package a70;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class p implements k70.f<HttpResponse> {

    /* renamed from: b, reason: collision with root package name */
    public static final p f2262b = new p();

    /* renamed from: a, reason: collision with root package name */
    public final l70.p f2263a;

    public p(l70.p pVar) {
        this.f2263a = pVar == null ? l70.j.f70706b : pVar;
    }

    @Override // k70.f
    public k70.e<HttpResponse> a(k70.i iVar) {
        return new o(iVar, this.f2263a);
    }

    public p() {
        this(null);
    }
}
