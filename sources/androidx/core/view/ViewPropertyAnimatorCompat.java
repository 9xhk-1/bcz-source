package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ViewPropertyAnimatorCompat {
    private final WeakReference<View> mView;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static ViewPropertyAnimator translationZ(ViewPropertyAnimator viewPropertyAnimator, float f11) {
            return viewPropertyAnimator.translationZ(f11);
        }

        @DoNotInline
        public static ViewPropertyAnimator translationZBy(ViewPropertyAnimator viewPropertyAnimator, float f11) {
            return viewPropertyAnimator.translationZBy(f11);
        }

        @DoNotInline
        public static ViewPropertyAnimator z(ViewPropertyAnimator viewPropertyAnimator, float f11) {
            return viewPropertyAnimator.z(f11);
        }

        @DoNotInline
        public static ViewPropertyAnimator zBy(ViewPropertyAnimator viewPropertyAnimator, float f11) {
            return viewPropertyAnimator.zBy(f11);
        }
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.mView = new WeakReference<>(view);
    }

    private void setListenerInternal(final View view, final ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    viewPropertyAnimatorListener.onAnimationCancel(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorListener.onAnimationEnd(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    viewPropertyAnimatorListener.onAnimationStart(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    @NonNull
    public ViewPropertyAnimatorCompat alpha(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().alpha(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat alphaBy(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().alphaBy(f11);
        }
        return this;
    }

    public void cancel() {
        View view = this.mView.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long getDuration() {
        View view = this.mView.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @Nullable
    public Interpolator getInterpolator() {
        View view = this.mView.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long getStartDelay() {
        View view = this.mView.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotation(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotation(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationBy(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationBy(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationX(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationX(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationXBy(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationXBy(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationY(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationY(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationYBy(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationYBy(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleX(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleX(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleXBy(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleXBy(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleY(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleY(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleYBy(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleYBy(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setDuration(long j11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().setDuration(j11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setInterpolator(@Nullable Interpolator interpolator) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setListener(@Nullable ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = this.mView.get();
        if (view != null) {
            setListenerInternal(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setStartDelay(long j11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().setStartDelay(j11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setUpdateListener(@Nullable final ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        final View view = this.mView.get();
        if (view != null) {
            view.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.j0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ViewPropertyAnimatorUpdateListener.this.onAnimationUpdate(view);
                }
            } : null);
        }
        return this;
    }

    public void start() {
        View view = this.mView.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationX(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationX(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationXBy(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationXBy(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationY(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationY(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationYBy(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationYBy(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationZ(float f11) {
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.translationZ(view.animate(), f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationZBy(float f11) {
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.translationZBy(view.animate(), f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat withEndAction(@NonNull Runnable runnable) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    public ViewPropertyAnimatorCompat withLayer() {
        View view = this.mView.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat withStartAction(@NonNull Runnable runnable) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat x(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().x(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat xBy(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().xBy(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat y(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().y(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat yBy(float f11) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().yBy(f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat z(float f11) {
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.z(view.animate(), f11);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat zBy(float f11) {
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.zBy(view.animate(), f11);
        }
        return this;
    }
}
