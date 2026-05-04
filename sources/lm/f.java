package lm;

import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import rm.h;
import rm.i;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f extends e {

    /* renamed from: m, reason: collision with root package name */
    public static h<f> f71528m;

    /* renamed from: i, reason: collision with root package name */
    public float f71529i;

    /* renamed from: j, reason: collision with root package name */
    public float f71530j;

    /* renamed from: k, reason: collision with root package name */
    public YAxis.AxisDependency f71531k;

    /* renamed from: l, reason: collision with root package name */
    public Matrix f71532l;

    static {
        h<f> a11 = h.a(1, new f(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null));
        f71528m = a11;
        a11.l(0.5f);
    }

    public f(l lVar, float f11, float f12, float f13, float f14, i iVar, YAxis.AxisDependency axisDependency, View view) {
        super(lVar, f13, f14, iVar, view);
        this.f71532l = new Matrix();
        this.f71529i = f11;
        this.f71530j = f12;
        this.f71531k = axisDependency;
    }

    public static f d(l lVar, float f11, float f12, float f13, float f14, i iVar, YAxis.AxisDependency axisDependency, View view) {
        f b11 = f71528m.b();
        b11.f71524e = f13;
        b11.f71525f = f14;
        b11.f71529i = f11;
        b11.f71530j = f12;
        b11.f71523d = lVar;
        b11.f71526g = iVar;
        b11.f71531k = axisDependency;
        b11.f71527h = view;
        return b11;
    }

    public static void e(f fVar) {
        f71528m.h(fVar);
    }

    @Override // rm.h.a
    public h.a a() {
        return new f(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        Matrix matrix = this.f71532l;
        this.f71523d.m0(this.f71529i, this.f71530j, matrix);
        this.f71523d.S(matrix, this.f71527h, false);
        float x11 = ((BarLineChartBase) this.f71527h).f(this.f71531k).I / this.f71523d.x();
        float w11 = ((BarLineChartBase) this.f71527h).getXAxis().I / this.f71523d.w();
        float[] fArr = this.f71522c;
        fArr[0] = this.f71524e - (w11 / 2.0f);
        fArr[1] = this.f71525f + (x11 / 2.0f);
        this.f71526g.o(fArr);
        this.f71523d.i0(this.f71522c, matrix);
        this.f71523d.S(matrix, this.f71527h, false);
        ((BarLineChartBase) this.f71527h).p();
        this.f71527h.postInvalidate();
        e(this);
    }
}
