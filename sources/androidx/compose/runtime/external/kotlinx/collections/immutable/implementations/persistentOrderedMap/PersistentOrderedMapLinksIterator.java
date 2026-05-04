package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import m80.k;
import m80.l;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, a {
    public static final int $stable = 8;

    @k
    private final Map<K, LinkedValue<V>> hashMap;
    private int index;

    @l
    private Object nextKey;

    public PersistentOrderedMapLinksIterator(@l Object obj, @k Map<K, LinkedValue<V>> map) {
        this.nextKey = obj;
        this.hashMap = map;
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    @l
    public final Object getNextKey$runtime_release() {
        return this.nextKey;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.hashMap.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int i11) {
        this.index = i11;
    }

    public final void setNextKey$runtime_release(@l Object obj) {
        this.nextKey = obj;
    }

    @Override // java.util.Iterator
    @k
    public LinkedValue<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        LinkedValue<V> linkedValue = this.hashMap.get(this.nextKey);
        if (linkedValue != null) {
            LinkedValue<V> linkedValue2 = linkedValue;
            this.index++;
            this.nextKey = linkedValue2.getNext();
            return linkedValue2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
    }
}
