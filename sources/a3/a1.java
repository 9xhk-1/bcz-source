package a3;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a1<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f1443i = 32;

    /* renamed from: j, reason: collision with root package name */
    public static final int f1444j = 7;

    /* renamed from: k, reason: collision with root package name */
    public static final int f1445k = 256;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f1446l = false;

    /* renamed from: a, reason: collision with root package name */
    public T[] f1447a;

    /* renamed from: b, reason: collision with root package name */
    public Comparator<? super T> f1448b;

    /* renamed from: c, reason: collision with root package name */
    public int f1449c;

    /* renamed from: d, reason: collision with root package name */
    public T[] f1450d;

    /* renamed from: e, reason: collision with root package name */
    public int f1451e;

    /* renamed from: f, reason: collision with root package name */
    public int f1452f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1453g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f1454h;

    public a1() {
        this.f1449c = 7;
        this.f1452f = 0;
        this.f1450d = (T[]) new Object[256];
        this.f1453g = new int[40];
        this.f1454h = new int[40];
    }

    public static <T> void a(T[] tArr, int i11, int i12, int i13, Comparator<? super T> comparator) {
        if (i13 == i11) {
            i13++;
        }
        while (i13 < i12) {
            T t11 = tArr[i13];
            int i14 = i11;
            int i15 = i13;
            while (i14 < i15) {
                int i16 = (i14 + i15) >>> 1;
                if (comparator.compare(t11, tArr[i16]) < 0) {
                    i15 = i16;
                } else {
                    i14 = i16 + 1;
                }
            }
            int i17 = i13 - i14;
            if (i17 != 1) {
                if (i17 != 2) {
                    System.arraycopy(tArr, i14, tArr, i14 + 1, i17);
                    tArr[i14] = t11;
                    i13++;
                } else {
                    tArr[i14 + 2] = tArr[i14 + 1];
                }
            }
            tArr[i14 + 1] = tArr[i14];
            tArr[i14] = t11;
            i13++;
        }
    }

    public static <T> int b(T[] tArr, int i11, int i12, Comparator<? super T> comparator) {
        int i13 = i11 + 1;
        if (i13 == i12) {
            return 1;
        }
        int i14 = i11 + 2;
        if (comparator.compare(tArr[i13], tArr[i11]) < 0) {
            while (i14 < i12 && comparator.compare(tArr[i14], tArr[i14 - 1]) < 0) {
                i14++;
            }
            o(tArr, i11, i14);
        } else {
            while (i14 < i12 && comparator.compare(tArr[i14], tArr[i14 - 1]) >= 0) {
                i14++;
            }
        }
        return i14 - i11;
    }

    public static <T> int e(T t11, T[] tArr, int i11, int i12, int i13, Comparator<? super T> comparator) {
        int i14;
        int i15;
        int i16 = i11 + i13;
        if (comparator.compare(t11, tArr[i16]) > 0) {
            int i17 = i12 - i13;
            int i18 = 0;
            int i19 = 1;
            while (i19 < i17 && comparator.compare(t11, tArr[i16 + i19]) > 0) {
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
            while (i25 < i23 && comparator.compare(t11, tArr[i16 - i25]) <= 0) {
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
            if (comparator.compare(t11, tArr[i11 + i32]) > 0) {
                i31 = i32 + 1;
            } else {
                i15 = i32;
            }
        }
        return i15;
    }

    public static <T> int f(T t11, T[] tArr, int i11, int i12, int i13, Comparator<? super T> comparator) {
        int i14;
        int i15;
        int i16 = i11 + i13;
        if (comparator.compare(t11, tArr[i16]) < 0) {
            int i17 = i13 + 1;
            int i18 = 0;
            int i19 = 1;
            while (i19 < i17 && comparator.compare(t11, tArr[i16 - i19]) < 0) {
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
            while (i25 < i23 && comparator.compare(t11, tArr[i16 + i25]) >= 0) {
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
            if (comparator.compare(t11, tArr[i11 + i31]) < 0) {
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

    public static <T> void p(T[] tArr, int i11, int i12, Comparator<? super T> comparator) {
        if (comparator == null) {
            Arrays.sort(tArr, i11, i12);
            return;
        }
        n(tArr.length, i11, i12);
        int i13 = i12 - i11;
        if (i13 < 2) {
            return;
        }
        if (i13 < 32) {
            a(tArr, i11, i12, b(tArr, i11, i12, comparator) + i11, comparator);
            return;
        }
        a1 a1Var = new a1(tArr, comparator);
        int l11 = l(i13);
        do {
            int b11 = b(tArr, i11, i12, comparator);
            if (b11 < l11) {
                int i14 = i13 <= l11 ? i13 : l11;
                a(tArr, i11, i11 + i14, b11 + i11, comparator);
                b11 = i14;
            }
            a1Var.m(i11, b11);
            a1Var.h();
            i11 += b11;
            i13 -= b11;
        } while (i13 != 0);
        a1Var.i();
    }

    public static <T> void q(T[] tArr, Comparator<? super T> comparator) {
        p(tArr, 0, tArr.length, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(T[] tArr, Comparator<T> comparator, int i11, int i12) {
        this.f1452f = 0;
        n(tArr.length, i11, i12);
        int i13 = i12 - i11;
        if (i13 < 2) {
            return;
        }
        if (i13 < 32) {
            a(tArr, i11, i12, b(tArr, i11, i12, comparator) + i11, comparator);
            return;
        }
        this.f1447a = tArr;
        this.f1448b = comparator;
        this.f1451e = 0;
        int l11 = l(i13);
        do {
            int b11 = b(tArr, i11, i12, comparator);
            if (b11 < l11) {
                int i14 = i13 <= l11 ? i13 : l11;
                a(tArr, i11, i11 + i14, b11 + i11, comparator);
                b11 = i14;
            }
            m(i11, b11);
            h();
            i11 += b11;
            i13 -= b11;
        } while (i13 != 0);
        i();
        this.f1447a = null;
        this.f1448b = null;
        T[] tArr2 = this.f1450d;
        int i15 = this.f1451e;
        for (int i16 = 0; i16 < i15; i16++) {
            tArr2[i16] = null;
        }
    }

    public final T[] d(int i11) {
        this.f1451e = Math.max(this.f1451e, i11);
        if (this.f1450d.length < i11) {
            int i12 = (i11 >> 1) | i11;
            int i13 = i12 | (i12 >> 2);
            int i14 = i13 | (i13 >> 4);
            int i15 = i14 | (i14 >> 8);
            int i16 = (i15 | (i15 >> 16)) + 1;
            if (i16 >= 0) {
                i11 = Math.min(i16, this.f1447a.length >>> 1);
            }
            this.f1450d = (T[]) new Object[i11];
        }
        return this.f1450d;
    }

    public final void g(int i11) {
        int[] iArr = this.f1453g;
        int i12 = iArr[i11];
        int[] iArr2 = this.f1454h;
        int i13 = iArr2[i11];
        int i14 = i11 + 1;
        int i15 = iArr[i14];
        int i16 = iArr2[i14];
        iArr2[i11] = i13 + i16;
        int i17 = this.f1452f;
        if (i11 == i17 - 3) {
            int i18 = i11 + 2;
            iArr[i14] = iArr[i18];
            iArr2[i14] = iArr2[i18];
        }
        this.f1452f = i17 - 1;
        T[] tArr = this.f1447a;
        int f11 = f(tArr[i15], tArr, i12, i13, 0, this.f1448b);
        int i19 = i12 + f11;
        int i21 = i13 - f11;
        if (i21 == 0) {
            return;
        }
        T[] tArr2 = this.f1447a;
        int e11 = e(tArr2[(i19 + i21) - 1], tArr2, i15, i16, i16 - 1, this.f1448b);
        if (e11 == 0) {
            return;
        }
        if (i21 <= e11) {
            k(i19, i21, i15, e11);
        } else {
            j(i19, i21, i15, e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r1[r0 - 4] <= (r1[r2] + r1[r0 - 3])) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r1[r0 - 3] > (r1[r2] + r1[r0 - 1])) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        r1 = r6.f1454h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r1[r0 - 3] >= r1[r0 - 1]) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r2 = r0 - 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r6 = this;
        L0:
            int r0 = r6.f1452f
            r1 = 1
            if (r0 <= r1) goto L48
            int r2 = r0 + (-2)
            if (r2 < r1) goto L18
            int[] r1 = r6.f1454h
            int r3 = r0 + (-3)
            r3 = r1[r3]
            r4 = r1[r2]
            int r5 = r0 + (-1)
            r1 = r1[r5]
            int r4 = r4 + r1
            if (r3 <= r4) goto L2a
        L18:
            r1 = 2
            if (r2 < r1) goto L39
            int[] r1 = r6.f1454h
            int r3 = r0 + (-4)
            r3 = r1[r3]
            r4 = r1[r2]
            int r5 = r0 + (-3)
            r1 = r1[r5]
            int r4 = r4 + r1
            if (r3 > r4) goto L39
        L2a:
            int[] r1 = r6.f1454h
            int r3 = r0 + (-3)
            r3 = r1[r3]
            int r4 = r0 + (-1)
            r1 = r1[r4]
            if (r3 >= r1) goto L44
            int r2 = r0 + (-3)
            goto L44
        L39:
            int[] r1 = r6.f1454h
            r3 = r1[r2]
            int r0 = r0 + (-1)
            r0 = r1[r0]
            if (r3 <= r0) goto L44
            goto L48
        L44:
            r6.g(r2)
            goto L0
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.a1.h():void");
    }

    public final void i() {
        while (true) {
            int i11 = this.f1452f;
            if (i11 <= 1) {
                return;
            }
            int i12 = i11 - 2;
            if (i12 > 0) {
                int[] iArr = this.f1454h;
                if (iArr[i11 - 3] < iArr[i11 - 1]) {
                    i12 = i11 - 3;
                }
            }
            g(i12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        r12 = r2;
        r13 = r4;
        r4 = r5;
        r14 = r6;
        r15 = r8;
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        r2 = r3;
        r6 = r9;
        r3 = r2;
        r1 = r4 - f(r7[r14], r2, r19, r4, r4 - 1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (r1 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        r2 = r8 - r1;
        r5 = r13 - r1;
        r4 = r4 - r1;
        java.lang.System.arraycopy(r3, r5 + 1, r3, r2 + 1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (r4 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        r8 = r2;
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        r6 = r12;
        r12 = r2;
        r2 = r6;
        r5 = r4;
        r4 = r5;
        r6 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        r2 = r4;
        r16 = r8 - 1;
        r17 = r14 - 1;
        r3[r8] = r7[r14];
        r5 = r7;
        r7 = r12 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        if (r7 != 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        r9 = r6;
        r4 = e(r3[r13], r5, 0, r7, r12 - 2, r9);
        r12 = r7;
        r7 = r5;
        r4 = r12 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        if (r4 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        r5 = r16 - r4;
        r6 = r17 - r4;
        r8 = r12 - r4;
        java.lang.System.arraycopy(r7, r6 + 1, r3, r5 + 1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        if (r8 > 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        r16 = r5;
        r14 = r6;
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00eb, code lost:
    
        r8 = r16 - 1;
        r5 = r13 - 1;
        r3[r16] = r3[r13];
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f5, code lost:
    
        if (r2 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0122, code lost:
    
        r15 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0125, code lost:
    
        if (r1 < 7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012a, code lost:
    
        if (r4 < 7) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012c, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0130, code lost:
    
        if ((r1 | r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0140, code lost:
    
        r4 = r2;
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0132, code lost:
    
        if (r15 >= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012e, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0129, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f7, code lost:
    
        r4 = r5;
        r6 = r14;
        r5 = r2;
        r2 = r12;
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00df, code lost:
    
        r12 = r5;
        r4 = r13;
        r5 = r2;
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e9, code lost:
    
        r14 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b5, code lost:
    
        r5 = r2;
        r2 = r7;
        r7 = r5;
        r4 = r13;
        r8 = r15;
        r12 = r16;
        r6 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[EDGE_INSN: B:19:0x0076->B:20:0x0076 BREAK  A[LOOP:1: B:12:0x0040->B:72:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[LOOP:1: B:12:0x0040->B:72:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.a1.j(int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        r12 = r6;
        r13 = r7;
        r6 = r8;
        r7 = r2;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r8 = f(r3[r12], r5, r6, r7, 0, r9);
        r4 = r6;
        r6 = r9;
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r8 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        java.lang.System.arraycopy(r9, r4, r3, r2, r8);
        r2 = r2 + r8;
        r4 = r4 + r8;
        r5 = r7 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r5 > 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        r8 = r4;
        r6 = r12;
        r7 = r13;
        r12 = r2;
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        r14 = r4;
        r15 = r2 + 1;
        r4 = r2;
        r2 = r3;
        r3 = r12 + 1;
        r2[r4] = r2[r12];
        r4 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
    
        if (r4 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        r1 = e(r9[r14], r2, r3, r4, 0, r6);
        r12 = r3;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
    
        if (r1 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
    
        java.lang.System.arraycopy(r3, r12, r3, r15, r1);
        r2 = r15 + r1;
        r6 = r12 + r1;
        r4 = r4 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        if (r4 != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        r15 = r2;
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
    
        r12 = r2;
        r1 = r4;
        r2 = r7;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        r2 = r15 + 1;
        r6 = r14 + 1;
        r3[r15] = r9[r14];
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cb, code lost:
    
        if (r7 != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
    
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f3, code lost:
    
        if (r8 < 7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f8, code lost:
    
        if (r1 < 7) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fa, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fe, code lost:
    
        if ((r1 | r8) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0111, code lost:
    
        r9 = r6;
        r5 = r9;
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0100, code lost:
    
        if (r13 >= 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0102, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fc, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f7, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cd, code lost:
    
        r1 = r4;
        r8 = r6;
        r6 = r12;
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a1, code lost:
    
        r2 = r7;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x009c, code lost:
    
        r6 = r3;
        r1 = r4;
        r8 = r14;
        r12 = r15;
        r3 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.a1.k(int, int, int, int):void");
    }

    public final void m(int i11, int i12) {
        int[] iArr = this.f1453g;
        int i13 = this.f1452f;
        iArr[i13] = i11;
        this.f1454h[i13] = i12;
        this.f1452f = i13 + 1;
    }

    public a1(T[] tArr, Comparator<? super T> comparator) {
        this.f1449c = 7;
        this.f1452f = 0;
        this.f1447a = tArr;
        this.f1448b = comparator;
        int length = tArr.length;
        this.f1450d = (T[]) new Object[length < 512 ? length >>> 1 : 256];
        int i11 = length < 120 ? 5 : length < 1542 ? 10 : length < 119151 ? 19 : 40;
        this.f1453g = new int[i11];
        this.f1454h = new int[i11];
    }
}
