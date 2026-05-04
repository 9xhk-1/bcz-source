package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class l extends z {

    /* renamed from: a, reason: collision with root package name */
    public static final int f96613a = 67;

    @Override // wp.s, com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.a(str, barcodeFormat, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // wp.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.r(str);
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
        boolean[] zArr = new boolean[67];
        int c11 = s.c(zArr, 0, y.f96645f, true);
        for (int i11 = 0; i11 <= 3; i11++) {
            c11 += s.c(zArr, c11, y.f96648i[Character.digit(str.charAt(i11), 10)], false);
        }
        int c12 = c11 + s.c(zArr, c11, y.f96646g, false);
        for (int i12 = 4; i12 <= 7; i12++) {
            c12 += s.c(zArr, c12, y.f96648i[Character.digit(str.charAt(i12), 10)], true);
        }
        s.c(zArr, c12, y.f96645f, true);
        return zArr;
    }
}
