package br;

import er.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {
    public String a(List<ar.a> list) {
        List<ar.a> b11 = b(c(d(e(list))));
        String str = "";
        if (b11.size() > 0) {
            int i11 = 0;
            for (ar.a aVar : b11) {
                if (aVar.f() >= i11) {
                    i11 = aVar.f();
                    str = aVar.e();
                }
            }
        }
        return str;
    }

    public final List<ar.a> b(List<ar.a> list) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (ar.a aVar : list) {
            if (aVar.b() > i11) {
                arrayList.clear();
                i11 = aVar.b();
            } else if (aVar.b() != i11) {
                b.f50106b.c("OptimizationCenter", "condition Low level");
            }
            arrayList.add(aVar);
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    public final List<ar.a> c(List<ar.a> list) {
        ArrayList arrayList = new ArrayList();
        for (ar.a aVar : list) {
            if (aVar.a() == 0) {
                arrayList.add(aVar);
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    public final List<ar.a> d(List<ar.a> list) {
        ArrayList arrayList = new ArrayList();
        for (ar.a aVar : list) {
            if (aVar.c() == 1) {
                arrayList.add(aVar);
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    public final List<ar.a> e(List<ar.a> list) {
        ArrayList arrayList = new ArrayList();
        for (ar.a aVar : list) {
            if (aVar.d() > -1) {
                arrayList.add(aVar);
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }
}
