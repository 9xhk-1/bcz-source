package rp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.j;
import com.google.zxing.k;
import com.google.zxing.l;
import java.util.Map;
import kp.b;
import kp.d;
import sp.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final l[] f84511b = new l[0];

    /* renamed from: c, reason: collision with root package name */
    public static final int f84512c = 30;

    /* renamed from: d, reason: collision with root package name */
    public static final int f84513d = 33;

    /* renamed from: a, reason: collision with root package name */
    public final c f84514a = new c();

    private static b b(b bVar) throws NotFoundException {
        int[] g11 = bVar.g();
        if (g11 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i11 = g11[0];
        int i12 = g11[1];
        int i13 = g11[2];
        int i14 = g11[3];
        b bVar2 = new b(30, 33);
        for (int i15 = 0; i15 < 33; i15++) {
            int i16 = (((i15 * i14) + (i14 / 2)) / 33) + i12;
            for (int i17 = 0; i17 < 30; i17++) {
                if (bVar.e(((((i17 * i13) + (i13 / 2)) + (((i15 & 1) * i13) / 2)) / 30) + i11, i16)) {
                    bVar2.q(i17, i15);
                }
            }
        }
        return bVar2;
    }

    @Override // com.google.zxing.j
    public k a(com.google.zxing.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            throw NotFoundException.getNotFoundInstance();
        }
        d c11 = this.f84514a.c(b(bVar.b()), map);
        k kVar = new k(c11.j(), c11.g(), f84511b, BarcodeFormat.MAXICODE);
        String b11 = c11.b();
        if (b11 != null) {
            kVar.j(ResultMetadataType.ERROR_CORRECTION_LEVEL, b11);
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
