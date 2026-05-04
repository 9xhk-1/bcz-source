package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import a00.j;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentHashSetBuilder<E> extends j<E> implements PersistentSet.Builder<E> {
    public static final int $stable = 8;
    private int modCount;

    @k
    private TrieNode<E> node;

    @k
    private MutabilityOwnership ownership = new MutabilityOwnership();

    @k
    private PersistentHashSet<E> set;
    private int size;

    public PersistentHashSetBuilder(@k PersistentHashSet<E> persistentHashSet) {
        this.set = persistentHashSet;
        this.node = this.set.getNode$runtime_release();
        this.size = this.set.size();
    }

    @Override // a00.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e11) {
        int size = size();
        this.node = this.node.mutableAdd(e11 != null ? e11.hashCode() : 0, e11, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@k Collection<? extends E> collection) {
        PersistentHashSet<E> persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSet = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        }
        if (persistentHashSet == null) {
            return super.addAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        TrieNode<E> mutableAddAll = this.node.mutableAddAll(persistentHashSet.getNode$runtime_release(), 0, deltaCounter, this);
        int size2 = (collection.size() + size) - deltaCounter.getCount();
        if (size != size2) {
            this.node = mutableAddAll;
            setSize(size2);
        }
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        TrieNode<E> eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        g0.n(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.node = eMPTY$runtime_release;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.node.contains(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@k Collection<? extends Object> collection) {
        return collection instanceof PersistentHashSet ? this.node.containsAll(((PersistentHashSet) collection).getNode$runtime_release(), 0) : collection instanceof PersistentHashSetBuilder ? this.node.containsAll(((PersistentHashSetBuilder) collection).node, 0) : super.containsAll(collection);
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    @k
    public final TrieNode<E> getNode$runtime_release() {
        return this.node;
    }

    @k
    public final MutabilityOwnership getOwnership$runtime_release() {
        return this.ownership;
    }

    @Override // a00.j
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public Iterator<E> iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int size = size();
        this.node = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@k Collection<? extends Object> collection) {
        PersistentHashSet<E> persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSet = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        }
        if (persistentHashSet == null) {
            return super.removeAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        Object mutableRemoveAll = this.node.mutableRemoveAll(persistentHashSet.getNode$runtime_release(), 0, deltaCounter, this);
        int count = size - deltaCounter.getCount();
        if (count == 0) {
            clear();
        } else if (count != size) {
            g0.n(mutableRemoveAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.node = (TrieNode) mutableRemoveAll;
            setSize(count);
        }
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@k Collection<? extends Object> collection) {
        PersistentHashSet<E> persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSet = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        }
        if (persistentHashSet == null) {
            return super.retainAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        Object mutableRetainAll = this.node.mutableRetainAll(persistentHashSet.getNode$runtime_release(), 0, deltaCounter, this);
        int count = deltaCounter.getCount();
        if (count == 0) {
            clear();
        } else if (count != size) {
            g0.n(mutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.node = (TrieNode) mutableRetainAll;
            setSize(count);
        }
        return size != size();
    }

    public void setSize(int i11) {
        this.size = i11;
        this.modCount++;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @k
    public PersistentHashSet<E> build() {
        PersistentHashSet<E> persistentHashSet;
        if (this.node == this.set.getNode$runtime_release()) {
            persistentHashSet = this.set;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashSet = new PersistentHashSet<>(this.node, size());
        }
        this.set = persistentHashSet;
        return persistentHashSet;
    }
}
