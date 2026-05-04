package org.mozilla.javascript.v8dtoa;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class FastDtoa {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int kFastDtoaMaximalLength = 17;
    static final int kTen4 = 10000;
    static final int kTen5 = 100000;
    static final int kTen6 = 1000000;
    static final int kTen7 = 10000000;
    static final int kTen8 = 100000000;
    static final int kTen9 = 1000000000;
    static final int maximal_target_exponent = -32;
    static final int minimal_target_exponent = -60;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
    
        if (10 <= r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0045, code lost:
    
        if (1 <= r5) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long biggestPowerTen(int r5, int r6) {
        /*
            r0 = 1
            r1 = 0
            switch(r6) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L45;
                case 3: goto L45;
                case 4: goto L40;
                case 5: goto L40;
                case 6: goto L40;
                case 7: goto L3a;
                case 8: goto L3a;
                case 9: goto L3a;
                case 10: goto L34;
                case 11: goto L34;
                case 12: goto L34;
                case 13: goto L34;
                case 14: goto L2e;
                case 15: goto L2e;
                case 16: goto L2e;
                case 17: goto L27;
                case 18: goto L27;
                case 19: goto L27;
                case 20: goto L20;
                case 21: goto L20;
                case 22: goto L20;
                case 23: goto L20;
                case 24: goto L19;
                case 25: goto L19;
                case 26: goto L19;
                case 27: goto L11;
                case 28: goto L11;
                case 29: goto L11;
                case 30: goto L7;
                case 31: goto L7;
                case 32: goto L7;
                default: goto L5;
            }
        L5:
            r0 = r1
            goto L4c
        L7:
            r6 = 1000000000(0x3b9aca00, float:0.0047237873)
            if (r6 > r5) goto L11
            r0 = 9
        Le:
            r1 = r0
            r0 = r6
            goto L4c
        L11:
            r6 = 100000000(0x5f5e100, float:2.3122341E-35)
            if (r6 > r5) goto L19
            r0 = 8
            goto Le
        L19:
            r6 = 10000000(0x989680, float:1.4012985E-38)
            if (r6 > r5) goto L20
            r0 = 7
            goto Le
        L20:
            r6 = 1000000(0xf4240, float:1.401298E-39)
            if (r6 > r5) goto L27
            r0 = 6
            goto Le
        L27:
            r6 = 100000(0x186a0, float:1.4013E-40)
            if (r6 > r5) goto L2e
            r0 = 5
            goto Le
        L2e:
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r6 > r5) goto L34
            r0 = 4
            goto Le
        L34:
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r6 > r5) goto L3a
            r0 = 3
            goto Le
        L3a:
            r6 = 100
            if (r6 > r5) goto L40
            r0 = 2
            goto Le
        L40:
            r6 = 10
            if (r6 > r5) goto L45
            goto Le
        L45:
            if (r0 > r5) goto L48
            goto L4c
        L48:
            r0 = -1
            r4 = r1
            r1 = r0
            r0 = r4
        L4c:
            long r5 = (long) r0
            r0 = 32
            long r5 = r5 << r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = (long) r1
            long r0 = r0 & r2
            long r5 = r5 | r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.v8dtoa.FastDtoa.biggestPowerTen(int, int):long");
    }

    public static boolean digitGen(DiyFp diyFp, DiyFp diyFp2, DiyFp diyFp3, FastDtoaBuilder fastDtoaBuilder, int i11) {
        FastDtoaBuilder fastDtoaBuilder2 = fastDtoaBuilder;
        long j11 = 1;
        DiyFp diyFp4 = new DiyFp(diyFp.f() - 1, diyFp.e());
        DiyFp diyFp5 = new DiyFp(diyFp3.f() + 1, diyFp3.e());
        DiyFp minus = DiyFp.minus(diyFp5, diyFp4);
        DiyFp diyFp6 = new DiyFp(1 << (-diyFp2.e()), diyFp2.e());
        int f11 = (int) ((diyFp5.f() >>> (-diyFp6.e())) & 4294967295L);
        long f12 = diyFp5.f() & (diyFp6.f() - 1);
        long biggestPowerTen = biggestPowerTen(f11, 64 - (-diyFp6.e()));
        int i12 = (int) ((biggestPowerTen >>> 32) & 4294967295L);
        boolean z11 = true;
        int i13 = ((int) (biggestPowerTen & 4294967295L)) + 1;
        while (i13 > 0) {
            fastDtoaBuilder2.append((char) ((f11 / i12) + 48));
            f11 %= i12;
            i13--;
            boolean z12 = z11;
            long j12 = (f11 << (-diyFp6.e())) + f12;
            if (j12 < minus.f()) {
                fastDtoaBuilder2.point = (fastDtoaBuilder2.end - i11) + i13;
                return roundWeed(fastDtoaBuilder2, DiyFp.minus(diyFp5, diyFp2).f(), minus.f(), j12, i12 << (-diyFp6.e()), 1L);
            }
            i12 /= 10;
            z11 = z12;
            j11 = 1;
        }
        boolean z13 = z11;
        while (true) {
            long j13 = f12 * 5;
            j11 *= 5;
            minus.setF(5 * minus.f());
            minus.setE(minus.e() + 1);
            diyFp6.setF(diyFp6.f() >>> (z13 ? 1L : 0L));
            diyFp6.setE(diyFp6.e() + 1);
            fastDtoaBuilder2.append((char) (((int) ((j13 >>> (-diyFp6.e())) & 4294967295L)) + 48));
            long f13 = (diyFp6.f() - 1) & j13;
            i13--;
            if (f13 < minus.f()) {
                fastDtoaBuilder2.point = (fastDtoaBuilder2.end - i11) + i13;
                return roundWeed(fastDtoaBuilder, DiyFp.minus(diyFp5, diyFp2).f() * j11, minus.f(), f13, diyFp6.f(), j11);
            }
            fastDtoaBuilder2 = fastDtoaBuilder;
            f12 = f13;
        }
    }

    public static boolean dtoa(double d11, FastDtoaBuilder fastDtoaBuilder) {
        return grisu3(d11, fastDtoaBuilder);
    }

    public static boolean grisu3(double d11, FastDtoaBuilder fastDtoaBuilder) {
        long doubleToLongBits = Double.doubleToLongBits(d11);
        DiyFp asNormalizedDiyFp = DoubleHelper.asNormalizedDiyFp(doubleToLongBits);
        DiyFp diyFp = new DiyFp();
        DiyFp diyFp2 = new DiyFp();
        DoubleHelper.normalizedBoundaries(doubleToLongBits, diyFp, diyFp2);
        DiyFp diyFp3 = new DiyFp();
        int cachedPower = CachedPowers.getCachedPower(asNormalizedDiyFp.e() + 64, minimal_target_exponent, maximal_target_exponent, diyFp3);
        return digitGen(DiyFp.times(diyFp, diyFp3), DiyFp.times(asNormalizedDiyFp, diyFp3), DiyFp.times(diyFp2, diyFp3), fastDtoaBuilder, cachedPower);
    }

    public static String numberToString(double d11) {
        FastDtoaBuilder fastDtoaBuilder = new FastDtoaBuilder();
        if (numberToString(d11, fastDtoaBuilder)) {
            return fastDtoaBuilder.format();
        }
        return null;
    }

    public static boolean roundWeed(FastDtoaBuilder fastDtoaBuilder, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j11 - j15;
        long j17 = j11 + j15;
        long j18 = j13;
        while (j18 < j16 && j12 - j18 >= j14) {
            long j19 = j18 + j14;
            if (j19 >= j16 && j16 - j18 < j19 - j16) {
                break;
            }
            fastDtoaBuilder.decreaseLast();
            j18 = j19;
        }
        if (j18 < j17 && j12 - j18 >= j14) {
            long j21 = j18 + j14;
            if (j21 < j17 || j17 - j18 > j21 - j17) {
                return false;
            }
        }
        return 2 * j15 <= j18 && j18 <= j12 - (4 * j15);
    }

    private static boolean uint64_lte(long j11, long j12) {
        if (j11 != j12) {
            if (!(((j11 < 0) ^ (j11 < j12)) ^ (j12 < 0))) {
                return false;
            }
        }
        return true;
    }

    public static boolean numberToString(double d11, FastDtoaBuilder fastDtoaBuilder) {
        fastDtoaBuilder.reset();
        if (d11 < 0.0d) {
            fastDtoaBuilder.append('-');
            d11 = -d11;
        }
        return dtoa(d11, fastDtoaBuilder);
    }
}
