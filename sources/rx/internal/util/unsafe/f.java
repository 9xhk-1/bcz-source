package rx.internal.util.unsafe;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public abstract class f<E> extends g<E> {

    /* renamed from: s, reason: collision with root package name */
    public static final int f86812s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f86813t = 32;

    /* renamed from: u, reason: collision with root package name */
    public static final long f86814u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f86815v;

    /* renamed from: q, reason: collision with root package name */
    public final long f86816q;

    /* renamed from: r, reason: collision with root package name */
    public final E[] f86817r;

    static {
        int intValue = Integer.getInteger("sparse.shift", 0).intValue();
        f86812s = intValue;
        int arrayIndexScale = n0.f86883a.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            f86815v = intValue + 2;
        } else {
            if (8 != arrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            f86815v = intValue + 3;
        }
        f86814u = r1.arrayBaseOffset(Object[].class) + (32 << (f86815v - intValue));
    }

    public f(int i11) {
        int b11 = p.b(i11);
        this.f86816q = b11 - 1;
        this.f86817r = (E[]) new Object[(b11 << f86812s) + 64];
    }

    public final long a(long j11) {
        return b(j11, this.f86816q);
    }

    public final long b(long j11, long j12) {
        return f86814u + ((j11 & j12) << f86815v);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final E d(long j11) {
        return f(this.f86817r, j11);
    }

    public final E f(E[] eArr, long j11) {
        return (E) n0.f86883a.getObject(eArr, j11);
    }

    public final E g(long j11) {
        return h(this.f86817r, j11);
    }

    public final E h(E[] eArr, long j11) {
        return (E) n0.f86883a.getObjectVolatile(eArr, j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final void j(long j11, E e11) {
        k(this.f86817r, j11, e11);
    }

    public final void k(E[] eArr, long j11, E e11) {
        n0.f86883a.putOrderedObject(eArr, j11, e11);
    }

    public final void l(long j11, E e11) {
        m(this.f86817r, j11, e11);
    }

    public final void m(E[] eArr, long j11, E e11) {
        n0.f86883a.putObject(eArr, j11, e11);
    }
}
