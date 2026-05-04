package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final DoubleArrayList EMPTY_LIST = new DoubleArrayList(new double[0], 0, false);
    private double[] array;
    private int size;

    public DoubleArrayList() {
        this(new double[10], 0, true);
    }

    public static DoubleArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i11 = doubleArrayList.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        double[] dArr = this.array;
        if (i13 > dArr.length) {
            this.array = Arrays.copyOf(dArr, i13);
        }
        System.arraycopy(doubleArrayList.array, 0, this.array, this.size, doubleArrayList.size);
        this.size = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public void addDouble(double element) {
        ensureIsMutable();
        int i11 = this.size;
        double[] dArr = this.array;
        if (i11 == dArr.length) {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i12 = this.size;
        this.size = i12 + 1;
        dArr3[i12] = element;
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
        if (!(o11 instanceof DoubleArrayList)) {
            return super.equals(o11);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) o11;
        if (this.size != doubleArrayList.size) {
            return false;
        }
        double[] dArr = doubleArrayList.array;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (Double.doubleToLongBits(this.array[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public double getDouble(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + Internal.hashLong(Double.doubleToLongBits(this.array[i12]));
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) element).doubleValue();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.array[i11] == doubleValue) {
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
        double[] dArr = this.array;
        System.arraycopy(dArr, toIndex, dArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public double setDouble(int index, double element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        double[] dArr = this.array;
        double d11 = dArr[index];
        dArr[index] = element;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private DoubleArrayList(double[] other, int size, boolean isMutable) {
        super(isMutable);
        this.array = other;
        this.size = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int index) {
        return Double.valueOf(getDouble(index));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Double> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.size) {
            return new DoubleArrayList(Arrays.copyOf(this.array, capacity), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        double[] dArr = this.array;
        double d11 = dArr[index];
        if (index < this.size - 1) {
            System.arraycopy(dArr, index + 1, dArr, index, (r3 - index) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double set(int index, Double element) {
        return Double.valueOf(setDouble(index, element.doubleValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double element) {
        addDouble(element.doubleValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, Double element) {
        addDouble(index, element.doubleValue());
    }

    private void addDouble(int index, double element) {
        int i11;
        ensureIsMutable();
        if (index >= 0 && index <= (i11 = this.size)) {
            double[] dArr = this.array;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, index, dArr, index + 1, i11 - index);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, index);
                System.arraycopy(this.array, index, dArr2, index + 1, this.size - index);
                this.array = dArr2;
            }
            this.array[index] = element;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
