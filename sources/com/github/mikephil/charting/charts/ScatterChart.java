package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import fm.s;
import jm.h;
import pm.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class ScatterChart extends BarLineChartBase<s> implements h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ScatterShape {
        SQUARE("SQUARE"),
        CIRCLE("CIRCLE"),
        TRIANGLE("TRIANGLE"),
        CROSS("CROSS"),
        X("X"),
        CHEVRON_UP("CHEVRON_UP"),
        CHEVRON_DOWN("CHEVRON_DOWN");

        private final String shapeIdentifier;

        ScatterShape(String str) {
            this.shapeIdentifier = str;
        }

        public static ScatterShape[] getAllDefaultShapes() {
            return new ScatterShape[]{SQUARE, CIRCLE, TRIANGLE, CROSS, X, CHEVRON_UP, CHEVRON_DOWN};
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.shapeIdentifier;
        }
    }

    public ScatterChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void H() {
        super.H();
        this.f30174r = new p(this, this.f30177u, this.f30176t);
        getXAxis().t0(0.5f);
        getXAxis().s0(0.5f);
    }

    @Override // jm.h
    public s getScatterData() {
        return (s) this.f30158b;
    }

    public ScatterChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScatterChart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
