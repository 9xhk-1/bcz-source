package a80;

import java.nio.charset.CodingErrorAction;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public final class k implements c {
    public static String a(HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP parameters");
        String str = (String) httpParams.getParameter(c.f2304c);
        return str == null ? c80.f.f8331t.name() : str;
    }

    public static String b(HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP parameters");
        String str = (String) httpParams.getParameter(c.f2303b);
        return str == null ? c80.f.f8332u.name() : str;
    }

    public static CodingErrorAction c(HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP parameters");
        Object parameter = httpParams.getParameter(c.f2310i);
        return parameter == null ? CodingErrorAction.REPORT : (CodingErrorAction) parameter;
    }

    public static CodingErrorAction d(HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP parameters");
        Object parameter = httpParams.getParameter(c.f2311j);
        return parameter == null ? CodingErrorAction.REPORT : (CodingErrorAction) parameter;
    }

    public static String e(HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP parameters");
        return (String) httpParams.getParameter(c.f2305d);
    }

    public static ProtocolVersion f(HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP parameters");
        Object parameter = httpParams.getParameter(c.f2302a);
        return parameter == null ? HttpVersion.HTTP_1_1 : (ProtocolVersion) parameter;
    }

    public static void g(HttpParams httpParams, String str) {
        e80.a.j(httpParams, "HTTP parameters");
        httpParams.setParameter(c.f2304c, str);
    }

    public static void h(HttpParams httpParams, String str) {
        e80.a.j(httpParams, "HTTP parameters");
        httpParams.setParameter(c.f2303b, str);
    }

    public static void i(HttpParams httpParams, CodingErrorAction codingErrorAction) {
        e80.a.j(httpParams, "HTTP parameters");
        httpParams.setParameter(c.f2310i, codingErrorAction);
    }

    public static void j(HttpParams httpParams, CodingErrorAction codingErrorAction) {
        e80.a.j(httpParams, "HTTP parameters");
        httpParams.setParameter(c.f2311j, codingErrorAction);
    }

    public static void k(HttpParams httpParams, boolean z11) {
        e80.a.j(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(c.f2308g, z11);
    }

    public static void l(HttpParams httpParams, String str) {
        e80.a.j(httpParams, "HTTP parameters");
        httpParams.setParameter(c.f2305d, str);
    }

    public static void m(HttpParams httpParams, ProtocolVersion protocolVersion) {
        e80.a.j(httpParams, "HTTP parameters");
        httpParams.setParameter(c.f2302a, protocolVersion);
    }

    public static boolean n(HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(c.f2308g, false);
    }
}
