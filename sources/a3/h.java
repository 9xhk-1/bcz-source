package a3;

import java.util.Arrays;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f1533a;

    /* renamed from: b, reason: collision with root package name */
    public int f1534b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1535c;

    public h() {
        this(true, 16);
    }

    public static h P(byte... bArr) {
        return new h(bArr);
    }

    public boolean A(h hVar) {
        int i11 = this.f1534b;
        byte[] bArr = this.f1533a;
        int i12 = hVar.f1534b;
        int i13 = i11;
        for (int i14 = 0; i14 < i12; i14++) {
            byte m11 = hVar.m(i14);
            int i15 = 0;
            while (true) {
                if (i15 >= i13) {
                    break;
                }
                if (m11 == bArr[i15]) {
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
        int i12 = this.f1534b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1534b);
        }
        byte[] bArr = this.f1533a;
        byte b11 = bArr[i11];
        int i13 = i12 - 1;
        this.f1534b = i13;
        if (this.f1535c) {
            System.arraycopy(bArr, i11 + 1, bArr, i11, i13 - i11);
            return b11;
        }
        bArr[i11] = bArr[i13];
        return b11;
    }

    public void C(int i11, int i12) {
        int i13 = this.f1534b;
        if (i12 >= i13) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i12 + " >= " + this.f1534b);
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i11 + " > " + i12);
        }
        int i14 = (i12 - i11) + 1;
        int i15 = i13 - i14;
        if (this.f1535c) {
            byte[] bArr = this.f1533a;
            int i16 = i14 + i11;
            System.arraycopy(bArr, i16, bArr, i11, i13 - i16);
        } else {
            int max = Math.max(i15, i12 + 1);
            byte[] bArr2 = this.f1533a;
            System.arraycopy(bArr2, max, bArr2, i11, i13 - max);
        }
        this.f1534b = i15;
    }

    public boolean D(byte b11) {
        byte[] bArr = this.f1533a;
        int i11 = this.f1534b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12] == b11) {
                B(i12);
                return true;
            }
        }
        return false;
    }

    public byte[] E(int i11) {
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f1533a, 0, bArr, 0, Math.min(this.f1534b, i11));
        this.f1533a = bArr;
        return bArr;
    }

    public void F() {
        byte[] bArr = this.f1533a;
        int i11 = this.f1534b;
        int i12 = i11 - 1;
        int i13 = i11 / 2;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i12 - i14;
            byte b11 = bArr[i14];
            bArr[i14] = bArr[i15];
            bArr[i15] = b11;
        }
    }

    public void G(int i11, byte b11) {
        if (i11 < this.f1534b) {
            this.f1533a[i11] = b11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1534b);
    }

    public byte[] H(int i11) {
        if (i11 >= 0) {
            if (i11 > this.f1533a.length) {
                E(Math.max(8, i11));
            }
            this.f1534b = i11;
            return this.f1533a;
        }
        throw new IllegalArgumentException("newSize must be >= 0: " + i11);
    }

    public byte[] I() {
        int length = this.f1533a.length;
        int i11 = this.f1534b;
        if (length != i11) {
            E(i11);
        }
        return this.f1533a;
    }

    public void J() {
        byte[] bArr = this.f1533a;
        for (int i11 = this.f1534b - 1; i11 >= 0; i11--) {
            int M = com.badlogic.gdx.math.n.M(i11);
            byte b11 = bArr[i11];
            bArr[i11] = bArr[M];
            bArr[M] = b11;
        }
    }

    public void K() {
        Arrays.sort(this.f1533a, 0, this.f1534b);
    }

    public void L(int i11, int i12) {
        int i13 = this.f1534b;
        if (i11 >= i13) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i11 + " >= " + this.f1534b);
        }
        if (i12 < i13) {
            byte[] bArr = this.f1533a;
            byte b11 = bArr[i11];
            bArr[i11] = bArr[i12];
            bArr[i12] = b11;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i12 + " >= " + this.f1534b);
    }

    public byte[] M() {
        int i11 = this.f1534b;
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f1533a, 0, bArr, 0, i11);
        return bArr;
    }

    public String N(String str) {
        if (this.f1534b == 0) {
            return "";
        }
        byte[] bArr = this.f1533a;
        y0 y0Var = new y0(32);
        y0Var.D(bArr[0]);
        for (int i11 = 1; i11 < this.f1534b; i11++) {
            y0Var.O(str);
            y0Var.D(bArr[i11]);
        }
        return y0Var.toString();
    }

    public void O(int i11) {
        if (this.f1534b > i11) {
            this.f1534b = i11;
        }
    }

    public void a(byte b11) {
        byte[] bArr = this.f1533a;
        int i11 = this.f1534b;
        if (i11 == bArr.length) {
            bArr = E(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1534b;
        this.f1534b = i12 + 1;
        bArr[i12] = b11;
    }

    public void b(byte b11, byte b12) {
        byte[] bArr = this.f1533a;
        int i11 = this.f1534b;
        if (i11 + 1 >= bArr.length) {
            bArr = E(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1534b;
        bArr[i12] = b11;
        bArr[i12 + 1] = b12;
        this.f1534b = i12 + 2;
    }

    public void c(byte b11, byte b12, byte b13) {
        byte[] bArr = this.f1533a;
        int i11 = this.f1534b;
        if (i11 + 2 >= bArr.length) {
            bArr = E(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1534b;
        bArr[i12] = b11;
        bArr[i12 + 1] = b12;
        bArr[i12 + 2] = b13;
        this.f1534b = i12 + 3;
    }

    public void d(byte b11, byte b12, byte b13, byte b14) {
        byte[] bArr = this.f1533a;
        int i11 = this.f1534b;
        if (i11 + 3 >= bArr.length) {
            bArr = E(Math.max(8, (int) (i11 * 1.8f)));
        }
        int i12 = this.f1534b;
        bArr[i12] = b11;
        bArr[i12 + 1] = b12;
        bArr[i12 + 2] = b13;
        bArr[i12 + 3] = b14;
        this.f1534b = i12 + 4;
    }

    public void e(h hVar) {
        h(hVar.f1533a, 0, hVar.f1534b);
    }

    public boolean equals(Object obj) {
        int i11;
        if (obj == this) {
            return true;
        }
        if (!this.f1535c || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!hVar.f1535c || (i11 = this.f1534b) != hVar.f1534b) {
            return false;
        }
        byte[] bArr = this.f1533a;
        byte[] bArr2 = hVar.f1533a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12] != bArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    public void f(h hVar, int i11, int i12) {
        if (i11 + i12 <= hVar.f1534b) {
            h(hVar.f1533a, i11, i12);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i11 + " + " + i12 + " <= " + hVar.f1534b);
    }

    public void g(byte... bArr) {
        h(bArr, 0, bArr.length);
    }

    public void h(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = this.f1533a;
        int i13 = this.f1534b + i12;
        if (i13 > bArr2.length) {
            bArr2 = E(Math.max(Math.max(8, i13), (int) (this.f1534b * 1.75f)));
        }
        System.arraycopy(bArr, i11, bArr2, this.f1534b, i12);
        this.f1534b += i12;
    }

    public int hashCode() {
        if (!this.f1535c) {
            return super.hashCode();
        }
        byte[] bArr = this.f1533a;
        int i11 = this.f1534b;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + bArr[i13];
        }
        return i12;
    }

    public void i() {
        this.f1534b = 0;
    }

    public boolean j(byte b11) {
        int i11 = this.f1534b - 1;
        byte[] bArr = this.f1533a;
        while (i11 >= 0) {
            int i12 = i11 - 1;
            if (bArr[i11] == b11) {
                return true;
            }
            i11 = i12;
        }
        return false;
    }

    public byte[] k(int i11) {
        if (i11 >= 0) {
            int i12 = this.f1534b + i11;
            if (i12 > this.f1533a.length) {
                E(Math.max(Math.max(8, i12), (int) (this.f1534b * 1.75f)));
            }
            return this.f1533a;
        }
        throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i11);
    }

    public byte l() {
        if (this.f1534b != 0) {
            return this.f1533a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public byte m(int i11) {
        if (i11 < this.f1534b) {
            return this.f1533a[i11];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1534b);
    }

    public void n(byte b11) {
        byte[] bArr = this.f1533a;
        int i11 = this.f1534b;
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) (bArr[i12] + b11);
        }
    }

    public void o(int i11, byte b11) {
        if (i11 < this.f1534b) {
            byte[] bArr = this.f1533a;
            bArr[i11] = (byte) (bArr[i11] + b11);
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1534b);
    }

    public int p(byte b11) {
        byte[] bArr = this.f1533a;
        int i11 = this.f1534b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12] == b11) {
                return i12;
            }
        }
        return -1;
    }

    public void q(int i11, byte b11) {
        int i12 = this.f1534b;
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1534b);
        }
        byte[] bArr = this.f1533a;
        if (i12 == bArr.length) {
            bArr = E(Math.max(8, (int) (i12 * 1.75f)));
        }
        if (this.f1535c) {
            System.arraycopy(bArr, i11, bArr, i11 + 1, this.f1534b - i11);
        } else {
            bArr[this.f1534b] = bArr[i11];
        }
        this.f1534b++;
        bArr[i11] = b11;
    }

    public void r(int i11, int i12) {
        int i13 = this.f1534b;
        if (i11 > i13) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1534b);
        }
        int i14 = i13 + i12;
        if (i14 > this.f1533a.length) {
            this.f1533a = E(Math.max(Math.max(8, i14), (int) (this.f1534b * 1.75f)));
        }
        byte[] bArr = this.f1533a;
        System.arraycopy(bArr, i11, bArr, i12 + i11, this.f1534b - i11);
        this.f1534b = i14;
    }

    public boolean s() {
        return this.f1534b == 0;
    }

    public int t(byte b11) {
        byte[] bArr = this.f1533a;
        for (int i11 = this.f1534b - 1; i11 >= 0; i11--) {
            if (bArr[i11] == b11) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        if (this.f1534b == 0) {
            return okhttp3.i.f77289p;
        }
        byte[] bArr = this.f1533a;
        y0 y0Var = new y0(32);
        y0Var.append('[');
        y0Var.D(bArr[0]);
        for (int i11 = 1; i11 < this.f1534b; i11++) {
            y0Var.O(j2.O);
            y0Var.D(bArr[i11]);
        }
        y0Var.append(l50.b.f69930l);
        return y0Var.toString();
    }

    public void u(byte b11) {
        byte[] bArr = this.f1533a;
        int i11 = this.f1534b;
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) (bArr[i12] * b11);
        }
    }

    public void v(int i11, byte b11) {
        if (i11 < this.f1534b) {
            byte[] bArr = this.f1533a;
            bArr[i11] = (byte) (bArr[i11] * b11);
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1534b);
    }

    public boolean w() {
        return this.f1534b > 0;
    }

    public byte x() {
        return this.f1533a[this.f1534b - 1];
    }

    public byte y() {
        byte[] bArr = this.f1533a;
        int i11 = this.f1534b - 1;
        this.f1534b = i11;
        return bArr[i11];
    }

    public byte z() {
        int i11 = this.f1534b;
        if (i11 == 0) {
            return (byte) 0;
        }
        return this.f1533a[com.badlogic.gdx.math.n.N(0, i11 - 1)];
    }

    public h(int i11) {
        this(true, i11);
    }

    public h(boolean z11, int i11) {
        this.f1535c = z11;
        this.f1533a = new byte[i11];
    }

    public h(h hVar) {
        this.f1535c = hVar.f1535c;
        int i11 = hVar.f1534b;
        this.f1534b = i11;
        byte[] bArr = new byte[i11];
        this.f1533a = bArr;
        System.arraycopy(hVar.f1533a, 0, bArr, 0, i11);
    }

    public h(byte[] bArr) {
        this(true, bArr, 0, bArr.length);
    }

    public h(boolean z11, byte[] bArr, int i11, int i12) {
        this(z11, i12);
        this.f1534b = i12;
        System.arraycopy(bArr, i11, this.f1533a, 0, i12);
    }
}
