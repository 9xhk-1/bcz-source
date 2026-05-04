package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class FastScroller extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    private static final int ANIMATION_STATE_FADING_IN = 1;
    private static final int ANIMATION_STATE_FADING_OUT = 3;
    private static final int ANIMATION_STATE_IN = 2;
    private static final int ANIMATION_STATE_OUT = 0;
    private static final int DRAG_NONE = 0;
    private static final int DRAG_X = 1;
    private static final int DRAG_Y = 2;
    private static final int HIDE_DELAY_AFTER_DRAGGING_MS = 1200;
    private static final int HIDE_DELAY_AFTER_VISIBLE_MS = 1500;
    private static final int HIDE_DURATION_MS = 500;
    private static final int SCROLLBAR_FULL_OPAQUE = 255;
    private static final int SHOW_DURATION_MS = 500;
    private static final int STATE_DRAGGING = 2;
    private static final int STATE_HIDDEN = 0;
    private static final int STATE_VISIBLE = 1;
    int mAnimationState;
    private final Runnable mHideRunnable;

    @VisibleForTesting
    float mHorizontalDragX;

    @VisibleForTesting
    int mHorizontalThumbCenterX;
    private final StateListDrawable mHorizontalThumbDrawable;
    private final int mHorizontalThumbHeight;

    @VisibleForTesting
    int mHorizontalThumbWidth;
    private final Drawable mHorizontalTrackDrawable;
    private final int mHorizontalTrackHeight;
    private final int mMargin;
    private final RecyclerView.OnScrollListener mOnScrollListener;
    private RecyclerView mRecyclerView;
    private final int mScrollbarMinimumRange;
    final ValueAnimator mShowHideAnimator;

    @VisibleForTesting
    float mVerticalDragY;

    @VisibleForTesting
    int mVerticalThumbCenterY;
    final StateListDrawable mVerticalThumbDrawable;

    @VisibleForTesting
    int mVerticalThumbHeight;
    private final int mVerticalThumbWidth;
    final Drawable mVerticalTrackDrawable;
    private final int mVerticalTrackWidth;
    private static final int[] PRESSED_STATE_SET = {R.attr.state_pressed};
    private static final int[] EMPTY_STATE_SET = new int[0];
    private int mRecyclerViewWidth = 0;
    private int mRecyclerViewHeight = 0;
    private boolean mNeedVerticalScrollbar = false;
    private boolean mNeedHorizontalScrollbar = false;
    private int mState = 0;
    private int mDragState = 0;
    private final int[] mVerticalRange = new int[2];
    private final int[] mHorizontalRange = new int[2];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class AnimatorListener extends AnimatorListenerAdapter {
        private boolean mCanceled = false;

        public AnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mCanceled) {
                this.mCanceled = false;
                return;
            }
            if (((Float) FastScroller.this.mShowHideAnimator.getAnimatedValue()).floatValue() == 0.0f) {
                FastScroller fastScroller = FastScroller.this;
                fastScroller.mAnimationState = 0;
                fastScroller.setState(0);
            } else {
                FastScroller fastScroller2 = FastScroller.this;
                fastScroller2.mAnimationState = 2;
                fastScroller2.requestRedraw();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        public AnimatorUpdater() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller.this.mVerticalThumbDrawable.setAlpha(floatValue);
            FastScroller.this.mVerticalTrackDrawable.setAlpha(floatValue);
            FastScroller.this.requestRedraw();
        }
    }

    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i11, int i12, int i13) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mShowHideAnimator = ofFloat;
        this.mAnimationState = 0;
        this.mHideRunnable = new Runnable() { // from class: androidx.recyclerview.widget.FastScroller.1
            @Override // java.lang.Runnable
            public void run() {
                FastScroller.this.hide(500);
            }
        };
        this.mOnScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.FastScroller.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i14, int i15) {
                FastScroller.this.updateScrollPosition(recyclerView2.computeHorizontalScrollOffset(), recyclerView2.computeVerticalScrollOffset());
            }
        };
        this.mVerticalThumbDrawable = stateListDrawable;
        this.mVerticalTrackDrawable = drawable;
        this.mHorizontalThumbDrawable = stateListDrawable2;
        this.mHorizontalTrackDrawable = drawable2;
        this.mVerticalThumbWidth = Math.max(i11, stateListDrawable.getIntrinsicWidth());
        this.mVerticalTrackWidth = Math.max(i11, drawable.getIntrinsicWidth());
        this.mHorizontalThumbHeight = Math.max(i11, stateListDrawable2.getIntrinsicWidth());
        this.mHorizontalTrackHeight = Math.max(i11, drawable2.getIntrinsicWidth());
        this.mScrollbarMinimumRange = i12;
        this.mMargin = i13;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new AnimatorListener());
        ofFloat.addUpdateListener(new AnimatorUpdater());
        attachToRecyclerView(recyclerView);
    }

    private void cancelHide() {
        this.mRecyclerView.removeCallbacks(this.mHideRunnable);
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this);
        this.mRecyclerView.removeOnScrollListener(this.mOnScrollListener);
        cancelHide();
    }

    private void drawHorizontalScrollbar(Canvas canvas) {
        int i11 = this.mRecyclerViewHeight;
        int i12 = this.mHorizontalThumbHeight;
        int i13 = this.mHorizontalThumbCenterX;
        int i14 = this.mHorizontalThumbWidth;
        this.mHorizontalThumbDrawable.setBounds(0, 0, i14, i12);
        this.mHorizontalTrackDrawable.setBounds(0, 0, this.mRecyclerViewWidth, this.mHorizontalTrackHeight);
        canvas.translate(0.0f, i11 - i12);
        this.mHorizontalTrackDrawable.draw(canvas);
        canvas.translate(i13 - (i14 / 2), 0.0f);
        this.mHorizontalThumbDrawable.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void drawVerticalScrollbar(Canvas canvas) {
        int i11 = this.mRecyclerViewWidth;
        int i12 = this.mVerticalThumbWidth;
        int i13 = i11 - i12;
        int i14 = this.mVerticalThumbCenterY;
        int i15 = this.mVerticalThumbHeight;
        int i16 = i14 - (i15 / 2);
        this.mVerticalThumbDrawable.setBounds(0, 0, i12, i15);
        this.mVerticalTrackDrawable.setBounds(0, 0, this.mVerticalTrackWidth, this.mRecyclerViewHeight);
        if (!isLayoutRTL()) {
            canvas.translate(i13, 0.0f);
            this.mVerticalTrackDrawable.draw(canvas);
            canvas.translate(0.0f, i16);
            this.mVerticalThumbDrawable.draw(canvas);
            canvas.translate(-i13, -i16);
            return;
        }
        this.mVerticalTrackDrawable.draw(canvas);
        canvas.translate(this.mVerticalThumbWidth, i16);
        canvas.scale(-1.0f, 1.0f);
        this.mVerticalThumbDrawable.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.mVerticalThumbWidth, -i16);
    }

    private int[] getHorizontalRange() {
        int[] iArr = this.mHorizontalRange;
        int i11 = this.mMargin;
        iArr[0] = i11;
        iArr[1] = this.mRecyclerViewWidth - i11;
        return iArr;
    }

    private int[] getVerticalRange() {
        int[] iArr = this.mVerticalRange;
        int i11 = this.mMargin;
        iArr[0] = i11;
        iArr[1] = this.mRecyclerViewHeight - i11;
        return iArr;
    }

    private void horizontalScrollTo(float f11) {
        int[] horizontalRange = getHorizontalRange();
        float max = Math.max(horizontalRange[0], Math.min(horizontalRange[1], f11));
        if (Math.abs(this.mHorizontalThumbCenterX - max) < 2.0f) {
            return;
        }
        int scrollTo = scrollTo(this.mHorizontalDragX, max, horizontalRange, this.mRecyclerView.computeHorizontalScrollRange(), this.mRecyclerView.computeHorizontalScrollOffset(), this.mRecyclerViewWidth);
        if (scrollTo != 0) {
            this.mRecyclerView.scrollBy(scrollTo, 0);
        }
        this.mHorizontalDragX = max;
    }

    private boolean isLayoutRTL() {
        return this.mRecyclerView.getLayoutDirection() == 1;
    }

    private void resetHideDelay(int i11) {
        cancelHide();
        this.mRecyclerView.postDelayed(this.mHideRunnable, i11);
    }

    private int scrollTo(float f11, float f12, int[] iArr, int i11, int i12, int i13) {
        int i14 = iArr[1] - iArr[0];
        if (i14 == 0) {
            return 0;
        }
        int i15 = i11 - i13;
        int i16 = (int) (((f12 - f11) / i14) * i15);
        int i17 = i12 + i16;
        if (i17 >= i15 || i17 < 0) {
            return 0;
        }
        return i16;
    }

    private void setupCallbacks() {
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this);
        this.mRecyclerView.addOnScrollListener(this.mOnScrollListener);
    }

    private void verticalScrollTo(float f11) {
        int[] verticalRange = getVerticalRange();
        float max = Math.max(verticalRange[0], Math.min(verticalRange[1], f11));
        if (Math.abs(this.mVerticalThumbCenterY - max) < 2.0f) {
            return;
        }
        int scrollTo = scrollTo(this.mVerticalDragY, max, verticalRange, this.mRecyclerView.computeVerticalScrollRange(), this.mRecyclerView.computeVerticalScrollOffset(), this.mRecyclerViewHeight);
        if (scrollTo != 0) {
            this.mRecyclerView.scrollBy(0, scrollTo);
        }
        this.mVerticalDragY = max;
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
        }
    }

    @VisibleForTesting
    public Drawable getHorizontalThumbDrawable() {
        return this.mHorizontalThumbDrawable;
    }

    @VisibleForTesting
    public Drawable getHorizontalTrackDrawable() {
        return this.mHorizontalTrackDrawable;
    }

    @VisibleForTesting
    public Drawable getVerticalThumbDrawable() {
        return this.mVerticalThumbDrawable;
    }

    @VisibleForTesting
    public Drawable getVerticalTrackDrawable() {
        return this.mVerticalTrackDrawable;
    }

    @VisibleForTesting
    public void hide(int i11) {
        int i12 = this.mAnimationState;
        if (i12 == 1) {
            this.mShowHideAnimator.cancel();
        } else if (i12 != 2) {
            return;
        }
        this.mAnimationState = 3;
        ValueAnimator valueAnimator = this.mShowHideAnimator;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.mShowHideAnimator.setDuration(i11);
        this.mShowHideAnimator.start();
    }

    public boolean isDragging() {
        return this.mState == 2;
    }

    @VisibleForTesting
    public boolean isPointInsideHorizontalThumb(float f11, float f12) {
        if (f12 < this.mRecyclerViewHeight - this.mHorizontalThumbHeight) {
            return false;
        }
        int i11 = this.mHorizontalThumbCenterX;
        int i12 = this.mHorizontalThumbWidth;
        return f11 >= ((float) (i11 - (i12 / 2))) && f11 <= ((float) (i11 + (i12 / 2)));
    }

    @VisibleForTesting
    public boolean isPointInsideVerticalThumb(float f11, float f12) {
        if (isLayoutRTL()) {
            if (f11 > this.mVerticalThumbWidth) {
                return false;
            }
        } else if (f11 < this.mRecyclerViewWidth - this.mVerticalThumbWidth) {
            return false;
        }
        int i11 = this.mVerticalThumbCenterY;
        int i12 = this.mVerticalThumbHeight;
        return f12 >= ((float) (i11 - (i12 / 2))) && f12 <= ((float) (i11 + (i12 / 2)));
    }

    @VisibleForTesting
    public boolean isVisible() {
        return this.mState == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.mRecyclerViewWidth != this.mRecyclerView.getWidth() || this.mRecyclerViewHeight != this.mRecyclerView.getHeight()) {
            this.mRecyclerViewWidth = this.mRecyclerView.getWidth();
            this.mRecyclerViewHeight = this.mRecyclerView.getHeight();
            setState(0);
        } else if (this.mAnimationState != 0) {
            if (this.mNeedVerticalScrollbar) {
                drawVerticalScrollbar(canvas);
            }
            if (this.mNeedHorizontalScrollbar) {
                drawHorizontalScrollbar(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i11 = this.mState;
        if (i11 != 1) {
            return i11 == 2;
        }
        boolean isPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
        boolean isPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!isPointInsideVerticalThumb && !isPointInsideHorizontalThumb)) {
            return false;
        }
        if (isPointInsideHorizontalThumb) {
            this.mDragState = 1;
            this.mHorizontalDragX = (int) motionEvent.getX();
        } else if (isPointInsideVerticalThumb) {
            this.mDragState = 2;
            this.mVerticalDragY = (int) motionEvent.getY();
        }
        setState(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.mState == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean isPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
            boolean isPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
            if (isPointInsideVerticalThumb || isPointInsideHorizontalThumb) {
                if (isPointInsideHorizontalThumb) {
                    this.mDragState = 1;
                    this.mHorizontalDragX = (int) motionEvent.getX();
                } else if (isPointInsideVerticalThumb) {
                    this.mDragState = 2;
                    this.mVerticalDragY = (int) motionEvent.getY();
                }
                setState(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.mState == 2) {
            this.mVerticalDragY = 0.0f;
            this.mHorizontalDragX = 0.0f;
            setState(1);
            this.mDragState = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.mState == 2) {
            show();
            if (this.mDragState == 1) {
                horizontalScrollTo(motionEvent.getX());
            }
            if (this.mDragState == 2) {
                verticalScrollTo(motionEvent.getY());
            }
        }
    }

    public void requestRedraw() {
        this.mRecyclerView.invalidate();
    }

    public void setState(int i11) {
        if (i11 == 2 && this.mState != 2) {
            this.mVerticalThumbDrawable.setState(PRESSED_STATE_SET);
            cancelHide();
        }
        if (i11 == 0) {
            requestRedraw();
        } else {
            show();
        }
        if (this.mState == 2 && i11 != 2) {
            this.mVerticalThumbDrawable.setState(EMPTY_STATE_SET);
            resetHideDelay(1200);
        } else if (i11 == 1) {
            resetHideDelay(1500);
        }
        this.mState = i11;
    }

    public void show() {
        int i11 = this.mAnimationState;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            } else {
                this.mShowHideAnimator.cancel();
            }
        }
        this.mAnimationState = 1;
        ValueAnimator valueAnimator = this.mShowHideAnimator;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.mShowHideAnimator.setDuration(500L);
        this.mShowHideAnimator.setStartDelay(0L);
        this.mShowHideAnimator.start();
    }

    public void updateScrollPosition(int i11, int i12) {
        int computeVerticalScrollRange = this.mRecyclerView.computeVerticalScrollRange();
        int i13 = this.mRecyclerViewHeight;
        this.mNeedVerticalScrollbar = computeVerticalScrollRange - i13 > 0 && i13 >= this.mScrollbarMinimumRange;
        int computeHorizontalScrollRange = this.mRecyclerView.computeHorizontalScrollRange();
        int i14 = this.mRecyclerViewWidth;
        boolean z11 = computeHorizontalScrollRange - i14 > 0 && i14 >= this.mScrollbarMinimumRange;
        this.mNeedHorizontalScrollbar = z11;
        boolean z12 = this.mNeedVerticalScrollbar;
        if (!z12 && !z11) {
            if (this.mState != 0) {
                setState(0);
                return;
            }
            return;
        }
        if (z12) {
            float f11 = i13;
            this.mVerticalThumbCenterY = (int) ((f11 * (i12 + (f11 / 2.0f))) / computeVerticalScrollRange);
            this.mVerticalThumbHeight = Math.min(i13, (i13 * i13) / computeVerticalScrollRange);
        }
        if (this.mNeedHorizontalScrollbar) {
            float f12 = i14;
            this.mHorizontalThumbCenterX = (int) ((f12 * (i11 + (f12 / 2.0f))) / computeHorizontalScrollRange);
            this.mHorizontalThumbWidth = Math.min(i14, (i14 * i14) / computeHorizontalScrollRange);
        }
        int i15 = this.mState;
        if (i15 == 0 || i15 == 1) {
            setState(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z11) {
    }
}
