package jp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f extends a {
    @Override // jp.t
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public b0 k(com.google.zxing.k kVar) {
        String g11 = kVar.g();
        if (!g11.startsWith("MEBKM:")) {
            return null;
        }
        String r11 = a.r("TITLE:", g11, true);
        String[] q11 = a.q("URL:", g11, true);
        if (q11 == null) {
            return null;
        }
        String str = q11[0];
        if (c0.q(str)) {
            return new b0(str, r11);
        }
        return null;
    }
}
