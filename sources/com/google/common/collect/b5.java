package com.google.common.collect;

import com.google.common.collect.q8;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public abstract class b5<E> extends i5<E> implements NavigableSet<E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends q8.g<E> {
        public a() {
            super(b5.this);
        }
    }

    @t7
    public E A() {
        return iterator().next();
    }

    @CheckForNull
    public E B(@t7 E e11) {
        return (E) l6.I(headSet(e11, true).descendingIterator(), null);
    }

    public SortedSet<E> C(@t7 E toElement) {
        return headSet(toElement, false);
    }

    @CheckForNull
    public E D(@t7 E e11) {
        return (E) l6.I(tailSet(e11, false).iterator(), null);
    }

    @t7
    public E F() {
        return descendingIterator().next();
    }

    @CheckForNull
    public E G(@t7 E e11) {
        return (E) l6.I(headSet(e11, false).descendingIterator(), null);
    }

    @CheckForNull
    public E H() {
        return (E) l6.T(iterator());
    }

    @CheckForNull
    public E I() {
        return (E) l6.T(descendingIterator());
    }

    public NavigableSet<E> J(@t7 E fromElement, boolean fromInclusive, @t7 E toElement, boolean toInclusive) {
        return tailSet(fromElement, fromInclusive).headSet(toElement, toInclusive);
    }

    public SortedSet<E> K(@t7 E fromElement) {
        return tailSet(fromElement, true);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E ceiling(@t7 E e11) {
        return delegate().ceiling(e11);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return delegate().descendingSet();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E floor(@t7 E e11) {
        return delegate().floor(e11);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(@t7 E toElement, boolean inclusive) {
        return delegate().headSet(toElement, inclusive);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E higher(@t7 E e11) {
        return delegate().higher(e11);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E lower(@t7 E e11) {
        return delegate().lower(e11);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E pollLast() {
        return delegate().pollLast();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(@t7 E fromElement, boolean fromInclusive, @t7 E toElement, boolean toInclusive) {
        return delegate().subSet(fromElement, fromInclusive, toElement, toInclusive);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(@t7 E fromElement, boolean inclusive) {
        return delegate().tailSet(fromElement, inclusive);
    }

    @Override // com.google.common.collect.i5
    public SortedSet<E> x(@t7 E fromElement, @t7 E toElement) {
        return subSet(fromElement, true, toElement, false);
    }

    @Override // com.google.common.collect.i5
    /* renamed from: y */
    public abstract NavigableSet<E> delegate();

    @CheckForNull
    public E z(@t7 E e11) {
        return (E) l6.I(tailSet(e11, true).iterator(), null);
    }
}
