package e70;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b implements m70.c {

    /* renamed from: a, reason: collision with root package name */
    public final WritableByteChannel f49516a;

    /* renamed from: b, reason: collision with root package name */
    public final x70.k f49517b;

    /* renamed from: c, reason: collision with root package name */
    public final a70.v f49518c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f49519d;

    public b(WritableByteChannel writableByteChannel, x70.k kVar, a70.v vVar) {
        e80.a.j(writableByteChannel, "Channel");
        e80.a.j(kVar, "Session input buffer");
        e80.a.j(vVar, "Transport metrics");
        this.f49517b = kVar;
        this.f49516a = writableByteChannel;
        this.f49518c = vVar;
    }

    public void b() {
        e80.b.a(!this.f49519d, "Encoding process already completed");
    }

    public final int c(ByteBuffer byteBuffer, int i11, boolean z11) throws IOException {
        if (byteBuffer.remaining() <= i11) {
            return d(byteBuffer, z11);
        }
        int limit = byteBuffer.limit();
        byteBuffer.limit(limit - (byteBuffer.remaining() - i11));
        int d11 = d(byteBuffer, z11);
        byteBuffer.limit(limit);
        return d11;
    }

    @Override // m70.c
    public void complete() throws IOException {
        this.f49519d = true;
    }

    public final int d(ByteBuffer byteBuffer, boolean z11) throws IOException {
        if (!z11) {
            int remaining = byteBuffer.remaining();
            this.f49517b.write(byteBuffer);
            return remaining;
        }
        int write = this.f49516a.write(byteBuffer);
        if (write > 0) {
            this.f49518c.b(write);
        }
        return write;
    }

    @Override // m70.c
    public boolean e() {
        return this.f49519d;
    }

    public int f() throws IOException {
        if (!this.f49517b.a()) {
            return 0;
        }
        int i11 = this.f49517b.i(this.f49516a);
        if (i11 > 0) {
            this.f49518c.b(i11);
        }
        return i11;
    }

    public int g(ByteBuffer byteBuffer, int i11) throws IOException {
        return c(byteBuffer, i11, false);
    }

    public int h(ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        int write = this.f49516a.write(byteBuffer);
        if (write > 0) {
            this.f49518c.b(write);
        }
        return write;
    }

    public int i(ByteBuffer byteBuffer, int i11) throws IOException {
        return c(byteBuffer, i11, true);
    }
}
