package x60;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e extends c implements org.apache.http.i {

    /* renamed from: h, reason: collision with root package name */
    public final k70.c<HttpResponse> f97624h;

    /* renamed from: i, reason: collision with root package name */
    public final k70.e<HttpRequest> f97625i;

    public e(int i11, int i12, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, v60.c cVar, w60.e eVar, w60.e eVar2, k70.f<HttpRequest> fVar, k70.d<HttpResponse> dVar) {
        super(i11, i12, charsetDecoder, charsetEncoder, cVar, eVar, eVar2);
        this.f97625i = (fVar == null ? a70.l.f2255b : fVar).a(w());
        this.f97624h = (dVar == null ? a70.n.f2259c : dVar).a(r(), cVar);
    }

    @Override // org.apache.http.i
    public boolean I5(int i11) throws IOException {
        k();
        try {
            return a(i11);
        } catch (SocketTimeoutException unused) {
            return false;
        }
    }

    @Override // org.apache.http.i
    public void V7(HttpRequest httpRequest) throws HttpException, IOException {
        e80.a.j(httpRequest, "HTTP request");
        k();
        this.f97625i.a(httpRequest);
        V(httpRequest);
        I();
    }

    @Override // org.apache.http.i
    public HttpResponse Y3() throws HttpException, IOException {
        k();
        HttpResponse a11 = this.f97624h.a();
        Z(a11);
        if (a11.n().getStatusCode() >= 200) {
            L();
        }
        return a11;
    }

    @Override // x60.c
    public void c(Socket socket) throws IOException {
        super.c(socket);
    }

    @Override // org.apache.http.i
    public void e0(org.apache.http.l lVar) throws HttpException, IOException {
        e80.a.j(lVar, "HTTP request");
        k();
        HttpEntity entity = lVar.getEntity();
        if (entity == null) {
            return;
        }
        OutputStream U = U(lVar);
        entity.writeTo(U);
        U.close();
    }

    @Override // org.apache.http.i
    public void flush() throws IOException {
        k();
        j();
    }

    @Override // org.apache.http.i
    public void y3(HttpResponse httpResponse) throws HttpException, IOException {
        e80.a.j(httpResponse, "HTTP response");
        k();
        httpResponse.setEntity(S(httpResponse));
    }

    public e(int i11, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, v60.c cVar) {
        this(i11, i11, charsetDecoder, charsetEncoder, cVar, null, null, null, null);
    }

    public e(int i11) {
        this(i11, i11, null, null, null, null, null, null, null);
    }

    public void V(HttpRequest httpRequest) {
    }

    public void Z(HttpResponse httpResponse) {
    }
}
