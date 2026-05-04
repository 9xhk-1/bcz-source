package fq;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.n;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import iq.c;
import iq.f;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f52284a = 4;

    public static kp.b c(f fVar, int i11, int i12, int i13) {
        iq.b c11 = fVar.c();
        if (c11 == null) {
            throw new IllegalStateException();
        }
        int e11 = c11.e();
        int d11 = c11.d();
        int i14 = i13 << 1;
        int i15 = e11 + i14;
        int i16 = i14 + d11;
        int max = Math.max(i11, i15);
        int max2 = Math.max(i12, i16);
        int min = Math.min(max / i15, max2 / i16);
        int i17 = (max - (e11 * min)) / 2;
        int i18 = (max2 - (d11 * min)) / 2;
        kp.b bVar = new kp.b(max, max2);
        int i19 = 0;
        while (i19 < d11) {
            int i21 = 0;
            int i22 = i17;
            while (i21 < e11) {
                if (c11.b(i21, i19) == 1) {
                    bVar.s(i22, i18, min, min);
                }
                i21++;
                i22 += min;
            }
            i19++;
            i18 += min;
        }
        return bVar;
    }

    @Override // com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i11 + 'x' + i12);
        }
        ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
        int i13 = 4;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType)) {
                errorCorrectionLevel = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType2)) {
                i13 = Integer.parseInt(map.get(encodeHintType2).toString());
            }
        }
        return c(c.p(str, errorCorrectionLevel, map), i11, i12, i13);
    }

    @Override // com.google.zxing.n
    public kp.b b(String str, BarcodeFormat barcodeFormat, int i11, int i12) throws WriterException {
        return a(str, barcodeFormat, i11, i12, null);
    }
}
