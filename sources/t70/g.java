package t70;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final z70.d f89949a;

    public g(z70.d dVar) {
        e80.a.j(dVar, "Output buffer");
        this.f89949a = dVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f89949a.f();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        this.f89949a.write(bArr, i11, i12);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        if (bArr == null) {
            return;
        }
        this.f89949a.write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        this.f89949a.write(i11);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }
}
