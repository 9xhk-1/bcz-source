package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class ChildHelper {
    private static final boolean DEBUG = false;
    private static final int REMOVE_STATUS_IN_REMOVE = 1;
    private static final int REMOVE_STATUS_IN_REMOVE_IF_HIDDEN = 2;
    private static final int REMOVE_STATUS_NONE = 0;
    private static final String TAG = "ChildrenHelper";
    final Callback mCallback;
    private View mViewInRemoveView;
    private int mRemoveStatus = 0;
    final Bucket mBucket = new Bucket();
    final List<View> mHiddenViews = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Bucket {
        static final int BITS_PER_WORD = 64;
        static final long LAST_BIT = Long.MIN_VALUE;
        long mData = 0;
        Bucket mNext;

        private void ensureNext() {
            if (this.mNext == null) {
                this.mNext = new Bucket();
            }
        }

        public void clear(int i11) {
            if (i11 < 64) {
                this.mData &= ~(1 << i11);
                return;
            }
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.clear(i11 - 64);
            }
        }

        public int countOnesBefore(int i11) {
            Bucket bucket = this.mNext;
            return bucket == null ? i11 >= 64 ? Long.bitCount(this.mData) : Long.bitCount(this.mData & ((1 << i11) - 1)) : i11 < 64 ? Long.bitCount(this.mData & ((1 << i11) - 1)) : bucket.countOnesBefore(i11 - 64) + Long.bitCount(this.mData);
        }

        public boolean get(int i11) {
            if (i11 < 64) {
                return (this.mData & (1 << i11)) != 0;
            }
            ensureNext();
            return this.mNext.get(i11 - 64);
        }

        public void insert(int i11, boolean z11) {
            if (i11 >= 64) {
                ensureNext();
                this.mNext.insert(i11 - 64, z11);
                return;
            }
            long j11 = this.mData;
            boolean z12 = (Long.MIN_VALUE & j11) != 0;
            long j12 = (1 << i11) - 1;
            this.mData = ((j11 & (~j12)) << 1) | (j11 & j12);
            if (z11) {
                set(i11);
            } else {
                clear(i11);
            }
            if (z12 || this.mNext != null) {
                ensureNext();
                this.mNext.insert(0, z12);
            }
        }

        public boolean remove(int i11) {
            if (i11 >= 64) {
                ensureNext();
                return this.mNext.remove(i11 - 64);
            }
            long j11 = 1 << i11;
            long j12 = this.mData;
            boolean z11 = (j12 & j11) != 0;
            long j13 = j12 & (~j11);
            this.mData = j13;
            long j14 = j11 - 1;
            this.mData = (j13 & j14) | Long.rotateRight((~j14) & j13, 1);
            Bucket bucket = this.mNext;
            if (bucket != null) {
                if (bucket.get(0)) {
                    set(63);
                }
                this.mNext.remove(0);
            }
            return z11;
        }

        public void reset() {
            this.mData = 0L;
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.reset();
            }
        }

        public void set(int i11) {
            if (i11 < 64) {
                this.mData |= 1 << i11;
            } else {
                ensureNext();
                this.mNext.set(i11 - 64);
            }
        }

        public String toString() {
            if (this.mNext == null) {
                return Long.toBinaryString(this.mData);
            }
            return this.mNext.toString() + "xx" + Long.toBinaryString(this.mData);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Callback {
        void addView(View view, int i11);

        void attachViewToParent(View view, int i11, ViewGroup.LayoutParams layoutParams);

        void detachViewFromParent(int i11);

        View getChildAt(int i11);

        int getChildCount();

        RecyclerView.ViewHolder getChildViewHolder(View view);

        int indexOfChild(View view);

        void onEnteredHiddenState(View view);

        void onLeftHiddenState(View view);

        void removeAllViews();

        void removeViewAt(int i11);
    }

    public ChildHelper(Callback callback) {
        this.mCallback = callback;
    }

    private int getOffset(int i11) {
        if (i11 < 0) {
            return -1;
        }
        int childCount = this.mCallback.getChildCount();
        int i12 = i11;
        while (i12 < childCount) {
            int countOnesBefore = i11 - (i12 - this.mBucket.countOnesBefore(i12));
            if (countOnesBefore == 0) {
                while (this.mBucket.get(i12)) {
                    i12++;
                }
                return i12;
            }
            i12 += countOnesBefore;
        }
        return -1;
    }

    private void hideViewInternal(View view) {
        this.mHiddenViews.add(view);
        this.mCallback.onEnteredHiddenState(view);
    }

    private boolean unhideViewInternal(View view) {
        if (!this.mHiddenViews.remove(view)) {
            return false;
        }
        this.mCallback.onLeftHiddenState(view);
        return true;
    }

    public void addView(View view, boolean z11) {
        addView(view, -1, z11);
    }

    public void attachViewToParent(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        int childCount = i11 < 0 ? this.mCallback.getChildCount() : getOffset(i11);
        this.mBucket.insert(childCount, z11);
        if (z11) {
            hideViewInternal(view);
        }
        this.mCallback.attachViewToParent(view, childCount, layoutParams);
    }

    public void detachViewFromParent(int i11) {
        int offset = getOffset(i11);
        this.mBucket.remove(offset);
        this.mCallback.detachViewFromParent(offset);
    }

    public View findHiddenNonRemovedView(int i11) {
        int size = this.mHiddenViews.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.mHiddenViews.get(i12);
            RecyclerView.ViewHolder childViewHolder = this.mCallback.getChildViewHolder(view);
            if (childViewHolder.getLayoutPosition() == i11 && !childViewHolder.isInvalid() && !childViewHolder.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View getChildAt(int i11) {
        return this.mCallback.getChildAt(getOffset(i11));
    }

    public int getChildCount() {
        return this.mCallback.getChildCount() - this.mHiddenViews.size();
    }

    public View getUnfilteredChildAt(int i11) {
        return this.mCallback.getChildAt(i11);
    }

    public int getUnfilteredChildCount() {
        return this.mCallback.getChildCount();
    }

    public void hide(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild >= 0) {
            this.mBucket.set(indexOfChild);
            hideViewInternal(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public int indexOfChild(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild == -1 || this.mBucket.get(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.mBucket.countOnesBefore(indexOfChild);
    }

    public boolean isHidden(View view) {
        return this.mHiddenViews.contains(view);
    }

    public void removeAllViewsUnfiltered() {
        this.mBucket.reset();
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            this.mCallback.onLeftHiddenState(this.mHiddenViews.get(size));
            this.mHiddenViews.remove(size);
        }
        this.mCallback.removeAllViews();
    }

    public void removeView(View view) {
        int i11 = this.mRemoveStatus;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.mRemoveStatus = 1;
            this.mViewInRemoveView = view;
            int indexOfChild = this.mCallback.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (this.mBucket.remove(indexOfChild)) {
                    unhideViewInternal(view);
                }
                this.mCallback.removeViewAt(indexOfChild);
            }
            this.mRemoveStatus = 0;
            this.mViewInRemoveView = null;
        } catch (Throwable th2) {
            this.mRemoveStatus = 0;
            this.mViewInRemoveView = null;
            throw th2;
        }
    }

    public void removeViewAt(int i11) {
        int i12 = this.mRemoveStatus;
        if (i12 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i12 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int offset = getOffset(i11);
            View childAt = this.mCallback.getChildAt(offset);
            if (childAt != null) {
                this.mRemoveStatus = 1;
                this.mViewInRemoveView = childAt;
                if (this.mBucket.remove(offset)) {
                    unhideViewInternal(childAt);
                }
                this.mCallback.removeViewAt(offset);
            }
            this.mRemoveStatus = 0;
            this.mViewInRemoveView = null;
        } catch (Throwable th2) {
            this.mRemoveStatus = 0;
            this.mViewInRemoveView = null;
            throw th2;
        }
    }

    public boolean removeViewIfHidden(View view) {
        int i11 = this.mRemoveStatus;
        if (i11 == 1) {
            if (this.mViewInRemoveView == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.mRemoveStatus = 2;
            int indexOfChild = this.mCallback.indexOfChild(view);
            if (indexOfChild == -1) {
                unhideViewInternal(view);
                return true;
            }
            if (!this.mBucket.get(indexOfChild)) {
                return false;
            }
            this.mBucket.remove(indexOfChild);
            unhideViewInternal(view);
            this.mCallback.removeViewAt(indexOfChild);
            return true;
        } finally {
            this.mRemoveStatus = 0;
        }
    }

    public String toString() {
        return this.mBucket.toString() + ", hidden list:" + this.mHiddenViews.size();
    }

    public void unhide(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.mBucket.get(indexOfChild)) {
            this.mBucket.clear(indexOfChild);
            unhideViewInternal(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public void addView(View view, int i11, boolean z11) {
        int childCount = i11 < 0 ? this.mCallback.getChildCount() : getOffset(i11);
        this.mBucket.insert(childCount, z11);
        if (z11) {
            hideViewInternal(view);
        }
        this.mCallback.addView(view, childCount);
    }
}
