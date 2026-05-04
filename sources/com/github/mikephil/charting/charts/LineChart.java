package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import fm.m;
import jm.g;
import pm.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class LineChart extends BarLineChartBase<m> implements g {
    public LineChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void H() {
        super.H();
        this.f30174r = new j(this, this.f30177u, this.f30176t);
    }

    @Override // jm.g
    public m getLineData() {
        return (m) this.f30158b;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        pm.g gVar = this.f30174r;
        if (gVar != null && (gVar instanceof j)) {
            ((j) gVar).A();
        }
        super.onDetachedFromWindow();
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
