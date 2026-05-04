package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u {
    public static int a(int i11) {
        if (i11 > -12) {
            return -1;
        }
        return i11;
    }

    public static int b(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    public static int c(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }

    public static int d(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 == 0) {
            return a(b11);
        }
        if (i13 == 1) {
            return b(b11, bArr[i11]);
        }
        if (i13 == 2) {
            return c(b11, bArr[i11], bArr[i11 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public static boolean f(byte[] bArr, int i11, int i12) {
        return h(bArr, i11, i12) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r7[r8] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (r7[r8] > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
    
        if (r7[r6] > (-65)) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(int r6, byte[] r7, int r8, int r9) {
        /*
            if (r6 == 0) goto L86
            if (r8 < r9) goto L5
            return r6
        L5:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1c
            r6 = -62
            if (r0 < r6) goto L1b
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
            goto L1b
        L18:
            r8 = r6
            goto L86
        L1b:
            return r2
        L1c:
            r4 = -16
            if (r0 >= r4) goto L49
            int r6 = r6 >> 8
            int r6 = ~r6
            byte r6 = (byte) r6
            if (r6 != 0) goto L34
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r6 < r9) goto L31
            int r6 = b(r0, r8)
            return r6
        L31:
            r5 = r8
            r8 = r6
            r6 = r5
        L34:
            if (r6 > r3) goto L48
            r4 = -96
            if (r0 != r1) goto L3c
            if (r6 < r4) goto L48
        L3c:
            r1 = -19
            if (r0 != r1) goto L42
            if (r6 >= r4) goto L48
        L42:
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
        L48:
            return r2
        L49:
            int r1 = r6 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5c
            int r6 = r8 + 1
            r1 = r7[r8]
            if (r6 < r9) goto L5a
            int r6 = b(r0, r1)
            return r6
        L5a:
            r8 = 0
            goto L62
        L5c:
            int r6 = r6 >> 16
            byte r6 = (byte) r6
            r5 = r8
            r8 = r6
            r6 = r5
        L62:
            if (r8 != 0) goto L72
            int r8 = r6 + 1
            r6 = r7[r6]
            if (r8 < r9) goto L6f
            int r6 = c(r0, r1, r6)
            return r6
        L6f:
            r5 = r8
            r8 = r6
            r6 = r5
        L72:
            if (r1 > r3) goto L85
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L85
            if (r8 > r3) goto L85
            int r8 = r6 + 1
            r6 = r7[r6]
            if (r6 <= r3) goto L86
        L85:
            return r2
        L86:
            int r6 = h(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.u.g(int, byte[], int, int):int");
    }

    public static int h(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return 0;
        }
        return i(bArr, i11, i12);
    }

    public static int i(byte[] bArr, int i11, int i12) {
        while (i11 < i12) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            if (b11 < 0) {
                if (b11 < -32) {
                    if (i13 >= i12) {
                        return b11;
                    }
                    if (b11 >= -62) {
                        i11 += 2;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (b11 >= -16) {
                    if (i13 >= i12 - 2) {
                        return d(bArr, i13, i12);
                    }
                    int i14 = i11 + 2;
                    byte b12 = bArr[i13];
                    if (b12 <= -65 && (((b11 << 28) + (b12 + 112)) >> 30) == 0) {
                        int i15 = i11 + 3;
                        if (bArr[i14] <= -65) {
                            i11 += 4;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i13 >= i12 - 1) {
                    return d(bArr, i13, i12);
                }
                int i16 = i11 + 2;
                byte b13 = bArr[i13];
                if (b13 <= -65 && ((b11 != -32 || b13 >= -96) && (b11 != -19 || b13 < -96))) {
                    i11 += 3;
                    if (bArr[i16] > -65) {
                    }
                }
                return -1;
            }
            i11 = i13;
        }
        return 0;
    }
}
