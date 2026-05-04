package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.x0;
import m80.k;
import m80.l;
import y00.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, d {
    public static final int $stable = 8;

    @k
    private final PersistentHashMapBuilder<K, V> builder;
    private int expectedModCount;

    @l
    private K lastIteratedKey;
    private boolean nextWasInvoked;

    public PersistentHashMapBuilderBaseIterator(@k PersistentHashMapBuilder<K, V> persistentHashMapBuilder, @k TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.getNode$runtime_release(), trieNodeBaseIteratorArr);
        this.builder = persistentHashMapBuilder;
        this.expectedModCount = persistentHashMapBuilder.getModCount$runtime_release();
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

    private final void resetPath(int i11, TrieNode<?, ?> trieNode, K k11, int i12) {
        int i13 = i12 * 5;
        if (i13 > 30) {
            getPath()[i12].reset(trieNode.getBuffer$runtime_release(), trieNode.getBuffer$runtime_release().length, 0);
            while (!g0.g(getPath()[i12].currentKey(), k11)) {
                getPath()[i12].moveToNextKey();
            }
            setPathLastIndex(i12);
            return;
        }
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i13);
        if (trieNode.hasEntryAt$runtime_release(indexSegment)) {
            getPath()[i12].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2, trieNode.entryKeyIndex$runtime_release(indexSegment));
            setPathLastIndex(i12);
        } else {
            int nodeIndex$runtime_release = trieNode.nodeIndex$runtime_release(indexSegment);
            TrieNode<?, ?> nodeAtIndex$runtime_release = trieNode.nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            getPath()[i12].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2, nodeIndex$runtime_release);
            resetPath(i11, nodeAtIndex$runtime_release, k11, i12 + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        this.lastIteratedKey = currentKey();
        this.nextWasInvoked = true;
        return (T) super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext()) {
            K currentKey = currentKey();
            x0.k(this.builder).remove(this.lastIteratedKey);
            resetPath(currentKey != null ? currentKey.hashCode() : 0, this.builder.getNode$runtime_release(), currentKey, 0);
        } else {
            x0.k(this.builder).remove(this.lastIteratedKey);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }

    public final void setValue(K k11, V v11) {
        if (this.builder.containsKey(k11)) {
            if (hasNext()) {
                K currentKey = currentKey();
                this.builder.put(k11, v11);
                resetPath(currentKey != null ? currentKey.hashCode() : 0, this.builder.getNode$runtime_release(), currentKey, 0);
            } else {
                this.builder.put(k11, v11);
            }
            this.expectedModCount = this.builder.getModCount$runtime_release();
        }
    }
}
