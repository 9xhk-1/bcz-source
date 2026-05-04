package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.BloomFilter;
import com.google.common.math.h;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import javax.annotation.CheckForNull;
import no.e0;
import no.i;
import no.p;
import no.x;
import no.y;
import ro.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
/* loaded from: classes7.dex */
public abstract class a implements BloomFilter.c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34242a = new C0421a("MURMUR128_MITZ_32", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f34243b = new a("MURMUR128_MITZ_64", 1) { // from class: com.google.common.hash.a.b
        {
            C0421a c0421a = null;
        }

        @Override // com.google.common.hash.BloomFilter.c
        public <T> boolean E(@e0 T object, Funnel<? super T> funnel, int numHashFunctions, c bits) {
            long b11 = bits.b();
            byte[] l11 = p.x().d(object, funnel).l();
            long b12 = b(l11);
            long c11 = c(l11);
            for (int i11 = 0; i11 < numHashFunctions; i11++) {
                if (!bits.e((Long.MAX_VALUE & b12) % b11)) {
                    return false;
                }
                b12 += c11;
            }
            return true;
        }

        public final long b(byte[] bytes) {
            return k.k(bytes[7], bytes[6], bytes[5], bytes[4], bytes[3], bytes[2], bytes[1], bytes[0]);
        }

        public final long c(byte[] bytes) {
            return k.k(bytes[15], bytes[14], bytes[13], bytes[12], bytes[11], bytes[10], bytes[9], bytes[8]);
        }

        @Override // com.google.common.hash.BloomFilter.c
        public <T> boolean x0(@e0 T object, Funnel<? super T> funnel, int numHashFunctions, c bits) {
            long b11 = bits.b();
            byte[] l11 = p.x().d(object, funnel).l();
            long b12 = b(l11);
            long c11 = c(l11);
            boolean z11 = false;
            for (int i11 = 0; i11 < numHashFunctions; i11++) {
                z11 |= bits.h((Long.MAX_VALUE & b12) % b11);
                b12 += c11;
            }
            return z11;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f34244c = a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.hash.a$a, reason: collision with other inner class name */
    public enum C0421a extends a {
        public C0421a(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }

        @Override // com.google.common.hash.BloomFilter.c
        public <T> boolean E(@e0 T object, Funnel<? super T> funnel, int numHashFunctions, c bits) {
            long b11 = bits.b();
            long c11 = p.x().d(object, funnel).c();
            int i11 = (int) c11;
            int i12 = (int) (c11 >>> 32);
            for (int i13 = 1; i13 <= numHashFunctions; i13++) {
                int i14 = (i13 * i12) + i11;
                if (i14 < 0) {
                    i14 = ~i14;
                }
                if (!bits.e(i14 % b11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.c
        public <T> boolean x0(@e0 T object, Funnel<? super T> funnel, int numHashFunctions, c bits) {
            long b11 = bits.b();
            long c11 = p.x().d(object, funnel).c();
            int i11 = (int) c11;
            int i12 = (int) (c11 >>> 32);
            boolean z11 = false;
            for (int i13 = 1; i13 <= numHashFunctions; i13++) {
                int i14 = (i13 * i12) + i11;
                if (i14 < 0) {
                    i14 = ~i14;
                }
                z11 |= bits.h(i14 % b11);
            }
            return z11;
        }
    }

    public a(String $enum$name, int $enum$ordinal) {
    }

    public static /* synthetic */ a[] a() {
        return new a[]{f34242a, f34243b};
    }

    public static a valueOf(String name) {
        return (a) Enum.valueOf(a.class, name);
    }

    public static a[] values() {
        return (a[]) f34244c.clone();
    }

    public /* synthetic */ a(String str, int i11, C0421a c0421a) {
        this(str, i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final int f34245c = 6;

        /* renamed from: a, reason: collision with root package name */
        public final AtomicLongArray f34246a;

        /* renamed from: b, reason: collision with root package name */
        public final x f34247b;

        public c(long bits) {
            Preconditions.checkArgument(bits > 0, "data length is zero!");
            this.f34246a = new AtomicLongArray(ro.i.e(h.g(bits, 64L, RoundingMode.CEILING)));
            this.f34247b = y.a();
        }

        public static long[] i(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                jArr[i11] = atomicLongArray.get(i11);
            }
            return jArr;
        }

        public long a() {
            return this.f34247b.sum();
        }

        public long b() {
            return this.f34246a.length() * 64;
        }

        public c c() {
            return new c(i(this.f34246a));
        }

        public int d() {
            return this.f34246a.length();
        }

        public boolean e(long bitIndex) {
            return ((1 << ((int) bitIndex)) & this.f34246a.get((int) (bitIndex >>> 6))) != 0;
        }

        public boolean equals(@CheckForNull Object o11) {
            if (o11 instanceof c) {
                return Arrays.equals(i(this.f34246a), i(((c) o11).f34246a));
            }
            return false;
        }

        public void f(c other) {
            Preconditions.checkArgument(this.f34246a.length() == other.f34246a.length(), "BitArrays must be of equal length (%s != %s)", this.f34246a.length(), other.f34246a.length());
            for (int i11 = 0; i11 < this.f34246a.length(); i11++) {
                g(i11, other.f34246a.get(i11));
            }
        }

        public void g(int i11, long longValue) {
            while (true) {
                long j11 = this.f34246a.get(i11);
                long j12 = j11 | longValue;
                if (j11 == j12) {
                    return;
                }
                int i12 = i11;
                if (this.f34246a.compareAndSet(i12, j11, j12)) {
                    this.f34247b.add(Long.bitCount(j12) - Long.bitCount(j11));
                    return;
                }
                i11 = i12;
            }
        }

        public boolean h(long bitIndex) {
            long j11;
            long j12;
            if (e(bitIndex)) {
                return false;
            }
            int i11 = (int) (bitIndex >>> 6);
            long j13 = 1 << ((int) bitIndex);
            do {
                j11 = this.f34246a.get(i11);
                j12 = j11 | j13;
                if (j11 == j12) {
                    return false;
                }
            } while (!this.f34246a.compareAndSet(i11, j11, j12));
            this.f34247b.increment();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(i(this.f34246a));
        }

        public c(long[] data) {
            Preconditions.checkArgument(data.length > 0, "data length is zero!");
            this.f34246a = new AtomicLongArray(data);
            this.f34247b = y.a();
            long j11 = 0;
            for (long j12 : data) {
                j11 += Long.bitCount(j12);
            }
            this.f34247b.add(j11);
        }
    }
}
