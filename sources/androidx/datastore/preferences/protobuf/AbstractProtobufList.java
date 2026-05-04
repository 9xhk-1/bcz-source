package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
abstract class AbstractProtobufList<E> extends AbstractList<E> implements Internal.ProtobufList<E> {
    protected static final int DEFAULT_CAPACITY = 10;
    private boolean isMutable;

    public AbstractProtobufList() {
        this(true);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        ensureIsMutable();
        return super.add(e11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> c11) {
        ensureIsMutable();
        return super.addAll(c11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        super.clear();
    }

    public void ensureIsMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o11) {
        if (o11 == this) {
            return true;
        }
        if (!(o11 instanceof List)) {
            return false;
        }
        if (!(o11 instanceof RandomAccess)) {
            return super.equals(o11);
        }
        List list = (List) o11;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (!get(i11).equals(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = (i11 * 31) + get(i12).hashCode();
        }
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public boolean isModifiable() {
        return this.isMutable;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i11) {
        ensureIsMutable();
        return (E) super.remove(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> c11) {
        ensureIsMutable();
        return super.removeAll(c11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> c11) {
        ensureIsMutable();
        return super.retainAll(c11);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        ensureIsMutable();
        return (E) super.set(i11, e11);
    }

    public AbstractProtobufList(boolean isMutable) {
        this.isMutable = isMutable;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        ensureIsMutable();
        super.add(index, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> c11) {
        ensureIsMutable();
        return super.addAll(index, c11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object o11) {
        ensureIsMutable();
        int indexOf = indexOf(o11);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
