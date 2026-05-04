package a3;

import java.util.Arrays;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1639a;

    /* renamed from: b, reason: collision with root package name */
    public int f1640b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1641c;

    public v() {
        this(true, 16);
    }

    public static v P(int... iArr) {
        return new v(iArr);
    }

    public boolean A(v vVar) {
        int i11 = this.f1640b;
        int[] iArr = this.f1639a;
        int i12 = vVar.f1640b;
        int i13 = i11;
        for (int i14 = 0; i14 < i12; i14++) {
            int m11 = vVar.m(i14);
            int i15 = 0;
            while (true) {
                if (i15 >= i13) {
                    break;
                }
                if (m11 == iArr[i15]) {
                    B(i15);
                    i13--;
                    break;
                }
                i15++;
            }
        }
        return i13 != i11;
    }

    public int B(int i11) {
        int i12 = this.f1640b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1640b);
        }
        int[] iArr = this.f1639a;
        int i13 = iArr[i11];
        int i14 = i12 - 1;
        this.f1640b = i14;
        if (this.f1641c) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, i14 - i11);
            return i13;
        }
        iArr[i11] = iArr[i14];
        return i13;
    }

    public void C(int i11, int i12) {
        int i13 = this.f1640b;
        if (i12 >= i13) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i12 + " >= " + this.f1640b);
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i11 + " > " + i12);
        }
        int i14 = (i12 - i11) + 1;
        int i15 = i13 - i14;
        if (this.f1641c) {
            int[] iArr = this.f1639a;
            int i16 = i14 + i11;
            System.arraycopy(iArr, i16, iArr, i11, i13 - i16);
        } else {
            int max = Math.max(i15, i12 + 1);
            int[] iArr2 = this.f1639a;
            System.arraycopy(iArr2, max, iArr2, i11, i13 - max);
        }
        this.f1640b = i15;
    }

    public boolean D(int i11) {
        int[] iArr = this.f1639a;
        int i12 = this.f1640b;
        for (int i13 = 0; i13 < i12; i13++) {
            if (iArr[i13] == i11) {
                B(i13);
                return true;
            }
        }
        return false;
    }

    public int[] E(int i11) {
        int[] iArr = new int[i11];
        System.arraycopy(this.f1639a, 0, iArr, 0, Math.min(this.f1640b, i11));
        this.f1639a = iArr;
        return iArr;
    }

    public void F() {
        int[] iArr = this.f1639a;
        int i11 = this.f1640b;
        int i12 = i11 - 1;
        int i13 = i11 / 2;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i12 - i14;
            int i16 = iArr[i14];
            iArr[i14] = iArr[i15];
            iArr[i15] = i16;
        }
    }

    public void G(int i11, int i12) {
        if (i11 < this.f1640b) {
            this.f1639a[i11] = i12;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1640b);
    }

    public int[] H(int i11) {
        if (i11 >= 0) {
            if (i11 > this.f1639a.length) {
                E(Math.max(8, i11));
            }
            this.f1640b = i11;
            return this.f1639a;
        }
        throw new IllegalArgumentException("newSize must be >= 0: " + i11);
    }

    public int[] I() {
        int length = this.f1639a.length;
        int i11 = this.f1640b;
        if (length != i11) {
            E(i11);
        }
        return this.f1639a;
    }

    public void J() {
        int[] iArr = this.f1639a;
        for (int i11 = this.f1640b - 1; i11 >= 0; i11--) {
            int M = com.badlogic.gdx.math.n.M(i11);
            int i12 = iArr[i11];
            iArr[i11] = iArr[M];
            iArr[M] = i12;
        }
    }

    public void K() {
        Arrays.sort(this.f1639a, 0, this.f1640b);
    }

    public void L(int i11, int i12) {
        int i13 = this.f1640b;
        if (i11 >= i13) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i11 + " >= " + this.f1640b);
        }
        if (i12 < i13) {
            int[] iArr = this.f1639a;
            int i14 = iArr[i11];
            iArr[i11] = iArr[i12];
            iArr[i12] = i14;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i12 + " >= " + this.f1640b);
    }

    public int[] M() {
        int i11 = this.f1640b;
        int[] iArr = new int[i11];
        System.arraycopy(this.f1639a, 0, iArr, 0, i11);
        return iArr;
    }

    public String N(String str) {
        if (this.f1640b == 0) {
            return "";
        }
        int[] iArr = this.f1639a;
        y0 y0Var = new y0(32);
        y0Var.D(iArr[0]);
        for (int i11 = 1; i11 < this.f1640b; i11++) {
            y0Var.O(str);
            y0Var.D(iArr[i11]);
        }
        return y0Var.toString();
    }

    public void O(int i11) {
        if (this.f1640b > i11) {
            this.f1640b = i11;
        }
    }

    public void a(int i11) {
        int[] iArr = this.f1639a;
        int i12 = this.f1640b;
        if (i12 == iArr.length) {
            iArr = E(Math.max(8, (int) (i12 * 1.75f)));
        }
        int i13 = this.f1640b;
        this.f1640b = i13 + 1;
        iArr[i13] = i11;
    }

    public void b(int i11, int i12) {
        int[] iArr = this.f1639a;
        int i13 = this.f1640b;
        if (i13 + 1 >= iArr.length) {
            iArr = E(Math.max(8, (int) (i13 * 1.75f)));
        }
        int i14 = this.f1640b;
        iArr[i14] = i11;
        iArr[i14 + 1] = i12;
        this.f1640b = i14 + 2;
    }

    public void c(int i11, int i12, int i13) {
        int[] iArr = this.f1639a;
        int i14 = this.f1640b;
        if (i14 + 2 >= iArr.length) {
            iArr = E(Math.max(8, (int) (i14 * 1.75f)));
        }
        int i15 = this.f1640b;
        iArr[i15] = i11;
        iArr[i15 + 1] = i12;
        iArr[i15 + 2] = i13;
        this.f1640b = i15 + 3;
    }

    public void d(int i11, int i12, int i13, int i14) {
        int[] iArr = this.f1639a;
        int i15 = this.f1640b;
        if (i15 + 3 >= iArr.length) {
            iArr = E(Math.max(8, (int) (i15 * 1.8f)));
        }
        int i16 = this.f1640b;
        iArr[i16] = i11;
        iArr[i16 + 1] = i12;
        iArr[i16 + 2] = i13;
        iArr[i16 + 3] = i14;
        this.f1640b = i16 + 4;
    }

    public void e(v vVar) {
        h(vVar.f1639a, 0, vVar.f1640b);
    }

    public boolean equals(Object obj) {
        int i11;
        if (obj == this) {
            return true;
        }
        if (!this.f1641c || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!vVar.f1641c || (i11 = this.f1640b) != vVar.f1640b) {
            return false;
        }
        int[] iArr = this.f1639a;
        int[] iArr2 = vVar.f1639a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] != iArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    public void f(v vVar, int i11, int i12) {
        if (i11 + i12 <= vVar.f1640b) {
            h(vVar.f1639a, i11, i12);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i11 + " + " + i12 + " <= " + vVar.f1640b);
    }

    public void g(int... iArr) {
        h(iArr, 0, iArr.length);
    }

    public void h(int[] iArr, int i11, int i12) {
        int[] iArr2 = this.f1639a;
        int i13 = this.f1640b + i12;
        if (i13 > iArr2.length) {
            iArr2 = E(Math.max(Math.max(8, i13), (int) (this.f1640b * 1.75f)));
        }
        System.arraycopy(iArr, i11, iArr2, this.f1640b, i12);
        this.f1640b += i12;
    }

    public int hashCode() {
        if (!this.f1641c) {
            return super.hashCode();
        }
        int[] iArr = this.f1639a;
        int i11 = this.f1640b;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        return i12;
    }

    public void i() {
        this.f1640b = 0;
    }

    public boolean j(int i11) {
        int i12 = this.f1640b - 1;
        int[] iArr = this.f1639a;
        while (i12 >= 0) {
            int i13 = i12 - 1;
            if (iArr[i12] == i11) {
                return true;
            }
            i12 = i13;
        }
        return false;
    }

    public int[] k(int i11) {
        if (i11 >= 0) {
            int i12 = this.f1640b + i11;
            if (i12 > this.f1639a.length) {
                E(Math.max(Math.max(8, i12), (int) (this.f1640b * 1.75f)));
            }
            return this.f1639a;
        }
        throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i11);
    }

    public int l() {
        if (this.f1640b != 0) {
            return this.f1639a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public int m(int i11) {
        if (i11 < this.f1640b) {
            return this.f1639a[i11];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1640b);
    }

    public void n(int i11) {
        int[] iArr = this.f1639a;
        int i12 = this.f1640b;
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i13] = iArr[i13] + i11;
        }
    }

    public void o(int i11, int i12) {
        if (i11 < this.f1640b) {
            int[] iArr = this.f1639a;
            iArr[i11] = iArr[i11] + i12;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1640b);
    }

    public int p(int i11) {
        int[] iArr = this.f1639a;
        int i12 = this.f1640b;
        for (int i13 = 0; i13 < i12; i13++) {
            if (iArr[i13] == i11) {
                return i13;
            }
        }
        return -1;
    }

    public void q(int i11, int i12) {
        int i13 = this.f1640b;
        if (i11 > i13) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1640b);
        }
        int[] iArr = this.f1639a;
        if (i13 == iArr.length) {
            iArr = E(Math.max(8, (int) (i13 * 1.75f)));
        }
        if (this.f1641c) {
            System.arraycopy(iArr, i11, iArr, i11 + 1, this.f1640b - i11);
        } else {
            iArr[this.f1640b] = iArr[i11];
        }
        this.f1640b++;
        iArr[i11] = i12;
    }

    public void r(int i11, int i12) {
        int i13 = this.f1640b;
        if (i11 > i13) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1640b);
        }
        int i14 = i13 + i12;
        if (i14 > this.f1639a.length) {
            this.f1639a = E(Math.max(Math.max(8, i14), (int) (this.f1640b * 1.75f)));
        }
        int[] iArr = this.f1639a;
        System.arraycopy(iArr, i11, iArr, i12 + i11, this.f1640b - i11);
        this.f1640b = i14;
    }

    public boolean s() {
        return this.f1640b == 0;
    }

    public int t(int i11) {
        int[] iArr = this.f1639a;
        for (int i12 = this.f1640b - 1; i12 >= 0; i12--) {
            if (iArr[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    public String toString() {
        if (this.f1640b == 0) {
            return okhttp3.i.f77289p;
        }
        int[] iArr = this.f1639a;
        y0 y0Var = new y0(32);
        y0Var.append('[');
        y0Var.D(iArr[0]);
        for (int i11 = 1; i11 < this.f1640b; i11++) {
            y0Var.O(j2.O);
            y0Var.D(iArr[i11]);
        }
        y0Var.append(l50.b.f69930l);
        return y0Var.toString();
    }

    public void u(int i11) {
        int[] iArr = this.f1639a;
        int i12 = this.f1640b;
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i13] = iArr[i13] * i11;
        }
    }

    public void v(int i11, int i12) {
        if (i11 < this.f1640b) {
            int[] iArr = this.f1639a;
            iArr[i11] = iArr[i11] * i12;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1640b);
    }

    public boolean w() {
        return this.f1640b > 0;
    }

    public int x() {
        return this.f1639a[this.f1640b - 1];
    }

    public int y() {
        int[] iArr = this.f1639a;
        int i11 = this.f1640b - 1;
        this.f1640b = i11;
        return iArr[i11];
    }

    public int z() {
        int i11 = this.f1640b;
        if (i11 == 0) {
            return 0;
        }
        return this.f1639a[com.badlogic.gdx.math.n.N(0, i11 - 1)];
    }

    public v(int i11) {
        this(true, i11);
    }

    public v(boolean z11, int i11) {
        this.f1641c = z11;
        this.f1639a = new int[i11];
    }

    public v(v vVar) {
        this.f1641c = vVar.f1641c;
        int i11 = vVar.f1640b;
        this.f1640b = i11;
        int[] iArr = new int[i11];
        this.f1639a = iArr;
        System.arraycopy(vVar.f1639a, 0, iArr, 0, i11);
    }

    public v(int[] iArr) {
        this(true, iArr, 0, iArr.length);
    }

    public v(boolean z11, int[] iArr, int i11, int i12) {
        this(z11, i12);
        this.f1640b = i12;
        System.arraycopy(iArr, i11, this.f1639a, 0, i12);
    }
}
