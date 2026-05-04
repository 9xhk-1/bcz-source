package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class t4<E> extends l4<E> implements List<E> {
    public Iterator<E> A() {
        return listIterator();
    }

    public int B(@CheckForNull Object element) {
        return q6.n(this, element);
    }

    public ListIterator<E> C() {
        return listIterator(0);
    }

    public ListIterator<E> D(int start) {
        return q6.p(this, start);
    }

    public List<E> F(int fromIndex, int toIndex) {
        return q6.C(this, fromIndex, toIndex);
    }

    public void add(int index, @t7 E element) {
        delegate().add(index, element);
    }

    @uo.a
    public boolean addAll(int index, Collection<? extends E> elements) {
        return delegate().addAll(index, elements);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@CheckForNull Object object) {
        return object == this || delegate().equals(object);
    }

    @Override // java.util.List
    @t7
    public E get(int index) {
        return delegate().get(index);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // java.util.List
    public int indexOf(@CheckForNull Object element) {
        return delegate().indexOf(element);
    }

    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object element) {
        return delegate().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return delegate().listIterator();
    }

    @Override // java.util.List
    @t7
    @uo.a
    public E remove(int index) {
        return delegate().remove(index);
    }

    @Override // java.util.List
    @t7
    @uo.a
    public E set(int index, @t7 E element) {
        return delegate().set(index, element);
    }

    public boolean standardEquals(@CheckForNull Object object) {
        return q6.j(this, object);
    }

    public int standardHashCode() {
        return q6.k(this);
    }

    @Override // java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        return delegate().subList(fromIndex, toIndex);
    }

    @Override // com.google.common.collect.l4, com.google.common.collect.c5
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract List<E> delegate();

    public boolean x(@t7 E element) {
        add(size(), element);
        return true;
    }

    public boolean y(int index, Iterable<? extends E> elements) {
        return q6.a(this, index, elements);
    }

    public int z(@CheckForNull Object element) {
        return q6.l(this, element);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        return delegate().listIterator(index);
    }
}
