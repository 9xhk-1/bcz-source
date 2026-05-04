package ya;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final e f99724a;

    /* renamed from: b, reason: collision with root package name */
    public long f99725b;

    /* renamed from: c, reason: collision with root package name */
    public int f99726c;

    /* renamed from: d, reason: collision with root package name */
    public int f99727d = 0;

    public c(final e pack, long offset, int size) {
        this.f99724a = pack;
        this.f99725b = offset;
        this.f99726c = size;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f99726c;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i11 = this.f99727d;
        int i12 = this.f99726c;
        if (i11 >= i12 || i12 == 0) {
            return -1;
        }
        int v11 = this.f99724a.v(this.f99725b + i11);
        this.f99727d++;
        return v11;
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer, int byteOffset, int byteCount) throws IOException {
        int x11;
        if ((byteOffset | byteCount) >= 0 && byteOffset <= buffer.length && buffer.length - byteOffset >= byteCount) {
            int i11 = this.f99727d;
            int i12 = i11 + byteCount;
            int i13 = this.f99726c;
            if (i12 > i13) {
                byteCount = i13 - i11;
            }
            int i14 = byteCount;
            if (i14 <= 0 || (x11 = this.f99724a.x(this.f99725b + i11, buffer, byteOffset, i14)) < 0) {
                return -1;
            }
            this.f99727d += x11;
            return x11;
        }
        throw new IOException("ArrayIndexOutOffBound");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
