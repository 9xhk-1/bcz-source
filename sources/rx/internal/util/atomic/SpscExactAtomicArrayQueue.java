package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class SpscExactAtomicArrayQueue<T> extends AtomicReferenceArray<T> implements Queue<T> {
    private static final long serialVersionUID = 6210984603741293445L;
    final int capacitySkip;
    final AtomicLong consumerIndex;
    final int mask;
    final AtomicLong producerIndex;

    public SpscExactAtomicArrayQueue(int i11) {
        super(p.b(i11));
        int length = length();
        this.mask = length - 1;
        this.capacitySkip = length - i11;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T t11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.producerIndex == this.consumerIndex;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public boolean offer(T t11) {
        t11.getClass();
        long j11 = this.producerIndex.get();
        int i11 = this.mask;
        if (get(((int) (this.capacitySkip + j11)) & i11) != null) {
            return false;
        }
        this.producerIndex.lazySet(j11 + 1);
        lazySet(i11 & ((int) j11), t11);
        return true;
    }

    @Override // java.util.Queue
    public T peek() {
        return get(((int) this.consumerIndex.get()) & this.mask);
    }

    @Override // java.util.Queue
    public T poll() {
        long j11 = this.consumerIndex.get();
        int i11 = ((int) j11) & this.mask;
        T t11 = get(i11);
        if (t11 == null) {
            return null;
        }
        this.consumerIndex.lazySet(j11 + 1);
        lazySet(i11, null);
        return t11;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public int size() {
        long j11 = this.consumerIndex.get();
        while (true) {
            long j12 = this.producerIndex.get();
            long j13 = this.consumerIndex.get();
            if (j11 == j13) {
                return (int) (j12 - j13);
            }
            j11 = j13;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }
}
