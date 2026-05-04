package com.github.mikephil.charting.charts;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import fm.c;
import lm.d;
import pm.g;
import pm.q;
import pm.t;
import rm.f;
import rm.i;
import rm.k;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"RtlHardcoded"})
/* loaded from: classes6.dex */
public abstract class BarLineChartBase<T extends c<? extends km.b<? extends Entry>>> extends Chart<T> implements jm.b {
    public f A1;
    public f B1;
    public float[] C1;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Paint W;

    /* renamed from: f0, reason: collision with root package name */
    public Paint f30128f0;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f30129f1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f30130h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f30131i1;

    /* renamed from: j1, reason: collision with root package name */
    public float f30132j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f30133k1;

    /* renamed from: l1, reason: collision with root package name */
    public mm.c f30134l1;

    /* renamed from: m1, reason: collision with root package name */
    public YAxis f30135m1;

    /* renamed from: n1, reason: collision with root package name */
    public YAxis f30136n1;

    /* renamed from: o1, reason: collision with root package name */
    public t f30137o1;

    /* renamed from: p1, reason: collision with root package name */
    public t f30138p1;

    /* renamed from: q1, reason: collision with root package name */
    public i f30139q1;

    /* renamed from: r1, reason: collision with root package name */
    public i f30140r1;

    /* renamed from: s1, reason: collision with root package name */
    public q f30141s1;

    /* renamed from: t1, reason: collision with root package name */
    public long f30142t1;

    /* renamed from: u1, reason: collision with root package name */
    public long f30143u1;

    /* renamed from: v1, reason: collision with root package name */
    public RectF f30144v1;

    /* renamed from: w1, reason: collision with root package name */
    public Matrix f30145w1;

    /* renamed from: x1, reason: collision with root package name */
    public Matrix f30146x1;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f30147y1;

    /* renamed from: z1, reason: collision with root package name */
    public float[] f30148z1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f30149a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f30150b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f30151c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f30152d;

        public a(float f11, float f12, float f13, float f14) {
            this.f30149a = f11;
            this.f30150b = f12;
            this.f30151c = f13;
            this.f30152d = f14;
        }

