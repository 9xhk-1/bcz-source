package qp;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f82586a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82587b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82588c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f82589d;

    public e(CharSequence charSequence, int i11, int i12) {
        this.f82586a = charSequence;
        this.f82588c = i11;
        this.f82587b = i12;
        byte[] bArr = new byte[i11 * i12];
        this.f82589d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void a(int i11) {
        j(this.f82587b - 1, 0, i11, 1);
        j(this.f82587b - 1, 1, i11, 2);
        j(this.f82587b - 1, 2, i11, 3);
        j(0, this.f82588c - 2, i11, 4);
        j(0, this.f82588c - 1, i11, 5);
        j(1, this.f82588c - 1, i11, 6);
        j(2, this.f82588c - 1, i11, 7);
        j(3, this.f82588c - 1, i11, 8);
    }

    public final void b(int i11) {
        j(this.f82587b - 3, 0, i11, 1);
        j(this.f82587b - 2, 0, i11, 2);
        j(this.f82587b - 1, 0, i11, 3);
        j(0, this.f82588c - 4, i11, 4);
        j(0, this.f82588c - 3, i11, 5);
        j(0, this.f82588c - 2, i11, 6);
        j(0, this.f82588c - 1, i11, 7);
        j(1, this.f82588c - 1, i11, 8);
    }

    public final void c(int i11) {
        j(this.f82587b - 3, 0, i11, 1);
        j(this.f82587b - 2, 0, i11, 2);
        j(this.f82587b - 1, 0, i11, 3);
        j(0, this.f82588c - 2, i11, 4);
        j(0, this.f82588c - 1, i11, 5);
        j(1, this.f82588c - 1, i11, 6);
        j(2, this.f82588c - 1, i11, 7);
        j(3, this.f82588c - 1, i11, 8);
    }

    public final void d(int i11) {
        j(this.f82587b - 1, 0, i11, 1);
        j(this.f82587b - 1, this.f82588c - 1, i11, 2);
        j(0, this.f82588c - 3, i11, 3);
        j(0, this.f82588c - 2, i11, 4);
        j(0, this.f82588c - 1, i11, 5);
        j(1, this.f82588c - 3, i11, 6);
        j(1, this.f82588c - 2, i11, 7);
        j(1, this.f82588c - 1, i11, 8);
    }

    public final boolean e(int i11, int i12) {
        return this.f82589d[(i12 * this.f82588c) + i11] == 1;
    }

    public final byte[] f() {
        return this.f82589d;
    }

    public final int g() {
        return this.f82588c;
    }

    public final int h() {
        return this.f82587b;
    }

    public final boolean i(int i11, int i12) {
        return this.f82589d[(i12 * this.f82588c) + i11] >= 0;
    }

    public final void j(int i11, int i12, int i13, int i14) {
        if (i11 < 0) {
            int i15 = this.f82587b;
            i11 += i15;
            i12 += 4 - ((i15 + 4) % 8);
        }
        if (i12 < 0) {
            int i16 = this.f82588c;
            i12 += i16;
            i11 += 4 - ((i16 + 4) % 8);
        }
        l(i12, i11, (this.f82586a.charAt(i13) & (1 << (8 - i14))) != 0);
    }

    public final void k() {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 4;
        while (true) {
            if (i15 == this.f82587b && i13 == 0) {
                a(i14);
                i14++;
            }
            if (i15 == this.f82587b - 2 && i13 == 0 && this.f82588c % 4 != 0) {
                b(i14);
                i14++;
            }
            if (i15 == this.f82587b - 2 && i13 == 0 && this.f82588c % 8 == 4) {
                c(i14);
                i14++;
            }
            if (i15 == this.f82587b + 4 && i13 == 2 && this.f82588c % 8 == 0) {
                d(i14);
                i14++;
            }
            while (true) {
                if (i15 < this.f82587b && i13 >= 0 && !i(i13, i15)) {
                    m(i15, i13, i14);
                    i14++;
                }
                int i16 = i15 - 2;
                int i17 = i13 + 2;
                if (i16 < 0 || i17 >= this.f82588c) {
                    break;
                }
                i15 = i16;
                i13 = i17;
            }
            int i18 = i15 - 1;
            int i19 = i13 + 5;
            while (true) {
                if (i18 >= 0 && i19 < this.f82588c && !i(i19, i18)) {
                    m(i18, i19, i14);
                    i14++;
                }
                int i21 = i18 + 2;
                int i22 = i19 - 2;
                i11 = this.f82587b;
                if (i21 >= i11 || i22 < 0) {
                    break;
                }
                i18 = i21;
                i19 = i22;
            }
            i15 = i18 + 5;
            i13 = i19 - 1;
            if (i15 >= i11 && i13 >= (i12 = this.f82588c)) {
                break;
            }
        }
        if (i(i12 - 1, i11 - 1)) {
            return;
        }
        l(this.f82588c - 1, this.f82587b - 1, true);
        l(this.f82588c - 2, this.f82587b - 2, true);
    }

    public final void l(int i11, int i12, boolean z11) {
        this.f82589d[(i12 * this.f82588c) + i11] = z11 ? (byte) 1 : (byte) 0;
    }

    public final void m(int i11, int i12, int i13) {
        int i14 = i11 - 2;
        int i15 = i12 - 2;
        j(i14, i15, i13, 1);
        int i16 = i12 - 1;
        j(i14, i16, i13, 2);
        int i17 = i11 - 1;
        j(i17, i15, i13, 3);
        j(i17, i16, i13, 4);
        j(i17, i12, i13, 5);
        j(i11, i15, i13, 6);
        j(i11, i16, i13, 7);
        j(i11, i12, i13, 8);
    }
}
