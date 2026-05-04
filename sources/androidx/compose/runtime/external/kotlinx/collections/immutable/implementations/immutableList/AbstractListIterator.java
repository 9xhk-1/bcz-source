package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class AbstractListIterator<E> implements ListIterator<E>, a {
    public static final int $stable = 8;
    private int index;
    private int size;

    public AbstractListIterator(int i11, int i12) {
        this.index = i11;
        this.size = i12;
    }

    @Override // java.util.ListIterator
    public void add(E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void checkHasNext$runtime_release() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void checkHasPrevious$runtime_release() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getSize() {
        return this.size;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i11) {
        this.index = i11;
    }

    public final void setSize(int i11) {
        this.size = i11;
    }
}
