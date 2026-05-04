package f70;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import org.apache.commons.logging.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k implements x70.f {

    /* renamed from: a, reason: collision with root package name */
    public final x70.f f51172a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteChannel f51173b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f51174c;

    /* renamed from: d, reason: collision with root package name */
    public final Log f51175d;

    /* renamed from: e, reason: collision with root package name */
    public final q f51176e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ByteChannel {
        public a() {
        }

        @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (k.this.f51175d.isDebugEnabled()) {
                k.this.f51175d.debug(k.this.f51174c + " " + k.this.f51172a + ": Channel close");
            }
            k.this.f51172a.g().close();
        }

        @Override // java.nio.channels.Channel
        public boolean isOpen() {
            return k.this.f51172a.g().isOpen();
        }

        @Override // java.nio.channels.ReadableByteChannel
        public int read(ByteBuffer byteBuffer) throws IOException {
            int read = k.this.f51172a.g().read(byteBuffer);
            if (k.this.f51175d.isDebugEnabled()) {
                k.this.f51175d.debug(k.this.f51174c + " " + k.this.f51172a + ": " + read + " bytes read");
            }
            if (read > 0 && k.this.f51176e.e()) {
                ByteBuffer duplicate = byteBuffer.duplicate();
                int position = duplicate.position();
                duplicate.limit(position);
                duplicate.position(position - read);
                k.this.f51176e.b(duplicate);
            }
            return read;
        }

        @Override // java.nio.channels.WritableByteChannel
        public int write(ByteBuffer byteBuffer) throws IOException {
            int write = k.this.f51172a.g().write(byteBuffer);
            if (k.this.f51175d.isDebugEnabled()) {
                k.this.f51175d.debug(k.this.f51174c + " " + k.this.f51172a + ": " + write + " bytes written");
            }
            if (write > 0 && k.this.f51176e.e()) {
                ByteBuffer duplicate = byteBuffer.duplicate();
                int position = duplicate.position();
                duplicate.limit(position);
                duplicate.position(position - write);
                k.this.f51176e.g(duplicate);
            }
            return write;
        }
    }

    public k(x70.f fVar, String str, Log log, Log log2) {
        this.f51172a = fVar;
        this.f51174c = str;
        this.f51175d = log;
        this.f51176e = new q(log2, str);
    }

    public static String o(int i11) {
        StringBuilder sb2 = new StringBuilder(6);
        sb2.append('[');
        if ((i11 & 1) > 0) {
            sb2.append('r');
        }
        if ((i11 & 4) > 0) {
            sb2.append('w');
        }
        if ((i11 & 16) > 0) {
            sb2.append('a');
        }
        if ((i11 & 8) > 0) {
            sb2.append('c');
        }
        sb2.append(l50.b.f69930l);
        return sb2.toString();
    }

    @Override // x70.f
    public boolean a() {
        return this.f51172a.a();
    }

    @Override // x70.f
    public void b(String str, Object obj) {
        if (this.f51175d.isDebugEnabled()) {
            this.f51175d.debug(this.f51174c + " " + this.f51172a + ": Set attribute " + str);
        }
        this.f51172a.b(str, obj);
    }

    @Override // x70.f
    public boolean c() {
        return this.f51172a.c();
    }

    @Override // x70.f
    public void close() {
        if (this.f51175d.isDebugEnabled()) {
            this.f51175d.debug(this.f51174c + " " + this.f51172a + ": Close");
        }
        this.f51172a.close();
    }

    @Override // x70.f
    public int d() {
        return this.f51172a.d();
    }

    @Override // x70.f
    public void e(x70.i iVar) {
        this.f51172a.e(iVar);
    }

    @Override // x70.f
    public void f(int i11) {
        this.f51172a.f(i11);
        if (this.f51175d.isDebugEnabled()) {
            this.f51175d.debug(this.f51174c + " " + this.f51172a + ": Event cleared " + o(i11));
        }
    }

    @Override // x70.f
    public ByteChannel g() {
        return this.f51173b;
    }

    @Override // x70.f
    public Object getAttribute(String str) {
        return this.f51172a.getAttribute(str);
    }

    @Override // x70.f
    public SocketAddress getLocalAddress() {
        return this.f51172a.getLocalAddress();
    }

    @Override // x70.f
    public int getStatus() {
        return this.f51172a.getStatus();
    }

    @Override // x70.f
    public void h(int i11) {
        this.f51172a.h(i11);
        if (this.f51175d.isDebugEnabled()) {
            this.f51175d.debug(this.f51174c + " " + this.f51172a + ": Event set " + o(i11));
        }
    }

    @Override // x70.f
    public void i(int i11) {
        this.f51172a.i(i11);
        if (this.f51175d.isDebugEnabled()) {
            this.f51175d.debug(this.f51174c + " " + this.f51172a + ": Event mask set " + o(i11));
        }
    }

    @Override // x70.f
    public boolean isClosed() {
        return this.f51172a.isClosed();
    }

    @Override // x70.f
    public SocketAddress l() {
        return this.f51172a.l();
    }

    @Override // x70.f
    public Object removeAttribute(String str) {
        if (this.f51175d.isDebugEnabled()) {
            this.f51175d.debug(this.f51174c + " " + this.f51172a + ": Remove attribute " + str);
        }
        return this.f51172a.removeAttribute(str);
    }

    @Override // x70.f
    public void setSocketTimeout(int i11) {
        if (this.f51175d.isDebugEnabled()) {
            this.f51175d.debug(this.f51174c + " " + this.f51172a + ": Set timeout " + i11);
        }
        this.f51172a.setSocketTimeout(i11);
    }

    @Override // x70.f
    public void shutdown() {
        if (this.f51175d.isDebugEnabled()) {
            this.f51175d.debug(this.f51174c + " " + this.f51172a + ": Shutdown");
        }
        this.f51172a.shutdown();
    }

    public String toString() {
        return this.f51174c + " " + this.f51172a.toString();
    }

    @Override // x70.f
    public int x() {
        return this.f51172a.x();
    }
}
