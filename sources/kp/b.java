package kp;

import com.bumptech.glide.load.engine.GlideException;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final int f68539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68540b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68541c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f68542d;

    public b(int i11) {
        this(i11, i11);
    }

    public static b n(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        boolean[] zArr = new boolean[str.length()];
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i12 < str.length()) {
            if (str.charAt(i12) == '\n' || str.charAt(i12) == '\r') {
                if (i13 > i14) {
                    if (i11 == -1) {
                        i11 = i13 - i14;
                    } else if (i13 - i14 != i11) {
                        throw new IllegalArgumentException("row lengths do not match");
                    }
                    i15++;
                    i14 = i13;
                }
                i12++;
            } else {
                if (str.substring(i12, str2.length() + i12).equals(str2)) {
                    i12 += str2.length();
                    zArr[i13] = true;
                } else {
                    if (!str.substring(i12, str3.length() + i12).equals(str3)) {
                        throw new IllegalArgumentException("illegal character encountered: " + str.substring(i12));
                    }
                    i12 += str3.length();
                    zArr[i13] = false;
                }
                i13++;
            }
        }
        if (i13 > i14) {
            if (i11 == -1) {
                i11 = i13 - i14;
            } else if (i13 - i14 != i11) {
                throw new IllegalArgumentException("row lengths do not match");
            }
            i15++;
        }
        b bVar = new b(i11, i15);
        for (int i16 = 0; i16 < i13; i16++) {
            if (zArr[i16]) {
                bVar.q(i16 % i11, i16 / i11);
            }
        }
        return bVar;
    }

    public static b o(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        b bVar = new b(length2, length);
        for (int i11 = 0; i11 < length; i11++) {
            boolean[] zArr2 = zArr[i11];
            for (int i12 = 0; i12 < length2; i12++) {
                if (zArr2[i12]) {
                    bVar.q(i12, i11);
                }
            }
        }
        return bVar;
    }

    public final String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f68540b * (this.f68539a + 1));
        for (int i11 = 0; i11 < this.f68540b; i11++) {
            for (int i12 = 0; i12 < this.f68539a; i12++) {
                sb2.append(e(i12, i11) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public void b() {
        int length = this.f68542d.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f68542d[i11] = 0;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f68539a, this.f68540b, this.f68541c, (int[]) this.f68542d.clone());
    }

    public void d(int i11, int i12) {
        int i13 = (i12 * this.f68541c) + (i11 / 32);
        int[] iArr = this.f68542d;
        iArr[i13] = (1 << (i11 & 31)) ^ iArr[i13];
    }

    public boolean e(int i11, int i12) {
        return ((this.f68542d[(i12 * this.f68541c) + (i11 / 32)] >>> (i11 & 31)) & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f68539a == bVar.f68539a && this.f68540b == bVar.f68540b && this.f68541c == bVar.f68541c && Arrays.equals(this.f68542d, bVar.f68542d);
    }

    public int[] f() {
        int length = this.f68542d.length - 1;
        while (length >= 0 && this.f68542d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i11 = this.f68541c;
        int i12 = length / i11;
        int i13 = (length % i11) << 5;
        int i14 = 31;
        while ((this.f68542d[length] >>> i14) == 0) {
            i14--;
        }
        return new int[]{i13 + i14, i12};
    }

    public int[] g() {
        int i11 = this.f68539a;
        int i12 = this.f68540b;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < this.f68540b; i15++) {
            int i16 = 0;
            while (true) {
                int i17 = this.f68541c;
                if (i16 < i17) {
                    int i18 = this.f68542d[(i17 * i15) + i16];
                    if (i18 != 0) {
                        if (i15 < i12) {
                            i12 = i15;
                        }
                        if (i15 > i14) {
                            i14 = i15;
                        }
                        int i19 = i16 << 5;
                        if (i19 < i11) {
                            int i21 = 0;
                            while ((i18 << (31 - i21)) == 0) {
                                i21++;
                            }
                            int i22 = i21 + i19;
                            if (i22 < i11) {
                                i11 = i22;
                            }
                        }
                        if (i19 + 31 > i13) {
                            int i23 = 31;
                            while ((i18 >>> i23) == 0) {
                                i23--;
                            }
                            int i24 = i19 + i23;
                            if (i24 > i13) {
                                i13 = i24;
                            }
                        }
                    }
                    i16++;
                }
            }
        }
        if (i13 < i11 || i14 < i12) {
            return null;
        }
        return new int[]{i11, i12, (i13 - i11) + 1, (i14 - i12) + 1};
    }

    public int h() {
        return this.f68540b;
    }

    public int hashCode() {
        int i11 = this.f68539a;
        return (((((((i11 * 31) + i11) * 31) + this.f68540b) * 31) + this.f68541c) * 31) + Arrays.hashCode(this.f68542d);
    }

    public a i(int i11, a aVar) {
        if (aVar == null || aVar.m() < this.f68539a) {
            aVar = new a(this.f68539a);
        } else {
            aVar.d();
        }
        int i12 = i11 * this.f68541c;
        for (int i13 = 0; i13 < this.f68541c; i13++) {
            aVar.t(i13 << 5, this.f68542d[i12 + i13]);
        }
        return aVar;
    }

    public int j() {
        return this.f68541c;
    }

    public int[] l() {
        int[] iArr;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            iArr = this.f68542d;
            if (i12 >= iArr.length || iArr[i12] != 0) {
                break;
            }
            i12++;
        }
        if (i12 == iArr.length) {
            return null;
        }
        int i13 = this.f68541c;
        int i14 = i12 / i13;
        int i15 = (i12 % i13) << 5;
        while ((iArr[i12] << (31 - i11)) == 0) {
            i11++;
        }
        return new int[]{i15 + i11, i14};
    }

    public int m() {
        return this.f68539a;
    }

    public void p() {
        int m11 = m();
        int h11 = h();
        a aVar = new a(m11);
        a aVar2 = new a(m11);
        for (int i11 = 0; i11 < (h11 + 1) / 2; i11++) {
            aVar = i(i11, aVar);
            int i12 = (h11 - 1) - i11;
            aVar2 = i(i12, aVar2);
            aVar.q();
            aVar2.q();
            t(i11, aVar2);
            t(i12, aVar);
        }
    }

    public void q(int i11, int i12) {
        int i13 = (i12 * this.f68541c) + (i11 / 32);
        int[] iArr = this.f68542d;
        iArr[i13] = (1 << (i11 & 31)) | iArr[i13];
    }

    public void s(int i11, int i12, int i13, int i14) {
        if (i12 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i14 <= 0 || i13 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i15 = i13 + i11;
        int i16 = i14 + i12;
        if (i16 > this.f68540b || i15 > this.f68539a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i12 < i16) {
            int i17 = this.f68541c * i12;
            for (int i18 = i11; i18 < i15; i18++) {
                int[] iArr = this.f68542d;
                int i19 = (i18 / 32) + i17;
                iArr[i19] = iArr[i19] | (1 << (i18 & 31));
            }
            i12++;
        }
    }

    public void t(int i11, a aVar) {
        int[] i12 = aVar.i();
        int[] iArr = this.f68542d;
        int i13 = this.f68541c;
        System.arraycopy(i12, 0, iArr, i11 * i13, i13);
    }

    public String toString() {
        return u("X ", GlideException.a.f28776d);
    }

    public String u(String str, String str2) {
        return a(str, str2, "\n");
    }

    @Deprecated
    public String v(String str, String str2, String str3) {
        return a(str, str2, str3);
    }

    public void w(int i11, int i12) {
        int i13 = (i12 * this.f68541c) + (i11 / 32);
        int[] iArr = this.f68542d;
        iArr[i13] = (~(1 << (i11 & 31))) & iArr[i13];
    }

    public void x(b bVar) {
        if (this.f68539a != bVar.m() || this.f68540b != bVar.h() || this.f68541c != bVar.j()) {
            throw new IllegalArgumentException("input matrix dimensions do not match");
        }
        a aVar = new a(this.f68539a);
        for (int i11 = 0; i11 < this.f68540b; i11++) {
            int i12 = this.f68541c * i11;
            int[] i13 = bVar.i(i11, aVar).i();
            for (int i14 = 0; i14 < this.f68541c; i14++) {
                int[] iArr = this.f68542d;
                int i15 = i12 + i14;
                iArr[i15] = iArr[i15] ^ i13[i14];
            }
        }
    }

    public b(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f68539a = i11;
        this.f68540b = i12;
        int i13 = (i11 + 31) / 32;
        this.f68541c = i13;
        this.f68542d = new int[i13 * i12];
    }

    public b(int i11, int i12, int i13, int[] iArr) {
        this.f68539a = i11;
        this.f68540b = i12;
        this.f68541c = i13;
        this.f68542d = iArr;
    }
}
