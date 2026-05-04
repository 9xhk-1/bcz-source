package xp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.k;
import com.google.zxing.l;
import com.google.zxing.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import wp.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e extends a {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f98292m = {1, 10, 34, 70, 126};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f98293n = {4, 20, 48, 81};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f98294o = {0, 161, 961, 2015, 2715};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f98295p = {0, 336, 1036, 1516};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f98296q = {8, 6, 4, 3, 1};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f98297r = {2, 4, 6, 8};

    /* renamed from: s, reason: collision with root package name */
    public static final int[][] f98298s = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: k, reason: collision with root package name */
    public final List<d> f98299k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final List<d> f98300l = new ArrayList();

    public static void s(Collection<d> collection, d dVar) {
        if (dVar == null) {
            return;
        }
        for (d dVar2 : collection) {
            if (dVar2.b() == dVar.b()) {
                dVar2.e();
                return;
            }
        }
        collection.add(dVar);
    }

    public static boolean u(d dVar, d dVar2) {
        int a11 = (dVar.a() + (dVar2.a() * 16)) % 79;
        int c11 = (dVar.d().c() * 9) + dVar2.d().c();
        if (c11 > 72) {
            c11--;
        }
        if (c11 > 8) {
            c11--;
        }
        return a11 == c11;
    }

    public static k v(d dVar, d dVar2) {
        String valueOf = String.valueOf((dVar.b() * 4537077) + dVar2.b());
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        int i11 = 0;
        for (int i12 = 0; i12 < 13; i12++) {
            int charAt = sb2.charAt(i12) - '0';
            if ((i12 & 1) == 0) {
                charAt *= 3;
            }
            i11 += charAt;
        }
        int i13 = 10 - (i11 % 10);
        if (i13 == 10) {
            i13 = 0;
        }
        sb2.append(i13);
        l[] a11 = dVar.d().a();
        l[] a12 = dVar2.d().a();
        return new k(sb2.toString(), null, new l[]{a11[0], a11[1], a12[0], a12[1]}, BarcodeFormat.RSS_14);
    }

    @Override // wp.r
    public k b(int i11, kp.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        s(this.f98299k, x(aVar, false, i11, map));
        aVar.q();
        s(this.f98300l, x(aVar, true, i11, map));
        aVar.q();
        for (d dVar : this.f98299k) {
            if (dVar.c() > 1) {
                for (d dVar2 : this.f98300l) {
                    if (dVar2.c() > 1 && u(dVar, dVar2)) {
                        return v(dVar, dVar2);
                    }
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // wp.r, com.google.zxing.j
    public void reset() {
        this.f98299k.clear();
        this.f98300l.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0028, code lost:
    
        if (r1 < 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x002a, code lost:
    
        r2 = true;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x002d, code lost:
    
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0044, code lost:
    
        if (r1 < 4) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(boolean r10, int r11) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xp.e.t(boolean, int):void");
    }

    public final b w(kp.a aVar, c cVar, boolean z11) throws NotFoundException {
        int[] j11 = j();
        for (int i11 = 0; i11 < j11.length; i11++) {
            j11[i11] = 0;
        }
        if (z11) {
            r.g(aVar, cVar.b()[0], j11);
        } else {
            r.f(aVar, cVar.b()[1] + 1, j11);
            int i12 = 0;
            for (int length = j11.length - 1; i12 < length; length--) {
                int i13 = j11[i12];
                j11[i12] = j11[length];
                j11[length] = i13;
                i12++;
            }
        }
        int i14 = z11 ? 16 : 15;
        float d11 = lp.a.d(j11) / i14;
        int[] n11 = n();
        int[] l11 = l();
        float[] o11 = o();
        float[] m11 = m();
        for (int i15 = 0; i15 < j11.length; i15++) {
            float f11 = j11[i15] / d11;
            int i16 = (int) (0.5f + f11);
            if (i16 <= 0) {
                i16 = 1;
            } else if (i16 > 8) {
                i16 = 8;
            }
            int i17 = i15 / 2;
            if ((i15 & 1) == 0) {
                n11[i17] = i16;
                o11[i17] = f11 - i16;
            } else {
                l11[i17] = i16;
                m11[i17] = f11 - i16;
            }
        }
        t(z11, i14);
        int i18 = 0;
        int i19 = 0;
        for (int length2 = n11.length - 1; length2 >= 0; length2--) {
            int i21 = n11[length2];
            i18 = (i18 * 9) + i21;
            i19 += i21;
        }
        int i22 = 0;
        int i23 = 0;
        for (int length3 = l11.length - 1; length3 >= 0; length3--) {
            int i24 = l11[length3];
            i22 = (i22 * 9) + i24;
            i23 += i24;
        }
        int i25 = i18 + (i22 * 3);
        if (!z11) {
            if ((i23 & 1) != 0 || i23 > 10 || i23 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i26 = (10 - i23) / 2;
            int i27 = f98297r[i26];
            return new b((f.b(l11, 9 - i27, false) * f98293n[i26]) + f.b(n11, i27, true) + f98295p[i26], i25);
        }
        if ((i19 & 1) != 0 || i19 > 12 || i19 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i28 = (12 - i19) / 2;
        int i29 = f98296q[i28];
        return new b((f.b(n11, i29, false) * f98292m[i28]) + f.b(l11, 9 - i29, true) + f98294o[i28], i25);
    }

    public final d x(kp.a aVar, boolean z11, int i11, Map<DecodeHintType, ?> map) {
        try {
            c z12 = z(aVar, i11, z11, y(aVar, z11));
            m mVar = map == null ? null : (m) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (mVar != null) {
                float f11 = (r1[0] + r1[1]) / 2.0f;
                if (z11) {
                    f11 = (aVar.m() - 1) - f11;
                }
                mVar.a(new l(f11, i11));
            }
            b w11 = w(aVar, z12, true);
            b w12 = w(aVar, z12, false);
            return new d((w11.b() * 1597) + w12.b(), w11.a() + (w12.a() * 4), z12);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    public final int[] y(kp.a aVar, boolean z11) throws NotFoundException {
        int[] k11 = k();
        k11[0] = 0;
        k11[1] = 0;
        k11[2] = 0;
        k11[3] = 0;
        int m11 = aVar.m();
        int i11 = 0;
        boolean z12 = false;
        while (i11 < m11) {
            z12 = !aVar.h(i11);
            if (z11 == z12) {
                break;
            }
            i11++;
        }
        int i12 = 0;
        int i13 = i11;
        while (i11 < m11) {
            if (aVar.h(i11) != z12) {
                k11[i12] = k11[i12] + 1;
            } else {
                if (i12 != 3) {
                    i12++;
                } else {
                    if (a.q(k11)) {
                        return new int[]{i13, i11};
                    }
                    i13 += k11[0] + k11[1];
                    k11[0] = k11[2];
                    k11[1] = k11[3];
                    k11[2] = 0;
                    k11[3] = 0;
                    i12--;
                }
                k11[i12] = 1;
                z12 = !z12;
            }
            i11++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final c z(kp.a aVar, int i11, boolean z11, int[] iArr) throws NotFoundException {
        int i12;
        boolean h11 = aVar.h(iArr[0]);
        int i13 = iArr[0] - 1;
        while (i13 >= 0 && h11 != aVar.h(i13)) {
            i13--;
        }
        int i14 = i13 + 1;
        int i15 = iArr[0] - i14;
        int[] k11 = k();
        System.arraycopy(k11, 0, k11, 1, k11.length - 1);
        k11[0] = i15;
        int r11 = a.r(k11, f98298s);
        int i16 = iArr[1];
        if (z11) {
            int m11 = (aVar.m() - 1) - i14;
            i16 = (aVar.m() - 1) - i16;
            i12 = m11;
        } else {
            i12 = i14;
        }
        return new c(r11, new int[]{i14, iArr[1]}, i12, i16, i11);
    }
}
