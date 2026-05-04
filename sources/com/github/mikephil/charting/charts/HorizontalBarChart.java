package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import im.d;
import km.a;
import pm.h;
import pm.r;
import pm.u;
import rm.e;
import rm.g;
import rm.i;
import rm.j;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class HorizontalBarChart extends BarChart {
    public RectF H1;
    public float[] I1;

    public HorizontalBarChart(Context context) {
        super(context);
        this.H1 = new RectF();
        this.I1 = new float[2];
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void G0() {
        i iVar = this.f30140r1;
        YAxis yAxis = this.f30136n1;
        float f11 = yAxis.H;
        float f12 = yAxis.I;
        XAxis xAxis = this.f30165i;
        iVar.q(f11, f12, xAxis.I, xAxis.H);
        i iVar2 = this.f30139q1;
        YAxis yAxis2 = this.f30135m1;
        float f13 = yAxis2.H;
        float f14 = yAxis2.I;
        XAxis xAxis2 = this.f30165i;
        iVar2.q(f13, f14, xAxis2.I, xAxis2.H);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void H() {
        this.f30176t = new e();
        super.H();
        this.f30139q1 = new j(this.f30176t);
        this.f30140r1 = new j(this.f30176t);
        this.f30174r = new h(this, this.f30177u, this.f30176t);
        setHighlighter(new im.e(this));
        this.f30137o1 = new u(this.f30176t, this.f30135m1, this.f30139q1);
        this.f30138p1 = new u(this.f30176t, this.f30136n1, this.f30140r1);
        this.f30141s1 = new r(this.f30176t, this.f30165i, this.f30139q1, this);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void M0(float f11, float f12) {
        float f13 = this.f30165i.I;
        this.f30176t.b0(f13 / f11, f13 / f12);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void N0(float f11, float f12, YAxis.AxisDependency axisDependency) {
        this.f30176t.a0(g0(axisDependency) / f11, g0(axisDependency) / f12);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void O0(float f11, YAxis.AxisDependency axisDependency) {
        this.f30176t.c0(g0(axisDependency) / f11);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void P0(float f11, YAxis.AxisDependency axisDependency) {
        this.f30176t.Y(g0(axisDependency) / f11);
    }

    @Override // com.github.mikephil.charting.charts.BarChart
    public void X0(BarEntry barEntry, RectF rectF) {
        a aVar = (a) ((fm.a) this.f30158b).n(barEntry);
        if (aVar == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float c11 = barEntry.c();
        float j11 = barEntry.j();
        float Q = ((fm.a) this.f30158b).Q() / 2.0f;
        float f11 = j11 - Q;
        float f12 = j11 + Q;
        float f13 = c11 >= 0.0f ? c11 : 0.0f;
        if (c11 > 0.0f) {
            c11 = 0.0f;
        }
        rectF.set(f13, f11, c11, f12);
        d(aVar.F0()).t(rectF);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, jm.b
    public float getHighestVisibleX() {
        d(YAxis.AxisDependency.LEFT).k(this.f30176t.h(), this.f30176t.j(), this.B1);
        return (float) Math.min(this.f30165i.G, this.B1.f84262d);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, jm.b
    public float getLowestVisibleX() {
        d(YAxis.AxisDependency.LEFT).k(this.f30176t.h(), this.f30176t.f(), this.A1);
        return (float) Math.max(this.f30165i.H, this.A1.f84262d);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public g k0(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        float[] fArr = this.I1;
        fArr[0] = entry.c();
        fArr[1] = entry.j();
        d(axisDependency).o(fArr);
        return g.c(fArr[0], fArr[1]);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void p() {
        a0(this.H1);
        RectF rectF = this.H1;
        float f11 = rectF.left + 0.0f;
        float f12 = rectF.top + 0.0f;
        float f13 = rectF.right + 0.0f;
        float f14 = rectF.bottom + 0.0f;
        if (this.f30135m1.L0()) {
            f12 += this.f30135m1.z0(this.f30137o1.c());
        }
        if (this.f30136n1.L0()) {
            f14 += this.f30136n1.z0(this.f30138p1.c());
        }
        XAxis xAxis = this.f30165i;
        float f15 = xAxis.L;
        if (xAxis.f()) {
            if (this.f30165i.w0() == XAxis.XAxisPosition.BOTTOM) {
                f11 += f15;
            } else {
                if (this.f30165i.w0() != XAxis.XAxisPosition.TOP) {
                    if (this.f30165i.w0() == XAxis.XAxisPosition.BOTH_SIDED) {
                        f11 += f15;
                    }
                }
                f13 += f15;
            }
        }
        float extraTopOffset = f12 + getExtraTopOffset();
        float extraRightOffset = f13 + getExtraRightOffset();
        float extraBottomOffset = f14 + getExtraBottomOffset();
        float extraLeftOffset = f11 + getExtraLeftOffset();
        float e11 = k.e(this.f30132j1);
        this.f30176t.U(Math.max(e11, extraLeftOffset), Math.max(e11, extraTopOffset), Math.max(e11, extraRightOffset), Math.max(e11, extraBottomOffset));
        if (this.f30157a) {
            Log.i(Chart.G, "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Content: ");
            sb2.append(this.f30176t.q().toString());
            Log.i(Chart.G, sb2.toString());
        }
        F0();
        G0();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMaximum(float f11) {
        this.f30176t.d0(this.f30165i.I / f11);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMinimum(float f11) {
        this.f30176t.Z(this.f30165i.I / f11);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.Chart
    public d x(float f11, float f12) {
        if (this.f30158b != 0) {
            return getHighlighter().a(f12, f11);
        }
        if (!this.f30157a) {
            return null;
        }
        Log.e(Chart.G, "Can't select by touch. No data set.");
        return null;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public float[] y(d dVar) {
        return new float[]{dVar.f(), dVar.e()};
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H1 = new RectF();
        this.I1 = new float[2];
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.H1 = new RectF();
        this.I1 = new float[2];
    }
}
