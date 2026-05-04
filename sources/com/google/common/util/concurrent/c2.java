package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.k2;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final a f34493a;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    public volatile Object f34494b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.util.concurrent.c2$a$a, reason: collision with other inner class name */
        public class C0430a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final ho.n0 f34495a = ho.n0.c();

            @Override // com.google.common.util.concurrent.c2.a
            public long b() {
                return this.f34495a.g(TimeUnit.MICROSECONDS);
            }

            @Override // com.google.common.util.concurrent.c2.a
            public void c(long micros) {
                if (micros > 0) {
                    y2.k(micros, TimeUnit.MICROSECONDS);
                }
            }
        }

        public static a a() {
            return new C0430a();
        }

        public abstract long b();

        public abstract void c(long micros);
    }

    public c2(a stopwatch) {
        this.f34493a = (a) Preconditions.checkNotNull(stopwatch);
    }

    public static void d(int permits) {
        Preconditions.checkArgument(permits > 0, "Requested permits (%s) must be positive", permits);
    }

    public static c2 e(double permitsPerSecond) {
        return h(permitsPerSecond, a.a());
    }

    public static c2 f(double permitsPerSecond, long warmupPeriod, TimeUnit unit) {
        Preconditions.checkArgument(warmupPeriod >= 0, "warmupPeriod must not be negative: %s", warmupPeriod);
        return g(permitsPerSecond, warmupPeriod, unit, 3.0d, a.a());
    }

    @go.e
    public static c2 g(double permitsPerSecond, long warmupPeriod, TimeUnit unit, double coldFactor, a stopwatch) {
        k2.c cVar = new k2.c(stopwatch, warmupPeriod, unit, coldFactor);
        cVar.q(permitsPerSecond);
        return cVar;
    }

    @go.e
    public static c2 h(double permitsPerSecond, a stopwatch) {
        k2.b bVar = new k2.b(stopwatch, 1.0d);
        bVar.q(permitsPerSecond);
        return bVar;
    }

    @uo.a
    public double a() {
        return b(1);
    }

    @uo.a
    public double b(int permits) {
        long n11 = n(permits);
        this.f34493a.c(n11);
        return (n11 * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public final boolean c(long nowMicros, long timeoutMicros) {
        return m(nowMicros) - timeoutMicros <= nowMicros;
    }

    public abstract double i();

    public abstract void j(double permitsPerSecond, long nowMicros);

    public final double k() {
        double i11;
        synchronized (l()) {
            i11 = i();
        }
        return i11;
    }

    public final Object l() {
        Object obj;
        Object obj2 = this.f34494b;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f34494b;
                if (obj == null) {
                    obj = new Object();
                    this.f34494b = obj;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public abstract long m(long nowMicros);

    public final long n(int permits) {
        long o11;
        d(permits);
        synchronized (l()) {
            o11 = o(permits, this.f34493a.b());
        }
        return o11;
    }

    public final long o(int permits, long nowMicros) {
        return Math.max(p(permits, nowMicros) - nowMicros, 0L);
    }

    public abstract long p(int permits, long nowMicros);

    public final void q(double permitsPerSecond) {
        Preconditions.checkArgument(permitsPerSecond > 0.0d, "rate must be positive");
        synchronized (l()) {
            j(permitsPerSecond, this.f34493a.b());
        }
    }

    public boolean r() {
        return t(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean s(int permits) {
        return t(permits, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean t(int permits, long timeout, TimeUnit unit) {
        long max = Math.max(unit.toMicros(timeout), 0L);
        d(permits);
        synchronized (l()) {
            try {
                long b11 = this.f34493a.b();
                if (!c(b11, max)) {
                    return false;
                }
                this.f34493a.c(o(permits, b11));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(k()));
    }

    public boolean u(long timeout, TimeUnit unit) {
        return t(1, timeout, unit);
    }
}
