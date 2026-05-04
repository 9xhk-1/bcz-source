package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class FragmentAnim {
    private FragmentAnim() {
    }

    @AnimRes
    private static int getNextAnim(Fragment fragment, boolean z11, boolean z12) {
        return z12 ? z11 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z11 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    @SuppressLint({"ResourceType"})
    public static AnimationOrAnimator loadAnimation(@NonNull Context context, @NonNull Fragment fragment, boolean z11, boolean z12) {
        int nextTransition = fragment.getNextTransition();
        int nextAnim = getNextAnim(fragment, z11, z12);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i11 = R.id.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i11) != null) {
                fragment.mContainer.setTag(i11, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z11, nextAnim);
        if (onCreateAnimation != null) {
            return new AnimationOrAnimator(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z11, nextAnim);
        if (onCreateAnimator != null) {
            return new AnimationOrAnimator(onCreateAnimator);
        }
        if (nextAnim == 0 && nextTransition != 0) {
            nextAnim = transitToAnimResourceId(context, nextTransition, z11);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, nextAnim);
                    if (loadAnimation != null) {
                        return new AnimationOrAnimator(loadAnimation);
                    }
                } catch (Resources.NotFoundException e11) {
                    throw e11;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, nextAnim);
                if (loadAnimator != null) {
                    return new AnimationOrAnimator(loadAnimator);
                }
            } catch (RuntimeException e12) {
                if (equals) {
                    throw e12;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, nextAnim);
                if (loadAnimation2 != null) {
                    return new AnimationOrAnimator(loadAnimation2);
                }
            }
        }
        return null;
    }

    @AnimRes
    private static int toActivityTransitResId(@NonNull Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i11});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @AnimRes
    private static int transitToAnimResourceId(@NonNull Context context, int i11, boolean z11) {
        if (i11 == 4097) {
            return z11 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i11 == 8194) {
            return z11 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
        }
        if (i11 == 8197) {
            return z11 ? toActivityTransitResId(context, android.R.attr.activityCloseEnterAnimation) : toActivityTransitResId(context, android.R.attr.activityCloseExitAnimation);
        }
        if (i11 == 4099) {
            return z11 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
        }
        if (i11 != 4100) {
            return -1;
        }
        return z11 ? toActivityTransitResId(context, android.R.attr.activityOpenEnterAnimation) : toActivityTransitResId(context, android.R.attr.activityOpenExitAnimation);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AnimationOrAnimator {
        public final Animation animation;
        public final AnimatorSet animator;

        public AnimationOrAnimator(Animation animation) {
            this.animation = animation;
            this.animator = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public AnimationOrAnimator(Animator animator) {
            this.animation = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.animator = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EndViewTransitionAnimation extends AnimationSet implements Runnable {
        private boolean mAnimating;
        private final View mChild;
        private boolean mEnded;
        private final ViewGroup mParent;
        private boolean mTransitionEnded;

        public EndViewTransitionAnimation(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.mAnimating = true;
            this.mParent = viewGroup;
            this.mChild = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j11, @NonNull Transformation transformation) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j11, transformation)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mEnded || !this.mAnimating) {
                this.mParent.endViewTransition(this.mChild);
                this.mTransitionEnded = true;
            } else {
                this.mAnimating = false;
                this.mParent.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j11, @NonNull Transformation transformation, float f11) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j11, transformation, f11)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }
    }
}
