package a70;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class x extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final k70.i f2272a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2273b = false;

    public x(k70.i iVar) {
        this.f2272a = (k70.i) e80.a.j(iVar, "Session output buffer");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f2273b) {
            return;
        }
        this.f2273b = true;
        this.f2272a.flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f2272a.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        if (this.f2273b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f2272a.write(bArr, i11, i12);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        if (!this.f2273b) {
            this.f2272a.write(i11);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
