package com.alipay.android.phone.mrpc.core;

import android.net.SSLCertificateSocketFactory;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.Security;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import ku.r0;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b implements HttpClient {

    /* renamed from: a, reason: collision with root package name */
    public static long f10268a = 160;

    /* renamed from: b, reason: collision with root package name */
    public static String[] f10269b = {"text/", "application/xml", r0.f68791f};

    /* renamed from: c, reason: collision with root package name */
    public static final org.apache.http.q f10270c = new c();

    /* renamed from: d, reason: collision with root package name */
    public final HttpClient f10271d;

    /* renamed from: e, reason: collision with root package name */
    public RuntimeException f10272e = new IllegalStateException("AndroidHttpClient created and never closed");

    /* renamed from: f, reason: collision with root package name */
    public volatile C0159b f10273f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements org.apache.http.q {
        public a() {
        }

        @Override // org.apache.http.q
        public final void process(HttpRequest httpRequest, HttpContext httpContext) {
            C0159b c0159b = b.this.f10273f;
            if (c0159b != null && C0159b.a(c0159b) && (httpRequest instanceof HttpUriRequest)) {
                C0159b.a(c0159b, b.a((HttpUriRequest) httpRequest));
            }
        }

        public /* synthetic */ a(b bVar, byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.android.phone.mrpc.core.b$b, reason: collision with other inner class name */
    public static class C0159b {

        /* renamed from: a, reason: collision with root package name */
        public final String f10275a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10276b;

        public static /* synthetic */ void a(C0159b c0159b, String str) {
            Log.println(c0159b.f10276b, c0159b.f10275a, str);
        }

        public static /* synthetic */ boolean a(C0159b c0159b) {
            return Log.isLoggable(c0159b.f10275a, c0159b.f10276b);
        }
    }

    public b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f10271d = new d(this, clientConnectionManager, httpParams);
    }

    public static long b(String str) {
        return k.a(str);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.f10271d.execute(httpHost, httpRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public final ClientConnectionManager getConnectionManager() {
        return this.f10271d.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpParams getParams() {
        return this.f10271d.getParams();
    }

    public static b a(String str) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        a80.k.m(basicHttpParams, HttpVersion.HTTP_1_1);
        a80.k.k(basicHttpParams, false);
        a80.g.o(basicHttpParams, true);
        a80.g.i(basicHttpParams, 20000);
        a80.g.m(basicHttpParams, 30000);
        a80.g.n(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        a80.k.l(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", SSLCertificateSocketFactory.getHttpSocketFactory(30000, null), 443));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, 60000L);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", "-1");
        HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        return new b(threadSafeClientConnManager, basicHttpParams);
    }

    public static void b(HttpRequest httpRequest) {
        httpRequest.q("Connection", "Keep-Alive");
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.f10271d.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    public static InputStream a(HttpEntity httpEntity) {
        org.apache.http.e Z;
        String value;
        InputStream w11 = httpEntity.w();
        return (w11 == null || (Z = httpEntity.Z()) == null || (value = Z.getValue()) == null || !value.contains("gzip")) ? w11 : new GZIPInputStream(w11);
    }

    public static boolean b(HttpUriRequest httpUriRequest) {
        org.apache.http.e[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (org.apache.http.e eVar : headers) {
                if ("gzip".equalsIgnoreCase(eVar.getValue())) {
                    return true;
                }
            }
        }
        org.apache.http.e[] headers2 = httpUriRequest.getHeaders(com.alipay.sdk.m.p.e.f10902f);
        if (headers2 != null) {
            for (org.apache.http.e eVar2 : headers2) {
                for (String str : f10269b) {
                    if (eVar2.getValue().startsWith(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.f10271d.execute(httpUriRequest, responseHandler);
    }

    public static /* synthetic */ String a(HttpUriRequest httpUriRequest) {
        HttpEntity entity;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("curl ");
        for (org.apache.http.e eVar : httpUriRequest.getAllHeaders()) {
            if (!eVar.getName().equals("Authorization") && !eVar.getName().equals("Cookie")) {
                sb2.append("--header \"");
                sb2.append(eVar.toString().trim());
                sb2.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) original).getURI();
            }
        }
        sb2.append("\"");
        sb2.append(uri);
        sb2.append("\"");
        if ((httpUriRequest instanceof org.apache.http.l) && (entity = ((org.apache.http.l) httpUriRequest).getEntity()) != null && entity.n()) {
            if (entity.c0() < 1024) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (b(httpUriRequest)) {
                    sb2.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    str = " --data-binary @/tmp/$$.bin";
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    sb2.append(" --data-ascii \"");
                    sb2.append(byteArrayOutputStream2);
                    sb2.append("\"");
                }
            } else {
                str = " [TOO MUCH DATA TO INCLUDE]";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.f10271d.execute(httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.f10271d.execute(httpHost, httpRequest);
    }

    public static w60.a a(byte[] bArr) {
        if (bArr.length < f10268a) {
            return new w60.d(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        w60.d dVar = new w60.d(byteArrayOutputStream.toByteArray());
        dVar.e("gzip");
        dVar.c0();
        return dVar;
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.f10271d.execute(httpHost, httpRequest, httpContext);
    }

    public static void a(HttpRequest httpRequest) {
        httpRequest.q("Accept-Encoding", "gzip");
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.f10271d.execute(httpUriRequest);
    }

    public final void a(HttpRequestRetryHandler httpRequestRetryHandler) {
        ((DefaultHttpClient) this.f10271d).setHttpRequestRetryHandler(httpRequestRetryHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.f10271d.execute(httpUriRequest, httpContext);
    }
}
