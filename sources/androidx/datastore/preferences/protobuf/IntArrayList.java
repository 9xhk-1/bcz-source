package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final IntArrayList EMPTY_LIST = new IntArrayList(new int[0], 0, false);
    private int[] array;
    private int size;

    public IntArrayList() {
        this(new int[10], 0, true);
    }

    public static IntArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.size;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i11 = intArrayList.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.array;
        if (i13 > iArr.length) {
            this.array = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(intArrayList.array, 0, this.array, this.size, intArrayList.size);
        this.size = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public void addInt(int element) {
        ensureIsMutable();
        int i11 = this.size;
        int[] iArr = this.array;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i12 = this.size;
        this.size = i12 + 1;
        iArr3[i12] = element;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (!(o11 instanceof IntArrayList)) {
            return super.equals(o11);
        }
        IntArrayList intArrayList = (IntArrayList) o11;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.array;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (this.array[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int getInt(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + this.array[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) element).intValue();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.array[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int fromIndex, int toIndex) {
        ensureIsMutable();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.array;
        System.arraycopy(iArr, toIndex, iArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int setInt(int index, int element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        int[] iArr = this.array;
        int i11 = iArr[index];
        iArr[index] = element;
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private IntArrayList(int[] other, int size, boolean isMutable) {
        super(isMutable);
        this.array = other;
        this.size = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int index) {
        return Integer.valueOf(getInt(index));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.size) {
            return new IntArrayList(Arrays.copyOf(this.array, capacity), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        int[] iArr = this.array;
        int i11 = iArr[index];
        if (index < this.size - 1) {
            System.arraycopy(iArr, index + 1, iArr, index, (r2 - index) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer set(int index, Integer element) {
        return Integer.valueOf(setInt(index, element.intValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer element) {
        addInt(element.intValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, Integer element) {
        addInt(index, element.intValue());
    }

    private void addInt(int index, int element) {
        int i11;
        ensureIsMutable();
        if (index >= 0 && index <= (i11 = this.size)) {
            int[] iArr = this.array;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, index, iArr, index + 1, i11 - index);
            } else {
                int[] iArr2 = new int[((i11 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, index);
                System.arraycopy(this.array, index, iArr2, index + 1, this.size - index);
                this.array = iArr2;
            }
            this.array[index] = element;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
