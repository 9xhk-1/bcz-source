package o60;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f76315a;

    /* renamed from: b, reason: collision with root package name */
    public final g f76316b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f76317c;

    public i(OutputStream outputStream, g gVar, boolean z11) {
        super(outputStream);
        this.f76317c = new byte[1];
        this.f76316b = gVar;
        this.f76315a = z11;
    }

    public final void a(boolean z11) throws IOException {
        byte[] bArr;
        int r11;
        int c11 = this.f76316b.c();
        if (c11 > 0 && (r11 = this.f76316b.r((bArr = new byte[c11]), 0, c11)) > 0) {
            ((FilterOutputStream) this).out.write(bArr, 0, r11);
        }
        if (z11) {
            ((FilterOutputStream) this).out.flush();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f76315a) {
            this.f76316b.g(this.f76317c, 0, -1);
        } else {
            this.f76316b.e(this.f76317c, 0, -1);
        }
        flush();
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a(true);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        byte[] bArr = this.f76317c;
        bArr[0] = (byte) i11;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        bArr.getClass();
        if (i11 >= 0 && i12 >= 0) {
            if (i11 > bArr.length || i11 + i12 > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            if (i12 > 0) {
                if (this.f76315a) {
                    this.f76316b.g(bArr, i11, i12);
                } else {
                    this.f76316b.e(bArr, i11, i12);
                }
                a(false);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
