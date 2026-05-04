package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.Transition;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class TranslationAnimationCreator {
    private TranslationAnimationCreator() {
    }

    @Nullable
    public static Animator createAnimation(@NonNull View view, @NonNull TransitionValues transitionValues, int i11, int i12, float f11, float f12, float f13, float f14, @Nullable TimeInterpolator timeInterpolator, @NonNull Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) transitionValues.view.getTag(R.id.transition_position)) != null) {
            f11 = (r2[0] - i11) + translationX;
            f12 = (r2[1] - i12) + translationY;
        }
        view.setTranslationX(f11);
        view.setTranslationY(f12);
        if (f11 == f13 && f12 == f14) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f11, f13), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f12, f14));
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(view, transitionValues.view, translationX, translationY);
        transition.addListener(transitionPositionListener);
        ofPropertyValuesHolder.addListener(transitionPositionListener);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private boolean mIsTransitionCanceled;
        private final View mMovingView;
        private float mPausedX;
        private float mPausedY;
        private final float mTerminalX;
        private final float mTerminalY;
        private int[] mTransitionPosition;
        private final View mViewInHierarchy;

        public TransitionPositionListener(View view, View view2, float f11, float f12) {
            this.mMovingView = view;
            this.mViewInHierarchy = view2;
            this.mTerminalX = f11;
            this.mTerminalY = f12;
            int i11 = R.id.transition_position;
            int[] iArr = (int[]) view2.getTag(i11);
            this.mTransitionPosition = iArr;
            if (iArr != null) {
                view2.setTag(i11, null);
            }
        }

        private void setInterruptedPosition() {
            if (this.mTransitionPosition == null) {
                this.mTransitionPosition = new int[2];
            }
            this.mMovingView.getLocationOnScreen(this.mTransitionPosition);
            this.mViewInHierarchy.setTag(R.id.transition_position, this.mTransitionPosition);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mIsTransitionCanceled = true;
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z11) {
            if (z11) {
                return;
            }
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
            this.mIsTransitionCanceled = true;
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition, boolean z11) {
            if (this.mIsTransitionCanceled) {
                return;
            }
            this.mViewInHierarchy.setTag(R.id.transition_position, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
            setInterruptedPosition();
            this.mPausedX = this.mMovingView.getTranslationX();
            this.mPausedY = this.mMovingView.getTranslationY();
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
            this.mMovingView.setTranslationX(this.mPausedX);
            this.mMovingView.setTranslationY(this.mPausedY);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            onTransitionEnd(transition, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
        }
    }
}
