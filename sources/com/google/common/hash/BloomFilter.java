package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.a;
import com.google.common.math.h;
import go.e;
import ho.d0;
import ho.i0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import javax.annotation.CheckForNull;
import no.e0;
import no.i;
import ro.q;
import ro.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@go.a
/* loaded from: classes7.dex */
public final class BloomFilter<T> implements i0<T>, Serializable {
    private static final long serialVersionUID = 912559;
    private final a.c bits;
    private final Funnel<? super T> funnel;
    private final int numHashFunctions;
    private final c strategy;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a, reason: collision with root package name */
        public final long[] f34238a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34239b;

        /* renamed from: c, reason: collision with root package name */
        public final Funnel<? super T> f34240c;

        /* renamed from: d, reason: collision with root package name */
        public final c f34241d;

        public b(BloomFilter<T> bf2) {
            this.f34238a = a.c.i(((BloomFilter) bf2).bits.f34246a);
            this.f34239b = ((BloomFilter) bf2).numHashFunctions;
            this.f34240c = ((BloomFilter) bf2).funnel;
            this.f34241d = ((BloomFilter) bf2).strategy;
        }

        public Object readResolve() {
            return new BloomFilter(new a.c(this.f34238a), this.f34239b, this.f34240c, this.f34241d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c extends Serializable {
        <T> boolean E(@e0 T object, Funnel<? super T> funnel, int numHashFunctions, a.c bits);

        int ordinal();

        <T> boolean x0(@e0 T object, Funnel<? super T> funnel, int numHashFunctions, a.c bits);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int expectedInsertions, double fpp) {
        return create(funnel, expectedInsertions, fpp);
    }

    @e
    public static long optimalNumOfBits(long n11, double p11) {
        if (p11 == 0.0d) {
            p11 = Double.MIN_VALUE;
        }
        return (long) (((-n11) * Math.log(p11)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    @e
    public static int optimalNumOfHashFunctions(long n11, long m11) {
        return Math.max(1, (int) Math.round((m11 / n11) * Math.log(2.0d)));
    }

    public static <T> BloomFilter<T> readFrom(InputStream in2, Funnel<? super T> funnel) throws IOException {
        int i11;
        int i12;
        Preconditions.checkNotNull(in2, "InputStream");
        Preconditions.checkNotNull(funnel, "Funnel");
        int i13 = -1;
        try {
            try {
                DataInputStream dataInputStream = new DataInputStream(in2);
                byte readByte = dataInputStream.readByte();
                try {
                    i12 = r.p(dataInputStream.readByte());
                    try {
                        i13 = dataInputStream.readInt();
                        com.google.common.hash.a aVar = com.google.common.hash.a.values()[readByte];
                        a.c cVar = new a.c(h.d(i13, 64L));
                        for (int i14 = 0; i14 < i13; i14++) {
                            cVar.g(i14, dataInputStream.readLong());
                        }
                        return new BloomFilter<>(cVar, i12, funnel, aVar);
                    } catch (Exception e11) {
                        e = e11;
                        int i15 = i13;
                        i13 = readByte;
                        i11 = i15;
                        throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + i13 + " numHashFunctions: " + i12 + " dataLength: " + i11, e);
                    }
                } catch (Exception e12) {
                    e = e12;
                    i12 = -1;
                    i13 = readByte;
                    i11 = -1;
                }
            } catch (IOException e13) {
                throw e13;
            }
        } catch (Exception e14) {
            e = e14;
            i11 = -1;
            i12 = -1;
        }
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new b(this);
    }

    @Override // ho.i0
    @Deprecated
    public boolean apply(@e0 T input) {
        return mightContain(input);
    }

    public long approximateElementCount() {
        double b11 = this.bits.b();
        return com.google.common.math.c.q(((-Math.log1p(-(this.bits.a() / b11))) * b11) / this.numHashFunctions, RoundingMode.HALF_UP);
    }

    @e
    public long bitSize() {
        return this.bits.b();
    }

    public BloomFilter<T> copy() {
        return new BloomFilter<>(this.bits.c(), this.numHashFunctions, this.funnel, this.strategy);
    }

    @Override // ho.i0
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof BloomFilter) {
            BloomFilter bloomFilter = (BloomFilter) object;
            if (this.numHashFunctions == bloomFilter.numHashFunctions && this.funnel.equals(bloomFilter.funnel) && this.bits.equals(bloomFilter.bits) && this.strategy.equals(bloomFilter.strategy)) {
                return true;
            }
        }
        return false;
    }

    public double expectedFpp() {
        return Math.pow(this.bits.a() / bitSize(), this.numHashFunctions);
    }

    public int hashCode() {
        return d0.b(Integer.valueOf(this.numHashFunctions), this.funnel, this.strategy, this.bits);
    }

    public boolean isCompatible(BloomFilter<T> that) {
        Preconditions.checkNotNull(that);
        return this != that && this.numHashFunctions == that.numHashFunctions && bitSize() == that.bitSize() && this.strategy.equals(that.strategy) && this.funnel.equals(that.funnel);
    }

    public boolean mightContain(@e0 T object) {
        return this.strategy.E(object, this.funnel, this.numHashFunctions, this.bits);
    }

    @uo.a
    public boolean put(@e0 T object) {
        return this.strategy.x0(object, this.funnel, this.numHashFunctions, this.bits);
    }

    public void putAll(BloomFilter<T> that) {
        Preconditions.checkNotNull(that);
        Preconditions.checkArgument(this != that, "Cannot combine a BloomFilter with itself.");
        int i11 = this.numHashFunctions;
        int i12 = that.numHashFunctions;
        Preconditions.checkArgument(i11 == i12, "BloomFilters must have the same number of hash functions (%s != %s)", i11, i12);
        Preconditions.checkArgument(bitSize() == that.bitSize(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", bitSize(), that.bitSize());
        Preconditions.checkArgument(this.strategy.equals(that.strategy), "BloomFilters must have equal strategies (%s != %s)", this.strategy, that.strategy);
        Preconditions.checkArgument(this.funnel.equals(that.funnel), "BloomFilters must have equal funnels (%s != %s)", this.funnel, that.funnel);
        this.bits.f(that.bits);
    }

    public void writeTo(OutputStream out) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeByte(q.a(this.strategy.ordinal()));
        dataOutputStream.writeByte(r.a(this.numHashFunctions));
        dataOutputStream.writeInt(this.bits.f34246a.length());
        for (int i11 = 0; i11 < this.bits.f34246a.length(); i11++) {
            dataOutputStream.writeLong(this.bits.f34246a.get(i11));
        }
    }

    private BloomFilter(a.c bits, int numHashFunctions, Funnel<? super T> funnel, c strategy) {
        Preconditions.checkArgument(numHashFunctions > 0, "numHashFunctions (%s) must be > 0", numHashFunctions);
        Preconditions.checkArgument(numHashFunctions <= 255, "numHashFunctions (%s) must be <= 255", numHashFunctions);
        this.bits = (a.c) Preconditions.checkNotNull(bits);
        this.numHashFunctions = numHashFunctions;
        this.funnel = (Funnel) Preconditions.checkNotNull(funnel);
        this.strategy = (c) Preconditions.checkNotNull(strategy);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long expectedInsertions, double fpp) {
        return create(funnel, expectedInsertions, fpp, com.google.common.hash.a.f34243b);
    }

    @e
    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long expectedInsertions, double fpp, c strategy) {
        Preconditions.checkNotNull(funnel);
        Preconditions.checkArgument(expectedInsertions >= 0, "Expected insertions (%s) must be >= 0", expectedInsertions);
        Preconditions.checkArgument(fpp > 0.0d, "False positive probability (%s) must be > 0.0", Double.valueOf(fpp));
        Preconditions.checkArgument(fpp < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(fpp));
        Preconditions.checkNotNull(strategy);
        if (expectedInsertions == 0) {
            expectedInsertions = 1;
        }
        long optimalNumOfBits = optimalNumOfBits(expectedInsertions, fpp);
        try {
            return new BloomFilter<>(new a.c(optimalNumOfBits), optimalNumOfHashFunctions(expectedInsertions, optimalNumOfBits), funnel, strategy);
        } catch (IllegalArgumentException e11) {
            throw new IllegalArgumentException("Could not create BloomFilter of " + optimalNumOfBits + " bits", e11);
        }
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int expectedInsertions) {
        return create(funnel, expectedInsertions);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long expectedInsertions) {
        return create(funnel, expectedInsertions, 0.03d);
    }
}
