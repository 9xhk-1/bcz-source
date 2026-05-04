package fn;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class r6 {

    /* renamed from: a, reason: collision with root package name */
    public final l f52240a;

    /* renamed from: b, reason: collision with root package name */
    public l f52241b;

    /* renamed from: c, reason: collision with root package name */
    public List<l> f52242c;

    /* renamed from: d, reason: collision with root package name */
    public List<l> f52243d;

    /* renamed from: e, reason: collision with root package name */
    public Map<l, Double> f52244e;

    public r6() {
        throw new UnsupportedOperationException();
    }

    public static boolean k(double d11, double d12, double d13) {
        return d12 < d13 ? d12 <= d11 && d11 <= d13 : d12 <= d11 || d11 <= d13;
    }

    public static double l(l lVar) {
        double[] l11 = c.l(lVar.k());
        return ((Math.pow(Math.hypot(l11[1], l11[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(v5.g(v5.g(Math.toDegrees(Math.atan2(l11[2], l11[1]))) - 50.0d)))) - 0.5d;
    }

    public List<l> b() {
        return c(5, 12);
    }

    public List<l> c(int i11, int i12) {
        int round = (int) Math.round(this.f52240a.d());
        l lVar = f().get(round);
        double h11 = h(lVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lVar);
        double d11 = 0.0d;
        double d12 = 0.0d;
        int i13 = 0;
        while (i13 < 360) {
            double h12 = h(f().get(v5.h(round + i13)));
            d12 += Math.abs(h12 - h11);
            i13++;
            h11 = h12;
        }
        double d13 = d12 / i12;
        double h13 = h(lVar);
        int i14 = 1;
        while (true) {
            if (arrayList.size() >= i12) {
                break;
            }
            l lVar2 = f().get(v5.h(round + i14));
            double h14 = h(lVar2);
            d11 += Math.abs(h14 - h13);
            boolean z11 = d11 >= ((double) arrayList.size()) * d13;
            int i15 = 1;
            while (z11 && arrayList.size() < i12) {
                arrayList.add(lVar2);
                int i16 = i14;
                z11 = d11 >= ((double) (arrayList.size() + i15)) * d13;
                i15++;
                i14 = i16;
            }
            i14++;
            if (i14 > 360) {
                while (arrayList.size() < i12) {
                    arrayList.add(lVar2);
                }
            } else {
                h13 = h14;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f52240a);
        int floor = (int) Math.floor((i11 - 1.0d) / 2.0d);
        for (int i17 = 1; i17 < floor + 1; i17++) {
            int i18 = 0 - i17;
            while (i18 < 0) {
                i18 += arrayList.size();
            }
            if (i18 >= arrayList.size()) {
                i18 %= arrayList.size();
            }
            arrayList2.add(0, (l) arrayList.get(i18));
        }
        int i19 = i11 - floor;
        for (int i21 = 1; i21 < i19; i21++) {
            int i22 = i21;
            while (i22 < 0) {
                i22 += arrayList.size();
            }
            if (i22 >= arrayList.size()) {
                i22 %= arrayList.size();
            }
            arrayList2.add((l) arrayList.get(i22));
        }
        return arrayList2;
    }

    public final l d() {
        return g().get(0);
    }

    public l e() {
        double d11;
        l lVar = this.f52241b;
        if (lVar != null) {
            return lVar;
        }
        double d12 = d().d();
        double doubleValue = i().get(d()).doubleValue();
        double d13 = j().d();
        double doubleValue2 = i().get(j()).doubleValue() - doubleValue;
        boolean k11 = k(this.f52240a.d(), d12, d13);
        double d14 = k11 ? d13 : d12;
        double d15 = k11 ? d12 : d13;
        l lVar2 = f().get((int) Math.round(this.f52240a.d()));
        double d16 = 1.0d;
        double h11 = 1.0d - h(this.f52240a);
        double d17 = 1000.0d;
        double d18 = 0.0d;
        while (d18 <= 360.0d) {
            double g11 = v5.g((d16 * d18) + d14);
            if (k(g11, d14, d15)) {
                d11 = d16;
                l lVar3 = f().get((int) Math.round(g11));
                double abs = Math.abs(h11 - ((i().get(lVar3).doubleValue() - doubleValue) / doubleValue2));
                if (abs < d17) {
                    lVar2 = lVar3;
                    d17 = abs;
                }
            } else {
                d11 = d16;
            }
            d18 += d11;
            d16 = d11;
        }
        this.f52241b = lVar2;
        return lVar2;
    }

    public final List<l> f() {
        List<l> list = this.f52243d;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d11 = 0.0d; d11 <= 360.0d; d11 += 1.0d) {
            arrayList.add(l.a(d11, this.f52240a.c(), this.f52240a.e()));
        }
        List<l> unmodifiableList = Collections.unmodifiableList(arrayList);
        this.f52243d = unmodifiableList;
        return unmodifiableList;
    }

    public final List<l> g() {
        List<l> list = this.f52242c;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(f());
        arrayList.add(this.f52240a);
        Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: fn.p6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double d11;
                d11 = r6.this.i().get((l) obj);
                return d11;
            }
        }, new Comparator() { // from class: fn.q6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.f52242c = arrayList;
        return arrayList;
    }

    public double h(l lVar) {
        double doubleValue = i().get(j()).doubleValue() - i().get(d()).doubleValue();
        double doubleValue2 = i().get(lVar).doubleValue() - i().get(d()).doubleValue();
        if (doubleValue == 0.0d) {
            return 0.5d;
        }
        return doubleValue2 / doubleValue;
    }

    public final Map<l, Double> i() {
        Map<l, Double> map = this.f52244e;
        if (map != null) {
            return map;
        }
        ArrayList<l> arrayList = new ArrayList(f());
        arrayList.add(this.f52240a);
        HashMap hashMap = new HashMap();
        for (l lVar : arrayList) {
            hashMap.put(lVar, Double.valueOf(l(lVar)));
        }
        this.f52244e = hashMap;
        return hashMap;
    }

    public final l j() {
        return g().get(g().size() - 1);
    }

    public r6(l lVar) {
        this.f52240a = lVar;
    }
}
