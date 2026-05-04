package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public final class t5<E extends Enum<E>> extends ImmutableSet<E> {

    /* renamed from: a, reason: collision with root package name */
    public final transient EnumSet<E> f33869a;

    /* renamed from: b, reason: collision with root package name */
    @vo.b
    public transient int f33870b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    public static class b<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final EnumSet<E> f33871a;

        public b(EnumSet<E> delegate) {
            this.f33871a = delegate;
        }

        public Object readResolve() {
            return new t5(this.f33871a.clone());
        }
    }

    public static <E extends Enum<E>> ImmutableSet<E> a(EnumSet<E> set) {
        int size = set.size();
        return size != 0 ? size != 1 ? new t5(set) : ImmutableSet.of((Enum) k6.z(set)) : ImmutableSet.of();
    }

    @go.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object object) {
        return this.f33869a.contains(object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof t5) {
            collection = ((t5) collection).f33869a;
        }
        return this.f33869a.containsAll(collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof t5) {
            object = ((t5) object).f33869a;
        }
        return this.f33869a.equals(object);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        int i11 = this.f33870b;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = this.f33869a.hashCode();
        this.f33870b = hashCode;
        return hashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f33869a.isEmpty();
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f33869a.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f33869a.toString();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @go.d
    public Object writeReplace() {
        return new b(this.f33869a);
    }

    public t5(EnumSet<E> delegate) {
        this.f33869a = delegate;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public aa<E> iterator() {
        return l6.e0(this.f33869a.iterator());
    }
}
