package d3;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f47115a;

    /* renamed from: b, reason: collision with root package name */
    public int f47116b;

    /* renamed from: c, reason: collision with root package name */
    public int f47117c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f47118d;

    /* renamed from: e, reason: collision with root package name */
    public OutputStream f47119e;

    public void a(int i11, int i12) throws IOException {
        int i13 = (this.f47116b - i11) - 1;
        if (i13 < 0) {
            i13 += this.f47117c;
        }
        while (i12 != 0) {
            int i14 = this.f47117c;
            if (i13 >= i14) {
                i13 = 0;
            }
            byte[] bArr = this.f47115a;
            int i15 = this.f47116b;
            int i16 = i15 + 1;
            this.f47116b = i16;
            int i17 = i13 + 1;
            bArr[i15] = bArr[i13];
            if (i16 >= i14) {
                c();
            }
            i12--;
            i13 = i17;
        }
    }

    public void b(int i11) {
        if (this.f47115a == null || this.f47117c != i11) {
            this.f47115a = new byte[i11];
        }
        this.f47117c = i11;
        this.f47116b = 0;
        this.f47118d = 0;
    }

    public void c() throws IOException {
        int i11 = this.f47116b;
        int i12 = this.f47118d;
        int i13 = i11 - i12;
        if (i13 == 0) {
            return;
        }
        this.f47119e.write(this.f47115a, i12, i13);
        if (this.f47116b >= this.f47117c) {
            this.f47116b = 0;
        }
        this.f47118d = this.f47116b;
    }

    public byte d(int i11) {
        int i12 = (this.f47116b - i11) - 1;
        if (i12 < 0) {
            i12 += this.f47117c;
        }
        return this.f47115a[i12];
    }

    public void e(boolean z11) {
        if (z11) {
            return;
        }
        this.f47118d = 0;
        this.f47116b = 0;
    }

    public void f(byte b11) throws IOException {
        byte[] bArr = this.f47115a;
        int i11 = this.f47116b;
        int i12 = i11 + 1;
        this.f47116b = i12;
        bArr[i11] = b11;
        if (i12 >= this.f47117c) {
            c();
        }
    }

    public void g() throws IOException {
        c();
        this.f47119e = null;
    }

    public void h(OutputStream outputStream) throws IOException {
        g();
        this.f47119e = outputStream;
    }
}
