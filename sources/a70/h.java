package a70;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final k70.i f2246a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2247b;

    /* renamed from: c, reason: collision with root package name */
    public long f2248c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2249d;

    public h(k70.i iVar, long j11) {
        this.f2246a = (k70.i) e80.a.j(iVar, "Session output buffer");
        this.f2247b = e80.a.i(j11, "Content length");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f2249d) {
            return;
        }
        this.f2249d = true;
        this.f2246a.flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f2246a.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        if (this.f2249d) {
            throw new IOException("Attempted write to closed stream.");
        }
        long j11 = this.f2248c;
        long j12 = this.f2247b;
        if (j11 < j12) {
            long j13 = j12 - j11;
            if (i12 > j13) {
                i12 = (int) j13;
            }
            this.f2246a.write(bArr, i11, i12);
            this.f2248c += i12;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        if (this.f2249d) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.f2248c < this.f2247b) {
            this.f2246a.write(i11);
            this.f2248c++;
        }
    }
}
