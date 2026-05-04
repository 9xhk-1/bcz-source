package tt;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import java.util.Iterator;
import qt.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j extends tt.a<AnimatorSet> {

    /* renamed from: e, reason: collision with root package name */
    public int f90938e;

    /* renamed from: f, reason: collision with root package name */
    public int f90939f;

    /* renamed from: g, reason: collision with root package name */
    public int f90940g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f90941h;

    /* renamed from: i, reason: collision with root package name */
    public int f90942i;

    /* renamed from: j, reason: collision with root package name */
    public int f90943j;

    /* renamed from: k, reason: collision with root package name */
    public st.h f90944k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ st.h f90945a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f90946b;

        public a(st.h hVar, boolean z11) {
            this.f90945a = hVar;
            this.f90946b = z11;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            j.this.l(this.f90945a, valueAnimator, this.f90946b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f90948a;

        /* renamed from: b, reason: collision with root package name */
        public final int f90949b;

        /* renamed from: c, reason: collision with root package name */
        public final int f90950c;

        /* renamed from: d, reason: collision with root package name */
        public final int f90951d;

        public b(int i11, int i12, int i13, int i14) {
            this.f90948a = i11;
            this.f90949b = i12;
            this.f90950c = i13;
            this.f90951d = i14;
        }
    }

    public j(@NonNull b.a aVar) {
        super(aVar);
        this.f90944k = new st.h();
    }

    @Override // tt.a
    @NonNull
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    @NonNull
    public b h(boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (z11) {
            int i15 = this.f90938e;
            int i16 = this.f90940g;
            i11 = i15 + i16;
            int i17 = this.f90939f;
            i12 = i17 + i16;
            i13 = i15 - i16;
            i14 = i17 - i16;
        } else {
            int i18 = this.f90938e;
            int i19 = this.f90940g;
            i11 = i18 - i19;
            int i21 = this.f90939f;
            i12 = i21 - i19;
            i13 = i18 + i19;
            i14 = i21 + i19;
        }
        return new b(i11, i12, i13, i14);
    }

    public ValueAnimator i(int i11, int i12, long j11, boolean z11, st.h hVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i11, i12);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j11);
        ofInt.addUpdateListener(new a(hVar, z11));
        return ofInt;
    }

    @Override // tt.a
    public j j(long j11) {
        super.j(j11);
        return this;
    }

    public boolean k(int i11, int i12, int i13, boolean z11) {
        return (this.f90938e == i11 && this.f90939f == i12 && this.f90940g == i13 && this.f90941h == z11) ? false : true;
    }

    public final void l(@NonNull st.h hVar, @NonNull ValueAnimator valueAnimator, boolean z11) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (this.f90941h) {
            if (z11) {
                hVar.d(intValue);
            } else {
                hVar.c(intValue);
            }
        } else if (z11) {
            hVar.c(intValue);
        } else {
            hVar.d(intValue);
        }
        b.a aVar = this.f90882b;
        if (aVar != null) {
            aVar.a(hVar);
        }
    }

    @Override // tt.a
    public j m(float f11) {
        T t11 = this.f90883c;
        if (t11 != 0) {
            long j11 = (long) (f11 * this.f90881a);
            Iterator<Animator> it = ((AnimatorSet) t11).getChildAnimations().iterator();
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                if (j11 <= duration) {
                    duration = j11;
                }
                valueAnimator.setCurrentPlayTime(duration);
                j11 -= duration;
            }
        }
        return this;
    }

    public j n(int i11, int i12, int i13, boolean z11) {
        if (!k(i11, i12, i13, z11)) {
            return this;
        }
        this.f90883c = a();
        this.f90938e = i11;
        this.f90939f = i12;
        this.f90940g = i13;
        this.f90941h = z11;
        int i14 = i11 - i13;
        this.f90942i = i14;
        this.f90943j = i11 + i13;
        this.f90944k.d(i14);
        this.f90944k.c(this.f90943j);
        b h11 = h(z11);
        long j11 = this.f90881a / 2;
        ((AnimatorSet) this.f90883c).playSequentially(i(h11.f90948a, h11.f90949b, j11, false, this.f90944k), i(h11.f90950c, h11.f90951d, j11, true, this.f90944k));
        return this;
    }
}
