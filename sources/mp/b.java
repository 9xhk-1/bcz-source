package mp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f73626a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f73627b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f73626a = aVar;
        int length = iArr.length;
        int i11 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f73627b = iArr;
            return;
        }
        while (i11 < length && iArr[i11] == 0) {
            i11++;
        }
        if (i11 == length) {
            this.f73627b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i11];
        this.f73627b = iArr2;
        System.arraycopy(iArr, i11, iArr2, 0, iArr2.length);
    }

    public b a(b bVar) {
        if (!this.f73626a.equals(bVar.f73626a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g()) {
            return bVar;
        }
        if (bVar.g()) {
            return this;
        }
        int[] iArr = this.f73627b;
        int[] iArr2 = bVar.f73627b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i11 = length; i11 < iArr.length; i11++) {
            iArr3[i11] = a.a(iArr2[i11 - length], iArr[i11]);
        }
        return new b(this.f73626a, iArr3);
    }

    public b[] b(b bVar) {
        if (!this.f73626a.equals(bVar.f73626a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.g()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b g11 = this.f73626a.g();
        int h11 = this.f73626a.h(bVar.d(bVar.f()));
        b bVar2 = this;
        while (bVar2.f() >= bVar.f() && !bVar2.g()) {
            int f11 = bVar2.f() - bVar.f();
            int j11 = this.f73626a.j(bVar2.d(bVar2.f()), h11);
            b j12 = bVar.j(f11, j11);
            g11 = g11.a(this.f73626a.b(f11, j11));
            bVar2 = bVar2.a(j12);
        }
        return new b[]{g11, bVar2};
    }

    public int c(int i11) {
        if (i11 == 0) {
            return d(0);
        }
        if (i11 == 1) {
            int i12 = 0;
            for (int i13 : this.f73627b) {
                i12 = a.a(i12, i13);
            }
            return i12;
        }
        int[] iArr = this.f73627b;
        int i14 = iArr[0];
        int length = iArr.length;
        for (int i15 = 1; i15 < length; i15++) {
            i14 = a.a(this.f73626a.j(i11, i14), this.f73627b[i15]);
        }
        return i14;
    }

    public int d(int i11) {
        return this.f73627b[(r0.length - 1) - i11];
    }

    public int[] e() {
        return this.f73627b;
    }

    public int f() {
        return this.f73627b.length - 1;
    }

    public boolean g() {
        return this.f73627b[0] == 0;
    }

    public b h(int i11) {
        if (i11 == 0) {
            return this.f73626a.g();
        }
        if (i11 == 1) {
            return this;
        }
        int length = this.f73627b.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f73626a.j(this.f73627b[i12], i11);
        }
        return new b(this.f73626a, iArr);
    }

    public b i(b bVar) {
        if (!this.f73626a.equals(bVar.f73626a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g() || bVar.g()) {
            return this.f73626a.g();
        }
        int[] iArr = this.f73627b;
        int length = iArr.length;
        int[] iArr2 = bVar.f73627b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            for (int i13 = 0; i13 < length2; i13++) {
                int i14 = i11 + i13;
                iArr3[i14] = a.a(iArr3[i14], this.f73626a.j(i12, iArr2[i13]));
            }
        }
        return new b(this.f73626a, iArr3);
    }

    public b j(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        if (i12 == 0) {
            return this.f73626a.g();
        }
        int length = this.f73627b.length;
        int[] iArr = new int[i11 + length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = this.f73626a.j(this.f73627b[i13], i12);
        }
        return new b(this.f73626a, iArr);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(f() * 8);
        for (int f11 = f(); f11 >= 0; f11--) {
            int d11 = d(f11);
            if (d11 != 0) {
                if (d11 < 0) {
                    sb2.append(" - ");
                    d11 = -d11;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (f11 == 0 || d11 != 1) {
                    int i11 = this.f73626a.i(d11);
                    if (i11 == 0) {
                        sb2.append('1');
                    } else if (i11 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i11);
                    }
                }
                if (f11 != 0) {
                    if (f11 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(f11);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
