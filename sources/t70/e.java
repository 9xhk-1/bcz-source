package t70;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final z70.c f89948a;

    public e(z70.c cVar) {
        e80.a.j(cVar, "Input buffer");
        this.f89948a = cVar;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        z70.c cVar = this.f89948a;
        return cVar instanceof k70.a ? ((k70.a) cVar).length() : super.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        while (this.f89948a.read(new byte[1024], 0, 1024) >= 0) {
        }
        super.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        return this.f89948a.read(bArr, i11, i12);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (bArr == null) {
            return 0;
        }
        return this.f89948a.read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.f89948a.read();
    }
}
