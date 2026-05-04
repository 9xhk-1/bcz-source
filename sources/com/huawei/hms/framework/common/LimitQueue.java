package com.huawei.hms.framework.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class LimitQueue<E> extends ConcurrentLinkedQueue<E> {
    private static final String TAG = "LimitQueue";
    private static final long serialVersionUID = -4636313759149307798L;
    private boolean deduplication;
    private int limit;

    public LimitQueue(int i11) {
        this.deduplication = false;
        this.limit = i11;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e11) {
        if (this.deduplication) {
            super.remove(e11);
        }
        if (super.size() >= this.limit) {
            super.poll();
        }
        return super.add(e11);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.size() > this.limit) {
            return false;
        }
        if (this.deduplication) {
            super.removeAll(collection);
        }
        for (int size = (collection.size() + super.size()) - this.limit; size > 0; size--) {
            super.poll();
        }
        return super.addAll(collection);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        super.clear();
    }

    public E get(int i11) {
        Iterator<E> it = iterator();
        E e11 = null;
        for (int i12 = 0; i12 <= i11 && it.hasNext(); i12++) {
            e11 = it.next();
        }
        return e11;
    }

    public int getLimit() {
        return this.limit;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public boolean offer(E e11) {
        if (this.deduplication) {
            super.remove(e11);
        }
        if (super.size() >= this.limit) {
            super.poll();
        }
        return super.offer(e11);
    }

    public E peekLast() {
        Iterator<E> it = iterator();
        E e11 = null;
        while (it.hasNext()) {
            e11 = it.next();
        }
        return e11;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public E poll() {
        return (E) super.poll();
    }

    @Override // java.util.AbstractQueue, java.util.Queue
    public E remove() {
        try {
            return (E) super.remove();
        } catch (NoSuchElementException unused) {
            Logger.w(TAG, "remove failed, limitQueue is empty");
            return null;
        }
    }

    public LimitQueue(int i11, boolean z11) {
        this.limit = i11;
        this.deduplication = z11;
    }

    public LimitQueue(Collection<? extends E> collection, boolean z11) {
        this(collection.size(), z11);
        addAll(collection);
    }
}
