package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class EvictingQueue<E> extends d5<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue<E> delegate;

    @go.e
    final int maxSize;

    private EvictingQueue(int maxSize) {
        Preconditions.checkArgument(maxSize >= 0, "maxSize (%s) must >= 0", maxSize);
        this.delegate = new ArrayDeque(maxSize);
        this.maxSize = maxSize;
    }

    public static <E> EvictingQueue<E> create(int maxSize) {
        return new EvictingQueue<>(maxSize);
    }

    @Override // com.google.common.collect.l4, java.util.Collection, java.util.Queue
    @uo.a
    public boolean add(E e11) {
        Preconditions.checkNotNull(e11);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e11);
        return true;
    }

    @Override // com.google.common.collect.l4, java.util.Collection
    @uo.a
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return standardAddAll(collection);
        }
        clear();
        return k6.a(this, k6.N(collection, size - this.maxSize));
    }

    @Override // com.google.common.collect.d5, java.util.Queue
    @uo.a
    public boolean offer(E e11) {
        return add(e11);
    }

    public int remainingCapacity() {
        return this.maxSize - size();
    }

    @Override // com.google.common.collect.l4, java.util.Collection
    @go.d
    public Object[] toArray() {
        return super.toArray();
    }

    @Override // com.google.common.collect.d5, com.google.common.collect.l4, com.google.common.collect.c5
    public Queue<E> delegate() {
        return this.delegate;
    }
}
