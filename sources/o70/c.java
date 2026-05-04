package o70;

import androidx.collection.SieveCacheKt;
import en.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.channels.FileChannel;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.l;
import org.apache.http.protocol.HttpContext;
import w70.z;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class c implements z {

    /* renamed from: a, reason: collision with root package name */
    public final URI f76344a;

    /* renamed from: b, reason: collision with root package name */
    public final File f76345b;

    /* renamed from: c, reason: collision with root package name */
    public final RandomAccessFile f76346c;

    /* renamed from: d, reason: collision with root package name */
    public final ContentType f76347d;

    /* renamed from: e, reason: collision with root package name */
    public FileChannel f76348e;

    /* renamed from: f, reason: collision with root package name */
    public long f76349f = -1;

    public c(URI uri, File file, ContentType contentType) throws FileNotFoundException {
        e80.a.j(uri, "Request URI");
        e80.a.j(file, "Source file");
        this.f76344a = uri;
        this.f76345b = file;
        this.f76346c = new RandomAccessFile(file, r.f50027a);
        this.f76347d = contentType;
    }

    @Override // w70.z
    public HttpRequest G() throws IOException, HttpException {
        w60.b bVar = new w60.b();
        bVar.c(false);
        bVar.h0(this.f76345b.length());
        ContentType contentType = this.f76347d;
        if (contentType != null) {
            bVar.i(contentType.toString());
        }
        return c(this.f76344a, bVar);
    }

    public final void a() throws IOException {
        FileChannel fileChannel = this.f76348e;
        if (fileChannel != null) {
            fileChannel.close();
            this.f76348e = null;
        }
    }

    public abstract l c(URI uri, HttpEntity httpEntity);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            this.f76346c.close();
        } catch (IOException unused) {
        }
    }

    @Override // w70.z
    public synchronized void d(m70.c cVar, m70.g gVar) throws IOException {
        try {
            if (this.f76348e == null) {
                this.f76348e = this.f76346c.getChannel();
                this.f76349f = 0L;
            }
            long a11 = cVar instanceof m70.f ? ((m70.f) cVar).a(this.f76348e, this.f76349f, SieveCacheKt.NodeLinkMask) : this.f76348e.transferTo(this.f76349f, SieveCacheKt.NodeLinkMask, new m70.d(cVar));
            if (a11 > 0) {
                this.f76349f += a11;
            }
            if (this.f76349f >= this.f76348e.size()) {
                cVar.complete();
                a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // w70.z
    public synchronized void g0() throws IOException {
        a();
    }

    @Override // w70.z
    public synchronized HttpHost getTarget() {
        return URIUtils.extractHost(this.f76344a);
    }

    @Override // w70.z
    public boolean n() {
        return true;
    }

    @Override // w70.z, w70.b0
    public void b(Exception exc) {
    }

    @Override // w70.z
    public void s(HttpContext httpContext) {
    }
}
