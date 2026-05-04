package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import m80.k;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, a {
    public static final int $stable = 8;

    @k
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release();
    private int dataSize;
    private int index;

    public final K currentKey() {
        CommonFunctionsKt.m2064assert(hasNextKey());
        return (K) this.buffer[this.index];
    }

    @k
    public final TrieNode<? extends K, ? extends V> currentNode() {
        CommonFunctionsKt.m2064assert(hasNextNode());
        Object obj = this.buffer[this.index];
        g0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (TrieNode) obj;
    }

    @k
    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return hasNextKey();
    }

    public final boolean hasNextKey() {
        return this.index < this.dataSize;
    }

    public final boolean hasNextNode() {
        CommonFunctionsKt.m2064assert(this.index >= this.dataSize);
        return this.index < this.buffer.length;
    }

    public final void moveToNextKey() {
        CommonFunctionsKt.m2064assert(hasNextKey());
        this.index += 2;
    }

    public final void moveToNextNode() {
        CommonFunctionsKt.m2064assert(hasNextNode());
        this.index++;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(@k Object[] objArr, int i11, int i12) {
        this.buffer = objArr;
        this.dataSize = i11;
        this.index = i12;
    }

    public final void setIndex(int i11) {
        this.index = i11;
    }

    public final void reset(@k Object[] objArr, int i11) {
        reset(objArr, i11, 0);
    }
}
