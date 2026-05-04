package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import m80.k;
import x00.l;
import y00.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PersistentCollection<E> extends ImmutableCollection<E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Builder<E> extends Collection<E>, b {
        @k
        PersistentCollection<E> build();
    }

    @Override // java.util.Collection
    @k
    PersistentCollection<E> add(E e11);

    @Override // java.util.Collection
    @k
    PersistentCollection<E> addAll(@k Collection<? extends E> collection);

    @k
    Builder<E> builder();

    @Override // java.util.Collection
    @k
    PersistentCollection<E> clear();

    @Override // java.util.Collection
    @k
    PersistentCollection<E> remove(E e11);

    @Override // java.util.Collection
    @k
    PersistentCollection<E> removeAll(@k Collection<? extends E> collection);

    @k
    PersistentCollection<E> removeAll(@k l<? super E, Boolean> lVar);

    @Override // java.util.Collection
    @k
    PersistentCollection<E> retainAll(@k Collection<? extends E> collection);
}
