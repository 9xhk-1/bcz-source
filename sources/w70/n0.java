package w70;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.apache.http.HttpRequest;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class n0 implements s<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f95610a = ByteBuffer.allocate(2048);

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f95611b;

    @Override // w70.s
    public void b(Exception exc) {
        this.f95611b = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f95611b = true;
    }

    @Override // w70.s
    public Object getResult() {
        return Boolean.valueOf(this.f95611b);
    }

    @Override // w70.s
    public void h(m70.a aVar, m70.g gVar) throws IOException {
        do {
            this.f95610a.clear();
        } while (aVar.read(this.f95610a) > 0);
    }

    @Override // w70.s
    public boolean isDone() {
        return this.f95611b;
    }

    @Override // w70.s
    public Exception m() {
        return null;
    }

    @Override // w70.s
    public void s(HttpContext httpContext) {
        this.f95611b = true;
    }

    @Override // w70.s
    public void d6(HttpRequest httpRequest) {
    }
}
