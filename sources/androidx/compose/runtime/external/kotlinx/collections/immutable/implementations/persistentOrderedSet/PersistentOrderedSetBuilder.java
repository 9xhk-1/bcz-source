package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import a00.j;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedSetBuilder<E> extends j<E> implements PersistentSet.Builder<E> {
    public static final int $stable = 8;

    @l
    private Object firstElement;

    @k
    private final PersistentHashMapBuilder<E, Links> hashMapBuilder;

    @l
    private Object lastElement;

    @k
    private PersistentOrderedSet<E> set;

    public PersistentOrderedSetBuilder(@k PersistentOrderedSet<E> persistentOrderedSet) {
        this.set = persistentOrderedSet;
        this.firstElement = persistentOrderedSet.getFirstElement$runtime_release();
        this.lastElement = this.set.getLastElement$runtime_release();
        this.hashMapBuilder = this.set.getHashMap$runtime_release().builder2();
    }

    @Override // a00.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e11) {
        if (this.hashMapBuilder.containsKey(e11)) {
            return false;
        }
        if (isEmpty()) {
            this.firstElement = e11;
            this.lastElement = e11;
            this.hashMapBuilder.put(e11, new Links());
            return true;
        }
        Links links = this.hashMapBuilder.get(this.lastElement);
        g0.m(links);
        this.hashMapBuilder.put(this.lastElement, links.withNext(e11));
        this.hashMapBuilder.put(e11, new Links(this.lastElement));
        this.lastElement = e11;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstElement = endOfChain;
        this.lastElement = endOfChain;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    @l
    public final Object getFirstElement$runtime_release() {
        return this.firstElement;
    }

    @k
    public final PersistentHashMapBuilder<E, Links> getHashMapBuilder$runtime_release() {
        return this.hashMapBuilder;
    }

    @Override // a00.j
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public Iterator<E> iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Links remove = this.hashMapBuilder.remove(obj);
        if (remove == null) {
            return false;
        }
        if (remove.getHasPrevious()) {
            Links links = this.hashMapBuilder.get(remove.getPrevious());
            g0.m(links);
            this.hashMapBuilder.put(remove.getPrevious(), links.withNext(remove.getNext()));
        } else {
            this.firstElement = remove.getNext();
        }
        if (!remove.getHasNext()) {
            this.lastElement = remove.getPrevious();
            return true;
        }
        Links links2 = this.hashMapBuilder.get(remove.getNext());
        g0.m(links2);
        this.hashMapBuilder.put(remove.getNext(), links2.withPrevious(remove.getPrevious()));
        return true;
    }

    public final void setFirstElement$runtime_release(@l Object obj) {
        this.firstElement = obj;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @k
    public PersistentSet<E> build() {
        PersistentOrderedSet<E> persistentOrderedSet;
        PersistentHashMap<E, Links> build2 = this.hashMapBuilder.build2();
        if (build2 == this.set.getHashMap$runtime_release()) {
            CommonFunctionsKt.m2064assert(this.firstElement == this.set.getFirstElement$runtime_release());
            CommonFunctionsKt.m2064assert(this.lastElement == this.set.getLastElement$runtime_release());
            persistentOrderedSet = this.set;
        } else {
            persistentOrderedSet = new PersistentOrderedSet<>(this.firstElement, this.lastElement, build2);
        }
        this.set = persistentOrderedSet;
        return persistentOrderedSet;
    }
}
