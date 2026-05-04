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
public class c extends tt.a<AnimatorSet> {

    /* renamed from: e, reason: collision with root package name */
    public int f90892e;

    /* renamed from: f, reason: collision with root package name */
    public int f90893f;

    /* renamed from: g, reason: collision with root package name */
    public int f90894g;

    /* renamed from: h, reason: collision with root package name */
    public int f90895h;

    /* renamed from: i, reason: collision with root package name */
    public int f90896i;

    /* renamed from: j, reason: collision with root package name */
    public st.b f90897j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EnumC1212c f90898a;

        public a(EnumC1212c enumC1212c) {
            this.f90898a = enumC1212c;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.k(valueAnimator, this.f90898a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90900a;

        static {
            int[] iArr = new int[EnumC1212c.values().length];
            f90900a = iArr;
            try {
                iArr[EnumC1212c.Width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90900a[EnumC1212c.Height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90900a[EnumC1212c.Radius.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: tt.c$c, reason: collision with other inner class name */
    public enum EnumC1212c {
        Width,
        Height,
        Radius
    }

    public c(@NonNull b.a aVar) {
        super(aVar);
        this.f90897j = new st.b();
    }

    @Override // tt.a
    @NonNull
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public final ValueAnimator h(int i11, int i12, long j11, EnumC1212c enumC1212c) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i11, i12);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j11);
        ofInt.addUpdateListener(new a(enumC1212c));
        return ofInt;
    }

    @Override // tt.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public c j(long j11) {
        super.j(j11);
        return this;
    }

    public final boolean j(int i11, int i12, int i13, int i14, int i15) {
        return (this.f90892e == i11 && this.f90893f == i12 && this.f90894g == i13 && this.f90895h == i14 && this.f90896i == i15) ? false : true;
    }

    public final void k(@NonNull ValueAnimator valueAnimator, @NonNull EnumC1212c enumC1212c) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i11 = b.f90900a[enumC1212c.ordinal()];
        if (i11 == 1) {
            this.f90897j.f(intValue);
        } else if (i11 == 2) {
            this.f90897j.d(intValue);
        } else if (i11 == 3) {
            this.f90897j.e(intValue);
        }
        b.a aVar = this.f90882b;
        if (aVar != null) {
            aVar.a(this.f90897j);
        }
    }

    @Override // tt.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c m(float f11) {
        T t11 = this.f90883c;
        if (t11 != 0) {
            long j11 = (long) (f11 * this.f90881a);
            Iterator<Animator> it = ((AnimatorSet) t11).getChildAnimations().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                long j12 = z11 ? j11 - duration : j11;
                if (j12 >= 0) {
                    if (j12 >= duration) {
                        j12 = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j12);
                    }
                    if (!z11 && duration >= this.f90881a) {
                        z11 = true;
                    }
                }
            }
        }
        return this;
    }

    public c m(int i11, int i12, int i13, int i14, int i15) {
        if (!j(i11, i12, i13, i14, i15)) {
            return this;
        }
        this.f90883c = a();
        this.f90892e = i11;
        this.f90893f = i12;
        this.f90894g = i13;
        this.f90895h = i14;
        this.f90896i = i15;
        int i16 = (int) (i15 / 1.5d);
        long j11 = this.f90881a;
        long j12 = j11 / 2;
        ValueAnimator h11 = h(i11, i12, j11, EnumC1212c.Width);
        EnumC1212c enumC1212c = EnumC1212c.Height;
        ValueAnimator h12 = h(i13, i14, j12, enumC1212c);
        EnumC1212c enumC1212c2 = EnumC1212c.Radius;
        ValueAnimator h13 = h(i15, i16, j12, enumC1212c2);
        ((AnimatorSet) this.f90883c).play(h12).with(h13).with(h11).before(h(i14, i13, j12, enumC1212c)).before(h(i16, i15, j12, enumC1212c2));
        return this;
    }
}
