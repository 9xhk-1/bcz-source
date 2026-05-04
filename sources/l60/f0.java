package l60;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f0 extends r {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final FileChannel f70407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(boolean z11, @m80.k FileChannel fileChannel) {
        super(z11);
        kotlin.jvm.internal.g0.p(fileChannel, "fileChannel");
        this.f70407e = fileChannel;
    }

    @Override // l60.r
    public synchronized void C() {
        this.f70407e.close();
    }

    @Override // l60.r
    public synchronized void E() {
        this.f70407e.force(true);
    }

    @Override // l60.r
    public synchronized int H(long j11, @m80.k byte[] array, int i11, int i12) {
        kotlin.jvm.internal.g0.p(array, "array");
        this.f70407e.position(j11);
        ByteBuffer wrap = ByteBuffer.wrap(array, i11, i12);
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            int read = this.f70407e.read(wrap);
            if (read != -1) {
                i13 += read;
            } else if (i13 == 0) {
                return -1;
            }
        }
        return i13;
    }

    @Override // l60.r
    public synchronized void I(long j11) {
        try {
            try {
                long size = size();
                long j12 = j11 - size;
                if (j12 > 0) {
                    int i11 = (int) j12;
                    S(size, new byte[i11], 0, i11);
                } else {
                    this.f70407e.truncate(j11);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // l60.r
    public synchronized long L() {
        return this.f70407e.size();
    }

    @Override // l60.r
    public synchronized void S(long j11, @m80.k byte[] array, int i11, int i12) {
        kotlin.jvm.internal.g0.p(array, "array");
        this.f70407e.position(j11);
        this.f70407e.write(ByteBuffer.wrap(array, i11, i12));
    }
}
