package tt;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import qt.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends b {

    /* renamed from: o, reason: collision with root package name */
    public static final float f90914o = 0.7f;

    /* renamed from: p, reason: collision with root package name */
    public static final float f90915p = 0.3f;

    /* renamed from: q, reason: collision with root package name */
    public static final float f90916q = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public static final String f90917r = "ANIMATION_SCALE_REVERSE";

    /* renamed from: s, reason: collision with root package name */
    public static final String f90918s = "ANIMATION_SCALE";

    /* renamed from: l, reason: collision with root package name */
    public int f90919l;

    /* renamed from: m, reason: collision with root package name */
    public float f90920m;

    /* renamed from: n, reason: collision with root package name */
    public st.d f90921n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            e.this.j(valueAnimator);
        }
    }

    public e(@NonNull b.a aVar) {
        super(aVar);
        this.f90921n = new st.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(@NonNull ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue(b.f90887k)).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue(b.f90886j)).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue(f90918s)).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue(f90917r)).intValue();
        this.f90921n.c(intValue);
        this.f90921n.d(intValue2);
        this.f90921n.g(intValue3);
        this.f90921n.h(intValue4);
        b.a aVar = this.f90882b;
        if (aVar != null) {
            aVar.a(this.f90921n);
        }
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

    @NonNull
    public PropertyValuesHolder n(boolean z11) {
        int i11;
        int i12;
        String str;
        if (z11) {
            i12 = this.f90919l;
            i11 = (int) (i12 * this.f90920m);
            str = f90917r;
        } else {
            i11 = this.f90919l;
            i12 = (int) (i11 * this.f90920m);
            str = f90918s;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i12, i11);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    public final boolean o(int i11, int i12, int i13, float f11) {
        return (this.f90889f == i11 && this.f90890g == i12 && this.f90919l == i13 && this.f90920m == f11) ? false : true;
    }

    @NonNull
    public e p(int i11, int i12, int i13, float f11) {
        if (this.f90883c != 0 && o(i11, i12, i13, f11)) {
            this.f90889f = i11;
            this.f90890g = i12;
            this.f90919l = i13;
            this.f90920m = f11;
            ((ValueAnimator) this.f90883c).setValues(h(false), h(true), n(false), n(true));
        }
        return this;
    }
}
