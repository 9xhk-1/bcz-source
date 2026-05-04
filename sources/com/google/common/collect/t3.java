package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class t3<C extends Comparable> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33863a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends t3<BigInteger> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final b f33864b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final BigInteger f33865c = BigInteger.valueOf(Long.MIN_VALUE);

        /* renamed from: d, reason: collision with root package name */
        public static final BigInteger f33866d = BigInteger.valueOf(Long.MAX_VALUE);
        private static final long serialVersionUID = 0;

        public b() {
            super(true);
        }

        private Object readResolve() {
            return f33864b;
        }

        @Override // com.google.common.collect.t3
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public long b(BigInteger start, BigInteger end) {
            return end.subtract(start).max(f33865c).min(f33866d).longValue();
        }

        @Override // com.google.common.collect.t3
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public BigInteger g(BigInteger value) {
            return value.add(BigInteger.ONE);
        }

        @Override // com.google.common.collect.t3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public BigInteger h(BigInteger origin, long distance) {
            x2.c(distance, "distance");
            return origin.add(BigInteger.valueOf(distance));
        }

        @Override // com.google.common.collect.t3
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public BigInteger i(BigInteger value) {
            return value.subtract(BigInteger.ONE);
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends t3<Integer> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final c f33867b = new c();
        private static final long serialVersionUID = 0;

        public c() {
            super(true);
        }

        private Object readResolve() {
            return f33867b;
        }

        @Override // com.google.common.collect.t3
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public long b(Integer start, Integer end) {
            return end.intValue() - start.intValue();
        }

        @Override // com.google.common.collect.t3
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer e() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.t3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer f() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.t3
        @CheckForNull
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer g(Integer value) {
            int intValue = value.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        @Override // com.google.common.collect.t3
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public Integer h(Integer origin, long distance) {
            x2.c(distance, "distance");
            return Integer.valueOf(ro.i.e(origin.longValue() + distance));
        }

        @Override // com.google.common.collect.t3
        @CheckForNull
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public Integer i(Integer value) {
            int intValue = value.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends t3<Long> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final d f33868b = new d();
        private static final long serialVersionUID = 0;

        public d() {
            super(true);
        }

        private Object readResolve() {
            return f33868b;
        }

        @Override // com.google.common.collect.t3
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public long b(Long start, Long end) {
            long longValue = end.longValue() - start.longValue();
            if (end.longValue() > start.longValue() && longValue < 0) {
                return Long.MAX_VALUE;
            }
            if (end.longValue() >= start.longValue() || longValue <= 0) {
                return longValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.t3
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Long e() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.t3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long f() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.t3
        @CheckForNull
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long g(Long value) {
            long longValue = value.longValue();
            if (longValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(longValue + 1);
        }

        @Override // com.google.common.collect.t3
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public Long h(Long origin, long distance) {
            x2.c(distance, "distance");
            long longValue = origin.longValue() + distance;
            if (longValue < 0) {
                Preconditions.checkArgument(origin.longValue() < 0, "overflow");
            }
            return Long.valueOf(longValue);
        }

        @Override // com.google.common.collect.t3
        @CheckForNull
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public Long i(Long value) {
            long longValue = value.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(longValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public static t3<BigInteger> a() {
        return b.f33864b;
    }

    public static t3<Integer> c() {
        return c.f33867b;
    }

    public static t3<Long> d() {
        return d.f33868b;
    }

    public abstract long b(C start, C end);

    @uo.a
    public C e() {
        throw new NoSuchElementException();
    }

    @uo.a
    public C f() {
        throw new NoSuchElementException();
    }

    @CheckForNull
    public abstract C g(C value);

    public C h(C origin, long distance) {
        x2.c(distance, "distance");
        C c11 = origin;
        for (long j11 = 0; j11 < distance; j11++) {
            c11 = g(c11);
            if (c11 == null) {
                throw new IllegalArgumentException("overflowed computing offset(" + origin + org.junit.jupiter.api.j2.O + distance + pn.j.f81007d);
            }
        }
        return c11;
    }

    @CheckForNull
    public abstract C i(C value);

    public t3() {
        this(false);
    }

    public t3(boolean supportsFastOffset) {
        this.f33863a = supportsFastOffset;
    }
}
