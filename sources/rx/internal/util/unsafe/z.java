package rx.internal.util.unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public final class z<E> extends e0<E> {
    public z(int i11) {
        super(i11);
    }

    private long n() {
        return n0.f86883a.getLongVolatile(this, b0.f86764j1);
    }

    private long o() {
        return n0.f86883a.getLongVolatile(this, f0.O);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.i
    public boolean isEmpty() {
        return o() == n();
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public boolean offer(E e11) {
        if (e11 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        E[] eArr = this.f86817r;
        long j11 = this.producerIndex;
        long a11 = a(j11);
        if (h(eArr, a11) != null) {
            return false;
        }
        k(eArr, a11, e11);
        q(j11 + 1);
        return true;
    }

    public final void p(long j11) {
        n0.f86883a.putOrderedLong(this, b0.f86764j1, j11);
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public E peek() {
        return g(a(this.consumerIndex));
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public E poll() {
        long j11 = this.consumerIndex;
        long a11 = a(j11);
        E[] eArr = this.f86817r;
        E h11 = h(eArr, a11);
        if (h11 == null) {
            return null;
        }
        k(eArr, a11, null);
        p(j11 + 1);
        return h11;
    }

    public final void q(long j11) {
        n0.f86883a.putOrderedLong(this, f0.O, j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.i
    public int size() {
        long n11 = n();
        while (true) {
            long o11 = o();
            long n12 = n();
            if (n11 == n12) {
                return (int) (o11 - n12);
            }
            n11 = n12;
        }
    }
}
