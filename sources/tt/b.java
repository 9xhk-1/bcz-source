package tt;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import qt.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends tt.a<ValueAnimator> {

    /* renamed from: h, reason: collision with root package name */
    public static final String f90884h = "#33ffffff";

    /* renamed from: i, reason: collision with root package name */
    public static final String f90885i = "#ffffff";

    /* renamed from: j, reason: collision with root package name */
    public static final String f90886j = "ANIMATION_COLOR_REVERSE";

    /* renamed from: k, reason: collision with root package name */
    public static final String f90887k = "ANIMATION_COLOR";

    /* renamed from: e, reason: collision with root package name */
    public st.a f90888e;

    /* renamed from: f, reason: collision with root package name */
    public int f90889f;

    /* renamed from: g, reason: collision with root package name */
    public int f90890g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.j(valueAnimator);
        }
    }

    public b(@Nullable b.a aVar) {
        super(aVar);
        this.f90888e = new st.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(@NonNull ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue(f90887k)).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue(f90886j)).intValue();
        this.f90888e.c(intValue);
        this.f90888e.d(intValue2);
        b.a aVar = this.f90882b;
        if (aVar != null) {
            aVar.a(this.f90888e);
        }
    }

    @Override // tt.a
    @NonNull
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    public PropertyValuesHolder h(boolean z11) {
        int i11;
        int i12;
        String str;
        if (z11) {
            i11 = this.f90890g;
            i12 = this.f90889f;
            str = f90886j;
        } else {
            i11 = this.f90889f;
            i12 = this.f90890g;
            str = f90887k;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i11, i12);
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    public final boolean i(int i11, int i12) {
        return (this.f90889f == i11 && this.f90890g == i12) ? false : true;
    }

    @Override // tt.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b m(float f11) {
        T t11 = this.f90883c;
        if (t11 != 0) {
            long j11 = (long) (f11 * this.f90881a);
            if (((ValueAnimator) t11).getValues() != null && ((ValueAnimator) this.f90883c).getValues().length > 0) {
                ((ValueAnimator) this.f90883c).setCurrentPlayTime(j11);
            }
        }
        return this;
    }

    @NonNull
    public b l(int i11, int i12) {
        if (this.f90883c != 0 && i(i11, i12)) {
            this.f90889f = i11;
            this.f90890g = i12;
            ((ValueAnimator) this.f90883c).setValues(h(false), h(true));
        }
        return this;
    }
}
