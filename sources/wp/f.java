package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f extends s {
    public static void g(int i11, int[] iArr) {
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = 1;
            if (((1 << (8 - i12)) & i11) != 0) {
                i13 = 2;
            }
            iArr[i12] = i13;
        }
    }

    public static String h(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        sb2.append("%V");
                    } else if (charAt == '`') {
                        sb2.append("%W");
                    } else if (charAt != '-' && charAt != '.') {
                        if (charAt <= 26) {
                            sb2.append('$');
                            sb2.append((char) (charAt + '@'));
                        } else if (charAt < ' ') {
                            sb2.append('%');
                            sb2.append((char) (charAt + u0.f91708d));
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb2.append('/');
                            sb2.append((char) (charAt + ' '));
                        } else if (charAt <= '9') {
                            sb2.append(charAt);
                        } else if (charAt <= '?') {
                            sb2.append('%');
                            sb2.append((char) (charAt + 11));
                        } else if (charAt <= 'Z') {
                            sb2.append(charAt);
                        } else if (charAt <= '_') {
                            sb2.append('%');
                            sb2.append((char) (charAt + sp.b.f88879a));
                        } else if (charAt <= 'z') {
                            sb2.append('+');
                            sb2.append((char) (charAt - ' '));
                        } else {
                            if (charAt > 127) {
                                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i11) + "'");
                            }
                            sb2.append('%');
                            sb2.append((char) (charAt - '+'));
                        }
                    }
                }
                sb2.append(charAt);
            } else {
                sb2.append("%U");
            }
        }
        return sb2.toString();
    }

    @Override // wp.s, com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.a(str, barcodeFormat, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // wp.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (e.f96596e.indexOf(str.charAt(i11)) < 0) {
                str = h(str);
                length = str.length();
                if (length > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                }
            } else {
                i11++;
            }
        }
        int[] iArr = new int[9];
        int i12 = length + 25;
        for (int i13 = 0; i13 < length; i13++) {
            g(e.f96597f[e.f96596e.indexOf(str.charAt(i13))], iArr);
            for (int i14 = 0; i14 < 9; i14++) {
                i12 += iArr[i14];
            }
        }
        boolean[] zArr = new boolean[i12];
        g(148, iArr);
        int c11 = s.c(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int c12 = c11 + s.c(zArr, c11, iArr2, false);
        for (int i15 = 0; i15 < length; i15++) {
            g(e.f96597f[e.f96596e.indexOf(str.charAt(i15))], iArr);
            int c13 = c12 + s.c(zArr, c12, iArr, true);
            c12 = c13 + s.c(zArr, c13, iArr2, false);
        }
        g(148, iArr);
        s.c(zArr, c12, iArr, true);
        return zArr;
    }
}
