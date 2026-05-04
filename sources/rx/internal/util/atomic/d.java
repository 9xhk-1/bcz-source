package rx.internal.util.atomic;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d<E> extends a<E> {

    /* renamed from: g, reason: collision with root package name */
    public static final Integer f86663g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f86664c;

    /* renamed from: d, reason: collision with root package name */
    public long f86665d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f86666e;

    /* renamed from: f, reason: collision with root package name */
    public final int f86667f;

    public d(int i11) {
        super(i11);
        this.f86664c = new AtomicLong();
        this.f86666e = new AtomicLong();
        this.f86667f = Math.min(i11 / 4, f86663g.intValue());
    }

    @Override // rx.internal.util.atomic.a, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return p() == o();
    }

    @Override // rx.internal.util.atomic.a, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public final long o() {
        return this.f86666e.get();
    }

    @Override // java.util.Queue
    public boolean offer(E e11) {
        if (e11 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<E> atomicReferenceArray = this.f86659a;
        int i11 = this.f86660b;
        long j11 = this.f86664c.get();
        int b11 = b(j11, i11);
        if (j11 >= this.f86665d) {
            long j12 = this.f86667f + j11;
            if (h(atomicReferenceArray, b(j12, i11)) == null) {
                this.f86665d = j12;
            } else if (h(atomicReferenceArray, b11) != null) {
                return false;
            }
        }
        k(atomicReferenceArray, b11, e11);
        r(j11 + 1);
        return true;
    }

    public final long p() {
        return this.f86664c.get();
    }

    @Override // java.util.Queue
    public E peek() {
        return g(a(this.f86666e.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j11 = this.f86666e.get();
        int a11 = a(j11);
        AtomicReferenceArray<E> atomicReferenceArray = this.f86659a;
        E h11 = h(atomicReferenceArray, a11);
        if (h11 == null) {
            return null;
        }
        k(atomicReferenceArray, a11, null);
        q(j11 + 1);
        return h11;
    }

    public final void q(long j11) {
        this.f86666e.lazySet(j11);
    }

    public final void r(long j11) {
        this.f86664c.lazySet(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long o11 = o();
        while (true) {
            long p11 = p();
            long o12 = o();
            if (o11 == o12) {
                return (int) (p11 - o12);
            }
            o11 = o12;
        }
    }
}
