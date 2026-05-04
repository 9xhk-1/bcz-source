package com.google.common.collect;

import com.google.common.collect.j7;
import com.google.common.collect.k7;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class i<E> extends AbstractCollection<E> implements j7<E> {

    @CheckForNull
    @vo.b
    private transient Set<E> elementSet;

    @CheckForNull
    @vo.b
    private transient Set<j7.a<E>> entrySet;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends k7.h<E> {
        public a() {
        }

        @Override // com.google.common.collect.k7.h
        public j7<E> g() {
            return i.this;
        }

        @Override // com.google.common.collect.k7.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return i.this.elementIterator();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends k7.i<E> {
        public b() {
        }

        @Override // com.google.common.collect.k7.i
        public j7<E> g() {
            return i.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<j7.a<E>> iterator() {
            return i.this.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i.this.distinctElements();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    @uo.a
    public final boolean add(@t7 E element) {
        add(element, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @uo.a
    public final boolean addAll(Collection<? extends E> elementsToAdd) {
        return k7.c(this, elementsToAdd);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    public boolean contains(@CheckForNull Object element) {
        return count(element) > 0;
    }

    public Set<E> createElementSet() {
        return new a();
    }

    public Set<j7.a<E>> createEntrySet() {
        return new b();
    }

    public abstract int distinctElements();

    public abstract Iterator<E> elementIterator();

    public Set<E> elementSet() {
        Set<E> set = this.elementSet;
        if (set != null) {
            return set;
        }
        Set<E> createElementSet = createElementSet();
        this.elementSet = createElementSet;
        return createElementSet;
    }

    public abstract Iterator<j7.a<E>> entryIterator();

    public Set<j7.a<E>> entrySet() {
        Set<j7.a<E>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set<j7.a<E>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    @Override // java.util.Collection, com.google.common.collect.j7
    public final boolean equals(@CheckForNull Object object) {
        return k7.i(this, object);
    }

    @Override // java.util.Collection, com.google.common.collect.j7
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    @uo.a
    public final boolean remove(@CheckForNull Object element) {
        return remove(element, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    @uo.a
    public final boolean removeAll(Collection<?> elementsToRemove) {
        return k7.p(this, elementsToRemove);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    @uo.a
    public final boolean retainAll(Collection<?> elementsToRetain) {
        return k7.s(this, elementsToRetain);
    }

    @uo.a
    public int setCount(@t7 E element, int count) {
        return k7.v(this, element, count);
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.j7
    public final String toString() {
        return entrySet().toString();
    }

    @uo.a
    public int add(@t7 E element, int occurrences) {
        throw new UnsupportedOperationException();
    }

    @uo.a
    public int remove(@CheckForNull Object element, int occurrences) {
        throw new UnsupportedOperationException();
    }

    @uo.a
    public boolean setCount(@t7 E element, int oldCount, int newCount) {
        return k7.w(this, element, oldCount, newCount);
    }
}
