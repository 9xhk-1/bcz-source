package cq;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f46822a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f46823b;

    public c(b bVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f46822a = bVar;
        int length = iArr.length;
        int i11 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f46823b = iArr;
            return;
        }
        while (i11 < length && iArr[i11] == 0) {
            i11++;
        }
        if (i11 == length) {
            this.f46823b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i11];
        this.f46823b = iArr2;
        System.arraycopy(iArr, i11, iArr2, 0, iArr2.length);
    }

    public c a(c cVar) {
        if (!this.f46822a.equals(cVar.f46822a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (f()) {
            return cVar;
        }
        if (cVar.f()) {
            return this;
        }
        int[] iArr = this.f46823b;
        int[] iArr2 = cVar.f46823b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i11 = length; i11 < iArr.length; i11++) {
            iArr3[i11] = this.f46822a.a(iArr2[i11 - length], iArr[i11]);
        }
        return new c(this.f46822a, iArr3);
    }

    public int b(int i11) {
        if (i11 == 0) {
            return c(0);
        }
        if (i11 == 1) {
            int i12 = 0;
            for (int i13 : this.f46823b) {
                i12 = this.f46822a.a(i12, i13);
            }
            return i12;
        }
        int[] iArr = this.f46823b;
        int i14 = iArr[0];
        int length = iArr.length;
        for (int i15 = 1; i15 < length; i15++) {
            b bVar = this.f46822a;
            i14 = bVar.a(bVar.i(i11, i14), this.f46823b[i15]);
        }
        return i14;
    }

    public int c(int i11) {
        return this.f46823b[(r0.length - 1) - i11];
    }

    public int[] d() {
        return this.f46823b;
    }

    public int e() {
        return this.f46823b.length - 1;
    }

    public boolean f() {
        return this.f46823b[0] == 0;
    }

    public c g(int i11) {
        if (i11 == 0) {
            return this.f46822a.f();
        }
        if (i11 == 1) {
            return this;
        }
        int length = this.f46823b.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f46822a.i(this.f46823b[i12], i11);
        }
        return new c(this.f46822a, iArr);
    }

    public c h(c cVar) {
        if (!this.f46822a.equals(cVar.f46822a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (f() || cVar.f()) {
            return this.f46822a.f();
        }
        int[] iArr = this.f46823b;
        int length = iArr.length;
        int[] iArr2 = cVar.f46823b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            for (int i13 = 0; i13 < length2; i13++) {
                int i14 = i11 + i13;
                b bVar = this.f46822a;
                iArr3[i14] = bVar.a(iArr3[i14], bVar.i(i12, iArr2[i13]));
            }
        }
        return new c(this.f46822a, iArr3);
    }

    public c i(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        if (i12 == 0) {
            return this.f46822a.f();
        }
        int length = this.f46823b.length;
        int[] iArr = new int[i11 + length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = this.f46822a.i(this.f46823b[i13], i12);
        }
        return new c(this.f46822a, iArr);
    }

    public c j() {
        int length = this.f46823b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f46822a.j(0, this.f46823b[i11]);
        }
        return new c(this.f46822a, iArr);
    }

    public c k(c cVar) {
        if (this.f46822a.equals(cVar.f46822a)) {
            return cVar.f() ? this : a(cVar.j());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(e() * 8);
        for (int e11 = e(); e11 >= 0; e11--) {
            int c11 = c(e11);
            if (c11 != 0) {
                if (c11 < 0) {
                    sb2.append(" - ");
                    c11 = -c11;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (e11 == 0 || c11 != 1) {
                    sb2.append(c11);
                }
                if (e11 != 0) {
                    if (e11 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(e11);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
