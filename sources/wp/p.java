package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class p extends r {

    /* renamed from: a, reason: collision with root package name */
    public final r[] f96631a;

    public p(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        boolean z11 = (map == null || map.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new q(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39)) {
                arrayList.add(new e(z11));
            }
            if (collection.contains(BarcodeFormat.CODE_93)) {
                arrayList.add(new g());
            }
            if (collection.contains(BarcodeFormat.CODE_128)) {
                arrayList.add(new c());
            }
            if (collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new n());
            }
            if (collection.contains(BarcodeFormat.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(BarcodeFormat.RSS_14)) {
                arrayList.add(new xp.e());
            }
            if (collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                arrayList.add(new yp.d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new q(map));
            arrayList.add(new e());
            arrayList.add(new a());
            arrayList.add(new g());
            arrayList.add(new c());
            arrayList.add(new n());
            arrayList.add(new xp.e());
            arrayList.add(new yp.d());
        }
        this.f96631a = (r[]) arrayList.toArray(new r[arrayList.size()]);
    }

    @Override // wp.r
    public com.google.zxing.k b(int i11, kp.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        for (r rVar : this.f96631a) {
            try {
                return rVar.b(i11, aVar, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // wp.r, com.google.zxing.j
    public void reset() {
        for (r rVar : this.f96631a) {
            rVar.reset();
        }
    }
}
