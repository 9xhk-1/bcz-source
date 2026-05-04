package com.google.common.util.concurrent;

import com.google.common.collect.d5;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class s0<E> extends d5<E> implements BlockingQueue<E> {
    @Override // java.util.concurrent.BlockingQueue
    @uo.a
    public int drainTo(Collection<? super E> c11, int maxElements) {
        return delegate().drainTo(c11, maxElements);
    }

    @Override // java.util.concurrent.BlockingQueue
    @uo.a
    public boolean offer(E e11, long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().offer(e11, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingQueue
    @CheckForNull
    @uo.a
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().poll(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e11) throws InterruptedException {
        delegate().put(e11);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return delegate().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    @uo.a
    public E take() throws InterruptedException {
        return delegate().take();
    }

    @Override // com.google.common.collect.d5, com.google.common.collect.l4, com.google.common.collect.c5
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract BlockingQueue<E> delegate();

    @Override // java.util.concurrent.BlockingQueue
    @uo.a
    public int drainTo(Collection<? super E> c11) {
        return delegate().drainTo(c11);
    }
}
