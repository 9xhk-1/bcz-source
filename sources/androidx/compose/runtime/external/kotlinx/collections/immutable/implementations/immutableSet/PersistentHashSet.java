package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import a00.k;
import a00.m0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPersistentHashSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,72:1\n31#2:73\n31#2:74\n31#2:75\n31#2:76\n*S KotlinDebug\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n*L\n24#1:73\n34#1:74\n38#1:75\n42#1:76\n*E\n"})
/* loaded from: classes.dex */
public final class PersistentHashSet<E> extends k<E> implements PersistentSet<E> {

    @m80.k
    private final TrieNode<E> node;
    private final int size;

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @m80.k
    private static final PersistentHashSet EMPTY = new PersistentHashSet(TrieNode.Companion.getEMPTY$runtime_release(), 0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @m80.k
        public final <E> PersistentSet<E> emptyOf$runtime_release() {
            return PersistentHashSet.EMPTY;
        }

        private Companion() {
        }
    }

    public PersistentHashSet(@m80.k TrieNode<E> trieNode, int i11) {
        this.node = trieNode;
        this.size = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((PersistentHashSet<E>) obj);
    }

    @Override // a00.b, java.util.Collection
    public boolean contains(Object obj) {
        return this.node.contains(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // a00.b, java.util.Collection
    public boolean containsAll(@m80.k Collection<? extends Object> collection) {
        return collection instanceof PersistentHashSet ? this.node.containsAll(((PersistentHashSet) collection).node, 0) : collection instanceof PersistentHashSetBuilder ? this.node.containsAll(((PersistentHashSetBuilder) collection).getNode$runtime_release(), 0) : super.containsAll(collection);
    }

    @m80.k
    public final TrieNode<E> getNode$runtime_release() {
        return this.node;
    }

    @Override // a00.b
    public int getSize() {
        return this.size;
    }

    @Override // a00.k, a00.b, java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<E> iterator() {
        return new PersistentHashSetIterator(this.node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection remove(Object obj) {
        return remove((PersistentHashSet<E>) obj);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @m80.k
    public PersistentSet<E> add(E e11) {
        TrieNode<E> add = this.node.add(e11 != null ? e11.hashCode() : 0, e11, 0);
        return this.node == add ? this : new PersistentHashSet(add, size() + 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @m80.k
    public PersistentSet<E> addAll(@m80.k Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @m80.k
    public PersistentSet.Builder<E> builder() {
        return new PersistentHashSetBuilder(this);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @m80.k
    public PersistentSet<E> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @m80.k
    public PersistentSet<E> remove(E e11) {
        TrieNode<E> remove = this.node.remove(e11 != null ? e11.hashCode() : 0, e11, 0);
        return this.node == remove ? this : new PersistentHashSet(remove, size() - 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @m80.k
    public PersistentSet<E> retainAll(@m80.k Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.retainAll(collection);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @m80.k
    public PersistentSet<E> removeAll(@m80.k Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.removeAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @m80.k
    public PersistentSet<E> removeAll(@m80.k l<? super E, Boolean> lVar) {
        PersistentSet.Builder<E> builder = builder();
        m0.I0(builder, lVar);
        return builder.build();
    }
}
