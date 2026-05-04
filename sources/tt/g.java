package tt;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import qt.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g extends tt.a<ValueAnimator> {

    /* renamed from: h, reason: collision with root package name */
    public static final String f90923h = "ANIMATION_COORDINATE";

    /* renamed from: i, reason: collision with root package name */
    public static final int f90924i = -1;

    /* renamed from: e, reason: collision with root package name */
    public st.e f90925e;

    /* renamed from: f, reason: collision with root package name */
    public int f90926f;

    /* renamed from: g, reason: collision with root package name */
    public int f90927g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            g.this.j(valueAnimator);
        }
    }

    public g(@NonNull b.a aVar) {
        super(aVar);
        this.f90926f = -1;
        this.f90927g = -1;
        this.f90925e = new st.e();
    }

    private boolean i(int i11, int i12) {
        return (this.f90926f == i11 && this.f90927g == i12) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(@NonNull ValueAnimator valueAnimator) {
        this.f90925e.b(((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue());
        b.a aVar = this.f90882b;
        if (aVar != null) {
            aVar.a(this.f90925e);
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

    public final PropertyValuesHolder h() {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", this.f90926f, this.f90927g);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    @Override // tt.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public g m(float f11) {
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
    public g l(int i11, int i12) {
        if (this.f90883c != 0 && i(i11, i12)) {
            this.f90926f = i11;
            this.f90927g = i12;
            ((ValueAnimator) this.f90883c).setValues(h());
        }
        return this;
    }
}
