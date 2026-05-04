package wp;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e extends r {

    /* renamed from: e, reason: collision with root package name */
    public static final String f96596e = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f96597f = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, DefaultImageHeaderParser.f28794q, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: g, reason: collision with root package name */
    public static final int f96598g = 148;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f96599a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96600b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f96601c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f96602d;

    public e() {
        this(false);
    }

    public static String h(CharSequence charSequence) throws FormatException {
        int i11;
        char c11;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i12 = 0;
        while (i12 < length) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i12++;
                char charAt2 = charSequence.charAt(i12);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i11 = charAt2 - ' ';
                                } else {
                                    if (charAt2 != 'Z') {
                                        throw FormatException.getFormatInstance();
                                    }
                                    c11 = ':';
                                    sb2.append(c11);
                                }
                            }
                            c11 = 0;
                            sb2.append(c11);
                        } else {
                            if (charAt2 < 'A' || charAt2 > 'Z') {
                                throw FormatException.getFormatInstance();
                            }
                            i11 = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i11 = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i11 = charAt2 + sp.b.f88884f;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i11 = charAt2 + 16;
                    } else if (charAt2 < 'P' || charAt2 > 'T') {
                        if (charAt2 != 'U') {
                            if (charAt2 == 'V') {
                                c11 = '@';
                            } else if (charAt2 == 'W') {
                                c11 = '`';
                            } else {
                                if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                    throw FormatException.getFormatInstance();
                                }
                                c11 = 127;
                            }
                            sb2.append(c11);
                        }
                        c11 = 0;
                        sb2.append(c11);
                    } else {
                        i11 = charAt2 + '+';
                    }
                } else {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        throw FormatException.getFormatInstance();
                    }
                    i11 = charAt2 - '@';
                }
                c11 = (char) i11;
                sb2.append(c11);
            } else {
                sb2.append(charAt);
            }
            i12++;
        }
        return sb2.toString();
    }

    public static int[] i(kp.a aVar, int[] iArr) throws NotFoundException {
        int m11 = aVar.m();
        int j11 = aVar.j(0);
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
                    if (k(iArr) == 148 && aVar.o(Math.max(0, i12 - ((j11 - i12) / 2)), i12, false)) {
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

    public static char j(int i11) throws NotFoundException {
        int i12 = 0;
        while (true) {
            int[] iArr = f96597f;
            if (i12 >= iArr.length) {
                if (i11 == 148) {
                    return '*';
                }
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i12] == i11) {
                return f96596e.charAt(i12);
            }
            i12++;
        }
    }

    public static int k(int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            int i12 = Integer.MAX_VALUE;
            for (int i13 : iArr) {
                if (i13 < i12 && i13 > i11) {
                    i12 = i13;
                }
            }
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < length; i17++) {
                int i18 = iArr[i17];
                if (i18 > i12) {
                    i15 |= 1 << ((length - 1) - i17);
                    i14++;
                    i16 += i18;
                }
            }
            if (i14 == 3) {
                for (int i19 = 0; i19 < length && i14 > 0; i19++) {
                    int i21 = iArr[i19];
                    if (i21 > i12) {
                        i14--;
                        if ((i21 << 1) >= i16) {
                            return -1;
                        }
                    }
                }
                return i15;
            }
            if (i14 <= 3) {
                return -1;
            }
            i11 = i12;
        }
    }

    @Override // wp.r
    public com.google.zxing.k b(int i11, kp.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArr = this.f96602d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f96601c;
        sb2.setLength(0);
        int j11 = aVar.j(i(aVar, iArr)[1]);
        int m11 = aVar.m();
        while (true) {
            r.f(aVar, j11, iArr);
            int k11 = k(iArr);
            if (k11 < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char j12 = j(k11);
            sb2.append(j12);
            int i12 = j11;
            for (int i13 : iArr) {
                i12 += i13;
            }
            int j13 = aVar.j(i12);
            if (j12 == '*') {
                sb2.setLength(sb2.length() - 1);
                int i14 = 0;
                for (int i15 : iArr) {
                    i14 += i15;
                }
                int i16 = (j13 - j11) - i14;
                if (j13 != m11 && (i16 << 1) < i14) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (this.f96599a) {
                    int length = sb2.length() - 1;
                    int i17 = 0;
                    for (int i18 = 0; i18 < length; i18++) {
                        i17 += f96596e.indexOf(this.f96601c.charAt(i18));
                    }
                    if (sb2.charAt(length) != f96596e.charAt(i17 % 43)) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    sb2.setLength(length);
                }
                if (sb2.length() == 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                float f11 = i11;
                return new com.google.zxing.k(this.f96600b ? h(sb2) : sb2.toString(), null, new com.google.zxing.l[]{new com.google.zxing.l((r2[1] + r2[0]) / 2.0f, f11), new com.google.zxing.l(j11 + (i14 / 2.0f), f11)}, BarcodeFormat.CODE_39);
            }
            j11 = j13;
        }
    }

    public e(boolean z11) {
        this(z11, false);
    }

    public e(boolean z11, boolean z12) {
        this.f96599a = z11;
        this.f96600b = z12;
        this.f96601c = new StringBuilder(20);
        this.f96602d = new int[9];
    }
}
