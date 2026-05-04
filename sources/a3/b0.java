package a3;

import java.util.Arrays;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f1458a;

    /* renamed from: b, reason: collision with root package name */
    public int f1459b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1460c;

    public b0() {
        this(true, 16);
    }

    public static b0 P(long... jArr) {
        return new b0(jArr);
    }

    public boolean A(b0 b0Var) {
        int i11 = this.f1459b;
        long[] jArr = this.f1458a;
        int i12 = b0Var.f1459b;
        int i13 = i11;
        for (int i14 = 0; i14 < i12; i14++) {
            long m11 = b0Var.m(i14);
            int i15 = 0;
            while (true) {
                if (i15 >= i13) {
                    break;
                }
                if (m11 == jArr[i15]) {
                    B(i15);
                    i13--;
                    break;
                }
                i15++;
            }
        }
        return i13 != i11;
    }

    public long B(int i11) {
        int i12 = this.f1459b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1459b);
        }
        long[] jArr = this.f1458a;
        long j11 = jArr[i11];
        int i13 = i12 - 1;
        this.f1459b = i13;
        if (this.f1460c) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, i13 - i11);
            return j11;
        }
        jArr[i11] = jArr[i13];
        return j11;
    }

    public void C(int i11, int i12) {
        int i13 = this.f1459b;
        if (i12 >= i13) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i12 + " >= " + this.f1459b);
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i11 + " > " + i12);
        }
        int i14 = (i12 - i11) + 1;
        int i15 = i13 - i14;
        if (this.f1460c) {
            long[] jArr = this.f1458a;
            int i16 = i14 + i11;
            System.arraycopy(jArr, i16, jArr, i11, i13 - i16);
        } else {
            int max = Math.max(i15, i12 + 1);
            long[] jArr2 = this.f1458a;
            System.arraycopy(jArr2, max, jArr2, i11, i13 - max);
        }
        this.f1459b = i15;
    }

    public boolean D(long j11) {
        long[] jArr = this.f1458a;
        int i11 = this.f1459b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (jArr[i12] == j11) {
                B(i12);
                return true;
            }
        }
        return false;
    }

    public long[] E(int i11) {
        long[] jArr = new long[i11];
        System.arraycopy(this.f1458a, 0, jArr, 0, Math.min(this.f1459b, i11));
        this.f1458a = jArr;
        return jArr;
    }

    public void F() {
        long[] jArr = this.f1458a;
        int i11 = this.f1459b;
        int i12 = i11 - 1;
        int i13 = i11 / 2;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i12 - i14;
            long j11 = jArr[i14];
            jArr[i14] = jArr[i15];
            jArr[i15] = j11;
        }
    }

    public void G(int i11, long j11) {
        if (i11 < this.f1459b) {
            this.f1458a[i11] = j11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1459b);
    }

    public long[] H(int i11) {
        if (i11 >= 0) {
            if (i11 > this.f1458a.length) {
                E(Math.max(8, i11));
            }
            this.f1459b = i11;
            return this.f1458a;
        }
        throw new IllegalArgumentException("newSize must be >= 0: " + i11);
    }

    public long[] I() {
        int length = this.f1458a.length;
        int i11 = this.f1459b;
        if (length != i11) {
            E(i11);
        }
        return this.f1458a;
    }

    public void J() {
        long[] jArr = this.f1458a;
        for (int i11 = this.f1459b - 1; i11 >= 0; i11--) {
            int M = com.badlogic.gdx.math.n.M(i11);
            long j11 = jArr[i11];
            jArr[i11] = jArr[M];
            jArr[M] = j11;
        }
    }

    public void K() {
        Arrays.sort(this.f1458a, 0, this.f1459b);
    }

    public void L(int i11, int i12) {
        int i13 = this.f1459b;
        if (i11 >= i13) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i11 + " >= " + this.f1459b);
        }
        if (i12 < i13) {
            long[] jArr = this.f1458a;
            long j11 = jArr[i11];
            jArr[i11] = jArr[i12];
            jArr[i12] = j11;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i12 + " >= " + this.f1459b);
    }

    public long[] M() {
        int i11 = this.f1459b;
        long[] jArr = new long[i11];
        System.arraycopy(this.f1458a, 0, jArr, 0, i11);
        return jArr;
    }

    public String N(String str) {
        if (this.f1459b == 0) {
            return "";
        }
        long[] jArr = this.f1458a;
        y0 y0Var = new y0(32);
        y0Var.G(jArr[0]);
        for (int i11 = 1; i11 < this.f1459b; i11++) {
            y0Var.O(str);
            y0Var.G(jArr[i11]);
        }
        return y0Var.toString();
    }

    public void O(int i11) {
        if (this.f1459b > i11) {
            this.f1459b = i11;
        }
    }

    public void a(long j11) {
        long[] jArr = this.f1458a;
        int i11 = this.f1459b;
        if (i11 == jArr.length) {
            jArr = E(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1459b;
        this.f1459b = i12 + 1;
        jArr[i12] = j11;
    }

    public void b(long j11, long j12) {
        long[] jArr = this.f1458a;
        int i11 = this.f1459b;
        if (i11 + 1 >= jArr.length) {
            jArr = E(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1459b;
        jArr[i12] = j11;
        jArr[i12 + 1] = j12;
        this.f1459b = i12 + 2;
    }

    public void c(long j11, long j12, long j13) {
        long[] jArr = this.f1458a;
        int i11 = this.f1459b;
        if (i11 + 2 >= jArr.length) {
            jArr = E(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f1459b;
        jArr[i12] = j11;
        jArr[i12 + 1] = j12;
        jArr[i12 + 2] = j13;
        this.f1459b = i12 + 3;
    }

    public void d(long j11, long j12, long j13, long j14) {
        long[] jArr = this.f1458a;
        int i11 = this.f1459b;
        if (i11 + 3 >= jArr.length) {
            jArr = E(Math.max(8, (int) (i11 * 1.8f)));
        }
        int i12 = this.f1459b;
        jArr[i12] = j11;
        jArr[i12 + 1] = j12;
        jArr[i12 + 2] = j13;
        jArr[i12 + 3] = j14;
        this.f1459b = i12 + 4;
    }

    public void e(b0 b0Var) {
        h(b0Var.f1458a, 0, b0Var.f1459b);
    }

    public boolean equals(Object obj) {
        int i11;
        if (obj == this) {
            return true;
        }
        if (!this.f1460c || !(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (!b0Var.f1460c || (i11 = this.f1459b) != b0Var.f1459b) {
            return false;
        }
        long[] jArr = this.f1458a;
        long[] jArr2 = b0Var.f1458a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (jArr[i12] != jArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    public void f(b0 b0Var, int i11, int i12) {
        if (i11 + i12 <= b0Var.f1459b) {
            h(b0Var.f1458a, i11, i12);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i11 + " + " + i12 + " <= " + b0Var.f1459b);
    }

    public void g(long... jArr) {
        h(jArr, 0, jArr.length);
    }

    public void h(long[] jArr, int i11, int i12) {
        long[] jArr2 = this.f1458a;
        int i13 = this.f1459b + i12;
        if (i13 > jArr2.length) {
            jArr2 = E(Math.max(Math.max(8, i13), (int) (this.f1459b * 1.75f)));
        }
        System.arraycopy(jArr, i11, jArr2, this.f1459b, i12);
        this.f1459b += i12;
    }

    public int hashCode() {
        if (!this.f1460c) {
            return super.hashCode();
        }
        long[] jArr = this.f1458a;
        int i11 = this.f1459b;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = jArr[i13];
            i12 = (i12 * 31) + ((int) (j11 ^ (j11 >>> 32)));
        }
        return i12;
    }

    public void i() {
        this.f1459b = 0;
    }

    public boolean j(long j11) {
        int i11 = this.f1459b - 1;
        long[] jArr = this.f1458a;
        while (i11 >= 0) {
            int i12 = i11 - 1;
            if (jArr[i11] == j11) {
                return true;
            }
            i11 = i12;
        }
        return false;
    }

    public long[] k(int i11) {
        if (i11 >= 0) {
            int i12 = this.f1459b + i11;
            if (i12 > this.f1458a.length) {
                E(Math.max(Math.max(8, i12), (int) (this.f1459b * 1.75f)));
            }
            return this.f1458a;
        }
        throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i11);
    }

    public long l() {
        if (this.f1459b != 0) {
            return this.f1458a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public long m(int i11) {
        if (i11 < this.f1459b) {
            return this.f1458a[i11];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1459b);
    }

    public void n(int i11, long j11) {
        if (i11 < this.f1459b) {
            long[] jArr = this.f1458a;
            jArr[i11] = jArr[i11] + j11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1459b);
    }

    public void o(long j11) {
        long[] jArr = this.f1458a;
        int i11 = this.f1459b;
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i12] = jArr[i12] + j11;
        }
    }

    public int p(long j11) {
        long[] jArr = this.f1458a;
        int i11 = this.f1459b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (jArr[i12] == j11) {
                return i12;
            }
        }
        return -1;
    }

    public void q(int i11, long j11) {
        int i12 = this.f1459b;
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1459b);
        }
        long[] jArr = this.f1458a;
        if (i12 == jArr.length) {
            jArr = E(Math.max(8, (int) (i12 * 1.75f)));
        }
        if (this.f1460c) {
            System.arraycopy(jArr, i11, jArr, i11 + 1, this.f1459b - i11);
        } else {
            jArr[this.f1459b] = jArr[i11];
        }
        this.f1459b++;
        jArr[i11] = j11;
    }

    public void r(int i11, int i12) {
        int i13 = this.f1459b;
        if (i11 > i13) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f1459b);
        }
        int i14 = i13 + i12;
        if (i14 > this.f1458a.length) {
            this.f1458a = E(Math.max(Math.max(8, i14), (int) (this.f1459b * 1.75f)));
        }
        long[] jArr = this.f1458a;
        System.arraycopy(jArr, i11, jArr, i12 + i11, this.f1459b - i11);
        this.f1459b = i14;
    }

    public boolean s() {
        return this.f1459b == 0;
    }

    public int t(long j11) {
        long[] jArr = this.f1458a;
        for (int i11 = this.f1459b - 1; i11 >= 0; i11--) {
            if (jArr[i11] == j11) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        if (this.f1459b == 0) {
            return okhttp3.i.f77289p;
        }
        long[] jArr = this.f1458a;
        y0 y0Var = new y0(32);
        y0Var.append('[');
        y0Var.G(jArr[0]);
        for (int i11 = 1; i11 < this.f1459b; i11++) {
            y0Var.O(j2.O);
            y0Var.G(jArr[i11]);
        }
        y0Var.append(l50.b.f69930l);
        return y0Var.toString();
    }

    public void u(int i11, long j11) {
        if (i11 < this.f1459b) {
            long[] jArr = this.f1458a;
            jArr[i11] = jArr[i11] * j11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1459b);
    }

    public void v(long j11) {
        long[] jArr = this.f1458a;
        int i11 = this.f1459b;
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i12] = jArr[i12] * j11;
        }
    }

    public boolean w() {
        return this.f1459b > 0;
    }

    public long x() {
        int i11 = this.f1459b;
        if (i11 > 0) {
            return this.f1458a[i11 - 1];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public long y() {
        int i11 = this.f1459b;
        if (i11 <= 0) {
            throw new IllegalStateException("Array is empty.");
        }
        long[] jArr = this.f1458a;
        int i12 = i11 - 1;
        this.f1459b = i12;
        return jArr[i12];
    }

    public long z() {
        int i11 = this.f1459b;
        if (i11 == 0) {
            return 0L;
        }
        return this.f1458a[com.badlogic.gdx.math.n.N(0, i11 - 1)];
    }

    public b0(int i11) {
        this(true, i11);
    }

    public b0(boolean z11, int i11) {
        this.f1460c = z11;
        this.f1458a = new long[i11];
    }

    public b0(b0 b0Var) {
        this.f1460c = b0Var.f1460c;
        int i11 = b0Var.f1459b;
        this.f1459b = i11;
        long[] jArr = new long[i11];
        this.f1458a = jArr;
        System.arraycopy(b0Var.f1458a, 0, jArr, 0, i11);
    }

    public b0(long[] jArr) {
        this(true, jArr, 0, jArr.length);
    }

    public b0(boolean z11, long[] jArr, int i11, int i12) {
        this(z11, i12);
        this.f1459b = i12;
        System.arraycopy(jArr, i11, this.f1458a, 0, i12);
    }
}
