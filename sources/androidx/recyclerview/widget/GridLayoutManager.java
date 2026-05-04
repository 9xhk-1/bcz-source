package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final int INVALID_POSITION = -1;
    private static final String TAG = "GridLayoutManager";
    private static final Set<Integer> sSupportedDirectionsForActionScrollInDirection = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    int[] mCachedBorders;
    int mColumnWithAccessibilityFocus;
    final Rect mDecorInsets;
    boolean mPendingSpanCountChange;
    private int mPositionTargetedByScrollInDirection;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    int mRowWithAccessibilityFocus;
    View[] mSet;
    int mSpanCount;
    SpanSizeLookup mSpanSizeLookup;
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static boolean isAccessibilityFocused(@NonNull View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanIndex(int i11, int i12) {
            return i11 % i12;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i11) {
            return 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class SpanSizeLookup {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        public static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i11) {
            int size = sparseIntArray.size() - 1;
            int i12 = 0;
            while (i12 <= size) {
                int i13 = (i12 + size) >>> 1;
                if (sparseIntArray.keyAt(i13) < i11) {
                    i12 = i13 + 1;
                } else {
                    size = i13 - 1;
                }
            }
            int i14 = i12 - 1;
            if (i14 < 0 || i14 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i14);
        }

        public int getCachedSpanGroupIndex(int i11, int i12) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i11, i12);
            }
            int i13 = this.mSpanGroupIndexCache.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int spanGroupIndex = getSpanGroupIndex(i11, i12);
            this.mSpanGroupIndexCache.put(i11, spanGroupIndex);
            return spanGroupIndex;
        }

        public int getCachedSpanIndex(int i11, int i12) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i11, i12);
            }
            int i13 = this.mSpanIndexCache.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int spanIndex = getSpanIndex(i11, i12);
            this.mSpanIndexCache.put(i11, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int findFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (findFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i11)) == -1) {
                i13 = 0;
                i14 = 0;
                i15 = 0;
            } else {
                i13 = this.mSpanGroupIndexCache.get(findFirstKeyLessThan);
                i14 = findFirstKeyLessThan + 1;
                i15 = getCachedSpanIndex(findFirstKeyLessThan, i12) + getSpanSize(findFirstKeyLessThan);
                if (i15 == i12) {
                    i13++;
                    i15 = 0;
                }
            }
            int spanSize = getSpanSize(i11);
            while (i14 < i11) {
                int spanSize2 = getSpanSize(i14);
                i15 += spanSize2;
                if (i15 == i12) {
                    i13++;
                    i15 = 0;
                } else if (i15 > i12) {
                    i13++;
                    i15 = spanSize2;
                }
                i14++;
            }
            return i15 + spanSize > i12 ? i13 + 1 : i13;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:10:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i11);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z11) {
            if (!z11) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z11;
        }

        public void setSpanIndexCacheEnabled(boolean z11) {
            if (!z11) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z11;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        this.mPositionTargetedByScrollInDirection = -1;
        this.mRowWithAccessibilityFocus = -1;
        this.mColumnWithAccessibilityFocus = -1;
        setSpanCount(RecyclerView.LayoutManager.getProperties(context, attributeSet, i11, i12).spanCount);
    }

    private void assignSpans(RecyclerView.Recycler recycler, RecyclerView.State state, int i11, boolean z11) {
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (z11) {
            i14 = 1;
            i13 = i11;
            i12 = 0;
        } else {
            i12 = i11 - 1;
            i13 = -1;
            i14 = -1;
        }
        while (i12 != i13) {
            View view = this.mSet[i12];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int spanSize = getSpanSize(recycler, state, getPosition(view));
            layoutParams.mSpanSize = spanSize;
            layoutParams.mSpanIndex = i15;
            i15 += spanSize;
            i12 += i14;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i11).getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            this.mPreLayoutSpanSizeCache.put(viewLayoutPosition, layoutParams.getSpanSize());
            this.mPreLayoutSpanIndexCache.put(viewLayoutPosition, layoutParams.getSpanIndex());
        }
    }

    private void calculateItemBorders(int i11) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i11);
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private int computeScrollOffsetWithSpanInfo(RecyclerView.State state) {
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled, true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled, true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToStart), this.mSpanCount);
                int cachedSpanGroupIndex2 = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToEnd), this.mSpanCount);
                int max = this.mShouldReverseLayout ? Math.max(0, ((this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1) - Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2)) - 1) : Math.max(0, Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2));
                if (isSmoothScrollbarEnabled) {
                    return Math.round((max * (Math.abs(this.mOrientationHelper.getDecoratedEnd(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart)) / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToEnd), this.mSpanCount) - this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToStart), this.mSpanCount)) + 1))) + (this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart)));
                }
                return max;
            }
        }
        return 0;
    }

    private int computeScrollRangeWithSpanInfo(RecyclerView.State state) {
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            ensureLayoutState();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1;
                }
                int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart);
                int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToStart), this.mSpanCount);
                return (int) ((decoratedEnd / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToEnd), this.mSpanCount) - cachedSpanGroupIndex) + 1)) * (this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1));
            }
        }
        return 0;
    }

    private void ensureAnchorIsInCorrectSpan(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i11) {
        boolean z11 = i11 == 1;
        int spanIndex = getSpanIndex(recycler, state, anchorInfo.mPosition);
        if (z11) {
            while (spanIndex > 0) {
                int i12 = anchorInfo.mPosition;
                if (i12 <= 0) {
                    return;
                }
                int i13 = i12 - 1;
                anchorInfo.mPosition = i13;
                spanIndex = getSpanIndex(recycler, state, i13);
            }
            return;
        }
        int itemCount = state.getItemCount() - 1;
        int i14 = anchorInfo.mPosition;
        while (i14 < itemCount) {
            int i15 = i14 + 1;
            int spanIndex2 = getSpanIndex(recycler, state, i15);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i14 = i15;
            spanIndex = spanIndex2;
        }
        anchorInfo.mPosition = i14;
    }

    private void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    @Nullable
    private View findChildWithAccessibilityFocus() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            Objects.requireNonNull(childAt);
            if (Api21Impl.isAccessibilityFocused(childAt)) {
                return getChildAt(i11);
            }
        }
        return null;
    }

    private int findScrollTargetPositionAbove(int i11, int i12, int i13) {
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            int rowIndex = getRowIndex(i14);
            int columnIndex = getColumnIndex(i14);
            if (rowIndex < 0 || columnIndex < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if (rowIndex < i11 && getColumnIndices(i14).contains(Integer.valueOf(i12))) {
                    this.mRowWithAccessibilityFocus = rowIndex;
                    return i14;
                }
            } else if (rowIndex < i11 && columnIndex == i12) {
                this.mRowWithAccessibilityFocus = ((Integer) Collections.max(getRowIndices(i14))).intValue();
                return i14;
            }
        }
        return -1;
    }

    private int findScrollTargetPositionBelow(int i11, int i12, int i13) {
        for (int i14 = i13 + 1; i14 < getItemCount(); i14++) {
            int rowIndex = getRowIndex(i14);
            int columnIndex = getColumnIndex(i14);
            if (rowIndex < 0 || columnIndex < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if (rowIndex > i11 && (columnIndex == i12 || getColumnIndices(i14).contains(Integer.valueOf(i12)))) {
                    this.mRowWithAccessibilityFocus = rowIndex;
                    return i14;
                }
            } else if (rowIndex > i11 && columnIndex == i12) {
                this.mRowWithAccessibilityFocus = getRowIndex(i14);
                return i14;
            }
        }
        return -1;
    }

    private int findScrollTargetPositionOnTheLeft(int i11, int i12, int i13) {
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            int rowIndex = getRowIndex(i14);
            int columnIndex = getColumnIndex(i14);
            if (rowIndex < 0 || columnIndex < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if ((rowIndex == i11 && columnIndex < i12) || rowIndex < i11) {
                    this.mRowWithAccessibilityFocus = rowIndex;
                    this.mColumnWithAccessibilityFocus = columnIndex;
                    return i14;
                }
            } else if (getRowIndices(i14).contains(Integer.valueOf(i11)) && columnIndex < i12) {
                this.mColumnWithAccessibilityFocus = columnIndex;
                return i14;
            }
        }
        return -1;
    }

    private int findScrollTargetPositionOnTheRight(int i11, int i12, int i13) {
        for (int i14 = i13 + 1; i14 < getItemCount(); i14++) {
            int rowIndex = getRowIndex(i14);
            int columnIndex = getColumnIndex(i14);
            if (rowIndex < 0 || columnIndex < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if ((rowIndex == i11 && columnIndex > i12) || rowIndex > i11) {
                    this.mRowWithAccessibilityFocus = rowIndex;
                    this.mColumnWithAccessibilityFocus = columnIndex;
                    return i14;
                }
            } else if (columnIndex > i12 && getRowIndices(i14).contains(Integer.valueOf(i11))) {
                this.mColumnWithAccessibilityFocus = columnIndex;
                return i14;
            }
        }
        return -1;
    }

    private int getColumnIndex(int i11) {
        if (this.mOrientation == 0) {
            RecyclerView recyclerView = this.mRecyclerView;
            return getSpanGroupIndex(recyclerView.mRecycler, recyclerView.mState, i11);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return getSpanIndex(recyclerView2.mRecycler, recyclerView2.mState, i11);
    }

    private Set<Integer> getColumnIndices(int i11) {
        return getRowOrColumnIndices(getColumnIndex(i11), i11);
    }

    private int getRowIndex(int i11) {
        if (this.mOrientation == 1) {
            RecyclerView recyclerView = this.mRecyclerView;
            return getSpanGroupIndex(recyclerView.mRecycler, recyclerView.mState, i11);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return getSpanIndex(recyclerView2.mRecycler, recyclerView2.mState, i11);
    }

    private Set<Integer> getRowIndices(int i11) {
        return getRowOrColumnIndices(getRowIndex(i11), i11);
    }

    private Set<Integer> getRowOrColumnIndices(int i11, int i12) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.mRecyclerView;
        int spanSize = getSpanSize(recyclerView.mRecycler, recyclerView.mState, i12);
        for (int i13 = i11; i13 < i11 + spanSize; i13++) {
            hashSet.add(Integer.valueOf(i13));
        }
        return hashSet;
    }

    private int getSpanGroupIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i11) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(i11, this.mSpanCount);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i11);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(convertPreLayoutPositionToPostLayout, this.mSpanCount);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. " + i11);
        return 0;
    }

    private int getSpanIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i11) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i11, this.mSpanCount);
        }
        int i12 = this.mPreLayoutSpanIndexCache.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i11);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getCachedSpanIndex(convertPreLayoutPositionToPostLayout, this.mSpanCount);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
        return 0;
    }

    private int getSpanSize(RecyclerView.Recycler recycler, RecyclerView.State state, int i11) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanSize(i11);
        }
        int i12 = this.mPreLayoutSpanSizeCache.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i11);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getSpanSize(convertPreLayoutPositionToPostLayout);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
        return 1;
    }

    private void guessMeasurement(float f11, int i11) {
        calculateItemBorders(Math.max(Math.round(f11 * this.mSpanCount), i11));
    }

    private boolean hasAccessibilityFocusChanged(int i11) {
        return (getRowIndices(i11).contains(Integer.valueOf(this.mRowWithAccessibilityFocus)) && getColumnIndices(i11).contains(Integer.valueOf(this.mColumnWithAccessibilityFocus))) ? false : true;
    }

    private void measureChild(View view, int i11, boolean z11) {
        int i12;
        int i13;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i14 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i15 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
        if (this.mOrientation == 1) {
            i13 = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, i11, i15, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i12 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i14, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, i11, i14, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i15, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i12 = childMeasureSpec;
            i13 = childMeasureSpec2;
        }
        measureChildWithDecorationsAndMargin(view, i13, i12, z11);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i11, int i12, boolean z11) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z11 ? shouldReMeasureChild(view, i11, i12, layoutParams) : shouldMeasureChild(view, i11, i12, layoutParams)) {
            view.measure(i11, i12);
        }
    }

    private void updateMeasurements() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        calculateItemBorders(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i11 = this.mSpanCount;
        for (int i12 = 0; i12 < this.mSpanCount && layoutState.hasMore(state) && i11 > 0; i12++) {
            int i13 = layoutState.mCurrentPosition;
            layoutPrefetchRegistry.addPosition(i13, Math.max(0, layoutState.mScrollingOffset));
            i11 -= this.mSpanSizeLookup.getSpanSize(i13);
            layoutState.mCurrentPosition += layoutState.mItemDirection;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(state) : super.computeHorizontalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(state) : super.computeHorizontalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(state) : super.computeVerticalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(state) : super.computeVerticalScrollRange(state);
    }

    public int findPositionOfFirstItemOnARowBelowForHorizontalGrid(int i11) {
        if (i11 < 0 || this.mOrientation == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i12 = 0; i12 < getItemCount(); i12++) {
            for (Integer num : getRowIndices(i12)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, Integer.valueOf(i12));
                }
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int intValue = num2.intValue();
            if (intValue > i11) {
                int intValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.mRowWithAccessibilityFocus = intValue;
                this.mColumnWithAccessibilityFocus = 0;
                return intValue2;
            }
        }
        return -1;
    }

    public int findPositionOfLastItemOnARowAboveForHorizontalGrid(int i11) {
        if (i11 < 0 || this.mOrientation == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i12 = 0; i12 < getItemCount(); i12++) {
            for (Integer num : getRowIndices(i12)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                treeMap.put(num, Integer.valueOf(i12));
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int intValue = num2.intValue();
            if (intValue < i11) {
                int intValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.mRowWithAccessibilityFocus = intValue;
                this.mColumnWithAccessibilityFocus = getColumnIndex(intValue2);
                return intValue2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z11, boolean z12) {
        int i11;
        int i12;
        int childCount = getChildCount();
        int i13 = 1;
        if (z12) {
            i12 = getChildCount() - 1;
            i11 = -1;
            i13 = -1;
        } else {
            i11 = childCount;
            i12 = 0;
        }
        int itemCount = state.getItemCount();
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (i12 != i11) {
            View childAt = getChildAt(i12);
            int position = getPosition(childAt);
            if (position >= 0 && position < itemCount && getSpanIndex(recycler, state, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i12 += i13;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return Math.min(this.mSpanCount, getItemCount());
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return Math.min(this.mSpanCount, getItemCount());
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    public int getSpaceForSpanRange(int i11, int i12) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            return iArr[i12 + i11] - iArr[i11];
        }
        int[] iArr2 = this.mCachedBorders;
        int i13 = this.mSpanCount;
        return iArr2[i13 - i11] - iArr2[(i13 - i11) - i12];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r21.mFinished = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void layoutChunk(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.RecyclerView.State r19, androidx.recyclerview.widget.LinearLayoutManager.LayoutState r20, androidx.recyclerview.widget.LinearLayoutManager.LayoutChunkResult r21) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, androidx.recyclerview.widget.LinearLayoutManager$LayoutState, androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i11) {
        super.onAnchorReady(recycler, state, anchorInfo, i11);
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            ensureAnchorIsInCorrectSpan(recycler, state, anchorInfo, i11);
        }
        ensureViewSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        if (r13 == (r2 > r4)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.Recycler r26, androidx.recyclerview.widget.RecyclerView.State r27) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(GridView.class.getName());
        RecyclerView.Adapter adapter = this.mRecyclerView.mAdapter;
        if (adapter == null || adapter.getItemCount() <= 1) {
            return;
        }
        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_IN_DIRECTION);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(recycler, state, layoutParams2.getViewLayoutPosition());
        if (this.mOrientation == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), spanGroupIndex, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(spanGroupIndex, 1, layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.isPreLayout()) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(recycler, state);
        clearPreLayoutSpanMappingCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        View findViewByPosition;
        super.onLayoutCompleted(state);
        this.mPendingSpanCountChange = false;
        int i11 = this.mPositionTargetedByScrollInDirection;
        if (i11 == -1 || (findViewByPosition = findViewByPosition(i11)) == null) {
            return;
        }
        findViewByPosition.sendAccessibilityEvent(67108864);
        this.mPositionTargetedByScrollInDirection = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean performAccessibilityAction(int i11, @Nullable Bundle bundle) {
        RecyclerView.ViewHolder childViewHolder;
        int findScrollTargetPositionOnTheLeft;
        if (i11 != AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_IN_DIRECTION.getId() || i11 == -1) {
            if (i11 != 16908343 || bundle == null) {
                return super.performAccessibilityAction(i11, bundle);
            }
            int i12 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_ROW_INT, -1);
            int i13 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_COLUMN_INT, -1);
            if (i12 != -1 && i13 != -1) {
                int itemCount = this.mRecyclerView.mAdapter.getItemCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= itemCount) {
                        i14 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.mRecyclerView;
                    int spanIndex = getSpanIndex(recyclerView.mRecycler, recyclerView.mState, i14);
                    RecyclerView recyclerView2 = this.mRecyclerView;
                    int spanGroupIndex = getSpanGroupIndex(recyclerView2.mRecycler, recyclerView2.mState, i14);
                    if (this.mOrientation == 1) {
                        if (spanIndex == i13 && spanGroupIndex == i12) {
                            break;
                        }
                        i14++;
                    } else {
                        if (spanIndex == i12 && spanGroupIndex == i13) {
                            break;
                        }
                        i14++;
                    }
                }
                if (i14 > -1) {
                    scrollToPositionWithOffset(i14, 0);
                    return true;
                }
            }
            return false;
        }
        View findChildWithAccessibilityFocus = findChildWithAccessibilityFocus();
        if (findChildWithAccessibilityFocus == null || bundle == null) {
            return false;
        }
        int i15 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!sSupportedDirectionsForActionScrollInDirection.contains(Integer.valueOf(i15)) || (childViewHolder = this.mRecyclerView.getChildViewHolder(findChildWithAccessibilityFocus)) == null) {
            return false;
        }
        int absoluteAdapterPosition = childViewHolder.getAbsoluteAdapterPosition();
        int rowIndex = getRowIndex(absoluteAdapterPosition);
        int columnIndex = getColumnIndex(absoluteAdapterPosition);
        if (rowIndex >= 0 && columnIndex >= 0) {
            if (hasAccessibilityFocusChanged(absoluteAdapterPosition)) {
                this.mRowWithAccessibilityFocus = rowIndex;
                this.mColumnWithAccessibilityFocus = columnIndex;
            }
            int i16 = this.mRowWithAccessibilityFocus;
            if (i16 == -1) {
                i16 = rowIndex;
            }
            int i17 = this.mColumnWithAccessibilityFocus;
            if (i17 != -1) {
                columnIndex = i17;
            }
            if (i15 == 17) {
                findScrollTargetPositionOnTheLeft = findScrollTargetPositionOnTheLeft(i16, columnIndex, absoluteAdapterPosition);
            } else if (i15 == 33) {
                findScrollTargetPositionOnTheLeft = findScrollTargetPositionAbove(i16, columnIndex, absoluteAdapterPosition);
            } else if (i15 == 66) {
                findScrollTargetPositionOnTheLeft = findScrollTargetPositionOnTheRight(i16, columnIndex, absoluteAdapterPosition);
            } else {
                if (i15 != 130) {
                    return false;
                }
                findScrollTargetPositionOnTheLeft = findScrollTargetPositionBelow(i16, columnIndex, absoluteAdapterPosition);
            }
            if (findScrollTargetPositionOnTheLeft == -1 && this.mOrientation == 0) {
                if (i15 == 17) {
                    findScrollTargetPositionOnTheLeft = findPositionOfLastItemOnARowAboveForHorizontalGrid(rowIndex);
                } else if (i15 == 66) {
                    findScrollTargetPositionOnTheLeft = findPositionOfFirstItemOnARowBelowForHorizontalGrid(rowIndex);
                }
            }
            if (findScrollTargetPositionOnTheLeft != -1) {
                scrollToPosition(findScrollTargetPositionOnTheLeft);
                this.mPositionTargetedByScrollInDirection = findScrollTargetPositionOnTheLeft;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i11, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i11, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i11, int i12) {
        int chooseSize;
        int chooseSize2;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i11, i12);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i12, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            chooseSize = RecyclerView.LayoutManager.chooseSize(i11, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.LayoutManager.chooseSize(i11, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i12, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setSpanCount(int i11) {
        if (i11 == this.mSpanCount) {
            return;
        }
        this.mPendingSpanCountChange = true;
        if (i11 >= 1) {
            this.mSpanCount = i11;
            this.mSpanSizeLookup.invalidateSpanIndexCache();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i11);
        }
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z11) {
        if (z11) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z11) {
        this.mUsingSpansToEstimateScrollBarDimensions = z11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }

    public static int[] calculateItemBorders(int[] iArr, int i11, int i12) {
        int i13;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i12) {
            iArr = new int[i11 + 1];
        }
        int i14 = 0;
        iArr[0] = 0;
        int i15 = i12 / i11;
        int i16 = i12 % i11;
        int i17 = 0;
        for (int i18 = 1; i18 <= i11; i18++) {
            i14 += i16;
            if (i14 <= 0 || i11 - i14 >= i16) {
                i13 = i15;
            } else {
                i13 = i15 + 1;
                i14 -= i11;
            }
            i17 += i13;
            iArr[i18] = i17;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        int mSpanIndex;
        int mSpanSize;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public int getSpanIndex() {
            return this.mSpanIndex;
        }

        public int getSpanSize() {
            return this.mSpanSize;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }
    }

    public GridLayoutManager(Context context, int i11) {
        super(context);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        this.mPositionTargetedByScrollInDirection = -1;
        this.mRowWithAccessibilityFocus = -1;
        this.mColumnWithAccessibilityFocus = -1;
        setSpanCount(i11);
    }

    public GridLayoutManager(Context context, int i11, int i12, boolean z11) {
        super(context, i12, z11);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        this.mPositionTargetedByScrollInDirection = -1;
        this.mRowWithAccessibilityFocus = -1;
        this.mColumnWithAccessibilityFocus = -1;
        setSpanCount(i11);
    }
}
