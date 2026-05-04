package org.apache.http;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface i extends HttpConnection {
    boolean I5(int i11) throws IOException;

    void V7(HttpRequest httpRequest) throws HttpException, IOException;

    HttpResponse Y3() throws HttpException, IOException;

    void e0(l lVar) throws HttpException, IOException;

    void flush() throws IOException;

    void y3(HttpResponse httpResponse) throws HttpException, IOException;
}
