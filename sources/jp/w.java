package jp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class w extends t {
    @Override // jp.t
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public v k(com.google.zxing.k kVar) {
        String str;
        String c11 = t.c(kVar);
        if (!c11.startsWith("smsto:") && !c11.startsWith("SMSTO:") && !c11.startsWith("mmsto:") && !c11.startsWith("MMSTO:")) {
            return null;
        }
        String substring = c11.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str = null;
        }
        return new v(substring, (String) null, (String) null, str);
    }
}
