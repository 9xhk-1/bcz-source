package com.github.mikephil.charting.components;

import android.graphics.Paint;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class YAxis extends em.a {
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public YAxisLabelPosition T;
    public AxisDependency U;
    public float V;
    public float W;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum AxisDependency {
        LEFT,
        RIGHT
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum YAxisLabelPosition {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public YAxis() {
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = -7829368;
        this.Q = 1.0f;
        this.R = 10.0f;
        this.S = 10.0f;
        this.T = YAxisLabelPosition.OUTSIDE_CHART;
        this.V = 0.0f;
        this.W = Float.POSITIVE_INFINITY;
        this.U = AxisDependency.LEFT;
        this.f49902c = 0.0f;
    }

    public float A0(Paint paint) {
        paint.setTextSize(this.f49904e);
        float d11 = k.d(paint, E()) + (d() * 2.0f);
        float y02 = y0();
        float x02 = x0();
        if (y02 > 0.0f) {
            y02 = k.e(y02);
        }
        if (x02 > 0.0f && x02 != Float.POSITIVE_INFINITY) {
            x02 = k.e(x02);
        }
        if (x02 <= 0.0d) {
            x02 = d11;
        }
        return Math.max(y02, Math.min(d11, x02));
    }

    public float B0() {
        return this.S;
    }

    public float C0() {
        return this.R;
    }

    public int D0() {
        return this.P;
    }

    public float E0() {
        return this.Q;
    }

    public boolean F0() {
        return this.J;
    }

    public boolean G0() {
        return this.K;
    }

    public boolean H0() {
        return this.M;
    }

    public boolean I0() {
        return this.L;
    }

    @Deprecated
    public boolean J0() {
        return this.O;
    }

    @Deprecated
    public boolean K0() {
        return this.N;
    }

    public boolean L0() {
        return f() && P() && w0() == YAxisLabelPosition.OUTSIDE_CHART;
    }

    public void M0(boolean z11) {
        this.K = z11;
    }

    public void N0(boolean z11) {
        this.M = z11;
    }

    public void O0(boolean z11) {
        this.L = z11;
    }

    public void P0(float f11) {
        this.W = f11;
    }

    public void Q0(float f11) {
        this.V = f11;
    }

    public void R0(YAxisLabelPosition yAxisLabelPosition) {
        this.T = yAxisLabelPosition;
    }

    public void S0(float f11) {
        this.S = f11;
    }

    public void T0(float f11) {
        this.R = f11;
    }

    @Deprecated
    public void U0(boolean z11) {
        if (z11) {
            e0(0.0f);
        } else {
            X();
        }
    }

    @Deprecated
    public void V0(boolean z11) {
        this.O = z11;
    }

    @Deprecated
    public void W0(boolean z11) {
        this.N = z11;
    }

    public void X0(int i11) {
        this.P = i11;
    }

    public void Y0(float f11) {
        this.Q = k.e(f11);
    }

    @Override // em.a
    public void n(float f11, float f12) {
        if (Math.abs(f12 - f11) == 0.0f) {
            f12 += 1.0f;
            f11 -= 1.0f;
        }
        float abs = Math.abs(f12 - f11);
        this.H = this.E ? this.H : f11 - ((abs / 100.0f) * B0());
        float C0 = this.F ? this.G : f12 + ((abs / 100.0f) * C0());
        this.G = C0;
        this.I = Math.abs(this.H - C0);
    }

    public AxisDependency v0() {
        return this.U;
    }

    public YAxisLabelPosition w0() {
        return this.T;
    }

    public float x0() {
        return this.W;
    }

    public float y0() {
        return this.V;
    }

    public float z0(Paint paint) {
        paint.setTextSize(this.f49904e);
        return k.a(paint, E()) + (e() * 2.0f);
    }

    public YAxis(AxisDependency axisDependency) {
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = -7829368;
        this.Q = 1.0f;
        this.R = 10.0f;
        this.S = 10.0f;
        this.T = YAxisLabelPosition.OUTSIDE_CHART;
        this.V = 0.0f;
        this.W = Float.POSITIVE_INFINITY;
        this.U = axisDependency;
        this.f49902c = 0.0f;
    }
}
