package com.google.common.util.concurrent;

import com.google.common.util.concurrent.c2;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class k2 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public double f34701c;

    /* renamed from: d, reason: collision with root package name */
    public double f34702d;

    /* renamed from: e, reason: collision with root package name */
    public double f34703e;

    /* renamed from: f, reason: collision with root package name */
    public long f34704f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends k2 {

        /* renamed from: g, reason: collision with root package name */
        public final double f34705g;

        public b(c2.a stopwatch, double maxBurstSeconds) {
            super(stopwatch);
            this.f34705g = maxBurstSeconds;
        }

        @Override // com.google.common.util.concurrent.k2
        public double v() {
            return this.f34703e;
        }

        @Override // com.google.common.util.concurrent.k2
        public void w(double permitsPerSecond, double stableIntervalMicros) {
            double d11 = this.f34702d;
            double d12 = this.f34705g * permitsPerSecond;
            this.f34702d = d12;
            if (d11 == Double.POSITIVE_INFINITY) {
                this.f34701c = d12;
            } else {
                this.f34701c = d11 != 0.0d ? (this.f34701c * d12) / d11 : 0.0d;
            }
        }

        @Override // com.google.common.util.concurrent.k2
        public long y(double storedPermits, double permitsToTake) {
            return 0L;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends k2 {

        /* renamed from: g, reason: collision with root package name */
        public final long f34706g;

        /* renamed from: h, reason: collision with root package name */
        public double f34707h;

        /* renamed from: i, reason: collision with root package name */
        public double f34708i;

        /* renamed from: j, reason: collision with root package name */
        public double f34709j;

        public c(c2.a stopwatch, long warmupPeriod, TimeUnit timeUnit, double coldFactor) {
            super(stopwatch);
            this.f34706g = timeUnit.toMicros(warmupPeriod);
            this.f34709j = coldFactor;
        }

        @Override // com.google.common.util.concurrent.k2
        public double v() {
            return this.f34706g / this.f34702d;
        }

        @Override // com.google.common.util.concurrent.k2
        public void w(double permitsPerSecond, double stableIntervalMicros) {
            double d11 = this.f34702d;
            double d12 = this.f34709j * stableIntervalMicros;
            long j11 = this.f34706g;
            double d13 = (j11 * 0.5d) / stableIntervalMicros;
            this.f34708i = d13;
            double d14 = ((j11 * 2.0d) / (stableIntervalMicros + d12)) + d13;
            this.f34702d = d14;
            this.f34707h = (d12 - stableIntervalMicros) / (d14 - d13);
            if (d11 == Double.POSITIVE_INFINITY) {
                this.f34701c = 0.0d;
                return;
            }
            if (d11 != 0.0d) {
                d14 = (this.f34701c * d14) / d11;
            }
            this.f34701c = d14;
        }

        @Override // com.google.common.util.concurrent.k2
        public long y(double storedPermits, double permitsToTake) {
            long j11;
            double d11 = storedPermits - this.f34708i;
            if (d11 > 0.0d) {
                double min = Math.min(d11, permitsToTake);
                j11 = (long) (((z(d11) + z(d11 - min)) * min) / 2.0d);
                permitsToTake -= min;
            } else {
                j11 = 0;
            }
            return j11 + ((long) (this.f34703e * permitsToTake));
        }

        public final double z(double permits) {
            return this.f34703e + (permits * this.f34707h);
        }
    }

    @Override // com.google.common.util.concurrent.c2
    public final double i() {
        return TimeUnit.SECONDS.toMicros(1L) / this.f34703e;
    }

    @Override // com.google.common.util.concurrent.c2
    public final void j(double permitsPerSecond, long nowMicros) {
        x(nowMicros);
        double micros = TimeUnit.SECONDS.toMicros(1L) / permitsPerSecond;
        this.f34703e = micros;
        w(permitsPerSecond, micros);
    }

    @Override // com.google.common.util.concurrent.c2
    public final long m(long nowMicros) {
        return this.f34704f;
    }

    @Override // com.google.common.util.concurrent.c2
    public final long p(int requiredPermits, long nowMicros) {
        x(nowMicros);
        long j11 = this.f34704f;
        double d11 = requiredPermits;
        double min = Math.min(d11, this.f34701c);
        this.f34704f = com.google.common.math.h.x(this.f34704f, y(this.f34701c, min) + ((long) ((d11 - min) * this.f34703e)));
        this.f34701c -= min;
        return j11;
    }

    public abstract double v();

    public abstract void w(double permitsPerSecond, double stableIntervalMicros);

    public void x(long nowMicros) {
        if (nowMicros > this.f34704f) {
            this.f34701c = Math.min(this.f34702d, this.f34701c + ((nowMicros - r0) / v()));
            this.f34704f = nowMicros;
        }
    }

    public abstract long y(double storedPermits, double permitsToTake);

    public k2(c2.a stopwatch) {
        super(stopwatch);
        this.f34704f = 0L;
    }
}
