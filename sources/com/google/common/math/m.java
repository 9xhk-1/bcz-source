package com.google.common.math;

import com.google.common.base.Preconditions;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.d
@go.c
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public long f34356a = 0;

    /* renamed from: b, reason: collision with root package name */
    public double f34357b = 0.0d;

    /* renamed from: c, reason: collision with root package name */
    public double f34358c = 0.0d;

    /* renamed from: d, reason: collision with root package name */
    public double f34359d = Double.NaN;

    /* renamed from: e, reason: collision with root package name */
    public double f34360e = Double.NaN;

    public static double i(double previousMean, double value) {
        if (ro.d.o(previousMean)) {
            return value;
        }
        if (ro.d.o(value) || previousMean == value) {
            return previousMean;
        }
        return Double.NaN;
    }

    public void a(double value) {
        long j11 = this.f34356a;
        if (j11 == 0) {
            this.f34356a = 1L;
            this.f34357b = value;
            this.f34359d = value;
            this.f34360e = value;
            if (ro.d.o(value)) {
                return;
            }
            this.f34358c = Double.NaN;
            return;
        }
        this.f34356a = j11 + 1;
        if (ro.d.o(value) && ro.d.o(this.f34357b)) {
            double d11 = this.f34357b;
            double d12 = value - d11;
            double d13 = d11 + (d12 / this.f34356a);
            this.f34357b = d13;
            this.f34358c += d12 * (value - d13);
        } else {
            this.f34357b = i(this.f34357b, value);
            this.f34358c = Double.NaN;
        }
        this.f34359d = Math.min(this.f34359d, value);
        this.f34360e = Math.max(this.f34360e, value);
    }

    public void b(Stats values) {
        if (values.count() == 0) {
            return;
        }
        m(values.count(), values.mean(), values.sumOfSquaresOfDeltas(), values.min(), values.max());
    }

    public void c(m values) {
        if (values.j() == 0) {
            return;
        }
        m(values.j(), values.l(), values.u(), values.n(), values.k());
    }

    public void d(Iterable<? extends Number> values) {
        Iterator<? extends Number> it = values.iterator();
        while (it.hasNext()) {
            a(it.next().doubleValue());
        }
    }

    public void e(Iterator<? extends Number> values) {
        while (values.hasNext()) {
            a(values.next().doubleValue());
        }
    }

    public void f(double... values) {
        for (double d11 : values) {
            a(d11);
        }
    }

    public void g(int... values) {
        for (int i11 : values) {
            a(i11);
        }
    }

    public void h(long... values) {
        for (long j11 : values) {
            a(j11);
        }
    }

    public long j() {
        return this.f34356a;
    }

    public double k() {
        Preconditions.checkState(this.f34356a != 0);
        return this.f34360e;
    }

    public double l() {
        Preconditions.checkState(this.f34356a != 0);
        return this.f34357b;
    }

    public final void m(long otherCount, double otherMean, double otherSumOfSquaresOfDeltas, double otherMin, double otherMax) {
        long j11 = this.f34356a;
        if (j11 == 0) {
            this.f34356a = otherCount;
            this.f34357b = otherMean;
            this.f34358c = otherSumOfSquaresOfDeltas;
            this.f34359d = otherMin;
            this.f34360e = otherMax;
            return;
        }
        this.f34356a = j11 + otherCount;
        if (ro.d.o(this.f34357b) && ro.d.o(otherMean)) {
            double d11 = this.f34357b;
            double d12 = otherMean - d11;
            double d13 = otherCount;
            double d14 = d11 + ((d12 * d13) / this.f34356a);
            this.f34357b = d14;
            this.f34358c += otherSumOfSquaresOfDeltas + (d12 * (otherMean - d14) * d13);
        } else {
            this.f34357b = i(this.f34357b, otherMean);
            this.f34358c = Double.NaN;
        }
        this.f34359d = Math.min(this.f34359d, otherMin);
        this.f34360e = Math.max(this.f34360e, otherMax);
    }

    public double n() {
        Preconditions.checkState(this.f34356a != 0);
        return this.f34359d;
    }

    public final double o() {
        return Math.sqrt(p());
    }

    public final double p() {
        Preconditions.checkState(this.f34356a != 0);
        if (Double.isNaN(this.f34358c)) {
            return Double.NaN;
        }
        if (this.f34356a == 1) {
            return 0.0d;
        }
        return d.b(this.f34358c) / this.f34356a;
    }

    public final double q() {
        return Math.sqrt(r());
    }

    public final double r() {
        Preconditions.checkState(this.f34356a > 1);
        if (Double.isNaN(this.f34358c)) {
            return Double.NaN;
        }
        return d.b(this.f34358c) / (this.f34356a - 1);
    }

    public Stats s() {
        return new Stats(this.f34356a, this.f34357b, this.f34358c, this.f34359d, this.f34360e);
    }

    public final double t() {
        return this.f34357b * this.f34356a;
    }

    public double u() {
        return this.f34358c;
    }
}
