package tt;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import qt.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends b {

    /* renamed from: o, reason: collision with root package name */
    public static final String f90905o = "ANIMATION_RADIUS_REVERSE";

    /* renamed from: p, reason: collision with root package name */
    public static final String f90906p = "ANIMATION_RADIUS";

    /* renamed from: q, reason: collision with root package name */
    public static final String f90907q = "ANIMATION_STROKE_REVERSE";

    /* renamed from: r, reason: collision with root package name */
    public static final String f90908r = "ANIMATION_STROKE";

    /* renamed from: s, reason: collision with root package name */
    public static final int f90909s = 1;

    /* renamed from: l, reason: collision with root package name */
    public st.c f90910l;

    /* renamed from: m, reason: collision with root package name */
    public int f90911m;

    /* renamed from: n, reason: collision with root package name */
    public int f90912n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.j(valueAnimator);
        }
    }

    public d(@NonNull b.a aVar) {
        super(aVar);
        this.f90910l = new st.c();
    }

    @Override // tt.b, tt.a
    @NonNull
    /* renamed from: g */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    public final void j(@NonNull ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue(b.f90887k)).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue(b.f90886j)).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue(f90906p)).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue(f90905o)).intValue();
        int intValue5 = ((Integer) valueAnimator.getAnimatedValue(f90908r)).intValue();
        int intValue6 = ((Integer) valueAnimator.getAnimatedValue(f90907q)).intValue();
        this.f90910l.c(intValue);
        this.f90910l.d(intValue2);
        this.f90910l.i(intValue3);
        this.f90910l.j(intValue4);
        this.f90910l.k(intValue5);
        this.f90910l.l(intValue6);
        b.a aVar = this.f90882b;
        if (aVar != null) {
            aVar.a(this.f90910l);
        }
    }

    @NonNull
    public final PropertyValuesHolder n(boolean z11) {
        int i11;
        int i12;
        String str;
        if (z11) {
            i12 = this.f90911m;
            i11 = i12 / 2;
            str = f90905o;
        } else {
            i11 = this.f90911m;
            i12 = i11 / 2;
            str = f90906p;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i11, i12);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    @NonNull
    public final PropertyValuesHolder o(boolean z11) {
        int i11;
        String str;
        int i12 = 0;
        if (z11) {
            int i13 = this.f90911m;
            str = f90907q;
            i12 = i13;
            i11 = 0;
        } else {
            i11 = this.f90911m;
            str = f90908r;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i12, i11);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    public final boolean p(int i11, int i12, int i13, int i14) {
        return (this.f90889f == i11 && this.f90890g == i12 && this.f90911m == i13 && this.f90912n == i14) ? false : true;
    }

    @NonNull
    public d q(int i11, int i12, int i13, int i14) {
        if (this.f90883c != 0 && p(i11, i12, i13, i14)) {
            this.f90889f = i11;
            this.f90890g = i12;
            this.f90911m = i13;
            this.f90912n = i14;
            ((ValueAnimator) this.f90883c).setValues(h(false), h(true), n(false), n(true), o(false), o(true));
        }
        return this;
    }
}
