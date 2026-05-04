package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class AsyncListUtil<T> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncListUtil";
    boolean mAllowScrollHints;
    private final ThreadUtil.BackgroundCallback<T> mBackgroundCallback;
    final ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
    final DataCallback<T> mDataCallback;
    private final ThreadUtil.MainThreadCallback<T> mMainThreadCallback;
    final ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
    final Class<T> mTClass;
    final TileList<T> mTileList;
    final int mTileSize;
    final ViewCallback mViewCallback;
    final int[] mTmpRange = new int[2];
    final int[] mPrevRange = new int[2];
    final int[] mTmpRangeExtended = new int[2];
    private int mScrollHint = 0;
    int mItemCount = 0;
    int mDisplayedGeneration = 0;
    int mRequestedGeneration = 0;
    final SparseIntArray mMissingPositions = new SparseIntArray();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        @UiThread
        public void extendRangeInto(@NonNull int[] iArr, @NonNull int[] iArr2, int i11) {
            int i12 = iArr[1];
            int i13 = iArr[0];
            int i14 = (i12 - i13) + 1;
            int i15 = i14 / 2;
            iArr2[0] = i13 - (i11 == 1 ? i14 : i15);
            if (i11 != 2) {
                i14 = i15;
            }
            iArr2[1] = i12 + i14;
        }

        @UiThread
        public abstract void getItemRangeInto(@NonNull int[] iArr);

        @UiThread
        public abstract void onDataRefresh();

        @UiThread
        public abstract void onItemLoaded(int i11);
    }

    public AsyncListUtil(@NonNull Class<T> cls, int i11, @NonNull DataCallback<T> dataCallback, @NonNull ViewCallback viewCallback) {
        ThreadUtil.MainThreadCallback<T> mainThreadCallback = new ThreadUtil.MainThreadCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.1
            private boolean isRequestedGeneration(int i12) {
                return i12 == AsyncListUtil.this.mRequestedGeneration;
            }

            private void recycleAllTiles() {
                for (int i12 = 0; i12 < AsyncListUtil.this.mTileList.size(); i12++) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mBackgroundProxy.recycleTile(asyncListUtil.mTileList.getAtIndex(i12));
                }
                AsyncListUtil.this.mTileList.clear();
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void addTile(int i12, TileList.Tile<T> tile) {
                if (!isRequestedGeneration(i12)) {
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(tile);
                    return;
                }
                TileList.Tile<T> addOrReplace = AsyncListUtil.this.mTileList.addOrReplace(tile);
                if (addOrReplace != null) {
                    Log.e(AsyncListUtil.TAG, "duplicate tile @" + addOrReplace.mStartPosition);
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(addOrReplace);
                }
                int i13 = tile.mStartPosition + tile.mItemCount;
                int i14 = 0;
                while (i14 < AsyncListUtil.this.mMissingPositions.size()) {
                    int keyAt = AsyncListUtil.this.mMissingPositions.keyAt(i14);
                    if (tile.mStartPosition > keyAt || keyAt >= i13) {
                        i14++;
                    } else {
                        AsyncListUtil.this.mMissingPositions.removeAt(i14);
                        AsyncListUtil.this.mViewCallback.onItemLoaded(keyAt);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void removeTile(int i12, int i13) {
                if (isRequestedGeneration(i12)) {
                    TileList.Tile<T> removeAtPos = AsyncListUtil.this.mTileList.removeAtPos(i13);
                    if (removeAtPos != null) {
                        AsyncListUtil.this.mBackgroundProxy.recycleTile(removeAtPos);
                        return;
                    }
                    Log.e(AsyncListUtil.TAG, "tile not found @" + i13);
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void updateItemCount(int i12, int i13) {
                if (isRequestedGeneration(i12)) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mItemCount = i13;
                    asyncListUtil.mViewCallback.onDataRefresh();
                    AsyncListUtil asyncListUtil2 = AsyncListUtil.this;
                    asyncListUtil2.mDisplayedGeneration = asyncListUtil2.mRequestedGeneration;
                    recycleAllTiles();
                    AsyncListUtil asyncListUtil3 = AsyncListUtil.this;
                    asyncListUtil3.mAllowScrollHints = false;
                    asyncListUtil3.updateRange();
                }
            }
        };
        this.mMainThreadCallback = mainThreadCallback;
        ThreadUtil.BackgroundCallback<T> backgroundCallback = new ThreadUtil.BackgroundCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.2
            private int mFirstRequiredTileStart;
            private int mGeneration;
            private int mItemCount;
            private int mLastRequiredTileStart;
            final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
            private TileList.Tile<T> mRecycledRoot;

            private TileList.Tile<T> acquireTile() {
                TileList.Tile<T> tile = this.mRecycledRoot;
                if (tile != null) {
                    this.mRecycledRoot = tile.mNext;
                    return tile;
                }
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                return new TileList.Tile<>(asyncListUtil.mTClass, asyncListUtil.mTileSize);
            }

            private void addTile(TileList.Tile<T> tile) {
                this.mLoadedTiles.put(tile.mStartPosition, true);
                AsyncListUtil.this.mMainThreadProxy.addTile(this.mGeneration, tile);
            }

            private void flushTileCache(int i12) {
                int maxCachedTiles = AsyncListUtil.this.mDataCallback.getMaxCachedTiles();
                while (this.mLoadedTiles.size() >= maxCachedTiles) {
                    int keyAt = this.mLoadedTiles.keyAt(0);
                    SparseBooleanArray sparseBooleanArray = this.mLoadedTiles;
                    int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                    int i13 = this.mFirstRequiredTileStart - keyAt;
                    int i14 = keyAt2 - this.mLastRequiredTileStart;
                    if (i13 > 0 && (i13 >= i14 || i12 == 2)) {
                        removeTile(keyAt);
                    } else {
                        if (i14 <= 0) {
                            return;
                        }
                        if (i13 >= i14 && i12 != 1) {
                            return;
                        } else {
                            removeTile(keyAt2);
                        }
                    }
                }
            }

            private int getTileStart(int i12) {
                return i12 - (i12 % AsyncListUtil.this.mTileSize);
            }

            private boolean isTileLoaded(int i12) {
                return this.mLoadedTiles.get(i12);
            }

            private void log(String str, Object... objArr) {
                Log.d(AsyncListUtil.TAG, "[BKGR] " + String.format(str, objArr));
            }

            private void removeTile(int i12) {
                this.mLoadedTiles.delete(i12);
                AsyncListUtil.this.mMainThreadProxy.removeTile(this.mGeneration, i12);
            }

            private void requestTiles(int i12, int i13, int i14, boolean z11) {
                int i15 = i12;
                while (i15 <= i13) {
                    AsyncListUtil.this.mBackgroundProxy.loadTile(z11 ? (i13 + i12) - i15 : i15, i14);
                    i15 += AsyncListUtil.this.mTileSize;
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void loadTile(int i12, int i13) {
                if (isTileLoaded(i12)) {
                    return;
                }
                TileList.Tile<T> acquireTile = acquireTile();
                acquireTile.mStartPosition = i12;
                int min = Math.min(AsyncListUtil.this.mTileSize, this.mItemCount - i12);
                acquireTile.mItemCount = min;
                AsyncListUtil.this.mDataCallback.fillData(acquireTile.mItems, acquireTile.mStartPosition, min);
                flushTileCache(i13);
                addTile(acquireTile);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void recycleTile(TileList.Tile<T> tile) {
                AsyncListUtil.this.mDataCallback.recycleData(tile.mItems, tile.mItemCount);
                tile.mNext = this.mRecycledRoot;
                this.mRecycledRoot = tile;
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void refresh(int i12) {
                this.mGeneration = i12;
                this.mLoadedTiles.clear();
                int refreshData = AsyncListUtil.this.mDataCallback.refreshData();
                this.mItemCount = refreshData;
                AsyncListUtil.this.mMainThreadProxy.updateItemCount(this.mGeneration, refreshData);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void updateRange(int i12, int i13, int i14, int i15, int i16) {
                if (i12 > i13) {
                    return;
                }
                int tileStart = getTileStart(i12);
                int tileStart2 = getTileStart(i13);
                this.mFirstRequiredTileStart = getTileStart(i14);
                int tileStart3 = getTileStart(i15);
                this.mLastRequiredTileStart = tileStart3;
                if (i16 == 1) {
                    requestTiles(this.mFirstRequiredTileStart, tileStart2, i16, true);
                    requestTiles(tileStart2 + AsyncListUtil.this.mTileSize, this.mLastRequiredTileStart, i16, false);
                } else {
                    requestTiles(tileStart, tileStart3, i16, false);
                    requestTiles(this.mFirstRequiredTileStart, tileStart - AsyncListUtil.this.mTileSize, i16, true);
                }
            }
        };
        this.mBackgroundCallback = backgroundCallback;
        this.mTClass = cls;
        this.mTileSize = i11;
        this.mDataCallback = dataCallback;
        this.mViewCallback = viewCallback;
        this.mTileList = new TileList<>(i11);
        MessageThreadUtil messageThreadUtil = new MessageThreadUtil();
        this.mMainThreadProxy = messageThreadUtil.getMainThreadProxy(mainThreadCallback);
        this.mBackgroundProxy = messageThreadUtil.getBackgroundProxy(backgroundCallback);
        refresh();
    }

    private boolean isRefreshPending() {
        return this.mRequestedGeneration != this.mDisplayedGeneration;
    }

    @Nullable
    public T getItem(int i11) {
        if (i11 < 0 || i11 >= this.mItemCount) {
            throw new IndexOutOfBoundsException(i11 + " is not within 0 and " + this.mItemCount);
        }
        T itemAt = this.mTileList.getItemAt(i11);
        if (itemAt == null && !isRefreshPending()) {
            this.mMissingPositions.put(i11, 0);
        }
        return itemAt;
    }

    public int getItemCount() {
        return this.mItemCount;
    }

    public void log(String str, Object... objArr) {
        Log.d(TAG, "[MAIN] " + String.format(str, objArr));
    }

    public void onRangeChanged() {
        if (isRefreshPending()) {
            return;
        }
        updateRange();
        this.mAllowScrollHints = true;
    }

    public void refresh() {
        this.mMissingPositions.clear();
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int i11 = this.mRequestedGeneration + 1;
        this.mRequestedGeneration = i11;
        backgroundCallback.refresh(i11);
    }

    public void updateRange() {
        int i11;
        this.mViewCallback.getItemRangeInto(this.mTmpRange);
        int[] iArr = this.mTmpRange;
        int i12 = iArr[0];
        int i13 = iArr[1];
        if (i12 > i13 || i12 < 0 || i13 >= this.mItemCount) {
            return;
        }
        if (this.mAllowScrollHints) {
            int[] iArr2 = this.mPrevRange;
            if (i12 > iArr2[1] || (i11 = iArr2[0]) > i13) {
                this.mScrollHint = 0;
            } else if (i12 < i11) {
                this.mScrollHint = 1;
            } else if (i12 > i11) {
                this.mScrollHint = 2;
            }
        } else {
            this.mScrollHint = 0;
        }
        int[] iArr3 = this.mPrevRange;
        iArr3[0] = i12;
        iArr3[1] = i13;
        this.mViewCallback.extendRangeInto(iArr, this.mTmpRangeExtended, this.mScrollHint);
        int[] iArr4 = this.mTmpRangeExtended;
        iArr4[0] = Math.min(this.mTmpRange[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.mTmpRangeExtended;
        iArr5[1] = Math.max(this.mTmpRange[1], Math.min(iArr5[1], this.mItemCount - 1));
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int[] iArr6 = this.mTmpRange;
        int i14 = iArr6[0];
        int i15 = iArr6[1];
        int[] iArr7 = this.mTmpRangeExtended;
        backgroundCallback.updateRange(i14, i15, iArr7[0], iArr7[1], this.mScrollHint);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class DataCallback<T> {
        @WorkerThread
        public abstract void fillData(@NonNull T[] tArr, int i11, int i12);

        @WorkerThread
        public int getMaxCachedTiles() {
            return 10;
        }

        @WorkerThread
        public abstract int refreshData();

        @WorkerThread
        public void recycleData(@NonNull T[] tArr, int i11) {
        }
    }
}
