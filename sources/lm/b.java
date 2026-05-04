package lm;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import rm.i;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"NewApi"})
/* loaded from: classes6.dex */
public abstract class b extends e implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* renamed from: i, reason: collision with root package name */
    public ObjectAnimator f71509i;

    /* renamed from: j, reason: collision with root package name */
    public float f71510j;

    /* renamed from: k, reason: collision with root package name */
    public float f71511k;

    /* renamed from: l, reason: collision with root package name */
    public float f71512l;

    public b(l lVar, float f11, float f12, i iVar, View view, float f13, float f14, long j11) {
        super(lVar, f11, f12, iVar, view);
        this.f71511k = f13;
        this.f71512l = f14;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, TypedValues.CycleType.S_WAVE_PHASE, 0.0f, 1.0f);
        this.f71509i = ofFloat;
        ofFloat.setDuration(j11);
        this.f71509i.addUpdateListener(this);
        this.f71509i.addListener(this);
    }

    public float d() {
        return this.f71510j;
    }

    public float e() {
        return this.f71511k;
    }

    public float f() {
        return this.f71512l;
    }

    public abstract void g();

    public void h() {
        this.f71509i.removeAllListeners();
        this.f71509i.removeAllUpdateListeners();
        this.f71509i.reverse();
        this.f71509i.addUpdateListener(this);
        this.f71509i.addListener(this);
    }

    public void i(float f11) {
        this.f71510j = f11;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        try {
            g();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        try {
            g();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"NewApi"})
    public void run() {
        this.f71509i.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
    }
}
