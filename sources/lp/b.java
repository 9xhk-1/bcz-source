package lp;

import com.google.zxing.NotFoundException;
import com.google.zxing.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f71576b = 32;

    /* renamed from: a, reason: collision with root package name */
    public final kp.b f71577a;

    public b(kp.b bVar) {
        this.f71577a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0068 A[EDGE_INSN: B:67:0x0068->B:47:0x0068 BREAK  A[LOOP:3: B:39:0x0053->B:61:0x0053], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0031 A[EDGE_INSN: B:81:0x0031->B:21:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:75:0x001c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] a(int r5, int r6, int r7, int r8, boolean r9) {
        /*
            r4 = this;
            int r0 = r7 + r8
            int r0 = r0 / 2
            r1 = r0
        L5:
            if (r1 < r7) goto L3a
            kp.b r2 = r4.f71577a
            if (r9 == 0) goto L12
            boolean r2 = r2.e(r1, r5)
            if (r2 == 0) goto L1b
            goto L18
        L12:
            boolean r2 = r2.e(r5, r1)
            if (r2 == 0) goto L1b
        L18:
            int r1 = r1 + (-1)
            goto L5
        L1b:
            r2 = r1
        L1c:
            int r2 = r2 + (-1)
            if (r2 < r7) goto L31
            kp.b r3 = r4.f71577a
            if (r9 == 0) goto L2b
            boolean r3 = r3.e(r2, r5)
            if (r3 == 0) goto L1c
            goto L31
        L2b:
            boolean r3 = r3.e(r5, r2)
            if (r3 == 0) goto L1c
        L31:
            int r3 = r1 - r2
            if (r2 < r7) goto L3a
            if (r3 <= r6) goto L38
            goto L3a
        L38:
            r1 = r2
            goto L5
        L3a:
            int r1 = r1 + 1
        L3c:
            if (r0 >= r8) goto L71
            kp.b r7 = r4.f71577a
            if (r9 == 0) goto L49
            boolean r7 = r7.e(r0, r5)
            if (r7 == 0) goto L52
            goto L4f
        L49:
            boolean r7 = r7.e(r5, r0)
            if (r7 == 0) goto L52
        L4f:
            int r0 = r0 + 1
            goto L3c
        L52:
            r7 = r0
        L53:
            int r7 = r7 + 1
            if (r7 >= r8) goto L68
            kp.b r2 = r4.f71577a
            if (r9 == 0) goto L62
            boolean r2 = r2.e(r7, r5)
            if (r2 == 0) goto L53
            goto L68
        L62:
            boolean r2 = r2.e(r5, r7)
            if (r2 == 0) goto L53
        L68:
            int r2 = r7 - r0
            if (r7 >= r8) goto L71
            if (r2 <= r6) goto L6f
            goto L71
        L6f:
            r0 = r7
            goto L3c
        L71:
            int r0 = r0 + (-1)
            if (r0 <= r1) goto L7a
            int[] r5 = new int[]{r1, r0}
            return r5
        L7a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.b.a(int, int, int, int, boolean):int[]");
    }

    public l[] b() throws NotFoundException {
        int h11 = this.f71577a.h();
        int m11 = this.f71577a.m();
        int i11 = h11 / 2;
        int i12 = m11 / 2;
        int max = Math.max(1, h11 / 256);
        int max2 = Math.max(1, m11 / 256);
        int i13 = -max;
        int i14 = i12 / 2;
        int d11 = ((int) c(i12, 0, 0, m11, i11, i13, 0, h11, i14).d()) - 1;
        int i15 = i11 / 2;
        l c11 = c(i12, -max2, 0, m11, i11, 0, d11, h11, i15);
        int c12 = ((int) c11.c()) - 1;
        l c13 = c(i12, max2, c12, m11, i11, 0, d11, h11, i15);
        int c14 = ((int) c13.c()) + 1;
        l c15 = c(i12, 0, c12, c14, i11, max, d11, h11, i14);
        return new l[]{c(i12, 0, c12, c14, i11, i13, d11, ((int) c15.d()) + 1, i12 / 4), c11, c13, c15};
    }

    public final l c(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws NotFoundException {
        int[] iArr = null;
        int i21 = i11;
        int i22 = i15;
        while (i22 < i18 && i22 >= i17 && i21 < i14 && i21 >= i13) {
            int[] a11 = i12 == 0 ? a(i22, i19, i13, i14, true) : a(i21, i19, i17, i18, false);
            if (a11 == null) {
                if (iArr == null) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (i12 == 0) {
                    int i23 = i22 - i16;
                    int i24 = iArr[0];
                    if (i24 >= i11) {
                        return new l(iArr[1], i23);
                    }
                    if (iArr[1] > i11) {
                        return new l(iArr[i16 <= 0 ? (char) 1 : (char) 0], i23);
                    }
                    return new l(i24, i23);
                }
                int i25 = i21 - i12;
                int i26 = iArr[0];
                if (i26 >= i15) {
                    return new l(i25, iArr[1]);
                }
                if (iArr[1] > i15) {
                    return new l(i25, iArr[i12 >= 0 ? (char) 1 : (char) 0]);
                }
                return new l(i25, i26);
            }
            i22 += i16;
            i21 += i12;
            iArr = a11;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
