package fq;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.j;
import com.google.zxing.k;
import com.google.zxing.l;
import gq.e;
import gq.g;
import hq.c;
import java.util.List;
import java.util.Map;
import kp.d;
import kp.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final l[] f52282b = new l[0];

    /* renamed from: a, reason: collision with root package name */
    public final e f52283a = new e();

    private static kp.b e(kp.b bVar) throws NotFoundException {
        int[] l11 = bVar.l();
        int[] f11 = bVar.f();
        if (l11 == null || f11 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float g11 = g(l11, bVar);
        int i11 = l11[1];
        int i12 = f11[1];
        int i13 = l11[0];
        int i14 = f11[0];
        if (i13 >= i14 || i11 >= i12) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i15 = i12 - i11;
        if (i15 != i14 - i13 && (i14 = i13 + i15) >= bVar.m()) {
            throw NotFoundException.getNotFoundInstance();
        }
        int round = Math.round(((i14 - i13) + 1) / g11);
        int round2 = Math.round((i15 + 1) / g11);
        if (round <= 0 || round2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (round2 != round) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i16 = (int) (g11 / 2.0f);
        int i17 = i11 + i16;
        int i18 = i13 + i16;
        int i19 = (((int) ((round - 1) * g11)) + i18) - i14;
        if (i19 > 0) {
            if (i19 > i16) {
                throw NotFoundException.getNotFoundInstance();
            }
            i18 -= i19;
        }
        int i21 = (((int) ((round2 - 1) * g11)) + i17) - i12;
        if (i21 > 0) {
            if (i21 > i16) {
                throw NotFoundException.getNotFoundInstance();
            }
            i17 -= i21;
        }
        kp.b bVar2 = new kp.b(round, round2);
        for (int i22 = 0; i22 < round2; i22++) {
            int i23 = ((int) (i22 * g11)) + i17;
            for (int i24 = 0; i24 < round; i24++) {
                if (bVar.e(((int) (i24 * g11)) + i18, i23)) {
                    bVar2.q(i24, i22);
                }
            }
        }
        return bVar2;
    }

    public static float g(int[] iArr, kp.b bVar) throws NotFoundException {
        int h11 = bVar.h();
        int m11 = bVar.m();
        int i11 = iArr[0];
        boolean z11 = true;
        int i12 = iArr[1];
        int i13 = 0;
        while (i11 < m11 && i12 < h11) {
            if (z11 != bVar.e(i11, i12)) {
                i13++;
                if (i13 == 5) {
                    break;
                }
                z11 = !z11;
            }
            i11++;
            i12++;
        }
        if (i11 == m11 || i12 == h11) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (i11 - iArr[0]) / 7.0f;
    }

    @Override // com.google.zxing.j
    public final k a(com.google.zxing.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        l[] b11;
        d dVar;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            f f11 = new c(bVar.b()).f(map);
            d d11 = this.f52283a.d(f11.a(), map);
            b11 = f11.b();
            dVar = d11;
        } else {
            dVar = this.f52283a.d(e(bVar.b()), map);
            b11 = f52282b;
        }
        if (dVar.f() instanceof g) {
            ((g) dVar.f()).a(b11);
        }
        k kVar = new k(dVar.j(), dVar.g(), b11, BarcodeFormat.QR_CODE);
        List<byte[]> a11 = dVar.a();
        if (a11 != null) {
            kVar.j(ResultMetadataType.BYTE_SEGMENTS, a11);
        }
        String b12 = dVar.b();
        if (b12 != null) {
            kVar.j(ResultMetadataType.ERROR_CORRECTION_LEVEL, b12);
        }
        if (dVar.k()) {
            kVar.j(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(dVar.i()));
            kVar.j(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(dVar.h()));
        }
        return kVar;
    }

    @Override // com.google.zxing.j
    public k c(com.google.zxing.b bVar) throws NotFoundException, ChecksumException, FormatException {
        return a(bVar, null);
    }

    public final e f() {
        return this.f52283a;
    }

    @Override // com.google.zxing.j
    public void reset() {
    }
}
