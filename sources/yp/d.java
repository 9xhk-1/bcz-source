package yp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.k;
import com.google.zxing.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import wp.r;
import xp.f;
import zp.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d extends xp.a {
    public static final int A = 11;

    /* renamed from: t, reason: collision with root package name */
    public static final int f100248t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f100249u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f100250v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f100251w = 3;

    /* renamed from: x, reason: collision with root package name */
    public static final int f100252x = 4;

    /* renamed from: y, reason: collision with root package name */
    public static final int f100253y = 5;

    /* renamed from: k, reason: collision with root package name */
    public final List<b> f100255k = new ArrayList(11);

    /* renamed from: l, reason: collision with root package name */
    public final List<c> f100256l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final int[] f100257m = new int[2];

    /* renamed from: n, reason: collision with root package name */
    public boolean f100258n;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f100243o = {7, 5, 4, 3, 1};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f100244p = {4, 20, 52, 104, 204};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f100245q = {0, 348, 1388, 2948, 3988};

    /* renamed from: r, reason: collision with root package name */
    public static final int[][] f100246r = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: s, reason: collision with root package name */
    public static final int[][] f100247s = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: z, reason: collision with root package name */
    public static final int[][] f100254z = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    public static int A(kp.a aVar, int i11) {
        return aVar.h(i11) ? aVar.j(aVar.l(i11)) : aVar.l(aVar.j(i11));
    }

    public static boolean C(xp.c cVar, boolean z11, boolean z12) {
        return (cVar.c() == 0 && z11 && z12) ? false : true;
    }

    public static boolean D(Iterable<b> iterable, Iterable<c> iterable2) {
        for (c cVar : iterable2) {
            for (b bVar : iterable) {
                Iterator<b> it = cVar.a().iterator();
                while (it.hasNext()) {
                    if (bVar.equals(it.next())) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean E(List<b> list) {
        for (int[] iArr : f100254z) {
            if (list.size() <= iArr.length) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (list.get(i11).b().c() != iArr[i11]) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void G(List<b> list, List<c> list2) {
        Iterator<c> it = list2.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().size() != list.size()) {
                Iterator<b> it2 = next.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        it.remove();
                        break;
                    }
                    b next2 = it2.next();
                    Iterator<b> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (next2.equals(it3.next())) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void I(int[] iArr) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length / 2; i11++) {
            int i12 = iArr[i11];
            int i13 = (length - i11) - 1;
            iArr[i11] = iArr[i13];
            iArr[i13] = i12;
        }
    }

    public static k w(List<b> list) throws NotFoundException, FormatException {
        String d11 = j.a(a.a(list)).d();
        l[] a11 = list.get(0).b().a();
        l[] a12 = list.get(list.size() - 1).b().a();
        return new k(d11, null, new l[]{a11[0], a11[1], a12[0], a12[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    public List<c> B() {
        return this.f100256l;
    }

    public final xp.c F(kp.a aVar, int i11, boolean z11) {
        int l11;
        int i12;
        int i13;
        if (z11) {
            int i14 = this.f100257m[0] - 1;
            while (i14 >= 0 && !aVar.h(i14)) {
                i14--;
            }
            int i15 = i14 + 1;
            int[] iArr = this.f100257m;
            i13 = iArr[0] - i15;
            l11 = iArr[1];
            i12 = i15;
        } else {
            int[] iArr2 = this.f100257m;
            int i16 = iArr2[0];
            l11 = aVar.l(iArr2[1] + 1);
            i12 = i16;
            i13 = l11 - this.f100257m[1];
        }
        int i17 = l11;
        int[] k11 = k();
        System.arraycopy(k11, 0, k11, 1, k11.length - 1);
        k11[0] = i13;
        try {
            return new xp.c(xp.a.r(k11, f100246r), new int[]{i12, i17}, i12, i17, i11);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    public b H(kp.a aVar, List<b> list, int i11) throws NotFoundException {
        xp.c F;
        xp.b bVar;
        boolean z11 = list.size() % 2 == 0;
        if (this.f100258n) {
            z11 = !z11;
        }
        int i12 = -1;
        boolean z12 = true;
        do {
            z(aVar, list, i12);
            F = F(aVar, i11, z11);
            if (F == null) {
                i12 = A(aVar, this.f100257m[0]);
            } else {
                z12 = false;
            }
        } while (z12);
        xp.b x11 = x(aVar, F, z11, true);
        if (!list.isEmpty() && list.get(list.size() - 1).g()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            bVar = x(aVar, F, z11, false);
        } catch (NotFoundException unused) {
            bVar = null;
        }
        return new b(x11, bVar, F, true);
    }

    public final void J(int i11, boolean z11) {
        boolean z12 = false;
        int i12 = 0;
        boolean z13 = false;
        while (true) {
            if (i12 >= this.f100256l.size()) {
                break;
            }
            c cVar = this.f100256l.get(i12);
            if (cVar.b() > i11) {
                z12 = cVar.c(this.f100255k);
                break;
            } else {
                z13 = cVar.c(this.f100255k);
                i12++;
            }
        }
        if (z12 || z13 || D(this.f100255k, this.f100256l)) {
            return;
        }
        this.f100256l.add(i12, new c(this.f100255k, i11, z11));
        G(this.f100255k, this.f100256l);
    }

    @Override // wp.r
    public k b(int i11, kp.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.f100255k.clear();
        this.f100258n = false;
        try {
            return w(y(i11, aVar));
        } catch (NotFoundException unused) {
            this.f100255k.clear();
            this.f100258n = true;
            return w(y(i11, aVar));
        }
    }

    @Override // wp.r, com.google.zxing.j
    public void reset() {
        this.f100255k.clear();
        this.f100256l.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(int r11) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yp.d.s(int):void");
    }

    public final boolean t() {
        b bVar = this.f100255k.get(0);
        xp.b c11 = bVar.c();
        xp.b d11 = bVar.d();
        if (d11 == null) {
            return false;
        }
        int a11 = d11.a();
        int i11 = 2;
        for (int i12 = 1; i12 < this.f100255k.size(); i12++) {
            b bVar2 = this.f100255k.get(i12);
            a11 += bVar2.c().a();
            int i13 = i11 + 1;
            xp.b d12 = bVar2.d();
            if (d12 != null) {
                a11 += d12.a();
                i11 += 2;
            } else {
                i11 = i13;
            }
        }
        return ((i11 + (-4)) * 211) + (a11 % 211) == c11.b();
    }

    public final List<b> u(List<c> list, int i11) throws NotFoundException {
        while (i11 < this.f100256l.size()) {
            c cVar = this.f100256l.get(i11);
            this.f100255k.clear();
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                this.f100255k.addAll(it.next().a());
            }
            this.f100255k.addAll(cVar.a());
            if (E(this.f100255k)) {
                if (t()) {
                    return this.f100255k;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return u(arrayList, i11 + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i11++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final List<b> v(boolean z11) {
        List<b> list = null;
        if (this.f100256l.size() > 25) {
            this.f100256l.clear();
            return null;
        }
        this.f100255k.clear();
        if (z11) {
            Collections.reverse(this.f100256l);
        }
        try {
            list = u(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z11) {
            Collections.reverse(this.f100256l);
        }
        return list;
    }

    public xp.b x(kp.a aVar, xp.c cVar, boolean z11, boolean z12) throws NotFoundException {
        int[] j11 = j();
        for (int i11 = 0; i11 < j11.length; i11++) {
            j11[i11] = 0;
        }
        if (z12) {
            r.g(aVar, cVar.b()[0], j11);
        } else {
            r.f(aVar, cVar.b()[1], j11);
            int i12 = 0;
            for (int length = j11.length - 1; i12 < length; length--) {
                int i13 = j11[i12];
                j11[i12] = j11[length];
                j11[length] = i13;
                i12++;
            }
        }
        float d11 = lp.a.d(j11) / 17.0f;
        float f11 = (cVar.b()[1] - cVar.b()[0]) / 15.0f;
        if (Math.abs(d11 - f11) / f11 > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] n11 = n();
        int[] l11 = l();
        float[] o11 = o();
        float[] m11 = m();
        for (int i14 = 0; i14 < j11.length; i14++) {
            float f12 = (j11[i14] * 1.0f) / d11;
            int i15 = (int) (0.5f + f12);
            if (i15 <= 0) {
                if (f12 < 0.3f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i15 = 1;
            } else if (i15 > 8) {
                if (f12 > 8.7f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i15 = 8;
            }
            int i16 = i14 / 2;
            if ((i14 & 1) == 0) {
                n11[i16] = i15;
                o11[i16] = f12 - i15;
            } else {
                l11[i16] = i15;
                m11[i16] = f12 - i15;
            }
        }
        s(17);
        int c11 = (((cVar.c() * 4) + (z11 ? 0 : 2)) + (!z12 ? 1 : 0)) - 1;
        int i17 = 0;
        int i18 = 0;
        for (int length2 = n11.length - 1; length2 >= 0; length2--) {
            if (C(cVar, z11, z12)) {
                i17 += n11[length2] * f100247s[c11][length2 * 2];
            }
            i18 += n11[length2];
        }
        int i19 = 0;
        for (int length3 = l11.length - 1; length3 >= 0; length3--) {
            if (C(cVar, z11, z12)) {
                i19 += l11[length3] * f100247s[c11][(length3 * 2) + 1];
            }
        }
        int i21 = i17 + i19;
        if ((i18 & 1) != 0 || i18 > 13 || i18 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i22 = (13 - i18) / 2;
        int i23 = f100243o[i22];
        return new xp.b((f.b(n11, i23, true) * f100244p[i22]) + f.b(l11, 9 - i23, false) + f100245q[i22], i21);
    }

    public List<b> y(int i11, kp.a aVar) throws NotFoundException {
        boolean z11 = false;
        while (!z11) {
            try {
                List<b> list = this.f100255k;
                list.add(H(aVar, list, i11));
            } catch (NotFoundException e11) {
                if (this.f100255k.isEmpty()) {
                    throw e11;
                }
                z11 = true;
            }
        }
        if (t()) {
            return this.f100255k;
        }
        boolean isEmpty = this.f100256l.isEmpty();
        J(i11, false);
        if (!isEmpty) {
            List<b> v11 = v(false);
            if (v11 != null) {
                return v11;
            }
            List<b> v12 = v(true);
            if (v12 != null) {
                return v12;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final void z(kp.a aVar, List<b> list, int i11) throws NotFoundException {
        int[] k11 = k();
        k11[0] = 0;
        k11[1] = 0;
        k11[2] = 0;
        k11[3] = 0;
        int m11 = aVar.m();
        if (i11 < 0) {
            i11 = list.isEmpty() ? 0 : list.get(list.size() - 1).b().b()[1];
        }
        boolean z11 = list.size() % 2 != 0;
        if (this.f100258n) {
            z11 = !z11;
        }
        boolean z12 = false;
        while (true) {
            if (i11 >= m11) {
                break;
            }
            boolean h11 = aVar.h(i11);
            boolean z13 = !h11;
            if (h11) {
                z12 = z13;
                break;
            } else {
                i11++;
                z12 = z13;
            }
        }
        int i12 = 0;
        boolean z14 = z12;
        int i13 = i11;
        while (i11 < m11) {
            if (aVar.h(i11) != z14) {
                k11[i12] = k11[i12] + 1;
            } else {
                if (i12 == 3) {
                    if (z11) {
                        I(k11);
                    }
                    if (xp.a.q(k11)) {
                        int[] iArr = this.f100257m;
                        iArr[0] = i13;
                        iArr[1] = i11;
                        return;
                    }
                    if (z11) {
                        I(k11);
                    }
                    i13 += k11[0] + k11[1];
                    k11[0] = k11[2];
                    k11[1] = k11[3];
                    k11[2] = 0;
                    k11[3] = 0;
                    i12--;
                } else {
                    i12++;
                }
                k11[i12] = 1;
                z14 = !z14;
            }
            i11++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
