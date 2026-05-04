package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import a00.a0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
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
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E>, d {
    public static final int $stable = 8;

    @k
    private final PersistentHashSetBuilder<E> builder;
    private int expectedModCount;

    @l
    private E lastIteratedElement;
    private boolean nextWasInvoked;

    public PersistentHashSetMutableIterator(@k PersistentHashSetBuilder<E> persistentHashSetBuilder) {
        super(persistentHashSetBuilder.getNode$runtime_release());
        this.builder = persistentHashSetBuilder;
        this.expectedModCount = persistentHashSetBuilder.getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.builder.getModCount$runtime_release() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final boolean isCollision(TrieNode<?> trieNode) {
        return trieNode.getBitmap() == 0;
    }

    private final void resetPath(int i11, TrieNode<?> trieNode, E e11, int i12) {
        if (isCollision(trieNode)) {
            int bg2 = a0.bg(trieNode.getBuffer(), e11);
            CommonFunctionsKt.m2064assert(bg2 != -1);
            getPath().get(i12).reset(trieNode.getBuffer(), bg2);
            setPathLastIndex(i12);
            return;
        }
        int indexOfCellAt$runtime_release = trieNode.indexOfCellAt$runtime_release(1 << TrieNodeKt.indexSegment(i11, i12 * 5));
        getPath().get(i12).reset(trieNode.getBuffer(), indexOfCellAt$runtime_release);
        Object obj = trieNode.getBuffer()[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            resetPath(i11, (TrieNode) obj, e11, i12 + 1);
        } else {
            setPathLastIndex(i12);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public E next() {
        checkForComodification();
        E e11 = (E) super.next();
        this.lastIteratedElement = e11;
        this.nextWasInvoked = true;
        return e11;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext()) {
            E currentElement = currentElement();
            x0.a(this.builder).remove(this.lastIteratedElement);
            resetPath(currentElement != null ? currentElement.hashCode() : 0, this.builder.getNode$runtime_release(), currentElement, 0);
        } else {
            x0.a(this.builder).remove(this.lastIteratedElement);
        }
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }
}
