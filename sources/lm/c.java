package lm;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import rm.h;
import rm.i;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"NewApi"})
/* loaded from: classes6.dex */
public class c extends b implements Animator.AnimatorListener {

    /* renamed from: t, reason: collision with root package name */
    public static h<c> f71513t = h.a(8, new c(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0));

    /* renamed from: m, reason: collision with root package name */
    public float f71514m;

    /* renamed from: n, reason: collision with root package name */
    public float f71515n;

    /* renamed from: o, reason: collision with root package name */
    public float f71516o;

    /* renamed from: p, reason: collision with root package name */
    public float f71517p;

    /* renamed from: q, reason: collision with root package name */
    public YAxis f71518q;

    /* renamed from: r, reason: collision with root package name */
    public float f71519r;

    /* renamed from: s, reason: collision with root package name */
    public Matrix f71520s;

    @SuppressLint({"NewApi"})
    public c(l lVar, View view, i iVar, YAxis yAxis, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j11) {
        super(lVar, f12, f13, iVar, view, f14, f15, j11);
        this.f71520s = new Matrix();
        this.f71516o = f16;
        this.f71517p = f17;
        this.f71514m = f18;
        this.f71515n = f19;
        this.f71509i.addListener(this);
        this.f71518q = yAxis;
        this.f71519r = f11;
    }

    public static c j(l lVar, View view, i iVar, YAxis yAxis, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j11) {
        c b11 = f71513t.b();
        b11.f71523d = lVar;
        b11.f71524e = f12;
        b11.f71525f = f13;
        b11.f71526g = iVar;
        b11.f71527h = view;
        b11.f71511k = f14;
        b11.f71512l = f15;
        b11.f71518q = yAxis;
        b11.f71519r = f11;
        b11.h();
        b11.f71509i.setDuration(j11);
        return b11;
    }

    @Override // rm.h.a
    public h.a a() {
        return new c(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    @Override // lm.b, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ((BarLineChartBase) this.f71527h).p();
        this.f71527h.postInvalidate();
    }

    @Override // lm.b, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f11 = this.f71511k;
        float f12 = this.f71524e - f11;
        float f13 = this.f71510j;
        float f14 = f11 + (f12 * f13);
        float f15 = this.f71512l;
        float f16 = f15 + ((this.f71525f - f15) * f13);
        Matrix matrix = this.f71520s;
        this.f71523d.g0(f14, f16, matrix);
        this.f71523d.S(matrix, this.f71527h, false);
        float x11 = this.f71518q.I / this.f71523d.x();
        float w11 = this.f71519r / this.f71523d.w();
        float[] fArr = this.f71522c;
        float f17 = this.f71514m;
        float f18 = (this.f71516o - (w11 / 2.0f)) - f17;
        float f19 = this.f71510j;
        fArr[0] = f17 + (f18 * f19);
        float f21 = this.f71515n;
        fArr[1] = f21 + (((this.f71517p + (x11 / 2.0f)) - f21) * f19);
        this.f71526g.o(fArr);
        this.f71523d.i0(this.f71522c, matrix);
        this.f71523d.S(matrix, this.f71527h, true);
    }

    @Override // lm.b
    public void g() {
    }

    @Override // lm.b, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // lm.b, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // lm.b, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
