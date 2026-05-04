package com.vivo.push.d;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class aa extends z {
    public aa(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        com.vivo.push.b.t tVar = (com.vivo.push.b.t) oVar;
        ArrayList<String> d11 = tVar.d();
        List<String> e11 = tVar.e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int h11 = tVar.h();
        String g11 = tVar.g();
        if (d11 != null) {
            for (String str : d11) {
                if (str.startsWith("ali/")) {
                    arrayList2.add(str.replace("ali/", ""));
                } else if (str.startsWith("tag/")) {
                    arrayList.add(str.replace("tag/", ""));
                }
            }
        }
        if (e11 != null) {
            for (String str2 : e11) {
                if (str2.startsWith("ali/")) {
                    arrayList4.add(str2.replace("ali/", ""));
                } else if (str2.startsWith("tag/")) {
                    arrayList3.add(str2.replace("tag/", ""));
                }
            }
        }
        if (arrayList.size() > 0 || arrayList3.size() > 0) {
            if (arrayList.size() > 0) {
                com.vivo.push.e.a().a(arrayList);
            }
            com.vivo.push.e.a().a(tVar.g(), arrayList3.size() > 0 ? 10000 : h11);
            com.vivo.push.m.b(new ab(this, h11, arrayList, arrayList3, g11));
        }
        if (arrayList2.size() > 0 || arrayList4.size() > 0) {
            if (arrayList2.size() > 0) {
                com.vivo.push.e.a().b((String) arrayList2.get(0));
            }
            com.vivo.push.e.a().a(tVar.g(), h11);
            com.vivo.push.m.b(new ac(this, h11, arrayList2, arrayList4, g11));
        }
    }
}
