package com.google.common.collect;

import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public final class r3<E> extends ImmutableSortedSet<E> {

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableSortedSet<E> f33809a;

    public r3(ImmutableSortedSet<E> forward) {
        super(s7.i(forward.comparator()).F());
        this.f33809a = forward;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E ceiling(E element) {
        return this.f33809a.floor(element);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object object) {
        return this.f33809a.contains(object);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @go.c("NavigableSet")
    public ImmutableSortedSet<E> createDescendingSet() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E floor(E element) {
        return this.f33809a.ceiling(element);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> headSetImpl(E toElement, boolean inclusive) {
        return this.f33809a.tailSet((ImmutableSortedSet<E>) toElement, inclusive).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E higher(E element) {
        return this.f33809a.lower(element);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public int indexOf(@CheckForNull Object target) {
        int indexOf = this.f33809a.indexOf(target);
        return indexOf == -1 ? indexOf : (size() - 1) - indexOf;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.f33809a.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E lower(E element) {
        return this.f33809a.higher(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f33809a.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> subSetImpl(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        return this.f33809a.subSet((boolean) toElement, toInclusive, (boolean) fromElement, fromInclusive).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> tailSetImpl(E fromElement, boolean inclusive) {
        return this.f33809a.headSet((ImmutableSortedSet<E>) fromElement, inclusive).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @go.d
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @go.c("NavigableSet")
    public aa<E> descendingIterator() {
        return this.f33809a.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @go.c("NavigableSet")
    public ImmutableSortedSet<E> descendingSet() {
        return this.f33809a;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public aa<E> iterator() {
        return this.f33809a.descendingIterator();
    }
}
