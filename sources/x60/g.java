package x60;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g extends c implements t {

    /* renamed from: h, reason: collision with root package name */
    public final k70.c<HttpRequest> f97632h;

    /* renamed from: i, reason: collision with root package name */
    public final k70.e<HttpResponse> f97633i;

    public g(int i11, int i12, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, v60.c cVar, w60.e eVar, w60.e eVar2, k70.d<HttpRequest> dVar, k70.f<HttpResponse> fVar) {
        super(i11, i12, charsetDecoder, charsetEncoder, cVar, eVar == null ? z60.a.f101034d : eVar, eVar2);
        this.f97632h = (dVar != null ? dVar : a70.j.f2252c).a(r(), cVar);
        this.f97633i = (fVar != null ? fVar : a70.p.f2262b).a(w());
    }

    @Override // org.apache.http.t
    public void F1(HttpResponse httpResponse) throws HttpException, IOException {
        e80.a.j(httpResponse, "HTTP response");
        k();
        this.f97633i.a(httpResponse);
        Z(httpResponse);
        if (httpResponse.n().getStatusCode() >= 200) {
            L();
        }
    }

    @Override // org.apache.http.t
    public HttpRequest I8() throws HttpException, IOException {
        k();
        HttpRequest a11 = this.f97632h.a();
        V(a11);
        I();
        return a11;
    }

    @Override // org.apache.http.t
    public void N5(HttpResponse httpResponse) throws HttpException, IOException {
        e80.a.j(httpResponse, "HTTP response");
        k();
        HttpEntity entity = httpResponse.getEntity();
        if (entity == null) {
            return;
        }
        OutputStream U = U(httpResponse);
        entity.writeTo(U);
        U.close();
    }

    @Override // org.apache.http.t
    public void S3(org.apache.http.l lVar) throws HttpException, IOException {
        e80.a.j(lVar, "HTTP request");
        k();
        lVar.setEntity(S(lVar));
    }

    @Override // x60.c
    public void c(Socket socket) throws IOException {
        super.c(socket);
    }

    @Override // org.apache.http.t
    public void flush() throws IOException {
        k();
        j();
    }

    public g(int i11, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, v60.c cVar) {
        this(i11, i11, charsetDecoder, charsetEncoder, cVar, null, null, null, null);
    }

    public g(int i11) {
        this(i11, i11, null, null, null, null, null, null, null);
    }

    public void V(HttpRequest httpRequest) {
    }

    public void Z(HttpResponse httpResponse) {
    }
}
