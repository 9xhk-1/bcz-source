package com.google.common.collect;

import java.util.ListIterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class u4<E> extends s4<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    public void add(@t7 E element) {
        delegate().add(element);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return delegate().hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return delegate().nextIndex();
    }

    @Override // java.util.ListIterator
    @t7
    @uo.a
    public E previous() {
        return delegate().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return delegate().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@t7 E element) {
        delegate().set(element);
    }

    @Override // com.google.common.collect.s4
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public abstract ListIterator<E> delegate();
}
