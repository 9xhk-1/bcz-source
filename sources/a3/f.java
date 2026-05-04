package a3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public long[] f1505a;

    public f() {
        this.f1505a = new long[]{0};
    }

    public void a(f fVar) {
        int min = Math.min(this.f1505a.length, fVar.f1505a.length);
        for (int i11 = 0; min > i11; i11++) {
            long[] jArr = this.f1505a;
            jArr[i11] = jArr[i11] & fVar.f1505a[i11];
        }
        long[] jArr2 = this.f1505a;
        if (jArr2.length > min) {
            int length = jArr2.length;
            while (length > min) {
                this.f1505a[min] = 0;
                min++;
            }
        }
    }

    public void b(f fVar) {
        int length = this.f1505a.length;
        int length2 = fVar.f1505a.length;
        for (int i11 = 0; i11 < length && i11 < length2; i11++) {
            long[] jArr = this.f1505a;
            jArr[i11] = jArr[i11] & (~fVar.f1505a[i11]);
        }
    }

    public final void c(int i11) {
        long[] jArr = this.f1505a;
        if (i11 >= jArr.length) {
            long[] jArr2 = new long[i11 + 1];
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            this.f1505a = jArr2;
        }
    }

    public void d() {
        Arrays.fill(this.f1505a, 0L);
    }

    public void e(int i11) {
        int i12 = i11 >>> 6;
        long[] jArr = this.f1505a;
        if (i12 >= jArr.length) {
            return;
        }
        jArr[i12] = jArr[i12] & (~(1 << (i11 & 63)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        long[] jArr = fVar.f1505a;
        int min = Math.min(this.f1505a.length, jArr.length);
        for (int i11 = 0; min > i11; i11++) {
            if (this.f1505a[i11] != jArr[i11]) {
                return false;
            }
        }
        return this.f1505a.length == jArr.length || m() == fVar.m();
    }

    public boolean f(f fVar) {
        long[] jArr = this.f1505a;
        long[] jArr2 = fVar.f1505a;
        int length = jArr2.length;
        int length2 = jArr.length;
        for (int i11 = length2; i11 < length; i11++) {
            if (jArr2[i11] != 0) {
                return false;
            }
        }
        for (int min = Math.min(length2, length) - 1; min >= 0; min--) {
            long j11 = jArr[min];
            long j12 = jArr2[min];
            if ((j11 & j12) != j12) {
                return false;
            }
        }
        return true;
    }

    public void g(int i11) {
        int i12 = i11 >>> 6;
        c(i12);
        long[] jArr = this.f1505a;
        jArr[i12] = jArr[i12] ^ (1 << (i11 & 63));
    }

    public boolean h(int i11) {
        int i12 = i11 >>> 6;
        long[] jArr = this.f1505a;
        return i12 < jArr.length && (jArr[i12] & (1 << (i11 & 63))) != 0;
    }

    public int hashCode() {
        int m11 = m() >>> 6;
        int i11 = 0;
        for (int i12 = 0; m11 >= i12; i12++) {
            long j11 = this.f1505a[i12];
            i11 = (i11 * 127) + ((int) (j11 ^ (j11 >>> 32)));
        }
        return i11;
    }

    public boolean i(int i11) {
        int i12 = i11 >>> 6;
        long[] jArr = this.f1505a;
        if (i12 >= jArr.length) {
            return false;
        }
        long j11 = jArr[i12];
        long j12 = (~(1 << (i11 & 63))) & j11;
        jArr[i12] = j12;
        return j12 != j11;
    }

    public boolean j(int i11) {
        int i12 = i11 >>> 6;
        c(i12);
        long[] jArr = this.f1505a;
        long j11 = jArr[i12];
        long j12 = (1 << (i11 & 63)) | j11;
        jArr[i12] = j12;
        return j12 == j11;
    }

    public boolean k(f fVar) {
        long[] jArr = this.f1505a;
        long[] jArr2 = fVar.f1505a;
        for (int min = Math.min(jArr.length, jArr2.length) - 1; min >= 0; min--) {
            if ((jArr[min] & jArr2[min]) != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        for (long j11 : this.f1505a) {
            if (j11 != 0) {
                return false;
            }
        }
        return true;
    }

    public int m() {
        long[] jArr = this.f1505a;
        for (int length = jArr.length - 1; length >= 0; length--) {
            long j11 = jArr[length];
            if (j11 != 0) {
                for (int i11 = 63; i11 >= 0; i11--) {
                    if (((1 << (i11 & 63)) & j11) != 0) {
                        return (length << 6) + i11 + 1;
                    }
                }
            }
        }
        return 0;
    }

    public int n(int i11) {
        int length;
        long[] jArr = this.f1505a;
        int i12 = i11 >>> 6;
        int length2 = jArr.length;
        if (i12 < length2) {
            long j11 = jArr[i12];
            int i13 = i11 & 63;
            while (true) {
                if (i13 >= 64) {
                    loop1: while (true) {
                        i12++;
                        if (i12 >= length2) {
                            length = jArr.length;
                            break;
                        }
                        if (i12 == 0) {
                            return i12 << 6;
                        }
                        long j12 = jArr[i12];
                        i13 = 0;
                        while (i13 < 64) {
                            if (((1 << (i13 & 63)) & j12) == 0) {
                                break loop1;
                            }
                            i13++;
                        }
                    }
                } else {
                    if (((1 << (i13 & 63)) & j11) == 0) {
                        break;
                    }
                    i13++;
                }
            }
            return (i12 << 6) + i13;
        }
        length = jArr.length;
        return length << 6;
    }

    public int o(int i11) {
        int i12;
        long[] jArr = this.f1505a;
        int i13 = i11 >>> 6;
        int length = jArr.length;
        if (i13 >= length) {
            return -1;
        }
        long j11 = jArr[i13];
        if (j11 != 0) {
            i12 = i11 & 63;
            while (i12 < 64) {
                if (((1 << (i12 & 63)) & j11) != 0) {
                    break;
                }
                i12++;
            }
        }
        loop1: while (true) {
            i13++;
            if (i13 >= length) {
                return -1;
            }
            if (i13 != 0) {
                long j12 = jArr[i13];
                if (j12 != 0) {
                    i12 = 0;
                    while (i12 < 64) {
                        if (((1 << (i12 & 63)) & j12) != 0) {
                            break loop1;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            }
        }
        return (i13 << 6) + i12;
    }

    public boolean p() {
        return !l();
    }

    public int q() {
        return this.f1505a.length << 6;
    }

    public void r(f fVar) {
        int min = Math.min(this.f1505a.length, fVar.f1505a.length);
        for (int i11 = 0; min > i11; i11++) {
            long[] jArr = this.f1505a;
            jArr[i11] = jArr[i11] | fVar.f1505a[i11];
        }
        long[] jArr2 = fVar.f1505a;
        if (min < jArr2.length) {
            c(jArr2.length);
            int length = fVar.f1505a.length;
            while (length > min) {
                this.f1505a[min] = fVar.f1505a[min];
                min++;
            }
        }
    }

    public void s(int i11) {
        int i12 = i11 >>> 6;
        c(i12);
        long[] jArr = this.f1505a;
        jArr[i12] = jArr[i12] | (1 << (i11 & 63));
    }

    public void t(f fVar) {
        int min = Math.min(this.f1505a.length, fVar.f1505a.length);
        for (int i11 = 0; min > i11; i11++) {
            long[] jArr = this.f1505a;
            jArr[i11] = jArr[i11] ^ fVar.f1505a[i11];
        }
        long[] jArr2 = fVar.f1505a;
        if (min < jArr2.length) {
            c(jArr2.length);
            int length = fVar.f1505a.length;
            while (length > min) {
                this.f1505a[min] = fVar.f1505a[min];
                min++;
            }
        }
    }

    public f(int i11) {
        this.f1505a = new long[]{0};
        c(i11 >>> 6);
    }

    public f(f fVar) {
        this.f1505a = new long[]{0};
        long[] jArr = new long[fVar.f1505a.length];
        this.f1505a = jArr;
        long[] jArr2 = fVar.f1505a;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
    }
}
