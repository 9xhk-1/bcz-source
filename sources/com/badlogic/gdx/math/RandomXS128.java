package com.badlogic.gdx.math;

import java.util.Random;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class RandomXS128 extends Random {
    private static final double NORM_DOUBLE = 1.1102230246251565E-16d;
    private static final double NORM_FLOAT = 5.9604644775390625E-8d;
    private long seed0;
    private long seed1;

    public RandomXS128() {
        setSeed(new Random().nextLong());
    }

    private static final long murmurHash3(long j11) {
        long j12 = (j11 ^ (j11 >>> 33)) * (-49064778989728563L);
        long j13 = (j12 ^ (j12 >>> 33)) * (-4265267296055464877L);
        return j13 ^ (j13 >>> 33);
    }

    public long getState(int i11) {
        return i11 == 0 ? this.seed0 : this.seed1;
    }

    @Override // java.util.Random
    public final int next(int i11) {
        return (int) (nextLong() & ((1 << i11) - 1));
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return (nextLong() & 1) != 0;
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bArr) {
        int length = bArr.length;
        while (length != 0) {
            int i11 = length < 8 ? length : 8;
            long nextLong = nextLong();
            while (true) {
                int i12 = i11 - 1;
                if (i11 != 0) {
                    length--;
                    bArr[length] = (byte) nextLong;
                    nextLong >>= 8;
                    i11 = i12;
                }
            }
        }
    }

    @Override // java.util.Random
    public double nextDouble() {
        return (nextLong() >>> 11) * NORM_DOUBLE;
    }

    @Override // java.util.Random
    public float nextFloat() {
        return (float) ((nextLong() >>> 40) * NORM_FLOAT);
    }

    @Override // java.util.Random
    public int nextInt() {
        return (int) nextLong();
    }

    @Override // java.util.Random
    public long nextLong() {
        long j11 = this.seed0;
        long j12 = this.seed1;
        this.seed0 = j12;
        long j13 = j11 ^ (j11 << 23);
        long j14 = ((j13 >>> 17) ^ (j13 ^ j12)) ^ (j12 >>> 26);
        this.seed1 = j14;
        return j14 + j12;
    }

    @Override // java.util.Random
    public void setSeed(long j11) {
        if (j11 == 0) {
            j11 = Long.MIN_VALUE;
        }
        long murmurHash3 = murmurHash3(j11);
        setState(murmurHash3, murmurHash3(murmurHash3));
    }

    public void setState(long j11, long j12) {
        this.seed0 = j11;
        this.seed1 = j12;
    }

    @Override // java.util.Random
    public int nextInt(int i11) {
        return (int) nextLong(i11);
    }

    public RandomXS128(long j11) {
        setSeed(j11);
    }

    public RandomXS128(long j11, long j12) {
        setState(j11, j12);
    }

    public long nextLong(long j11) {
        long nextLong;
        long j12;
        if (j11 <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        do {
            nextLong = nextLong() >>> 1;
            j12 = nextLong % j11;
        } while ((nextLong - j12) + (j11 - 1) < 0);
        return j12;
    }
}
