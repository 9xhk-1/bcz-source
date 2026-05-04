package rx.internal.util.atomic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b<E> extends AbstractQueue<E> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<E>> f86661a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<E>> f86662b = new AtomicReference<>();

    public final LinkedQueueNode<E> a() {
        return this.f86662b.get();
    }

    public final LinkedQueueNode<E> b() {
        return this.f86661a.get();
    }

    public final LinkedQueueNode<E> d() {
        return this.f86662b.get();
    }

    public final LinkedQueueNode<E> f() {
        return this.f86661a.get();
    }

    public final void g(LinkedQueueNode<E> linkedQueueNode) {
        this.f86662b.lazySet(linkedQueueNode);
    }

    public final void h(LinkedQueueNode<E> linkedQueueNode) {
        this.f86661a.lazySet(linkedQueueNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return d() == f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final LinkedQueueNode<E> j(LinkedQueueNode<E> linkedQueueNode) {
        return this.f86661a.getAndSet(linkedQueueNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        LinkedQueueNode<E> lvNext;
        LinkedQueueNode<E> d11 = d();
        LinkedQueueNode<E> f11 = f();
        int i11 = 0;
        while (d11 != f11 && i11 < Integer.MAX_VALUE) {
            do {
                lvNext = d11.lvNext();
            } while (lvNext == null);
            i11++;
            d11 = lvNext;
        }
        return i11;
    }
}
