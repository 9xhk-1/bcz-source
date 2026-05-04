package w70;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b<T> implements b0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f95489a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public volatile T f95490b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Exception f95491c;

    @Override // w70.b0
    public final void B(HttpResponse httpResponse) throws IOException, HttpException {
        j(httpResponse);
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            i(entity, c(entity));
        }
    }

    public abstract T a(HttpContext httpContext) throws Exception;

    @Override // w70.b0
    public final void b(Exception exc) {
        if (this.f95489a.compareAndSet(false, true)) {
            this.f95491c = exc;
            k();
        }
    }

    public ContentType c(HttpEntity httpEntity) {
        if (httpEntity != null) {
            return ContentType.getOrDefault(httpEntity);
        }
        return null;
    }

    @Override // org.apache.http.concurrent.Cancellable
    public final boolean cancel() {
        if (!this.f95489a.compareAndSet(false, true)) {
            return false;
        }
        k();
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f95489a.compareAndSet(false, true)) {
            k();
            e();
        }
    }

    public abstract void f(m70.a aVar, m70.g gVar) throws IOException;

    @Override // w70.b0
    public T getResult() {
        return this.f95490b;
    }

    @Override // w70.b0
    public final void h(m70.a aVar, m70.g gVar) throws IOException {
        f(aVar, gVar);
    }

    public abstract void i(HttpEntity httpEntity, ContentType contentType) throws IOException;

    @Override // w70.b0
    public boolean isDone() {
        return this.f95489a.get();
    }

    public abstract void j(HttpResponse httpResponse) throws HttpException, IOException;

    public abstract void k();

    @Override // w70.b0
    public Exception m() {
        return this.f95491c;
    }

    @Override // w70.b0
    public final void p(HttpContext httpContext) {
        try {
            if (this.f95489a.compareAndSet(false, true)) {
                this.f95490b = a(httpContext);
            }
        } catch (Exception e11) {
            this.f95491c = e11;
        } finally {
            k();
        }
    }

    public void e() throws IOException {
    }
}
