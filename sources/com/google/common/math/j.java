package com.google.common.math;

import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.d
@go.c
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final m f34348a = new m();

    /* renamed from: b, reason: collision with root package name */
    public final m f34349b = new m();

    /* renamed from: c, reason: collision with root package name */
    public double f34350c = 0.0d;

    public static double d(double value) {
        return ro.d.g(value, -1.0d, 1.0d);
    }

    public void a(double x11, double y11) {
        this.f34348a.a(x11);
        if (!ro.d.o(x11) || !ro.d.o(y11)) {
            this.f34350c = Double.NaN;
        } else if (this.f34348a.j() > 1) {
            this.f34350c += (x11 - this.f34348a.l()) * (y11 - this.f34349b.l());
        }
        this.f34349b.a(y11);
    }

    public void b(PairedStats values) {
        if (values.count() == 0) {
            return;
        }
        this.f34348a.b(values.xStats());
        if (this.f34349b.j() == 0) {
            this.f34350c = values.sumOfProductsOfDeltas();
        } else {
            this.f34350c += values.sumOfProductsOfDeltas() + ((values.xStats().mean() - this.f34348a.l()) * (values.yStats().mean() - this.f34349b.l()) * values.count());
        }
        this.f34349b.b(values.yStats());
    }

    public long c() {
        return this.f34348a.j();
    }

    public final double e(double value) {
        if (value > 0.0d) {
            return value;
        }
        return Double.MIN_VALUE;
    }

    public final g f() {
        Preconditions.checkState(c() > 1);
        if (Double.isNaN(this.f34350c)) {
            return g.a();
        }
        double u11 = this.f34348a.u();
        if (u11 > 0.0d) {
            return this.f34349b.u() > 0.0d ? g.f(this.f34348a.l(), this.f34349b.l()).b(this.f34350c / u11) : g.b(this.f34349b.l());
        }
        Preconditions.checkState(this.f34349b.u() > 0.0d);
        return g.i(this.f34348a.l());
    }

    public final double g() {
        Preconditions.checkState(c() > 1);
        if (Double.isNaN(this.f34350c)) {
            return Double.NaN;
        }
        double u11 = this.f34348a.u();
        double u12 = this.f34349b.u();
        Preconditions.checkState(u11 > 0.0d);
        Preconditions.checkState(u12 > 0.0d);
        return d(this.f34350c / Math.sqrt(e(u11 * u12)));
    }

    public double h() {
        Preconditions.checkState(c() != 0);
        return this.f34350c / c();
    }

    public final double i() {
        Preconditions.checkState(c() > 1);
        return this.f34350c / (c() - 1);
    }

    public PairedStats j() {
        return new PairedStats(this.f34348a.s(), this.f34349b.s(), this.f34350c);
    }

    public Stats k() {
        return this.f34348a.s();
    }

    public Stats l() {
        return this.f34349b.s();
    }
}
