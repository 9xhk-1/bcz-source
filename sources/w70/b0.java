package w70;

import java.io.Closeable;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface b0<T> extends Closeable, Cancellable {
    void B(HttpResponse httpResponse) throws IOException, HttpException;

    void b(Exception exc);

    T getResult();

    void h(m70.a aVar, m70.g gVar) throws IOException;

    boolean isDone();

    Exception m();

    void p(HttpContext httpContext);
}
