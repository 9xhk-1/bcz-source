package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import cm.b;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.c;
import fm.k;
import km.e;
import rm.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class PieRadarChartBase<T extends k<? extends e<? extends Entry>>> extends Chart<T> {
    public float N;
    public float O;
    public boolean P;
    public float Q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            PieRadarChartBase.this.postInvalidate();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30196a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f30197b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f30198c;

        static {
            int[] iArr = new int[Legend.LegendOrientation.values().length];
            f30198c = iArr;
            try {
                iArr[Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30198c[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Legend.LegendHorizontalAlignment.values().length];
            f30197b = iArr2;
            try {
                iArr2[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30197b[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30197b[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            f30196a = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30196a[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public PieRadarChartBase(Context context) {
        super(context);
        this.N = 270.0f;
        this.O = 270.0f;
        this.P = true;
        this.Q = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void H() {
        super.H();
        this.f30170n = new c(this);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void O() {
        if (this.f30158b == null) {
            return;
        }
        o();
        if (this.f30168l != null) {
            this.f30173q.a(this.f30158b);
        }
        p();
    }

    public float Z(float f11, float f12) {
        g centerOffsets = getCenterOffsets();
        float f13 = centerOffsets.f84265c;
        float sqrt = (float) Math.sqrt(Math.pow(f11 > f13 ? f11 - f13 : f13 - f11, 2.0d) + Math.pow(f12 > centerOffsets.f84266d ? f12 - r1 : r1 - f12, 2.0d));
        g.h(centerOffsets);
        return sqrt;
    }

    public float a0(float f11, float f12) {
        g centerOffsets = getCenterOffsets();
        double d11 = f11 - centerOffsets.f84265c;
        double d12 = f12 - centerOffsets.f84266d;
        float degrees = (float) Math.toDegrees(Math.acos(d12 / Math.sqrt((d11 * d11) + (d12 * d12))));
        if (f11 > centerOffsets.f84265c) {
            degrees = 360.0f - degrees;
        }
        float f13 = degrees + 90.0f;
        if (f13 > 360.0f) {
            f13 -= 360.0f;
        }
        g.h(centerOffsets);
        return f13;
    }

    public abstract int b0(float f11);

    public g c0(g gVar, float f11, float f12) {
        g c11 = g.c(0.0f, 0.0f);
        d0(gVar, f11, f12, c11);
        return c11;
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.f30170n;
        if (chartTouchListener instanceof c) {
            ((c) chartTouchListener).i();
        }
    }

    public void d0(g gVar, float f11, float f12, g gVar2) {
        double d11 = f11;
        double d12 = f12;
        gVar2.f84265c = (float) (gVar.f84265c + (Math.cos(Math.toRadians(d12)) * d11));
        gVar2.f84266d = (float) (gVar.f84266d + (d11 * Math.sin(Math.toRadians(d12))));
    }

    public boolean e0() {
        return this.P;
    }

    @SuppressLint({"NewApi"})
    public void f0(int i11, float f11, float f12, b.c0 c0Var) {
        setRotationAngle(f11);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotationAngle", f11, f12);
        ofFloat.setDuration(i11);
        ofFloat.setInterpolator(c0Var);
        ofFloat.addUpdateListener(new a());
        ofFloat.start();
    }

    public float getDiameter() {
        RectF q11 = this.f30176t.q();
        q11.left += getExtraLeftOffset();
        q11.top += getExtraTopOffset();
        q11.right -= getExtraRightOffset();
        q11.bottom -= getExtraBottomOffset();
        return Math.min(q11.width(), q11.height());
    }

    @Override // jm.e
    public int getMaxVisibleCount() {
        return this.f30158b.r();
    }

    public float getMinOffset() {
        return this.Q;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.O;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.N;
    }

    @Override // jm.e
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // jm.e
    public float getYChartMin() {
        return 0.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChartTouchListener chartTouchListener;
        return (!this.f30166j || (chartTouchListener = this.f30170n) == null) ? super.onTouchEvent(motionEvent) : chartTouchListener.onTouch(this, motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (r2 != 2) goto L19;
     */
    @Override // com.github.mikephil.charting.charts.Chart
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.PieRadarChartBase.p():void");
    }

    public void setMinOffset(float f11) {
        this.Q = f11;
    }

    public void setRotationAngle(float f11) {
        this.O = f11;
        this.N = rm.k.z(f11);
    }

    public void setRotationEnabled(boolean z11) {
        this.P = z11;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = 270.0f;
        this.O = 270.0f;
        this.P = true;
        this.Q = 0.0f;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.N = 270.0f;
        this.O = 270.0f;
        this.P = true;
        this.Q = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void o() {
    }
}
