package bq;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.l;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7219a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7220b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7221c = 512;

    /* renamed from: d, reason: collision with root package name */
    public static final cq.a f7222d = new cq.a();

    public static c a(h hVar) throws NotFoundException {
        int[] j11;
        if (hVar == null || (j11 = hVar.j()) == null) {
            return null;
        }
        int p11 = p(j11);
        int i11 = 0;
        int i12 = 0;
        for (int i13 : j11) {
            i12 += p11 - i13;
            if (i13 > 0) {
                break;
            }
        }
        d[] d11 = hVar.d();
        for (int i14 = 0; i12 > 0 && d11[i14] == null; i14++) {
            i12--;
        }
        for (int length = j11.length - 1; length >= 0; length--) {
            int i15 = j11[length];
            i11 += p11 - i15;
            if (i15 > 0) {
                break;
            }
        }
        for (int length2 = d11.length - 1; i11 > 0 && d11[length2] == null; length2--) {
            i11--;
        }
        return hVar.a().a(i12, i11, hVar.k());
    }

    public static void b(f fVar, b[][] bVarArr) throws NotFoundException {
        b bVar = bVarArr[0][1];
        int[] b11 = bVar.b();
        int j11 = (fVar.j() * fVar.l()) - r(fVar.k());
        if (b11.length != 0) {
            if (b11[0] != j11) {
                bVar.c(j11);
            }
        } else {
            if (j11 <= 0 || j11 > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            bVar.c(j11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(kp.b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.e(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.j.c(kp.b, int, int, boolean, int, int):int");
    }

    public static boolean d(int i11, int i12, int i13) {
        return i12 + (-2) <= i11 && i11 <= i13 + 2;
    }

    public static int e(int[] iArr, int[] iArr2, int i11) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i11 / 2) + 3) && i11 >= 0 && i11 <= 512) {
            return f7222d.a(iArr, i11, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    public static b[][] f(f fVar) {
        int c11;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, fVar.l(), fVar.j() + 2);
        for (b[] bVarArr2 : bVarArr) {
            int i11 = 0;
            while (true) {
                if (i11 < bVarArr2.length) {
                    bVarArr2[i11] = new b();
                    i11++;
                }
            }
        }
        int i12 = 0;
        for (g gVar : fVar.o()) {
            if (gVar != null) {
                for (d dVar : gVar.d()) {
                    if (dVar != null && (c11 = dVar.c()) >= 0 && c11 < bVarArr.length) {
                        bVarArr[c11][i12].c(dVar.e());
                    }
                }
            }
            i12++;
        }
        return bVarArr;
    }

    public static kp.d g(f fVar) throws FormatException, ChecksumException, NotFoundException {
        b[][] f11 = f(fVar);
        b(fVar, f11);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[fVar.l() * fVar.j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 0; i11 < fVar.l(); i11++) {
            int i12 = 0;
            while (i12 < fVar.j()) {
                int i13 = i12 + 1;
                int[] b11 = f11[i11][i13].b();
                int j11 = (fVar.j() * i11) + i12;
                if (b11.length == 0) {
                    arrayList.add(Integer.valueOf(j11));
                } else if (b11.length == 1) {
                    iArr[j11] = b11[0];
                } else {
                    arrayList3.add(Integer.valueOf(j11));
                    arrayList2.add(b11);
                }
                i12 = i13;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i14 = 0; i14 < size; i14++) {
            iArr2[i14] = (int[]) arrayList2.get(i14);
        }
        return h(fVar.k(), iArr, aq.a.c(arrayList), aq.a.c(arrayList3), iArr2);
    }

    public static kp.d h(int i11, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws FormatException, ChecksumException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i12 = 100;
        while (true) {
            int i13 = i12 - 1;
            if (i12 <= 0) {
                throw ChecksumException.getChecksumInstance();
            }
            for (int i14 = 0; i14 < length; i14++) {
                iArr[iArr3[i14]] = iArr4[i14][iArr5[i14]];
            }
            try {
                return j(iArr, i11, iArr2);
            } catch (ChecksumException unused) {
                if (length == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        break;
                    }
                    int i16 = iArr5[i15];
                    if (i16 < iArr4[i15].length - 1) {
                        iArr5[i15] = i16 + 1;
                        break;
                    }
                    iArr5[i15] = 0;
                    if (i15 == length - 1) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    i15++;
                }
                i12 = i13;
            }
        }
    }

    public static kp.d i(kp.b bVar, l lVar, l lVar2, l lVar3, l lVar4, int i11, int i12) throws NotFoundException, FormatException, ChecksumException {
        c cVar;
        g hVar;
        g gVar;
        int i13;
        h hVar2 = null;
        boolean z11 = false;
        c cVar2 = new c(bVar, lVar, lVar2, lVar3, lVar4);
        h hVar3 = null;
        f fVar = null;
        int i14 = 0;
        while (i14 < 2) {
            h s11 = lVar != null ? s(bVar, cVar2, lVar, true, i11, i12) : hVar2;
            if (lVar3 != null) {
                hVar3 = s(bVar, cVar2, lVar3, false, i11, i12);
            }
            cVar = cVar2;
            fVar = v(s11, hVar3);
            if (fVar == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i14 != 0 || fVar.m() == null || (fVar.m().g() >= cVar.g() && fVar.m().e() <= cVar.e())) {
                fVar.p(cVar);
                hVar2 = s11;
                break;
            }
            cVar2 = fVar.m();
            i14++;
            hVar2 = s11;
        }
        cVar = cVar2;
        f fVar2 = fVar;
        int j11 = fVar2.j() + 1;
        fVar2.q(0, hVar2);
        fVar2.q(j11, hVar3);
        boolean z12 = hVar2 != null;
        int i15 = i11;
        int i16 = i12;
        int i17 = 1;
        while (i17 <= j11) {
            int i18 = z12 ? i17 : j11 - i17;
            if (fVar2.n(i18) == null) {
                if (i18 == 0 || i18 == j11) {
                    hVar = new h(cVar, i18 == 0 ? true : z11);
                } else {
                    hVar = new g(cVar);
                }
                fVar2.q(i18, hVar);
                int i19 = -1;
                int i21 = i15;
                int i22 = i16;
                int g11 = cVar.g();
                int i23 = -1;
                while (g11 <= cVar.e()) {
                    int t11 = t(fVar2, i18, g11, z12);
                    if (t11 < 0 || t11 > cVar.d()) {
                        if (i23 != i19) {
                            t11 = i23;
                        } else {
                            gVar = hVar;
                            i13 = i19;
                            g11++;
                            hVar = gVar;
                            i19 = i13;
                        }
                    }
                    gVar = hVar;
                    i13 = i19;
                    int i24 = t11;
                    d k11 = k(bVar, cVar.f(), cVar.d(), z12, i24, g11, i21, i22);
                    if (k11 != null) {
                        gVar.f(g11, k11);
                        i21 = Math.min(i21, k11.f());
                        i22 = Math.max(i22, k11.f());
                        i23 = i24;
                    }
                    g11++;
                    hVar = gVar;
                    i19 = i13;
                }
                i15 = i21;
                i16 = i22;
            }
            i17++;
            z11 = false;
        }
        return g(fVar2);
    }

    public static kp.d j(int[] iArr, int i11, int[] iArr2) throws FormatException, ChecksumException {
        if (iArr.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int i12 = 1 << (i11 + 1);
        int e11 = e(iArr, iArr2, i12);
        x(iArr, i12);
        kp.d b11 = e.b(iArr, String.valueOf(i11));
        b11.m(Integer.valueOf(e11));
        b11.l(Integer.valueOf(iArr2.length));
        return b11;
    }

    public static d k(kp.b bVar, int i11, int i12, boolean z11, int i13, int i14, int i15, int i16) {
        int i17;
        int d11;
        int b11;
        int c11 = c(bVar, i11, i12, z11, i13, i14);
        int[] q11 = q(bVar, i11, i12, z11, c11, i14);
        if (q11 == null) {
            return null;
        }
        int d12 = lp.a.d(q11);
        if (z11) {
            i17 = c11 + d12;
        } else {
            for (int i18 = 0; i18 < q11.length / 2; i18++) {
                int i19 = q11[i18];
                q11[i18] = q11[(q11.length - 1) - i18];
                q11[(q11.length - 1) - i18] = i19;
            }
            c11 -= d12;
            i17 = c11;
        }
        if (d(d12, i15, i16) && (b11 = aq.a.b((d11 = i.d(q11)))) != -1) {
            return new d(c11, i17, n(d11), b11);
        }
        return null;
    }

    public static a l(h hVar, h hVar2) {
        a i11;
        a i12;
        if (hVar == null || (i11 = hVar.i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.i();
        }
        if (hVar2 == null || (i12 = hVar2.i()) == null || i11.a() == i12.a() || i11.b() == i12.b() || i11.c() == i12.c()) {
            return i11;
        }
        return null;
    }

    public static int[] m(int i11) {
        int[] iArr = new int[8];
        int i12 = 0;
        int i13 = 7;
        while (true) {
            int i14 = i11 & 1;
            if (i14 != i12) {
                i13--;
                if (i13 < 0) {
                    return iArr;
                }
                i12 = i14;
            }
            iArr[i13] = iArr[i13] + 1;
            i11 >>= 1;
        }
    }

    public static int n(int i11) {
        return o(m(i11));
    }

    public static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    public static int p(int[] iArr) {
        int i11 = -1;
        for (int i12 : iArr) {
            i11 = Math.max(i11, i12);
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[EDGE_INSN: B:17:0x0027->B:18:0x0027 BREAK  A[LOOP:0: B:5:0x000c->B:13:0x000c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] q(kp.b r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = r2
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.e(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.j.q(kp.b, int, int, boolean, int, int):int[]");
    }

    public static int r(int i11) {
        return 2 << i11;
    }

    public static h s(kp.b bVar, c cVar, l lVar, boolean z11, int i11, int i12) {
        h hVar = new h(cVar, z11);
        int i13 = 0;
        while (i13 < 2) {
            int i14 = i13 == 0 ? 1 : -1;
            int c11 = (int) lVar.c();
            for (int d11 = (int) lVar.d(); d11 <= cVar.e() && d11 >= cVar.g(); d11 += i14) {
                d k11 = k(bVar, 0, bVar.m(), z11, c11, d11, i11, i12);
                if (k11 != null) {
                    hVar.f(d11, k11);
                    c11 = z11 ? k11.d() : k11.b();
                }
            }
            i13++;
        }
        return hVar;
    }

    public static int t(f fVar, int i11, int i12, boolean z11) {
        int i13 = z11 ? 1 : -1;
        int i14 = i11 - i13;
        d b11 = u(fVar, i14) ? fVar.n(i14).b(i12) : null;
        if (b11 != null) {
            return z11 ? b11.b() : b11.d();
        }
        d c11 = fVar.n(i11).c(i12);
        if (c11 != null) {
            return z11 ? c11.d() : c11.b();
        }
        if (u(fVar, i14)) {
            c11 = fVar.n(i14).c(i12);
        }
        if (c11 != null) {
            return z11 ? c11.b() : c11.d();
        }
        int i15 = 0;
        while (true) {
            i11 -= i13;
            if (!u(fVar, i11)) {
                c m11 = fVar.m();
                return z11 ? m11.f() : m11.d();
            }
            for (d dVar : fVar.n(i11).d()) {
                if (dVar != null) {
                    return (z11 ? dVar.b() : dVar.d()) + (i13 * i15 * (dVar.b() - dVar.d()));
                }
            }
            i15++;
        }
    }

    public static boolean u(f fVar, int i11) {
        return i11 >= 0 && i11 <= fVar.j() + 1;
    }

    public static f v(h hVar, h hVar2) throws NotFoundException {
        a l11;
        if ((hVar == null && hVar2 == null) || (l11 = l(hVar, hVar2)) == null) {
            return null;
        }
        return new f(l11, c.j(a(hVar), a(hVar2)));
    }

    public static String w(b[][] bVarArr) {
        Formatter formatter = new Formatter();
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            try {
                formatter.format("Row %2d: ", Integer.valueOf(i11));
                int i12 = 0;
                while (true) {
                    b[] bVarArr2 = bVarArr[i11];
                    if (i12 < bVarArr2.length) {
                        b bVar = bVarArr2[i12];
                        if (bVar.b().length == 0) {
                            formatter.format("        ", null);
                        } else {
                            formatter.format("%4d(%2d)", Integer.valueOf(bVar.b()[0]), bVar.a(bVar.b()[0]));
                        }
                        i12++;
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }

    public static void x(int[] iArr, int i11) throws FormatException {
        if (iArr.length < 4) {
            throw FormatException.getFormatInstance();
        }
        int i12 = iArr[0];
        if (i12 > iArr.length) {
            throw FormatException.getFormatInstance();
        }
        if (i12 == 0) {
            if (i11 >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            iArr[0] = iArr.length - i11;
        }
    }
}
