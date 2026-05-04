package wp;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class g extends r {

    /* renamed from: c, reason: collision with root package name */
    public static final String f96603c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f96604d = f96603c.toCharArray();

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f96605e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f96606f;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f96607a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public final int[] f96608b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, DefaultImageHeaderParser.f28794q, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, FloatingActionButton.f31352y, 306, tt.a.f90880d};
        f96605e = iArr;
        f96606f = iArr[47];
    }

    public static void h(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        i(charSequence, length - 2, 20);
        i(charSequence, length - 1, 15);
    }

    public static void i(CharSequence charSequence, int i11, int i12) throws ChecksumException {
        int i13 = 0;
        int i14 = 1;
        for (int i15 = i11 - 1; i15 >= 0; i15--) {
            i13 += f96603c.indexOf(charSequence.charAt(i15)) * i14;
            i14++;
            if (i14 > i12) {
                i14 = 1;
            }
        }
        if (charSequence.charAt(i11) != f96604d[i13 % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    private static String j(CharSequence charSequence) throws FormatException {
        int i11;
        char c11;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i12 = 0;
        while (i12 < length) {
            char charAt = charSequence.charAt(i12);
            if (charAt < 'a' || charAt > 'd') {
                sb2.append(charAt);
            } else {
                if (i12 >= length - 1) {
                    throw FormatException.getFormatInstance();
                }
                i12++;
                char charAt2 = charSequence.charAt(i12);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i11 = charAt2 - '@';
                            c11 = (char) i11;
                            sb2.append(c11);
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 'b':
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            i11 = charAt2 - '&';
                        } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                            i11 = charAt2 + sp.b.f88884f;
                        } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                            i11 = charAt2 + 16;
                        } else if (charAt2 >= 'P' && charAt2 <= 'S') {
                            i11 = charAt2 + '+';
                        } else if (charAt2 >= 'T' && charAt2 <= 'Z') {
                            c11 = 127;
                            sb2.append(c11);
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        c11 = (char) i11;
                        sb2.append(c11);
                        break;
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            i11 = charAt2 - ' ';
                            c11 = (char) i11;
                            sb2.append(c11);
                        } else {
                            if (charAt2 != 'Z') {
                                throw FormatException.getFormatInstance();
                            }
                            c11 = ':';
                            sb2.append(c11);
                            break;
                        }
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i11 = charAt2 + ' ';
                            c11 = (char) i11;
                            sb2.append(c11);
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    default:
                        c11 = 0;
                        sb2.append(c11);
                        break;
                }
            }
            i12++;
        }
        return sb2.toString();
    }

    private static char l(int i11) throws NotFoundException {
        int i12 = 0;
        while (true) {
            int[] iArr = f96605e;
            if (i12 >= iArr.length) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i12] == i11) {
                return f96604d[i12];
            }
            i12++;
        }
    }

    public static int m(int[] iArr) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        int length = iArr.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            int round = Math.round((iArr[i14] * 9.0f) / i11);
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i14 & 1) == 0) {
                for (int i15 = 0; i15 < round; i15++) {
                    i13 = (i13 << 1) | 1;
                }
            } else {
                i13 <<= round;
            }
        }
        return i13;
    }

    @Override // wp.r
    public com.google.zxing.k b(int i11, kp.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int j11 = aVar.j(k(aVar)[1]);
        int m11 = aVar.m();
        int[] iArr = this.f96608b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f96607a;
        sb2.setLength(0);
        while (true) {
            r.f(aVar, j11, iArr);
            int m12 = m(iArr);
            if (m12 < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char l11 = l(m12);
            sb2.append(l11);
            int i12 = j11;
            for (int i13 : iArr) {
                i12 += i13;
            }
            int j12 = aVar.j(i12);
            if (l11 == '*') {
                sb2.deleteCharAt(sb2.length() - 1);
                int i14 = 0;
                for (int i15 : iArr) {
                    i14 += i15;
                }
                if (j12 == m11 || !aVar.h(j12)) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (sb2.length() < 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                h(sb2);
                sb2.setLength(sb2.length() - 2);
                float f11 = i11;
                return new com.google.zxing.k(j(sb2), null, new com.google.zxing.l[]{new com.google.zxing.l((r14[1] + r14[0]) / 2.0f, f11), new com.google.zxing.l(j11 + (i14 / 2.0f), f11)}, BarcodeFormat.CODE_93);
            }
            j11 = j12;
        }
    }

    public final int[] k(kp.a aVar) throws NotFoundException {
        int m11 = aVar.m();
        int j11 = aVar.j(0);
        Arrays.fill(this.f96608b, 0);
        int[] iArr = this.f96608b;
        int length = iArr.length;
        boolean z11 = false;
        int i11 = 0;
        int i12 = j11;
        while (j11 < m11) {
            if (aVar.h(j11) != z11) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (m(iArr) == f96606f) {
                        return new int[]{i12, j11};
                    }
                    i12 += iArr[0] + iArr[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i13);
                    iArr[i13] = 0;
                    iArr[i11] = 0;
                    i11--;
                }
                iArr[i11] = 1;
                z11 = !z11;
            }
            j11++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
