package jp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d0 extends t {
    @Override // jp.t
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public b0 k(com.google.zxing.k kVar) {
        int indexOf;
        String c11 = t.c(kVar);
        if ((c11.startsWith("urlto:") || c11.startsWith("URLTO:")) && (indexOf = c11.indexOf(58, 6)) >= 0) {
            return new b0(c11.substring(indexOf + 1), indexOf > 6 ? c11.substring(6, indexOf) : null);
        }
        return null;
    }
}
