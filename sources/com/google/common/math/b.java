package com.google.common.math;

import com.google.common.base.Preconditions;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @go.e
    public static final int f34295a = 256;

    /* renamed from: b, reason: collision with root package name */
    @go.e
    public static final BigInteger f34296b = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: c, reason: collision with root package name */
    public static final double f34297c = Math.log(10.0d);

    /* renamed from: d, reason: collision with root package name */
    public static final double f34298d = Math.log(2.0d);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34299a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f34299a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34299a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34299a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34299a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34299a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34299a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34299a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34299a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    /* renamed from: com.google.common.math.b$b, reason: collision with other inner class name */
    public static class C0423b extends n<BigInteger> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0423b f34300a = new C0423b();

        @Override // com.google.common.math.n
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigInteger a(BigInteger a11, BigInteger b11) {
            return a11.subtract(b11);
        }

        @Override // com.google.common.math.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public double c(BigInteger bigInteger) {
            return d.a(bigInteger);
        }

        @Override // com.google.common.math.n
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int d(BigInteger bigInteger) {
            return bigInteger.signum();
        }

        @Override // com.google.common.math.n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigInteger e(double d11, RoundingMode mode) {
            return c.o(d11, mode);
        }
    }

    public static BigInteger a(int n11, int k11) {
        int i11;
        i.e("n", n11);
        i.e("k", k11);
        int i12 = 1;
        Preconditions.checkArgument(k11 <= n11, "k (%s) > n (%s)", k11, n11);
        if (k11 > (n11 >> 1)) {
            k11 = n11 - k11;
        }
        int[] iArr = h.f34340h;
        if (k11 < iArr.length && n11 <= iArr[k11]) {
            return BigInteger.valueOf(h.a(n11, k11));
        }
        BigInteger bigInteger = BigInteger.ONE;
        long j11 = n11;
        int q11 = h.q(j11, RoundingMode.CEILING);
        long j12 = 1;
        while (true) {
            int i13 = q11;
            while (i12 < k11) {
                i11 = n11 - i12;
                i12++;
                i13 += q11;
                if (i13 >= 63) {
                    break;
                }
                j11 *= i11;
                j12 *= i12;
            }
            return bigInteger.multiply(BigInteger.valueOf(j11)).divide(BigInteger.valueOf(j12));
            bigInteger = bigInteger.multiply(BigInteger.valueOf(j11)).divide(BigInteger.valueOf(j12));
            j11 = i11;
            j12 = i12;
        }
    }

    public static BigInteger b(BigInteger x11) {
        return BigInteger.ZERO.setBit(k(x11, RoundingMode.CEILING));
    }

    @go.c
    public static BigInteger c(BigInteger p11, BigInteger q11, RoundingMode mode) {
        return new BigDecimal(p11).divide(new BigDecimal(q11), 0, mode).toBigIntegerExact();
    }

    public static BigInteger d(int n11) {
        i.e("n", n11);
        long[] jArr = h.f34339g;
        if (n11 < jArr.length) {
            return BigInteger.valueOf(jArr[n11]);
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        ArrayList arrayList = new ArrayList(f.g(f.p(n11, roundingMode) * n11, 64, roundingMode));
        int length = jArr.length;
        long j11 = jArr[length - 1];
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
        long j12 = j11 >> numberOfTrailingZeros;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int i11 = 1;
        int q11 = h.q(j12, roundingMode2) + 1;
        long j13 = length;
        int q12 = h.q(j13, roundingMode2);
        int i12 = q12 + 1;
        int i13 = 1 << q12;
        while (j13 <= n11) {
            int i14 = i11;
            long j14 = j13;
            if ((i13 & j14) != 0) {
                i13 <<= 1;
                i12++;
            }
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j14);
            long j15 = j14 >> numberOfTrailingZeros2;
            numberOfTrailingZeros += numberOfTrailingZeros2;
            if ((i12 - numberOfTrailingZeros2) + q11 >= 64) {
                arrayList.add(BigInteger.valueOf(j12));
                j12 = 1;
            }
            j12 *= j15;
            q11 = h.q(j12, RoundingMode.FLOOR) + i14;
            j13 = j14 + 1;
            i11 = i14;
        }
        if (j12 > 1) {
            arrayList.add(BigInteger.valueOf(j12));
        }
        return h(arrayList).shiftLeft(numberOfTrailingZeros);
    }

    @go.c
    public static boolean e(BigInteger x11) {
        return x11.bitLength() <= 63;
    }

    public static BigInteger f(BigInteger x11) {
        return BigInteger.ZERO.setBit(k(x11, RoundingMode.FLOOR));
    }

    public static boolean g(BigInteger x11) {
        Preconditions.checkNotNull(x11);
        return x11.signum() > 0 && x11.getLowestSetBit() == x11.bitLength() - 1;
    }

    public static BigInteger h(List<BigInteger> nums) {
        return i(nums, 0, nums.size());
    }

    public static BigInteger i(List<BigInteger> nums, int start, int end) {
        int i11 = end - start;
        if (i11 == 0) {
            return BigInteger.ONE;
        }
        if (i11 == 1) {
            return nums.get(start);
        }
        if (i11 == 2) {
            return nums.get(start).multiply(nums.get(start + 1));
        }
        if (i11 == 3) {
            return nums.get(start).multiply(nums.get(start + 1)).multiply(nums.get(start + 2));
        }
        int i12 = (end + start) >>> 1;
        return i(nums, start, i12).multiply(i(nums, i12, end));
    }

    @go.c
    public static int j(BigInteger x11, RoundingMode mode) {
        int i11;
        int i12;
        i.j("x", x11);
        if (e(x11)) {
            return h.o(x11.longValue(), mode);
        }
        int k11 = (int) ((k(x11, RoundingMode.FLOOR) * f34298d) / f34297c);
        BigInteger bigInteger = BigInteger.TEN;
        BigInteger pow = bigInteger.pow(k11);
        int compareTo = pow.compareTo(x11);
        if (compareTo > 0) {
            do {
                k11--;
                pow = pow.divide(BigInteger.TEN);
                i12 = pow.compareTo(x11);
            } while (i12 > 0);
        } else {
            BigInteger multiply = bigInteger.multiply(pow);
            int compareTo2 = multiply.compareTo(x11);
            while (true) {
                int i13 = compareTo2;
                i11 = compareTo;
                compareTo = i13;
                if (compareTo > 0) {
                    break;
                }
                k11++;
                BigInteger multiply2 = BigInteger.TEN.multiply(multiply);
                compareTo2 = multiply2.compareTo(x11);
                pow = multiply;
                multiply = multiply2;
            }
            i12 = i11;
        }
        switch (a.f34299a[mode.ordinal()]) {
            case 1:
                i.k(i12 == 0);
                return k11;
            case 2:
            case 3:
                return k11;
            case 4:
            case 5:
                return pow.equals(x11) ? k11 : k11 + 1;
            case 6:
            case 7:
            case 8:
                return x11.pow(2).compareTo(pow.pow(2).multiply(BigInteger.TEN)) <= 0 ? k11 : k11 + 1;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int k(java.math.BigInteger r3, java.math.RoundingMode r4) {
        /*
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            java.lang.String r1 = "x"
            com.google.common.math.i.j(r1, r0)
            int r0 = r3.bitLength()
            int r1 = r0 + (-1)
            int[] r2 = com.google.common.math.b.a.f34299a
            int r4 = r4.ordinal()
            r4 = r2[r4]
            switch(r4) {
                case 1: goto L52;
                case 2: goto L51;
                case 3: goto L51;
                case 4: goto L49;
                case 5: goto L49;
                case 6: goto L22;
                case 7: goto L22;
                case 8: goto L22;
                default: goto L1c;
            }
        L1c:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L22:
            r4 = 256(0x100, float:3.59E-43)
            if (r1 >= r4) goto L36
            java.math.BigInteger r4 = com.google.common.math.b.f34296b
            int r2 = 256 - r1
            java.math.BigInteger r4 = r4.shiftRight(r2)
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L35
            goto L51
        L35:
            return r0
        L36:
            r4 = 2
            java.math.BigInteger r3 = r3.pow(r4)
            int r3 = r3.bitLength()
            int r3 = r3 + (-1)
            int r4 = r1 * 2
            int r4 = r4 + 1
            if (r3 >= r4) goto L48
            goto L51
        L48:
            return r0
        L49:
            boolean r3 = g(r3)
            if (r3 == 0) goto L50
            goto L51
        L50:
            return r0
        L51:
            return r1
        L52:
            boolean r3 = g(r3)
            com.google.common.math.i.k(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.b.k(java.math.BigInteger, java.math.RoundingMode):int");
    }

    @go.c
    public static double l(BigInteger x11, RoundingMode mode) {
        return C0423b.f34300a.b(x11, mode);
    }

    @go.c
    public static BigInteger m(BigInteger x11, RoundingMode mode) {
        i.g("x", x11);
        if (e(x11)) {
            return BigInteger.valueOf(h.B(x11.longValue(), mode));
        }
        BigInteger o11 = o(x11);
        switch (a.f34299a[mode.ordinal()]) {
            case 1:
                i.k(o11.pow(2).equals(x11));
                return o11;
            case 2:
            case 3:
                return o11;
            case 4:
            case 5:
                int intValue = o11.intValue();
                return (intValue * intValue == x11.intValue() && o11.pow(2).equals(x11)) ? o11 : o11.add(BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                return o11.pow(2).add(o11).compareTo(x11) >= 0 ? o11 : o11.add(BigInteger.ONE);
            default:
                throw new AssertionError();
        }
    }

    @go.c
    public static BigInteger n(BigInteger x11) {
        return c.o(Math.sqrt(d.a(x11)), RoundingMode.HALF_EVEN);
    }

    @go.c
    public static BigInteger o(BigInteger x11) {
        BigInteger shiftLeft;
        int k11 = k(x11, RoundingMode.FLOOR);
        if (k11 < 1023) {
            shiftLeft = n(x11);
        } else {
            int i11 = (k11 - 52) & (-2);
            shiftLeft = n(x11.shiftRight(i11)).shiftLeft(i11 >> 1);
        }
        BigInteger shiftRight = shiftLeft.add(x11.divide(shiftLeft)).shiftRight(1);
        if (shiftLeft.equals(shiftRight)) {
            return shiftLeft;
        }
        while (true) {
            BigInteger shiftRight2 = shiftRight.add(x11.divide(shiftRight)).shiftRight(1);
            if (shiftRight2.compareTo(shiftRight) >= 0) {
                return shiftRight;
            }
            shiftRight = shiftRight2;
        }
    }
}
