package e70;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a implements m70.a {

    /* renamed from: a, reason: collision with root package name */
    public final ReadableByteChannel f49512a;

    /* renamed from: b, reason: collision with root package name */
    public final x70.j f49513b;

    /* renamed from: c, reason: collision with root package name */
    public final a70.v f49514c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f49515d;

    public a(ReadableByteChannel readableByteChannel, x70.j jVar, a70.v vVar) {
        e80.a.j(readableByteChannel, "Channel");
        e80.a.j(jVar, "Session input buffer");
        e80.a.j(vVar, "Transport metrics");
        this.f49513b = jVar;
        this.f49512a = readableByteChannel;
        this.f49514c = vVar;
    }

    public int b() throws IOException {
        int o11 = this.f49513b.o(this.f49512a);
        if (o11 > 0) {
            this.f49514c.b(o11);
        }
        return o11;
    }

    public int c(ByteBuffer byteBuffer) throws IOException {
        int read = this.f49512a.read(byteBuffer);
        if (read > 0) {
            this.f49514c.b(read);
        }
        return read;
    }

    public int d(ByteBuffer byteBuffer, int i11) throws IOException {
        int read;
        if (byteBuffer.remaining() > i11) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(limit - (byteBuffer.remaining() - i11));
            read = this.f49512a.read(byteBuffer);
            byteBuffer.limit(limit);
        } else {
            read = this.f49512a.read(byteBuffer);
        }
        if (read > 0) {
            this.f49514c.b(read);
        }
        return read;
    }

    @Override // m70.a
    public boolean e() {
        return this.f49515d;
    }

    public void f() {
        this.f49515d = true;
    }

    public void g(boolean z11) {
        this.f49515d = z11;
    }
}
