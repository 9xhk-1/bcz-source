package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TrieNodeIterator<E> {
    public static final int $stable = 8;

    @k
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer();
    private int index;

    public static /* synthetic */ void reset$default(TrieNodeIterator trieNodeIterator, Object[] objArr, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        trieNodeIterator.reset(objArr, i11);
    }

    public final E currentElement() {
        CommonFunctionsKt.m2064assert(hasNextElement());
        return (E) this.buffer[this.index];
    }

    @k
    public final TrieNode<? extends E> currentNode() {
        CommonFunctionsKt.m2064assert(hasNextNode());
        Object obj = this.buffer[this.index];
        g0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (TrieNode) obj;
    }

    public final boolean hasNextCell() {
        return this.index < this.buffer.length;
    }

    public final boolean hasNextElement() {
        return hasNextCell() && !(this.buffer[this.index] instanceof TrieNode);
    }

    public final boolean hasNextNode() {
        return hasNextCell() && (this.buffer[this.index] instanceof TrieNode);
    }

    public final void moveToNextCell() {
        CommonFunctionsKt.m2064assert(hasNextCell());
        this.index++;
    }

    public final E nextElement() {
        CommonFunctionsKt.m2064assert(hasNextElement());
        Object[] objArr = this.buffer;
        int i11 = this.index;
        this.index = i11 + 1;
        return (E) objArr[i11];
    }

    public final void reset(@k Object[] objArr, int i11) {
        this.buffer = objArr;
        this.index = i11;
    }
}
