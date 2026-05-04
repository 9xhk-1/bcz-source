package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class DiffUtil {
    private static final Comparator<Diagonal> DIAGONAL_COMPARATOR = new Comparator<Diagonal>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        @Override // java.util.Comparator
        public int compare(Diagonal diagonal, Diagonal diagonal2) {
            return diagonal.f5315x - diagonal2.f5315x;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i11, int i12);

        public abstract boolean areItemsTheSame(int i11, int i12);

        @Nullable
        public Object getChangePayload(int i11, int i12) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CenteredArray {
        private final int[] mData;
        private final int mMid;

        public CenteredArray(int i11) {
            int[] iArr = new int[i11];
            this.mData = iArr;
            this.mMid = iArr.length / 2;
        }

        public int[] backingData() {
            return this.mData;
        }

        public void fill(int i11) {
            Arrays.fill(this.mData, i11);
        }

        public int get(int i11) {
            return this.mData[i11 + this.mMid];
        }

        public void set(int i11, int i12) {
            this.mData[i11 + this.mMid] = i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Diagonal {
        public final int size;

        /* renamed from: x, reason: collision with root package name */
        public final int f5315x;

        /* renamed from: y, reason: collision with root package name */
        public final int f5316y;

        public Diagonal(int i11, int i12, int i13) {
            this.f5315x = i11;
            this.f5316y = i12;
            this.size = i13;
        }

        public int endX() {
            return this.f5315x + this.size;
        }

        public int endY() {
            return this.f5316y + this.size;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_MASK = 15;
        private static final int FLAG_MOVED = 12;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 4;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final List<Diagonal> mDiagonals;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;

        public DiffResult(Callback callback, List<Diagonal> list, int[] iArr, int[] iArr2, boolean z11) {
            this.mDiagonals = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z11;
            addEdgeDiagonals();
            findMatchingItems();
        }

        private void addEdgeDiagonals() {
            Diagonal diagonal = this.mDiagonals.isEmpty() ? null : this.mDiagonals.get(0);
            if (diagonal == null || diagonal.f5315x != 0 || diagonal.f5316y != 0) {
                this.mDiagonals.add(0, new Diagonal(0, 0, 0));
            }
            this.mDiagonals.add(new Diagonal(this.mOldListSize, this.mNewListSize, 0));
        }

        private void findMatchingAddition(int i11) {
            int size = this.mDiagonals.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                Diagonal diagonal = this.mDiagonals.get(i13);
                while (i12 < diagonal.f5316y) {
                    if (this.mNewItemStatuses[i12] == 0 && this.mCallback.areItemsTheSame(i11, i12)) {
                        int i14 = this.mCallback.areContentsTheSame(i11, i12) ? 8 : 4;
                        this.mOldItemStatuses[i11] = (i12 << 4) | i14;
                        this.mNewItemStatuses[i12] = (i11 << 4) | i14;
                        return;
                    }
                    i12++;
                }
                i12 = diagonal.endY();
            }
        }

        private void findMatchingItems() {
            for (Diagonal diagonal : this.mDiagonals) {
                for (int i11 = 0; i11 < diagonal.size; i11++) {
                    int i12 = diagonal.f5315x + i11;
                    int i13 = diagonal.f5316y + i11;
                    int i14 = this.mCallback.areContentsTheSame(i12, i13) ? 1 : 2;
                    this.mOldItemStatuses[i12] = (i13 << 4) | i14;
                    this.mNewItemStatuses[i13] = (i12 << 4) | i14;
                }
            }
            if (this.mDetectMoves) {
                findMoveMatches();
            }
        }

        private void findMoveMatches() {
            int i11 = 0;
            for (Diagonal diagonal : this.mDiagonals) {
                while (i11 < diagonal.f5315x) {
                    if (this.mOldItemStatuses[i11] == 0) {
                        findMatchingAddition(i11);
                    }
                    i11++;
                }
                i11 = diagonal.endX();
            }
        }

        @Nullable
        private static PostponedUpdate getPostponedUpdate(Collection<PostponedUpdate> collection, int i11, boolean z11) {
            PostponedUpdate postponedUpdate;
            Iterator<PostponedUpdate> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    postponedUpdate = null;
                    break;
                }
                postponedUpdate = it.next();
                if (postponedUpdate.posInOwnerList == i11 && postponedUpdate.removal == z11) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                PostponedUpdate next = it.next();
                if (z11) {
                    next.currentPos--;
                } else {
                    next.currentPos++;
                }
            }
            return postponedUpdate;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i11) {
            if (i11 >= 0 && i11 < this.mNewListSize) {
                int i12 = this.mNewItemStatuses[i11];
                if ((i12 & 15) == 0) {
                    return -1;
                }
                return i12 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i11 + ", new list size = " + this.mNewListSize);
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i11) {
            if (i11 >= 0 && i11 < this.mOldListSize) {
                int i12 = this.mOldItemStatuses[i11];
                if ((i12 & 15) == 0) {
                    return -1;
                }
                return i12 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i11 + ", old list size = " + this.mOldListSize);
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            int i11;
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            int i12 = this.mOldListSize;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i13 = this.mOldListSize;
            int i14 = this.mNewListSize;
            for (int size = this.mDiagonals.size() - 1; size >= 0; size--) {
                Diagonal diagonal = this.mDiagonals.get(size);
                int endX = diagonal.endX();
                int endY = diagonal.endY();
                while (true) {
                    if (i13 <= endX) {
                        break;
                    }
                    i13--;
                    int i15 = this.mOldItemStatuses[i13];
                    if ((i15 & 12) != 0) {
                        int i16 = i15 >> 4;
                        PostponedUpdate postponedUpdate = getPostponedUpdate(arrayDeque, i16, false);
                        if (postponedUpdate != null) {
                            int i17 = (i12 - postponedUpdate.currentPos) - 1;
                            batchingListUpdateCallback.onMoved(i13, i17);
                            if ((i15 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i17, 1, this.mCallback.getChangePayload(i13, i16));
                            }
                        } else {
                            arrayDeque.add(new PostponedUpdate(i13, (i12 - i13) - 1, true));
                        }
                    } else {
                        batchingListUpdateCallback.onRemoved(i13, 1);
                        i12--;
                    }
                }
                while (i14 > endY) {
                    i14--;
                    int i18 = this.mNewItemStatuses[i14];
                    if ((i18 & 12) != 0) {
                        int i19 = i18 >> 4;
                        PostponedUpdate postponedUpdate2 = getPostponedUpdate(arrayDeque, i19, true);
                        if (postponedUpdate2 == null) {
                            arrayDeque.add(new PostponedUpdate(i14, i12 - i13, false));
                        } else {
                            batchingListUpdateCallback.onMoved((i12 - postponedUpdate2.currentPos) - 1, i13);
                            if ((i18 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i13, 1, this.mCallback.getChangePayload(i19, i14));
                            }
                        }
                    } else {
                        batchingListUpdateCallback.onInserted(i13, 1);
                        i12++;
                    }
                }
                int i21 = diagonal.f5315x;
                int i22 = diagonal.f5316y;
                for (i11 = 0; i11 < diagonal.size; i11++) {
                    if ((this.mOldItemStatuses[i21] & 15) == 2) {
                        batchingListUpdateCallback.onChanged(i21, 1, this.mCallback.getChangePayload(i21, i22));
                    }
                    i21++;
                    i22++;
                }
                i13 = diagonal.f5315x;
                i14 = diagonal.f5316y;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t11, @NonNull T t12);

        public abstract boolean areItemsTheSame(@NonNull T t11, @NonNull T t12);

        @Nullable
        public Object getChangePayload(@NonNull T t11, @NonNull T t12) {
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PostponedUpdate {
        int currentPos;
        int posInOwnerList;
        boolean removal;

        public PostponedUpdate(int i11, int i12, boolean z11) {
            this.posInOwnerList = i11;
            this.currentPos = i12;
            this.removal = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Range {
        int newListEnd;
        int newListStart;
        int oldListEnd;
        int oldListStart;

        public Range() {
        }

        public int newSize() {
            return this.newListEnd - this.newListStart;
        }

        public int oldSize() {
            return this.oldListEnd - this.oldListStart;
        }

        public Range(int i11, int i12, int i13, int i14) {
            this.oldListStart = i11;
            this.oldListEnd = i12;
            this.newListStart = i13;
            this.newListEnd = i14;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Snake {
        public int endX;
        public int endY;
        public boolean reverse;
        public int startX;
        public int startY;

        public int diagonalSize() {
            return Math.min(this.endX - this.startX, this.endY - this.startY);
        }

        public boolean hasAdditionOrRemoval() {
            return this.endY - this.startY != this.endX - this.startX;
        }

        public boolean isAddition() {
            return this.endY - this.startY > this.endX - this.startX;
        }

        @NonNull
        public Diagonal toDiagonal() {
            if (hasAdditionOrRemoval()) {
                return this.reverse ? new Diagonal(this.startX, this.startY, diagonalSize()) : isAddition() ? new Diagonal(this.startX, this.startY + 1, diagonalSize()) : new Diagonal(this.startX + 1, this.startY, diagonalSize());
            }
            int i11 = this.startX;
            return new Diagonal(i11, this.startY, this.endX - i11);
        }
    }

    private DiffUtil() {
    }

    @Nullable
    private static Snake backward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z11 = (range.oldSize() - range.newSize()) % 2 == 0;
        int oldSize = range.oldSize() - range.newSize();
        int i15 = -i11;
        for (int i16 = i15; i16 <= i11; i16 += 2) {
            if (i16 == i15 || (i16 != i11 && centeredArray2.get(i16 + 1) < centeredArray2.get(i16 - 1))) {
                i12 = centeredArray2.get(i16 + 1);
                i13 = i12;
            } else {
                i12 = centeredArray2.get(i16 - 1);
                i13 = i12 - 1;
            }
            int i17 = range.newListEnd - ((range.oldListEnd - i13) - i16);
            int i18 = (i11 == 0 || i13 != i12) ? i17 : i17 + 1;
            while (i13 > range.oldListStart && i17 > range.newListStart && callback.areItemsTheSame(i13 - 1, i17 - 1)) {
                i13--;
                i17--;
            }
            centeredArray2.set(i16, i13);
            if (z11 && (i14 = oldSize - i16) >= i15 && i14 <= i11 && centeredArray.get(i14) >= i13) {
                Snake snake = new Snake();
                snake.startX = i13;
                snake.startY = i17;
                snake.endX = i12;
                snake.endY = i18;
                snake.reverse = true;
                return snake;
            }
        }
        return null;
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback) {
        return calculateDiff(callback, true);
    }

    @Nullable
    private static Snake forward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z11 = Math.abs(range.oldSize() - range.newSize()) % 2 == 1;
        int oldSize = range.oldSize() - range.newSize();
        int i15 = -i11;
        for (int i16 = i15; i16 <= i11; i16 += 2) {
            if (i16 == i15 || (i16 != i11 && centeredArray.get(i16 + 1) > centeredArray.get(i16 - 1))) {
                i12 = centeredArray.get(i16 + 1);
                i13 = i12;
            } else {
                i12 = centeredArray.get(i16 - 1);
                i13 = i12 + 1;
            }
            int i17 = (range.newListStart + (i13 - range.oldListStart)) - i16;
            int i18 = (i11 == 0 || i13 != i12) ? i17 : i17 - 1;
            while (i13 < range.oldListEnd && i17 < range.newListEnd && callback.areItemsTheSame(i13, i17)) {
                i13++;
                i17++;
            }
            centeredArray.set(i16, i13);
            if (z11 && (i14 = oldSize - i16) >= i15 + 1 && i14 <= i11 - 1 && centeredArray2.get(i14) <= i13) {
                Snake snake = new Snake();
                snake.startX = i12;
                snake.startY = i18;
                snake.endX = i13;
                snake.endY = i17;
                snake.reverse = false;
                return snake;
            }
        }
        return null;
    }

    @Nullable
    private static Snake midPoint(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2) {
        if (range.oldSize() >= 1 && range.newSize() >= 1) {
            int oldSize = ((range.oldSize() + range.newSize()) + 1) / 2;
            centeredArray.set(1, range.oldListStart);
            centeredArray2.set(1, range.oldListEnd);
            for (int i11 = 0; i11 < oldSize; i11++) {
                Snake forward = forward(range, callback, centeredArray, centeredArray2, i11);
                if (forward != null) {
                    return forward;
                }
                Snake backward = backward(range, callback, centeredArray, centeredArray2, i11);
                if (backward != null) {
                    return backward;
                }
            }
        }
        return null;
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback, boolean z11) {
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, oldListSize, 0, newListSize));
        int i11 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        CenteredArray centeredArray = new CenteredArray(i11);
        CenteredArray centeredArray2 = new CenteredArray(i11);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range = (Range) arrayList2.remove(arrayList2.size() - 1);
            Snake midPoint = midPoint(range, callback, centeredArray, centeredArray2);
            if (midPoint != null) {
                if (midPoint.diagonalSize() > 0) {
                    arrayList.add(midPoint.toDiagonal());
                }
                Range range2 = arrayList3.isEmpty() ? new Range() : (Range) arrayList3.remove(arrayList3.size() - 1);
                range2.oldListStart = range.oldListStart;
                range2.newListStart = range.newListStart;
                range2.oldListEnd = midPoint.startX;
                range2.newListEnd = midPoint.startY;
                arrayList2.add(range2);
                range.oldListEnd = range.oldListEnd;
                range.newListEnd = range.newListEnd;
                range.oldListStart = midPoint.endX;
                range.newListStart = midPoint.endY;
                arrayList2.add(range);
            } else {
                arrayList3.add(range);
            }
        }
        Collections.sort(arrayList, DIAGONAL_COMPARATOR);
        return new DiffResult(callback, arrayList, centeredArray.backingData(), centeredArray2.backingData(), z11);
    }
}
