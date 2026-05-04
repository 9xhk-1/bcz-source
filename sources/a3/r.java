package a3;

import java.util.Arrays;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public float[] f1625a;

    /* renamed from: b, reason: collision with root package name */
    public int f1626b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1627c;

    public r() {
        this(true, 16);
    }

    public static r Q(float... fArr) {
        return new r(fArr);
    }

    public float A() {
        int i11 = this.f1626b;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.f1625a[com.badlogic.gdx.math.n.N(0, i11 - 1)];
    }

    public boolean B(r rVar) {
        int i11 = this.f1626b;
        float[] fArr = this.f1625a;
        int i12 = rVar.f1626b;
        int i13 = i11;
        for (int i14 = 0; i14 < i12; i14++) {
            float n11 = rVar.n(i14);
            int i15 = 0;
            while (true) {
                if (i15 >= i13) {
                    break;
                }
                if (n11 == fArr[i15]) {
                    C(i15);
                    i13--;
                    break;
                }
                i15++;
            }
        }
        return i13 != i11;
    }

    public float C(int i11) {
        int i12 = this.f1626b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1626b);
        }
        float[] fArr = this.f1625a;
        float f11 = fArr[i11];
        int i13 = i12 - 1;
        this.f1626b = i13;
        if (this.f1627c) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, i13 - i11);
            return f11;
        }
        fArr[i11] = fArr[i13];
        return f11;
    }

    public void D(int i11, int i12) {
        int i13 = this.f1626b;
        if (i12 >= i13) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i12 + " >= " + this.f1626b);
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i11 + " > " + i12);
        }
        int i14 = (i12 - i11) + 1;
        int i15 = i13 - i14;
        if (this.f1627c) {
            float[] fArr = this.f1625a;
            int i16 = i14 + i11;
            System.arraycopy(fArr, i16, fArr, i11, i13 - i16);
        } else {
            int max = Math.max(i15, i12 + 1);
            float[] fArr2 = this.f1625a;
            System.arraycopy(fArr2, max, fArr2, i11, i13 - max);
        }
        this.f1626b = i15;
    }

    public boolean E(float f11) {
        float[] fArr = this.f1625a;
        int i11 = this.f1626b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (fArr[i12] == f11) {
                C(i12);
                return true;
            }
        }
        return false;
    }

    public float[] F(int i11) {
        float[] fArr = new float[i11];
        System.arraycopy(this.f1625a, 0, fArr, 0, Math.min(this.f1626b, i11));
        this.f1625a = fArr;
        return fArr;
    }

    public void G() {
        float[] fArr = this.f1625a;
        int i11 = this.f1626b;
        int i12 = i11 - 1;
        int i13 = i11 / 2;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i12 - i14;
            float f11 = fArr[i14];
            fArr[i14] = fArr[i15];
            fArr[i15] = f11;
        }
    }

    public void H(int i11, float f11) {
        if (i11 < this.f1626b) {
            this.f1625a[i11] = f11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1626b);
    }

    public float[] I(int i11) {
        if (i11 >= 0) {
            if (i11 > this.f1625a.length) {
                F(Math.max(8, i11));
            }
            this.f1626b = i11;
            return this.f1625a;
        }
        throw new IllegalArgumentException("newSize must be >= 0: " + i11);
    }

    public float[] J() {
        int length = this.f1625a.length;
        int i11 = this.f1626b;
        if (length != i11) {
            F(i11);
        }
        return this.f1625a;
    }

    public void K() {
        float[] fArr = this.f1625a;
        for (int i11 = this.f1626b - 1; i11 >= 0; i11--) {
            int M = com.badlogic.gdx.math.n.M(i11);
            float f11 = fArr[i11];
            fArr[i11] = fArr[M];
            fArr[M] = f11;
        }
    }

    public void L() {
        Arrays.sort(this.f1625a, 0, this.f1626b);
    }

    public void M(int i11, int i12) {
        int i13 = this.f1626b;
        if (i11 >= i13) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i11 + " >= " + this.f1626b);
        }
        if (i12 < i13) {
            float[] fArr = this.f1625a;
            float f11 = fArr[i11];
            fArr[i11] = fArr[i12];
            fArr[i12] = f11;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i12 + " >= " + this.f1626b);
    }

    public float[] N() {
        int i11 = this.f1626b;
        float[] fArr = new float[i11];
        System.arraycopy(this.f1625a, 0, fArr, 0, i11);
        return fArr;
    }

    public String O(String str) {
        if (this.f1626b == 0) {
            return "";
        }
        float[] fArr = this.f1625a;
        y0 y0Var = new y0(32);
        y0Var.n(fArr[0]);
        for (int i11 = 1; i11 < this.f1626b; i11++) {
            y0Var.O(str);
            y0Var.n(fArr[i11]);
        }
        return y0Var.toString();
    }

    public void P(int i11) {
        if (this.f1626b > i11) {
            this.f1626b = i11;
        }
    }

    public void a(float f11) {
        float[] fArr = this.f1625a;
        int i11 = this.f1626b;
        if (i11 == fArr.length) {
            fArr = F(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1626b;
        this.f1626b = i12 + 1;
        fArr[i12] = f11;
    }

    public void b(float f11, float f12) {
        float[] fArr = this.f1625a;
        int i11 = this.f1626b;
        if (i11 + 1 >= fArr.length) {
            fArr = F(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1626b;
        fArr[i12] = f11;
        fArr[i12 + 1] = f12;
        this.f1626b = i12 + 2;
    }

    public void c(float f11, float f12, float f13) {
        float[] fArr = this.f1625a;
        int i11 = this.f1626b;
        if (i11 + 2 >= fArr.length) {
            fArr = F(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1626b;
        fArr[i12] = f11;
        fArr[i12 + 1] = f12;
        fArr[i12 + 2] = f13;
        this.f1626b = i12 + 3;
    }

    public void d(float f11, float f12, float f13, float f14) {
        float[] fArr = this.f1625a;
        int i11 = this.f1626b;
        if (i11 + 3 >= fArr.length) {
            fArr = F(Math.max(8, (int) (i11 * 1.8f)));
        }
        int i12 = this.f1626b;
        fArr[i12] = f11;
        fArr[i12 + 1] = f12;
        fArr[i12 + 2] = f13;
        fArr[i12 + 3] = f14;
        this.f1626b = i12 + 4;
    }

    public void e(r rVar) {
        h(rVar.f1625a, 0, rVar.f1626b);
    }

    public boolean equals(Object obj) {
        int i11;
        if (obj == this) {
            return true;
        }
        if (!this.f1627c || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!rVar.f1627c || (i11 = this.f1626b) != rVar.f1626b) {
            return false;
        }
        float[] fArr = this.f1625a;
        float[] fArr2 = rVar.f1625a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (fArr[i12] != fArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    public void f(r rVar, int i11, int i12) {
        if (i11 + i12 <= rVar.f1626b) {
            h(rVar.f1625a, i11, i12);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i11 + " + " + i12 + " <= " + rVar.f1626b);
    }

    public void g(float... fArr) {
        h(fArr, 0, fArr.length);
    }

    public void h(float[] fArr, int i11, int i12) {
        float[] fArr2 = this.f1625a;
        int i13 = this.f1626b + i12;
        if (i13 > fArr2.length) {
            fArr2 = F(Math.max(Math.max(8, i13), (int) (this.f1626b * 1.75f)));
        }
        System.arraycopy(fArr, i11, fArr2, this.f1626b, i12);
        this.f1626b += i12;
    }

    public int hashCode() {
        if (!this.f1627c) {
            return super.hashCode();
        }
        float[] fArr = this.f1625a;
        int i11 = this.f1626b;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + e0.d(fArr[i13]);
        }
        return i12;
    }

    public void i() {
        this.f1626b = 0;
    }

    public boolean j(float f11) {
        int i11 = this.f1626b - 1;
        float[] fArr = this.f1625a;
        while (i11 >= 0) {
            int i12 = i11 - 1;
            if (fArr[i11] == f11) {
                return true;
            }
            i11 = i12;
        }
        return false;
    }

    public float[] k(int i11) {
        if (i11 >= 0) {
            int i12 = this.f1626b + i11;
            if (i12 > this.f1625a.length) {
                F(Math.max(Math.max(8, i12), (int) (this.f1626b * 1.75f)));
            }
            return this.f1625a;
        }
        throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i11);
    }

    public boolean l(Object obj, float f11) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        int i11 = this.f1626b;
        if (i11 != rVar.f1626b || !this.f1627c || !rVar.f1627c) {
            return false;
        }
        float[] fArr = this.f1625a;
        float[] fArr2 = rVar.f1625a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (Math.abs(fArr[i12] - fArr2[i12]) > f11) {
                return false;
            }
        }
        return true;
    }

    public float m() {
        if (this.f1626b != 0) {
            return this.f1625a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public float n(int i11) {
        if (i11 < this.f1626b) {
            return this.f1625a[i11];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1626b);
    }

    public void o(float f11) {
        float[] fArr = this.f1625a;
        int i11 = this.f1626b;
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i12] = fArr[i12] + f11;
        }
    }

    public void p(int i11, float f11) {
        if (i11 < this.f1626b) {
            float[] fArr = this.f1625a;
            fArr[i11] = fArr[i11] + f11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1626b);
    }

    public int q(float f11) {
        float[] fArr = this.f1625a;
        int i11 = this.f1626b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (fArr[i12] == f11) {
                return i12;
            }
        }
        return -1;
    }

    public void r(int i11, float f11) {
        int i12 = this.f1626b;
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1626b);
        }
        float[] fArr = this.f1625a;
        if (i12 == fArr.length) {
            fArr = F(Math.max(8, (int) (i12 * 1.75f)));
        }
        if (this.f1627c) {
            System.arraycopy(fArr, i11, fArr, i11 + 1, this.f1626b - i11);
        } else {
            fArr[this.f1626b] = fArr[i11];
        }
        this.f1626b++;
        fArr[i11] = f11;
    }

    public void s(int i11, int i12) {
        int i13 = this.f1626b;
        if (i11 > i13) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1626b);
        }
        int i14 = i13 + i12;
        if (i14 > this.f1625a.length) {
            this.f1625a = F(Math.max(Math.max(8, i14), (int) (this.f1626b * 1.75f)));
        }
        float[] fArr = this.f1625a;
        System.arraycopy(fArr, i11, fArr, i12 + i11, this.f1626b - i11);
        this.f1626b = i14;
    }

    public boolean t() {
        return this.f1626b == 0;
    }

    public String toString() {
        if (this.f1626b == 0) {
            return okhttp3.i.f77289p;
        }
        float[] fArr = this.f1625a;
        y0 y0Var = new y0(32);
        y0Var.append('[');
        y0Var.n(fArr[0]);
        for (int i11 = 1; i11 < this.f1626b; i11++) {
            y0Var.O(j2.O);
            y0Var.n(fArr[i11]);
        }
        y0Var.append(l50.b.f69930l);
        return y0Var.toString();
    }

    public int u(float f11) {
        float[] fArr = this.f1625a;
        for (int i11 = this.f1626b - 1; i11 >= 0; i11--) {
            if (fArr[i11] == f11) {
                return i11;
            }
        }
        return -1;
    }

    public void v(float f11) {
        float[] fArr = this.f1625a;
        int i11 = this.f1626b;
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i12] = fArr[i12] * f11;
        }
    }

    public void w(int i11, float f11) {
        if (i11 < this.f1626b) {
            float[] fArr = this.f1625a;
            fArr[i11] = fArr[i11] * f11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1626b);
    }

    public boolean x() {
        return this.f1626b > 0;
    }

    public float y() {
        return this.f1625a[this.f1626b - 1];
    }

    public float z() {
        float[] fArr = this.f1625a;
        int i11 = this.f1626b - 1;
        this.f1626b = i11;
        return fArr[i11];
    }

    public r(int i11) {
        this(true, i11);
    }

    public r(boolean z11, int i11) {
        this.f1627c = z11;
        this.f1625a = new float[i11];
    }

    public r(r rVar) {
        this.f1627c = rVar.f1627c;
        int i11 = rVar.f1626b;
        this.f1626b = i11;
        float[] fArr = new float[i11];
        this.f1625a = fArr;
        System.arraycopy(rVar.f1625a, 0, fArr, 0, i11);
    }

    public r(float[] fArr) {
        this(true, fArr, 0, fArr.length);
    }

    public r(boolean z11, float[] fArr, int i11, int i12) {
        this(z11, i12);
        this.f1626b = i12;
        System.arraycopy(fArr, i11, this.f1625a, 0, i12);
    }
}
