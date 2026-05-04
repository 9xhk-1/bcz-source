package com.google.common.collect;

import com.google.common.collect.j7;
import com.google.common.collect.k7;
import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class z8 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<E> extends k7.h<E> implements SortedSet<E> {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final x8<E> f34161a;

        public a(x8<E> multiset) {
            this.f34161a = multiset;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return g().comparator();
        }

        @Override // java.util.SortedSet
        @t7
        public E first() {
            return (E) z8.d(g().firstEntry());
        }

        @Override // com.google.common.collect.k7.h
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final x8<E> g() {
            return this.f34161a;
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@t7 E toElement) {
            return g().headMultiset(toElement, BoundType.OPEN).elementSet();
        }

        @Override // com.google.common.collect.k7.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return k7.h(g().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        @t7
        public E last() {
            return (E) z8.d(g().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@t7 E fromElement, @t7 E toElement) {
            return g().subMultiset(fromElement, BoundType.CLOSED, toElement, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@t7 E fromElement) {
            return g().tailMultiset(fromElement, BoundType.CLOSED).elementSet();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static class b<E> extends a<E> implements NavigableSet<E> {
        public b(x8<E> multiset) {
            super(multiset);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(@t7 E e11) {
            return (E) z8.c(g().tailMultiset(e11, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new b(g().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(@t7 E e11) {
            return (E) z8.c(g().headMultiset(e11, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@t7 E toElement, boolean inclusive) {
            return new b(g().headMultiset(toElement, BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(@t7 E e11) {
            return (E) z8.c(g().tailMultiset(e11, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(@t7 E e11) {
            return (E) z8.c(g().headMultiset(e11, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            return (E) z8.c(g().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            return (E) z8.c(g().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@t7 E fromElement, boolean fromInclusive, @t7 E toElement, boolean toInclusive) {
            return new b(g().subMultiset(fromElement, BoundType.forBoolean(fromInclusive), toElement, BoundType.forBoolean(toInclusive)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@t7 E fromElement, boolean inclusive) {
            return new b(g().tailMultiset(fromElement, BoundType.forBoolean(inclusive)));
        }
    }

    @CheckForNull
    public static <E> E c(@CheckForNull j7.a<E> entry) {
        if (entry == null) {
            return null;
        }
        return entry.e();
    }

    public static <E> E d(@CheckForNull j7.a<E> entry) {
        if (entry != null) {
            return entry.e();
        }
        throw new NoSuchElementException();
    }
}
