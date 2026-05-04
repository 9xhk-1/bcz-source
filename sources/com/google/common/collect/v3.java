package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class v3<C extends Comparable> extends ContiguousSet<C> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static final class b<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final t3<C> f34030a;

        private Object readResolve() {
            return new v3(this.f34030a);
        }

        public b(t3<C> domain) {
            this.f34030a = domain;
        }
    }

    public v3(t3<C> domain) {
        super(domain);
    }

    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C first() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList<C> asList() {
        return ImmutableList.of();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C last() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object object) {
        return false;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    @go.c
    public ImmutableSortedSet<C> createDescendingSet() {
        return ImmutableSortedSet.emptySet(s7.z().F());
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object object) {
        if (object instanceof Set) {
            return ((Set) object).isEmpty();
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> headSetImpl(C toElement, boolean inclusive) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @go.c
    public int indexOf(@CheckForNull Object target) {
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableSet
    @go.c
    public boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range() {
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> subSetImpl(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> tailSetImpl(C fromElement, boolean fromInclusive) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet, java.util.AbstractCollection
    public String toString() {
        return okhttp3.i.f77289p;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public Object writeReplace() {
        return new b(this.domain);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @go.c
    public aa<C> descendingIterator() {
        return l6.t();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public aa<C> iterator() {
        return l6.t();
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range(BoundType lowerBoundType, BoundType upperBoundType) {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> intersection(ContiguousSet<C> other) {
        return this;
    }
}
