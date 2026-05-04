package dq;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.l;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final float f48096c = 0.42f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f48097d = 0.8f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f48100g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f48101h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f48102i = 25;

    /* renamed from: j, reason: collision with root package name */
    public static final int f48103j = 5;

    /* renamed from: k, reason: collision with root package name */
    public static final int f48104k = 10;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f48094a = {0, 4, 1, 5};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f48095b = {6, 2, 7, 3};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f48098e = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f48099f = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static void a(l[] lVarArr, l[] lVarArr2, int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            lVarArr[iArr[i11]] = lVarArr2[i11];
        }
    }

    public static b b(com.google.zxing.b bVar, Map<DecodeHintType, ?> map, boolean z11) throws NotFoundException {
        kp.b b11 = bVar.b();
        List<l[]> c11 = c(z11, b11);
        if (c11.isEmpty()) {
            b11 = b11.clone();
            b11.p();
            c11 = c(z11, b11);
        }
        return new b(b11, c11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r3.hasNext() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r4 = (com.google.zxing.l[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r2 = (int) java.lang.Math.max(r2, r7.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r4 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r2 = java.lang.Math.max(r2, (int) r4.d());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.google.zxing.l[]> c(boolean r8, kp.b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            r4 = r3
        L9:
            int r5 = r9.h()
            if (r2 >= r5) goto L77
            com.google.zxing.l[] r3 = f(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L4f
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L4f
            if (r4 == 0) goto L77
            java.util.Iterator r3 = r0.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            com.google.zxing.l[] r4 = (com.google.zxing.l[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L3d
            float r2 = (float) r2
            float r7 = r7.d()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L3d:
            r4 = r4[r5]
            if (r4 == 0) goto L23
            float r4 = r4.d()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L23
        L4b:
            int r2 = r2 + 5
            r3 = r1
            goto L8
        L4f:
            r0.add(r3)
            if (r8 == 0) goto L77
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L68
            float r4 = r4.c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.d()
        L64:
            int r2 = (int) r2
            r3 = r4
            r4 = r6
            goto L9
        L68:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.d()
            goto L64
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.a.c(boolean, kp.b):java.util.List");
    }

    public static int[] d(kp.b bVar, int i11, int i12, int i13, boolean z11, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i14 = 0;
        while (bVar.e(i11, i12) && i11 > 0) {
            int i15 = i14 + 1;
            if (i14 >= 3) {
                break;
            }
            i11--;
            i14 = i15;
        }
        int length = iArr.length;
        boolean z12 = z11;
        int i16 = 0;
        int i17 = i11;
        while (i11 < i13) {
            if (bVar.e(i11, i12) != z12) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else {
                    if (g(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i17, i11};
                    }
                    i17 += iArr2[0] + iArr2[1];
                    int i18 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i18);
                    iArr2[i18] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z12 = !z12;
            }
            i11++;
        }
        if (i16 != length - 1 || g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i17, i11 - 1};
    }

    public static l[] e(kp.b bVar, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15;
        boolean z11;
        int[] iArr2;
        l[] lVarArr = new l[4];
        int[] iArr3 = iArr;
        int[] iArr4 = new int[iArr3.length];
        int i16 = i13;
        while (true) {
            if (i16 >= i11) {
                i15 = i16;
                z11 = false;
                break;
            }
            int[] d11 = d(bVar, i14, i16, i12, false, iArr3, iArr4);
            if (d11 != null) {
                do {
                    i15 = i16;
                    iArr2 = d11;
                    if (i15 <= 0) {
                        break;
                    }
                    i16 = i15 - 1;
                    d11 = d(bVar, i14, i16, i12, false, iArr, iArr4);
                } while (d11 != null);
                float f11 = i15;
                lVarArr[0] = new l(iArr2[0], f11);
                lVarArr[1] = new l(iArr2[1], f11);
                z11 = true;
            } else {
                i16 += 5;
                iArr3 = iArr;
            }
        }
        int i17 = i15 + 1;
        if (z11) {
            int[] iArr5 = {(int) lVarArr[0].c(), (int) lVarArr[1].c()};
            int i18 = i17;
            int i19 = 0;
            while (i18 < i11) {
                int[] d12 = d(bVar, iArr5[0], i18, i12, false, iArr, iArr4);
                if (d12 != null && Math.abs(iArr5[0] - d12[0]) < 5 && Math.abs(iArr5[1] - d12[1]) < 5) {
                    iArr5 = d12;
                    i19 = 0;
                } else {
                    if (i19 > 25) {
                        break;
                    }
                    i19++;
                }
                i18++;
            }
            i17 = i18 - (i19 + 1);
            float f12 = i17;
            lVarArr[2] = new l(iArr5[0], f12);
            lVarArr[3] = new l(iArr5[1], f12);
        }
        if (i17 - i15 < 10) {
            Arrays.fill(lVarArr, (Object) null);
        }
        return lVarArr;
    }

    public static l[] f(kp.b bVar, int i11, int i12) {
        int h11 = bVar.h();
        int m11 = bVar.m();
        l[] lVarArr = new l[8];
        int i13 = i11;
        int i14 = i12;
        a(lVarArr, e(bVar, h11, m11, i13, i14, f48098e), f48094a);
        l lVar = lVarArr[4];
        if (lVar != null) {
            int c11 = (int) lVar.c();
            i13 = (int) lVarArr[4].d();
            i14 = c11;
        }
        a(lVarArr, e(bVar, h11, m11, i13, i14, f48099f), f48095b);
        return lVarArr;
    }

    public static float g(int[] iArr, int[] iArr2, float f11) {
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            i11 += iArr[i13];
            i12 += iArr2[i13];
        }
        if (i11 < i12) {
            return Float.POSITIVE_INFINITY;
        }
        float f12 = i11;
        float f13 = f12 / i12;
        float f14 = f11 * f13;
        float f15 = 0.0f;
        for (int i14 = 0; i14 < length; i14++) {
            float f16 = iArr2[i14] * f13;
            float f17 = iArr[i14];
            float f18 = f17 > f16 ? f17 - f16 : f16 - f17;
            if (f18 > f14) {
                return Float.POSITIVE_INFINITY;
            }
            f15 += f18;
        }
        return f15 / f12;
    }
}
