package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import fm.q;
import im.i;
import pm.n;
import pm.s;
import pm.v;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class RadarChart extends PieRadarChartBase<q> {
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;

    /* renamed from: f0, reason: collision with root package name */
    public int f30199f0;

    /* renamed from: f1, reason: collision with root package name */
    public YAxis f30200f1;

    /* renamed from: h1, reason: collision with root package name */
    public v f30201h1;

    /* renamed from: i1, reason: collision with root package name */
    public s f30202i1;

    public RadarChart(Context context) {
        super(context);
        this.R = 2.5f;
        this.S = 1.5f;
        this.T = Color.rgb(122, 122, 122);
        this.U = Color.rgb(122, 122, 122);
        this.V = 150;
        this.W = true;
        this.f30199f0 = 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void H() {
        super.H();
        this.f30200f1 = new YAxis(YAxis.AxisDependency.LEFT);
        this.R = k.e(1.5f);
        this.S = k.e(0.75f);
        this.f30174r = new n(this, this.f30177u, this.f30176t);
        this.f30201h1 = new v(this.f30176t, this.f30200f1, this);
        this.f30202i1 = new s(this.f30176t, this.f30165i, this);
        this.f30175s = new i(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void O() {
        if (this.f30158b == 0) {
            return;
        }
        o();
        v vVar = this.f30201h1;
        YAxis yAxis = this.f30200f1;
        vVar.a(yAxis.H, yAxis.G, yAxis.I0());
        s sVar = this.f30202i1;
        XAxis xAxis = this.f30165i;
        sVar.a(xAxis.H, xAxis.G, false);
        Legend legend = this.f30168l;
        if (legend != null && !legend.I()) {
            this.f30173q.a(this.f30158b);
        }
        p();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int b0(float f11) {
        float z11 = k.z(f11 - getRotationAngle());
        float sliceAngle = getSliceAngle();
        int l12 = ((q) this.f30158b).w().l1();
        int i11 = 0;
        while (i11 < l12) {
            int i12 = i11 + 1;
            if ((i12 * sliceAngle) - (sliceAngle / 2.0f) > z11) {
                return i11;
            }
            i11 = i12;
        }
        return 0;
    }

    public float getFactor() {
        RectF q11 = this.f30176t.q();
        return Math.min(q11.width() / 2.0f, q11.height() / 2.0f) / this.f30200f1.I;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        RectF q11 = this.f30176t.q();
        return Math.min(q11.width() / 2.0f, q11.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredBaseOffset() {
        return (this.f30165i.f() && this.f30165i.P()) ? this.f30165i.L : k.e(10.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredLegendOffset() {
        return this.f30173q.e().getTextSize() * 4.0f;
    }

    public int getSkipWebLineCount() {
        return this.f30199f0;
    }

    public float getSliceAngle() {
        return 360.0f / ((q) this.f30158b).w().l1();
    }

    public int getWebAlpha() {
        return this.V;
    }

    public int getWebColor() {
        return this.T;
    }

    public int getWebColorInner() {
        return this.U;
    }

    public float getWebLineWidth() {
        return this.R;
    }

    public float getWebLineWidthInner() {
        return this.S;
    }

    public YAxis getYAxis() {
        return this.f30200f1;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, jm.e
    public float getYChartMax() {
        return this.f30200f1.G;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, jm.e
    public float getYChartMin() {
        return this.f30200f1.H;
    }

    public float getYRange() {
        return this.f30200f1.I;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void o() {
        super.o();
        YAxis yAxis = this.f30200f1;
        q qVar = (q) this.f30158b;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.n(qVar.C(axisDependency), ((q) this.f30158b).A(axisDependency));
        this.f30165i.n(0.0f, ((q) this.f30158b).w().l1());
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30158b == 0) {
            return;
        }
        if (this.f30165i.f()) {
            s sVar = this.f30202i1;
            XAxis xAxis = this.f30165i;
            sVar.a(xAxis.H, xAxis.G, false);
        }
        this.f30202i1.g(canvas);
        if (this.W) {
            this.f30174r.c(canvas);
        }
        if (this.f30200f1.f() && this.f30200f1.Q()) {
            this.f30201h1.j(canvas);
        }
        this.f30174r.b(canvas);
        if (Y()) {
            this.f30174r.d(canvas, this.A);
        }
        if (this.f30200f1.f() && !this.f30200f1.Q()) {
            this.f30201h1.j(canvas);
        }
        this.f30201h1.g(canvas);
        this.f30174r.f(canvas);
        this.f30173q.f(canvas);
        u(canvas);
        v(canvas);
    }

    public void setDrawWeb(boolean z11) {
        this.W = z11;
    }

    public void setSkipWebLineCount(int i11) {
        this.f30199f0 = Math.max(0, i11);
    }

    public void setWebAlpha(int i11) {
        this.V = i11;
    }

    public void setWebColor(int i11) {
        this.T = i11;
    }

    public void setWebColorInner(int i11) {
        this.U = i11;
    }

    public void setWebLineWidth(float f11) {
        this.R = k.e(f11);
    }

    public void setWebLineWidthInner(float f11) {
        this.S = k.e(f11);
    }

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = 2.5f;
        this.S = 1.5f;
        this.T = Color.rgb(122, 122, 122);
        this.U = Color.rgb(122, 122, 122);
        this.V = 150;
        this.W = true;
        this.f30199f0 = 0;
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.R = 2.5f;
        this.S = 1.5f;
        this.T = Color.rgb(122, 122, 122);
        this.U = Color.rgb(122, 122, 122);
        this.V = 150;
        this.W = true;
        this.f30199f0 = 0;
    }
}
