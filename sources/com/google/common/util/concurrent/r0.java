package com.google.common.util.concurrent;

import com.google.common.collect.n4;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class r0<E> extends n4<E> implements BlockingDeque<E> {
    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> c11) {
        return delegate().drainTo(c11);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e11, long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().offer(e11, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e11, long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().offerFirst(e11, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e11, long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().offerLast(e11, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    @CheckForNull
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().poll(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @CheckForNull
    public E pollFirst(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().pollFirst(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @CheckForNull
    public E pollLast(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().pollLast(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e11) throws InterruptedException {
        delegate().put(e11);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e11) throws InterruptedException {
        delegate().putFirst(e11);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e11) throws InterruptedException {
        delegate().putLast(e11);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return delegate().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return delegate().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
        return delegate().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
        return delegate().takeLast();
    }

    @Override // com.google.common.collect.n4
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public abstract BlockingDeque<E> delegate();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> c11, int maxElements) {
        return delegate().drainTo(c11, maxElements);
    }
}
