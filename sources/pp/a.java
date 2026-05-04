package pp;

import com.google.zxing.NotFoundException;
import com.google.zxing.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import kp.f;
import kp.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final kp.b f81102a;

    /* renamed from: b, reason: collision with root package name */
    public final lp.c f81103b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final l f81104a;

        /* renamed from: b, reason: collision with root package name */
        public final l f81105b;

        /* renamed from: c, reason: collision with root package name */
        public final int f81106c;

        public l a() {
            return this.f81104a;
        }

        public l b() {
            return this.f81105b;
        }

        public int c() {
            return this.f81106c;
        }

        public String toString() {
            return this.f81104a + "/" + this.f81105b + '/' + this.f81106c;
        }

        public b(l lVar, l lVar2, int i11) {
            this.f81104a = lVar;
            this.f81105b = lVar2;
            this.f81106c = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Serializable, Comparator<b> {
        public c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.c() - bVar2.c();
        }
    }

    public a(kp.b bVar) throws NotFoundException {
        this.f81102a = bVar;
        this.f81103b = new lp.c(bVar);
    }

    public static int d(l lVar, l lVar2) {
        return lp.a.c(l.b(lVar, lVar2));
    }

    public static void e(Map<l, Integer> map, l lVar) {
        Integer num = map.get(lVar);
        map.put(lVar, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public static kp.b g(kp.b bVar, l lVar, l lVar2, l lVar3, l lVar4, int i11, int i12) throws NotFoundException {
        float f11 = i11 - 0.5f;
        float f12 = i12 - 0.5f;
        return h.b().c(bVar, i11, i12, 0.5f, 0.5f, f11, 0.5f, f11, f12, 0.5f, f12, lVar.c(), lVar.d(), lVar4.c(), lVar4.d(), lVar3.c(), lVar3.d(), lVar2.c(), lVar2.d());
    }

    public final l a(l lVar, l lVar2, l lVar3, l lVar4, int i11) {
        float f11 = i11;
        float d11 = d(lVar, lVar2) / f11;
        float d12 = d(lVar3, lVar4);
        l lVar5 = new l(lVar4.c() + (((lVar4.c() - lVar3.c()) / d12) * d11), lVar4.d() + (d11 * ((lVar4.d() - lVar3.d()) / d12)));
        float d13 = d(lVar, lVar3) / f11;
        float d14 = d(lVar2, lVar4);
        l lVar6 = new l(lVar4.c() + (((lVar4.c() - lVar2.c()) / d14) * d13), lVar4.d() + (d13 * ((lVar4.d() - lVar2.d()) / d14)));
        if (f(lVar5)) {
            if (!f(lVar6) || Math.abs(h(lVar3, lVar5).c() - h(lVar2, lVar5).c()) <= Math.abs(h(lVar3, lVar6).c() - h(lVar2, lVar6).c())) {
                return lVar5;
            }
        } else if (!f(lVar6)) {
            return null;
        }
        return lVar6;
    }

    public final l b(l lVar, l lVar2, l lVar3, l lVar4, int i11, int i12) {
        float d11 = d(lVar, lVar2) / i11;
        float d12 = d(lVar3, lVar4);
        l lVar5 = new l(lVar4.c() + (((lVar4.c() - lVar3.c()) / d12) * d11), lVar4.d() + (d11 * ((lVar4.d() - lVar3.d()) / d12)));
        float d13 = d(lVar, lVar3) / i12;
        float d14 = d(lVar2, lVar4);
        l lVar6 = new l(lVar4.c() + (((lVar4.c() - lVar2.c()) / d14) * d13), lVar4.d() + (d13 * ((lVar4.d() - lVar2.d()) / d14)));
        if (f(lVar5)) {
            if (!f(lVar6) || Math.abs(i11 - h(lVar3, lVar5).c()) + Math.abs(i12 - h(lVar2, lVar5).c()) <= Math.abs(i11 - h(lVar3, lVar6).c()) + Math.abs(i12 - h(lVar2, lVar6).c())) {
                return lVar5;
            }
        } else if (!f(lVar6)) {
            return null;
        }
        return lVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f c() throws NotFoundException {
        l lVar;
        l lVar2;
        kp.b g11;
        l[] c11 = this.f81103b.c();
        l lVar3 = c11[0];
        l lVar4 = c11[1];
        l lVar5 = c11[2];
        l lVar6 = c11[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(h(lVar3, lVar4));
        arrayList.add(h(lVar3, lVar5));
        arrayList.add(h(lVar4, lVar6));
        arrayList.add(h(lVar5, lVar6));
        l lVar7 = null;
        Collections.sort(arrayList, new c());
        b bVar = (b) arrayList.get(0);
        b bVar2 = (b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        e(hashMap, bVar.a());
        e(hashMap, bVar.b());
        e(hashMap, bVar2.a());
        e(hashMap, bVar2.b());
        l lVar8 = null;
        l lVar9 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            l lVar10 = (l) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                lVar8 = lVar10;
            } else if (lVar7 == null) {
                lVar7 = lVar10;
            } else {
                lVar9 = lVar10;
            }
        }
        if (lVar7 == null || lVar8 == null || lVar9 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        l[] lVarArr = {lVar7, lVar8, lVar9};
        l.e(lVarArr);
        l lVar11 = lVarArr[0];
        l lVar12 = lVarArr[1];
        l lVar13 = lVarArr[2];
        if (!hashMap.containsKey(lVar3)) {
            lVar4 = lVar3;
        } else if (hashMap.containsKey(lVar4)) {
            lVar4 = !hashMap.containsKey(lVar5) ? lVar5 : lVar6;
        }
        int c12 = h(lVar13, lVar4).c();
        int c13 = h(lVar11, lVar4).c();
        if ((c12 & 1) == 1) {
            c12++;
        }
        int i11 = c12 + 2;
        if ((c13 & 1) == 1) {
            c13++;
        }
        int i12 = c13 + 2;
        if (i11 * 4 >= i12 * 7 || i12 * 4 >= i11 * 7) {
            lVar = lVar13;
            l b11 = b(lVar12, lVar11, lVar, lVar4, i11, i12);
            lVar11 = lVar11;
            if (b11 != null) {
                lVar4 = b11;
            }
            int c14 = h(lVar, lVar4).c();
            int c15 = h(lVar11, lVar4).c();
            if ((c14 & 1) == 1) {
                c14++;
            }
            int i13 = c14;
            if ((c15 & 1) == 1) {
                c15++;
            }
            lVar2 = lVar12;
            g11 = g(this.f81102a, lVar, lVar2, lVar11, lVar4, i13, c15);
        } else {
            lVar = lVar13;
            l a11 = a(lVar12, lVar11, lVar, lVar4, Math.min(i12, i11));
            if (a11 != null) {
                lVar4 = a11;
            }
            int max = Math.max(h(lVar, lVar4).c(), h(lVar11, lVar4).c());
            int i14 = max + 1;
            if ((i14 & 1) == 1) {
                i14 = max + 2;
            }
            int i15 = i14;
            lVar2 = lVar12;
            g11 = g(this.f81102a, lVar, lVar2, lVar11, lVar4, i15, i15);
        }
        return new f(g11, new l[]{lVar, lVar2, lVar11, lVar4});
    }

    public final boolean f(l lVar) {
        return lVar.c() >= 0.0f && lVar.c() < ((float) this.f81102a.m()) && lVar.d() > 0.0f && lVar.d() < ((float) this.f81102a.h());
    }

    public final b h(l lVar, l lVar2) {
        int c11 = (int) lVar.c();
        int d11 = (int) lVar.d();
        int c12 = (int) lVar2.c();
        int d12 = (int) lVar2.d();
        int i11 = 0;
        boolean z11 = Math.abs(d12 - d11) > Math.abs(c12 - c11);
        if (z11) {
            d11 = c11;
            c11 = d11;
            d12 = c12;
            c12 = d12;
        }
        int abs = Math.abs(c12 - c11);
        int abs2 = Math.abs(d12 - d11);
        int i12 = (-abs) / 2;
        int i13 = d11 < d12 ? 1 : -1;
        int i14 = c11 >= c12 ? -1 : 1;
        boolean e11 = this.f81102a.e(z11 ? d11 : c11, z11 ? c11 : d11);
        while (c11 != c12) {
            boolean e12 = this.f81102a.e(z11 ? d11 : c11, z11 ? c11 : d11);
            if (e12 != e11) {
                i11++;
                e11 = e12;
            }
            i12 += abs2;
            if (i12 > 0) {
                if (d11 == d12) {
                    break;
                }
                d11 += i13;
                i12 -= abs;
            }
            c11 += i14;
        }
        return new b(lVar, lVar2, i11);
    }
}
