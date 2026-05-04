package l60;

import java.io.RandomAccessFile;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e0 extends r {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final RandomAccessFile f70398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(boolean z11, @m80.k RandomAccessFile randomAccessFile) {
        super(z11);
        kotlin.jvm.internal.g0.p(randomAccessFile, "randomAccessFile");
        this.f70398e = randomAccessFile;
    }

    @Override // l60.r
    public synchronized void C() {
        this.f70398e.close();
    }

    @Override // l60.r
    public synchronized void E() {
        this.f70398e.getFD().sync();
    }

    @Override // l60.r
    public synchronized int H(long j11, @m80.k byte[] array, int i11, int i12) {
        kotlin.jvm.internal.g0.p(array, "array");
        this.f70398e.seek(j11);
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            int read = this.f70398e.read(array, i11, i12 - i13);
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
                    this.f70398e.setLength(j11);
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
        return this.f70398e.length();
    }

    @Override // l60.r
    public synchronized void S(long j11, @m80.k byte[] array, int i11, int i12) {
        kotlin.jvm.internal.g0.p(array, "array");
        this.f70398e.seek(j11);
        this.f70398e.write(array, i11, i12);
    }
}
