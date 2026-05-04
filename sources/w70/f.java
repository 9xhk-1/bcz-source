package w70;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import org.apache.http.ContentTooLongException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f extends a<HttpRequest> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f95567f = 262144;

    /* renamed from: d, reason: collision with root package name */
    public volatile HttpRequest f95568d;

    /* renamed from: e, reason: collision with root package name */
    public volatile z70.j f95569e;

    @Override // w70.a
    public void e(m70.a aVar, m70.g gVar) throws IOException {
        e80.b.f(this.f95569e, "Content buffer");
        this.f95569e.h(aVar);
    }

    @Override // w70.a
    public void f(HttpEntity httpEntity, ContentType contentType) throws IOException {
        long c02 = httpEntity.c0();
        if (c02 > SieveCacheKt.NodeLinkMask) {
            throw new ContentTooLongException("Entity content is too long: %,d", Long.valueOf(c02));
        }
        if (c02 < 0) {
            c02 = 4096;
        }
        this.f95569e = new z70.j(Math.min((int) c02, 262144), new z70.g());
        ((org.apache.http.l) this.f95568d).setEntity(new t70.d(httpEntity, this.f95569e));
    }

    @Override // w70.a
    public void i(HttpRequest httpRequest) throws IOException {
        this.f95568d = httpRequest;
    }

    @Override // w70.a
    public void j() {
        this.f95568d = null;
        this.f95569e = null;
    }

    @Override // w70.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public HttpRequest a(HttpContext httpContext) {
        return this.f95568d;
    }
}
