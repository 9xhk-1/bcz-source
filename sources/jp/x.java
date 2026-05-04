package jp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class x extends t {
    @Override // jp.t
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public h k(com.google.zxing.k kVar) {
        String str;
        String str2;
        String c11 = t.c(kVar);
        if (!c11.startsWith("smtp:") && !c11.startsWith("SMTP:")) {
            return null;
        }
        String substring = c11.substring(5);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            String substring2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
            int indexOf2 = substring2.indexOf(58);
            if (indexOf2 >= 0) {
                String substring3 = substring2.substring(indexOf2 + 1);
                str = substring2.substring(0, indexOf2);
                str2 = substring3;
            } else {
                str2 = null;
                str = substring2;
            }
        } else {
            str = null;
            str2 = null;
        }
        return new h(new String[]{substring}, null, null, str, str2);
    }
}
