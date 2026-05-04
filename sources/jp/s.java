package jp;

import com.google.zxing.BarcodeFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class s extends t {
    @Override // jp.t
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public r k(com.google.zxing.k kVar) {
        BarcodeFormat b11 = kVar.b();
        if (b11 != BarcodeFormat.UPC_A && b11 != BarcodeFormat.UPC_E && b11 != BarcodeFormat.EAN_8 && b11 != BarcodeFormat.EAN_13) {
            return null;
        }
        String c11 = t.c(kVar);
        if (t.d(c11, c11.length())) {
            return new r(c11, (b11 == BarcodeFormat.UPC_E && c11.length() == 8) ? wp.a0.s(c11) : c11);
        }
        return null;
    }
}
