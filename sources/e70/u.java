package e70;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import org.apache.http.ConnectionClosedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class u extends a implements m70.e {

    /* renamed from: e, reason: collision with root package name */
    public final long f49564e;

    /* renamed from: f, reason: collision with root package name */
    public long f49565f;

    public u(ReadableByteChannel readableByteChannel, x70.j jVar, a70.v vVar, long j11) {
        super(readableByteChannel, jVar, vVar);
        e80.a.i(j11, "Content length");
        this.f49564e = j11;
    }

    @Override // m70.e
    public long a(FileChannel fileChannel, long j11, long j12) throws IOException {
        long j13;
        if (fileChannel == null) {
            return 0L;
        }
        if (e()) {
            return -1L;
        }
        int min = (int) Math.min(this.f49564e - this.f49565f, SieveCacheKt.NodeLinkMask);
        if (this.f49513b.a()) {
            int min2 = Math.min(min, this.f49513b.length());
            fileChannel.position(j11);
            x70.j jVar = this.f49513b;
            if (j12 < min2) {
                min2 = (int) j12;
            }
            j13 = jVar.g(fileChannel, min2);
        } else {
            if (!this.f49512a.isOpen()) {
                j13 = -1;
            } else {
                if (j11 > fileChannel.size()) {
                    throw new IOException(String.format("Position past end of file [%,d > %,d]", Long.valueOf(j11), Long.valueOf(fileChannel.size())));
                }
                long j14 = min;
                j13 = fileChannel.transferFrom(this.f49512a, j11, j12 < j14 ? j12 : j14);
            }
            if (j13 > 0) {
                this.f49514c.b(j13);
            }
        }
        if (j13 == -1) {
            f();
            if (this.f49565f < this.f49564e) {
                throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", Long.valueOf(this.f49564e), Long.valueOf(this.f49565f));
            }
        }
        long j15 = this.f49565f + j13;
        this.f49565f = j15;
        if (j15 >= this.f49564e) {
            f();
        }
        return j13;
    }

    @Override // m70.a
    public int read(ByteBuffer byteBuffer) throws IOException {
        int d11;
        e80.a.j(byteBuffer, "Byte buffer");
        if (e()) {
            return -1;
        }
        int min = (int) Math.min(this.f49564e - this.f49565f, SieveCacheKt.NodeLinkMask);
        if (this.f49513b.a()) {
            d11 = this.f49513b.e(byteBuffer, Math.min(min, this.f49513b.length()));
        } else {
            d11 = d(byteBuffer, min);
        }
        if (d11 == -1) {
            f();
            if (this.f49565f < this.f49564e) {
                throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", Long.valueOf(this.f49564e), Long.valueOf(this.f49565f));
            }
        }
        long j11 = this.f49565f + d11;
        this.f49565f = j11;
        if (j11 >= this.f49564e) {
            f();
        }
        if (e() && d11 == 0) {
            return -1;
        }
        return d11;
    }

    public String toString() {
        return "[content length: " + this.f49564e + "; pos: " + this.f49565f + "; completed: " + this.f49515d + "]";
    }
}
