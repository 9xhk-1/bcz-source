package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b0 extends z {

    /* renamed from: a, reason: collision with root package name */
    public static final int f96558a = 51;

    @Override // wp.s, com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.a(str, barcodeFormat, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // wp.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.r(a0.s(str));
            } catch (FormatException e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!y.i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i11 = a0.f96552m[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int c11 = s.c(zArr, 0, y.f96645f, true);
        for (int i12 = 1; i12 <= 6; i12++) {
            int digit2 = Character.digit(str.charAt(i12), 10);
            if (((i11 >> (6 - i12)) & 1) == 1) {
                digit2 += 10;
            }
            c11 += s.c(zArr, c11, y.f96649j[digit2], false);
        }
        s.c(zArr, c11, y.f96647h, false);
        return zArr;
    }
}
