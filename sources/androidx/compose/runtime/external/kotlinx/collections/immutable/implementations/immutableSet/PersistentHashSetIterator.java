package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import a00.h0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m80.k;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class PersistentHashSetIterator<E> implements Iterator<E>, a {
    public static final int $stable = 8;
    private boolean hasNext;

    @k
    private final List<TrieNodeIterator<E>> path;
    private int pathLastIndex;

    public PersistentHashSetIterator(@k TrieNode<E> trieNode) {
        List<TrieNodeIterator<E>> U = h0.U(new TrieNodeIterator());
        this.path = U;
        this.hasNext = true;
        TrieNodeIterator.reset$default(U.get(0), trieNode.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        ensureNextElementIsReady();
    }

    private final void ensureNextElementIsReady() {
        if (this.path.get(this.pathLastIndex).hasNextElement()) {
            return;
        }
        for (int i11 = this.pathLastIndex; -1 < i11; i11--) {
            int moveToNextNodeWithData = moveToNextNodeWithData(i11);
            if (moveToNextNodeWithData == -1 && this.path.get(i11).hasNextCell()) {
                this.path.get(i11).moveToNextCell();
                moveToNextNodeWithData = moveToNextNodeWithData(i11);
            }
            if (moveToNextNodeWithData != -1) {
                this.pathLastIndex = moveToNextNodeWithData;
                return;
            }
            if (i11 > 0) {
                this.path.get(i11 - 1).moveToNextCell();
            }
            this.path.get(i11).reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private final int moveToNextNodeWithData(int i11) {
        if (this.path.get(i11).hasNextElement()) {
            return i11;
        }
        if (!this.path.get(i11).hasNextNode()) {
            return -1;
        }
        TrieNode<? extends E> currentNode = this.path.get(i11).currentNode();
        int i12 = i11 + 1;
        if (i12 == this.path.size()) {
            this.path.add(new TrieNodeIterator<>());
        }
        TrieNodeIterator.reset$default(this.path.get(i12), currentNode.getBuffer(), 0, 2, null);
        return moveToNextNodeWithData(i12);
    }

    public final E currentElement() {
        CommonFunctionsKt.m2064assert(hasNext());
        return this.path.get(this.pathLastIndex).currentElement();
    }

    @k
    public final List<TrieNodeIterator<E>> getPath() {
        return this.path;
    }

    public final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        E nextElement = this.path.get(this.pathLastIndex).nextElement();
        ensureNextElementIsReady();
        return nextElement;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPathLastIndex(int i11) {
        this.pathLastIndex = i11;
    }

    private static /* synthetic */ void getHasNext$annotations() {
    }
}
