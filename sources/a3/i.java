package a3;

import java.util.Arrays;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public char[] f1544a;

    /* renamed from: b, reason: collision with root package name */
    public int f1545b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1546c;

    public i() {
        this(true, 16);
    }

    public static i P(char... cArr) {
        return new i(cArr);
    }

    public boolean A(i iVar) {
        int i11 = this.f1545b;
        char[] cArr = this.f1544a;
        int i12 = iVar.f1545b;
        int i13 = i11;
        for (int i14 = 0; i14 < i12; i14++) {
            char m11 = iVar.m(i14);
            int i15 = 0;
            while (true) {
                if (i15 >= i13) {
                    break;
                }
                if (m11 == cArr[i15]) {
                    B(i15);
                    i13--;
                    break;
                }
                i15++;
            }
        }
        return i13 != i11;
    }

    public char B(int i11) {
        int i12 = this.f1545b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1545b);
        }
        char[] cArr = this.f1544a;
        char c11 = cArr[i11];
        int i13 = i12 - 1;
        this.f1545b = i13;
        if (this.f1546c) {
            System.arraycopy(cArr, i11 + 1, cArr, i11, i13 - i11);
            return c11;
        }
        cArr[i11] = cArr[i13];
        return c11;
    }

    public void C(int i11, int i12) {
        int i13 = this.f1545b;
        if (i12 >= i13) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i12 + " >= " + this.f1545b);
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i11 + " > " + i12);
        }
        int i14 = (i12 - i11) + 1;
        int i15 = i13 - i14;
        if (this.f1546c) {
            char[] cArr = this.f1544a;
            int i16 = i14 + i11;
            System.arraycopy(cArr, i16, cArr, i11, i13 - i16);
        } else {
            int max = Math.max(i15, i12 + 1);
            char[] cArr2 = this.f1544a;
            System.arraycopy(cArr2, max, cArr2, i11, i13 - max);
        }
        this.f1545b = i15;
    }

    public boolean D(char c11) {
        char[] cArr = this.f1544a;
        int i11 = this.f1545b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (cArr[i12] == c11) {
                B(i12);
                return true;
            }
        }
        return false;
    }

    public char[] E(int i11) {
        char[] cArr = new char[i11];
        System.arraycopy(this.f1544a, 0, cArr, 0, Math.min(this.f1545b, i11));
        this.f1544a = cArr;
        return cArr;
    }

    public void F() {
        char[] cArr = this.f1544a;
        int i11 = this.f1545b;
        int i12 = i11 - 1;
        int i13 = i11 / 2;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i12 - i14;
            char c11 = cArr[i14];
            cArr[i14] = cArr[i15];
            cArr[i15] = c11;
        }
    }

    public void G(int i11, char c11) {
        if (i11 < this.f1545b) {
            this.f1544a[i11] = c11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1545b);
    }

    public char[] H(int i11) {
        if (i11 >= 0) {
            if (i11 > this.f1544a.length) {
                E(Math.max(8, i11));
            }
            this.f1545b = i11;
            return this.f1544a;
        }
        throw new IllegalArgumentException("newSize must be >= 0: " + i11);
    }

    public char[] I() {
        int length = this.f1544a.length;
        int i11 = this.f1545b;
        if (length != i11) {
            E(i11);
        }
        return this.f1544a;
    }

    public void J() {
        char[] cArr = this.f1544a;
        for (int i11 = this.f1545b - 1; i11 >= 0; i11--) {
            int M = com.badlogic.gdx.math.n.M(i11);
            char c11 = cArr[i11];
            cArr[i11] = cArr[M];
            cArr[M] = c11;
        }
    }

    public void K() {
        Arrays.sort(this.f1544a, 0, this.f1545b);
    }

    public void L(int i11, int i12) {
        int i13 = this.f1545b;
        if (i11 >= i13) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i11 + " >= " + this.f1545b);
        }
        if (i12 < i13) {
            char[] cArr = this.f1544a;
            char c11 = cArr[i11];
            cArr[i11] = cArr[i12];
            cArr[i12] = c11;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i12 + " >= " + this.f1545b);
    }

    public char[] M() {
        int i11 = this.f1545b;
        char[] cArr = new char[i11];
        System.arraycopy(this.f1544a, 0, cArr, 0, i11);
        return cArr;
    }

    public String N(String str) {
        if (this.f1545b == 0) {
            return "";
        }
        char[] cArr = this.f1544a;
        y0 y0Var = new y0(32);
        y0Var.append(cArr[0]);
        for (int i11 = 1; i11 < this.f1545b; i11++) {
            y0Var.O(str);
            y0Var.append(cArr[i11]);
        }
        return y0Var.toString();
    }

    public void O(int i11) {
        if (this.f1545b > i11) {
            this.f1545b = i11;
        }
    }

    public void a(char c11) {
        char[] cArr = this.f1544a;
        int i11 = this.f1545b;
        if (i11 == cArr.length) {
            cArr = E(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1545b;
        this.f1545b = i12 + 1;
        cArr[i12] = c11;
    }

    public void b(char c11, char c12) {
        char[] cArr = this.f1544a;
        int i11 = this.f1545b;
        if (i11 + 1 >= cArr.length) {
            cArr = E(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1545b;
        cArr[i12] = c11;
        cArr[i12 + 1] = c12;
        this.f1545b = i12 + 2;
    }

    public void c(char c11, char c12, char c13) {
        char[] cArr = this.f1544a;
        int i11 = this.f1545b;
        if (i11 + 2 >= cArr.length) {
            cArr = E(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1545b;
        cArr[i12] = c11;
        cArr[i12 + 1] = c12;
        cArr[i12 + 2] = c13;
        this.f1545b = i12 + 3;
    }

    public void d(char c11, char c12, char c13, char c14) {
        char[] cArr = this.f1544a;
        int i11 = this.f1545b;
        if (i11 + 3 >= cArr.length) {
            cArr = E(Math.max(8, (int) (i11 * 1.8f)));
        }
        int i12 = this.f1545b;
        cArr[i12] = c11;
        cArr[i12 + 1] = c12;
        cArr[i12 + 2] = c13;
        cArr[i12 + 3] = c14;
        this.f1545b = i12 + 4;
    }

    public void e(i iVar) {
        h(iVar.f1544a, 0, iVar.f1545b);
    }

    public boolean equals(Object obj) {
        int i11;
        if (obj == this) {
            return true;
        }
        if (!this.f1546c || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!iVar.f1546c || (i11 = this.f1545b) != iVar.f1545b) {
            return false;
        }
        char[] cArr = this.f1544a;
        char[] cArr2 = iVar.f1544a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (cArr[i12] != cArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    public void f(i iVar, int i11, int i12) {
        if (i11 + i12 <= iVar.f1545b) {
            h(iVar.f1544a, i11, i12);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i11 + " + " + i12 + " <= " + iVar.f1545b);
    }

    public void g(char... cArr) {
        h(cArr, 0, cArr.length);
    }

    public void h(char[] cArr, int i11, int i12) {
        char[] cArr2 = this.f1544a;
        int i13 = this.f1545b + i12;
        if (i13 > cArr2.length) {
            cArr2 = E(Math.max(Math.max(8, i13), (int) (this.f1545b * 1.75f)));
        }
        System.arraycopy(cArr, i11, cArr2, this.f1545b, i12);
        this.f1545b += i12;
    }

    public int hashCode() {
        if (!this.f1546c) {
            return super.hashCode();
        }
        char[] cArr = this.f1544a;
        int i11 = this.f1545b;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + cArr[i13];
        }
        return i12;
    }

    public void i() {
        this.f1545b = 0;
    }

    public boolean j(char c11) {
        int i11 = this.f1545b - 1;
        char[] cArr = this.f1544a;
        while (i11 >= 0) {
            int i12 = i11 - 1;
            if (cArr[i11] == c11) {
                return true;
            }
            i11 = i12;
        }
        return false;
    }

    public char[] k(int i11) {
        if (i11 >= 0) {
            int i12 = this.f1545b + i11;
            if (i12 > this.f1544a.length) {
                E(Math.max(Math.max(8, i12), (int) (this.f1545b * 1.75f)));
            }
            return this.f1544a;
        }
        throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i11);
    }

    public char l() {
        if (this.f1545b != 0) {
            return this.f1544a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public char m(int i11) {
        if (i11 < this.f1545b) {
            return this.f1544a[i11];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1545b);
    }

    public void n(char c11) {
        char[] cArr = this.f1544a;
        int i11 = this.f1545b;
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i12] = (char) (cArr[i12] + c11);
        }
    }

    public void o(int i11, char c11) {
        if (i11 < this.f1545b) {
            char[] cArr = this.f1544a;
            cArr[i11] = (char) (cArr[i11] + c11);
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1545b);
    }

    public int p(char c11) {
        char[] cArr = this.f1544a;
        int i11 = this.f1545b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (cArr[i12] == c11) {
                return i12;
            }
        }
        return -1;
    }

    public void q(int i11, char c11) {
        int i12 = this.f1545b;
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1545b);
        }
        char[] cArr = this.f1544a;
        if (i12 == cArr.length) {
            cArr = E(Math.max(8, (int) (i12 * 1.75f)));
        }
        if (this.f1546c) {
            System.arraycopy(cArr, i11, cArr, i11 + 1, this.f1545b - i11);
        } else {
            cArr[this.f1545b] = cArr[i11];
        }
        this.f1545b++;
        cArr[i11] = c11;
    }

    public void r(int i11, int i12) {
        int i13 = this.f1545b;
        if (i11 > i13) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1545b);
        }
        int i14 = i13 + i12;
        if (i14 > this.f1544a.length) {
            this.f1544a = E(Math.max(Math.max(8, i14), (int) (this.f1545b * 1.75f)));
        }
        char[] cArr = this.f1544a;
        System.arraycopy(cArr, i11, cArr, i12 + i11, this.f1545b - i11);
        this.f1545b = i14;
    }

    public boolean s() {
        return this.f1545b == 0;
    }

    public int t(char c11) {
        char[] cArr = this.f1544a;
        for (int i11 = this.f1545b - 1; i11 >= 0; i11--) {
            if (cArr[i11] == c11) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        if (this.f1545b == 0) {
            return okhttp3.i.f77289p;
        }
        char[] cArr = this.f1544a;
        y0 y0Var = new y0(32);
        y0Var.append('[');
        y0Var.append(cArr[0]);
        for (int i11 = 1; i11 < this.f1545b; i11++) {
            y0Var.O(j2.O);
            y0Var.append(cArr[i11]);
        }
        y0Var.append(l50.b.f69930l);
        return y0Var.toString();
    }

    public void u(char c11) {
        char[] cArr = this.f1544a;
        int i11 = this.f1545b;
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i12] = (char) (cArr[i12] * c11);
        }
    }

    public void v(int i11, char c11) {
        if (i11 < this.f1545b) {
            char[] cArr = this.f1544a;
            cArr[i11] = (char) (cArr[i11] * c11);
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1545b);
    }

    public boolean w() {
        return this.f1545b > 0;
    }

    public char x() {
        return this.f1544a[this.f1545b - 1];
    }

    public char y() {
        char[] cArr = this.f1544a;
        int i11 = this.f1545b - 1;
        this.f1545b = i11;
        return cArr[i11];
    }

    public char z() {
        int i11 = this.f1545b;
        if (i11 == 0) {
            return (char) 0;
        }
        return this.f1544a[com.badlogic.gdx.math.n.N(0, i11 - 1)];
    }

    public i(int i11) {
        this(true, i11);
    }

    public i(boolean z11, int i11) {
        this.f1546c = z11;
        this.f1544a = new char[i11];
    }

    public i(i iVar) {
        this.f1546c = iVar.f1546c;
        int i11 = iVar.f1545b;
        this.f1545b = i11;
        char[] cArr = new char[i11];
        this.f1544a = cArr;
        System.arraycopy(iVar.f1544a, 0, cArr, 0, i11);
    }

    public i(char[] cArr) {
        this(true, cArr, 0, cArr.length);
    }

    public i(boolean z11, char[] cArr, int i11, int i12) {
        this(z11, i12);
        this.f1545b = i12;
        System.arraycopy(cArr, i11, this.f1544a, 0, i12);
    }
}
