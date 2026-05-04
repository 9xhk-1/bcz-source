package t70;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import org.apache.http.HttpEntity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final HttpEntity f89950a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f89951b;

    /* renamed from: c, reason: collision with root package name */
    public ReadableByteChannel f89952c;

    public h(HttpEntity httpEntity) {
        e80.a.j(httpEntity, "HTTP entity");
        this.f89950a = httpEntity;
        this.f89951b = ByteBuffer.allocate(4096);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ReadableByteChannel readableByteChannel = this.f89952c;
        this.f89952c = null;
        if (readableByteChannel != null) {
            readableByteChannel.close();
        }
        if (this.f89950a.q()) {
            this.f89950a.w().close();
        }
    }

    @Override // t70.i
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        if (this.f89952c == null) {
            this.f89952c = Channels.newChannel(this.f89950a.w());
        }
        int read = this.f89952c.read(this.f89951b);
        this.f89951b.flip();
        cVar.write(this.f89951b);
        boolean hasRemaining = this.f89951b.hasRemaining();
        this.f89951b.compact();
        if (read != -1 || hasRemaining) {
            return;
        }
        cVar.complete();
        close();
    }

    @Override // t70.i
    public boolean n() {
        return this.f89950a.n();
    }

    public String toString() {
        return this.f89950a.toString();
    }
}
