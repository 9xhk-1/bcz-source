package com.mob.secverify.pure.core.ope.wo.c;

import kx.a0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f41065a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f41066b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, ho.c.f59556u, 19, 20, ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.B, ho.c.C, -1, -1, -1, -1, -1, -1, ho.c.D, ho.c.E, 28, ho.c.G, ho.c.H, 31, 32, 33, 34, 35, 36, s60.e.f88061c, 38, 39, 40, 41, 42, 43, 44, a0.f68904b, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r2 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        r1.write(r2 | ((r5 & 3) << 6));
        r2 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r8) {
        /*
            byte[] r8 = r8.getBytes()
            int r0 = r8.length
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            r2 = 0
        Lb:
            if (r2 >= r0) goto L87
        Ld:
            byte[] r3 = com.mob.secverify.pure.core.ope.wo.c.f.f41066b
            int r4 = r2 + 1
            r2 = r8[r2]
            r2 = r3[r2]
            r3 = -1
            if (r4 >= r0) goto L1d
            if (r2 == r3) goto L1b
            goto L1d
        L1b:
            r2 = r4
            goto Ld
        L1d:
            if (r2 != r3) goto L21
            goto L87
        L21:
            byte[] r5 = com.mob.secverify.pure.core.ope.wo.c.f.f41066b
            int r6 = r4 + 1
            r4 = r8[r4]
            r4 = r5[r4]
            if (r6 >= r0) goto L30
            if (r4 == r3) goto L2e
            goto L30
        L2e:
            r4 = r6
            goto L21
        L30:
            if (r4 != r3) goto L33
            goto L87
        L33:
            int r2 = r2 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r2 = r2 | r5
            r1.write(r2)
        L3d:
            int r2 = r6 + 1
            r5 = r8[r6]
            r6 = 61
            if (r5 != r6) goto L4a
            byte[] r8 = r1.toByteArray()
            return r8
        L4a:
            byte[] r7 = com.mob.secverify.pure.core.ope.wo.c.f.f41066b
            r5 = r7[r5]
            if (r2 >= r0) goto L55
            if (r5 == r3) goto L53
            goto L55
        L53:
            r6 = r2
            goto L3d
        L55:
            if (r5 != r3) goto L58
            goto L87
        L58:
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            r1.write(r4)
        L64:
            int r4 = r2 + 1
            r2 = r8[r2]
            if (r2 != r6) goto L6f
            byte[] r8 = r1.toByteArray()
            return r8
        L6f:
            byte[] r7 = com.mob.secverify.pure.core.ope.wo.c.f.f41066b
            r2 = r7[r2]
            if (r4 >= r0) goto L7a
            if (r2 == r3) goto L78
            goto L7a
        L78:
            r2 = r4
            goto L64
        L7a:
            if (r2 != r3) goto L7d
            goto L87
        L7d:
            r3 = r5 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            r1.write(r2)
            r2 = r4
            goto Lb
        L87:
            byte[] r8 = r1.toByteArray()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.wo.c.f.a(java.lang.String):byte[]");
    }
}
