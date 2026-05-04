package np;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.c;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.n;
import java.util.Map;
import qp.e;
import qp.i;
import qp.j;
import qp.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b implements n {
    public static kp.b c(iq.b bVar, int i11, int i12) {
        kp.b bVar2;
        int e11 = bVar.e();
        int d11 = bVar.d();
        int max = Math.max(i11, e11);
        int max2 = Math.max(i12, d11);
        int min = Math.min(max / e11, max2 / d11);
        int i13 = (max - (e11 * min)) / 2;
        int i14 = (max2 - (d11 * min)) / 2;
        if (i12 < d11 || i11 < e11) {
            bVar2 = new kp.b(e11, d11);
            i13 = 0;
            i14 = 0;
        } else {
            bVar2 = new kp.b(i11, i12);
        }
        bVar2.b();
        int i15 = 0;
        while (i15 < d11) {
            int i16 = i13;
            int i17 = 0;
            while (i17 < e11) {
                if (bVar.b(i17, i15) == 1) {
                    bVar2.s(i16, i14, min, min);
                }
                i17++;
                i16 += min;
            }
            i15++;
            i14 += min;
        }
        return bVar2;
    }

    public static kp.b d(e eVar, k kVar, int i11, int i12) {
        int i13 = kVar.i();
        int h11 = kVar.h();
        iq.b bVar = new iq.b(kVar.k(), kVar.j());
        int i14 = 0;
        for (int i15 = 0; i15 < h11; i15++) {
            if (i15 % kVar.f82630e == 0) {
                int i16 = 0;
                for (int i17 = 0; i17 < kVar.k(); i17++) {
                    bVar.h(i16, i14, i17 % 2 == 0);
                    i16++;
                }
                i14++;
            }
            int i18 = 0;
            for (int i19 = 0; i19 < i13; i19++) {
                if (i19 % kVar.f82629d == 0) {
                    bVar.h(i18, i14, true);
                    i18++;
                }
                bVar.h(i18, i14, eVar.e(i19, i15));
                int i21 = i18 + 1;
                int i22 = kVar.f82629d;
                if (i19 % i22 == i22 - 1) {
                    bVar.h(i21, i14, i15 % 2 == 0);
                    i18 += 2;
                } else {
                    i18 = i21;
                }
            }
            int i23 = i14 + 1;
            int i24 = kVar.f82630e;
            if (i15 % i24 == i24 - 1) {
                int i25 = 0;
                for (int i26 = 0; i26 < kVar.k(); i26++) {
                    bVar.h(i25, i23, true);
                    i25++;
                }
                i14 += 2;
            } else {
                i14 = i23;
            }
        }
        return c(bVar, i11, i12);
    }

    @Override // com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) {
        c cVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i11 + 'x' + i12);
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        c cVar2 = null;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            c cVar3 = (c) map.get(EncodeHintType.MIN_SIZE);
            if (cVar3 == null) {
                cVar3 = null;
            }
            cVar = (c) map.get(EncodeHintType.MAX_SIZE);
            if (cVar == null) {
                cVar = null;
            }
            cVar2 = cVar3;
        } else {
            cVar = null;
        }
        String c11 = j.c(str, symbolShapeHint, cVar2, cVar);
        k o11 = k.o(c11.length(), symbolShapeHint, cVar2, cVar, true);
        e eVar = new e(i.c(c11, o11), o11.i(), o11.h());
        eVar.k();
        return d(eVar, o11, i11, i12);
    }

    @Override // com.google.zxing.n
    public kp.b b(String str, BarcodeFormat barcodeFormat, int i11, int i12) {
        return a(str, barcodeFormat, i11, i12, null);
    }
}
