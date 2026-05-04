package a80;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public final class h {
    public static v60.a a(HttpParams httpParams) {
        v60.c b11 = b(httpParams);
        String str = (String) httpParams.getParameter(c.f2303b);
        return v60.a.c().c(str != null ? Charset.forName(str) : null).e((CodingErrorAction) httpParams.getParameter(c.f2310i)).e((CodingErrorAction) httpParams.getParameter(c.f2311j)).f(b11).a();
    }

    public static v60.c b(HttpParams httpParams) {
        return v60.c.c().b(httpParams.getIntParameter(b.f2299i, -1)).c(httpParams.getIntParameter(b.f2298h, -1)).a();
    }

    public static v60.f c(HttpParams httpParams) {
        return v60.f.c().h(httpParams.getIntParameter(b.f2291a, 0)).g(httpParams.getBooleanParameter(b.f2295e, false)).e(httpParams.getBooleanParameter(b.f2301k, false)).f(httpParams.getIntParameter(b.f2294d, -1)).i(httpParams.getBooleanParameter(b.f2292b, true)).a();
    }
}
