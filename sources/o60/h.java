package o60;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f76312a;

    /* renamed from: b, reason: collision with root package name */
    public final g f76313b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f76314c;

    public h(InputStream inputStream, g gVar, boolean z11) {
        super(inputStream);
        this.f76314c = new byte[1];
        this.f76312a = z11;
        this.f76313b = gVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = read(this.f76314c, 0, 1);
        while (read == 0) {
            read = read(this.f76314c, 0, 1);
        }
        if (read <= 0) {
            return -1;
        }
        byte b11 = this.f76314c[0];
        return b11 < 0 ? b11 + 256 : b11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        bArr.getClass();
        if (i11 >= 0 && i12 >= 0) {
            if (i11 > bArr.length || i11 + i12 > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            if (i12 == 0) {
                return 0;
            }
            int i13 = 0;
            while (i13 == 0) {
                if (!this.f76313b.m()) {
                    byte[] bArr2 = new byte[this.f76312a ? 4096 : 8192];
                    int read = ((FilterInputStream) this).in.read(bArr2);
                    if (this.f76312a) {
                        this.f76313b.g(bArr2, 0, read);
                    } else {
                        this.f76313b.e(bArr2, 0, read);
                    }
                }
                i13 = this.f76313b.r(bArr, i11, i12);
            }
            return i13;
        }
        throw new IndexOutOfBoundsException();
    }
}
