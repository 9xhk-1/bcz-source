package com.google.common.collect;

import java.util.Deque;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@u3
@go.c
/* loaded from: classes7.dex */
public abstract class n4<E> extends d5<E> implements Deque<E> {
    @Override // java.util.Deque
    public void addFirst(@t7 E e11) {
        delegate().addFirst(e11);
    }

    @Override // java.util.Deque
    public void addLast(@t7 E e11) {
        delegate().addLast(e11);
    }

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.Deque
    @t7
    public E getFirst() {
        return delegate().getFirst();
    }

    @Override // java.util.Deque
    @t7
    public E getLast() {
        return delegate().getLast();
    }

    @Override // java.util.Deque
    @uo.a
    public boolean offerFirst(@t7 E e11) {
        return delegate().offerFirst(e11);
    }

    @Override // java.util.Deque
    @uo.a
    public boolean offerLast(@t7 E e11) {
        return delegate().offerLast(e11);
    }

    @Override // java.util.Deque
    @CheckForNull
    public E peekFirst() {
        return delegate().peekFirst();
    }

    @Override // java.util.Deque
    @CheckForNull
    public E peekLast() {
        return delegate().peekLast();
    }

    @Override // java.util.Deque
    @CheckForNull
    @uo.a
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @Override // java.util.Deque
    @CheckForNull
    @uo.a
    public E pollLast() {
        return delegate().pollLast();
    }

    @Override // java.util.Deque
    @t7
    @uo.a
    public E pop() {
        return delegate().pop();
    }

    @Override // java.util.Deque
    public void push(@t7 E e11) {
        delegate().push(e11);
    }

    @Override // java.util.Deque
    @t7
    @uo.a
    public E removeFirst() {
        return delegate().removeFirst();
    }

    @Override // java.util.Deque
    @uo.a
    public boolean removeFirstOccurrence(@CheckForNull Object o11) {
        return delegate().removeFirstOccurrence(o11);
    }

    @Override // java.util.Deque
    @t7
    @uo.a
    public E removeLast() {
        return delegate().removeLast();
    }

    @Override // java.util.Deque
    @uo.a
    public boolean removeLastOccurrence(@CheckForNull Object o11) {
        return delegate().removeLastOccurrence(o11);
    }

    @Override // com.google.common.collect.d5, com.google.common.collect.l4, com.google.common.collect.c5
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract Deque<E> delegate();
}
