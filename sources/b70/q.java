package b70;

import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class q implements HttpContext {

    /* renamed from: b, reason: collision with root package name */
    public final x70.f f6364b;

    public q(x70.f fVar) {
        this.f6364b = fVar;
    }

    @Override // org.apache.http.protocol.HttpContext
    public void b(String str, Object obj) {
        this.f6364b.b(str, obj);
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        return this.f6364b.getAttribute(str);
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        return this.f6364b.removeAttribute(str);
    }

    public String toString() {
        return "[ioSession=" + this.f6364b + "]";
    }
}
