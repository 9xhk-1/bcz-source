package e70;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class s extends a implements m70.e {
    public s(ReadableByteChannel readableByteChannel, x70.j jVar, a70.v vVar) {
        super(readableByteChannel, jVar, vVar);
    }

    @Override // m70.e
    public long a(FileChannel fileChannel, long j11, long j12) throws IOException {
        long j13;
        if (fileChannel == null || e()) {
            return 0L;
        }
        if (this.f49513b.a()) {
            int length = this.f49513b.length();
            fileChannel.position(j11);
            x70.j jVar = this.f49513b;
            if (j12 < length) {
                length = (int) j12;
            }
            j13 = jVar.g(fileChannel, length);
        } else {
            if (!this.f49512a.isOpen()) {
                j13 = -1;
            } else {
                if (j11 > fileChannel.size()) {
                    throw new IOException(String.format("Position past end of file [%,d > %,d]", Long.valueOf(j11), Long.valueOf(fileChannel.size())));
                }
                j13 = fileChannel.transferFrom(this.f49512a, j11, j12);
                if (j12 > 0 && j13 == 0) {
                    j13 = this.f49513b.o(this.f49512a);
                }
            }
            if (j13 > 0) {
                this.f49514c.b(j13);
            }
        }
        if (j13 == -1) {
            f();
        }
        return j13;
    }

    @Override // m70.a
    public int read(ByteBuffer byteBuffer) throws IOException {
        e80.a.j(byteBuffer, "Byte buffer");
        if (e()) {
            return -1;
        }
        int read = this.f49513b.a() ? this.f49513b.read(byteBuffer) : c(byteBuffer);
        if (read == -1) {
            f();
        }
        return read;
    }

    public String toString() {
        return "[identity; completed: " + this.f49515d + "]";
    }
}
