package com.google.zxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import wp.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public Map<DecodeHintType, ?> f35061a;

    /* renamed from: b, reason: collision with root package name */
    public j[] f35062b;

    @Override // com.google.zxing.j
    public k a(b bVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        e(map);
        return b(bVar);
    }

    public final k b(b bVar) throws NotFoundException {
        j[] jVarArr = this.f35062b;
        if (jVarArr != null) {
            for (j jVar : jVarArr) {
                try {
                    return jVar.a(bVar, this.f35061a);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.j
    public k c(b bVar) throws NotFoundException {
        e(null);
        return b(bVar);
    }

    public k d(b bVar) throws NotFoundException {
        if (this.f35062b == null) {
            e(null);
        }
        return b(bVar);
    }

    public void e(Map<DecodeHintType, ?> map) {
        this.f35061a = map;
        boolean z11 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z12 = collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.UPC_E) || collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.CODABAR) || collection.contains(BarcodeFormat.CODE_39) || collection.contains(BarcodeFormat.CODE_93) || collection.contains(BarcodeFormat.CODE_128) || collection.contains(BarcodeFormat.ITF) || collection.contains(BarcodeFormat.RSS_14) || collection.contains(BarcodeFormat.RSS_EXPANDED);
            if (z12 && !z11) {
                arrayList.add(new p(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new fq.a());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new np.a());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new fp.b());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new aq.b());
            }
            if (collection.contains(BarcodeFormat.MAXICODE)) {
                arrayList.add(new rp.a());
            }
            if (z12 && z11) {
                arrayList.add(new p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z11) {
                arrayList.add(new p(map));
            }
            arrayList.add(new fq.a());
            arrayList.add(new np.a());
            arrayList.add(new fp.b());
            arrayList.add(new aq.b());
            arrayList.add(new rp.a());
            if (z11) {
                arrayList.add(new p(map));
            }
        }
        this.f35062b = (j[]) arrayList.toArray(new j[arrayList.size()]);
    }

    @Override // com.google.zxing.j
    public void reset() {
        j[] jVarArr = this.f35062b;
        if (jVarArr != null) {
            for (j jVar : jVarArr) {
                jVar.reset();
            }
        }
    }
}
