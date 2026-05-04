package u70;

import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public final class c implements a {
    public static int a(HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP parameters");
        return httpParams.getIntParameter(a.f91882a, 4096);
    }

    public static long b(HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP parameters");
        return httpParams.getLongParameter(a.f91884c, 500L);
    }

    public static boolean c(HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(a.f91885d, false);
    }

    public static long d(HttpParams httpParams) {
        e80.a.j(httpParams, "HTTP parameters");
        return httpParams.getLongParameter(a.f91883b, 1000L);
    }

    public static void e(HttpParams httpParams, int i11) {
        e80.a.j(httpParams, "HTTP parameters");
        httpParams.setIntParameter(a.f91882a, i11);
    }

    public static void f(HttpParams httpParams, long j11) {
        e80.a.j(httpParams, "HTTP parameters");
        httpParams.setLongParameter(a.f91884c, j11);
    }

    public static void g(HttpParams httpParams, boolean z11) {
        e80.a.j(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(a.f91885d, z11);
    }

    public static void h(HttpParams httpParams, long j11) {
        e80.a.j(httpParams, "HTTP parameters");
        httpParams.setLongParameter(a.f91883b, j11);
    }
}
