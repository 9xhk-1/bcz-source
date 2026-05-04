package j1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class c extends ValueAnimator {

    /* renamed from: a, reason: collision with root package name */
    public final Set<ValueAnimator.AnimatorUpdateListener> f63106a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public final Set<Animator.AnimatorListener> f63107b = new CopyOnWriteArraySet();

    public void a() {
        Iterator<Animator.AnimatorListener> it = this.f63107b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f63107b.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f63106a.add(animatorUpdateListener);
    }

    public void b(boolean z11) {
        for (Animator.AnimatorListener animatorListener : this.f63107b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z11);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void c() {
        Iterator<Animator.AnimatorListener> it = this.f63107b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    public void d(boolean z11) {
        for (Animator.AnimatorListener animatorListener : this.f63107b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z11);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    public void e() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f63106a.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f63107b.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f63106a.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f63107b.remove(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f63106a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j11) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j11) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
