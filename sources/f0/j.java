package f0;

import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final InputStream f50293a;

    /* renamed from: b, reason: collision with root package name */
    public int f50294b = 1073741824;

    public j(@m80.k InputStream inputStream) {
        this.f50293a = inputStream;
    }

    public final int a(int i11) {
        if (i11 == -1) {
            this.f50294b = 0;
        }
        return i11;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f50294b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50293a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return a(this.f50293a.read());
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        return this.f50293a.skip(j11);
    }

    @Override // java.io.InputStream
    public int read(@m80.k byte[] bArr) {
        return a(this.f50293a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(@m80.k byte[] bArr, int i11, int i12) {
        return a(this.f50293a.read(bArr, i11, i12));
    }
}
