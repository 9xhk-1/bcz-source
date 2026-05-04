package c80;

import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public final class d implements HttpContext {

    /* renamed from: b, reason: collision with root package name */
    public final HttpContext f8303b;

    /* renamed from: c, reason: collision with root package name */
    public final HttpContext f8304c;

    public d(HttpContext httpContext, HttpContext httpContext2) {
        this.f8303b = (HttpContext) e80.a.j(httpContext, "HTTP context");
        this.f8304c = httpContext2;
    }

    public HttpContext a() {
        return this.f8304c;
    }

    @Override // org.apache.http.protocol.HttpContext
    public void b(String str, Object obj) {
        this.f8303b.b(str, obj);
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        Object attribute = this.f8303b.getAttribute(str);
        return attribute == null ? this.f8304c.getAttribute(str) : attribute;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        return this.f8303b.removeAttribute(str);
    }

    public String toString() {
        return "[local: " + this.f8303b + "defaults: " + this.f8304c + "]";
    }
}
