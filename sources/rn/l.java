package rn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat;
import com.google.android.material.R;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Iterator;
import rn.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class l extends h<ObjectAnimator> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f84410k = 1800;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f84411l = {533, 567, 850, 750};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f84412m = {1267, 1000, 333, 0};

    /* renamed from: n, reason: collision with root package name */
    public static final Property<l, Float> f84413n = new c(Float.class, "animationFraction");

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f84414c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f84415d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator[] f84416e;

    /* renamed from: f, reason: collision with root package name */
    public final rn.b f84417f;

    /* renamed from: g, reason: collision with root package name */
    public int f84418g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f84419h;

    /* renamed from: i, reason: collision with root package name */
    public float f84420i;

    /* renamed from: j, reason: collision with root package name */
    public Animatable2Compat.AnimationCallback f84421j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            l lVar = l.this;
            lVar.f84418g = (lVar.f84418g + 1) % l.this.f84417f.f84322c.length;
            l.this.f84419h = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            l.this.a();
            l lVar = l.this;
            Animatable2Compat.AnimationCallback animationCallback = lVar.f84421j;
            if (animationCallback != null) {
                animationCallback.onAnimationEnd(lVar.f84390a);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends Property<l, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(l lVar) {
            return Float.valueOf(lVar.p());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(l lVar, Float f11) {
            lVar.h(f11.floatValue());
        }
    }

    public l(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f84418g = 0;
        this.f84421j = null;
        this.f84417f = linearProgressIndicatorSpec;
        this.f84416e = new Interpolator[]{AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f84420i;
    }

    private void q() {
        if (this.f84414c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f84413n, 0.0f, 1.0f);
            this.f84414c = ofFloat;
            ofFloat.setDuration(1800L);
            this.f84414c.setInterpolator(null);
            this.f84414c.setRepeatCount(-1);
            this.f84414c.addListener(new a());
        }
        if (this.f84415d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f84413n, 1.0f);
            this.f84415d = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f84415d.setInterpolator(null);
            this.f84415d.addListener(new b());
        }
    }

    private void r() {
        if (this.f84419h) {
            Iterator<g.a> it = this.f84391b.iterator();
            while (it.hasNext()) {
                it.next().f84388c = this.f84417f.f84322c[this.f84418g];
            }
            this.f84419h = false;
        }
    }

    private void s(int i11) {
        for (int i12 = 0; i12 < this.f84391b.size(); i12++) {
            g.a aVar = this.f84391b.get(i12);
            int[] iArr = f84412m;
            int i13 = i12 * 2;
            int i14 = iArr[i13];
            int[] iArr2 = f84411l;
            aVar.f84386a = MathUtils.clamp(this.f84416e[i13].getInterpolation(b(i11, i14, iArr2[i13])), 0.0f, 1.0f);
            int i15 = i13 + 1;
            aVar.f84387b = MathUtils.clamp(this.f84416e[i15].getInterpolation(b(i11, iArr[i15], iArr2[i15])), 0.0f, 1.0f);
        }
    }

    @Override // rn.h
    public void a() {
        ObjectAnimator objectAnimator = this.f84414c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // rn.h
    public void c() {
        g();
    }

    @Override // rn.h
    public void d(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f84421j = animationCallback;
    }

    @Override // rn.h
    public void f() {
        ObjectAnimator objectAnimator = this.f84415d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f84390a.isVisible()) {
            this.f84415d.setFloatValues(this.f84420i, 1.0f);
            this.f84415d.setDuration((long) ((1.0f - this.f84420i) * 1800.0f));
            this.f84415d.start();
        }
    }

    @Override // rn.h
    @VisibleForTesting
    public void g() {
        this.f84418g = 0;
        Iterator<g.a> it = this.f84391b.iterator();
        while (it.hasNext()) {
            it.next().f84388c = this.f84417f.f84322c[0];
        }
    }

    @Override // rn.h
    @VisibleForTesting
    public void h(float f11) {
        this.f84420i = f11;
        s((int) (f11 * 1800.0f));
        r();
        this.f84390a.invalidateSelf();
    }

    @Override // rn.h
    public void i() {
        q();
        g();
        this.f84414c.start();
    }

    @Override // rn.h
    public void j() {
        this.f84421j = null;
    }
}
