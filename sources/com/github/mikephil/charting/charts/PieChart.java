package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import fm.p;
import im.d;
import java.util.List;
import km.i;
import pm.m;
import rm.g;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class PieChart extends PieRadarChartBase<p> {
    public RectF R;
    public boolean S;
    public float[] T;
    public float[] U;
    public boolean V;
    public boolean W;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f30185f0;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f30186f1;

    /* renamed from: h1, reason: collision with root package name */
    public CharSequence f30187h1;

    /* renamed from: i1, reason: collision with root package name */
    public g f30188i1;

    /* renamed from: j1, reason: collision with root package name */
    public float f30189j1;

    /* renamed from: k1, reason: collision with root package name */
    public float f30190k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f30191l1;

    /* renamed from: m1, reason: collision with root package name */
    public float f30192m1;

    /* renamed from: n1, reason: collision with root package name */
    public float f30193n1;

    /* renamed from: o1, reason: collision with root package name */
    public float f30194o1;

    public PieChart(Context context) {
        super(context);
        this.R = new RectF();
        this.S = true;
        this.T = new float[1];
        this.U = new float[1];
        this.V = true;
        this.W = false;
        this.f30185f0 = false;
        this.f30186f1 = false;
        this.f30187h1 = "";
        this.f30188i1 = g.c(0.0f, 0.0f);
        this.f30189j1 = 50.0f;
        this.f30190k1 = 55.0f;
        this.f30191l1 = true;
        this.f30192m1 = 100.0f;
        this.f30193n1 = 360.0f;
        this.f30194o1 = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void H() {
        super.H();
        this.f30174r = new m(this, this.f30177u, this.f30176t);
        this.f30165i = null;
        this.f30175s = new im.g(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int b0(float f11) {
        float z11 = k.z(f11 - getRotationAngle());
        int i11 = 0;
        while (true) {
            float[] fArr = this.U;
            if (i11 >= fArr.length) {
                return -1;
            }
            if (fArr[i11] > z11) {
                return i11;
            }
            i11++;
        }
    }

    public final float g0(float f11) {
        return h0(f11, ((p) this.f30158b).T());
    }

    public float[] getAbsoluteAngles() {
        return this.U;
    }

    public g getCenterCircleBox() {
        return g.c(this.R.centerX(), this.R.centerY());
    }

    public CharSequence getCenterText() {
        return this.f30187h1;
    }

    public g getCenterTextOffset() {
        g gVar = this.f30188i1;
        return g.c(gVar.f84265c, gVar.f84266d);
    }

    public float getCenterTextRadiusPercent() {
        return this.f30192m1;
    }

    public RectF getCircleBox() {
        return this.R;
    }

    public float[] getDrawAngles() {
        return this.T;
    }

    public float getHoleRadius() {
        return this.f30189j1;
    }

    public float getMaxAngle() {
        return this.f30193n1;
    }

    public float getMinAngleForSlices() {
        return this.f30194o1;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        RectF rectF = this.R;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.R.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredLegendOffset() {
        return this.f30173q.e().getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.f30190k1;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @Deprecated
    public XAxis getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    public final float h0(float f11, float f12) {
        return (f11 / f12) * this.f30193n1;
    }

    public final void i0() {
        float f11;
        int r11 = ((p) this.f30158b).r();
        float f12 = 0.0f;
        if (this.T.length != r11) {
            this.T = new float[r11];
        } else {
            for (int i11 = 0; i11 < r11; i11++) {
                this.T[i11] = 0.0f;
            }
        }
        if (this.U.length != r11) {
            this.U = new float[r11];
        } else {
            for (int i12 = 0; i12 < r11; i12++) {
                this.U[i12] = 0.0f;
            }
        }
        float T = ((p) this.f30158b).T();
        List<i> q11 = ((p) this.f30158b).q();
        float f13 = this.f30194o1;
        boolean z11 = f13 != 0.0f && ((float) r11) * f13 <= this.f30193n1;
        float[] fArr = new float[r11];
        float f14 = 0.0f;
        float f15 = 0.0f;
        int i13 = 0;
        for (int i14 = 0; i14 < ((p) this.f30158b).m(); i14++) {
            i iVar = q11.get(i14);
            int i15 = 0;
            while (i15 < iVar.l1()) {
                float h02 = h0(Math.abs(iVar.m(i15).c()), T);
                if (z11) {
                    float f16 = this.f30194o1;
                    f11 = f12;
                    float f17 = h02 - f16;
                    if (f17 <= f11) {
                        fArr[i13] = f16;
                        f14 += -f17;
                    } else {
                        fArr[i13] = h02;
                        f15 += f17;
                    }
                } else {
                    f11 = f12;
                }
                this.T[i13] = h02;
                if (i13 == 0) {
                    this.U[i13] = h02;
                } else {
                    float[] fArr2 = this.U;
                    fArr2[i13] = fArr2[i13 - 1] + h02;
                }
                i13++;
                i15++;
                f12 = f11;
            }
        }
        if (z11) {
            for (int i16 = 0; i16 < r11; i16++) {
                float f18 = fArr[i16];
                float f19 = f18 - (((f18 - this.f30194o1) / f15) * f14);
                fArr[i16] = f19;
                if (i16 == 0) {
                    this.U[0] = fArr[0];
                } else {
                    float[] fArr3 = this.U;
                    fArr3[i16] = fArr3[i16 - 1] + f19;
                }
            }
            this.T = fArr;
        }
    }

    public int j0(int i11) {
        List<i> q11 = ((p) this.f30158b).q();
        for (int i12 = 0; i12 < q11.size(); i12++) {
            if (q11.get(i12).N0(i11, Float.NaN) != null) {
                return i12;
            }
        }
        return -1;
    }

    public boolean k0() {
        return this.f30191l1;
    }

    public boolean l0() {
        return this.S;
    }

    public boolean m0() {
        return this.V;
    }

    public boolean n0() {
        return this.f30186f1;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void o() {
        i0();
    }

    public boolean o0() {
        return this.W;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        pm.g gVar = this.f30174r;
        if (gVar != null && (gVar instanceof m)) {
            ((m) gVar).w();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30158b == 0) {
            return;
        }
        this.f30174r.b(canvas);
        if (Y()) {
            this.f30174r.d(canvas, this.A);
        }
        this.f30174r.c(canvas);
        this.f30174r.f(canvas);
        this.f30173q.f(canvas);
        u(canvas);
        v(canvas);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void p() {
        super.p();
        if (this.f30158b == 0) {
            return;
        }
        float diameter = getDiameter() / 2.0f;
        g centerOffsets = getCenterOffsets();
        float y11 = ((p) this.f30158b).Q().y();
        RectF rectF = this.R;
        float f11 = centerOffsets.f84265c;
        float f12 = centerOffsets.f84266d;
        rectF.set((f11 - diameter) + y11, (f12 - diameter) + y11, (f11 + diameter) - y11, (f12 + diameter) - y11);
        g.h(centerOffsets);
    }

    public boolean p0() {
        return this.f30185f0;
    }

    public boolean q0(int i11) {
        if (!Y()) {
            return false;
        }
        int i12 = 0;
        while (true) {
            d[] dVarArr = this.A;
            if (i12 >= dVarArr.length) {
                return false;
            }
            if (((int) dVarArr[i12].h()) == i11) {
                return true;
            }
            i12++;
        }
    }

    public void r0(float f11, float f12) {
        this.f30188i1.f84265c = k.e(f11);
        this.f30188i1.f84266d = k.e(f12);
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.f30187h1 = "";
        } else {
            this.f30187h1 = charSequence;
        }
    }

    public void setCenterTextColor(int i11) {
        ((m) this.f30174r).r().setColor(i11);
    }

    public void setCenterTextRadiusPercent(float f11) {
        this.f30192m1 = f11;
    }

    public void setCenterTextSize(float f11) {
        ((m) this.f30174r).r().setTextSize(k.e(f11));
    }

    public void setCenterTextSizePixels(float f11) {
        ((m) this.f30174r).r().setTextSize(f11);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((m) this.f30174r).r().setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z11) {
        this.f30191l1 = z11;
    }

    public void setDrawEntryLabels(boolean z11) {
        this.S = z11;
    }

    public void setDrawHoleEnabled(boolean z11) {
        this.V = z11;
    }

    public void setDrawRoundedSlices(boolean z11) {
        this.f30186f1 = z11;
    }

    @Deprecated
    public void setDrawSliceText(boolean z11) {
        this.S = z11;
    }

    public void setDrawSlicesUnderHole(boolean z11) {
        this.W = z11;
    }

    public void setEntryLabelColor(int i11) {
        ((m) this.f30174r).s().setColor(i11);
    }

    public void setEntryLabelTextSize(float f11) {
        ((m) this.f30174r).s().setTextSize(k.e(f11));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((m) this.f30174r).s().setTypeface(typeface);
    }

    public void setHoleColor(int i11) {
        ((m) this.f30174r).t().setColor(i11);
    }

    public void setHoleRadius(float f11) {
        this.f30189j1 = f11;
    }

    public void setMaxAngle(float f11) {
        if (f11 > 360.0f) {
            f11 = 360.0f;
        }
        if (f11 < 90.0f) {
            f11 = 90.0f;
        }
        this.f30193n1 = f11;
    }

    public void setMinAngleForSlices(float f11) {
        float f12 = this.f30193n1;
        if (f11 > f12 / 2.0f) {
            f11 = f12 / 2.0f;
        } else if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        this.f30194o1 = f11;
    }

    public void setTransparentCircleAlpha(int i11) {
        ((m) this.f30174r).u().setAlpha(i11);
    }

    public void setTransparentCircleColor(int i11) {
        Paint u11 = ((m) this.f30174r).u();
        int alpha = u11.getAlpha();
        u11.setColor(i11);
        u11.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f11) {
        this.f30190k1 = f11;
    }

    public void setUsePercentValues(boolean z11) {
        this.f30185f0 = z11;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public float[] y(d dVar) {
        g centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float f11 = (radius / 10.0f) * 3.6f;
        if (m0()) {
            f11 = (radius - ((radius / 100.0f) * getHoleRadius())) / 2.0f;
        }
        float f12 = radius - f11;
        float rotationAngle = getRotationAngle();
        float f13 = this.T[(int) dVar.h()] / 2.0f;
        double d11 = f12;
        float cos = (float) ((Math.cos(Math.toRadians(((this.U[r11] + rotationAngle) - f13) * this.f30177u.i())) * d11) + centerCircleBox.f84265c);
        float sin = (float) ((d11 * Math.sin(Math.toRadians(((rotationAngle + this.U[r11]) - f13) * this.f30177u.i()))) + centerCircleBox.f84266d);
        g.h(centerCircleBox);
        return new float[]{cos, sin};
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = new RectF();
        this.S = true;
        this.T = new float[1];
        this.U = new float[1];
        this.V = true;
        this.W = false;
        this.f30185f0 = false;
        this.f30186f1 = false;
        this.f30187h1 = "";
        this.f30188i1 = g.c(0.0f, 0.0f);
        this.f30189j1 = 50.0f;
        this.f30190k1 = 55.0f;
        this.f30191l1 = true;
        this.f30192m1 = 100.0f;
        this.f30193n1 = 360.0f;
        this.f30194o1 = 0.0f;
    }

    public PieChart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.R = new RectF();
        this.S = true;
        this.T = new float[1];
        this.U = new float[1];
        this.V = true;
        this.W = false;
        this.f30185f0 = false;
        this.f30186f1 = false;
        this.f30187h1 = "";
        this.f30188i1 = g.c(0.0f, 0.0f);
        this.f30189j1 = 50.0f;
        this.f30190k1 = 55.0f;
        this.f30191l1 = true;
        this.f30192m1 = 100.0f;
        this.f30193n1 = 360.0f;
        this.f30194o1 = 0.0f;
    }
}
