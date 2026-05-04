package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class s implements com.google.zxing.n {
    public static int c(boolean[] zArr, int i11, int[] iArr, boolean z11) {
        int i12 = 0;
        for (int i13 : iArr) {
            int i14 = 0;
            while (i14 < i13) {
                zArr[i11] = z11;
                i14++;
                i11++;
            }
            i12 += i13;
            z11 = !z11;
        }
        return i12;
    }

    public static kp.b f(boolean[] zArr, int i11, int i12, int i13) {
        int length = zArr.length;
        int i14 = i13 + length;
        int max = Math.max(i11, i14);
        int max2 = Math.max(1, i12);
        int i15 = max / i14;
        int i16 = (max - (length * i15)) / 2;
        kp.b bVar = new kp.b(max, max2);
        int i17 = 0;
        while (i17 < length) {
            if (zArr[i17]) {
                bVar.s(i16, 0, i15, max2);
            }
            i17++;
            i16 += i15;
        }
        return bVar;
    }

    @Override // com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i11 + 'x' + i12);
        }
        int e11 = e();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType)) {
                e11 = Integer.parseInt(map.get(encodeHintType).toString());
            }
        }
        return f(d(str), i11, i12, e11);
    }

    @Override // com.google.zxing.n
    public final kp.b b(String str, BarcodeFormat barcodeFormat, int i11, int i12) throws WriterException {
        return a(str, barcodeFormat, i11, i12, null);
    }

    public abstract boolean[] d(String str);

    public int e() {
        return 10;
    }
}
