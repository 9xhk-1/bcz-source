package kotlin.random;

import e10.d;
import e10.e;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import o00.n;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@u0({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
/* loaded from: classes8.dex */
public abstract class Random {

    @k
    public static final Default Default = new Default(null);

    @k
    private static final Random defaultRandom = n.f75505a.b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Default extends Random implements Serializable {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f67069a = new a();
            private static final long serialVersionUID = 0;

            private final Object readResolve() {
                return Random.Default;
            }
        }

        public /* synthetic */ Default(v vVar) {
            this();
        }

        private final void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            return a.f67069a;
        }

        @Override // kotlin.random.Random
        public int nextBits(int i11) {
            return Random.defaultRandom.nextBits(i11);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.defaultRandom.nextBoolean();
        }

        @Override // kotlin.random.Random
        @k
        public byte[] nextBytes(@k byte[] array) {
            g0.p(array, "array");
            return Random.defaultRandom.nextBytes(array);
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        private Default() {
        }

        @Override // kotlin.random.Random
        @k
        public byte[] nextBytes(int i11) {
            return Random.defaultRandom.nextBytes(i11);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d11) {
            return Random.defaultRandom.nextDouble(d11);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i11) {
            return Random.defaultRandom.nextInt(i11);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j11) {
            return Random.defaultRandom.nextLong(j11);
        }

        @Override // kotlin.random.Random
        @k
        public byte[] nextBytes(@k byte[] array, int i11, int i12) {
            g0.p(array, "array");
            return Random.defaultRandom.nextBytes(array, i11, i12);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d11, double d12) {
            return Random.defaultRandom.nextDouble(d11, d12);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i11, int i12) {
            return Random.defaultRandom.nextInt(i11, i12);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j11, long j12) {
            return Random.defaultRandom.nextLong(j11, j12);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return random.nextBytes(bArr, i11, i12);
    }

    public abstract int nextBits(int i11);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    @k
    public byte[] nextBytes(@k byte[] array, int i11, int i12) {
        g0.p(array, "array");
        if (i11 < 0 || i11 > array.length || i12 < 0 || i12 > array.length) {
            throw new IllegalArgumentException(("fromIndex (" + i11 + ") or toIndex (" + i12 + ") are out of range: 0.." + array.length + '.').toString());
        }
        if (i11 > i12) {
            throw new IllegalArgumentException(("fromIndex (" + i11 + ") must be not greater than toIndex (" + i12 + ").").toString());
        }
        int i13 = (i12 - i11) / 4;
        for (int i14 = 0; i14 < i13; i14++) {
            int nextInt = nextInt();
            array[i11] = (byte) nextInt;
            array[i11 + 1] = (byte) (nextInt >>> 8);
            array[i11 + 2] = (byte) (nextInt >>> 16);
            array[i11 + 3] = (byte) (nextInt >>> 24);
            i11 += 4;
        }
        int i15 = i12 - i11;
        int nextBits = nextBits(i15 * 8);
        for (int i16 = 0; i16 < i15; i16++) {
            array[i11 + i16] = (byte) (nextBits >>> (i16 * 8));
        }
        return array;
    }

    public double nextDouble() {
        return d.d(nextBits(26), nextBits(27));
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public double nextDouble(double d11) {
        return nextDouble(0.0d, d11);
    }

    public int nextInt(int i11) {
        return nextInt(0, i11);
    }

    public long nextLong(long j11) {
        return nextLong(0L, j11);
    }

    public double nextDouble(double d11, double d12) {
        double nextDouble;
        e.d(d11, d12);
        double d13 = d12 - d11;
        if (Double.isInfinite(d13) && Math.abs(d11) <= Double.MAX_VALUE && Math.abs(d12) <= Double.MAX_VALUE) {
            double d14 = 2;
            double nextDouble2 = nextDouble() * ((d12 / d14) - (d11 / d14));
            nextDouble = d11 + nextDouble2 + nextDouble2;
        } else {
            nextDouble = d11 + (nextDouble() * d13);
        }
        return nextDouble >= d12 ? Math.nextAfter(d12, Double.NEGATIVE_INFINITY) : nextDouble;
    }

    public int nextInt(int i11, int i12) {
        int nextInt;
        int i13;
        int i14;
        e.e(i11, i12);
        int i15 = i12 - i11;
        if (i15 > 0 || i15 == Integer.MIN_VALUE) {
            if (((-i15) & i15) == i15) {
                i14 = nextBits(e.g(i15));
            } else {
                do {
                    nextInt = nextInt() >>> 1;
                    i13 = nextInt % i15;
                } while ((nextInt - i13) + (i15 - 1) < 0);
                i14 = i13;
            }
            return i11 + i14;
        }
        while (true) {
            int nextInt2 = nextInt();
            if (i11 <= nextInt2 && nextInt2 < i12) {
                return nextInt2;
            }
        }
    }

    public long nextLong(long j11, long j12) {
        long nextLong;
        long j13;
        long j14;
        int nextInt;
        e.f(j11, j12);
        long j15 = j12 - j11;
        if (j15 > 0) {
            if (((-j15) & j15) == j15) {
                int i11 = (int) j15;
                int i12 = (int) (j15 >>> 32);
                if (i11 != 0) {
                    nextInt = nextBits(e.g(i11));
                } else if (i12 == 1) {
                    nextInt = nextInt();
                } else {
                    j14 = (nextBits(e.g(i12)) << 32) + (nextInt() & 4294967295L);
                }
                j14 = nextInt & 4294967295L;
            } else {
                do {
                    nextLong = nextLong() >>> 1;
                    j13 = nextLong % j15;
                } while ((nextLong - j13) + (j15 - 1) < 0);
                j14 = j13;
            }
            return j11 + j14;
        }
        while (true) {
            long nextLong2 = nextLong();
            if (j11 <= nextLong2 && nextLong2 < j12) {
                return nextLong2;
            }
        }
    }

    @k
    public byte[] nextBytes(@k byte[] array) {
        g0.p(array, "array");
        return nextBytes(array, 0, array.length);
    }

    @k
    public byte[] nextBytes(int i11) {
        return nextBytes(new byte[i11]);
    }
}
