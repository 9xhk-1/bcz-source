package c80;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public class f0 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final g0<m> f8338a;

    public f0(g0<m> g0Var) {
        this.f8338a = (g0) e80.a.j(g0Var, "Pattern matcher");
    }

    @Override // c80.n
    public m a(HttpRequest httpRequest) {
        e80.a.j(httpRequest, "HTTP request");
        return this.f8338a.c(b(httpRequest));
    }

    public String b(HttpRequest httpRequest) {
        String uri = httpRequest.getRequestLine().getUri();
        int indexOf = uri.indexOf(63);
        if (indexOf != -1) {
            return uri.substring(0, indexOf);
        }
        int indexOf2 = uri.indexOf(35);
        return indexOf2 != -1 ? uri.substring(0, indexOf2) : uri;
    }

    public void c(String str, m mVar) {
        e80.a.j(str, "Pattern");
        e80.a.j(mVar, "Handler");
        this.f8338a.e(str, mVar);
    }

    public void d(String str) {
        this.f8338a.h(str);
    }

    public f0() {
        this(new g0());
    }
}
