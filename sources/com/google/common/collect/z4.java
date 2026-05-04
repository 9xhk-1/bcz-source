package com.google.common.collect;

import com.google.common.collect.j7;
import com.google.common.collect.k7;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class z4<E> extends l4<E> implements j7<E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends k7.h<E> {
        public a() {
        }

        @Override // com.google.common.collect.k7.h
        public j7<E> g() {
            return z4.this;
        }

        @Override // com.google.common.collect.k7.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return k7.h(g().entrySet().iterator());
        }
    }

    public int A(@t7 E element, int count) {
        return k7.v(this, element, count);
    }

    public boolean B(@t7 E element, int oldCount, int newCount) {
        return k7.w(this, element, oldCount, newCount);
    }

    public int C() {
        return k7.o(this);
    }

    @uo.a
    public int add(@t7 E element, int occurrences) {
        return delegate().add(element, occurrences);
    }

    @Override // com.google.common.collect.j7
    public int count(@CheckForNull Object element) {
        return delegate().count(element);
    }

    public Set<E> elementSet() {
        return delegate().elementSet();
    }

    public Set<j7.a<E>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.j7
    public boolean equals(@CheckForNull Object object) {
        return object == this || delegate().equals(object);
    }

    @Override // java.util.Collection, com.google.common.collect.j7
    public int hashCode() {
        return delegate().hashCode();
    }

    @uo.a
    public int remove(@CheckForNull Object element, int occurrences) {
        return delegate().remove(element, occurrences);
    }

    @uo.a
    public int setCount(@t7 E element, int count) {
        return delegate().setCount(element, count);
    }

    @Override // com.google.common.collect.l4
    public boolean standardAddAll(Collection<? extends E> elementsToAdd) {
        return k7.c(this, elementsToAdd);
    }

    @Override // com.google.common.collect.l4
    public void standardClear() {
        l6.g(entrySet().iterator());
    }

    @Override // com.google.common.collect.l4
    public boolean standardContains(@CheckForNull Object object) {
        return count(object) > 0;
    }

    public boolean standardEquals(@CheckForNull Object object) {
        return k7.i(this, object);
    }

    public int standardHashCode() {
        return entrySet().hashCode();
    }

    @Override // com.google.common.collect.l4
    public boolean standardRemove(@CheckForNull Object element) {
        return remove(element, 1) > 0;
    }

    @Override // com.google.common.collect.l4
    public boolean standardRemoveAll(Collection<?> elementsToRemove) {
        return k7.p(this, elementsToRemove);
    }

    @Override // com.google.common.collect.l4
    public boolean standardRetainAll(Collection<?> elementsToRetain) {
        return k7.s(this, elementsToRetain);
    }

    @Override // com.google.common.collect.l4
    public String standardToString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.l4, com.google.common.collect.c5
    /* renamed from: w */
    public abstract j7<E> delegate();

    public boolean x(@t7 E element) {
        add(element, 1);
        return true;
    }

    public int y(@CheckForNull Object object) {
        for (j7.a<E> aVar : entrySet()) {
            if (ho.d0.a(aVar.e(), object)) {
                return aVar.getCount();
            }
        }
        return 0;
    }

    public Iterator<E> z() {
        return k7.n(this);
    }

    @uo.a
    public boolean setCount(@t7 E element, int oldCount, int newCount) {
        return delegate().setCount(element, oldCount, newCount);
    }
}
