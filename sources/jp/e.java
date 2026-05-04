package jp;

import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e extends a {
    public static String s(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + ' ' + str2;
    }

    public static String[] t(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    @Override // jp.t
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public d k(com.google.zxing.k kVar) {
        String c11 = t.c(kVar);
        if (!c11.startsWith("BIZCARD:")) {
            return null;
        }
        String s11 = s(a.r("N:", c11, true), a.r("X:", c11, true));
        String r11 = a.r("T:", c11, true);
        String r12 = a.r("C:", c11, true);
        return new d(t.j(s11), null, null, t(a.r("B:", c11, true), a.r("M:", c11, true), a.r("F:", c11, true)), null, t.j(a.r("E:", c11, true)), null, null, null, a.q("A:", c11, true), null, r12, null, r11, null, null);
    }
}
