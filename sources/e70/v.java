package e70;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class v extends b implements m70.f {

    /* renamed from: e, reason: collision with root package name */
    public final long f49566e;

    /* renamed from: f, reason: collision with root package name */
    public final int f49567f;

    /* renamed from: g, reason: collision with root package name */
    public long f49568g;

    public v(WritableByteChannel writableByteChannel, x70.k kVar, a70.v vVar, long j11, int i11) {
        super(writableByteChannel, kVar, vVar);
        e80.a.i(j11, "Content length");
        this.f49566e = j11;
        this.f49567f = i11 <= 0 ? 0 : i11;
        this.f49568g = j11;
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
        long transferTo = fileChannel.transferTo(j11, Math.min(this.f49568g, j12), this.f49516a);
        if (transferTo > 0) {
            this.f49518c.b(transferTo);
        }
        long j13 = this.f49568g - transferTo;
        this.f49568g = j13;
        if (j13 <= 0) {
            super.complete();
        }
        return transferTo;
    }

    public final int j(ByteBuffer byteBuffer) {
        return (int) Math.min(Math.min(this.f49568g, SieveCacheKt.NodeLinkMask), byteBuffer.remaining());
    }

    public String toString() {
        return "[content length: " + this.f49566e + "; pos: " + (this.f49566e - this.f49568g) + "; completed: " + e() + "]";
    }

    @Override // m70.c
    public int write(ByteBuffer byteBuffer) throws IOException {
        int j11;
        int i11;
        int length;
        int j12;
        int i12 = 0;
        if (byteBuffer == null) {
            return 0;
        }
        b();
        while (byteBuffer.hasRemaining() && this.f49568g > 0) {
            if ((this.f49517b.a() || this.f49567f > 0) && (j11 = j(byteBuffer)) <= (i11 = this.f49567f) && (length = i11 - this.f49517b.length()) > 0) {
                int g11 = g(byteBuffer, Math.min(length, j11));
                this.f49568g -= g11;
                i12 += g11;
            }
            if (this.f49517b.a()) {
                int j13 = j(byteBuffer);
                if ((this.f49517b.length() >= this.f49567f || j13 > 0) && f() == 0) {
                    break;
                }
            }
            if (!this.f49517b.a() && (j12 = j(byteBuffer)) > this.f49567f) {
                int i13 = i(byteBuffer, j12);
                this.f49568g -= i13;
                i12 += i13;
                if (i13 == 0) {
                    break;
                }
            }
        }
        if (this.f49568g <= 0) {
            super.complete();
        }
        return i12;
    }

    public v(WritableByteChannel writableByteChannel, x70.k kVar, a70.v vVar, long j11) {
        this(writableByteChannel, kVar, vVar, j11, 0);
    }
}
