package jp;

import com.google.zxing.BarcodeFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class p extends t {
    @Override // jp.t
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public o k(com.google.zxing.k kVar) {
        if (kVar.b() != BarcodeFormat.EAN_13) {
            return null;
        }
        String c11 = t.c(kVar);
        if (c11.length() != 13) {
            return null;
        }
        if (c11.startsWith("978") || c11.startsWith("979")) {
            return new o(c11);
        }
        return null;
    }
}
