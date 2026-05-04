package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f96635a = new int[4];

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f96636b = new StringBuilder();

    public static Map<ResultMetadataType, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put((EnumMap) ResultMetadataType.ISSUE_NUMBER, (ResultMetadataType) Integer.valueOf(str));
        return enumMap;
    }

    public final int a(kp.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f96635a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m11 = aVar.m();
        int i11 = iArr[1];
        int i12 = 0;
        for (int i13 = 0; i13 < 2 && i11 < m11; i13++) {
            int j11 = y.j(aVar, iArr2, i11, y.f96649j);
            sb2.append((char) ((j11 % 10) + 48));
            for (int i14 : iArr2) {
                i11 += i14;
            }
            if (j11 >= 10) {
                i12 |= 1 << (1 - i13);
            }
            if (i13 != 1) {
                i11 = aVar.l(aVar.j(i11));
            }
        }
        if (sb2.length() != 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (Integer.parseInt(sb2.toString()) % 4 == i12) {
            return i11;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public com.google.zxing.k b(int i11, kp.a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb2 = this.f96636b;
        sb2.setLength(0);
        int a11 = a(aVar, iArr, sb2);
        String sb3 = sb2.toString();
        Map<ResultMetadataType, Object> c11 = c(sb3);
        float f11 = i11;
        com.google.zxing.k kVar = new com.google.zxing.k(sb3, null, new com.google.zxing.l[]{new com.google.zxing.l((iArr[0] + iArr[1]) / 2.0f, f11), new com.google.zxing.l(a11, f11)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (c11 != null) {
            kVar.i(c11);
        }
        return kVar;
    }
}
