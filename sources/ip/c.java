package ip;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f62642a = 33;

    /* renamed from: b, reason: collision with root package name */
    public static final int f62643b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f62644c = 32;

    /* renamed from: d, reason: collision with root package name */
    public static final int f62645d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f62646e = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static int[] a(kp.a aVar, int i11, int i12) {
        int[] iArr = new int[i12];
        int m11 = aVar.m() / i11;
        for (int i13 = 0; i13 < m11; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 |= aVar.h((i13 * i11) + i15) ? 1 << ((i11 - i15) - 1) : 0;
            }
            iArr[i13] = i14;
        }
        return iArr;
    }

    public static void b(kp.b bVar, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13 += 2) {
            int i14 = i11 - i13;
            int i15 = i14;
            while (true) {
                int i16 = i11 + i13;
                if (i15 <= i16) {
                    bVar.q(i15, i14);
                    bVar.q(i15, i16);
                    bVar.q(i14, i15);
                    bVar.q(i16, i15);
                    i15++;
                }
            }
        }
        int i17 = i11 - i12;
        bVar.q(i17, i17);
        int i18 = i17 + 1;
        bVar.q(i18, i17);
        bVar.q(i17, i18);
        int i19 = i11 + i12;
        bVar.q(i19, i17);
        bVar.q(i19, i18);
        bVar.q(i19, i19 - 1);
    }

    public static void c(kp.b bVar, boolean z11, int i11, kp.a aVar) {
        int i12 = i11 / 2;
        int i13 = 0;
        if (z11) {
            while (i13 < 7) {
                int i14 = (i12 - 3) + i13;
                if (aVar.h(i13)) {
                    bVar.q(i14, i12 - 5);
                }
                if (aVar.h(i13 + 7)) {
                    bVar.q(i12 + 5, i14);
                }
                if (aVar.h(20 - i13)) {
                    bVar.q(i14, i12 + 5);
                }
                if (aVar.h(27 - i13)) {
                    bVar.q(i12 - 5, i14);
                }
                i13++;
            }
            return;
        }
        while (i13 < 10) {
            int i15 = (i12 - 5) + i13 + (i13 / 5);
            if (aVar.h(i13)) {
                bVar.q(i15, i12 - 7);
            }
            if (aVar.h(i13 + 10)) {
                bVar.q(i12 + 7, i15);
            }
            if (aVar.h(29 - i13)) {
                bVar.q(i15, i12 + 7);
            }
            if (aVar.h(39 - i13)) {
                bVar.q(i12 - 7, i15);
            }
            i13++;
        }
    }

    public static a d(byte[] bArr) {
        return e(bArr, 33, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a e(byte[] bArr, int i11, int i12) {
        kp.a aVar;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        kp.a a11 = new d(bArr).a();
        int m11 = ((a11.m() * i11) / 100) + 11;
        int m12 = a11.m() + m11;
        int i18 = 1;
        if (i12 == 0) {
            kp.a aVar2 = null;
            int i19 = 0;
            int i21 = 0;
            while (i19 <= 32) {
                boolean z12 = i19 <= 3 ? i18 : 0;
                int i22 = z12 != 0 ? i19 + 1 : i19;
                int j11 = j(i22, z12);
                if (m12 <= j11) {
                    if (aVar2 == null || i21 != f62646e[i22]) {
                        int i23 = f62646e[i22];
                        i21 = i23;
                        aVar2 = i(a11, i23);
                    }
                    int i24 = j11 - (j11 % i21);
                    if ((z12 == 0 || aVar2.m() <= (i21 << 6)) && aVar2.m() + m11 <= i24) {
                        aVar = aVar2;
                        i13 = i21;
                        z11 = z12;
                        i14 = i22;
                        i15 = j11;
                    }
                }
                i19++;
                i18 = i18;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z11 = i12 < 0;
        i14 = Math.abs(i12);
        if (i14 > (z11 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i12)));
        }
        i15 = j(i14, z11);
        i13 = f62646e[i14];
        int i25 = i15 - (i15 % i13);
        aVar = i(a11, i13);
        if (aVar.m() + m11 > i25) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z11 && aVar.m() > (i13 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        kp.a f11 = f(aVar, i15, i13);
        int m13 = aVar.m() / i13;
        kp.a g11 = g(z11, i14, m13);
        int i26 = (z11 ? 11 : 14) + (i14 << 2);
        int[] iArr = new int[i26];
        int i27 = 2;
        if (z11) {
            for (int i28 = 0; i28 < i26; i28++) {
                iArr[i28] = i28;
            }
            i16 = i26;
        } else {
            int i29 = i26 / 2;
            i16 = i26 + 1 + (((i29 - 1) / 15) * 2);
            int i31 = i16 / 2;
            for (int i32 = 0; i32 < i29; i32++) {
                iArr[(i29 - i32) - i18] = (i31 - r14) - 1;
                iArr[i29 + i32] = (i32 / 15) + i32 + i31 + i18;
            }
        }
        kp.b bVar = new kp.b(i16);
        int i33 = 0;
        for (int i34 = 0; i34 < i14; i34++) {
            int i35 = ((i14 - i34) << i27) + (z11 ? 9 : 12);
            for (int i36 = 0; i36 < i35; i36++) {
                int i37 = i36 << 1;
                int i38 = 0;
                while (i38 < i27) {
                    int i39 = i18;
                    if (f11.h(i33 + i37 + i38)) {
                        int i41 = i34 << 1;
                        i17 = i27;
                        bVar.q(iArr[i41 + i38], iArr[i41 + i36]);
                    } else {
                        i17 = i27;
                    }
                    if (f11.h((i35 << 1) + i33 + i37 + i38)) {
                        int i42 = i34 << 1;
                        bVar.q(iArr[i42 + i36], iArr[((i26 - 1) - i42) - i38]);
                    }
                    if (f11.h((i35 << 2) + i33 + i37 + i38)) {
                        int i43 = (i26 - 1) - (i34 << 1);
                        bVar.q(iArr[i43 - i38], iArr[i43 - i36]);
                    }
                    if (f11.h((i35 * 6) + i33 + i37 + i38)) {
                        int i44 = i34 << 1;
                        bVar.q(iArr[((i26 - 1) - i44) - i36], iArr[i44 + i38]);
                    }
                    i38++;
                    i18 = i39;
                    i27 = i17;
                }
            }
            i33 += i35 << 3;
        }
        c(bVar, z11, i16, g11);
        if (z11) {
            b(bVar, i16 / 2, 5);
        } else {
            int i45 = i16 / 2;
            b(bVar, i45, 7);
            int i46 = 0;
            int i47 = 0;
            while (i47 < (i26 / 2) - 1) {
                for (int i48 = i45 & 1; i48 < i16; i48 += 2) {
                    int i49 = i45 - i46;
                    bVar.q(i49, i48);
                    int i51 = i45 + i46;
                    bVar.q(i51, i48);
                    bVar.q(i48, i49);
                    bVar.q(i48, i51);
                }
                i47 += 15;
                i46 += 16;
            }
        }
        a aVar3 = new a();
        aVar3.g(z11);
        aVar3.j(i16);
        aVar3.h(i14);
        aVar3.f(m13);
        aVar3.i(bVar);
        return aVar3;
    }

    public static kp.a f(kp.a aVar, int i11, int i12) {
        int m11 = aVar.m() / i12;
        mp.d dVar = new mp.d(h(i12));
        int i13 = i11 / i12;
        int[] a11 = a(aVar, i12, i13);
        dVar.b(a11, i13 - m11);
        kp.a aVar2 = new kp.a();
        aVar2.c(0, i11 % i12);
        for (int i14 : a11) {
            aVar2.c(i14, i12);
        }
        return aVar2;
    }

    public static kp.a g(boolean z11, int i11, int i12) {
        kp.a aVar = new kp.a();
        if (z11) {
            aVar.c(i11 - 1, 2);
            aVar.c(i12 - 1, 6);
            return f(aVar, 28, 4);
        }
        aVar.c(i11 - 1, 5);
        aVar.c(i12 - 1, 11);
        return f(aVar, 40, 4);
    }

    public static mp.a h(int i11) {
        if (i11 == 4) {
            return mp.a.f73614k;
        }
        if (i11 == 6) {
            return mp.a.f73613j;
        }
        if (i11 == 8) {
            return mp.a.f73617n;
        }
        if (i11 == 10) {
            return mp.a.f73612i;
        }
        if (i11 == 12) {
            return mp.a.f73611h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i11)));
    }

    public static kp.a i(kp.a aVar, int i11) {
        kp.a aVar2 = new kp.a();
        int m11 = aVar.m();
        int i12 = (1 << i11) - 2;
        int i13 = 0;
        while (i13 < m11) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = i13 + i15;
                if (i16 >= m11 || aVar.h(i16)) {
                    i14 |= 1 << ((i11 - 1) - i15);
                }
            }
            int i17 = i14 & i12;
            if (i17 == i12) {
                aVar2.c(i17, i11);
            } else if (i17 == 0) {
                aVar2.c(i14 | 1, i11);
            } else {
                aVar2.c(i14, i11);
                i13 += i11;
            }
            i13--;
            i13 += i11;
        }
        return aVar2;
    }

    public static int j(int i11, boolean z11) {
        return ((z11 ? 88 : 112) + (i11 << 4)) * i11;
    }
}
