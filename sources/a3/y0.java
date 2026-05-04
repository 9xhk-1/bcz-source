package a3;

import androidx.media3.common.C;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.hms.framework.common.ExceptionCode;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class y0 implements Appendable, CharSequence {

    /* renamed from: c, reason: collision with root package name */
    public static final int f1725c = 16;

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f1726d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* renamed from: a, reason: collision with root package name */
    public char[] f1727a;

    /* renamed from: b, reason: collision with root package name */
    public int f1728b;

    public y0() {
        this.f1727a = new char[16];
    }

    public static int O0(int i11, int i12) {
        int i13 = i11 < 0 ? 2 : 1;
        while (true) {
            i11 /= i12;
            if (i11 == 0) {
                return i13;
            }
            i13++;
        }
    }

    public static int P0(long j11, int i11) {
        int i12 = j11 < 0 ? 2 : 1;
        while (true) {
            j11 /= i11;
            if (j11 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public y0 A0(int i11, Object obj) {
        H0(i11, obj == null ? "null" : obj.toString());
        return this;
    }

    public y0 B0(int i11, String str) {
        H0(i11, str);
        return this;
    }

    public y0 C0(int i11, boolean z11) {
        H0(i11, z11 ? n6.m.f74525c : "false");
        return this;
    }

    public y0 D(int i11) {
        return E(i11, 0);
    }

    public y0 D0(int i11, char[] cArr) {
        I0(i11, cArr);
        return this;
    }

    public y0 E(int i11, int i12) {
        return F(i11, i12, '0');
    }

    public y0 E0(int i11, char[] cArr, int i12, int i13) {
        J0(i11, cArr, i12, i13);
        return this;
    }

    public y0 F(int i11, int i12, char c11) {
        if (i11 == Integer.MIN_VALUE) {
            V("-2147483648");
            return this;
        }
        if (i11 < 0) {
            T('-');
            i11 = -i11;
        }
        if (i12 > 1) {
            for (int O0 = i12 - O0(i11, 10); O0 > 0; O0--) {
                append(c11);
            }
        }
        if (i11 >= 10000) {
            if (i11 >= 1000000000) {
                T(f1726d[(int) ((i11 % z50.f.f100989w) / C.NANOS_PER_SECOND)]);
            }
            if (i11 >= 100000000) {
                T(f1726d[(i11 % 1000000000) / 100000000]);
            }
            if (i11 >= 10000000) {
                T(f1726d[(i11 % 100000000) / ExceptionCode.CRASH_EXCEPTION]);
            }
            if (i11 >= 1000000) {
                T(f1726d[(i11 % ExceptionCode.CRASH_EXCEPTION) / 1000000]);
            }
            if (i11 >= 100000) {
                T(f1726d[(i11 % 1000000) / 100000]);
            }
            T(f1726d[(i11 % 100000) / 10000]);
        }
        if (i11 >= 1000) {
            T(f1726d[(i11 % 10000) / 1000]);
        }
        if (i11 >= 100) {
            T(f1726d[(i11 % 1000) / 100]);
        }
        if (i11 >= 10) {
            T(f1726d[(i11 % 100) / 10]);
        }
        T(f1726d[i11 % 10]);
        return this;
    }

    public final void F0(int i11, char c11) {
        if (i11 < 0 || i11 > this.f1728b) {
            throw new ArrayIndexOutOfBoundsException(i11);
        }
        M0(1, i11);
        this.f1727a[i11] = c11;
        this.f1728b++;
    }

    public y0 G(long j11) {
        return H(j11, 0);
    }

    public final void G0(int i11, CharSequence charSequence, int i12, int i13) {
        if (charSequence == null) {
            charSequence = "null";
        }
        if (i11 < 0 || i11 > this.f1728b || i12 < 0 || i13 < 0 || i12 > i13 || i13 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        H0(i11, charSequence.subSequence(i12, i13).toString());
    }

    public y0 H(long j11, int i11) {
        return I(j11, i11, '0');
    }

    public final void H0(int i11, String str) {
        if (i11 < 0 || i11 > this.f1728b) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        if (length != 0) {
            M0(length, i11);
            str.getChars(0, length, this.f1727a, i11);
            this.f1728b += length;
        }
    }

    public y0 I(long j11, int i11, char c11) {
        if (j11 == Long.MIN_VALUE) {
            V("-9223372036854775808");
            return this;
        }
        if (j11 < 0) {
            T('-');
            j11 = -j11;
        }
        if (i11 > 1) {
            for (int P0 = i11 - P0(j11, 10); P0 > 0; P0--) {
                append(c11);
            }
        }
        if (j11 >= 10000) {
            if (j11 >= 1000000000000000000L) {
                T(f1726d[(int) ((j11 % 1.0E19d) / 1.0E18d)]);
            }
            if (j11 >= 100000000000000000L) {
                T(f1726d[(int) ((j11 % 1000000000000000000L) / 100000000000000000L)]);
            }
            if (j11 >= 10000000000000000L) {
                T(f1726d[(int) ((j11 % 100000000000000000L) / 10000000000000000L)]);
            }
            if (j11 >= 1000000000000000L) {
                T(f1726d[(int) ((j11 % 10000000000000000L) / 1000000000000000L)]);
            }
            if (j11 >= 100000000000000L) {
                T(f1726d[(int) ((j11 % 1000000000000000L) / 100000000000000L)]);
            }
            if (j11 >= 10000000000000L) {
                T(f1726d[(int) ((j11 % 100000000000000L) / 10000000000000L)]);
            }
            if (j11 >= 1000000000000L) {
                T(f1726d[(int) ((j11 % 10000000000000L) / 1000000000000L)]);
            }
            if (j11 >= 100000000000L) {
                T(f1726d[(int) ((j11 % 1000000000000L) / 100000000000L)]);
            }
            if (j11 >= z50.f.f100989w) {
                T(f1726d[(int) ((j11 % 100000000000L) / z50.f.f100989w)]);
            }
            if (j11 >= C.NANOS_PER_SECOND) {
                T(f1726d[(int) ((j11 % z50.f.f100989w) / C.NANOS_PER_SECOND)]);
            }
            if (j11 >= vb.a.f93807j) {
                T(f1726d[(int) ((j11 % C.NANOS_PER_SECOND) / vb.a.f93807j)]);
            }
            if (j11 >= 10000000) {
                T(f1726d[(int) ((j11 % vb.a.f93807j) / 10000000)]);
            }
            if (j11 >= 1000000) {
                T(f1726d[(int) ((j11 % 10000000) / 1000000)]);
            }
            if (j11 >= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                T(f1726d[(int) ((j11 % 1000000) / SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US)]);
            }
            T(f1726d[(int) ((j11 % SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) / 10000)]);
        }
        if (j11 >= 1000) {
            T(f1726d[(int) ((j11 % 10000) / 1000)]);
        }
        if (j11 >= 100) {
            T(f1726d[(int) ((j11 % 1000) / 100)]);
        }
        if (j11 >= 10) {
            T(f1726d[(int) ((j11 % 100) / 10)]);
        }
        T(f1726d[(int) (j11 % 10)]);
        return this;
    }

    public final void I0(int i11, char[] cArr) {
        if (i11 < 0 || i11 > this.f1728b) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        if (cArr.length != 0) {
            M0(cArr.length, i11);
            System.arraycopy(cArr, 0, cArr, i11, cArr.length);
            this.f1728b += cArr.length;
        }
    }

    public y0 J(y0 y0Var) {
        if (y0Var == null) {
            a0();
            return this;
        }
        X(y0Var.f1727a, 0, y0Var.f1728b);
        return this;
    }

    public final void J0(int i11, char[] cArr, int i12, int i13) {
        if (i11 < 0 || i11 > i13) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        if (i12 >= 0 && i13 >= 0 && i13 <= cArr.length - i12) {
            if (i13 != 0) {
                M0(i13, i11);
                System.arraycopy(cArr, i12, this.f1727a, i11, i13);
                this.f1728b += i13;
                return;
            }
            return;
        }
        throw new StringIndexOutOfBoundsException("offset " + i12 + ", length " + i13 + ", char[].length " + cArr.length);
    }

    public y0 K(y0 y0Var, int i11, int i12) {
        if (y0Var == null) {
            a0();
            return this;
        }
        X(y0Var.f1727a, i11, i12);
        return this;
    }

    public int K0(String str) {
        return L0(str, this.f1728b);
    }

    @Override // java.lang.Appendable
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public y0 append(CharSequence charSequence) {
        if (charSequence == null) {
            a0();
            return this;
        }
        if (!(charSequence instanceof y0)) {
            V(charSequence.toString());
            return this;
        }
        y0 y0Var = (y0) charSequence;
        X(y0Var.f1727a, 0, y0Var.f1728b);
        return this;
    }

    public int L0(String str, int i11) {
        int length = str.length();
        int i12 = this.f1728b;
        if (length > i12 || i11 < 0) {
            return -1;
        }
        if (length <= 0) {
            return i11 < i12 ? i11 : i12;
        }
        if (i11 > i12 - length) {
            i11 = i12 - length;
        }
        char charAt = str.charAt(0);
        while (i11 >= 0) {
            if (this.f1727a[i11] == charAt) {
                int i13 = i11;
                int i14 = 0;
                do {
                    i14++;
                    if (i14 >= length) {
                        break;
                    }
                    i13++;
                } while (this.f1727a[i13] == str.charAt(i14));
                if (i14 == length) {
                    return i11;
                }
                i11--;
            } else {
                i11--;
            }
        }
        return -1;
    }

    @Override // java.lang.Appendable
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public y0 append(CharSequence charSequence, int i11, int i12) {
        U(charSequence, i11, i12);
        return this;
    }

    public final void M0(int i11, int i12) {
        char[] cArr = this.f1727a;
        int length = cArr.length;
        int i13 = this.f1728b;
        if (length - i13 >= i11) {
            System.arraycopy(cArr, i12, cArr, i11 + i12, i13 - i12);
            return;
        }
        int i14 = i13 + i11;
        int length2 = (cArr.length << 1) + 2;
        if (i14 <= length2) {
            i14 = length2;
        }
        char[] cArr2 = new char[i14];
        System.arraycopy(cArr, 0, cArr2, 0, i12);
        System.arraycopy(this.f1727a, i12, cArr2, i11 + i12, this.f1728b - i12);
        this.f1727a = cArr2;
    }

    public y0 N(Object obj) {
        if (obj == null) {
            a0();
            return this;
        }
        V(obj.toString());
        return this;
    }

    public boolean N0() {
        return this.f1728b != 0;
    }

    public y0 O(String str) {
        V(str);
        return this;
    }

    public y0 P(String str, String str2) {
        if (this.f1728b > 0) {
            V(str2);
        }
        V(str);
        return this;
    }

    public y0 Q(boolean z11) {
        V(z11 ? n6.m.f74525c : "false");
        return this;
    }

    public int Q0(int i11, int i12) {
        return Character.offsetByCodePoints(this.f1727a, 0, this.f1728b, i11, i12);
    }

    public y0 R(char[] cArr) {
        W(cArr);
        return this;
    }

    public y0 R0(char c11, String str) {
        int length = str.length();
        int i11 = 0;
        while (i11 != this.f1728b) {
            if (this.f1727a[i11] == c11) {
                U0(i11, i11 + 1, str);
                i11 += length;
            } else {
                i11++;
            }
        }
        return this;
    }

    public y0 S(char[] cArr, int i11, int i12) {
        X(cArr, i11, i12);
        return this;
    }

    public y0 S0(int i11, int i12, String str) {
        U0(i11, i12, str);
        return this;
    }

    public final void T(char c11) {
        int i11 = this.f1728b;
        if (i11 == this.f1727a.length) {
            l0(i11 + 1);
        }
        char[] cArr = this.f1727a;
        int i12 = this.f1728b;
        this.f1728b = i12 + 1;
        cArr[i12] = c11;
    }

    public y0 T0(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int i11 = 0;
        while (true) {
            int r02 = r0(str, i11);
            if (r02 == -1) {
                return this;
            }
            U0(r02, r02 + length, str2);
            i11 = r02 + length2;
        }
    }

    public final void U(CharSequence charSequence, int i11, int i12) {
        if (charSequence == null) {
            charSequence = "null";
        }
        if (i11 < 0 || i12 < 0 || i11 > i12 || i12 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        V(charSequence.subSequence(i11, i12).toString());
    }

    public final void U0(int i11, int i12, String str) {
        if (i11 >= 0) {
            int i13 = this.f1728b;
            if (i12 > i13) {
                i12 = i13;
            }
            if (i12 > i11) {
                int length = str.length();
                int i14 = (i12 - i11) - length;
                if (i14 > 0) {
                    char[] cArr = this.f1727a;
                    System.arraycopy(cArr, i12, cArr, i11 + length, this.f1728b - i12);
                } else if (i14 < 0) {
                    M0(-i14, i12);
                }
                str.getChars(0, length, this.f1727a, i11);
                this.f1728b -= i14;
                return;
            }
            if (i11 == i12) {
                str.getClass();
                H0(i11, str);
                return;
            }
        }
        throw new StringIndexOutOfBoundsException();
    }

    public final void V(String str) {
        if (str == null) {
            a0();
            return;
        }
        int length = str.length();
        int i11 = this.f1728b + length;
        if (i11 > this.f1727a.length) {
            l0(i11);
        }
        str.getChars(0, length, this.f1727a, this.f1728b);
        this.f1728b = i11;
    }

    public y0 V0() {
        W0();
        return this;
    }

    public final void W(char[] cArr) {
        int length = this.f1728b + cArr.length;
        if (length > this.f1727a.length) {
            l0(length);
        }
        System.arraycopy(cArr, 0, this.f1727a, this.f1728b, cArr.length);
        this.f1728b = length;
    }

    public final void W0() {
        int i11 = this.f1728b;
        if (i11 < 2) {
            return;
        }
        int i12 = i11 - 1;
        char[] cArr = this.f1727a;
        char c11 = cArr[0];
        char c12 = cArr[i12];
        int i13 = i11 / 2;
        int i14 = 0;
        boolean z11 = true;
        boolean z12 = true;
        while (i14 < i13) {
            char[] cArr2 = this.f1727a;
            int i15 = i14 + 1;
            char c13 = cArr2[i15];
            int i16 = i12 - 1;
            char c14 = cArr2[i16];
            boolean z13 = z11 && c13 >= 56320 && c13 <= 57343 && c11 >= 55296 && c11 <= 56319;
            if (z13 && this.f1728b < 3) {
                return;
            }
            if (z13 == (z12 && c14 >= 55296 && c14 <= 56319 && c12 >= 56320 && c12 <= 57343)) {
                if (z13) {
                    cArr2[i12] = c13;
                    cArr2[i16] = c11;
                    cArr2[i14] = c14;
                    cArr2[i15] = c12;
                    char c15 = cArr2[i14 + 2];
                    c12 = cArr2[i12 - 2];
                    i12--;
                    c11 = c15;
                    i14 = i15;
                } else {
                    cArr2[i12] = c11;
                    cArr2[i14] = c12;
                    c11 = c13;
                    c12 = c14;
                }
                z11 = true;
                z12 = true;
            } else if (z13) {
                cArr2[i12] = c13;
                cArr2[i14] = c12;
                c12 = c14;
                z12 = true;
                z11 = false;
            } else {
                cArr2[i12] = c11;
                cArr2[i14] = c14;
                c11 = c13;
                z11 = true;
                z12 = false;
            }
            i14++;
            i12--;
        }
        if ((this.f1728b & 1) == 1) {
            if (z11 && z12) {
                return;
            }
            char[] cArr3 = this.f1727a;
            if (!z11) {
                c12 = c11;
            }
            cArr3[i12] = c12;
        }
    }

    public final void X(char[] cArr, int i11, int i12) {
        if (i11 > cArr.length || i11 < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset out of bounds: " + i11);
        }
        if (i12 < 0 || cArr.length - i11 < i12) {
            throw new ArrayIndexOutOfBoundsException("Length out of bounds: " + i12);
        }
        int i13 = this.f1728b + i12;
        if (i13 > this.f1727a.length) {
            l0(i13);
        }
        System.arraycopy(cArr, i11, this.f1727a, this.f1728b, i12);
        this.f1728b = i13;
    }

    public void X0(int i11, char c11) {
        if (i11 < 0 || i11 >= this.f1728b) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        this.f1727a[i11] = c11;
    }

    public y0 Y(int i11) {
        W(Character.toChars(i11));
        return this;
    }

    public void Y0(int i11) {
        if (i11 < 0) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        char[] cArr = this.f1727a;
        if (i11 > cArr.length) {
            l0(i11);
        } else {
            int i12 = this.f1728b;
            if (i12 < i11) {
                Arrays.fill(cArr, i12, i11, (char) 0);
            }
        }
        this.f1728b = i11;
    }

    public y0 Z(String str) {
        V(str);
        T('\n');
        return this;
    }

    public String Z0(int i11) {
        int i12;
        if (i11 < 0 || i11 > (i12 = this.f1728b)) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        return i11 == i12 ? "" : new String(this.f1727a, i11, i12 - i11);
    }

    public final void a0() {
        int i11 = this.f1728b + 4;
        if (i11 > this.f1727a.length) {
            l0(i11);
        }
        char[] cArr = this.f1727a;
        int i12 = this.f1728b;
        int i13 = i12 + 1;
        this.f1728b = i13;
        cArr[i12] = 'n';
        int i14 = i12 + 2;
        this.f1728b = i14;
        cArr[i13] = l50.b.f69934p;
        int i15 = i12 + 3;
        this.f1728b = i15;
        cArr[i14] = 'l';
        this.f1728b = i12 + 4;
        cArr[i15] = 'l';
    }

    public String a1() {
        String y0Var = toString();
        clear();
        return y0Var;
    }

    public int b0() {
        return this.f1727a.length;
    }

    public void b1() {
        int i11 = this.f1728b;
        char[] cArr = this.f1727a;
        if (i11 < cArr.length) {
            char[] cArr2 = new char[i11];
            System.arraycopy(cArr, 0, cArr2, 0, i11);
            this.f1727a = cArr2;
        }
    }

    public int c0(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f1728b)) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        return Character.codePointAt(this.f1727a, i11, i12);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i11) {
        if (i11 < 0 || i11 >= this.f1728b) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        return this.f1727a[i11];
    }

    public void clear() {
        this.f1728b = 0;
    }

    public int d0(int i11) {
        if (i11 < 1 || i11 > this.f1728b) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        return Character.codePointBefore(this.f1727a, i11);
    }

    public int e0(int i11, int i12) {
        if (i11 < 0 || i12 > this.f1728b || i11 > i12) {
            throw new StringIndexOutOfBoundsException();
        }
        return Character.codePointCount(this.f1727a, i11, i12 - i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y0 y0Var = (y0) obj;
        int i11 = this.f1728b;
        if (i11 != y0Var.f1728b) {
            return false;
        }
        char[] cArr = this.f1727a;
        char[] cArr2 = y0Var.f1727a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (cArr[i12] != cArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    public boolean f0(String str) {
        return r0(str, 0) != -1;
    }

    public boolean g0(String str) {
        return s0(str, 0) != -1;
    }

    public void getChars(int i11, int i12, char[] cArr, int i13) {
        int i14 = this.f1728b;
        if (i11 > i14 || i12 > i14 || i11 > i12) {
            throw new StringIndexOutOfBoundsException();
        }
        System.arraycopy(this.f1727a, i11, cArr, i13, i12 - i11);
    }

    @Override // java.lang.Appendable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public y0 append(char c11) {
        T(c11);
        return this;
    }

    public y0 h0(int i11, int i12) {
        i0(i11, i12);
        return this;
    }

    public int hashCode() {
        int i11 = this.f1728b + 31;
        for (int i12 = 0; i12 < this.f1728b; i12++) {
            i11 = (i11 * 31) + this.f1727a[i12];
        }
        return i11;
    }

    public final void i0(int i11, int i12) {
        if (i11 >= 0) {
            int i13 = this.f1728b;
            if (i12 > i13) {
                i12 = i13;
            }
            if (i12 == i11) {
                return;
            }
            if (i12 > i11) {
                int i14 = i13 - i12;
                if (i14 >= 0) {
                    char[] cArr = this.f1727a;
                    System.arraycopy(cArr, i12, cArr, i11, i14);
                }
                this.f1728b -= i12 - i11;
                return;
            }
        }
        throw new StringIndexOutOfBoundsException();
    }

    public boolean isEmpty() {
        return this.f1728b == 0;
    }

    public y0 j(double d11) {
        V(Double.toString(d11));
        return this;
    }

    public y0 j0(int i11) {
        k0(i11);
        return this;
    }

    public final void k0(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f1728b)) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        int i13 = (i12 - i11) - 1;
        if (i13 > 0) {
            char[] cArr = this.f1727a;
            System.arraycopy(cArr, i11 + 1, cArr, i11, i13);
        }
        this.f1728b--;
    }

    public final void l0(int i11) {
        char[] cArr = this.f1727a;
        int length = (cArr.length >> 1) + cArr.length + 2;
        if (i11 <= length) {
            i11 = length;
        }
        char[] cArr2 = new char[i11];
        System.arraycopy(cArr, 0, cArr2, 0, this.f1728b);
        this.f1727a = cArr2;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f1728b;
    }

    public void m0(int i11) {
        char[] cArr = this.f1727a;
        if (i11 > cArr.length) {
            int length = (cArr.length << 1) + 2;
            if (length > i11) {
                i11 = length;
            }
            l0(i11);
        }
    }

    public y0 n(float f11) {
        V(Float.toString(f11));
        return this;
    }

    public boolean n0(@d0 y0 y0Var) {
        int i11;
        if (this == y0Var) {
            return true;
        }
        if (y0Var == null || (i11 = this.f1728b) != y0Var.f1728b) {
            return false;
        }
        char[] cArr = this.f1727a;
        char[] cArr2 = y0Var.f1727a;
        for (int i12 = 0; i12 < i11; i12++) {
            char c11 = cArr[i12];
            char upperCase = Character.toUpperCase(cArr2[i12]);
            if (c11 != upperCase && c11 != Character.toLowerCase(upperCase)) {
                return false;
            }
        }
        return true;
    }

    public boolean o0(@d0 String str) {
        int i11;
        if (str == null || (i11 = this.f1728b) != str.length()) {
            return false;
        }
        char[] cArr = this.f1727a;
        for (int i12 = 0; i12 < i11; i12++) {
            char c11 = cArr[i12];
            char upperCase = Character.toUpperCase(str.charAt(i12));
            if (c11 != upperCase && c11 != Character.toLowerCase(upperCase)) {
                return false;
            }
        }
        return true;
    }

    public final char[] p0() {
        return this.f1727a;
    }

    public int q0(String str) {
        return r0(str, 0);
    }

    public int r0(String str, int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        int length = str.length();
        if (length == 0) {
            int i12 = this.f1728b;
            return (i11 < i12 || i11 == 0) ? i11 : i12;
        }
        int i13 = this.f1728b - length;
        if (i11 > i13) {
            return -1;
        }
        char charAt = str.charAt(0);
        while (i11 <= i13) {
            if (this.f1727a[i11] == charAt) {
                int i14 = i11;
                int i15 = 0;
                do {
                    i15++;
                    if (i15 >= length) {
                        break;
                    }
                    i14++;
                } while (this.f1727a[i14] == str.charAt(i15));
                if (i15 == length) {
                    return i11;
                }
            }
            i11++;
        }
        return -1;
    }

    public int s0(String str, int i11) {
        char c11;
        char upperCase;
        if (i11 < 0) {
            i11 = 0;
        }
        int length = str.length();
        if (length == 0) {
            int i12 = this.f1728b;
            return (i11 < i12 || i11 == 0) ? i11 : i12;
        }
        int i13 = this.f1728b - length;
        if (i11 > i13) {
            return -1;
        }
        char upperCase2 = Character.toUpperCase(str.charAt(0));
        char lowerCase = Character.toLowerCase(upperCase2);
        while (i11 <= i13) {
            char c12 = this.f1727a[i11];
            if (c12 == upperCase2 || c12 == lowerCase) {
                int i14 = i11;
                int i15 = 0;
                while (true) {
                    i15++;
                    if (i15 >= length || ((c11 = this.f1727a[(i14 = i14 + 1)]) != (upperCase = Character.toUpperCase(str.charAt(i15))) && c11 != Character.toLowerCase(upperCase))) {
                        break;
                    }
                }
                if (i15 == length) {
                    return i11;
                }
            }
            i11++;
        }
        return -1;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i11, int i12) {
        return substring(i11, i12);
    }

    public String substring(int i11, int i12) {
        if (i11 < 0 || i11 > i12 || i12 > this.f1728b) {
            throw new StringIndexOutOfBoundsException();
        }
        return i11 == i12 ? "" : new String(this.f1727a, i11, i12 - i11);
    }

    public y0 t0(int i11, char c11) {
        F0(i11, c11);
        return this;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        int i11 = this.f1728b;
        return i11 == 0 ? "" : new String(this.f1727a, 0, i11);
    }

    public y0 u0(int i11, double d11) {
        H0(i11, Double.toString(d11));
        return this;
    }

    public y0 v0(int i11, float f11) {
        H0(i11, Float.toString(f11));
        return this;
    }

    public y0 w0(int i11, int i12) {
        H0(i11, Integer.toString(i12));
        return this;
    }

    public y0 x0(int i11, long j11) {
        H0(i11, Long.toString(j11));
        return this;
    }

    public y0 y0(int i11, CharSequence charSequence) {
        H0(i11, charSequence == null ? "null" : charSequence.toString());
        return this;
    }

    public y0 z0(int i11, CharSequence charSequence, int i12, int i13) {
        G0(i11, charSequence, i12, i13);
        return this;
    }

    public y0(int i11) {
        if (i11 >= 0) {
            this.f1727a = new char[i11];
            return;
        }
        throw new NegativeArraySizeException();
    }

    public y0(CharSequence charSequence) {
        this(charSequence.toString());
    }

    public y0(y0 y0Var) {
        int i11 = y0Var.f1728b;
        this.f1728b = i11;
        char[] cArr = new char[i11 + 16];
        this.f1727a = cArr;
        System.arraycopy(y0Var.f1727a, 0, cArr, 0, i11);
    }

    public y0(String str) {
        int length = str.length();
        this.f1728b = length;
        char[] cArr = new char[length + 16];
        this.f1727a = cArr;
        str.getChars(0, length, cArr, 0);
    }
}
