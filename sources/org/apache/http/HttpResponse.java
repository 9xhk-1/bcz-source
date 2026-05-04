package org.apache.http;

import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface HttpResponse extends o {
    void a(ProtocolVersion protocolVersion, int i11, String str);

    void b(String str) throws IllegalStateException;

    void e(int i11) throws IllegalStateException;

    HttpEntity getEntity();

    Locale h();

    x n();

    void o(ProtocolVersion protocolVersion, int i11);

    void p(x xVar);

    void setEntity(HttpEntity httpEntity);

    void setLocale(Locale locale);
}
