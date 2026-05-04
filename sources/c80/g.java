package c80;

import org.apache.http.HttpConnection;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g implements HttpContext {

    /* renamed from: c, reason: collision with root package name */
    public static final String f8339c = "http.connection";

    /* renamed from: d, reason: collision with root package name */
    public static final String f8340d = "http.request";

    /* renamed from: e, reason: collision with root package name */
    public static final String f8341e = "http.response";

    /* renamed from: f, reason: collision with root package name */
    public static final String f8342f = "http.target_host";

    /* renamed from: g, reason: collision with root package name */
    public static final String f8343g = "http.request_sent";

    /* renamed from: b, reason: collision with root package name */
    public final HttpContext f8344b;

    public g(HttpContext httpContext) {
        this.f8344b = httpContext;
    }

    public static g a(HttpContext httpContext) {
        e80.a.j(httpContext, "HTTP context");
        return httpContext instanceof g ? (g) httpContext : new g(httpContext);
    }

    public static g c() {
        return new g(new a());
    }

    @Override // org.apache.http.protocol.HttpContext
    public void b(String str, Object obj) {
        this.f8344b.b(str, obj);
    }

    public <T> T d(String str, Class<T> cls) {
        e80.a.j(cls, "Attribute class");
        Object attribute = getAttribute(str);
        if (attribute == null) {
            return null;
        }
        return cls.cast(attribute);
    }

    public HttpConnection e() {
        return (HttpConnection) d("http.connection", HttpConnection.class);
    }

    public <T extends HttpConnection> T f(Class<T> cls) {
        return (T) d("http.connection", cls);
    }

    public HttpRequest g() {
        return (HttpRequest) d("http.request", HttpRequest.class);
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        return this.f8344b.getAttribute(str);
    }

    public HttpResponse h() {
        return (HttpResponse) d("http.response", HttpResponse.class);
    }

    public HttpHost i() {
        return (HttpHost) d("http.target_host", HttpHost.class);
    }

    public boolean j() {
        Boolean bool = (Boolean) d("http.request_sent", Boolean.class);
        return bool != null && bool.booleanValue();
    }

    public void k(HttpHost httpHost) {
        b("http.target_host", httpHost);
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        return this.f8344b.removeAttribute(str);
    }

    public g() {
        this.f8344b = new a();
    }
}
