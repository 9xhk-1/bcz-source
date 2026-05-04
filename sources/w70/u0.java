package w70;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public class u0 implements w {

    /* renamed from: a, reason: collision with root package name */
    public final c80.g0<v<?>> f95693a;

    public u0(c80.g0<v<?>> g0Var) {
        this.f95693a = (c80.g0) e80.a.j(g0Var, "Pattern matcher");
    }

    @Override // w70.w
    public v<?> a(HttpRequest httpRequest) {
        return this.f95693a.c(b(httpRequest));
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

    public c80.g0<v<?>> c() {
        return this.f95693a;
    }

    public void d(String str, v<?> vVar) {
        this.f95693a.e(str, vVar);
    }

    public void e(String str) {
        this.f95693a.h(str);
    }

    public String toString() {
        return getClass().getName() + " [matcher=" + this.f95693a + "]";
    }

    public u0() {
        this(new c80.g0());
    }
}
