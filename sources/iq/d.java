package iq;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f62675a = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final int f62676b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f62677c = 40;

    /* renamed from: d, reason: collision with root package name */
    public static final int f62678d = 10;

    public static int a(b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    public static int b(b bVar, boolean z11) {
        int d11 = z11 ? bVar.d() : bVar.e();
        int e11 = z11 ? bVar.e() : bVar.d();
        byte[][] c11 = bVar.c();
        int i11 = 0;
        for (int i12 = 0; i12 < d11; i12++) {
            byte b11 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < e11; i14++) {
                byte b12 = z11 ? c11[i12][i14] : c11[i14][i12];
                if (b12 == b11) {
                    i13++;
                } else {
                    if (i13 >= 5) {
                        i11 += i13 - 2;
                    }
                    i13 = 1;
                    b11 = b12;
                }
            }
            if (i13 >= 5) {
                i11 += i13 - 2;
            }
        }
        return i11;
    }

    public static int c(b bVar) {
        byte[][] c11 = bVar.c();
        int e11 = bVar.e();
        int d11 = bVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < d11 - 1; i12++) {
            byte[] bArr = c11[i12];
            int i13 = 0;
            while (i13 < e11 - 1) {
                byte b11 = bArr[i13];
                int i14 = i13 + 1;
                if (b11 == bArr[i14]) {
                    byte[] bArr2 = c11[i12 + 1];
                    if (b11 == bArr2[i13] && b11 == bArr2[i14]) {
                        i11++;
                    }
                }
                i13 = i14;
            }
        }
        return i11 * 3;
    }

    public static int d(b bVar) {
        byte[][] c11 = bVar.c();
        int e11 = bVar.e();
        int d11 = bVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < d11; i12++) {
            for (int i13 = 0; i13 < e11; i13++) {
                byte[] bArr = c11[i12];
                int i14 = i13 + 6;
                if (i14 < e11 && bArr[i13] == 1 && bArr[i13 + 1] == 0 && bArr[i13 + 2] == 1 && bArr[i13 + 3] == 1 && bArr[i13 + 4] == 1 && bArr[i13 + 5] == 0 && bArr[i14] == 1 && (g(bArr, i13 - 4, i13) || g(bArr, i13 + 7, i13 + 11))) {
                    i11++;
                }
                int i15 = i12 + 6;
                if (i15 < d11 && c11[i12][i13] == 1 && c11[i12 + 1][i13] == 0 && c11[i12 + 2][i13] == 1 && c11[i12 + 3][i13] == 1 && c11[i12 + 4][i13] == 1 && c11[i12 + 5][i13] == 0 && c11[i15][i13] == 1 && (h(c11, i13, i12 - 4, i12) || h(c11, i13, i12 + 7, i12 + 11))) {
                    i11++;
                }
            }
        }
        return i11 * 40;
    }

    public static int e(b bVar) {
        byte[][] c11 = bVar.c();
        int e11 = bVar.e();
        int d11 = bVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < d11; i12++) {
            byte[] bArr = c11[i12];
            for (int i13 = 0; i13 < e11; i13++) {
                if (bArr[i13] == 1) {
                    i11++;
                }
            }
        }
        int d12 = bVar.d() * bVar.e();
        return ((Math.abs((i11 << 1) - d12) * 10) / d12) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L30;
                case 1: goto L31;
                case 2: goto L38;
                case 3: goto L34;
                case 4: goto L2c;
                case 5: goto L25;
                case 6: goto L1e;
                case 7: goto L14;
                default: goto L4;
            }
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid mask pattern: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L14:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
        L1c:
            r1 = r1 & r0
            goto L3a
        L1e:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L1c
        L25:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L3a
        L2c:
            int r3 = r3 / 2
            int r2 = r2 / 3
        L30:
            int r3 = r3 + r2
        L31:
            r1 = r3 & 1
            goto L3a
        L34:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L3a
        L38:
            int r1 = r2 % 3
        L3a:
            if (r1 != 0) goto L3d
            return r0
        L3d:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: iq.d.f(int, int, int):boolean");
    }

    public static boolean g(byte[] bArr, int i11, int i12) {
        int min = Math.min(i12, bArr.length);
        for (int max = Math.max(i11, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(byte[][] bArr, int i11, int i12, int i13) {
        int min = Math.min(i13, bArr.length);
        for (int max = Math.max(i12, 0); max < min; max++) {
            if (bArr[max][i11] == 1) {
                return false;
            }
        }
        return true;
    }
}
