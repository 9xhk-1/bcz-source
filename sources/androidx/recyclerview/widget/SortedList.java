package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class SortedList<T> {
    private static final int CAPACITY_GROWTH = 10;
    private static final int DELETION = 2;
    private static final int INSERTION = 1;
    public static final int INVALID_POSITION = -1;
    private static final int LOOKUP = 4;
    private static final int MIN_CAPACITY = 10;
    private BatchedCallback mBatchedCallback;
    private Callback mCallback;
    T[] mData;
    private int mNewDataStart;
    private T[] mOldData;
    private int mOldDataSize;
    private int mOldDataStart;
    private int mSize;
    private final Class<T> mTClass;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BatchedCallback<T2> extends Callback<T2> {
        private final BatchingListUpdateCallback mBatchingListUpdateCallback;
        final Callback<T2> mWrappedCallback;

        @SuppressLint({"UnknownNullness"})
        public BatchedCallback(Callback<T2> callback) {
            this.mWrappedCallback = callback;
            this.mBatchingListUpdateCallback = new BatchingListUpdateCallback(callback);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areContentsTheSame(T2 t22, T2 t23) {
            return this.mWrappedCallback.areContentsTheSame(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areItemsTheSame(T2 t22, T2 t23) {
            return this.mWrappedCallback.areItemsTheSame(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(T2 t22, T2 t23) {
            return this.mWrappedCallback.compare(t22, t23);
        }

        public void dispatchLastEvent() {
            this.mBatchingListUpdateCallback.dispatchLastEvent();
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        @Nullable
        public Object getChangePayload(T2 t22, T2 t23) {
            return this.mWrappedCallback.getChangePayload(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void onChanged(int i11, int i12) {
            this.mBatchingListUpdateCallback.onChanged(i11, i12, null);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i11, int i12) {
            this.mBatchingListUpdateCallback.onInserted(i11, i12);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i11, int i12) {
            this.mBatchingListUpdateCallback.onMoved(i11, i12);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i11, int i12) {
            this.mBatchingListUpdateCallback.onRemoved(i11, i12);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i11, int i12, Object obj) {
            this.mBatchingListUpdateCallback.onChanged(i11, i12, obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t22, T2 t23);

        public abstract boolean areItemsTheSame(T2 t22, T2 t23);

        @Override // java.util.Comparator
        public abstract int compare(T2 t22, T2 t23);

        @Nullable
        public Object getChangePayload(T2 t22, T2 t23) {
            return null;
        }

        public abstract void onChanged(int i11, int i12);

        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i11, int i12, Object obj) {
            onChanged(i11, i12);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback) {
        this(cls, callback, 10);
    }

    private void addAllInternal(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int sortAndDedup = sortAndDedup(tArr);
        if (this.mSize != 0) {
            merge(tArr, sortAndDedup);
            return;
        }
        this.mData = tArr;
        this.mSize = sortAndDedup;
        this.mCallback.onInserted(0, sortAndDedup);
    }

    private void addToData(int i11, T t11) {
        int i12 = this.mSize;
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("cannot add item to " + i11 + " because size is " + this.mSize);
        }
        T[] tArr = this.mData;
        if (i12 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length + 10));
            System.arraycopy(this.mData, 0, tArr2, 0, i11);
            tArr2[i11] = t11;
            System.arraycopy(this.mData, i11, tArr2, i11 + 1, this.mSize - i11);
            this.mData = tArr2;
        } else {
            System.arraycopy(tArr, i11, tArr, i11 + 1, i12 - i11);
            this.mData[i11] = t11;
        }
        this.mSize++;
    }

    private T[] copyArray(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int findIndexOf(T t11, T[] tArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            int i14 = (i11 + i12) / 2;
            T t12 = tArr[i14];
            int compare = this.mCallback.compare(t12, t11);
            if (compare < 0) {
                i11 = i14 + 1;
            } else {
                if (compare == 0) {
                    if (!this.mCallback.areItemsTheSame(t12, t11)) {
                        int linearEqualitySearch = linearEqualitySearch(t11, i14, i11, i12);
                        if (i13 != 1 || linearEqualitySearch != -1) {
                            return linearEqualitySearch;
                        }
                    }
                    return i14;
                }
                i12 = i14;
            }
        }
        if (i13 == 1) {
            return i11;
        }
        return -1;
    }

    private int findSameItem(T t11, T[] tArr, int i11, int i12) {
        while (i11 < i12) {
            if (this.mCallback.areItemsTheSame(tArr[i11], t11)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private int linearEqualitySearch(T t11, int i11, int i12, int i13) {
        T t12;
        for (int i14 = i11 - 1; i14 >= i12; i14--) {
            T t13 = this.mData[i14];
            if (this.mCallback.compare(t13, t11) != 0) {
                break;
            }
            if (this.mCallback.areItemsTheSame(t13, t11)) {
                return i14;
            }
        }
        do {
            i11++;
            if (i11 >= i13) {
                return -1;
            }
            t12 = this.mData[i11];
            if (this.mCallback.compare(t12, t11) != 0) {
                return -1;
            }
        } while (!this.mCallback.areItemsTheSame(t12, t11));
        return i11;
    }

    private void merge(T[] tArr, int i11) {
        boolean z11 = this.mCallback instanceof BatchedCallback;
        if (!z11) {
            beginBatchedUpdates();
        }
        this.mOldData = this.mData;
        int i12 = 0;
        this.mOldDataStart = 0;
        int i13 = this.mSize;
        this.mOldDataSize = i13;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, i13 + i11 + 10));
        this.mNewDataStart = 0;
        while (true) {
            int i14 = this.mOldDataStart;
            int i15 = this.mOldDataSize;
            if (i14 >= i15 && i12 >= i11) {
                break;
            }
            if (i14 == i15) {
                int i16 = i11 - i12;
                System.arraycopy(tArr, i12, this.mData, this.mNewDataStart, i16);
                int i17 = this.mNewDataStart + i16;
                this.mNewDataStart = i17;
                this.mSize += i16;
                this.mCallback.onInserted(i17 - i16, i16);
                break;
            }
            if (i12 == i11) {
                int i18 = i15 - i14;
                System.arraycopy(this.mOldData, i14, this.mData, this.mNewDataStart, i18);
                this.mNewDataStart += i18;
                break;
            }
            T t11 = this.mOldData[i14];
            T t12 = tArr[i12];
            int compare = this.mCallback.compare(t11, t12);
            if (compare > 0) {
                T[] tArr2 = this.mData;
                int i19 = this.mNewDataStart;
                this.mNewDataStart = i19 + 1;
                tArr2[i19] = t12;
                this.mSize++;
                i12++;
                this.mCallback.onInserted(i19, 1);
            } else if (compare == 0 && this.mCallback.areItemsTheSame(t11, t12)) {
                T[] tArr3 = this.mData;
                int i21 = this.mNewDataStart;
                this.mNewDataStart = i21 + 1;
                tArr3[i21] = t12;
                i12++;
                this.mOldDataStart++;
                if (!this.mCallback.areContentsTheSame(t11, t12)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t11, t12));
                }
            } else {
                T[] tArr4 = this.mData;
                int i22 = this.mNewDataStart;
                this.mNewDataStart = i22 + 1;
                tArr4[i22] = t11;
                this.mOldDataStart++;
            }
        }
        this.mOldData = null;
        if (z11) {
            return;
        }
        endBatchedUpdates();
    }

    private void removeItemAtIndex(int i11, boolean z11) {
        T[] tArr = this.mData;
        System.arraycopy(tArr, i11 + 1, tArr, i11, (this.mSize - i11) - 1);
        int i12 = this.mSize - 1;
        this.mSize = i12;
        this.mData[i12] = null;
        if (z11) {
            this.mCallback.onRemoved(i11, 1);
        }
    }

    private void replaceAllInsert(T t11) {
        T[] tArr = this.mData;
        int i11 = this.mNewDataStart;
        tArr[i11] = t11;
        this.mNewDataStart = i11 + 1;
        this.mSize++;
        this.mCallback.onInserted(i11, 1);
    }

    private void replaceAllInternal(@NonNull T[] tArr) {
        boolean z11 = this.mCallback instanceof BatchedCallback;
        if (!z11) {
            beginBatchedUpdates();
        }
        this.mOldDataStart = 0;
        this.mOldDataSize = this.mSize;
        this.mOldData = this.mData;
        this.mNewDataStart = 0;
        int sortAndDedup = sortAndDedup(tArr);
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, sortAndDedup));
        while (true) {
            int i11 = this.mNewDataStart;
            if (i11 >= sortAndDedup && this.mOldDataStart >= this.mOldDataSize) {
                break;
            }
            int i12 = this.mOldDataStart;
            int i13 = this.mOldDataSize;
            if (i12 >= i13) {
                int i14 = sortAndDedup - i11;
                System.arraycopy(tArr, i11, this.mData, i11, i14);
                this.mNewDataStart += i14;
                this.mSize += i14;
                this.mCallback.onInserted(i11, i14);
                break;
            }
            if (i11 >= sortAndDedup) {
                int i15 = i13 - i12;
                this.mSize -= i15;
                this.mCallback.onRemoved(i11, i15);
                break;
            }
            T t11 = this.mOldData[i12];
            T t12 = tArr[i11];
            int compare = this.mCallback.compare(t11, t12);
            if (compare < 0) {
                replaceAllRemove();
            } else if (compare > 0) {
                replaceAllInsert(t12);
            } else if (this.mCallback.areItemsTheSame(t11, t12)) {
                T[] tArr2 = this.mData;
                int i16 = this.mNewDataStart;
                tArr2[i16] = t12;
                this.mOldDataStart++;
                this.mNewDataStart = i16 + 1;
                if (!this.mCallback.areContentsTheSame(t11, t12)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t11, t12));
                }
            } else {
                replaceAllRemove();
                replaceAllInsert(t12);
            }
        }
        this.mOldData = null;
        if (z11) {
            return;
        }
        endBatchedUpdates();
    }

    private void replaceAllRemove() {
        this.mSize--;
        this.mOldDataStart++;
        this.mCallback.onRemoved(this.mNewDataStart, 1);
    }

    private int sortAndDedup(@NonNull T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.mCallback);
        int i11 = 0;
        int i12 = 1;
        for (int i13 = 1; i13 < tArr.length; i13++) {
            T t11 = tArr[i13];
            if (this.mCallback.compare(tArr[i11], t11) == 0) {
                int findSameItem = findSameItem(t11, tArr, i11, i12);
                if (findSameItem != -1) {
                    tArr[findSameItem] = t11;
                } else {
                    if (i12 != i13) {
                        tArr[i12] = t11;
                    }
                    i12++;
                }
            } else {
                if (i12 != i13) {
                    tArr[i12] = t11;
                }
                i11 = i12;
                i12++;
            }
        }
        return i12;
    }

    private void throwIfInMutationOperation() {
        if (this.mOldData != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public int add(T t11) {
        throwIfInMutationOperation();
        return add(t11, true);
    }

    public void addAll(@NonNull T[] tArr, boolean z11) {
        throwIfInMutationOperation();
        if (tArr.length == 0) {
            return;
        }
        if (z11) {
            addAllInternal(tArr);
        } else {
            addAllInternal(copyArray(tArr));
        }
    }

    public void beginBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            return;
        }
        if (this.mBatchedCallback == null) {
            this.mBatchedCallback = new BatchedCallback(callback);
        }
        this.mCallback = this.mBatchedCallback;
    }

    public void clear() {
        throwIfInMutationOperation();
        int i11 = this.mSize;
        if (i11 == 0) {
            return;
        }
        Arrays.fill(this.mData, 0, i11, (Object) null);
        this.mSize = 0;
        this.mCallback.onRemoved(0, i11);
    }

    public void endBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            ((BatchedCallback) callback).dispatchLastEvent();
        }
        Callback callback2 = this.mCallback;
        BatchedCallback batchedCallback = this.mBatchedCallback;
        if (callback2 == batchedCallback) {
            this.mCallback = batchedCallback.mWrappedCallback;
        }
    }

    public T get(int i11) throws IndexOutOfBoundsException {
        int i12;
        if (i11 < this.mSize && i11 >= 0) {
            T[] tArr = this.mOldData;
            return (tArr == null || i11 < (i12 = this.mNewDataStart)) ? this.mData[i11] : tArr[(i11 - i12) + this.mOldDataStart];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i11 + " but size is " + this.mSize);
    }

    public int indexOf(T t11) {
        if (this.mOldData == null) {
            return findIndexOf(t11, this.mData, 0, this.mSize, 4);
        }
        int findIndexOf = findIndexOf(t11, this.mData, 0, this.mNewDataStart, 4);
        if (findIndexOf != -1) {
            return findIndexOf;
        }
        int findIndexOf2 = findIndexOf(t11, this.mOldData, this.mOldDataStart, this.mOldDataSize, 4);
        if (findIndexOf2 != -1) {
            return (findIndexOf2 - this.mOldDataStart) + this.mNewDataStart;
        }
        return -1;
    }

    public void recalculatePositionOfItemAt(int i11) {
        throwIfInMutationOperation();
        T t11 = get(i11);
        removeItemAtIndex(i11, false);
        int add = add(t11, false);
        if (i11 != add) {
            this.mCallback.onMoved(i11, add);
        }
    }

    public boolean remove(T t11) {
        throwIfInMutationOperation();
        return remove(t11, true);
    }

    public T removeItemAt(int i11) {
        throwIfInMutationOperation();
        T t11 = get(i11);
        removeItemAtIndex(i11, true);
        return t11;
    }

    public void replaceAll(@NonNull T[] tArr, boolean z11) {
        throwIfInMutationOperation();
        if (z11) {
            replaceAllInternal(tArr);
        } else {
            replaceAllInternal(copyArray(tArr));
        }
    }

    public int size() {
        return this.mSize;
    }

    public void updateItemAt(int i11, T t11) {
        throwIfInMutationOperation();
        T t12 = get(i11);
        boolean z11 = t12 == t11 || !this.mCallback.areContentsTheSame(t12, t11);
        if (t12 != t11 && this.mCallback.compare(t12, t11) == 0) {
            this.mData[i11] = t11;
            if (z11) {
                Callback callback = this.mCallback;
                callback.onChanged(i11, 1, callback.getChangePayload(t12, t11));
                return;
            }
            return;
        }
        if (z11) {
            Callback callback2 = this.mCallback;
            callback2.onChanged(i11, 1, callback2.getChangePayload(t12, t11));
        }
        removeItemAtIndex(i11, false);
        int add = add(t11, false);
        if (i11 != add) {
            this.mCallback.onMoved(i11, add);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i11) {
        this.mTClass = cls;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i11));
        this.mCallback = callback;
        this.mSize = 0;
    }

    private int add(T t11, boolean z11) {
        int findIndexOf = findIndexOf(t11, this.mData, 0, this.mSize, 1);
        if (findIndexOf == -1) {
            findIndexOf = 0;
        } else if (findIndexOf < this.mSize) {
            T t12 = this.mData[findIndexOf];
            if (this.mCallback.areItemsTheSame(t12, t11)) {
                if (this.mCallback.areContentsTheSame(t12, t11)) {
                    this.mData[findIndexOf] = t11;
                    return findIndexOf;
                }
                this.mData[findIndexOf] = t11;
                Callback callback = this.mCallback;
                callback.onChanged(findIndexOf, 1, callback.getChangePayload(t12, t11));
                return findIndexOf;
            }
        }
        addToData(findIndexOf, t11);
        if (z11) {
            this.mCallback.onInserted(findIndexOf, 1);
        }
        return findIndexOf;
    }

    private boolean remove(T t11, boolean z11) {
        int findIndexOf = findIndexOf(t11, this.mData, 0, this.mSize, 2);
        if (findIndexOf == -1) {
            return false;
        }
        removeItemAtIndex(findIndexOf, z11);
        return true;
    }

    public void replaceAll(@NonNull T... tArr) {
        replaceAll(tArr, false);
    }

    public void addAll(@NonNull T... tArr) {
        addAll(tArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(@NonNull Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(@NonNull Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }
}
