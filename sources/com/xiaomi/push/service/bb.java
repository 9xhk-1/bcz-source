package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.Cif;
import com.xiaomi.push.hn;
import com.xiaomi.push.ho;
import com.xiaomi.push.hq;
import com.xiaomi.push.hs;
import com.xiaomi.push.ie;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class bb {
    public static int a(ba baVar, hn hnVar) {
        return baVar.a(hnVar, bc.f46274a[hnVar.ordinal()] != 1 ? 0 : 1);
    }

    private static List<Pair<Integer, Object>> a(List<hs> list, boolean z11) {
        if (com.xiaomi.push.ad.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (hs hsVar : list) {
            int a11 = hsVar.a();
            ho a12 = ho.a(hsVar.b());
            if (a12 != null) {
                if (z11 && hsVar.f544a) {
                    arrayList.add(new Pair(Integer.valueOf(a11), null));
                } else {
                    int i11 = bc.f46275b[a12.ordinal()];
                    arrayList.add(i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? null : new Pair(Integer.valueOf(a11), Boolean.valueOf(hsVar.g())) : new Pair(Integer.valueOf(a11), hsVar.m6031a()) : new Pair(Integer.valueOf(a11), Long.valueOf(hsVar.m6030a())) : new Pair(Integer.valueOf(a11), Integer.valueOf(hsVar.c())));
                }
            }
        }
        return arrayList;
    }

    public static void a(ba baVar, ie ieVar) {
        baVar.a(a(ieVar.a(), true));
        baVar.b();
    }

    public static void a(ba baVar, Cif cif) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (hq hqVar : cif.a()) {
            arrayList.add(new Pair<>(hqVar.m6026a(), Integer.valueOf(hqVar.a())));
            List<Pair<Integer, Object>> a11 = a(hqVar.f536a, false);
            if (!com.xiaomi.push.ad.a(a11)) {
                arrayList2.addAll(a11);
            }
        }
        baVar.a(arrayList, arrayList2);
        baVar.b();
    }
}
