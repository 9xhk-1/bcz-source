package jp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c extends a {
    public static String t(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1) + ' ' + str.substring(0, indexOf);
    }

    @Override // jp.t
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public d k(com.google.zxing.k kVar) {
        String[] q11;
        String c11 = t.c(kVar);
        if (!c11.startsWith("MECARD:") || (q11 = a.q("N:", c11, true)) == null) {
            return null;
        }
        String t11 = t(q11[0]);
        String r11 = a.r("SOUND:", c11, true);
        String[] q12 = a.q("TEL:", c11, true);
        String[] q13 = a.q("EMAIL:", c11, true);
        String r12 = a.r("NOTE:", c11, false);
        String[] q14 = a.q("ADR:", c11, true);
        String r13 = a.r("BDAY:", c11, true);
        return new d(t.j(t11), null, r11, q12, null, q13, null, null, r12, q14, null, a.r("ORG:", c11, true), !t.d(r13, 8) ? null : r13, null, a.q("URL:", c11, true), null);
    }
}
