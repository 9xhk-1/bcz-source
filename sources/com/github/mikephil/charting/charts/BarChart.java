package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import fm.a;
import im.d;
import pm.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class BarChart extends BarLineChartBase<a> implements jm.a {
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;

    public BarChart(Context context) {
        super(context);
        this.D1 = false;
        this.E1 = true;
        this.F1 = false;
        this.G1 = false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void H() {
        super.H();
        this.f30174r = new b(this, this.f30177u, this.f30176t);
        setHighlighter(new im.a(this));
        getXAxis().t0(0.5f);
        getXAxis().s0(0.5f);
    }

    public RectF W0(BarEntry barEntry) {
        RectF rectF = new RectF();
        X0(barEntry, rectF);
        return rectF;
    }

    public void X0(BarEntry barEntry, RectF rectF) {
        km.a aVar = (km.a) ((a) this.f30158b).n(barEntry);
        if (aVar == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float c11 = barEntry.c();
        float j11 = barEntry.j();
        float Q = ((a) this.f30158b).Q() / 2.0f;
        float f11 = j11 - Q;
        float f12 = j11 + Q;
        float f13 = c11 >= 0.0f ? c11 : 0.0f;
        if (c11 > 0.0f) {
            c11 = 0.0f;
        }
        rectF.set(f11, f13, f12, c11);
        d(aVar.F0()).t(rectF);
    }

    public void Y0(float f11, float f12, float f13) {
        if (getBarData() == null) {
            throw new RuntimeException("You need to set data for the chart before grouping bars.");
        }
        getBarData().S(f11, f12, f13);
        O();
    }

    public void Z0(float f11, int i11, int i12) {
        F(new d(f11, i11, i12), false);
    }

    @Override // jm.a
    public boolean a() {
        return this.E1;
    }

    @Override // jm.a
    public boolean b() {
        return this.D1;
    }

    @Override // jm.a
    public boolean c() {
        return this.F1;
    }

    @Override // jm.a
    public a getBarData() {
        return (a) this.f30158b;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void o() {
        if (this.G1) {
            this.f30165i.n(((a) this.f30158b).y() - (((a) this.f30158b).Q() / 2.0f), ((a) this.f30158b).x() + (((a) this.f30158b).Q() / 2.0f));
        } else {
            this.f30165i.n(((a) this.f30158b).y(), ((a) this.f30158b).x());
        }
        YAxis yAxis = this.f30135m1;
        a aVar = (a) this.f30158b;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.n(aVar.C(axisDependency), ((a) this.f30158b).A(axisDependency));
        YAxis yAxis2 = this.f30136n1;
        a aVar2 = (a) this.f30158b;
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        yAxis2.n(aVar2.C(axisDependency2), ((a) this.f30158b).A(axisDependency2));
    }

    public void setDrawBarShadow(boolean z11) {
        this.F1 = z11;
    }

    public void setDrawValueAboveBar(boolean z11) {
        this.E1 = z11;
    }

    public void setFitBars(boolean z11) {
        this.G1 = z11;
    }

    public void setHighlightFullBarEnabled(boolean z11) {
        this.D1 = z11;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public d x(float f11, float f12) {
        if (this.f30158b == 0) {
            Log.e(Chart.G, "Can't select by touch. No data set.");
            return null;
        }
        d a11 = getHighlighter().a(f11, f12);
        return (a11 == null || !b()) ? a11 : new d(a11.h(), a11.j(), a11.i(), a11.k(), a11.d(), -1, a11.b());
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D1 = false;
        this.E1 = true;
        this.F1 = false;
        this.G1 = false;
    }

    public BarChart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.D1 = false;
        this.E1 = true;
        this.F1 = false;
        this.G1 = false;
    }
}
