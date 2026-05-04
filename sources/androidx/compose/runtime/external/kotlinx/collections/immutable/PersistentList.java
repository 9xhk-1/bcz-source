package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Collection;
import java.util.List;
import m80.k;
import x00.l;
import y00.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PersistentList<E> extends ImmutableList<E>, PersistentCollection<E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, e {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
        @k
        PersistentList<E> build();
    }

    @Override // java.util.List
    @k
    PersistentList<E> add(int i11, E e11);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentList<E> add(E e11);

    @Override // java.util.List
    @k
    PersistentList<E> addAll(int i11, @k Collection<? extends E> collection);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentList<E> addAll(@k Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    Builder<E> builder();

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentList<E> clear();

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentList<E> remove(E e11);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentList<E> removeAll(@k Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentList<E> removeAll(@k l<? super E, Boolean> lVar);

    @k
    PersistentList<E> removeAt(int i11);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentList<E> retainAll(@k Collection<? extends E> collection);

    @Override // java.util.List
    @k
    PersistentList<E> set(int i11, E e11);
}
