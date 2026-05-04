package lm;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import rm.h;
import rm.i;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"NewApi"})
/* loaded from: classes6.dex */
public class a extends b {

    /* renamed from: m, reason: collision with root package name */
    public static h<a> f71508m;

    static {
        h<a> a11 = h.a(4, new a(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L));
        f71508m = a11;
        a11.l(0.5f);
    }

    public a(l lVar, float f11, float f12, i iVar, View view, float f13, float f14, long j11) {
        super(lVar, f11, f12, iVar, view, f13, f14, j11);
    }

    public static a j(l lVar, float f11, float f12, i iVar, View view, float f13, float f14, long j11) {
        a b11 = f71508m.b();
        b11.f71523d = lVar;
        b11.f71524e = f11;
        b11.f71525f = f12;
        b11.f71526g = iVar;
        b11.f71527h = view;
        b11.f71511k = f13;
        b11.f71512l = f14;
        b11.f71509i.setDuration(j11);
        return b11;
    }

    public static void k(a aVar) {
        f71508m.h(aVar);
    }

    @Override // rm.h.a
    public h.a a() {
        return new a(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L);
    }

    @Override // lm.b
    public void g() {
        k(this);
    }

    @Override // lm.b, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = this.f71522c;
        float f11 = this.f71511k;
        float f12 = this.f71524e - f11;
        float f13 = this.f71510j;
        fArr[0] = f11 + (f12 * f13);
        float f14 = this.f71512l;
        fArr[1] = f14 + ((this.f71525f - f14) * f13);
        this.f71526g.o(fArr);
        this.f71523d.e(this.f71522c, this.f71527h);
    }
}
