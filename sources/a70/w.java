package a70;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class w extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final k70.h f2270a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2271b = false;

    public w(k70.h hVar) {
        this.f2270a = (k70.h) e80.a.j(hVar, "Session input buffer");
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        k70.h hVar = this.f2270a;
        if (hVar instanceof k70.a) {
            return ((k70.a) hVar).length();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2271b = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f2271b) {
            return -1;
        }
        return this.f2270a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (this.f2271b) {
            return -1;
        }
        return this.f2270a.read(bArr, i11, i12);
    }
}