        @Override // java.lang.Runnable
        public void run() {
            BarLineChartBase.this.f30176t.U(this.f30149a, this.f30150b, this.f30151c, this.f30152d);
            BarLineChartBase.this.F0();
            BarLineChartBase.this.G0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30154a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f30155b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f30156c;

        static {
            int[] iArr = new int[Legend.LegendOrientation.values().length];
            f30156c = iArr;
            try {
                iArr[Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30156c[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Legend.LegendHorizontalAlignment.values().length];
            f30155b = iArr2;
            try {
                iArr2[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30155b[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30155b[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            f30154a = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30154a[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.N = 100;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = true;
        this.f30129f1 = false;
        this.f30130h1 = false;
        this.f30131i1 = false;
        this.f30132j1 = 15.0f;
        this.f30133k1 = false;
        this.f30142t1 = 0L;
        this.f30143u1 = 0L;
        this.f30144v1 = new RectF();
        this.f30145w1 = new Matrix();
        this.f30146x1 = new Matrix();
        this.f30147y1 = false;
        this.f30148z1 = new float[2];
        this.A1 = f.b(0.0d, 0.0d);
        this.B1 = f.b(0.0d, 0.0d);
        this.C1 = new float[2];
    }

    public boolean A0() {
        return this.U;
    }

    public boolean B0() {
        return this.V;
    }

    public void C0(float f11, float f12, YAxis.AxisDependency axisDependency) {
        g(d.d(this.f30176t, f11, f12 + ((g0(axisDependency) / this.f30176t.x()) / 2.0f), d(axisDependency), this));
    }

    @TargetApi(11)
    public void D0(float f11, float f12, YAxis.AxisDependency axisDependency, long j11) {
        f l02 = l0(this.f30176t.h(), this.f30176t.j(), axisDependency);
        g(lm.a.j(this.f30176t, f11, ((g0(axisDependency) / this.f30176t.x()) / 2.0f) + f12, d(axisDependency), this, (float) l02.f84261c, (float) l02.f84262d, j11));
        f.c(l02);
    }

    public void E0(float f11) {
        g(d.d(this.f30176t, f11, 0.0f, d(YAxis.AxisDependency.LEFT), this));
    }

    public void F0() {
        this.f30140r1.p(this.f30136n1.I0());
        this.f30139q1.p(this.f30135m1.I0());
    }

    public void G0() {
        if (this.f30157a) {
            Log.i(Chart.G, "Preparing Value-Px Matrix, xmin: " + this.f30165i.H + ", xmax: " + this.f30165i.G + ", xdelta: " + this.f30165i.I);
        }
        i iVar = this.f30140r1;
        XAxis xAxis = this.f30165i;
        float f11 = xAxis.H;
        float f12 = xAxis.I;
        YAxis yAxis = this.f30136n1;
        iVar.q(f11, f12, yAxis.I, yAxis.H);
        i iVar2 = this.f30139q1;
        XAxis xAxis2 = this.f30165i;
        float f13 = xAxis2.H;
        float f14 = xAxis2.I;
        YAxis yAxis2 = this.f30135m1;
        iVar2.q(f13, f14, yAxis2.I, yAxis2.H);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void H() {
        super.H();
        this.f30135m1 = new YAxis(YAxis.AxisDependency.LEFT);
        this.f30136n1 = new YAxis(YAxis.AxisDependency.RIGHT);
        this.f30139q1 = new i(this.f30176t);
        this.f30140r1 = new i(this.f30176t);
        this.f30137o1 = new t(this.f30176t, this.f30135m1, this.f30139q1);
        this.f30138p1 = new t(this.f30176t, this.f30136n1, this.f30140r1);
        this.f30141s1 = new q(this.f30176t, this.f30165i, this.f30139q1);
        setHighlighter(new im.b(this));
        this.f30170n = new com.github.mikephil.charting.listener.a(this, this.f30176t.r(), 3.0f);
        Paint paint = new Paint();
        this.W = paint;
        paint.setStyle(Paint.Style.FILL);
        this.W.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.f30128f0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f30128f0.setColor(-16777216);
        this.f30128f0.setStrokeWidth(k.e(1.0f));
    }

    public void H0() {
        this.f30142t1 = 0L;
        this.f30143u1 = 0L;
    }

    public void I0() {
        this.f30147y1 = false;
        p();
    }

    public void J0() {
        this.f30176t.T(this.f30145w1);
        this.f30176t.S(this.f30145w1, this, false);
        p();
        postInvalidate();
    }

    public void K0(float f11, float f12) {
        this.f30176t.c0(f11);
        this.f30176t.d0(f12);
    }

    public void L0(float f11, float f12, float f13, float f14) {
        this.f30147y1 = true;
        post(new a(f11, f12, f13, f14));
    }

    public void M0(float f11, float f12) {
        float f13 = this.f30165i.I;
        this.f30176t.a0(f13 / f11, f13 / f12);
    }

    public void N0(float f11, float f12, YAxis.AxisDependency axisDependency) {
        this.f30176t.b0(g0(axisDependency) / f11, g0(axisDependency) / f12);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void O() {
        if (this.f30158b == 0) {
            if (this.f30157a) {
                Log.i(Chart.G, "Preparing... DATA NOT SET.");
                return;
            }
            return;
        }
        if (this.f30157a) {
            Log.i(Chart.G, "Preparing...");
        }
        g gVar = this.f30174r;
        if (gVar != null) {
            gVar.j();
        }
        o();
        t tVar = this.f30137o1;
        YAxis yAxis = this.f30135m1;
        tVar.a(yAxis.H, yAxis.G, yAxis.I0());
        t tVar2 = this.f30138p1;
        YAxis yAxis2 = this.f30136n1;
        tVar2.a(yAxis2.H, yAxis2.G, yAxis2.I0());
        q qVar = this.f30141s1;
        XAxis xAxis = this.f30165i;
        qVar.a(xAxis.H, xAxis.G, false);
        if (this.f30168l != null) {
            this.f30173q.a(this.f30158b);
        }
        p();
    }

    public void O0(float f11, YAxis.AxisDependency axisDependency) {
        this.f30176t.d0(g0(axisDependency) / f11);
    }

    public void P0(float f11, YAxis.AxisDependency axisDependency) {
        this.f30176t.Z(g0(axisDependency) / f11);
    }

    public void Q0(float f11, float f12, float f13, float f14) {
        this.f30176t.l0(f11, f12, f13, -f14, this.f30145w1);
        this.f30176t.S(this.f30145w1, this, false);
        p();
        postInvalidate();
    }

    public void R0(float f11, float f12, float f13, float f14, YAxis.AxisDependency axisDependency) {
        g(lm.f.d(this.f30176t, f11, f12, f13, f14, d(axisDependency), axisDependency, this));
    }

    @TargetApi(11)
    public void S0(float f11, float f12, float f13, float f14, YAxis.AxisDependency axisDependency, long j11) {
        f l02 = l0(this.f30176t.h(), this.f30176t.j(), axisDependency);
        g(lm.c.j(this.f30176t, this, d(axisDependency), f(axisDependency), this.f30165i.I, f11, f12, this.f30176t.w(), this.f30176t.x(), f13, f14, (float) l02.f84261c, (float) l02.f84262d, j11));
        f.c(l02);
    }

    public void T0() {
        rm.g p11 = this.f30176t.p();
        this.f30176t.o0(p11.f84265c, -p11.f84266d, this.f30145w1);
        this.f30176t.S(this.f30145w1, this, false);
        rm.g.h(p11);
        p();
        postInvalidate();
    }

    public void U0() {
        rm.g p11 = this.f30176t.p();
        this.f30176t.q0(p11.f84265c, -p11.f84266d, this.f30145w1);
        this.f30176t.S(this.f30145w1, this, false);
        rm.g.h(p11);
        p();
        postInvalidate();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void V(Paint paint, int i11) {
        super.V(paint, i11);
        if (i11 != 4) {
            return;
        }
        this.W = paint;
    }

    public void V0(float f11, float f12) {
        rm.g centerOffsets = getCenterOffsets();
        Matrix matrix = this.f30145w1;
        this.f30176t.l0(f11, f12, centerOffsets.f84265c, -centerOffsets.f84266d, matrix);
        this.f30176t.S(matrix, this, false);
    }

    public void Z() {
        ((c) this.f30158b).g(getLowestVisibleX(), getHighestVisibleX());
        this.f30165i.n(((c) this.f30158b).y(), ((c) this.f30158b).x());
        if (this.f30135m1.f()) {
            YAxis yAxis = this.f30135m1;
            c cVar = (c) this.f30158b;
            YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
            yAxis.n(cVar.C(axisDependency), ((c) this.f30158b).A(axisDependency));
        }
        if (this.f30136n1.f()) {
            YAxis yAxis2 = this.f30136n1;
            c cVar2 = (c) this.f30158b;
            YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
            yAxis2.n(cVar2.C(axisDependency2), ((c) this.f30158b).A(axisDependency2));
        }
        p();
    }

    public void a0(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        Legend legend = this.f30168l;
        if (legend == null || !legend.f() || this.f30168l.H()) {
            return;
        }
        int i11 = b.f30156c[this.f30168l.C().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            int i12 = b.f30154a[this.f30168l.E().ordinal()];
            if (i12 == 1) {
                rectF.top += Math.min(this.f30168l.f30221y, this.f30176t.n() * this.f30168l.z()) + this.f30168l.e();
                return;
            } else {
                if (i12 != 2) {
                    return;
                }
                rectF.bottom += Math.min(this.f30168l.f30221y, this.f30176t.n() * this.f30168l.z()) + this.f30168l.e();
                return;
            }
        }
        int i13 = b.f30155b[this.f30168l.y().ordinal()];
        if (i13 == 1) {
            rectF.left += Math.min(this.f30168l.f30220x, this.f30176t.o() * this.f30168l.z()) + this.f30168l.d();
            return;
        }
        if (i13 == 2) {
            rectF.right += Math.min(this.f30168l.f30220x, this.f30176t.o() * this.f30168l.z()) + this.f30168l.d();
            return;
        }
        if (i13 != 3) {
            return;
        }
        int i14 = b.f30154a[this.f30168l.E().ordinal()];
        if (i14 == 1) {
            rectF.top += Math.min(this.f30168l.f30221y, this.f30176t.n() * this.f30168l.z()) + this.f30168l.e();
        } else {
            if (i14 != 2) {
                return;
            }
            rectF.bottom += Math.min(this.f30168l.f30221y, this.f30176t.n() * this.f30168l.z()) + this.f30168l.e();
        }
    }

    public void b0(float f11, float f12, YAxis.AxisDependency axisDependency) {
        float g02 = g0(axisDependency) / this.f30176t.x();
        g(d.d(this.f30176t, f11 - ((getXAxis().I / this.f30176t.w()) / 2.0f), f12 + (g02 / 2.0f), d(axisDependency), this));
    }

    @TargetApi(11)
    public void c0(float f11, float f12, YAxis.AxisDependency axisDependency, long j11) {
        f l02 = l0(this.f30176t.h(), this.f30176t.j(), axisDependency);
        float g02 = g0(axisDependency) / this.f30176t.x();
        g(lm.a.j(this.f30176t, f11 - ((getXAxis().I / this.f30176t.w()) / 2.0f), (g02 / 2.0f) + f12, d(axisDependency), this, (float) l02.f84261c, (float) l02.f84262d, j11));
        f.c(l02);
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.f30170n;
        if (chartTouchListener instanceof com.github.mikephil.charting.listener.a) {
            ((com.github.mikephil.charting.listener.a) chartTouchListener).h();
        }
    }

    @Override // jm.b
    public i d(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.f30139q1 : this.f30140r1;
    }

    public void d0(float f11, YAxis.AxisDependency axisDependency) {
        g(d.d(this.f30176t, 0.0f, f11 + ((g0(axisDependency) / this.f30176t.x()) / 2.0f), d(axisDependency), this));
    }

    @Override // jm.b
    public boolean e(YAxis.AxisDependency axisDependency) {
        return f(axisDependency).I0();
    }

    public void e0(Canvas canvas) {
        if (this.f30129f1) {
            canvas.drawRect(this.f30176t.q(), this.W);
        }
        if (this.f30130h1) {
            canvas.drawRect(this.f30176t.q(), this.f30128f0);
        }
    }

    public YAxis f(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.f30135m1 : this.f30136n1;
    }

    public void f0() {
        Matrix matrix = this.f30146x1;
        this.f30176t.m(matrix);
        this.f30176t.S(matrix, this, false);
        p();
        postInvalidate();
    }

    public float g0(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.f30135m1.I : this.f30136n1.I;
    }

    public YAxis getAxisLeft() {
        return this.f30135m1;
    }

    public YAxis getAxisRight() {
        return this.f30136n1;
    }

    @Override // com.github.mikephil.charting.charts.Chart, jm.e, jm.b
    public /* bridge */ /* synthetic */ c getData() {
        return (c) super.getData();
    }

    public mm.c getDrawListener() {
        return this.f30134l1;
    }

    @Override // jm.b
    public float getHighestVisibleX() {
        d(YAxis.AxisDependency.LEFT).k(this.f30176t.i(), this.f30176t.f(), this.B1);
        return (float) Math.min(this.f30165i.G, this.B1.f84261c);
    }

    @Override // jm.b
    public float getLowestVisibleX() {
        d(YAxis.AxisDependency.LEFT).k(this.f30176t.h(), this.f30176t.f(), this.A1);
        return (float) Math.max(this.f30165i.H, this.A1.f84261c);
    }

    @Override // jm.e
    public int getMaxVisibleCount() {
        return this.N;
    }

    public float getMinOffset() {
        return this.f30132j1;
    }

    public t getRendererLeftYAxis() {
        return this.f30137o1;
    }

    public t getRendererRightYAxis() {
        return this.f30138p1;
    }

    public q getRendererXAxis() {
        return this.f30141s1;
    }

    @Override // android.view.View
    public float getScaleX() {
        l lVar = this.f30176t;
        if (lVar == null) {
            return 1.0f;
        }
        return lVar.w();
    }

    @Override // android.view.View
    public float getScaleY() {
        l lVar = this.f30176t;
        if (lVar == null) {
            return 1.0f;
        }
        return lVar.x();
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // jm.e
    public float getYChartMax() {
        return Math.max(this.f30135m1.G, this.f30136n1.G);
    }

    @Override // jm.e
    public float getYChartMin() {
        return Math.min(this.f30135m1.H, this.f30136n1.H);
    }

    public km.b h0(float f11, float f12) {
        im.d x11 = x(f11, f12);
        if (x11 != null) {
            return (km.b) ((c) this.f30158b).k(x11.d());
        }
        return null;
    }

    public Entry i0(float f11, float f12) {
        im.d x11 = x(f11, f12);
        if (x11 != null) {
            return ((c) this.f30158b).s(x11);
        }
        return null;
    }

    public f j0(float f11, float f12, YAxis.AxisDependency axisDependency) {
        return d(axisDependency).f(f11, f12);
    }

    public rm.g k0(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        this.f30148z1[0] = entry.j();
        this.f30148z1[1] = entry.c();
        d(axisDependency).o(this.f30148z1);
        float[] fArr = this.f30148z1;
        return rm.g.c(fArr[0], fArr[1]);
    }

    public f l0(float f11, float f12, YAxis.AxisDependency axisDependency) {
        f b11 = f.b(0.0d, 0.0d);
        m0(f11, f12, axisDependency, b11);
        return b11;
    }

    public void m0(float f11, float f12, YAxis.AxisDependency axisDependency, f fVar) {
        d(axisDependency).k(f11, f12, fVar);
    }

    public boolean n0() {
        return this.f30176t.C();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void o() {
        this.f30165i.n(((c) this.f30158b).y(), ((c) this.f30158b).x());
        YAxis yAxis = this.f30135m1;
        c cVar = (c) this.f30158b;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.n(cVar.C(axisDependency), ((c) this.f30158b).A(axisDependency));
        YAxis yAxis2 = this.f30136n1;
        c cVar2 = (c) this.f30158b;
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        yAxis2.n(cVar2.C(axisDependency2), ((c) this.f30158b).A(axisDependency2));
    }

    public boolean o0() {
        return this.f30135m1.I0() || this.f30136n1.I0();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30158b == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        e0(canvas);
        if (this.O) {
            Z();
        }
        if (this.f30135m1.f()) {
            t tVar = this.f30137o1;
            YAxis yAxis = this.f30135m1;
            tVar.a(yAxis.H, yAxis.G, yAxis.I0());
        }
        if (this.f30136n1.f()) {
            t tVar2 = this.f30138p1;
            YAxis yAxis2 = this.f30136n1;
            tVar2.a(yAxis2.H, yAxis2.G, yAxis2.I0());
        }
        if (this.f30165i.f()) {
            q qVar = this.f30141s1;
            XAxis xAxis = this.f30165i;
            qVar.a(xAxis.H, xAxis.G, false);
        }
        this.f30141s1.h(canvas);
        this.f30137o1.h(canvas);
        this.f30138p1.h(canvas);
        if (this.f30165i.N()) {
            this.f30141s1.i(canvas);
        }
        if (this.f30135m1.N()) {
            this.f30137o1.i(canvas);
        }
        if (this.f30136n1.N()) {
            this.f30138p1.i(canvas);
        }
        if (this.f30165i.f() && this.f30165i.Q()) {
            this.f30141s1.j(canvas);
        }
        if (this.f30135m1.f() && this.f30135m1.Q()) {
            this.f30137o1.j(canvas);
        }
        if (this.f30136n1.f() && this.f30136n1.Q()) {
            this.f30138p1.j(canvas);
        }
        int save = canvas.save();
        canvas.clipRect(this.f30176t.q());
        this.f30174r.b(canvas);
        if (!this.f30165i.N()) {
            this.f30141s1.i(canvas);
        }
        if (!this.f30135m1.N()) {
            this.f30137o1.i(canvas);
        }
        if (!this.f30136n1.N()) {
            this.f30138p1.i(canvas);
        }
        if (Y()) {
            this.f30174r.d(canvas, this.A);
        }
        canvas.restoreToCount(save);
        this.f30174r.c(canvas);
        if (this.f30165i.f() && !this.f30165i.Q()) {
            this.f30141s1.j(canvas);
        }
        if (this.f30135m1.f() && !this.f30135m1.Q()) {
            this.f30137o1.j(canvas);
        }
        if (this.f30136n1.f() && !this.f30136n1.Q()) {
            this.f30138p1.j(canvas);
        }
        this.f30141s1.g(canvas);
        this.f30137o1.g(canvas);
        this.f30138p1.g(canvas);
        if (q0()) {
            int save2 = canvas.save();
            canvas.clipRect(this.f30176t.q());
            this.f30174r.f(canvas);
            canvas.restoreToCount(save2);
        } else {
            this.f30174r.f(canvas);
        }
        this.f30173q.f(canvas);
        u(canvas);
        v(canvas);
        if (this.f30157a) {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            long j11 = this.f30142t1 + currentTimeMillis2;
            this.f30142t1 = j11;
            long j12 = this.f30143u1 + 1;
            this.f30143u1 = j12;
            Log.i(Chart.G, "Drawtime: " + currentTimeMillis2 + " ms, average: " + (j11 / j12) + " ms, cycles: " + this.f30143u1);
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        float[] fArr = this.C1;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.f30133k1) {
            fArr[0] = this.f30176t.h();
            this.C1[1] = this.f30176t.j();
            d(YAxis.AxisDependency.LEFT).n(this.C1);
        }
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.f30133k1) {
            d(YAxis.AxisDependency.LEFT).o(this.C1);
            this.f30176t.e(this.C1, this);
        } else {
            l lVar = this.f30176t;
            lVar.S(lVar.r(), this, true);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        ChartTouchListener chartTouchListener = this.f30170n;
        if (chartTouchListener == null || this.f30158b == 0 || !this.f30166j) {
            return false;
        }
        return chartTouchListener.onTouch(this, motionEvent);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void p() {
        if (!this.f30147y1) {
            a0(this.f30144v1);
            RectF rectF = this.f30144v1;
            float f11 = rectF.left + 0.0f;
            float f12 = rectF.top + 0.0f;
            float f13 = rectF.right + 0.0f;
            float f14 = rectF.bottom + 0.0f;
            if (this.f30135m1.L0()) {
                f11 += this.f30135m1.A0(this.f30137o1.c());
            }
            if (this.f30136n1.L0()) {
                f13 += this.f30136n1.A0(this.f30138p1.c());
            }
            if (this.f30165i.f() && this.f30165i.P()) {
                float e11 = r2.M + this.f30165i.e();
                if (this.f30165i.w0() == XAxis.XAxisPosition.BOTTOM) {
                    f14 += e11;
                } else {
                    if (this.f30165i.w0() != XAxis.XAxisPosition.TOP) {
                        if (this.f30165i.w0() == XAxis.XAxisPosition.BOTH_SIDED) {
                            f14 += e11;
                        }
                    }
                    f12 += e11;
                }
            }
            float extraTopOffset = f12 + getExtraTopOffset();
            float extraRightOffset = f13 + getExtraRightOffset();
            float extraBottomOffset = f14 + getExtraBottomOffset();
            float extraLeftOffset = f11 + getExtraLeftOffset();
            float e12 = k.e(this.f30132j1);
            this.f30176t.U(Math.max(e12, extraLeftOffset), Math.max(e12, extraTopOffset), Math.max(e12, extraRightOffset), Math.max(e12, extraBottomOffset));
            if (this.f30157a) {
                Log.i(Chart.G, "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Content: ");
                sb2.append(this.f30176t.q().toString());
                Log.i(Chart.G, sb2.toString());
            }
        }
        F0();
        G0();
    }

    public boolean p0() {
        return this.O;
    }

    public boolean q0() {
        return this.f30131i1;
    }

    public boolean r0() {
        return this.Q;
    }

    public boolean s0() {
        return this.S || this.T;
    }

    public void setAutoScaleMinMaxEnabled(boolean z11) {
        this.O = z11;
    }

    public void setBorderColor(int i11) {
        this.f30128f0.setColor(i11);
    }

    public void setBorderWidth(float f11) {
        this.f30128f0.setStrokeWidth(k.e(f11));
    }

    public void setClipValuesToContent(boolean z11) {
        this.f30131i1 = z11;
    }

    public void setDoubleTapToZoomEnabled(boolean z11) {
        this.Q = z11;
    }

    public void setDragEnabled(boolean z11) {
        this.S = z11;
        this.T = z11;
    }

    public void setDragOffsetX(float f11) {
        this.f30176t.W(f11);
    }

    public void setDragOffsetY(float f11) {
        this.f30176t.X(f11);
    }

    public void setDragXEnabled(boolean z11) {
        this.S = z11;
    }

    public void setDragYEnabled(boolean z11) {
        this.T = z11;
    }

    public void setDrawBorders(boolean z11) {
        this.f30130h1 = z11;
    }

    public void setDrawGridBackground(boolean z11) {
        this.f30129f1 = z11;
    }

    public void setGridBackgroundColor(int i11) {
        this.W.setColor(i11);
    }

    public void setHighlightPerDragEnabled(boolean z11) {
        this.R = z11;
    }

    public void setKeepPositionOnRotation(boolean z11) {
        this.f30133k1 = z11;
    }

    public void setMaxVisibleValueCount(int i11) {
        this.N = i11;
    }

    public void setMinOffset(float f11) {
        this.f30132j1 = f11;
    }

    public void setOnDrawListener(mm.c cVar) {
        this.f30134l1 = cVar;
    }

    public void setPinchZoom(boolean z11) {
        this.P = z11;
    }

    public void setRendererLeftYAxis(t tVar) {
        this.f30137o1 = tVar;
    }

    public void setRendererRightYAxis(t tVar) {
        this.f30138p1 = tVar;
    }

    public void setScaleEnabled(boolean z11) {
        this.U = z11;
        this.V = z11;
    }

    public void setScaleXEnabled(boolean z11) {
        this.U = z11;
    }

    public void setScaleYEnabled(boolean z11) {
        this.V = z11;
    }

    public void setVisibleXRangeMaximum(float f11) {
        this.f30176t.c0(this.f30165i.I / f11);
    }

    public void setVisibleXRangeMinimum(float f11) {
        this.f30176t.Y(this.f30165i.I / f11);
    }

    public void setXAxisRenderer(q qVar) {
        this.f30141s1 = qVar;
    }

    public boolean t0() {
        return this.S;
    }

    public boolean u0() {
        return this.T;
    }

    public boolean v0() {
        return this.f30130h1;
    }

    public boolean w0() {
        return this.f30176t.D();
    }

    public boolean x0() {
        return this.R;
    }

    public boolean y0() {
        return this.f30133k1;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public Paint z(int i11) {
        Paint z11 = super.z(i11);
        if (z11 != null) {
            return z11;
        }
        if (i11 != 4) {
            return null;
        }
        return this.W;
    }

    public boolean z0() {
        return this.P;
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = 100;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = true;
        this.f30129f1 = false;
        this.f30130h1 = false;
        this.f30131i1 = false;
        this.f30132j1 = 15.0f;
        this.f30133k1 = false;
        this.f30142t1 = 0L;
        this.f30143u1 = 0L;
        this.f30144v1 = new RectF();
        this.f30145w1 = new Matrix();
        this.f30146x1 = new Matrix();
        this.f30147y1 = false;
        this.f30148z1 = new float[2];
        this.A1 = f.b(0.0d, 0.0d);
        this.B1 = f.b(0.0d, 0.0d);
        this.C1 = new float[2];
    }

    public BarLineChartBase(Context context) {
        super(context);
        this.N = 100;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = true;
        this.f30129f1 = false;
        this.f30130h1 = false;
        this.f30131i1 = false;
        this.f30132j1 = 15.0f;
        this.f30133k1 = false;
        this.f30142t1 = 0L;
        this.f30143u1 = 0L;
        this.f30144v1 = new RectF();
        this.f30145w1 = new Matrix();
        this.f30146x1 = new Matrix();
        this.f30147y1 = false;
        this.f30148z1 = new float[2];
        this.A1 = f.b(0.0d, 0.0d);
        this.B1 = f.b(0.0d, 0.0d);
        this.C1 = new float[2];
    }
}
