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
public final class q extends r {

    /* renamed from: a, reason: collision with root package name */
    public final y[] f96632a;

    public q(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13)) {
                arrayList.add(new i());
            } else if (collection.contains(BarcodeFormat.UPC_A)) {
                arrayList.add(new t());
            }
            if (collection.contains(BarcodeFormat.EAN_8)) {
                arrayList.add(new k());
            }
            if (collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new a0());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new i());
            arrayList.add(new k());
            arrayList.add(new a0());
        }
        this.f96632a = (y[]) arrayList.toArray(new y[arrayList.size()]);
    }

    @Override // wp.r
    public com.google.zxing.k b(int i11, kp.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z11;
        int[] p11 = y.p(aVar);
        for (y yVar : this.f96632a) {
            try {
                com.google.zxing.k m11 = yVar.m(i11, aVar, p11, map);
                boolean z12 = m11.b() == BarcodeFormat.EAN_13 && m11.g().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                if (collection != null && !collection.contains(BarcodeFormat.UPC_A)) {
                    z11 = false;
                    if (z12 || !z11) {
                        return m11;
                    }
                    com.google.zxing.k kVar = new com.google.zxing.k(m11.g().substring(1), m11.d(), m11.f(), BarcodeFormat.UPC_A);
                    kVar.i(m11.e());
                    return kVar;
                }
                z11 = true;
                if (z12) {
                }
                return m11;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // wp.r, com.google.zxing.j
    public void reset() {
        for (y yVar : this.f96632a) {
            yVar.reset();
        }
    }
}
