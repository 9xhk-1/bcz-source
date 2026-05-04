package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {
    public static final int $stable = 8;

    @k
    private final T[] tail;

    @k
    private final TrieIterator<T> trieIterator;

    public PersistentVectorIterator(@k Object[] objArr, @k T[] tArr, int i11, int i12, int i13) {
        super(i11, i12);
        this.tail = tArr;
        int rootSize = UtilsKt.rootSize(i12);
        this.trieIterator = new TrieIterator<>(objArr, u.B(i11, rootSize), rootSize, i13);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        checkHasNext$runtime_release();
        if (this.trieIterator.hasNext()) {
            setIndex(getIndex() + 1);
            return this.trieIterator.next();
        }
        T[] tArr = this.tail;
        int index = getIndex();
        setIndex(index + 1);
        return tArr[index - this.trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        checkHasPrevious$runtime_release();
        if (getIndex() <= this.trieIterator.getSize()) {
            setIndex(getIndex() - 1);
            return this.trieIterator.previous();
        }
        T[] tArr = this.tail;
        setIndex(getIndex() - 1);
        return tArr[getIndex() - this.trieIterator.getSize()];
    }
}
