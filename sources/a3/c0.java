package a3;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f1467a;

    /* renamed from: b, reason: collision with root package name */
    public int f1468b;

    /* renamed from: c, reason: collision with root package name */
    public int f1469c;

    /* renamed from: d, reason: collision with root package name */
    public int f1470d;

    public c0() {
        this(16);
    }

    public void a(long j11) {
        long[] jArr = this.f1467a;
        if (this.f1470d == jArr.length) {
            o(jArr.length << 1);
            jArr = this.f1467a;
        }
        int i11 = this.f1468b - 1;
        if (i11 == -1) {
            i11 = jArr.length - 1;
        }
        jArr[i11] = j11;
        this.f1468b = i11;
        this.f1470d++;
    }

    public void b(long j11) {
        long[] jArr = this.f1467a;
        if (this.f1470d == jArr.length) {
            o(jArr.length << 1);
            jArr = this.f1467a;
        }
        int i11 = this.f1469c;
        int i12 = i11 + 1;
        this.f1469c = i12;
        jArr[i11] = j11;
        if (i12 == jArr.length) {
            this.f1469c = 0;
        }
        this.f1470d++;
    }

    public void c() {
        if (this.f1470d == 0) {
            return;
        }
        this.f1468b = 0;
        this.f1469c = 0;
        this.f1470d = 0;
    }

    public void d(int i11) {
        int i12 = this.f1470d + i11;
        if (this.f1467a.length < i12) {
            o(i12);
        }
    }

    public long e() {
        if (this.f1470d != 0) {
            return this.f1467a[this.f1468b];
        }
        throw new NoSuchElementException("Queue is empty.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i11 = this.f1470d;
        if (c0Var.f1470d != i11) {
            return false;
        }
        long[] jArr = this.f1467a;
        int length = jArr.length;
        long[] jArr2 = c0Var.f1467a;
        int length2 = jArr2.length;
        int i12 = this.f1468b;
        int i13 = c0Var.f1468b;
        for (int i14 = 0; i14 < i11; i14++) {
            if (jArr[i12] != jArr2[i13]) {
                return false;
            }
            i12++;
            i13++;
            if (i12 == length) {
                i12 = 0;
            }
            if (i13 == length2) {
                i13 = 0;
            }
        }
        return true;
    }

    public long f(int i11) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("index can't be < 0: " + i11);
        }
        if (i11 < this.f1470d) {
            long[] jArr = this.f1467a;
            int i12 = this.f1468b + i11;
            if (i12 >= jArr.length) {
                i12 -= jArr.length;
            }
            return jArr[i12];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1470d);
    }

    public int g(long j11) {
        if (this.f1470d == 0) {
            return -1;
        }
        long[] jArr = this.f1467a;
        int i11 = this.f1468b;
        int i12 = this.f1469c;
        if (i11 < i12) {
            for (int i13 = i11; i13 < i12; i13++) {
                if (jArr[i13] == j11) {
                    return i13 - i11;
                }
            }
        } else {
            int length = jArr.length;
            for (int i14 = i11; i14 < length; i14++) {
                if (jArr[i14] == j11) {
                    return i14 - i11;
                }
            }
            for (int i15 = 0; i15 < i12; i15++) {
                if (jArr[i15] == j11) {
                    return (i15 + jArr.length) - i11;
                }
            }
        }
        return -1;
    }

    public boolean h() {
        return this.f1470d == 0;
    }

    public int hashCode() {
        int i11 = this.f1470d;
        long[] jArr = this.f1467a;
        int length = jArr.length;
        int i12 = this.f1468b;
        int i13 = i11 + 1;
        for (int i14 = 0; i14 < i11; i14++) {
            long j11 = jArr[i12];
            i13 += ((int) (j11 ^ (j11 >>> 32))) * 31;
            i12++;
            if (i12 == length) {
                i12 = 0;
            }
        }
        return i13;
    }

    public long i() {
        if (this.f1470d == 0) {
            throw new NoSuchElementException("Queue is empty.");
        }
        long[] jArr = this.f1467a;
        int i11 = this.f1469c - 1;
        if (i11 == -1) {
            i11 = jArr.length - 1;
        }
        return jArr[i11];
    }

    public boolean j() {
        return this.f1470d > 0;
    }

    public long k() {
        int i11 = this.f1470d;
        if (i11 == 0) {
            throw new NoSuchElementException("Queue is empty.");
        }
        long[] jArr = this.f1467a;
        int i12 = this.f1468b;
        long j11 = jArr[i12];
        int i13 = i12 + 1;
        this.f1468b = i13;
        if (i13 == jArr.length) {
            this.f1468b = 0;
        }
        this.f1470d = i11 - 1;
        return j11;
    }

    public long l(int i11) {
        long j11;
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("index can't be < 0: " + i11);
        }
        if (i11 >= this.f1470d) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1470d);
        }
        long[] jArr = this.f1467a;
        int i12 = this.f1468b;
        int i13 = this.f1469c;
        int i14 = i11 + i12;
        if (i12 < i13) {
            j11 = jArr[i14];
            System.arraycopy(jArr, i14 + 1, jArr, i14, i13 - i14);
            this.f1469c--;
        } else if (i14 >= jArr.length) {
            int length = i14 - jArr.length;
            j11 = jArr[length];
            System.arraycopy(jArr, length + 1, jArr, length, i13 - length);
            this.f1469c--;
        } else {
            j11 = jArr[i14];
            System.arraycopy(jArr, i12, jArr, i12 + 1, i14 - i12);
            int i15 = this.f1468b + 1;
            this.f1468b = i15;
            if (i15 == jArr.length) {
                this.f1468b = 0;
            }
        }
        this.f1470d--;
        return j11;
    }

    public long m() {
        int i11 = this.f1470d;
        if (i11 == 0) {
            throw new NoSuchElementException("Queue is empty.");
        }
        long[] jArr = this.f1467a;
        int i12 = this.f1469c - 1;
        if (i12 == -1) {
            i12 = jArr.length - 1;
        }
        long j11 = jArr[i12];
        this.f1469c = i12;
        this.f1470d = i11 - 1;
        return j11;
    }

    public boolean n(long j11) {
        int g11 = g(j11);
        if (g11 == -1) {
            return false;
        }
        l(g11);
        return true;
    }

    public void o(int i11) {
        long[] jArr = this.f1467a;
        int i12 = this.f1468b;
        int i13 = this.f1469c;
        long[] jArr2 = new long[i11];
        if (i12 < i13) {
            System.arraycopy(jArr, i12, jArr2, 0, i13 - i12);
        } else if (this.f1470d > 0) {
            int length = jArr.length - i12;
            System.arraycopy(jArr, i12, jArr2, 0, length);
            System.arraycopy(jArr, 0, jArr2, length, i13);
        }
        this.f1467a = jArr2;
        this.f1468b = 0;
        this.f1469c = this.f1470d;
    }

    public String p(String str) {
        if (this.f1470d == 0) {
            return "";
        }
        long[] jArr = this.f1467a;
        int i11 = this.f1468b;
        int i12 = this.f1469c;
        y0 y0Var = new y0(64);
        y0Var.G(jArr[i11]);
        while (true) {
            i11 = (i11 + 1) % jArr.length;
            if (i11 == i12) {
                return y0Var.toString();
            }
            y0Var.O(str).G(jArr[i11]);
        }
    }

    public String toString() {
        if (this.f1470d == 0) {
            return okhttp3.i.f77289p;
        }
        long[] jArr = this.f1467a;
        int i11 = this.f1468b;
        int i12 = this.f1469c;
        y0 y0Var = new y0(64);
        y0Var.append('[');
        y0Var.G(jArr[i11]);
        while (true) {
            i11 = (i11 + 1) % jArr.length;
            if (i11 == i12) {
                y0Var.append(l50.b.f69930l);
                return y0Var.toString();
            }
            y0Var.O(j2.O).G(jArr[i11]);
        }
    }

    public c0(int i11) {
        this.f1468b = 0;
        this.f1469c = 0;
        this.f1470d = 0;
        this.f1467a = new long[i11];
    }
}
