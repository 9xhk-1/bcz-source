package org.apache.http;

import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface o {
    void c(e eVar);

    void d(e eVar);

    boolean f(String str);

    void g(String str, String str2);

    @Deprecated
    HttpParams getParams();

    ProtocolVersion getProtocolVersion();

    @Deprecated
    void i(HttpParams httpParams);

    e j(String str);

    h l();

    e[] m(String str);

    void q(String str, String str2);

    void s(e eVar);

    h t(String str);

    void u(e[] eVarArr);

    void v(String str);

    e w(String str);

    e[] x();
}
