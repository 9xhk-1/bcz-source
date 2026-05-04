package np;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.j;
import com.google.zxing.k;
import com.google.zxing.l;
import java.util.List;
import java.util.Map;
import kp.f;
import op.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final l[] f75365b = new l[0];

    /* renamed from: a, reason: collision with root package name */
    public final d f75366a = new d();

    public static kp.b b(kp.b bVar) throws NotFoundException {
        int[] l11 = bVar.l();
        int[] f11 = bVar.f();
        if (l11 == null || f11 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int d11 = d(l11, bVar);
        int i11 = l11[1];
        int i12 = f11[1];
        int i13 = l11[0];
        int i14 = ((f11[0] - i13) + 1) / d11;
        int i15 = ((i12 - i11) + 1) / d11;
        if (i14 <= 0 || i15 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i16 = d11 / 2;
        int i17 = i11 + i16;
        int i18 = i13 + i16;
        kp.b bVar2 = new kp.b(i14, i15);
        for (int i19 = 0; i19 < i15; i19++) {
            int i21 = (i19 * d11) + i17;
            for (int i22 = 0; i22 < i14; i22++) {
                if (bVar.e((i22 * d11) + i18, i21)) {
                    bVar2.q(i22, i19);
                }
            }
        }
        return bVar2;
    }

    public static int d(int[] iArr, kp.b bVar) throws NotFoundException {
        int m11 = bVar.m();
        int i11 = iArr[0];
        int i12 = iArr[1];
        while (i11 < m11 && bVar.e(i11, i12)) {
            i11++;
        }
        if (i11 == m11) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i13 = i11 - iArr[0];
        if (i13 != 0) {
            return i13;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.j
    public k a(com.google.zxing.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        l[] b11;
        kp.d dVar;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            f c11 = new pp.a(bVar.b()).c();
            kp.d b12 = this.f75366a.b(c11.a());
            b11 = c11.b();
            dVar = b12;
        } else {
            dVar = this.f75366a.b(b(bVar.b()));
            b11 = f75365b;
        }
        k kVar = new k(dVar.j(), dVar.g(), b11, BarcodeFormat.DATA_MATRIX);
        List<byte[]> a11 = dVar.a();
        if (a11 != null) {
            kVar.j(ResultMetadataType.BYTE_SEGMENTS, a11);
        }
        String b13 = dVar.b();
        if (b13 != null) {
            kVar.j(ResultMetadataType.ERROR_CORRECTION_LEVEL, b13);
        }
        return kVar;
    }

    @Override // com.google.zxing.j
    public k c(com.google.zxing.b bVar) throws NotFoundException, ChecksumException, FormatException {
        return a(bVar, null);
    }

    @Override // com.google.zxing.j
    public void reset() {
    }
}
