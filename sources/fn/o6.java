package fn;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class o6 {

    /* renamed from: a, reason: collision with root package name */
    public static final double f52223a = 48.0d;

    /* renamed from: b, reason: collision with root package name */
    public static final double f52224b = 0.7d;

    /* renamed from: c, reason: collision with root package name */
    public static final double f52225c = 0.3d;

    /* renamed from: d, reason: collision with root package name */
    public static final double f52226d = 0.1d;

    /* renamed from: e, reason: collision with root package name */
    public static final double f52227e = 5.0d;

    /* renamed from: f, reason: collision with root package name */
    public static final double f52228f = 0.01d;

    /* renamed from: g, reason: collision with root package name */
    public static final int f52229g = -12417548;

    /* renamed from: h, reason: collision with root package name */
    public static final int f52230h = 4;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return Double.compare(bVar2.f52232b, bVar.f52232b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final l f52231a;

        /* renamed from: b, reason: collision with root package name */
        public final double f52232b;

        public b(l lVar, double d11) {
            this.f52231a = lVar;
            this.f52232b = d11;
        }
    }

    public static List<Integer> a(Map<Integer, Integer> map) {
        return d(map, 4, f52229g, true);
    }

    public static List<Integer> b(Map<Integer, Integer> map, int i11) {
        return d(map, i11, f52229g, true);
    }

    public static List<Integer> c(Map<Integer, Integer> map, int i11, int i12) {
        return d(map, i11, i12, true);
    }

    public static List<Integer> d(Map<Integer, Integer> map, int i11, int i12, boolean z11) {
        ArrayList<l> arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d11 = 0.0d;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            l b11 = l.b(entry.getKey().intValue());
            arrayList.add(b11);
            int floor = (int) Math.floor(b11.d());
            int intValue = entry.getValue().intValue();
            iArr[floor] = iArr[floor] + intValue;
            d11 += intValue;
        }
        double[] dArr = new double[360];
        for (int i13 = 0; i13 < 360; i13++) {
            double d12 = iArr[i13] / d11;
            for (int i14 = i13 - 14; i14 < i13 + 16; i14++) {
                int h11 = v5.h(i14);
                dArr[h11] = dArr[h11] + d12;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (l lVar : arrayList) {
            double d13 = dArr[v5.h((int) Math.round(lVar.d()))];
            if (!z11 || (lVar.c() >= 5.0d && d13 > 0.01d)) {
                arrayList2.add(new b(lVar, (d13 * 100.0d * 0.7d) + ((lVar.c() - 48.0d) * (lVar.c() < 48.0d ? 0.1d : 0.3d))));
            }
        }
        Collections.sort(arrayList2, new a());
        ArrayList arrayList3 = new ArrayList();
        for (int i15 = 90; i15 >= 15; i15--) {
            arrayList3.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                l lVar2 = ((b) it.next()).f52231a;
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList3.add(lVar2);
                        break;
                    }
                    if (v5.c(lVar2.d(), ((l) it2.next()).d()) < i15) {
                        break;
                    }
                }
                if (arrayList3.size() >= i11) {
                    break;
                }
            }
            if (arrayList3.size() >= i11) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i12));
            return arrayList4;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Integer.valueOf(((l) it3.next()).k()));
        }
        return arrayList4;
    }
}
