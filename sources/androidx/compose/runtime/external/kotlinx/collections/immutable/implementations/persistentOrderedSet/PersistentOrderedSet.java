package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import a00.k;
import a00.m0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPersistentOrderedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,109:1\n31#2:110\n31#2:111\n31#2:112\n31#2:113\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n*L\n56#1:110\n81#1:111\n85#1:112\n89#1:113\n*E\n"})
/* loaded from: classes.dex */
public final class PersistentOrderedSet<E> extends k<E> implements PersistentSet<E> {

    @m80.k
    private static final PersistentOrderedSet EMPTY;

    @l
    private final Object firstElement;

    @m80.k
    private final PersistentHashMap<E, Links> hashMap;

    @l
    private final Object lastElement;

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @m80.k
        public final <E> PersistentSet<E> emptyOf$runtime_release() {
            return PersistentOrderedSet.EMPTY;
        }

        private Companion() {
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        EMPTY = new PersistentOrderedSet(endOfChain, endOfChain, PersistentHashMap.Companion.emptyOf$runtime_release());
    }

    public PersistentOrderedSet(@l Object obj, @l Object obj2, @m80.k PersistentHashMap<E, Links> persistentHashMap) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = persistentHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((PersistentOrderedSet<E>) obj);
    }

    @Override // a00.b, java.util.Collection
    public boolean contains(Object obj) {
        return this.hashMap.containsKey(obj);
    }

    @l
    public final Object getFirstElement$runtime_release() {
        return this.firstElement;
    }

    @m80.k
    public final PersistentHashMap<E, Links> getHashMap$runtime_release() {
        return this.hashMap;
    }

    @l
    public final Object getLastElement$runtime_release() {
        return this.lastElement;
    }

    @Override // a00.b
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // a00.k, a00.b, java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<E> iterator() {
        return new PersistentOrderedSetIterator(this.firstElement, this.hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection remove(Object obj) {
        return remove((PersistentOrderedSet<E>) obj);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @m80.k
    public PersistentSet<E> add(E e11) {
        if (this.hashMap.containsKey(e11)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(e11, e11, this.hashMap.put((PersistentHashMap<E, Links>) e11, (E) new Links()));
        }
        Object obj = this.lastElement;
        Object obj2 = this.hashMap.get(obj);
        g0.m(obj2);
        return new PersistentOrderedSet(this.firstElement, e11, this.hashMap.put((PersistentHashMap<E, Links>) obj, (Object) ((Links) obj2).withNext(e11)).put((PersistentHashMap) e11, (E) new Links(obj)));
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
        return new PersistentOrderedSetBuilder(this);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @m80.k
    public PersistentSet<E> clear() {
        return Companion.emptyOf$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @m80.k
    public PersistentSet<E> remove(E e11) {
        Links links = this.hashMap.get(e11);
        if (links == null) {
            return this;
        }
        PersistentHashMap remove = this.hashMap.remove((PersistentHashMap<E, Links>) e11);
        if (links.getHasPrevious()) {
            V v11 = remove.get(links.getPrevious());
            g0.m(v11);
            remove = remove.put((PersistentHashMap) links.getPrevious(), (Object) ((Links) v11).withNext(links.getNext()));
        }
        if (links.getHasNext()) {
            V v12 = remove.get(links.getNext());
            g0.m(v12);
            remove = remove.put((PersistentHashMap) links.getNext(), (Object) ((Links) v12).withPrevious(links.getPrevious()));
        }
        return new PersistentOrderedSet(!links.getHasPrevious() ? links.getNext() : this.firstElement, !links.getHasNext() ? links.getPrevious() : this.lastElement, remove);
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
    public PersistentSet<E> removeAll(@m80.k x00.l<? super E, Boolean> lVar) {
        PersistentSet.Builder<E> builder = builder();
        m0.I0(builder, lVar);
        return builder.build();
    }
}
