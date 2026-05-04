package o70;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.l;
import t70.m;
import w70.b0;
import w70.i;
import w70.j;
import w70.z;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends i {
        public b(HttpHost httpHost, l lVar, t70.i iVar) {
            super(httpHost, lVar, iVar);
        }

        public b(HttpHost httpHost, HttpRequest httpRequest) {
            super(httpHost, httpRequest);
        }
    }

    public static z a(HttpHost httpHost, HttpRequest httpRequest) {
        e80.a.j(httpHost, "HTTP host");
        e80.a.j(httpRequest, "HTTP request");
        return new b(httpHost, httpRequest);
    }

    public static z b(HttpUriRequest httpUriRequest) {
        e80.a.j(httpUriRequest, "HTTP request");
        return new b(URIUtils.extractHost(httpUriRequest.getURI()), httpUriRequest);
    }

    public static b0<HttpResponse> c() {
        return new j();
    }

    public static z d(String str) {
        return b(new HttpDelete(URI.create(str)));
    }

    public static z e(URI uri) {
        return b(new HttpDelete(uri));
    }

    public static z f(String str) {
        return b(new HttpGet(URI.create(str)));
    }

    public static z g(URI uri) {
        return b(new HttpGet(uri));
    }

    public static z h(String str) {
        return b(new HttpHead(URI.create(str)));
    }

    public static z i(URI uri) {
        return b(new HttpHead(uri));
    }

    public static z j(String str) {
        return b(new HttpOptions(URI.create(str)));
    }

    public static z k(URI uri) {
        return b(new HttpOptions(uri));
    }

    public static z l(String str, String str2, ContentType contentType) throws UnsupportedEncodingException {
        return n(URI.create(str), str2, contentType);
    }

    public static z m(String str, byte[] bArr, ContentType contentType) {
        return o(URI.create(str), bArr, contentType);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.apache.http.client.methods.HttpPost, org.apache.http.l] */
    public static z n(URI uri, String str, ContentType contentType) throws UnsupportedEncodingException {
        ?? httpPost = new HttpPost(uri);
        m mVar = new m(str, contentType);
        httpPost.setEntity(mVar);
        return new b(URIUtils.extractHost(uri), httpPost, mVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.apache.http.client.methods.HttpPost, org.apache.http.l] */
    public static z o(URI uri, byte[] bArr, ContentType contentType) {
        ?? httpPost = new HttpPost(uri);
        t70.j jVar = new t70.j(bArr, contentType);
        httpPost.setEntity(jVar);
        return new b(URIUtils.extractHost(uri), httpPost, jVar);
    }

    public static z p(String str, String str2, ContentType contentType) throws UnsupportedEncodingException {
        return r(URI.create(str), str2, contentType);
    }

    public static z q(String str, byte[] bArr, ContentType contentType) {
        return s(URI.create(str), bArr, contentType);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.apache.http.client.methods.HttpPut, org.apache.http.l] */
    public static z r(URI uri, String str, ContentType contentType) throws UnsupportedEncodingException {
        ?? httpPut = new HttpPut(uri);
        m mVar = new m(str, contentType);
        httpPut.setEntity(mVar);
        return new b(URIUtils.extractHost(uri), httpPut, mVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.apache.http.client.methods.HttpPut, org.apache.http.l] */
    public static z s(URI uri, byte[] bArr, ContentType contentType) {
        ?? httpPut = new HttpPut(uri);
        t70.j jVar = new t70.j(bArr, contentType);
        httpPut.setEntity(jVar);
        return new b(URIUtils.extractHost(uri), httpPut, jVar);
    }

    public static z t(String str) {
        return b(new HttpTrace(URI.create(str)));
    }

    public static z u(URI uri) {
        return b(new HttpTrace(uri));
    }

    public static b0<HttpResponse> v(File file) throws FileNotFoundException {
        return new a(file);
    }

    public static z w(String str, File file, ContentType contentType) throws FileNotFoundException {
        return new f(URI.create(str), file, contentType);
    }

    public static z x(URI uri, File file, ContentType contentType) throws FileNotFoundException {
        return new f(uri, file, contentType);
    }

    public static z y(String str, File file, ContentType contentType) throws FileNotFoundException {
        return new g(URI.create(str), file, contentType);
    }

    public static z z(URI uri, File file, ContentType contentType) throws FileNotFoundException {
        return new g(uri, file, contentType);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends e<HttpResponse> {
        public a(File file) {
            super(file);
        }

        @Override // o70.e
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public HttpResponse q(HttpResponse httpResponse, File file, ContentType contentType) {
            return httpResponse;
        }
    }
}
