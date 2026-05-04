package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.annotation.Nullable;
import androidx.core.os.TraceCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
final class GapWorker implements Runnable {
    static final ThreadLocal<GapWorker> sGapWorker = new ThreadLocal<>();
    static Comparator<Task> sTaskComparator = new Comparator<Task>() { // from class: androidx.recyclerview.widget.GapWorker.1
        @Override // java.util.Comparator
        public int compare(Task task, Task task2) {
            RecyclerView recyclerView = task.view;
            if ((recyclerView == null) != (task2.view == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z11 = task.neededNextFrame;
            if (z11 != task2.neededNextFrame) {
                return z11 ? -1 : 1;
            }
            int i11 = task2.viewVelocity - task.viewVelocity;
            if (i11 != 0) {
                return i11;
            }
            int i12 = task.distanceToItem - task2.distanceToItem;
            if (i12 != 0) {
                return i12;
            }
            return 0;
        }
    };
    long mFrameIntervalNs;
    long mPostTimeNs;
    ArrayList<RecyclerView> mRecyclerViews = new ArrayList<>();
    private final ArrayList<Task> mTasks = new ArrayList<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @SuppressLint({"VisibleForTests"})
    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {
        int mCount;
        int[] mPrefetchArray;
        int mPrefetchDx;
        int mPrefetchDy;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public void addPosition(int i11, int i12) {
            if (i11 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i12 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i13 = this.mCount;
            int i14 = i13 * 2;
            int[] iArr = this.mPrefetchArray;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.mPrefetchArray = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i14 >= iArr.length) {
                int[] iArr3 = new int[i13 * 4];
                this.mPrefetchArray = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.mPrefetchArray;
            iArr4[i14] = i11;
            iArr4[i14 + 1] = i12;
            this.mCount++;
        }

        public void clearPrefetchPositions() {
            int[] iArr = this.mPrefetchArray;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.mCount = 0;
        }

        public void collectPrefetchPositionsFromView(RecyclerView recyclerView, boolean z11) {
            this.mCount = 0;
            int[] iArr = this.mPrefetchArray;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
                return;
            }
            if (z11) {
                if (!recyclerView.mAdapterHelper.hasPendingUpdates()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.mPrefetchDx, this.mPrefetchDy, recyclerView.mState, this);
            }
            int i11 = this.mCount;
            if (i11 > layoutManager.mPrefetchMaxCountObserved) {
                layoutManager.mPrefetchMaxCountObserved = i11;
                layoutManager.mPrefetchMaxObservedInInitialPrefetch = z11;
                recyclerView.mRecycler.updateViewCacheSize();
            }
        }

        public boolean lastPrefetchIncludedPosition(int i11) {
            if (this.mPrefetchArray != null) {
                int i12 = this.mCount * 2;
                for (int i13 = 0; i13 < i12; i13 += 2) {
                    if (this.mPrefetchArray[i13] == i11) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void setPrefetchVector(int i11, int i12) {
            this.mPrefetchDx = i11;
            this.mPrefetchDy = i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Task {
        public int distanceToItem;
        public boolean neededNextFrame;
        public int position;
        public RecyclerView view;
        public int viewVelocity;

        public void clear() {
            this.neededNextFrame = false;
            this.viewVelocity = 0;
            this.distanceToItem = 0;
            this.view = null;
            this.position = 0;
        }
    }

    private void buildTaskList() {
        Task task;
        int size = this.mRecyclerViews.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView = this.mRecyclerViews.get(i12);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.collectPrefetchPositionsFromView(recyclerView, false);
                i11 += recyclerView.mPrefetchRegistry.mCount;
            }
        }
        this.mTasks.ensureCapacity(i11);
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView recyclerView2 = this.mRecyclerViews.get(i14);
            if (recyclerView2.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(layoutPrefetchRegistryImpl.mPrefetchDx) + Math.abs(layoutPrefetchRegistryImpl.mPrefetchDy);
                for (int i15 = 0; i15 < layoutPrefetchRegistryImpl.mCount * 2; i15 += 2) {
                    if (i13 >= this.mTasks.size()) {
                        task = new Task();
                        this.mTasks.add(task);
                    } else {
                        task = this.mTasks.get(i13);
                    }
                    int[] iArr = layoutPrefetchRegistryImpl.mPrefetchArray;
                    int i16 = iArr[i15 + 1];
                    task.neededNextFrame = i16 <= abs;
                    task.viewVelocity = abs;
                    task.distanceToItem = i16;
                    task.view = recyclerView2;
                    task.position = iArr[i15];
                    i13++;
                }
            }
        }
        Collections.sort(this.mTasks, sTaskComparator);
    }

    private void flushTaskWithDeadline(Task task, long j11) {
        RecyclerView.ViewHolder prefetchPositionWithDeadline = prefetchPositionWithDeadline(task.view, task.position, task.neededNextFrame ? Long.MAX_VALUE : j11);
        if (prefetchPositionWithDeadline == null || prefetchPositionWithDeadline.mNestedRecyclerView == null || !prefetchPositionWithDeadline.isBound() || prefetchPositionWithDeadline.isInvalid()) {
            return;
        }
        prefetchInnerRecyclerViewWithDeadline(prefetchPositionWithDeadline.mNestedRecyclerView.get(), j11);
    }

    private void flushTasksWithDeadline(long j11) {
        for (int i11 = 0; i11 < this.mTasks.size(); i11++) {
            Task task = this.mTasks.get(i11);
            if (task.view == null) {
                return;
            }
            flushTaskWithDeadline(task, j11);
            task.clear();
        }
    }

    public static boolean isPrefetchPositionAttached(RecyclerView recyclerView, int i11) {
        int unfilteredChildCount = recyclerView.mChildHelper.getUnfilteredChildCount();
        for (int i12 = 0; i12 < unfilteredChildCount; i12++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getUnfilteredChildAt(i12));
            if (childViewHolderInt.mPosition == i11 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void prefetchInnerRecyclerViewWithDeadline(@Nullable RecyclerView recyclerView, long j11) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.getUnfilteredChildCount() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
        layoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(recyclerView, true);
        if (layoutPrefetchRegistryImpl.mCount != 0) {
            try {
                Trace.beginSection(j11 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                recyclerView.mState.prepareForNestedPrefetch(recyclerView.mAdapter);
                for (int i11 = 0; i11 < layoutPrefetchRegistryImpl.mCount * 2; i11 += 2) {
                    prefetchPositionWithDeadline(recyclerView, layoutPrefetchRegistryImpl.mPrefetchArray[i11], j11);
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    private RecyclerView.ViewHolder prefetchPositionWithDeadline(RecyclerView recyclerView, int i11, long j11) {
        if (isPrefetchPositionAttached(recyclerView, i11)) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        if (j11 == Long.MAX_VALUE) {
            try {
                if (TraceCompat.isEnabled()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th2) {
                recyclerView.onExitLayoutOrScroll(false);
                Trace.endSection();
                throw th2;
            }
        }
        recyclerView.onEnterLayoutOrScroll();
        RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline = recycler.tryGetViewHolderForPositionByDeadline(i11, false, j11);
        if (tryGetViewHolderForPositionByDeadline != null) {
            if (!tryGetViewHolderForPositionByDeadline.isBound() || tryGetViewHolderForPositionByDeadline.isInvalid()) {
                recycler.addViewHolderToRecycledViewPool(tryGetViewHolderForPositionByDeadline, false);
            } else {
                recycler.recycleView(tryGetViewHolderForPositionByDeadline.itemView);
            }
        }
        recyclerView.onExitLayoutOrScroll(false);
        Trace.endSection();
        return tryGetViewHolderForPositionByDeadline;
    }

    public void add(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.mRecyclerViews.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.mRecyclerViews.add(recyclerView);
    }

    public void postFromTraversal(RecyclerView recyclerView, int i11, int i12) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.mRecyclerViews.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.mPostTimeNs == 0) {
                this.mPostTimeNs = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.setPrefetchVector(i11, i12);
    }

    public void prefetch(long j11) {
        buildTaskList();
        flushTasksWithDeadline(j11);
    }

    public void remove(RecyclerView recyclerView) {
        boolean remove = this.mRecyclerViews.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.mRecyclerViews.isEmpty()) {
                int size = this.mRecyclerViews.size();
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = this.mRecyclerViews.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j11 = Math.max(recyclerView.getDrawingTime(), j11);
                    }
                }
                if (j11 != 0) {
                    prefetch(TimeUnit.MILLISECONDS.toNanos(j11) + this.mFrameIntervalNs);
                }
            }
        } finally {
            this.mPostTimeNs = 0L;
            Trace.endSection();
        }
    }
}
