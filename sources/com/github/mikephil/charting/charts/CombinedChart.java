package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.data.Entry;
import fm.a;
import fm.g;
import fm.i;
import fm.l;
import fm.m;
import fm.s;
import im.c;
import im.d;
import jm.f;
import km.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class CombinedChart extends BarLineChartBase<l> implements f {
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public DrawOrder[] G1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum DrawOrder {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(Context context) {
        super(context);
        this.D1 = true;
        this.E1 = false;
        this.F1 = false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void H() {
        super.H();
        this.G1 = new DrawOrder[]{DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER};
        setHighlighter(new c(this, this));
        setHighlightFullBarEnabled(true);
        this.f30174r = new pm.f(this, this.f30177u, this.f30176t);
    }

    @Override // jm.a
    public boolean a() {
        return this.D1;
    }

    @Override // jm.a
    public boolean b() {
        return this.E1;
    }

    @Override // jm.a
    public boolean c() {
        return this.F1;
    }

    @Override // jm.a
    public a getBarData() {
        T t11 = this.f30158b;
        if (t11 == 0) {
            return null;
        }
        return ((l) t11).R();
    }

    @Override // jm.c
    public g getBubbleData() {
        T t11 = this.f30158b;
        if (t11 == 0) {
            return null;
        }
        return ((l) t11).S();
    }

    @Override // jm.d
    public i getCandleData() {
        T t11 = this.f30158b;
        if (t11 == 0) {
            return null;
        }
        return ((l) t11).T();
    }

    @Override // jm.f
    public l getCombinedData() {
        return (l) this.f30158b;
    }

    public DrawOrder[] getDrawOrder() {
        return this.G1;
    }

    @Override // jm.g
    public m getLineData() {
        T t11 = this.f30158b;
        if (t11 == 0) {
            return null;
        }
        return ((l) t11).X();
    }

    @Override // jm.h
    public s getScatterData() {
        T t11 = this.f30158b;
        if (t11 == 0) {
            return null;
        }
        return ((l) t11).Y();
    }

    public void setDrawBarShadow(boolean z11) {
        this.F1 = z11;
    }

    public void setDrawOrder(DrawOrder[] drawOrderArr) {
        if (drawOrderArr == null || drawOrderArr.length <= 0) {
            return;
        }
        this.G1 = drawOrderArr;
    }

    public void setDrawValueAboveBar(boolean z11) {
        this.D1 = z11;
    }

    public void setHighlightFullBarEnabled(boolean z11) {
        this.E1 = z11;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void v(Canvas canvas) {
        if (this.D == null || !K() || !Y()) {
            return;
        }
        int i11 = 0;
        while (true) {
            d[] dVarArr = this.A;
            if (i11 >= dVarArr.length) {
                return;
            }
            d dVar = dVarArr[i11];
            b<? extends Entry> W = ((l) this.f30158b).W(dVar);
            Entry s11 = ((l) this.f30158b).s(dVar);
            if (s11 != null && W.h(s11) <= W.l1() * this.f30177u.h()) {
                float[] y11 = y(dVar);
                if (this.f30176t.G(y11[0], y11[1])) {
                    this.D.b(s11, dVar);
                    this.D.a(canvas, y11[0], y11[1]);
                }
            }
            i11++;
        }
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

    @Override // com.github.mikephil.charting.charts.Chart
    public void setData(l lVar) {
        super.setData((CombinedChart) lVar);
        setHighlighter(new c(this, this));
        ((pm.f) this.f30174r).l();
        this.f30174r.j();
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D1 = true;
        this.E1 = false;
        this.F1 = false;
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.D1 = true;
        this.E1 = false;
        this.F1 = false;
    }
}
