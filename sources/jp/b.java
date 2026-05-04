package jp;

import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b extends t {
    public static String[] q(String str, int i11, String str2, boolean z11) {
        ArrayList arrayList = null;
        for (int i12 = 1; i12 <= i11; i12++) {
            String g11 = t.g(str + i12 + ':', str2, '\r', z11);
            if (g11 == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i11);
            }
            arrayList.add(g11);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // jp.t
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public d k(com.google.zxing.k kVar) {
        String c11 = t.c(kVar);
        if (!c11.contains("MEMORY") || !c11.contains("\r\n")) {
            return null;
        }
        String g11 = t.g("NAME1:", c11, '\r', true);
        String g12 = t.g("NAME2:", c11, '\r', true);
        String[] q11 = q("TEL", 3, c11, true);
        String[] q12 = q("MAIL", 3, c11, true);
        String g13 = t.g("MEMORY:", c11, '\r', false);
        String g14 = t.g("ADD:", c11, '\r', true);
        return new d(t.j(g11), null, g12, q11, null, q12, null, null, g13, g14 != null ? new String[]{g14} : null, null, null, null, null, null, null);
    }
}
