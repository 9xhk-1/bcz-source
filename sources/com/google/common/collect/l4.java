package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class l4<E> extends c5 implements Collection<E> {
    @uo.a
    public boolean add(@t7 E element) {
        return delegate().add(element);
    }

    @uo.a
    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    public void clear() {
        delegate().clear();
    }

    public boolean contains(@CheckForNull Object object) {
        return delegate().contains(object);
    }

    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    @Override // com.google.common.collect.c5
    public abstract Collection<E> delegate();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    @uo.a
    public boolean remove(@CheckForNull Object object) {
        return delegate().remove(object);
    }

    @uo.a
    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    @uo.a
    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return delegate().size();
    }

    public boolean standardAddAll(Collection<? extends E> collection) {
        return l6.a(this, collection.iterator());
    }

    public void standardClear() {
        l6.g(iterator());
    }

    public boolean standardContains(@CheckForNull Object object) {
        return l6.p(iterator(), object);
    }

    public boolean standardContainsAll(Collection<?> collection) {
        return y2.b(this, collection);
    }

    public boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    public boolean standardRemove(@CheckForNull Object object) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (ho.d0.a(it.next(), object)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean standardRemoveAll(Collection<?> collection) {
        return l6.U(iterator(), collection);
    }

    public boolean standardRetainAll(Collection<?> collection) {
        return l6.W(iterator(), collection);
    }

    public Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    public String standardToString() {
        return y2.l(this);
    }

    public Object[] toArray() {
        return delegate().toArray();
    }

    @uo.a
    public <T> T[] toArray(T[] tArr) {
        return (T[]) delegate().toArray(tArr);
    }

    public <T> T[] standardToArray(T[] tArr) {
        return (T[]) p7.m(this, tArr);
    }
}
