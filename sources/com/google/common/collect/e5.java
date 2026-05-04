package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class e5<E> extends l4<E> implements Set<E> {
    @Override // com.google.common.collect.l4, com.google.common.collect.c5
    public abstract Set<E> delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object object) {
        return object == this || delegate().equals(object);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean standardEquals(@CheckForNull Object object) {
        return q8.g(this, object);
    }

    public int standardHashCode() {
        return q8.k(this);
    }

    @Override // com.google.common.collect.l4
    public boolean standardRemoveAll(Collection<?> collection) {
        return q8.I(this, (Collection) Preconditions.checkNotNull(collection));
    }
}
