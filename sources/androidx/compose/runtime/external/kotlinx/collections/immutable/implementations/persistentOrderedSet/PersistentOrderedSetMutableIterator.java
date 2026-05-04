package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.x0;
import m80.k;
import m80.l;
import y00.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedSetMutableIterator<E> extends PersistentOrderedSetIterator<E> implements Iterator<E>, d {
    public static final int $stable = 8;

    @k
    private final PersistentOrderedSetBuilder<E> builder;
    private int expectedModCount;

    @l
    private E lastIteratedElement;
    private boolean nextWasInvoked;

    public PersistentOrderedSetMutableIterator(@k PersistentOrderedSetBuilder<E> persistentOrderedSetBuilder) {
        super(persistentOrderedSetBuilder.getFirstElement$runtime_release(), persistentOrderedSetBuilder.getHashMapBuilder$runtime_release());
        this.builder = persistentOrderedSetBuilder;
        this.expectedModCount = persistentOrderedSetBuilder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator, java.util.Iterator
    public E next() {
        checkForComodification();
        E e11 = (E) super.next();
        this.lastIteratedElement = e11;
        this.nextWasInvoked = true;
        return e11;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        x0.a(this.builder).remove(this.lastIteratedElement);
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        setIndex$runtime_release(getIndex$runtime_release() - 1);
    }
}
