package w70;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import org.apache.http.ContentTooLongException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j extends b<HttpResponse> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f95593f = 262144;

    /* renamed from: d, reason: collision with root package name */
    public volatile HttpResponse f95594d;

    /* renamed from: e, reason: collision with root package name */
    public volatile z70.j f95595e;

    @Override // w70.b
    public void f(m70.a aVar, m70.g gVar) throws IOException {
        e80.b.f(this.f95595e, "Content buffer");
        this.f95595e.h(aVar);
    }

    @Override // w70.b
    public void i(HttpEntity httpEntity, ContentType contentType) throws IOException {
        long c02 = httpEntity.c0();
        if (c02 > SieveCacheKt.NodeLinkMask) {
            throw new ContentTooLongException("Entity content is too long: %,d", Long.valueOf(c02));
        }
        if (c02 < 0) {
            c02 = 4096;
        }
        this.f95595e = new z70.j(Math.min((int) c02, 262144), new z70.g());
        this.f95594d.setEntity(new t70.d(httpEntity, this.f95595e));
    }

    @Override // w70.b
    public void j(HttpResponse httpResponse) throws IOException {
        this.f95594d = httpResponse;
    }

    @Override // w70.b
    public void k() {
        this.f95594d = null;
        this.f95595e = null;
    }

    @Override // w70.b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public HttpResponse a(HttpContext httpContext) {
        return this.f95594d;
    }
}
