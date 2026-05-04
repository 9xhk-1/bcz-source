package jp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class z extends t {
    @Override // jp.t
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public y k(com.google.zxing.k kVar) {
        String str;
        String c11 = t.c(kVar);
        if (!c11.startsWith("tel:") && !c11.startsWith("TEL:")) {
            return null;
        }
        if (c11.startsWith("TEL:")) {
            str = "tel:" + c11.substring(4);
        } else {
            str = c11;
        }
        int indexOf = c11.indexOf(63, 4);
        return new y(indexOf < 0 ? c11.substring(4) : c11.substring(4, indexOf), str, null);
    }
}
