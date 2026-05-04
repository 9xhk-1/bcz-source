package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m80.k;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, a {
    public static final int $stable = 8;
    private boolean hasNext = true;

    @k
    private final TrieNodeBaseIterator<K, V, T>[] path;
    private int pathLastIndex;

    public PersistentHashMapBaseIterator(@k TrieNode<K, V> trieNode, @k TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        this.path = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2);
        this.pathLastIndex = 0;
        ensureNextEntryIsReady();
    }

    private final void checkHasNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void ensureNextEntryIsReady() {
        if (this.path[this.pathLastIndex].hasNextKey()) {
            return;
        }
        for (int i11 = this.pathLastIndex; -1 < i11; i11--) {
            int moveToNextNodeWithData = moveToNextNodeWithData(i11);
            if (moveToNextNodeWithData == -1 && this.path[i11].hasNextNode()) {
                this.path[i11].moveToNextNode();
                moveToNextNodeWithData = moveToNextNodeWithData(i11);
            }
            if (moveToNextNodeWithData != -1) {
                this.pathLastIndex = moveToNextNodeWithData;
                return;
            }
            if (i11 > 0) {
                this.path[i11 - 1].moveToNextNode();
            }
            this.path[i11].reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release(), 0);
        }
        this.hasNext = false;
    }

    private final int moveToNextNodeWithData(int i11) {
        if (this.path[i11].hasNextKey()) {
            return i11;
        }
        if (!this.path[i11].hasNextNode()) {
            return -1;
        }
        TrieNode<? extends K, ? extends V> currentNode = this.path[i11].currentNode();
        if (i11 == 6) {
            this.path[i11 + 1].reset(currentNode.getBuffer$runtime_release(), currentNode.getBuffer$runtime_release().length);
        } else {
            this.path[i11 + 1].reset(currentNode.getBuffer$runtime_release(), currentNode.entryCount$runtime_release() * 2);
        }
        return moveToNextNodeWithData(i11 + 1);
    }

    public final K currentKey() {
        checkHasNext();
        return this.path[this.pathLastIndex].currentKey();
    }

    @k
    public final TrieNodeBaseIterator<K, V, T>[] getPath() {
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
    public T next() {
        checkHasNext();
        T next = this.path[this.pathLastIndex].next();
        ensureNextEntryIsReady();
        return next;
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
