package w70;

import java.io.Closeable;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.concurrent.Cancellable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface p extends Closeable, Cancellable {
    void B(HttpResponse httpResponse) throws IOException, HttpException;

    void B2() throws IOException, HttpException;

    void D5();

    HttpRequest G() throws IOException, HttpException;

    void W5();

    void b(Exception exc);

    void d(m70.c cVar, m70.g gVar) throws IOException;

    void h(m70.a aVar, m70.g gVar) throws IOException;

    boolean isDone();
}
