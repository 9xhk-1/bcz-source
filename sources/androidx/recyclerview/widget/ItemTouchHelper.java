package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    private static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    private static final boolean DEBUG = false;
    static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    private static final String TAG = "ItemTouchHelper";
    public static final int UP = 1;

    @NonNull
    Callback mCallback;
    private List<Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    GestureDetector mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    private ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
    private float mMaxSwipeVelocity;
    RecyclerView mRecyclerView;
    int mSelectedFlags;
    private float mSelectedStartX;
    private float mSelectedStartY;
    private int mSlop;
    private List<RecyclerView.ViewHolder> mSwapTargets;
    private float mSwipeEscapeVelocity;
    private Rect mTmpRect;
    VelocityTracker mVelocityTracker;
    final List<View> mPendingCleanup = new ArrayList();
    private final float[] mTmpPosition = new float[2];
    RecyclerView.ViewHolder mSelected = null;
    int mActivePointerId = -1;
    private int mActionState = 0;

    @VisibleForTesting
    List<RecoverAnimation> mRecoverAnimations = new ArrayList();
    final Runnable mScrollRunnable = new Runnable() { // from class: androidx.recyclerview.widget.ItemTouchHelper.1
        @Override // java.lang.Runnable
        public void run() {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.mSelected == null || !itemTouchHelper.scrollIfNecessary()) {
                return;
            }
            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
            RecyclerView.ViewHolder viewHolder = itemTouchHelper2.mSelected;
            if (viewHolder != null) {
                itemTouchHelper2.moveIfNecessary(viewHolder);
            }
            ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
            itemTouchHelper3.mRecyclerView.removeCallbacks(itemTouchHelper3.mScrollRunnable);
            ViewCompat.postOnAnimation(ItemTouchHelper.this.mRecyclerView, this);
        }
    };
    private RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback = null;
    View mOverdrawChild = null;
    int mOverdrawChildPosition = -1;
    private final RecyclerView.OnItemTouchListener mOnItemTouchListener = new RecyclerView.OnItemTouchListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.2
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            int findPointerIndex;
            RecoverAnimation findAnimation;
            ItemTouchHelper.this.mGestureDetector.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ItemTouchHelper.this.mActivePointerId = motionEvent.getPointerId(0);
                ItemTouchHelper.this.mInitialTouchX = motionEvent.getX();
                ItemTouchHelper.this.mInitialTouchY = motionEvent.getY();
                ItemTouchHelper.this.obtainVelocityTracker();
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                if (itemTouchHelper.mSelected == null && (findAnimation = itemTouchHelper.findAnimation(motionEvent)) != null) {
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.mInitialTouchX -= findAnimation.mX;
                    itemTouchHelper2.mInitialTouchY -= findAnimation.mY;
                    itemTouchHelper2.endRecoverAnimation(findAnimation.mViewHolder, true);
                    if (ItemTouchHelper.this.mPendingCleanup.remove(findAnimation.mViewHolder.itemView)) {
                        ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                        itemTouchHelper3.mCallback.clearView(itemTouchHelper3.mRecyclerView, findAnimation.mViewHolder);
                    }
                    ItemTouchHelper.this.select(findAnimation.mViewHolder, findAnimation.mActionState);
                    ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                    itemTouchHelper4.updateDxDy(motionEvent, itemTouchHelper4.mSelectedFlags, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                ItemTouchHelper itemTouchHelper5 = ItemTouchHelper.this;
                itemTouchHelper5.mActivePointerId = -1;
                itemTouchHelper5.select(null, 0);
            } else {
                int i11 = ItemTouchHelper.this.mActivePointerId;
                if (i11 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i11)) >= 0) {
                    ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = ItemTouchHelper.this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return ItemTouchHelper.this.mSelected != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z11) {
            if (z11) {
                ItemTouchHelper.this.select(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            ItemTouchHelper.this.mGestureDetector.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = ItemTouchHelper.this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.mActivePointerId == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
            if (findPointerIndex >= 0) {
                ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
            }
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            RecyclerView.ViewHolder viewHolder = itemTouchHelper.mSelected;
            if (viewHolder == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        itemTouchHelper.updateDxDy(motionEvent, itemTouchHelper.mSelectedFlags, findPointerIndex);
                        ItemTouchHelper.this.moveIfNecessary(viewHolder);
                        ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                        itemTouchHelper2.mRecyclerView.removeCallbacks(itemTouchHelper2.mScrollRunnable);
                        ItemTouchHelper.this.mScrollRunnable.run();
                        ItemTouchHelper.this.mRecyclerView.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                    if (pointerId == itemTouchHelper3.mActivePointerId) {
                        itemTouchHelper3.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                        itemTouchHelper4.updateDxDy(motionEvent, itemTouchHelper4.mSelectedFlags, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = itemTouchHelper.mVelocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            ItemTouchHelper.this.select(null, 0);
            ItemTouchHelper.this.mActivePointerId = -1;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$5, reason: invalid class name */
    public class AnonymousClass5 implements RecyclerView.ChildDrawingOrderCallback {
        public AnonymousClass5() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        public int onGetChildDrawingOrder(int i11, int i12) {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            View view = itemTouchHelper.mOverdrawChild;
            if (view != null) {
                int i13 = itemTouchHelper.mOverdrawChildPosition;
                if (i13 == -1) {
                    i13 = itemTouchHelper.mRecyclerView.indexOfChild(view);
                    ItemTouchHelper.this.mOverdrawChildPosition = i13;
                }
                if (i12 == i11 - 1) {
                    return i13;
                }
                if (i12 >= i13) {
                    return i12 + 1;
                }
            }
            return i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {
        private boolean mShouldReactToLongPress = true;

        public ItemTouchHelperGestureListener() {
        }

        public void doNotReactToLongPress() {
            this.mShouldReactToLongPress = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View findChildView;
            RecyclerView.ViewHolder childViewHolder;
            if (!this.mShouldReactToLongPress || (findChildView = ItemTouchHelper.this.findChildView(motionEvent)) == null || (childViewHolder = ItemTouchHelper.this.mRecyclerView.getChildViewHolder(findChildView)) == null) {
                return;
            }
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.mCallback.hasDragFlag(itemTouchHelper.mRecyclerView, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i11 = ItemTouchHelper.this.mActivePointerId;
                if (pointerId == i11) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.mInitialTouchX = x11;
                    itemTouchHelper2.mInitialTouchY = y11;
                    itemTouchHelper2.mDy = 0.0f;
                    itemTouchHelper2.mDx = 0.0f;
                    if (itemTouchHelper2.mCallback.isLongPressDragEnabled()) {
                        ItemTouchHelper.this.select(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class SimpleCallback extends Callback {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public SimpleCallback(int i11, int i12) {
            this.mDefaultSwipeDirs = i12;
            this.mDefaultDragDirs = i11;
        }

        public int getDragDirs(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return this.mDefaultDragDirs;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return Callback.makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
        }

        public int getSwipeDirs(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return this.mDefaultSwipeDirs;
        }

        public void setDefaultDragDirs(int i11) {
            this.mDefaultDragDirs = i11;
        }

        public void setDefaultSwipeDirs(int i11) {
            this.mDefaultSwipeDirs = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ViewDropHandler {
        void prepareForDrop(@NonNull View view, @NonNull View view2, int i11, int i12);
    }

    public ItemTouchHelper(@NonNull Callback callback) {
        this.mCallback = callback;
    }

    private int checkHorizontalSwipe(RecyclerView.ViewHolder viewHolder, int i11) {
        if ((i11 & 12) == 0) {
            return 0;
        }
        int i12 = this.mDx > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            int i13 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i13 & i11) != 0 && i12 == i13 && abs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(yVelocity)) {
                return i13;
            }
        }
        float width = this.mRecyclerView.getWidth() * this.mCallback.getSwipeThreshold(viewHolder);
        if ((i11 & i12) == 0 || Math.abs(this.mDx) <= width) {
            return 0;
        }
        return i12;
    }

    private int checkVerticalSwipe(RecyclerView.ViewHolder viewHolder, int i11) {
        if ((i11 & 3) == 0) {
            return 0;
        }
        int i12 = this.mDy > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            int i13 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i13 & i11) != 0 && i13 == i12 && abs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(xVelocity)) {
                return i13;
            }
        }
        float height = this.mRecyclerView.getHeight() * this.mCallback.getSwipeThreshold(viewHolder);
        if ((i11 & i12) == 0 || Math.abs(this.mDy) <= height) {
            return 0;
        }
        return i12;
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.removeOnChildAttachStateChangeListener(this);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(0);
            recoverAnimation.cancel();
            this.mCallback.clearView(this.mRecyclerView, recoverAnimation.mViewHolder);
        }
        this.mRecoverAnimations.clear();
        this.mOverdrawChild = null;
        this.mOverdrawChildPosition = -1;
        releaseVelocityTracker();
        stopGestureDetection();
    }

    private List<RecyclerView.ViewHolder> findSwapTargets(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List<RecyclerView.ViewHolder> list = this.mSwapTargets;
        if (list == null) {
            this.mSwapTargets = new ArrayList();
            this.mDistances = new ArrayList();
        } else {
            list.clear();
            this.mDistances.clear();
        }
        int boundingBoxMargin = this.mCallback.getBoundingBoxMargin();
        int round = Math.round(this.mSelectedStartX + this.mDx) - boundingBoxMargin;
        int round2 = Math.round(this.mSelectedStartY + this.mDy) - boundingBoxMargin;
        int i11 = boundingBoxMargin * 2;
        int width = viewHolder2.itemView.getWidth() + round + i11;
        int height = viewHolder2.itemView.getHeight() + round2 + i11;
        int i12 = (round + width) / 2;
        int i13 = (round2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = layoutManager.getChildAt(i14);
            if (childAt != viewHolder2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(childAt);
                if (this.mCallback.canDropOver(this.mRecyclerView, this.mSelected, childViewHolder)) {
                    int abs = Math.abs(i12 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int abs2 = Math.abs(i13 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i15 = (abs * abs) + (abs2 * abs2);
                    int size = this.mSwapTargets.size();
                    int i16 = 0;
                    for (int i17 = 0; i17 < size && i15 > this.mDistances.get(i17).intValue(); i17++) {
                        i16++;
                    }
                    this.mSwapTargets.add(i16, childViewHolder);
                    this.mDistances.add(i16, Integer.valueOf(i15));
                }
            }
            i14++;
            viewHolder2 = viewHolder;
        }
        return this.mSwapTargets;
    }

    private RecyclerView.ViewHolder findSwipedView(MotionEvent motionEvent) {
        View findChildView;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int i11 = this.mActivePointerId;
        if (i11 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i11);
        float x11 = motionEvent.getX(findPointerIndex) - this.mInitialTouchX;
        float y11 = motionEvent.getY(findPointerIndex) - this.mInitialTouchY;
        float abs = Math.abs(x11);
        float abs2 = Math.abs(y11);
        int i12 = this.mSlop;
        if (abs < i12 && abs2 < i12) {
            return null;
        }
        if (abs > abs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.canScrollVertically()) && (findChildView = findChildView(motionEvent)) != null) {
            return this.mRecyclerView.getChildViewHolder(findChildView);
        }
        return null;
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.mSelectedFlags & 12) != 0) {
            fArr[0] = (this.mSelectedStartX + this.mDx) - this.mSelected.itemView.getLeft();
        } else {
            fArr[0] = this.mSelected.itemView.getTranslationX();
        }
        if ((this.mSelectedFlags & 3) != 0) {
            fArr[1] = (this.mSelectedStartY + this.mDy) - this.mSelected.itemView.getTop();
        } else {
            fArr[1] = this.mSelected.itemView.getTranslationY();
        }
    }

    private static boolean hitTest(View view, float f11, float f12, float f13, float f14) {
        return f11 >= f13 && f11 <= f13 + ((float) view.getWidth()) && f12 >= f14 && f12 <= f14 + ((float) view.getHeight());
    }

    private void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setupCallbacks() {
        this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.addOnChildAttachStateChangeListener(this);
        startGestureDetection();
    }

    private void startGestureDetection() {
        this.mItemTouchHelperGestureListener = new ItemTouchHelperGestureListener();
        this.mGestureDetector = new GestureDetector(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
    }

    private void stopGestureDetection() {
        ItemTouchHelperGestureListener itemTouchHelperGestureListener = this.mItemTouchHelperGestureListener;
        if (itemTouchHelperGestureListener != null) {
            itemTouchHelperGestureListener.doNotReactToLongPress();
            this.mItemTouchHelperGestureListener = null;
        }
        if (this.mGestureDetector != null) {
            this.mGestureDetector = null;
        }
    }

    private int swipeIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (this.mActionState == 2) {
            return 0;
        }
        int movementFlags = this.mCallback.getMovementFlags(this.mRecyclerView, viewHolder);
        int convertToAbsoluteDirection = (this.mCallback.convertToAbsoluteDirection(movementFlags, this.mRecyclerView.getLayoutDirection()) & 65280) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i11 = (movementFlags & 65280) >> 8;
        if (Math.abs(this.mDx) > Math.abs(this.mDy)) {
            int checkHorizontalSwipe = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkHorizontalSwipe > 0) {
                return (i11 & checkHorizontalSwipe) == 0 ? Callback.convertToRelativeDirection(checkHorizontalSwipe, this.mRecyclerView.getLayoutDirection()) : checkHorizontalSwipe;
            }
            int checkVerticalSwipe = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkVerticalSwipe > 0) {
                return checkVerticalSwipe;
            }
        } else {
            int checkVerticalSwipe2 = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkVerticalSwipe2 > 0) {
                return checkVerticalSwipe2;
            }
            int checkHorizontalSwipe2 = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkHorizontalSwipe2 > 0) {
                return (i11 & checkHorizontalSwipe2) == 0 ? Callback.convertToRelativeDirection(checkHorizontalSwipe2, this.mRecyclerView.getLayoutDirection()) : checkHorizontalSwipe2;
            }
        }
        return 0;
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
            Resources resources = recyclerView.getResources();
            this.mSwipeEscapeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.mMaxSwipeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            setupCallbacks();
        }
    }

    public void checkSelectForSwipe(int i11, MotionEvent motionEvent, int i12) {
        RecyclerView.ViewHolder findSwipedView;
        int absoluteMovementFlags;
        if (this.mSelected != null || i11 != 2 || this.mActionState == 2 || !this.mCallback.isItemViewSwipeEnabled() || this.mRecyclerView.getScrollState() == 1 || (findSwipedView = findSwipedView(motionEvent)) == null || (absoluteMovementFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, findSwipedView) & 65280) >> 8) == 0) {
            return;
        }
        float x11 = motionEvent.getX(i12);
        float y11 = motionEvent.getY(i12);
        float f11 = x11 - this.mInitialTouchX;
        float f12 = y11 - this.mInitialTouchY;
        float abs = Math.abs(f11);
        float abs2 = Math.abs(f12);
        int i13 = this.mSlop;
        if (abs >= i13 || abs2 >= i13) {
            if (abs > abs2) {
                if (f11 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                    return;
                }
                if (f11 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                    return;
                }
            } else {
                if (f12 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                    return;
                }
                if (f12 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                    return;
                }
            }
            this.mDy = 0.0f;
            this.mDx = 0.0f;
            this.mActivePointerId = motionEvent.getPointerId(0);
            select(findSwipedView, 1);
        }
    }

    public void endRecoverAnimation(RecyclerView.ViewHolder viewHolder, boolean z11) {
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            if (recoverAnimation.mViewHolder == viewHolder) {
                recoverAnimation.mOverridden |= z11;
                if (!recoverAnimation.mEnded) {
                    recoverAnimation.cancel();
                }
                this.mRecoverAnimations.remove(size);
                return;
            }
        }
    }

    public RecoverAnimation findAnimation(MotionEvent motionEvent) {
        if (this.mRecoverAnimations.isEmpty()) {
            return null;
        }
        View findChildView = findChildView(motionEvent);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            if (recoverAnimation.mViewHolder.itemView == findChildView) {
                return recoverAnimation;
            }
        }
        return null;
    }

    public View findChildView(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (hitTest(view, x11, y11, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
                return view;
            }
        }
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            View view2 = recoverAnimation.mViewHolder.itemView;
            if (hitTest(view2, x11, y11, recoverAnimation.mX, recoverAnimation.mY)) {
                return view2;
            }
        }
        return this.mRecyclerView.findChildViewUnder(x11, y11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    public boolean hasRunningRecoverAnim() {
        int size = this.mRecoverAnimations.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!this.mRecoverAnimations.get(i11).mEnded) {
                return true;
            }
        }
        return false;
    }

    public void moveIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (!this.mRecyclerView.isLayoutRequested() && this.mActionState == 2) {
            float moveThreshold = this.mCallback.getMoveThreshold(viewHolder);
            int i11 = (int) (this.mSelectedStartX + this.mDx);
            int i12 = (int) (this.mSelectedStartY + this.mDy);
            if (Math.abs(i12 - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * moveThreshold || Math.abs(i11 - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * moveThreshold) {
                List<RecyclerView.ViewHolder> findSwapTargets = findSwapTargets(viewHolder);
                if (findSwapTargets.size() == 0) {
                    return;
                }
                RecyclerView.ViewHolder chooseDropTarget = this.mCallback.chooseDropTarget(viewHolder, findSwapTargets, i11, i12);
                if (chooseDropTarget == null) {
                    this.mSwapTargets.clear();
                    this.mDistances.clear();
                    return;
                }
                int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
                if (this.mCallback.onMove(this.mRecyclerView, viewHolder, chooseDropTarget)) {
                    this.mCallback.onMoved(this.mRecyclerView, viewHolder, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i11, i12);
                }
            }
        }
    }

    public void obtainVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.mVelocityTracker = VelocityTracker.obtain();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(@NonNull View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null && childViewHolder == viewHolder) {
            select(null, 0);
            return;
        }
        endRecoverAnimation(childViewHolder, false);
        if (this.mPendingCleanup.remove(childViewHolder.itemView)) {
            this.mCallback.clearView(this.mRecyclerView, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f11;
        float f12;
        this.mOverdrawChildPosition = -1;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f13 = fArr[0];
            f12 = fArr[1];
            f11 = f13;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        this.mCallback.onDraw(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f11, f12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        float f11;
        float f12;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f13 = fArr[0];
            f12 = fArr[1];
            f11 = f13;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        this.mCallback.onDrawOver(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f11, f12);
    }

    public void postDispatchSwipe(final RecoverAnimation recoverAnimation, final int i11) {
        this.mRecyclerView.post(new Runnable() { // from class: androidx.recyclerview.widget.ItemTouchHelper.4
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = ItemTouchHelper.this.mRecyclerView;
                if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                RecoverAnimation recoverAnimation2 = recoverAnimation;
                if (recoverAnimation2.mOverridden || recoverAnimation2.mViewHolder.getAbsoluteAdapterPosition() == -1) {
                    return;
                }
                RecyclerView.ItemAnimator itemAnimator = ItemTouchHelper.this.mRecyclerView.getItemAnimator();
                if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !ItemTouchHelper.this.hasRunningRecoverAnim()) {
                    ItemTouchHelper.this.mCallback.onSwiped(recoverAnimation.mViewHolder, i11);
                } else {
                    ItemTouchHelper.this.mRecyclerView.post(this);
                }
            }
        });
    }

    public void removeChildDrawingOrderCallbackIfNecessary(View view) {
        if (view == this.mOverdrawChild) {
            this.mOverdrawChild = null;
            if (this.mChildDrawingOrderCallback != null) {
                this.mRecyclerView.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (r6 < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r6 > 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean scrollIfNecessary() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.scrollIfNecessary():boolean");
    }

    public void select(@Nullable RecyclerView.ViewHolder viewHolder, int i11) {
        boolean z11;
        float f11;
        float signum;
        if (viewHolder == this.mSelected && i11 == this.mActionState) {
            return;
        }
        this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
        int i12 = this.mActionState;
        endRecoverAnimation(viewHolder, true);
        this.mActionState = i11;
        if (i11 == 2) {
            if (viewHolder == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.mOverdrawChild = viewHolder.itemView;
            addChildDrawingOrderCallback();
        }
        int i13 = (1 << ((i11 * 8) + 8)) - 1;
        final RecyclerView.ViewHolder viewHolder2 = this.mSelected;
        boolean z12 = false;
        if (viewHolder2 != null) {
            if (viewHolder2.itemView.getParent() != null) {
                final int swipeIfNecessary = i12 == 2 ? 0 : swipeIfNecessary(viewHolder2);
                releaseVelocityTracker();
                int i14 = 4;
                if (swipeIfNecessary == 1 || swipeIfNecessary == 2) {
                    f11 = 0.0f;
                    signum = Math.signum(this.mDy) * this.mRecyclerView.getHeight();
                } else if (swipeIfNecessary == 4 || swipeIfNecessary == 8 || swipeIfNecessary == 16 || swipeIfNecessary == 32) {
                    signum = 0.0f;
                    f11 = Math.signum(this.mDx) * this.mRecyclerView.getWidth();
                } else {
                    f11 = 0.0f;
                    signum = 0.0f;
                }
                if (i12 == 2) {
                    i14 = 8;
                } else if (swipeIfNecessary > 0) {
                    i14 = 2;
                }
                getSelectedDxDy(this.mTmpPosition);
                float[] fArr = this.mTmpPosition;
                float f12 = fArr[0];
                float f13 = fArr[1];
                z11 = false;
                RecoverAnimation recoverAnimation = new RecoverAnimation(viewHolder2, i14, i12, f12, f13, f11, signum) { // from class: androidx.recyclerview.widget.ItemTouchHelper.3
                    @Override // androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (this.mOverridden) {
                            return;
                        }
                        if (swipeIfNecessary <= 0) {
                            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                            itemTouchHelper.mCallback.clearView(itemTouchHelper.mRecyclerView, viewHolder2);
                        } else {
                            ItemTouchHelper.this.mPendingCleanup.add(viewHolder2.itemView);
                            this.mIsPendingCleanup = true;
                            int i15 = swipeIfNecessary;
                            if (i15 > 0) {
                                ItemTouchHelper.this.postDispatchSwipe(this, i15);
                            }
                        }
                        ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                        View view = itemTouchHelper2.mOverdrawChild;
                        View view2 = viewHolder2.itemView;
                        if (view == view2) {
                            itemTouchHelper2.removeChildDrawingOrderCallbackIfNecessary(view2);
                        }
                    }
                };
                recoverAnimation.setDuration(this.mCallback.getAnimationDuration(this.mRecyclerView, i14, f11 - f12, signum - f13));
                this.mRecoverAnimations.add(recoverAnimation);
                recoverAnimation.start();
                z12 = true;
            } else {
                z11 = false;
                removeChildDrawingOrderCallbackIfNecessary(viewHolder2.itemView);
                this.mCallback.clearView(this.mRecyclerView, viewHolder2);
                z12 = false;
            }
            this.mSelected = null;
        } else {
            z11 = false;
        }
        if (viewHolder != null) {
            this.mSelectedFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, viewHolder) & i13) >> (this.mActionState * 8);
            this.mSelectedStartX = viewHolder.itemView.getLeft();
            this.mSelectedStartY = viewHolder.itemView.getTop();
            this.mSelected = viewHolder;
            if (i11 == 2) {
                viewHolder.itemView.performHapticFeedback(z11 ? 1 : 0);
            }
        }
        ViewParent parent = this.mRecyclerView.getParent();
        if (parent != null) {
            if (this.mSelected != null) {
                z11 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z11);
        }
        if (!z12) {
            this.mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.mCallback.onSelectedChanged(this.mSelected, this.mActionState);
        this.mRecyclerView.invalidate();
    }

    public void startDrag(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (!this.mCallback.hasDragFlag(this.mRecyclerView, viewHolder)) {
            Log.e(TAG, "Start drag has been called but dragging is not enabled");
            return;
        }
        if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e(TAG, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        obtainVelocityTracker();
        this.mDy = 0.0f;
        this.mDx = 0.0f;
        select(viewHolder, 2);
    }

    public void startSwipe(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (!this.mCallback.hasSwipeFlag(this.mRecyclerView, viewHolder)) {
            Log.e(TAG, "Start swipe has been called but swiping is not enabled");
            return;
        }
        if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e(TAG, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        obtainVelocityTracker();
        this.mDy = 0.0f;
        this.mDx = 0.0f;
        select(viewHolder, 1);
    }

    public void updateDxDy(MotionEvent motionEvent, int i11, int i12) {
        float x11 = motionEvent.getX(i12);
        float y11 = motionEvent.getY(i12);
        float f11 = x11 - this.mInitialTouchX;
        this.mDx = f11;
        this.mDy = y11 - this.mInitialTouchY;
        if ((i11 & 4) == 0) {
            this.mDx = Math.max(0.0f, f11);
        }
        if ((i11 & 8) == 0) {
            this.mDx = Math.min(0.0f, this.mDx);
        }
        if ((i11 & 1) == 0) {
            this.mDy = Math.max(0.0f, this.mDy);
        }
        if ((i11 & 2) == 0) {
            this.mDy = Math.min(0.0f, this.mDy);
        }
    }

    private void addChildDrawingOrderCallback() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Callback {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new Interpolator() { // from class: androidx.recyclerview.widget.ItemTouchHelper.Callback.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f11) {
                return f11 * f11 * f11 * f11 * f11;
            }
        };
        private static final Interpolator sDragViewScrollCapInterpolator = new Interpolator() { // from class: androidx.recyclerview.widget.ItemTouchHelper.Callback.2
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f11) {
                float f12 = f11 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
            }
        };
        private int mCachedMaxScrollSpeed = -1;

        public static int convertToRelativeDirection(int i11, int i12) {
            int i13;
            int i14 = i11 & ABS_HORIZONTAL_DIR_FLAGS;
            if (i14 == 0) {
                return i11;
            }
            int i15 = i11 & (~i14);
            if (i12 == 0) {
                i13 = i14 << 2;
            } else {
                int i16 = i14 << 1;
                i15 |= (-789517) & i16;
                i13 = (i16 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i15 | i13;
        }

        @NonNull
        public static ItemTouchUIUtil getDefaultUIUtil() {
            return ItemTouchUIUtilImpl.INSTANCE;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i11, int i12) {
            return i12 << (i11 * 8);
        }

        public static int makeMovementFlags(int i11, int i12) {
            return makeFlag(2, i11) | makeFlag(1, i12) | makeFlag(0, i12 | i11);
        }

        public boolean canDropOver(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.ViewHolder chooseDropTarget(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<RecyclerView.ViewHolder> list, int i11, int i12) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = viewHolder.itemView.getWidth() + i11;
            int height = i12 + viewHolder.itemView.getHeight();
            int left2 = i11 - viewHolder.itemView.getLeft();
            int top2 = i12 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i13 = -1;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i14);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (abs4 = Math.abs(right)) > i13) {
                    viewHolder2 = viewHolder3;
                    i13 = abs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i11) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (abs3 = Math.abs(left)) > i13) {
                    viewHolder2 = viewHolder3;
                    i13 = abs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i12) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (abs2 = Math.abs(top)) > i13) {
                    viewHolder2 = viewHolder3;
                    i13 = abs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (abs = Math.abs(bottom)) > i13) {
                    viewHolder2 = viewHolder3;
                    i13 = abs;
                }
            }
            return viewHolder2;
        }

        public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            ItemTouchUIUtilImpl.INSTANCE.clearView(viewHolder.itemView);
        }

        public int convertToAbsoluteDirection(int i11, int i12) {
            int i13;
            int i14 = i11 & RELATIVE_DIR_FLAGS;
            if (i14 == 0) {
                return i11;
            }
            int i15 = i11 & (~i14);
            if (i12 == 0) {
                i13 = i14 >> 2;
            } else {
                int i16 = i14 >> 1;
                i15 |= (-3158065) & i16;
                i13 = (i16 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i15 | i13;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), recyclerView.getLayoutDirection());
        }

        public long getAnimationDuration(@NonNull RecyclerView recyclerView, int i11, float f11, float f12) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i11 == 8 ? 200L : 250L : i11 == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder);

        public float getSwipeThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 16711680) != 0;
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 65280) != 0;
        }

        public int interpolateOutOfBoundsScroll(@NonNull RecyclerView recyclerView, int i11, int i12, int i13, long j11) {
            int signum = (int) (((int) (((int) Math.signum(i12)) * getMaxDragScroll(recyclerView) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i12) * 1.0f) / i11)))) * sDragScrollInterpolator.getInterpolation(j11 <= 2000 ? j11 / 2000.0f : 1.0f));
            return signum == 0 ? i12 > 0 ? 1 : -1 : signum;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float f11, float f12, int i11, boolean z11) {
            ItemTouchUIUtilImpl.INSTANCE.onDraw(canvas, recyclerView, viewHolder.itemView, f11, f12, i11, z11);
        }

        public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.ViewHolder viewHolder, float f11, float f12, int i11, boolean z11) {
            ItemTouchUIUtilImpl.INSTANCE.onDrawOver(canvas, recyclerView, viewHolder.itemView, f11, f12, i11, z11);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<RecoverAnimation> list, int i11, float f11, float f12) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                RecoverAnimation recoverAnimation = list.get(i12);
                recoverAnimation.update();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, viewHolder, f11, f12, i11, true);
                canvas.restoreToCount(save2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<RecoverAnimation> list, int i11, float f11, float f12) {
            int size = list.size();
            boolean z11 = false;
            for (int i12 = 0; i12 < size; i12++) {
                RecoverAnimation recoverAnimation = list.get(i12);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f11, f12, i11, true);
                canvas.restoreToCount(save2);
            }
            for (int i13 = size - 1; i13 >= 0; i13--) {
                RecoverAnimation recoverAnimation2 = list.get(i13);
                boolean z12 = recoverAnimation2.mEnded;
                if (z12 && !recoverAnimation2.mIsPendingCleanup) {
                    list.remove(i13);
                } else if (!z12) {
                    z11 = true;
                }
            }
            if (z11) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, int i11, @NonNull RecyclerView.ViewHolder viewHolder2, int i12, int i13, int i14) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ViewDropHandler) {
                ((ViewDropHandler) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i13, i14);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i12);
                }
                if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i12);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i12);
                }
                if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i12);
                }
            }
        }

        public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int i11) {
            if (viewHolder != null) {
                ItemTouchUIUtilImpl.INSTANCE.onSelected(viewHolder.itemView);
            }
        }

        public abstract void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i11);

        public float getSwipeEscapeVelocity(float f11) {
            return f11;
        }

        public float getSwipeVelocityThreshold(float f11) {
            return f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class RecoverAnimation implements Animator.AnimatorListener {
        final int mActionState;
        final int mAnimationType;
        private float mFraction;
        boolean mIsPendingCleanup;
        final float mStartDx;
        final float mStartDy;
        final float mTargetX;
        final float mTargetY;

        @VisibleForTesting
        final ValueAnimator mValueAnimator;
        final RecyclerView.ViewHolder mViewHolder;
        float mX;
        float mY;
        boolean mOverridden = false;
        boolean mEnded = false;

        public RecoverAnimation(RecyclerView.ViewHolder viewHolder, int i11, int i12, float f11, float f12, float f13, float f14) {
            this.mActionState = i12;
            this.mAnimationType = i11;
            this.mViewHolder = viewHolder;
            this.mStartDx = f11;
            this.mStartDy = f12;
            this.mTargetX = f13;
            this.mTargetY = f14;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.mValueAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RecoverAnimation.this.setFraction(valueAnimator.getAnimatedFraction());
                }
            });
            ofFloat.setTarget(viewHolder.itemView);
            ofFloat.addListener(this);
            setFraction(0.0f);
        }

        public void cancel() {
            this.mValueAnimator.cancel();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            setFraction(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.mEnded) {
                this.mViewHolder.setIsRecyclable(true);
            }
            this.mEnded = true;
        }

        public void setDuration(long j11) {
            this.mValueAnimator.setDuration(j11);
        }

        public void setFraction(float f11) {
            this.mFraction = f11;
        }

        public void start() {
            this.mViewHolder.setIsRecyclable(false);
            this.mValueAnimator.start();
        }

        public void update() {
            float f11 = this.mStartDx;
            float f12 = this.mTargetX;
            if (f11 == f12) {
                this.mX = this.mViewHolder.itemView.getTranslationX();
            } else {
                this.mX = f11 + (this.mFraction * (f12 - f11));
            }
            float f13 = this.mStartDy;
            float f14 = this.mTargetY;
            if (f13 == f14) {
                this.mY = this.mViewHolder.itemView.getTranslationY();
            } else {
                this.mY = f13 + (this.mFraction * (f14 - f13));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(@NonNull View view) {
    }
}
