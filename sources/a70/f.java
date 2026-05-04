package a70;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final k70.i f2236a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2237b;

    /* renamed from: c, reason: collision with root package name */
    public int f2238c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2239d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2240e;

    @Deprecated
    public f(k70.i iVar, int i11) throws IOException {
        this(i11, iVar);
    }

    public void a() throws IOException {
        if (this.f2239d) {
            return;
        }
        c();
        f();
        this.f2239d = true;
    }

    public void c() throws IOException {
        int i11 = this.f2238c;
        if (i11 > 0) {
            this.f2236a.b(Integer.toHexString(i11));
            this.f2236a.write(this.f2237b, 0, this.f2238c);
            this.f2236a.b("");
            this.f2238c = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f2240e) {
            return;
        }
        this.f2240e = true;
        a();
        this.f2236a.flush();
    }

    public void e(byte[] bArr, int i11, int i12) throws IOException {
        this.f2236a.b(Integer.toHexString(this.f2238c + i12));
        this.f2236a.write(this.f2237b, 0, this.f2238c);
        this.f2236a.write(bArr, i11, i12);
        this.f2236a.b("");
        this.f2238c = 0;
    }

    public void f() throws IOException {
        this.f2236a.b("0");
        this.f2236a.b("");
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        c();
        this.f2236a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        if (this.f2240e) {
            throw new IOException("Attempted write to closed stream.");
        }
        byte[] bArr = this.f2237b;
        int i12 = this.f2238c;
        bArr[i12] = (byte) i11;
        int i13 = i12 + 1;
        this.f2238c = i13;
        if (i13 == bArr.length) {
            c();
        }
    }

    @Deprecated
    public f(k70.i iVar) throws IOException {
        this(2048, iVar);
    }

    public f(int i11, k70.i iVar) {
        this.f2238c = 0;
        this.f2239d = false;
        this.f2240e = false;
        this.f2237b = new byte[i11];
        this.f2236a = iVar;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        if (!this.f2240e) {
            byte[] bArr2 = this.f2237b;
            int length = bArr2.length;
            int i13 = this.f2238c;
            if (i12 >= length - i13) {
                e(bArr, i11, i12);
                return;
            } else {
                System.arraycopy(bArr, i11, bArr2, i13, i12);
                this.f2238c += i12;
                return;
            }
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
