package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public final class i8<E> extends ImmutableSortedSet<E> {

    /* renamed from: b, reason: collision with root package name */
    public static final i8<Comparable> f33548b = new i8<>(ImmutableList.of(), s7.z());

    /* renamed from: a, reason: collision with root package name */
    @go.e
    public final transient ImmutableList<E> f33549a;

    public i8(ImmutableList<E> elements, Comparator<? super E> comparator) {
        super(comparator);
        this.f33549a = elements;
    }

    public i8<E> a(int newFromIndex, int newToIndex) {
        return (newFromIndex == 0 && newToIndex == size()) ? this : newFromIndex < newToIndex ? new i8<>(this.f33549a.subList(newFromIndex, newToIndex), this.comparator) : ImmutableSortedSet.emptySet(this.comparator);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        return this.f33549a;
    }

    public int b(E toElement, boolean inclusive) {
        int binarySearch = Collections.binarySearch(this.f33549a, Preconditions.checkNotNull(toElement), comparator());
        return binarySearch >= 0 ? inclusive ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E ceiling(E element) {
        int d11 = d(element, true);
        if (d11 == size()) {
            return null;
        }
        return this.f33549a.get(d11);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object o11) {
        if (o11 != null) {
            try {
                if (f(o11) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> targets) {
        if (targets instanceof j7) {
            targets = ((j7) targets).elementSet();
        }
        if (!u8.b(comparator(), targets) || targets.size() <= 1) {
            return super.containsAll(targets);
        }
        aa<E> it = iterator();
        Iterator<?> it2 = targets.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int unsafeCompare = unsafeCompare(next2, next);
                if (unsafeCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (unsafeCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (unsafeCompare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] dst, int offset) {
        return this.f33549a.copyIntoArray(dst, offset);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> createDescendingSet() {
        Comparator reverseOrder = Collections.reverseOrder(this.comparator);
        return isEmpty() ? ImmutableSortedSet.emptySet(reverseOrder) : new i8(this.f33549a.reverse(), reverseOrder);
    }

    public int d(E fromElement, boolean inclusive) {
        int binarySearch = Collections.binarySearch(this.f33549a, Preconditions.checkNotNull(fromElement), comparator());
        return binarySearch >= 0 ? inclusive ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set set = (Set) object;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!u8.b(this.comparator, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            aa<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || unsafeCompare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    public final int f(Object key) throws ClassCastException {
        return Collections.binarySearch(this.f33549a, key, g());
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f33549a.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E floor(E element) {
        int b11 = b(element, true) - 1;
        if (b11 == -1) {
            return null;
        }
        return this.f33549a.get(b11);
    }

    public Comparator<Object> g() {
        return this.comparator;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> headSetImpl(E toElement, boolean inclusive) {
        return a(0, b(toElement, inclusive));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E higher(E element) {
        int d11 = d(element, false);
        if (d11 == size()) {
            return null;
        }
        return this.f33549a.get(d11);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public int indexOf(@CheckForNull Object target) {
        int binarySearch;
        if (target == null) {
            return -1;
        }
        try {
            binarySearch = Collections.binarySearch(this.f33549a, target, g());
        } catch (ClassCastException unused) {
        }
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection
    @CheckForNull
    public Object[] internalArray() {
        return this.f33549a.internalArray();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.f33549a.internalArrayEnd();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return this.f33549a.internalArrayStart();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.f33549a.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f33549a.get(size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E lower(E element) {
        int b11 = b(element, false) - 1;
        if (b11 == -1) {
            return null;
        }
        return this.f33549a.get(b11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f33549a.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> subSetImpl(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        return tailSetImpl(fromElement, fromInclusive).headSetImpl(toElement, toInclusive);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> tailSetImpl(E fromElement, boolean inclusive) {
        return a(d(fromElement, inclusive), size());
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @go.c
    public aa<E> descendingIterator() {
        return this.f33549a.reverse().iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public aa<E> iterator() {
        return this.f33549a.iterator();
    }
}
