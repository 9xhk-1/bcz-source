package h80;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f59042a;

    /* renamed from: b, reason: collision with root package name */
    public int f59043b;

    public e(OutputStream outputStream) {
        super(outputStream);
        this.f59042a = new byte[8192];
    }

    public final void a() throws IOException {
        int i11 = this.f59043b;
        if (i11 > 0) {
            ((FilterOutputStream) this).out.write(this.f59042a, 0, i11);
            this.f59043b = 0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        if (this.f59043b >= this.f59042a.length) {
            a();
        }
        byte[] bArr = this.f59042a;
        int i12 = this.f59043b;
        this.f59043b = i12 + 1;
        bArr[i12] = (byte) i11;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        byte[] bArr2 = this.f59042a;
        if (i12 >= bArr2.length) {
            a();
            ((FilterOutputStream) this).out.write(bArr, i11, i12);
        } else {
            if (i12 > bArr2.length - this.f59043b) {
                a();
            }
            System.arraycopy(bArr, i11, this.f59042a, this.f59043b, i12);
            this.f59043b += i12;
        }
    }
}
