package fp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.n;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c implements n {
    public static kp.b c(String str, BarcodeFormat barcodeFormat, int i11, int i12, Charset charset, int i13, int i14) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return d(ip.c.e(str.getBytes(charset), i13, i14), i11, i12);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public static kp.b d(ip.a aVar, int i11, int i12) {
        kp.b c11 = aVar.c();
        if (c11 == null) {
            throw new IllegalStateException();
        }
        int m11 = c11.m();
        int h11 = c11.h();
        int max = Math.max(i11, m11);
        int max2 = Math.max(i12, h11);
        int min = Math.min(max / m11, max2 / h11);
        int i13 = (max - (m11 * min)) / 2;
        int i14 = (max2 - (h11 * min)) / 2;
        kp.b bVar = new kp.b(max, max2);
        int i15 = 0;
        while (i15 < h11) {
            int i16 = 0;
            int i17 = i13;
            while (i16 < m11) {
                if (c11.e(i16, i15)) {
                    bVar.s(i17, i14, min, min);
                }
                i16++;
                i17 += min;
            }
            i15++;
            i14 += min;
        }
        return bVar;
    }

    @Override // com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i13 = 0;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType)) {
                charset = Charset.forName(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            r1 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 33;
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(encodeHintType3)) {
                i13 = Integer.parseInt(map.get(encodeHintType3).toString());
            }
        }
        return c(str, barcodeFormat, i11, i12, charset, r1, i13);
    }

    @Override // com.google.zxing.n
    public kp.b b(String str, BarcodeFormat barcodeFormat, int i11, int i12) {
        return a(str, barcodeFormat, i11, i12, null);
    }
}
