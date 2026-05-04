package w70;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class o0 implements v<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f95612a = new o0();

    @Override // w70.v
    public s<Object> a(HttpRequest httpRequest, HttpContext httpContext) {
        return new n0();
    }

    @Override // w70.v
    public void b(Object obj, q qVar, HttpContext httpContext) {
        HttpResponse k11 = qVar.k();
        k11.e(501);
        qVar.o(new n(k11, new t70.m("Service not implemented", ContentType.TEXT_PLAIN), true));
    }
}
