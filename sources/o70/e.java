package o70;

import androidx.collection.SieveCacheKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HttpContext;
import w60.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class e<T> extends w70.b<T> {

    /* renamed from: d, reason: collision with root package name */
    public final File f76350d;

    /* renamed from: e, reason: collision with root package name */
    public final RandomAccessFile f76351e;

    /* renamed from: f, reason: collision with root package name */
    public HttpResponse f76352f;

    /* renamed from: g, reason: collision with root package name */
    public ContentType f76353g;

    /* renamed from: h, reason: collision with root package name */
    public org.apache.http.e f76354h;

    /* renamed from: i, reason: collision with root package name */
    public FileChannel f76355i;

    /* renamed from: j, reason: collision with root package name */
    public long f76356j = -1;

    public e(File file) throws FileNotFoundException {
        if (file == null) {
            throw new IllegalArgumentException("File may nor be null");
        }
        this.f76350d = file;
        this.f76351e = new RandomAccessFile(file, "rw");
    }

    @Override // w70.b
    public T a(HttpContext httpContext) throws Exception {
        h hVar = new h(this.f76350d, this.f76353g);
        hVar.f(this.f76354h);
        this.f76352f.setEntity(hVar);
        return q(this.f76352f, this.f76350d, this.f76353g);
    }

    @Override // w70.b
    public void f(m70.a aVar, m70.g gVar) throws IOException {
        e80.b.f(this.f76355i, "File channel");
        long a11 = aVar instanceof m70.e ? ((m70.e) aVar).a(this.f76355i, this.f76356j, SieveCacheKt.NodeLinkMask) : this.f76355i.transferFrom(new m70.b(aVar), this.f76356j, SieveCacheKt.NodeLinkMask);
        if (a11 > 0) {
            this.f76356j += a11;
        }
        if (aVar.e()) {
            this.f76355i.close();
        }
    }

    @Override // w70.b
    public void i(HttpEntity httpEntity, ContentType contentType) throws IOException {
        this.f76353g = contentType;
        this.f76354h = httpEntity.Z();
        this.f76355i = this.f76351e.getChannel();
        this.f76356j = 0L;
    }

    @Override // w70.b
    public void j(HttpResponse httpResponse) {
        this.f76352f = httpResponse;
    }

    @Override // w70.b
    public void k() {
        try {
            this.f76351e.close();
        } catch (IOException unused) {
        }
    }

    public abstract T q(HttpResponse httpResponse, File file, ContentType contentType) throws Exception;
}
