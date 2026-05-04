package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import cn.g;
import com.google.android.material.carousel.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: h, reason: collision with root package name */
    public static final int f30948h = -1;

    /* renamed from: a, reason: collision with root package name */
    public final b f30949a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b> f30950b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f30951c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f30952d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f30953e;

    /* renamed from: f, reason: collision with root package name */
    public final float f30954f;

    /* renamed from: g, reason: collision with root package name */
    public final float f30955g;

    public c(@NonNull b bVar, List<b> list, List<b> list2) {
        this.f30949a = bVar;
        this.f30950b = Collections.unmodifiableList(list);
        this.f30951c = Collections.unmodifiableList(list2);
        float f11 = list.get(list.size() - 1).c().f30940a - bVar.c().f30940a;
        this.f30954f = f11;
        float f12 = bVar.j().f30940a - list2.get(list2.size() - 1).j().f30940a;
        this.f30955g = f12;
        this.f30952d = m(f11, list, true);
        this.f30953e = m(f12, list2, false);
    }

    public static int b(b bVar, float f11) {
        for (int i11 = bVar.i(); i11 < bVar.g().size(); i11++) {
            if (f11 == bVar.g().get(i11).f30942c) {
                return i11;
            }
        }
        return bVar.g().size() - 1;
    }

    public static int c(b bVar) {
        for (int i11 = 0; i11 < bVar.g().size(); i11++) {
            if (!bVar.g().get(i11).f30944e) {
                return i11;
            }
        }
        return -1;
    }

    public static int d(b bVar, float f11) {
        for (int b11 = bVar.b() - 1; b11 >= 0; b11--) {
            if (f11 == bVar.g().get(b11).f30942c) {
                return b11;
            }
        }
        return 0;
    }

    public static int e(b bVar) {
        for (int size = bVar.g().size() - 1; size >= 0; size--) {
            if (!bVar.g().get(size).f30944e) {
                return size;
            }
        }
        return -1;
    }

    public static c f(cn.b bVar, b bVar2, float f11, float f12, float f13) {
        return new c(bVar2, p(bVar, bVar2, f11, f12), n(bVar, bVar2, f11, f13));
    }

    public static float[] m(float f11, List<b> list, boolean z11) {
        int size = list.size();
        float[] fArr = new float[size];
        int i11 = 1;
        while (i11 < size) {
            int i12 = i11 - 1;
            b bVar = list.get(i12);
            b bVar2 = list.get(i11);
            fArr[i11] = i11 == size + (-1) ? 1.0f : fArr[i12] + ((z11 ? bVar2.c().f30940a - bVar.c().f30940a : bVar.j().f30940a - bVar2.j().f30940a) / f11);
            i11++;
        }
        return fArr;
    }

    public static List<b> n(cn.b bVar, b bVar2, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar2);
        int e11 = e(bVar2);
        float b11 = bVar.isHorizontal() ? bVar.b() : bVar.a();
        if (!r(bVar, bVar2) && e11 != -1) {
            int i11 = e11 - bVar2.i();
            float f13 = bVar2.c().f30941b - (bVar2.c().f30943d / 2.0f);
            if (i11 <= 0 && bVar2.h().f30945f > 0.0f) {
                arrayList.add(v(bVar2, f13 - bVar2.h().f30945f, b11));
                return arrayList;
            }
            int i12 = 0;
            float f14 = 0.0f;
            while (i12 < i11) {
                b bVar3 = (b) arrayList.get(arrayList.size() - 1);
                int i13 = e11 - i12;
                float f15 = f14 + bVar2.g().get(i13).f30945f;
                int i14 = i13 + 1;
                b t11 = t(bVar3, e11, i14 < bVar2.g().size() ? d(bVar3, bVar2.g().get(i14).f30942c) + 1 : 0, f13 - f15, bVar2.b() + i12 + 1, bVar2.i() + i12 + 1, b11);
                if (i12 == i11 - 1 && f12 > 0.0f) {
                    t11 = u(t11, f12, b11, false, f11);
                }
                arrayList.add(t11);
                i12++;
                f14 = f15;
            }
        } else if (f12 > 0.0f) {
            arrayList.add(u(bVar2, f12, b11, false, f11));
        }
        return arrayList;
    }

    public static float[] o(List<b> list, float f11, float[] fArr) {
        int size = list.size();
        float f12 = fArr[0];
        int i11 = 1;
        while (i11 < size) {
            float f13 = fArr[i11];
            if (f11 <= f13) {
                return new float[]{vm.b.b(0.0f, 1.0f, f12, f13, f11), i11 - 1, i11};
            }
            i11++;
            f12 = f13;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static List<b> p(cn.b bVar, b bVar2, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar2);
        int c11 = c(bVar2);
        float b11 = bVar.isHorizontal() ? bVar.b() : bVar.a();
        if (!q(bVar2) && c11 != -1) {
            int b12 = bVar2.b() - c11;
            float f13 = bVar2.c().f30941b - (bVar2.c().f30943d / 2.0f);
            if (b12 <= 0 && bVar2.a().f30945f > 0.0f) {
                arrayList.add(v(bVar2, f13 + bVar2.a().f30945f, b11));
                return arrayList;
            }
            int i11 = 0;
            float f14 = 0.0f;
            while (i11 < b12) {
                b bVar3 = (b) arrayList.get(arrayList.size() - 1);
                int i12 = c11 + i11;
                int size = bVar2.g().size() - 1;
                float f15 = f14 + bVar2.g().get(i12).f30945f;
                int i13 = i12 - 1;
                if (i13 >= 0) {
                    size = b(bVar3, bVar2.g().get(i13).f30942c) - 1;
                }
                b t11 = t(bVar3, c11, size, f13 + f15, (bVar2.b() - i11) - 1, (bVar2.i() - i11) - 1, b11);
                if (i11 == b12 - 1 && f12 > 0.0f) {
                    t11 = u(t11, f12, b11, true, f11);
                }
                arrayList.add(t11);
                i11++;
                f14 = f15;
            }
        } else if (f12 > 0.0f) {
            arrayList.add(u(bVar2, f12, b11, true, f11));
        }
        return arrayList;
    }

    public static boolean q(b bVar) {
        return bVar.a().f30941b - (bVar.a().f30943d / 2.0f) >= 0.0f && bVar.a() == bVar.d();
    }

    public static boolean r(cn.b bVar, b bVar2) {
        int a11 = bVar.a();
        if (bVar.isHorizontal()) {
            a11 = bVar.b();
        }
        return bVar2.h().f30941b + (bVar2.h().f30943d / 2.0f) <= ((float) a11) && bVar2.h() == bVar2.k();
    }

    public static b s(List<b> list, float f11, float[] fArr) {
        float[] o11 = o(list, f11, fArr);
        return b.m(list.get((int) o11[1]), list.get((int) o11[2]), o11[0]);
    }

    public static b t(b bVar, int i11, int i12, float f11, int i13, int i14, float f12) {
        ArrayList arrayList = new ArrayList(bVar.g());
        arrayList.add(i12, (b.c) arrayList.remove(i11));
        b.C0368b c0368b = new b.C0368b(bVar.f(), f12);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i15);
            float f13 = cVar.f30943d;
            c0368b.e(f11 + (f13 / 2.0f), cVar.f30942c, f13, i15 >= i13 && i15 <= i14, cVar.f30944e, cVar.f30945f);
            f11 += cVar.f30943d;
            i15++;
        }
        return c0368b.i();
    }

    public static b u(b bVar, float f11, float f12, boolean z11, float f13) {
        ArrayList arrayList = new ArrayList(bVar.g());
        b.C0368b c0368b = new b.C0368b(bVar.f(), f12);
        float l11 = f11 / bVar.l();
        float f14 = z11 ? f11 : 0.0f;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i11);
            if (cVar.f30944e) {
                c0368b.e(cVar.f30941b, cVar.f30942c, cVar.f30943d, false, true, cVar.f30945f);
            } else {
                boolean z12 = i11 >= bVar.b() && i11 <= bVar.i();
                float f15 = cVar.f30943d - l11;
                float b11 = g.b(f15, bVar.f(), f13);
                float f16 = (f15 / 2.0f) + f14;
                float f17 = f16 - cVar.f30941b;
                c0368b.f(f16, b11, f15, z12, false, cVar.f30945f, z11 ? f17 : 0.0f, z11 ? 0.0f : f17);
                f14 += f15;
            }
            i11++;
        }
        return c0368b.i();
    }

    public static b v(b bVar, float f11, float f12) {
        return t(bVar, 0, 0, f11, bVar.b(), bVar.i(), f12);
    }

    public final b a(List<b> list, float f11, float[] fArr) {
        float[] o11 = o(list, f11, fArr);
        return o11[0] >= 0.5f ? list.get((int) o11[2]) : list.get((int) o11[1]);
    }

    public b g() {
        return this.f30949a;
    }

    public b h() {
        return this.f30951c.get(r0.size() - 1);
    }

    public Map<Integer, b> i(int i11, int i12, int i13, boolean z11) {
        float f11 = this.f30949a.f();
        HashMap hashMap = new HashMap();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= i11) {
                break;
            }
            int i16 = z11 ? (i11 - i14) - 1 : i14;
            if (i16 * f11 * (z11 ? -1 : 1) > i13 - this.f30955g || i14 >= i11 - this.f30951c.size()) {
                Integer valueOf = Integer.valueOf(i16);
                List<b> list = this.f30951c;
                hashMap.put(valueOf, list.get(MathUtils.clamp(i15, 0, list.size() - 1)));
                i15++;
            }
            i14++;
        }
        int i17 = 0;
        for (int i18 = i11 - 1; i18 >= 0; i18--) {
            int i19 = z11 ? (i11 - i18) - 1 : i18;
            if (i19 * f11 * (z11 ? -1 : 1) < i12 + this.f30954f || i18 < this.f30950b.size()) {
                Integer valueOf2 = Integer.valueOf(i19);
                List<b> list2 = this.f30950b;
                hashMap.put(valueOf2, list2.get(MathUtils.clamp(i17, 0, list2.size() - 1)));
                i17++;
            }
        }
        return hashMap;
    }

    public b j(float f11, float f12, float f13) {
        return k(f11, f12, f13, false);
    }

    public b k(float f11, float f12, float f13, boolean z11) {
        float b11;
        List<b> list;
        float[] fArr;
        float f14 = this.f30954f + f12;
        float f15 = f13 - this.f30955g;
        float f16 = l().a().f30946g;
        float f17 = h().h().f30947h;
        if (this.f30954f == f16) {
            f14 += f16;
        }
        if (this.f30955g == f17) {
            f15 -= f17;
        }
        if (f11 < f14) {
            b11 = vm.b.b(1.0f, 0.0f, f12, f14, f11);
            list = this.f30950b;
            fArr = this.f30952d;
        } else {
            if (f11 <= f15) {
                return this.f30949a;
            }
            b11 = vm.b.b(0.0f, 1.0f, f15, f13, f11);
            list = this.f30951c;
            fArr = this.f30953e;
        }
        return z11 ? a(list, b11, fArr) : s(list, b11, fArr);
    }

    public b l() {
        return this.f30950b.get(r0.size() - 1);
    }
}
