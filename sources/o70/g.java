package o70;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.l;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g extends c {
    public g(URI uri, File file, ContentType contentType) throws FileNotFoundException {
        super(uri, file, contentType);
    }

    @Override // o70.c, w70.z
    public /* bridge */ /* synthetic */ HttpRequest G() throws IOException, HttpException {
        return super.G();
    }

    @Override // o70.c, w70.z, w70.b0
    public /* bridge */ /* synthetic */ void b(Exception exc) {
        super.b(exc);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.apache.http.client.methods.HttpPut, org.apache.http.l] */
    @Override // o70.c
    public l c(URI uri, HttpEntity httpEntity) {
        ?? httpPut = new HttpPut(uri);
        httpPut.setEntity(httpEntity);
        return httpPut;
    }

    @Override // o70.c, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() throws IOException {
        super.close();
    }

    @Override // o70.c, w70.z
    public /* bridge */ /* synthetic */ void d(m70.c cVar, m70.g gVar) throws IOException {
        super.d(cVar, gVar);
    }

    @Override // o70.c, w70.z
    public /* bridge */ /* synthetic */ void g0() throws IOException {
        super.g0();
    }

    @Override // o70.c, w70.z
    public /* bridge */ /* synthetic */ HttpHost getTarget() {
        return super.getTarget();
    }

    @Override // o70.c, w70.z
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // o70.c, w70.z
    public /* bridge */ /* synthetic */ void s(HttpContext httpContext) {
        super.s(httpContext);
    }

    public g(String str, File file, ContentType contentType) throws FileNotFoundException {
        super(URI.create(str), file, contentType);
    }
}
