package tt;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import qt.b;
import tt.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends j {

    /* renamed from: l, reason: collision with root package name */
    public st.g f90936l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            i.this.r(valueAnimator);
        }
    }

    public i(@NonNull b.a aVar) {
        super(aVar);
        this.f90936l = new st.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(@NonNull ValueAnimator valueAnimator) {
        this.f90936l.f(((Integer) valueAnimator.getAnimatedValue()).intValue());
        b.a aVar = this.f90882b;
        if (aVar != null) {
            aVar.a(this.f90936l);
        }
    }

    @Override // tt.j
    public j n(int i11, int i12, int i13, boolean z11) {
        if (k(i11, i12, i13, z11)) {
            this.f90883c = a();
            this.f90938e = i11;
            this.f90939f = i12;
            this.f90940g = i13;
            this.f90941h = z11;
            int i14 = i13 * 2;
            int i15 = i11 - i13;
            this.f90942i = i15;
            this.f90943j = i11 + i13;
            this.f90936l.d(i15);
            this.f90936l.c(this.f90943j);
            this.f90936l.f(i14);
            j.b h11 = h(z11);
            long j11 = this.f90881a;
            long j12 = (long) (j11 * 0.8d);
            long j13 = (long) (j11 * 0.2d);
            long j14 = (long) (j11 * 0.5d);
            long j15 = (long) (j11 * 0.5d);
            ValueAnimator i16 = i(h11.f90948a, h11.f90949b, j12, false, this.f90936l);
            ValueAnimator i17 = i(h11.f90950c, h11.f90951d, j12, true, this.f90936l);
            i17.setStartDelay(j13);
            ValueAnimator p11 = p(i14, i13, j14);
            ValueAnimator p12 = p(i13, i14, j14);
            p12.setStartDelay(j15);
            ((AnimatorSet) this.f90883c).playTogether(i16, i17, p11, p12);
        }
        return this;
    }

    public final ValueAnimator p(int i11, int i12, long j11) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i11, i12);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j11);
        ofInt.addUpdateListener(new a());
        return ofInt;
    }

    @Override // tt.j
    /* renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public i j(long j11) {
        super.j(j11);
        return this;
    }

    @Override // tt.j
    /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public i m(float f11) {
        T t11 = this.f90883c;
        if (t11 != 0) {
            long j11 = (long) (f11 * this.f90881a);
            int size = ((AnimatorSet) t11).getChildAnimations().size();
            for (int i11 = 0; i11 < size; i11++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.f90883c).getChildAnimations().get(i11);
                long startDelay = j11 - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i11 != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }
}
