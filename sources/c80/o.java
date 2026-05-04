package c80;

import java.util.Map;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes9.dex */
public class o implements p {

    /* renamed from: a, reason: collision with root package name */
    public final g0<m> f8355a = new g0<>();

    @Override // c80.p
    public m a(String str) {
        return this.f8355a.c(str);
    }

    public Map<String, m> b() {
        return this.f8355a.b();
    }

    public void c(String str, m mVar) {
        e80.a.j(str, "URI request pattern");
        e80.a.j(mVar, "Request handler");
        this.f8355a.e(str, mVar);
    }

    public void d(Map<String, m> map) {
        this.f8355a.g(map);
    }

    public void e(String str) {
        this.f8355a.h(str);
    }
}
