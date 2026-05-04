package f3;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public short[] f50396a;

    /* renamed from: b, reason: collision with root package name */
    public int f50397b;

    public b(int i11) {
        this.f50397b = i11;
        this.f50396a = new short[1 << i11];
    }

    public static void e(short[] sArr, int i11, d dVar, int i12, int i13) throws IOException {
        int i14 = 1;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = i13 & 1;
            dVar.a(sArr, i11 + i14, i16);
            i14 = (i14 << 1) | i16;
            i13 >>= 1;
        }
    }

    public static int g(short[] sArr, int i11, int i12, int i13) {
        int i14 = 0;
        int i15 = 1;
        while (i12 != 0) {
            int i16 = i13 & 1;
            i13 >>>= 1;
            i14 += d.e(sArr[i11 + i15], i16);
            i15 = (i15 << 1) | i16;
            i12--;
        }
        return i14;
    }

    public void a(d dVar, int i11) throws IOException {
        int i12 = this.f50397b;
        int i13 = 1;
        while (i12 != 0) {
            i12--;
            int i14 = (i11 >>> i12) & 1;
            dVar.a(this.f50396a, i13, i14);
            i13 = (i13 << 1) | i14;
        }
    }

    public int b(int i11) {
        int i12 = this.f50397b;
        int i13 = 0;
        int i14 = 1;
        while (i12 != 0) {
            i12--;
            int i15 = (i11 >>> i12) & 1;
            i13 += d.e(this.f50396a[i14], i15);
            i14 = (i14 << 1) + i15;
        }
        return i13;
    }

    public void c() {
        c.d(this.f50396a);
    }

    public void d(d dVar, int i11) throws IOException {
        int i12 = 1;
        for (int i13 = 0; i13 < this.f50397b; i13++) {
            int i14 = i11 & 1;
            dVar.a(this.f50396a, i12, i14);
            i12 = (i12 << 1) | i14;
            i11 >>= 1;
        }
    }

    public int f(int i11) {
        int i12 = 0;
        int i13 = 1;
        for (int i14 = this.f50397b; i14 != 0; i14--) {
            int i15 = i11 & 1;
            i11 >>>= 1;
            i12 += d.e(this.f50396a[i13], i15);
            i13 = (i13 << 1) | i15;
        }
        return i12;
    }
}
