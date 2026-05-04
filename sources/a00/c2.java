package a00;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c2 {
    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @kotlin.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(long[] r6, int r7, int r8) {
        /*
            int r0 = r7 + r8
            int r0 = r0 / 2
            long r0 = yz.x1.m(r6, r0)
        L8:
            if (r7 > r8) goto L39
        La:
            long r2 = yz.x1.m(r6, r7)
            int r2 = androidx.collection.a.a(r2, r0)
            if (r2 >= 0) goto L17
            int r7 = r7 + 1
            goto La
        L17:
            long r2 = yz.x1.m(r6, r8)
            int r2 = androidx.collection.a.a(r2, r0)
            if (r2 <= 0) goto L24
            int r8 = r8 + (-1)
            goto L17
        L24:
            if (r7 > r8) goto L8
            long r2 = yz.x1.m(r6, r7)
            long r4 = yz.x1.m(r6, r8)
            yz.x1.u(r6, r7, r4)
            yz.x1.u(r6, r8, r2)
            int r7 = r7 + 1
            int r8 = r8 + (-1)
            goto L8
        L39:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a00.c2.a(long[], int, int):int");
    }

    @kotlin.d
    public static final int b(byte[] bArr, int i11, int i12) {
        int i13;
        byte m11 = yz.p1.m(bArr, (i11 + i12) / 2);
        while (i11 <= i12) {
            while (true) {
                i13 = m11 & 255;
                if (kotlin.jvm.internal.g0.t(yz.p1.m(bArr, i11) & 255, i13) >= 0) {
                    break;
                }
                i11++;
            }
            while (kotlin.jvm.internal.g0.t(yz.p1.m(bArr, i12) & 255, i13) > 0) {
                i12--;
            }
            if (i11 <= i12) {
                byte m12 = yz.p1.m(bArr, i11);
                yz.p1.u(bArr, i11, yz.p1.m(bArr, i12));
                yz.p1.u(bArr, i12, m12);
                i11++;
                i12--;
            }
        }
        return i11;
    }

    @kotlin.d
    public static final int c(short[] sArr, int i11, int i12) {
        int i13;
        short m11 = yz.d2.m(sArr, (i11 + i12) / 2);
        while (i11 <= i12) {
            while (true) {
                int m12 = yz.d2.m(sArr, i11) & yz.c2.f100412d;
                i13 = m11 & yz.c2.f100412d;
                if (kotlin.jvm.internal.g0.t(m12, i13) >= 0) {
                    break;
                }
                i11++;
            }
            while (kotlin.jvm.internal.g0.t(yz.d2.m(sArr, i12) & yz.c2.f100412d, i13) > 0) {
                i12--;
            }
            if (i11 <= i12) {
                short m13 = yz.d2.m(sArr, i11);
                yz.d2.u(sArr, i11, yz.d2.m(sArr, i12));
                yz.d2.u(sArr, i12, m13);
                i11++;
                i12--;
            }
        }
        return i11;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @kotlin.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(int[] r3, int r4, int r5) {
        /*
            int r0 = r4 + r5
            int r0 = r0 / 2
            int r0 = yz.t1.m(r3, r0)
        L8:
            if (r4 > r5) goto L39
        La:
            int r1 = yz.t1.m(r3, r4)
            int r1 = yz.n1.a(r1, r0)
            if (r1 >= 0) goto L17
            int r4 = r4 + 1
            goto La
        L17:
            int r1 = yz.t1.m(r3, r5)
            int r1 = yz.n1.a(r1, r0)
            if (r1 <= 0) goto L24
            int r5 = r5 + (-1)
            goto L17
        L24:
            if (r4 > r5) goto L8
            int r1 = yz.t1.m(r3, r4)
            int r2 = yz.t1.m(r3, r5)
            yz.t1.u(r3, r4, r2)
            yz.t1.u(r3, r5, r1)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L8
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a00.c2.d(int[], int, int):int");
    }

    @kotlin.d
    public static final void e(long[] jArr, int i11, int i12) {
        int a11 = a(jArr, i11, i12);
        int i13 = a11 - 1;
        if (i11 < i13) {
            e(jArr, i11, i13);
        }
        if (a11 < i12) {
            e(jArr, a11, i12);
        }
    }

    @kotlin.d
    public static final void f(byte[] bArr, int i11, int i12) {
        int b11 = b(bArr, i11, i12);
        int i13 = b11 - 1;
        if (i11 < i13) {
            f(bArr, i11, i13);
        }
        if (b11 < i12) {
            f(bArr, b11, i12);
        }
    }

    @kotlin.d
    public static final void g(short[] sArr, int i11, int i12) {
        int c11 = c(sArr, i11, i12);
        int i13 = c11 - 1;
        if (i11 < i13) {
            g(sArr, i11, i13);
        }
        if (c11 < i12) {
            g(sArr, c11, i12);
        }
    }

    @kotlin.d
    public static final void h(int[] iArr, int i11, int i12) {
        int d11 = d(iArr, i11, i12);
        int i13 = d11 - 1;
        if (i11 < i13) {
            h(iArr, i11, i13);
        }
        if (d11 < i12) {
            h(iArr, d11, i12);
        }
    }

    @kotlin.d
    public static final void i(@m80.k long[] jArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(jArr, "$v$c$kotlin-ULongArray$-array$0");
        e(jArr, i11, i12 - 1);
    }

    @kotlin.d
    public static final void j(@m80.k byte[] bArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(bArr, "$v$c$kotlin-UByteArray$-array$0");
        f(bArr, i11, i12 - 1);
    }

    @kotlin.d
    public static final void k(@m80.k short[] sArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sArr, "$v$c$kotlin-UShortArray$-array$0");
        g(sArr, i11, i12 - 1);
    }

    @kotlin.d
    public static final void l(@m80.k int[] iArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(iArr, "$v$c$kotlin-UIntArray$-array$0");
        h(iArr, i11, i12 - 1);
    }
}
