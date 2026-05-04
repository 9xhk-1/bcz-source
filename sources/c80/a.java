package c80;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes9.dex */
public class a implements HttpContext {

    /* renamed from: b, reason: collision with root package name */
    public final HttpContext f8295b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f8296c;

    public a() {
        this(null);
    }

    public void a() {
        this.f8296c.clear();
    }

    @Override // org.apache.http.protocol.HttpContext
    public void b(String str, Object obj) {
        e80.a.j(str, "Id");
        if (obj != null) {
            this.f8296c.put(str, obj);
        } else {
            this.f8296c.remove(str);
        }
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        HttpContext httpContext;
        e80.a.j(str, "Id");
        Object obj = this.f8296c.get(str);
        return (obj != null || (httpContext = this.f8295b) == null) ? obj : httpContext.getAttribute(str);
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        e80.a.j(str, "Id");
        return this.f8296c.remove(str);
    }

    public String toString() {
        return this.f8296c.toString();
    }

    public a(HttpContext httpContext) {
        this.f8296c = new ConcurrentHashMap();
        this.f8295b = httpContext;
    }
}
