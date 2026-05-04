package c80;

import com.badlogic.gdx.Net;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    public static final int f8353b = 3000;

    /* renamed from: a, reason: collision with root package name */
    public final int f8354a;

    public l(int i11) {
        this.f8354a = e80.a.k(i11, "Wait for continue time");
    }

    public static void b(org.apache.http.i iVar) {
        try {
            iVar.close();
        } catch (IOException unused) {
        }
    }

    public boolean a(HttpRequest httpRequest, HttpResponse httpResponse) {
        int statusCode;
        return (Net.a.f11462a.equalsIgnoreCase(httpRequest.getRequestLine().getMethod()) || (statusCode = httpResponse.n().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    public HttpResponse c(HttpRequest httpRequest, org.apache.http.i iVar, HttpContext httpContext) throws HttpException, IOException {
        e80.a.j(httpRequest, "HTTP request");
        e80.a.j(iVar, "Client connection");
        e80.a.j(httpContext, "HTTP context");
        HttpResponse httpResponse = null;
        int i11 = 0;
        while (true) {
            if (httpResponse != null && i11 >= 200) {
                return httpResponse;
            }
            httpResponse = iVar.Y3();
            i11 = httpResponse.n().getStatusCode();
            if (i11 < 100) {
                throw new ProtocolException("Invalid response: " + httpResponse.n());
            }
            if (a(httpRequest, httpResponse)) {
                iVar.y3(httpResponse);
            }
        }
    }

    public HttpResponse d(HttpRequest httpRequest, org.apache.http.i iVar, HttpContext httpContext) throws IOException, HttpException {
        e80.a.j(httpRequest, "HTTP request");
        e80.a.j(iVar, "Client connection");
        e80.a.j(httpContext, "HTTP context");
        httpContext.b("http.connection", iVar);
        httpContext.b("http.request_sent", Boolean.FALSE);
        iVar.V7(httpRequest);
        HttpResponse httpResponse = null;
        if (httpRequest instanceof org.apache.http.l) {
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            org.apache.http.l lVar = (org.apache.http.l) httpRequest;
            boolean z11 = true;
            if (lVar.expectContinue() && !protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                iVar.flush();
                if (iVar.I5(this.f8354a)) {
                    HttpResponse Y3 = iVar.Y3();
                    if (a(httpRequest, Y3)) {
                        iVar.y3(Y3);
                    }
                    int statusCode = Y3.n().getStatusCode();
                    if (statusCode >= 200) {
                        z11 = false;
                        httpResponse = Y3;
                    } else if (statusCode != 100) {
                        throw new ProtocolException("Unexpected response: " + Y3.n());
                    }
                }
            }
            if (z11) {
                iVar.e0(lVar);
            }
        }
        iVar.flush();
        httpContext.b("http.request_sent", Boolean.TRUE);
        return httpResponse;
    }

    public HttpResponse e(HttpRequest httpRequest, org.apache.http.i iVar, HttpContext httpContext) throws IOException, HttpException {
        e80.a.j(httpRequest, "HTTP request");
        e80.a.j(iVar, "Client connection");
        e80.a.j(httpContext, "HTTP context");
        try {
            HttpResponse d11 = d(httpRequest, iVar, httpContext);
            return d11 == null ? c(httpRequest, iVar, httpContext) : d11;
        } catch (IOException e11) {
            b(iVar);
            throw e11;
        } catch (RuntimeException e12) {
            b(iVar);
            throw e12;
        } catch (HttpException e13) {
            b(iVar);
            throw e13;
        }
    }

    public void f(HttpResponse httpResponse, j jVar, HttpContext httpContext) throws HttpException, IOException {
        e80.a.j(httpResponse, "HTTP response");
        e80.a.j(jVar, "HTTP processor");
        e80.a.j(httpContext, "HTTP context");
        httpContext.b("http.response", httpResponse);
        jVar.g(httpResponse, httpContext);
    }

    public void g(HttpRequest httpRequest, j jVar, HttpContext httpContext) throws HttpException, IOException {
        e80.a.j(httpRequest, "HTTP request");
        e80.a.j(jVar, "HTTP processor");
        e80.a.j(httpContext, "HTTP context");
        httpContext.b("http.request", httpRequest);
        jVar.process(httpRequest, httpContext);
    }

    public l() {
        this(3000);
    }
}
