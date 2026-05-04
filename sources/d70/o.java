package d70;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface o {
    HttpRequest a(t tVar, a aVar) throws IOException, HttpException;

    void b(t tVar, a aVar);

    void c(HttpHost httpHost, HttpRequest httpRequest, t tVar, a aVar) throws IOException, HttpException;

    void d(t tVar, m70.a aVar, m70.g gVar) throws IOException;

    void e(t tVar, m70.c cVar, m70.g gVar) throws IOException;

    void f(HttpResponse httpResponse, t tVar, a aVar) throws IOException, HttpException;

    void g(t tVar, a aVar) throws IOException, HttpException;
}
