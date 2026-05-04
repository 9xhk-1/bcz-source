package com.google.common.collect;

import java.util.NoSuchElementException;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class d5<E> extends l4<E> implements Queue<E> {
    @Override // com.google.common.collect.l4, com.google.common.collect.c5
    public abstract Queue<E> delegate();

    @Override // java.util.Queue
    @t7
    public E element() {
        return delegate().element();
    }

    @uo.a
    public boolean offer(@t7 E o11) {
        return delegate().offer(o11);
    }

    @Override // java.util.Queue
    @CheckForNull
    public E peek() {
        return delegate().peek();
    }

    @Override // java.util.Queue
    @CheckForNull
    @uo.a
    public E poll() {
        return delegate().poll();
    }

    @Override // java.util.Queue
    @t7
    @uo.a
    public E remove() {
        return delegate().remove();
    }

    public boolean standardOffer(@t7 E e11) {
        try {
            return add(e11);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @CheckForNull
    public E standardPeek() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @CheckForNull
    public E standardPoll() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }
}
