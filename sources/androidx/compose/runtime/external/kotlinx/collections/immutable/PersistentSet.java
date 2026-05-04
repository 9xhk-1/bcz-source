package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Collection;
import java.util.Set;
import m80.k;
import x00.l;
import y00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PersistentSet<E> extends ImmutableSet<E>, PersistentCollection<E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, h {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
        @k
        PersistentSet<E> build();
    }

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentSet<E> add(E e11);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentSet<E> addAll(@k Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    Builder<E> builder();

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentSet<E> clear();

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentSet<E> remove(E e11);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentSet<E> removeAll(@k Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentSet<E> removeAll(@k l<? super E, Boolean> lVar);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    PersistentSet<E> retainAll(@k Collection<? extends E> collection);
}
