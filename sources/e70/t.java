package e70;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class t extends b implements m70.f {

    /* renamed from: e, reason: collision with root package name */
    public final int f49563e;

    public t(WritableByteChannel writableByteChannel, x70.k kVar, a70.v vVar, int i11) {
        super(writableByteChannel, kVar, vVar);
        this.f49563e = i11 <= 0 ? 0 : i11;
    }

    @Override // m70.f
    public long a(FileChannel fileChannel, long j11, long j12) throws IOException {
        if (fileChannel == null) {
            return 0L;
        }
        b();
        f();
        if (this.f49517b.a()) {
            return 0L;
        }
        long transferTo = fileChannel.transferTo(j11, j12, this.f49516a);
        if (transferTo > 0) {
            this.f49518c.b(transferTo);
        }
        return transferTo;
    }

    public String toString() {
        return "[identity; completed: " + e() + "]";
    }

    @Override // m70.c
    public int write(ByteBuffer byteBuffer) throws IOException {
        int length;
        int i11 = 0;
        if (byteBuffer == null) {
            return 0;
        }
        b();
        while (byteBuffer.hasRemaining()) {
            if (this.f49517b.a() || this.f49563e > 0) {
                int remaining = byteBuffer.remaining();
                int i12 = this.f49563e;
                if (remaining <= i12 && (length = i12 - this.f49517b.length()) > 0) {
                    i11 += g(byteBuffer, Math.min(length, byteBuffer.remaining()));
                }
            }
            if (this.f49517b.a() && ((this.f49517b.length() >= this.f49563e || byteBuffer.hasRemaining()) && f() == 0)) {
                return i11;
            }
            if (!this.f49517b.a() && byteBuffer.remaining() > this.f49563e) {
                int h11 = h(byteBuffer);
                i11 += h11;
                if (h11 == 0) {
                    break;
                }
            }
        }
        return i11;
    }

    public t(WritableByteChannel writableByteChannel, x70.k kVar, a70.v vVar) {
        this(writableByteChannel, kVar, vVar, 0);
    }
}
