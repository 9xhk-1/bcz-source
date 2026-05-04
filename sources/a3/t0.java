package a3;

import java.util.Arrays;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f1633a;

    /* renamed from: b, reason: collision with root package name */
    public int f1634b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1635c;

    public t0() {
        this(true, 16);
    }

    public static t0 Q(short... sArr) {
        return new t0(sArr);
    }

    public short A() {
        int i11 = this.f1634b;
        if (i11 == 0) {
            return (short) 0;
        }
        return this.f1633a[com.badlogic.gdx.math.n.N(0, i11 - 1)];
    }

    public boolean B(t0 t0Var) {
        int i11 = this.f1634b;
        short[] sArr = this.f1633a;
        int i12 = t0Var.f1634b;
        int i13 = i11;
        for (int i14 = 0; i14 < i12; i14++) {
            short n11 = t0Var.n(i14);
            int i15 = 0;
            while (true) {
                if (i15 >= i13) {
                    break;
                }
                if (n11 == sArr[i15]) {
                    C(i15);
                    i13--;
                    break;
                }
                i15++;
            }
        }
        return i13 != i11;
    }

    public short C(int i11) {
        int i12 = this.f1634b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1634b);
        }
        short[] sArr = this.f1633a;
        short s11 = sArr[i11];
        int i13 = i12 - 1;
        this.f1634b = i13;
        if (this.f1635c) {
            System.arraycopy(sArr, i11 + 1, sArr, i11, i13 - i11);
            return s11;
        }
        sArr[i11] = sArr[i13];
        return s11;
    }

    public void D(int i11, int i12) {
        int i13 = this.f1634b;
        if (i12 >= i13) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i12 + " >= " + this.f1634b);
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i11 + " > " + i12);
        }
        int i14 = (i12 - i11) + 1;
        int i15 = i13 - i14;
        if (this.f1635c) {
            short[] sArr = this.f1633a;
            int i16 = i14 + i11;
            System.arraycopy(sArr, i16, sArr, i11, i13 - i16);
        } else {
            int max = Math.max(i15, i12 + 1);
            short[] sArr2 = this.f1633a;
            System.arraycopy(sArr2, max, sArr2, i11, i13 - max);
        }
        this.f1634b = i15;
    }

    public boolean E(short s11) {
        short[] sArr = this.f1633a;
        int i11 = this.f1634b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (sArr[i12] == s11) {
                C(i12);
                return true;
            }
        }
        return false;
    }

    public short[] F(int i11) {
        short[] sArr = new short[i11];
        System.arraycopy(this.f1633a, 0, sArr, 0, Math.min(this.f1634b, i11));
        this.f1633a = sArr;
        return sArr;
    }

    public void G() {
        short[] sArr = this.f1633a;
        int i11 = this.f1634b;
        int i12 = i11 - 1;
        int i13 = i11 / 2;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i12 - i14;
            short s11 = sArr[i14];
            sArr[i14] = sArr[i15];
            sArr[i15] = s11;
        }
    }

    public void H(int i11, short s11) {
        if (i11 < this.f1634b) {
            this.f1633a[i11] = s11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1634b);
    }

    public short[] I(int i11) {
        if (i11 >= 0) {
            if (i11 > this.f1633a.length) {
                F(Math.max(8, i11));
            }
            this.f1634b = i11;
            return this.f1633a;
        }
        throw new IllegalArgumentException("newSize must be >= 0: " + i11);
    }

    public short[] J() {
        int length = this.f1633a.length;
        int i11 = this.f1634b;
        if (length != i11) {
            F(i11);
        }
        return this.f1633a;
    }

    public void K() {
        short[] sArr = this.f1633a;
        for (int i11 = this.f1634b - 1; i11 >= 0; i11--) {
            int M = com.badlogic.gdx.math.n.M(i11);
            short s11 = sArr[i11];
            sArr[i11] = sArr[M];
            sArr[M] = s11;
        }
    }

    public void L() {
        Arrays.sort(this.f1633a, 0, this.f1634b);
    }

    public void M(int i11, int i12) {
        int i13 = this.f1634b;
        if (i11 >= i13) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i11 + " >= " + this.f1634b);
        }
        if (i12 < i13) {
            short[] sArr = this.f1633a;
            short s11 = sArr[i11];
            sArr[i11] = sArr[i12];
            sArr[i12] = s11;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i12 + " >= " + this.f1634b);
    }

    public short[] N() {
        int i11 = this.f1634b;
        short[] sArr = new short[i11];
        System.arraycopy(this.f1633a, 0, sArr, 0, i11);
        return sArr;
    }

    public String O(String str) {
        if (this.f1634b == 0) {
            return "";
        }
        short[] sArr = this.f1633a;
        y0 y0Var = new y0(32);
        y0Var.D(sArr[0]);
        for (int i11 = 1; i11 < this.f1634b; i11++) {
            y0Var.O(str);
            y0Var.D(sArr[i11]);
        }
        return y0Var.toString();
    }

    public void P(int i11) {
        if (this.f1634b > i11) {
            this.f1634b = i11;
        }
    }

    public void a(int i11) {
        short[] sArr = this.f1633a;
        int i12 = this.f1634b;
        if (i12 == sArr.length) {
            sArr = F(Math.max(8, (int) (i12 * 1.75f)));
        }
        int i13 = this.f1634b;
        this.f1634b = i13 + 1;
        sArr[i13] = (short) i11;
    }

    public void b(short s11) {
        short[] sArr = this.f1633a;
        int i11 = this.f1634b;
        if (i11 == sArr.length) {
            sArr = F(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1634b;
        this.f1634b = i12 + 1;
        sArr[i12] = s11;
    }

    public void c(short s11, short s12) {
        short[] sArr = this.f1633a;
        int i11 = this.f1634b;
        if (i11 + 1 >= sArr.length) {
            sArr = F(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1634b;
        sArr[i12] = s11;
        sArr[i12 + 1] = s12;
        this.f1634b = i12 + 2;
    }

    public void d(short s11, short s12, short s13) {
        short[] sArr = this.f1633a;
        int i11 = this.f1634b;
        if (i11 + 2 >= sArr.length) {
            sArr = F(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1634b;
        sArr[i12] = s11;
        sArr[i12 + 1] = s12;
        sArr[i12 + 2] = s13;
        this.f1634b = i12 + 3;
    }

    public void e(short s11, short s12, short s13, short s14) {
        short[] sArr = this.f1633a;
        int i11 = this.f1634b;
        if (i11 + 3 >= sArr.length) {
            sArr = F(Math.max(8, (int) (i11 * 1.8f)));
        }
        int i12 = this.f1634b;
        sArr[i12] = s11;
        sArr[i12 + 1] = s12;
        sArr[i12 + 2] = s13;
        sArr[i12 + 3] = s14;
        this.f1634b = i12 + 4;
    }

    public boolean equals(Object obj) {
        int i11;
        if (obj == this) {
            return true;
        }
        if (!this.f1635c || !(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (!t0Var.f1635c || (i11 = this.f1634b) != t0Var.f1634b) {
            return false;
        }
        short[] sArr = this.f1633a;
        short[] sArr2 = t0Var.f1633a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (sArr[i12] != sArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    public void f(t0 t0Var) {
        i(t0Var.f1633a, 0, t0Var.f1634b);
    }

    public void g(t0 t0Var, int i11, int i12) {
        if (i11 + i12 <= t0Var.f1634b) {
            i(t0Var.f1633a, i11, i12);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i11 + " + " + i12 + " <= " + t0Var.f1634b);
    }

    public void h(short... sArr) {
        i(sArr, 0, sArr.length);
    }

    public int hashCode() {
        if (!this.f1635c) {
            return super.hashCode();
        }
        short[] sArr = this.f1633a;
        int i11 = this.f1634b;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + sArr[i13];
        }
        return i12;
    }

    public void i(short[] sArr, int i11, int i12) {
        short[] sArr2 = this.f1633a;
        int i13 = this.f1634b + i12;
        if (i13 > sArr2.length) {
            sArr2 = F(Math.max(Math.max(8, i13), (int) (this.f1634b * 1.75f)));
        }
        System.arraycopy(sArr, i11, sArr2, this.f1634b, i12);
        this.f1634b += i12;
    }

    public void j() {
        this.f1634b = 0;
    }

    public boolean k(short s11) {
        int i11 = this.f1634b - 1;
        short[] sArr = this.f1633a;
        while (i11 >= 0) {
            int i12 = i11 - 1;
            if (sArr[i11] == s11) {
                return true;
            }
            i11 = i12;
        }
        return false;
    }

    public short[] l(int i11) {
        if (i11 >= 0) {
            int i12 = this.f1634b + i11;
            if (i12 > this.f1633a.length) {
                F(Math.max(Math.max(8, i12), (int) (this.f1634b * 1.75f)));
            }
            return this.f1633a;
        }
        throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i11);
    }

    public short m() {
        if (this.f1634b != 0) {
            return this.f1633a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public short n(int i11) {
        if (i11 < this.f1634b) {
            return this.f1633a[i11];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1634b);
    }

    public void o(int i11, short s11) {
        if (i11 < this.f1634b) {
            short[] sArr = this.f1633a;
            sArr[i11] = (short) (sArr[i11] + s11);
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1634b);
    }

    public void p(short s11) {
        short[] sArr = this.f1633a;
        int i11 = this.f1634b;
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i12] = (short) (sArr[i12] + s11);
        }
    }

    public int q(short s11) {
        short[] sArr = this.f1633a;
        int i11 = this.f1634b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (sArr[i12] == s11) {
                return i12;
            }
        }
        return -1;
    }

    public void r(int i11, short s11) {
        int i12 = this.f1634b;
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1634b);
        }
        short[] sArr = this.f1633a;
        if (i12 == sArr.length) {
            sArr = F(Math.max(8, (int) (i12 * 1.75f)));
        }
        if (this.f1635c) {
            System.arraycopy(sArr, i11, sArr, i11 + 1, this.f1634b - i11);
        } else {
            sArr[this.f1634b] = sArr[i11];
        }
        this.f1634b++;
        sArr[i11] = s11;
    }

    public void s(int i11, int i12) {
        int i13 = this.f1634b;
        if (i11 > i13) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1634b);
        }
        int i14 = i13 + i12;
        if (i14 > this.f1633a.length) {
            this.f1633a = F(Math.max(Math.max(8, i14), (int) (this.f1634b * 1.75f)));
        }
        short[] sArr = this.f1633a;
        System.arraycopy(sArr, i11, sArr, i12 + i11, this.f1634b - i11);
        this.f1634b = i14;
    }

    public boolean t() {
        return this.f1634b == 0;
    }

    public String toString() {
        if (this.f1634b == 0) {
            return okhttp3.i.f77289p;
        }
        short[] sArr = this.f1633a;
        y0 y0Var = new y0(32);
        y0Var.append('[');
        y0Var.D(sArr[0]);
        for (int i11 = 1; i11 < this.f1634b; i11++) {
            y0Var.O(j2.O);
            y0Var.D(sArr[i11]);
        }
        y0Var.append(l50.b.f69930l);
        return y0Var.toString();
    }

    public int u(short s11) {
        short[] sArr = this.f1633a;
        for (int i11 = this.f1634b - 1; i11 >= 0; i11--) {
            if (sArr[i11] == s11) {
                return i11;
            }
        }
        return -1;
    }

    public void v(int i11, short s11) {
        if (i11 < this.f1634b) {
            short[] sArr = this.f1633a;
            sArr[i11] = (short) (sArr[i11] * s11);
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1634b);
    }

    public void w(short s11) {
        short[] sArr = this.f1633a;
        int i11 = this.f1634b;
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i12] = (short) (sArr[i12] * s11);
        }
    }

    public boolean x() {
        return this.f1634b > 0;
    }

    public short y() {
        return this.f1633a[this.f1634b - 1];
    }

    public short z() {
        short[] sArr = this.f1633a;
        int i11 = this.f1634b - 1;
        this.f1634b = i11;
        return sArr[i11];
    }

    public t0(int i11) {
        this(true, i11);
    }

    public t0(boolean z11, int i11) {
        this.f1635c = z11;
        this.f1633a = new short[i11];
    }

    public t0(t0 t0Var) {
        this.f1635c = t0Var.f1635c;
        int i11 = t0Var.f1634b;
        this.f1634b = i11;
        short[] sArr = new short[i11];
        this.f1633a = sArr;
        System.arraycopy(t0Var.f1633a, 0, sArr, 0, i11);
    }

    public t0(short[] sArr) {
        this(true, sArr, 0, sArr.length);
    }

    public t0(boolean z11, short[] sArr, int i11, int i12) {
        this(z11, i12);
        this.f1634b = i12;
        System.arraycopy(sArr, i11, this.f1633a, 0, i12);
    }
}
