package kp;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public int[] f68537a;

    /* renamed from: b, reason: collision with root package name */
    public int f68538b;

    public a() {
        this.f68538b = 0;
        this.f68537a = new int[1];
    }

    public static int[] p(int i11) {
        return new int[(i11 + 31) / 32];
    }

    public void a(boolean z11) {
        f(this.f68538b + 1);
        if (z11) {
            int[] iArr = this.f68537a;
            int i11 = this.f68538b;
            int i12 = i11 / 32;
            iArr[i12] = (1 << (i11 & 31)) | iArr[i12];
        }
        this.f68538b++;
    }

    public void b(a aVar) {
        int i11 = aVar.f68538b;
        f(this.f68538b + i11);
        for (int i12 = 0; i12 < i11; i12++) {
            a(aVar.h(i12));
        }
    }

    public void c(int i11, int i12) {
        if (i12 < 0 || i12 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        f(this.f68538b + i12);
        while (i12 > 0) {
            boolean z11 = true;
            if (((i11 >> (i12 - 1)) & 1) != 1) {
                z11 = false;
            }
            a(z11);
            i12--;
        }
    }

    public void d() {
        int length = this.f68537a.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f68537a[i11] = 0;
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f68537a.clone(), this.f68538b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f68538b == aVar.f68538b && Arrays.equals(this.f68537a, aVar.f68537a);
    }

    public final void f(int i11) {
        if (i11 > (this.f68537a.length << 5)) {
            int[] p11 = p(i11);
            int[] iArr = this.f68537a;
            System.arraycopy(iArr, 0, p11, 0, iArr.length);
            this.f68537a = p11;
        }
    }

    public void g(int i11) {
        int[] iArr = this.f68537a;
        int i12 = i11 / 32;
        iArr[i12] = (1 << (i11 & 31)) ^ iArr[i12];
    }

    public boolean h(int i11) {
        return ((1 << (i11 & 31)) & this.f68537a[i11 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f68538b * 31) + Arrays.hashCode(this.f68537a);
    }

    public int[] i() {
        return this.f68537a;
    }

    public int j(int i11) {
        int i12 = this.f68538b;
        if (i11 >= i12) {
            return i12;
        }
        int i13 = i11 / 32;
        int i14 = (~((1 << (i11 & 31)) - 1)) & this.f68537a[i13];
        while (i14 == 0) {
            i13++;
            int[] iArr = this.f68537a;
            if (i13 == iArr.length) {
                return this.f68538b;
            }
            i14 = iArr[i13];
        }
        int numberOfTrailingZeros = (i13 << 5) + Integer.numberOfTrailingZeros(i14);
        int i15 = this.f68538b;
        return numberOfTrailingZeros > i15 ? i15 : numberOfTrailingZeros;
    }

    public int l(int i11) {
        int i12 = this.f68538b;
        if (i11 >= i12) {
            return i12;
        }
        int i13 = i11 / 32;
        int i14 = (~((1 << (i11 & 31)) - 1)) & (~this.f68537a[i13]);
        while (i14 == 0) {
            i13++;
            int[] iArr = this.f68537a;
            if (i13 == iArr.length) {
                return this.f68538b;
            }
            i14 = ~iArr[i13];
        }
        int numberOfTrailingZeros = (i13 << 5) + Integer.numberOfTrailingZeros(i14);
        int i15 = this.f68538b;
        return numberOfTrailingZeros > i15 ? i15 : numberOfTrailingZeros;
    }

    public int m() {
        return this.f68538b;
    }

    public int n() {
        return (this.f68538b + 7) / 8;
    }

    public boolean o(int i11, int i12, boolean z11) {
        if (i12 < i11 || i11 < 0 || i12 > this.f68538b) {
            throw new IllegalArgumentException();
        }
        if (i12 == i11) {
            return true;
        }
        int i13 = i12 - 1;
        int i14 = i11 / 32;
        int i15 = i13 / 32;
        int i16 = i14;
        while (i16 <= i15) {
            int i17 = (2 << (i16 >= i15 ? 31 & i13 : 31)) - (1 << (i16 > i14 ? 0 : i11 & 31));
            int i18 = this.f68537a[i16] & i17;
            if (!z11) {
                i17 = 0;
            }
            if (i18 != i17) {
                return false;
            }
            i16++;
        }
        return true;
    }

    public void q() {
        int[] iArr = new int[this.f68537a.length];
        int i11 = (this.f68538b - 1) / 32;
        int i12 = i11 + 1;
        for (int i13 = 0; i13 < i12; i13++) {
            long j11 = this.f68537a[i13];
            long j12 = ((j11 & 1431655765) << 1) | ((j11 >> 1) & 1431655765);
            long j13 = ((j12 & 858993459) << 2) | ((j12 >> 2) & 858993459);
            long j14 = ((j13 & 252645135) << 4) | ((j13 >> 4) & 252645135);
            long j15 = ((j14 & 16711935) << 8) | ((j14 >> 8) & 16711935);
            iArr[i11 - i13] = (int) (((j15 & j60.g.f63638t) << 16) | ((j15 >> 16) & j60.g.f63638t));
        }
        int i14 = this.f68538b;
        int i15 = i12 << 5;
        if (i14 != i15) {
            int i16 = i15 - i14;
            int i17 = iArr[0] >>> i16;
            for (int i18 = 1; i18 < i12; i18++) {
                int i19 = iArr[i18];
                iArr[i18 - 1] = i17 | (i19 << (32 - i16));
                i17 = i19 >>> i16;
            }
            iArr[i11] = i17;
        }
        this.f68537a = iArr;
    }

    public void s(int i11) {
        int[] iArr = this.f68537a;
        int i12 = i11 / 32;
        iArr[i12] = (1 << (i11 & 31)) | iArr[i12];
    }

    public void t(int i11, int i12) {
        this.f68537a[i11 / 32] = i12;
    }

    public String toString() {
        int i11 = this.f68538b;
        StringBuilder sb2 = new StringBuilder(i11 + (i11 / 8) + 1);
        for (int i12 = 0; i12 < this.f68538b; i12++) {
            if ((i12 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(h(i12) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public void u(int i11, int i12) {
        if (i12 < i11 || i11 < 0 || i12 > this.f68538b) {
            throw new IllegalArgumentException();
        }
        if (i12 == i11) {
            return;
        }
        int i13 = i12 - 1;
        int i14 = i11 / 32;
        int i15 = i13 / 32;
        int i16 = i14;
        while (i16 <= i15) {
            int i17 = 31;
            int i18 = i16 > i14 ? 0 : i11 & 31;
            if (i16 >= i15) {
                i17 = 31 & i13;
            }
            int i19 = (2 << i17) - (1 << i18);
            int[] iArr = this.f68537a;
            iArr[i16] = i19 | iArr[i16];
            i16++;
        }
    }

    public void v(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = 0;
            for (int i16 = 0; i16 < 8; i16++) {
                if (h(i11)) {
                    i15 |= 1 << (7 - i16);
                }
                i11++;
            }
            bArr[i12 + i14] = (byte) i15;
        }
    }

    public void w(a aVar) {
        if (this.f68538b != aVar.f68538b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i11 = 0;
        while (true) {
            int[] iArr = this.f68537a;
            if (i11 >= iArr.length) {
                return;
            }
            iArr[i11] = iArr[i11] ^ aVar.f68537a[i11];
            i11++;
        }
    }

    public a(int i11) {
        this.f68538b = i11;
        this.f68537a = p(i11);
    }

    public a(int[] iArr, int i11) {
        this.f68537a = iArr;
        this.f68538b = i11;
    }
}
