package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import fm.g;
import jm.c;
import pm.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class BubbleChart extends BarLineChartBase<g> implements c {
    public BubbleChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void H() {
        super.H();
        this.f30174r = new d(this, this.f30177u, this.f30176t);
    }

    @Override // jm.c
    public g getBubbleData() {
        return (g) this.f30158b;
    }

    public BubbleChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleChart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
