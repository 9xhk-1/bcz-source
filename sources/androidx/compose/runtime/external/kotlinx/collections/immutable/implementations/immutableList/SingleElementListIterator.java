package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SingleElementListIterator<E> extends AbstractListIterator<E> {
    public static final int $stable = 0;
    private final E element;

    public SingleElementListIterator(E e11, int i11) {
        super(i11, 1);
        this.element = e11;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        checkHasNext$runtime_release();
        setIndex(getIndex() + 1);
        return this.element;
    }

    @Override // java.util.ListIterator
    public E previous() {
        checkHasPrevious$runtime_release();
        setIndex(getIndex() - 1);
        return this.element;
    }
}
