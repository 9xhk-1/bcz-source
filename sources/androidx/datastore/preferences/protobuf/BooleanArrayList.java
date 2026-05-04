package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final BooleanArrayList EMPTY_LIST = new BooleanArrayList(new boolean[0], 0, false);
    private boolean[] array;
    private int size;

    public BooleanArrayList() {
        this(new boolean[10], 0, true);
    }

    public static BooleanArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i11 = booleanArrayList.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        boolean[] zArr = this.array;
        if (i13 > zArr.length) {
            this.array = Arrays.copyOf(zArr, i13);
        }
        System.arraycopy(booleanArrayList.array, 0, this.array, this.size, booleanArrayList.size);
        this.size = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public void addBoolean(boolean element) {
        ensureIsMutable();
        int i11 = this.size;
        boolean[] zArr = this.array;
        if (i11 == zArr.length) {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i12 = this.size;
        this.size = i12 + 1;
        zArr3[i12] = element;
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
        if (!(o11 instanceof BooleanArrayList)) {
            return super.equals(o11);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) o11;
        if (this.size != booleanArrayList.size) {
            return false;
        }
        boolean[] zArr = booleanArrayList.array;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (this.array[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public boolean getBoolean(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + Internal.hashBoolean(this.array[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) element).booleanValue();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.array[i11] == booleanValue) {
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
        boolean[] zArr = this.array;
        System.arraycopy(zArr, toIndex, zArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public boolean setBoolean(int index, boolean element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        boolean[] zArr = this.array;
        boolean z11 = zArr[index];
        zArr[index] = element;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private BooleanArrayList(boolean[] other, int size, boolean isMutable) {
        super(isMutable);
        this.array = other;
        this.size = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int index) {
        return Boolean.valueOf(getBoolean(index));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.size) {
            return new BooleanArrayList(Arrays.copyOf(this.array, capacity), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        boolean[] zArr = this.array;
        boolean z11 = zArr[index];
        if (index < this.size - 1) {
            System.arraycopy(zArr, index + 1, zArr, index, (r2 - index) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean set(int index, Boolean element) {
        return Boolean.valueOf(setBoolean(index, element.booleanValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean element) {
        addBoolean(element.booleanValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, Boolean element) {
        addBoolean(index, element.booleanValue());
    }

    private void addBoolean(int index, boolean element) {
        int i11;
        ensureIsMutable();
        if (index >= 0 && index <= (i11 = this.size)) {
            boolean[] zArr = this.array;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, index, zArr, index + 1, i11 - index);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, index);
                System.arraycopy(this.array, index, zArr2, index + 1, this.size - index);
                this.array = zArr2;
            }
            this.array[index] = element;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
