package w70;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a<T> implements s<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f95467a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public volatile T f95468b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Exception f95469c;

    public abstract T a(HttpContext httpContext) throws Exception;

    @Override // w70.s
    public final void b(Exception exc) {
        if (this.f95467a.compareAndSet(false, true)) {
            this.f95469c = exc;
            j();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f95467a.compareAndSet(false, true)) {
            j();
            c();
        }
    }

    @Override // w70.s
    public final void d6(HttpRequest httpRequest) throws HttpException, IOException {
        HttpEntity entity;
        i(httpRequest);
        if (!(httpRequest instanceof org.apache.http.l) || (entity = ((org.apache.http.l) httpRequest).getEntity()) == null) {
            return;
        }
        f(entity, ContentType.getOrDefault(entity));
    }

    public abstract void e(m70.a aVar, m70.g gVar) throws IOException;

    public abstract void f(HttpEntity httpEntity, ContentType contentType) throws IOException;

    @Override // w70.s
    public T getResult() {
        return this.f95468b;
    }

    @Override // w70.s
    public final void h(m70.a aVar, m70.g gVar) throws IOException {
        e(aVar, gVar);
    }

    public abstract void i(HttpRequest httpRequest) throws HttpException, IOException;

    @Override // w70.s
    public boolean isDone() {
        return this.f95467a.get();
    }

    public abstract void j();

    @Override // w70.s
    public Exception m() {
        return this.f95469c;
    }

    @Override // w70.s
    public final void s(HttpContext httpContext) {
        try {
            if (this.f95467a.compareAndSet(false, true)) {
                this.f95468b = a(httpContext);
            }
        } catch (Exception e11) {
            this.f95469c = e11;
        } finally {
            j();
        }
    }

    public void c() throws IOException {
    }
}
