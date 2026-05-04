package a3;

import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f1527a;

    /* renamed from: b, reason: collision with root package name */
    public int f1528b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1529c;

    public g() {
        this(true, 16);
    }

    public static g G(boolean... zArr) {
        return new g(zArr);
    }

    public boolean[] A() {
        int length = this.f1527a.length;
        int i11 = this.f1528b;
        if (length != i11) {
            w(i11);
        }
        return this.f1527a;
    }

    public void B() {
        boolean[] zArr = this.f1527a;
        for (int i11 = this.f1528b - 1; i11 >= 0; i11--) {
            int M = com.badlogic.gdx.math.n.M(i11);
            boolean z11 = zArr[i11];
            zArr[i11] = zArr[M];
            zArr[M] = z11;
        }
    }

    public void C(int i11, int i12) {
        int i13 = this.f1528b;
        if (i11 >= i13) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i11 + " >= " + this.f1528b);
        }
        if (i12 < i13) {
            boolean[] zArr = this.f1527a;
            boolean z11 = zArr[i11];
            zArr[i11] = zArr[i12];
            zArr[i12] = z11;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i12 + " >= " + this.f1528b);
    }

    public boolean[] D() {
        int i11 = this.f1528b;
        boolean[] zArr = new boolean[i11];
        System.arraycopy(this.f1527a, 0, zArr, 0, i11);
        return zArr;
    }

    public String E(String str) {
        if (this.f1528b == 0) {
            return "";
        }
        boolean[] zArr = this.f1527a;
        y0 y0Var = new y0(32);
        y0Var.Q(zArr[0]);
        for (int i11 = 1; i11 < this.f1528b; i11++) {
            y0Var.O(str);
            y0Var.Q(zArr[i11]);
        }
        return y0Var.toString();
    }

    public void F(int i11) {
        if (this.f1528b > i11) {
            this.f1528b = i11;
        }
    }

    public void a(boolean z11) {
        boolean[] zArr = this.f1527a;
        int i11 = this.f1528b;
        if (i11 == zArr.length) {
            zArr = w(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1528b;
        this.f1528b = i12 + 1;
        zArr[i12] = z11;
    }

    public void b(boolean z11, boolean z12) {
        boolean[] zArr = this.f1527a;
        int i11 = this.f1528b;
        if (i11 + 1 >= zArr.length) {
            zArr = w(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1528b;
        zArr[i12] = z11;
        zArr[i12 + 1] = z12;
        this.f1528b = i12 + 2;
    }

    public void c(boolean z11, boolean z12, boolean z13) {
        boolean[] zArr = this.f1527a;
        int i11 = this.f1528b;
        if (i11 + 2 >= zArr.length) {
            zArr = w(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1528b;
        zArr[i12] = z11;
        zArr[i12 + 1] = z12;
        zArr[i12 + 2] = z13;
        this.f1528b = i12 + 3;
    }

    public void d(boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean[] zArr = this.f1527a;
        int i11 = this.f1528b;
        if (i11 + 3 >= zArr.length) {
            zArr = w(Math.max(8, (int) (i11 * 1.8f)));
        }
        int i12 = this.f1528b;
        zArr[i12] = z11;
        zArr[i12 + 1] = z12;
        zArr[i12 + 2] = z13;
        zArr[i12 + 3] = z14;
        this.f1528b = i12 + 4;
    }

    public void e(g gVar) {
        h(gVar.f1527a, 0, gVar.f1528b);
    }

    public boolean equals(Object obj) {
        int i11;
        if (obj == this) {
            return true;
        }
        if (!this.f1529c || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!gVar.f1529c || (i11 = this.f1528b) != gVar.f1528b) {
            return false;
        }
        boolean[] zArr = this.f1527a;
        boolean[] zArr2 = gVar.f1527a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (zArr[i12] != zArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    public void f(g gVar, int i11, int i12) {
        if (i11 + i12 <= gVar.f1528b) {
            h(gVar.f1527a, i11, i12);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i11 + " + " + i12 + " <= " + gVar.f1528b);
    }

    public void g(boolean... zArr) {
        h(zArr, 0, zArr.length);
    }

    public void h(boolean[] zArr, int i11, int i12) {
        boolean[] zArr2 = this.f1527a;
        int i13 = this.f1528b + i12;
        if (i13 > zArr2.length) {
            zArr2 = w(Math.max(Math.max(8, i13), (int) (this.f1528b * 1.75f)));
        }
        System.arraycopy(zArr, i11, zArr2, this.f1528b, i12);
        this.f1528b += i12;
    }

    public int hashCode() {
        if (!this.f1529c) {
            return super.hashCode();
        }
        boolean[] zArr = this.f1527a;
        int i11 = this.f1528b;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + (zArr[i13] ? 1231 : 1237);
        }
        return i12;
    }

    public void i() {
        this.f1528b = 0;
    }

    public boolean[] j(int i11) {
        if (i11 >= 0) {
            int i12 = this.f1528b + i11;
            if (i12 > this.f1527a.length) {
                w(Math.max(Math.max(8, i12), (int) (this.f1528b * 1.75f)));
            }
            return this.f1527a;
        }
        throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i11);
    }

    public boolean k() {
        if (this.f1528b != 0) {
            return this.f1527a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public boolean l(int i11) {
        if (i11 < this.f1528b) {
            return this.f1527a[i11];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1528b);
    }

    public void m(int i11, boolean z11) {
        int i12 = this.f1528b;
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1528b);
        }
        boolean[] zArr = this.f1527a;
        if (i12 == zArr.length) {
            zArr = w(Math.max(8, (int) (i12 * 1.75f)));
        }
        if (this.f1529c) {
            System.arraycopy(zArr, i11, zArr, i11 + 1, this.f1528b - i11);
        } else {
            zArr[this.f1528b] = zArr[i11];
        }
        this.f1528b++;
        zArr[i11] = z11;
    }

    public void n(int i11, int i12) {
        int i13 = this.f1528b;
        if (i11 > i13) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1528b);
        }
        int i14 = i13 + i12;
        if (i14 > this.f1527a.length) {
            this.f1527a = w(Math.max(Math.max(8, i14), (int) (this.f1528b * 1.75f)));
        }
        boolean[] zArr = this.f1527a;
        System.arraycopy(zArr, i11, zArr, i12 + i11, this.f1528b - i11);
        this.f1528b = i14;
    }

    public boolean o() {
        return this.f1528b == 0;
    }

    public boolean p() {
        return this.f1528b > 0;
    }

    public boolean q() {
        return this.f1527a[this.f1528b - 1];
    }

    public boolean r() {
        boolean[] zArr = this.f1527a;
        int i11 = this.f1528b - 1;
        this.f1528b = i11;
        return zArr[i11];
    }

    public boolean s() {
        int i11 = this.f1528b;
        if (i11 == 0) {
            return false;
        }
        return this.f1527a[com.badlogic.gdx.math.n.N(0, i11 - 1)];
    }

    public boolean t(g gVar) {
        int i11 = this.f1528b;
        boolean[] zArr = this.f1527a;
        int i12 = gVar.f1528b;
        int i13 = i11;
        for (int i14 = 0; i14 < i12; i14++) {
            boolean l11 = gVar.l(i14);
            int i15 = 0;
            while (true) {
                if (i15 >= i13) {
                    break;
                }
                if (l11 == zArr[i15]) {
                    u(i15);
                    i13--;
                    break;
                }
                i15++;
            }
        }
        return i13 != i11;
    }

    public String toString() {
        if (this.f1528b == 0) {
            return okhttp3.i.f77289p;
        }
        boolean[] zArr = this.f1527a;
        y0 y0Var = new y0(32);
        y0Var.append('[');
        y0Var.Q(zArr[0]);
        for (int i11 = 1; i11 < this.f1528b; i11++) {
            y0Var.O(j2.O);
            y0Var.Q(zArr[i11]);
        }
        y0Var.append(l50.b.f69930l);
        return y0Var.toString();
    }

    public boolean u(int i11) {
        int i12 = this.f1528b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1528b);
        }
        boolean[] zArr = this.f1527a;
        boolean z11 = zArr[i11];
        int i13 = i12 - 1;
        this.f1528b = i13;
        if (this.f1529c) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, i13 - i11);
            return z11;
        }
        zArr[i11] = zArr[i13];
        return z11;
    }

    public void v(int i11, int i12) {
        int i13 = this.f1528b;
        if (i12 >= i13) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i12 + " >= " + this.f1528b);
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i11 + " > " + i12);
        }
        int i14 = (i12 - i11) + 1;
        int i15 = i13 - i14;
        if (this.f1529c) {
            boolean[] zArr = this.f1527a;
            int i16 = i14 + i11;
            System.arraycopy(zArr, i16, zArr, i11, i13 - i16);
        } else {
            int max = Math.max(i15, i12 + 1);
            boolean[] zArr2 = this.f1527a;
            System.arraycopy(zArr2, max, zArr2, i11, i13 - max);
        }
        this.f1528b = i15;
    }

    public boolean[] w(int i11) {
        boolean[] zArr = new boolean[i11];
        System.arraycopy(this.f1527a, 0, zArr, 0, Math.min(this.f1528b, i11));
        this.f1527a = zArr;
        return zArr;
    }

    public void x() {
        boolean[] zArr = this.f1527a;
        int i11 = this.f1528b;
        int i12 = i11 - 1;
        int i13 = i11 / 2;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i12 - i14;
            boolean z11 = zArr[i14];
            zArr[i14] = zArr[i15];
            zArr[i15] = z11;
        }
    }

    public void y(int i11, boolean z11) {
        if (i11 < this.f1528b) {
            this.f1527a[i11] = z11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1528b);
    }

    public boolean[] z(int i11) {
        if (i11 >= 0) {
            if (i11 > this.f1527a.length) {
                w(Math.max(8, i11));
            }
            this.f1528b = i11;
            return this.f1527a;
        }
        throw new IllegalArgumentException("newSize must be >= 0: " + i11);
    }

    public g(int i11) {
        this(true, i11);
    }

    public g(boolean z11, int i11) {
        this.f1529c = z11;
        this.f1527a = new boolean[i11];
    }

    public g(g gVar) {
        this.f1529c = gVar.f1529c;
        int i11 = gVar.f1528b;
        this.f1528b = i11;
        boolean[] zArr = new boolean[i11];
        this.f1527a = zArr;
        System.arraycopy(gVar.f1527a, 0, zArr, 0, i11);
    }

    public g(boolean[] zArr) {
        this(true, zArr, 0, zArr.length);
    }

    public g(boolean z11, boolean[] zArr, int i11, int i12) {
        this(z11, i12);
        this.f1528b = i12;
        System.arraycopy(zArr, i11, this.f1527a, 0, i12);
    }
}
