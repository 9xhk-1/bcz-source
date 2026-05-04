package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final ProtobufArrayList<Object> EMPTY_LIST = new ProtobufArrayList<>(new Object[0], 0, false);
    private E[] array;
    private int size;

    public ProtobufArrayList() {
        this(new Object[10], 0, true);
    }

    private static <E> E[] createArray(int i11) {
        return (E[]) new Object[i11];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.size;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        ensureIsMutable();
        int i11 = this.size;
        E[] eArr = this.array;
        if (i11 == eArr.length) {
            this.array = (E[]) Arrays.copyOf(eArr, ((i11 * 3) / 2) + 1);
        }
        E[] eArr2 = this.array;
        int i12 = this.size;
        this.size = i12 + 1;
        eArr2[i12] = e11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        E[] eArr = this.array;
        E e11 = eArr[index];
        if (index < this.size - 1) {
            System.arraycopy(eArr, index + 1, eArr, index, (r2 - index) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        E[] eArr = this.array;
        E e11 = eArr[index];
        eArr[index] = element;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private ProtobufArrayList(E[] array, int size, boolean isMutable) {
        super(isMutable);
        this.array = array;
        this.size = size;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public ProtobufArrayList<E> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.size) {
            return new ProtobufArrayList<>(Arrays.copyOf(this.array, capacity), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        int i12;
        ensureIsMutable();
        if (i11 >= 0 && i11 <= (i12 = this.size)) {
            E[] eArr = this.array;
            if (i12 < eArr.length) {
                System.arraycopy(eArr, i11, eArr, i11 + 1, i12 - i11);
            } else {
                E[] eArr2 = (E[]) createArray(((i12 * 3) / 2) + 1);
                System.arraycopy(this.array, 0, eArr2, 0, i11);
                System.arraycopy(this.array, i11, eArr2, i11 + 1, this.size - i11);
                this.array = eArr2;
            }
            this.array[i11] = e11;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i11));
    }
}
