package org.apache.http;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface t extends HttpConnection {
    void F1(HttpResponse httpResponse) throws HttpException, IOException;

    HttpRequest I8() throws HttpException, IOException;

    void N5(HttpResponse httpResponse) throws HttpException, IOException;

    void S3(l lVar) throws HttpException, IOException;

    void flush() throws IOException;
}
