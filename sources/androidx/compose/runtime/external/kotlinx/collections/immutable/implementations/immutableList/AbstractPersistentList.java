package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import a00.d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
@u0({"SMAP\nAbstractPersistentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n41#2:61\n41#2:62\n1726#3,3:63\n*S KotlinDebug\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n*L\n18#1:61\n22#1:62\n50#1:63,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class AbstractPersistentList<E> extends d<E> implements PersistentList<E> {
    public static final int $stable = 0;

    @Override // a00.b, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // a00.b, java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // a00.d, a00.b, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // a00.d, java.util.List
    @k
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection remove(Object obj) {
        return remove((AbstractPersistentList<E>) obj);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    public PersistentList<E> addAll(@k Collection<? extends E> collection) {
        PersistentList.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    public PersistentList<E> clear() {
        return UtilsKt.persistentVectorOf();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    public PersistentList<E> remove(E e11) {
        int indexOf = indexOf(e11);
        return indexOf != -1 ? removeAt(indexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    public PersistentList<E> removeAll(@k final Collection<? extends E> collection) {
        return removeAll((l) new l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList$removeAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final Boolean invoke(E e11) {
                return Boolean.valueOf(collection.contains(e11));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((AbstractPersistentList$removeAll$1<E>) obj);
            }
        });
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    public PersistentList<E> retainAll(@k final Collection<? extends E> collection) {
        return removeAll((l) new l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList$retainAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final Boolean invoke(E e11) {
                return Boolean.valueOf(!collection.contains(e11));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((AbstractPersistentList$retainAll$1<E>) obj);
            }
        });
    }

    @Override // a00.d, java.util.List
    @k
    public ImmutableList<E> subList(int i11, int i12) {
        return super.subList(i11, i12);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @k
    public PersistentList<E> addAll(int i11, @k Collection<? extends E> collection) {
        PersistentList.Builder<E> builder = builder();
        builder.addAll(i11, collection);
        return builder.build();
    }
}
