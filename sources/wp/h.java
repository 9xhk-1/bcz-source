package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h extends s {
    @Deprecated
    public static int c(boolean[] zArr, int i11, int[] iArr, boolean z11) {
        return g(zArr, i11, iArr);
    }

    public static int g(boolean[] zArr, int i11, int[] iArr) {
        int length = iArr.length;
        int i12 = 0;
        while (i12 < length) {
            int i13 = i11 + 1;
            zArr[i11] = iArr[i12] != 0;
            i12++;
            i11 = i13;
        }
        return 9;
    }

    public static int h(String str, int i11) {
        int i12 = 0;
        int i13 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i12 += g.f96603c.indexOf(str.charAt(length)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        return i12 % 47;
    }

    private static void i(int i11, int[] iArr) {
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = 1;
            if (((1 << (8 - i12)) & i11) == 0) {
                i13 = 0;
            }
            iArr[i12] = i13;
        }
    }

    @Override // wp.s, com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.a(str, barcodeFormat, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // wp.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int[] iArr = new int[9];
        int length2 = ((str.length() + 4) * 9) + 1;
        i(g.f96605e[47], iArr);
        boolean[] zArr = new boolean[length2];
        int g11 = g(zArr, 0, iArr);
        for (int i11 = 0; i11 < length; i11++) {
            i(g.f96605e[g.f96603c.indexOf(str.charAt(i11))], iArr);
            g11 += g(zArr, g11, iArr);
        }
        int h11 = h(str, 20);
        int[] iArr2 = g.f96605e;
        i(iArr2[h11], iArr);
        int g12 = g11 + g(zArr, g11, iArr);
        i(iArr2[h(str + g.f96603c.charAt(h11), 15)], iArr);
        int g13 = g12 + g(zArr, g12, iArr);
        i(iArr2[47], iArr);
        zArr[g13 + g(zArr, g13, iArr)] = true;
        return zArr;
    }
}
