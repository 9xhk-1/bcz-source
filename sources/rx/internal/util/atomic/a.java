package rx.internal.util.atomic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a<E> extends AbstractQueue<E> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<E> f86659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86660b;

    public a(int i11) {
        int b11 = p.b(i11);
        this.f86660b = b11 - 1;
        this.f86659a = new AtomicReferenceArray<>(b11);
    }

    public final int a(long j11) {
        return ((int) j11) & this.f86660b;
    }

    public final int b(long j11, int i11) {
        return ((int) j11) & i11;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final E d(int i11) {
        return this.f86659a.get(i11);
    }

    public final E f(AtomicReferenceArray<E> atomicReferenceArray, int i11) {
        return atomicReferenceArray.get(i11);
    }

    public final E g(int i11) {
        return h(this.f86659a, i11);
    }

    public final E h(AtomicReferenceArray<E> atomicReferenceArray, int i11) {
        return atomicReferenceArray.get(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final void j(int i11, E e11) {
        this.f86659a.lazySet(i11, e11);
    }

    public final void k(AtomicReferenceArray<E> atomicReferenceArray, int i11, E e11) {
        atomicReferenceArray.lazySet(i11, e11);
    }

    public final void l(int i11, E e11) {
        this.f86659a.lazySet(i11, e11);
    }

    public final void m(AtomicReferenceArray<E> atomicReferenceArray, int i11, E e11) {
        atomicReferenceArray.lazySet(i11, e11);
    }

    public final void n(AtomicReferenceArray<E> atomicReferenceArray, int i11, E e11) {
        atomicReferenceArray.set(i11, e11);
    }
}
