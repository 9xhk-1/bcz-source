package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final FloatArrayList EMPTY_LIST = new FloatArrayList(new float[0], 0, false);
    private float[] array;
    private int size;

    public FloatArrayList() {
        this(new float[10], 0, true);
    }

    public static FloatArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i11 = floatArrayList.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        float[] fArr = this.array;
        if (i13 > fArr.length) {
            this.array = Arrays.copyOf(fArr, i13);
        }
        System.arraycopy(floatArrayList.array, 0, this.array, this.size, floatArrayList.size);
        this.size = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public void addFloat(float element) {
        ensureIsMutable();
        int i11 = this.size;
        float[] fArr = this.array;
        if (i11 == fArr.length) {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i12 = this.size;
        this.size = i12 + 1;
        fArr3[i12] = element;
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
        if (!(o11 instanceof FloatArrayList)) {
            return super.equals(o11);
        }
        FloatArrayList floatArrayList = (FloatArrayList) o11;
        if (this.size != floatArrayList.size) {
            return false;
        }
        float[] fArr = floatArrayList.array;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (Float.floatToIntBits(this.array[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public float getFloat(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + Float.floatToIntBits(this.array[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) element).floatValue();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.array[i11] == floatValue) {
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
        float[] fArr = this.array;
        System.arraycopy(fArr, toIndex, fArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public float setFloat(int index, float element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        float[] fArr = this.array;
        float f11 = fArr[index];
        fArr[index] = element;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private FloatArrayList(float[] other, int size, boolean isMutable) {
        super(isMutable);
        this.array = other;
        this.size = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int index) {
        return Float.valueOf(getFloat(index));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Float> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.size) {
            return new FloatArrayList(Arrays.copyOf(this.array, capacity), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        float[] fArr = this.array;
        float f11 = fArr[index];
        if (index < this.size - 1) {
            System.arraycopy(fArr, index + 1, fArr, index, (r2 - index) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float set(int index, Float element) {
        return Float.valueOf(setFloat(index, element.floatValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float element) {
        addFloat(element.floatValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, Float element) {
        addFloat(index, element.floatValue());
    }

    private void addFloat(int index, float element) {
        int i11;
        ensureIsMutable();
        if (index >= 0 && index <= (i11 = this.size)) {
            float[] fArr = this.array;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, index, fArr, index + 1, i11 - index);
            } else {
                float[] fArr2 = new float[((i11 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, index);
                System.arraycopy(this.array, index, fArr2, index + 1, this.size - index);
                this.array = fArr2;
            }
            this.array[index] = element;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
