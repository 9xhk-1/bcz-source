package e70;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class j implements m70.q<HttpRequest> {

    /* renamed from: b, reason: collision with root package name */
    public static final j f49553b = new j();

    /* renamed from: a, reason: collision with root package name */
    public final l70.p f49554a;

    public j(l70.p pVar) {
        this.f49554a = pVar == null ? l70.j.f70706b : pVar;
    }

    @Override // m70.q
    public m70.p<HttpRequest> a(x70.k kVar) {
        return new i(kVar, this.f49554a);
    }

    public j() {
        this(null);
    }
}
