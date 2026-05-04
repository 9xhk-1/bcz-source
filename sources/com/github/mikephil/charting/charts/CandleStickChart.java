package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import fm.i;
import jm.d;
import pm.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class CandleStickChart extends BarLineChartBase<i> implements d {
    public CandleStickChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void H() {
        super.H();
        this.f30174r = new e(this, this.f30177u, this.f30176t);
        getXAxis().t0(0.5f);
        getXAxis().s0(0.5f);
    }

    @Override // jm.d
    public i getCandleData() {
        return (i) this.f30158b;
    }

    public CandleStickChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
