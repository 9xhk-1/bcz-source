package w70;

import java.io.Closeable;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface s<T> extends Closeable {
    void b(Exception exc);

    void d6(HttpRequest httpRequest) throws HttpException, IOException;

    T getResult();

    void h(m70.a aVar, m70.g gVar) throws IOException;

    boolean isDone();

    Exception m();

    void s(HttpContext httpContext);
}
