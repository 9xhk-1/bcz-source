package a3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: h, reason: collision with root package name */
    public static final int f1564h = 32;

    /* renamed from: i, reason: collision with root package name */
    public static final int f1565i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f1566j = 256;

    /* renamed from: k, reason: collision with root package name */
    public static final boolean f1567k = false;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f1568a;

    /* renamed from: b, reason: collision with root package name */
    public int f1569b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f1570c;

    /* renamed from: d, reason: collision with root package name */
    public int f1571d;

    /* renamed from: e, reason: collision with root package name */
    public int f1572e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1573f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1574g;

    public l() {
        this.f1569b = 7;
        this.f1572e = 0;
        this.f1570c = new Object[256];
        this.f1573f = new int[40];
        this.f1574g = new int[40];
    }

    public static void a(Object[] objArr, int i11, int i12, int i13) {
        if (i13 == i11) {
            i13++;
        }
        while (i13 < i12) {
            Comparable comparable = (Comparable) objArr[i13];
            int i14 = i11;
            int i15 = i13;
            while (i14 < i15) {
                int i16 = (i14 + i15) >>> 1;
                if (comparable.compareTo(objArr[i16]) < 0) {
                    i15 = i16;
                } else {
                    i14 = i16 + 1;
                }
            }
            int i17 = i13 - i14;
            if (i17 != 1) {
                if (i17 != 2) {
                    System.arraycopy(objArr, i14, objArr, i14 + 1, i17);
                    objArr[i14] = comparable;
                    i13++;
                } else {
                    objArr[i14 + 2] = objArr[i14 + 1];
                }
            }
            objArr[i14 + 1] = objArr[i14];
            objArr[i14] = comparable;
            i13++;
        }
    }

    public static int b(Object[] objArr, int i11, int i12) {
        int i13 = i11 + 1;
        if (i13 == i12) {
            return 1;
        }
        int i14 = i11 + 2;
        if (((Comparable) objArr[i13]).compareTo(objArr[i11]) < 0) {
            while (i14 < i12 && ((Comparable) objArr[i14]).compareTo(objArr[i14 - 1]) < 0) {
                i14++;
            }
            o(objArr, i11, i14);
        } else {
            while (i14 < i12 && ((Comparable) objArr[i14]).compareTo(objArr[i14 - 1]) >= 0) {
                i14++;
            }
        }
        return i14 - i11;
    }

    public static int e(Comparable<Object> comparable, Object[] objArr, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i11 + i13;
        if (comparable.compareTo(objArr[i16]) > 0) {
            int i17 = i12 - i13;
            int i18 = 0;
            int i19 = 1;
            while (i19 < i17 && comparable.compareTo(objArr[i16 + i19]) > 0) {
                int i21 = (i19 << 1) + 1;
                if (i21 <= 0) {
                    i18 = i19;
                    i19 = i17;
                } else {
                    int i22 = i19;
                    i19 = i21;
                    i18 = i22;
                }
            }
            if (i19 <= i17) {
                i17 = i19;
            }
            i14 = i18 + i13;
            i15 = i17 + i13;
        } else {
            int i23 = i13 + 1;
            int i24 = 0;
            int i25 = 1;
            while (i25 < i23 && comparable.compareTo(objArr[i16 - i25]) <= 0) {
                int i26 = (i25 << 1) + 1;
                if (i26 <= 0) {
                    i24 = i25;
                    i25 = i23;
                } else {
                    int i27 = i25;
                    i25 = i26;
                    i24 = i27;
                }
            }
            if (i25 <= i23) {
                i23 = i25;
            }
            int i28 = i13 - i23;
            int i29 = i13 - i24;
            i14 = i28;
            i15 = i29;
        }
        int i31 = i14 + 1;
        while (i31 < i15) {
            int i32 = ((i15 - i31) >>> 1) + i31;
            if (comparable.compareTo(objArr[i11 + i32]) > 0) {
                i31 = i32 + 1;
            } else {
                i15 = i32;
            }
        }
        return i15;
    }

    public static int f(Comparable<Object> comparable, Object[] objArr, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i11 + i13;
        if (comparable.compareTo(objArr[i16]) < 0) {
            int i17 = i13 + 1;
            int i18 = 0;
            int i19 = 1;
            while (i19 < i17 && comparable.compareTo(objArr[i16 - i19]) < 0) {
                int i21 = (i19 << 1) + 1;
                if (i21 <= 0) {
                    i18 = i19;
                    i19 = i17;
                } else {
                    int i22 = i19;
                    i19 = i21;
                    i18 = i22;
                }
            }
            if (i19 <= i17) {
                i17 = i19;
            }
            i15 = i13 - i17;
            i14 = i13 - i18;
        } else {
            int i23 = i12 - i13;
            int i24 = 0;
            int i25 = 1;
            while (i25 < i23 && comparable.compareTo(objArr[i16 + i25]) >= 0) {
                int i26 = (i25 << 1) + 1;
                if (i26 <= 0) {
                    i24 = i25;
                    i25 = i23;
                } else {
                    int i27 = i25;
                    i25 = i26;
                    i24 = i27;
                }
            }
            if (i25 <= i23) {
                i23 = i25;
            }
            int i28 = i24 + i13;
            i14 = i13 + i23;
            i15 = i28;
        }
        int i29 = i15 + 1;
        while (i29 < i14) {
            int i31 = ((i14 - i29) >>> 1) + i29;
            if (comparable.compareTo(objArr[i11 + i31]) < 0) {
                i14 = i31;
            } else {
                i29 = i31 + 1;
            }
        }
        return i14;
    }

    public static int l(int i11) {
        int i12 = 0;
        while (i11 >= 32) {
            i12 |= i11 & 1;
            i11 >>= 1;
        }
        return i11 + i12;
    }

    public static void n(int i11, int i12, int i13) {
        if (i12 <= i13) {
            if (i12 < 0) {
                throw new ArrayIndexOutOfBoundsException(i12);
            }
            if (i13 > i11) {
                throw new ArrayIndexOutOfBoundsException(i13);
            }
            return;
        }
        throw new IllegalArgumentException("fromIndex(" + i12 + ") > toIndex(" + i13 + pn.j.f81007d);
    }

    public static void o(Object[] objArr, int i11, int i12) {
        int i13 = i12 - 1;
        while (i11 < i13) {
            Object obj = objArr[i11];
            objArr[i11] = objArr[i13];
            objArr[i13] = obj;
            i13--;
            i11++;
        }
    }

    public static void p(Object[] objArr) {
        q(objArr, 0, objArr.length);
    }

    public static void q(Object[] objArr, int i11, int i12) {
        n(objArr.length, i11, i12);
        int i13 = i12 - i11;
        if (i13 < 2) {
            return;
        }
        if (i13 < 32) {
            a(objArr, i11, i12, b(objArr, i11, i12) + i11);
            return;
        }
        l lVar = new l(objArr);
        int l11 = l(i13);
        do {
            int b11 = b(objArr, i11, i12);
            if (b11 < l11) {
                int i14 = i13 <= l11 ? i13 : l11;
                a(objArr, i11, i11 + i14, b11 + i11);
                b11 = i14;
            }
            lVar.m(i11, b11);
            lVar.h();
            i11 += b11;
            i13 -= b11;
        } while (i13 != 0);
        lVar.i();
    }

    public void c(Object[] objArr, int i11, int i12) {
        this.f1572e = 0;
        n(objArr.length, i11, i12);
        int i13 = i12 - i11;
        if (i13 < 2) {
            return;
        }
        if (i13 < 32) {
            a(objArr, i11, i12, b(objArr, i11, i12) + i11);
            return;
        }
        this.f1568a = objArr;
        this.f1571d = 0;
        int l11 = l(i13);
        do {
            int b11 = b(objArr, i11, i12);
            if (b11 < l11) {
                int i14 = i13 <= l11 ? i13 : l11;
                a(objArr, i11, i11 + i14, b11 + i11);
                b11 = i14;
            }
            m(i11, b11);
            h();
            i11 += b11;
            i13 -= b11;
        } while (i13 != 0);
        i();
        this.f1568a = null;
        Object[] objArr2 = this.f1570c;
        int i15 = this.f1571d;
        for (int i16 = 0; i16 < i15; i16++) {
            objArr2[i16] = null;
        }
    }

    public final Object[] d(int i11) {
        this.f1571d = Math.max(this.f1571d, i11);
        if (this.f1570c.length < i11) {
            int i12 = (i11 >> 1) | i11;
            int i13 = i12 | (i12 >> 2);
            int i14 = i13 | (i13 >> 4);
            int i15 = i14 | (i14 >> 8);
            int i16 = (i15 | (i15 >> 16)) + 1;
            if (i16 >= 0) {
                i11 = Math.min(i16, this.f1568a.length >>> 1);
            }
            this.f1570c = new Object[i11];
        }
        return this.f1570c;
    }

    public final void g(int i11) {
        int[] iArr = this.f1573f;
        int i12 = iArr[i11];
        int[] iArr2 = this.f1574g;
        int i13 = iArr2[i11];
        int i14 = i11 + 1;
        int i15 = iArr[i14];
        int i16 = iArr2[i14];
        iArr2[i11] = i13 + i16;
        int i17 = this.f1572e;
        if (i11 == i17 - 3) {
            int i18 = i11 + 2;
            iArr[i14] = iArr[i18];
            iArr2[i14] = iArr2[i18];
        }
        this.f1572e = i17 - 1;
        Object[] objArr = this.f1568a;
        int f11 = f((Comparable) objArr[i15], objArr, i12, i13, 0);
        int i19 = i12 + f11;
        int i21 = i13 - f11;
        if (i21 == 0) {
            return;
        }
        Object[] objArr2 = this.f1568a;
        int e11 = e((Comparable) objArr2[(i19 + i21) - 1], objArr2, i15, i16, i16 - 1);
        if (e11 == 0) {
            return;
        }
        if (i21 <= e11) {
            k(i19, i21, i15, e11);
        } else {
            j(i19, i21, i15, e11);
        }
    }

    public final void h() {
        while (true) {
            int i11 = this.f1572e;
            if (i11 <= 1) {
                return;
            }
            int i12 = i11 - 2;
            if (i12 > 0) {
                int[] iArr = this.f1574g;
                int i13 = iArr[i11 - 3];
                int i14 = iArr[i12];
                int i15 = iArr[i11 - 1];
                if (i13 <= i14 + i15) {
                    if (i13 < i15) {
                        i12 = i11 - 3;
                    }
                    g(i12);
                }
            }
            int[] iArr2 = this.f1574g;
            if (iArr2[i12] > iArr2[i11 - 1]) {
                return;
            } else {
                g(i12);
            }
        }
    }

    public final void i() {
        while (true) {
            int i11 = this.f1572e;
            if (i11 <= 1) {
                return;
            }
            int i12 = i11 - 2;
            if (i12 > 0) {
                int[] iArr = this.f1574g;
                if (iArr[i11 - 3] < iArr[i11 - 1]) {
                    i12 = i11 - 3;
                }
            }
            g(i12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        r12 = r8 - f((java.lang.Comparable) r5[r9], r4, r18, r8, r8 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r12 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        r2 = r2 - r12;
        r7 = r7 - r12;
        r8 = r8 - r12;
        java.lang.System.arraycopy(r4, r7 + 1, r4, r2 + 1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (r8 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        r13 = r2 - 1;
        r14 = r9 - 1;
        r4[r2] = r5[r9];
        r2 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r2 != 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        r3 = r2 - e((java.lang.Comparable) r4[r7], r5, 0, r2, r3 - 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        if (r3 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        r9 = r13 - r3;
        r13 = r14 - r3;
        r2 = r2 - r3;
        java.lang.System.arraycopy(r5, r13 + 1, r4, r9 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
    
        if (r2 > 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        r13 = r9;
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        r14 = r13 - 1;
        r15 = r7 - 1;
        r4[r13] = r4[r7];
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
    
        if (r8 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
    
        r11 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0100, code lost:
    
        if (r12 < 7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
    
        if (r3 < 7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010b, code lost:
    
        if ((r3 | r12) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0117, code lost:
    
        r3 = r2;
        r2 = r14;
        r7 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010d, code lost:
    
        if (r11 >= 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010f, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0109, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0104, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d5, code lost:
    
        r3 = r2;
        r12 = r14;
        r7 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
    
        r3 = r2;
        r12 = r9;
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c8, code lost:
    
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a0, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
    
        r12 = r13;
        r9 = r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.l.j(int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        r6 = f((java.lang.Comparable) r0[r4], r1, r5, r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r6 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        java.lang.System.arraycopy(r1, r5, r0, r3, r6);
        r3 = r3 + r6;
        r5 = r5 + r6;
        r13 = r13 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r13 > 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        r7 = r3 + 1;
        r8 = r4 + 1;
        r0[r3] = r0[r4];
        r15 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r15 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        r3 = e((java.lang.Comparable) r1[r5], r0, r8, r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (r3 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        java.lang.System.arraycopy(r0, r8, r0, r7, r3);
        r4 = r7 + r3;
        r7 = r8 + r3;
        r15 = r15 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        if (r15 != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        r7 = r4;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        r8 = r7 + 1;
        r9 = r5 + 1;
        r0[r7] = r1[r5];
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:
    
        if (r13 != 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cc, code lost:
    
        r14 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
    
        if (r6 < 7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        if (r3 < 7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
    
        if ((r3 | r6) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        r3 = r8;
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
    
        if (r14 >= 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00de, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d8, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ac, code lost:
    
        r6 = r8;
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0098, code lost:
    
        r6 = r4;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009f, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0082, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0044, code lost:
    
        r4 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.l.k(int, int, int, int):void");
    }

    public final void m(int i11, int i12) {
        int[] iArr = this.f1573f;
        int i13 = this.f1572e;
        iArr[i13] = i11;
        this.f1574g[i13] = i12;
        this.f1572e = i13 + 1;
    }

    public l(Object[] objArr) {
        this.f1569b = 7;
        this.f1572e = 0;
        this.f1568a = objArr;
        int length = objArr.length;
        this.f1570c = new Object[length < 512 ? length >>> 1 : 256];
        int i11 = length < 120 ? 5 : length < 1542 ? 10 : length < 119151 ? 19 : 40;
        this.f1573f = new int[i11];
        this.f1574g = new int[i11];
    }
}
