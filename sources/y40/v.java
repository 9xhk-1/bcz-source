package y40;

import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v {
    public static final int a(@m80.k t tVar, byte b11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(tVar, "<this>");
        if (i11 < 0 || i11 >= tVar.n()) {
            throw new IllegalArgumentException(String.valueOf(i11).toString());
        }
        if (i11 > i12 || i12 > tVar.n()) {
            throw new IllegalArgumentException(String.valueOf(i12).toString());
        }
        int h11 = tVar.h();
        byte[] b12 = tVar.b(true);
        while (i11 < i12) {
            if (b12[h11 + i11] == b11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r11 = r11 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(@m80.k y40.t r9, @m80.k byte[] r10, int r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r9.n()
            int r1 = r10.length
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r2 = 0
            r2 = r10[r2]
            byte[] r3 = r9.b(r1)
        L19:
            r4 = -1
            if (r11 >= r0) goto L3a
            int r5 = a(r9, r2, r11, r0)
            if (r5 >= 0) goto L23
            return r4
        L23:
            int r4 = r10.length
            r6 = r1
        L25:
            if (r6 >= r4) goto L39
            int r7 = r9.h()
            int r7 = r7 + r5
            int r7 = r7 + r6
            r7 = r3[r7]
            r8 = r10[r6]
            if (r7 == r8) goto L36
            int r11 = r11 + 1
            goto L19
        L36:
            int r6 = r6 + 1
            goto L25
        L39:
            return r5
        L3a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.v.b(y40.t, byte[], int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r13 = r13 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(@m80.k y40.t r11, @m80.k byte[] r12, int r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r12, r0)
            r0 = 0
            r1 = r12[r0]
        Ld:
            r2 = -1
            if (r13 < 0) goto L52
            int r3 = r11.n()
            if (r13 >= r3) goto L52
            int r3 = r11.n()
            int r3 = a(r11, r1, r13, r3)
            if (r3 >= 0) goto L21
            return r2
        L21:
            r3 = 1
            byte[] r4 = r11.b(r3)
            int r5 = r12.length
            r8 = r11
            r7 = r13
            r6 = r0
        L2a:
            if (r6 >= r5) goto L51
            r9 = r12[r6]
            int r10 = r8.n()
            if (r7 != r10) goto L40
            y40.t r8 = r8.f()
            if (r8 != 0) goto L3b
            return r2
        L3b:
            byte[] r4 = r8.b(r3)
            r7 = r0
        L40:
            int r10 = r8.h()
            int r10 = r10 + r7
            r10 = r4[r10]
            if (r9 == r10) goto L4c
            int r13 = r13 + 1
            goto Ld
        L4c:
            int r7 = r7 + 1
            int r6 = r6 + 1
            goto L2a
        L51:
            return r13
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.v.c(y40.t, byte[], int):int");
    }

    @v0
    public static final boolean d(@m80.k t tVar) {
        kotlin.jvm.internal.g0.p(tVar, "<this>");
        return tVar.n() == 0;
    }
}
