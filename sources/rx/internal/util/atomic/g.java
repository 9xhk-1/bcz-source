package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class g<T> implements Queue<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f86678i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f86679j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f86680a;

    /* renamed from: b, reason: collision with root package name */
    public int f86681b;

    /* renamed from: c, reason: collision with root package name */
    public long f86682c;

    /* renamed from: d, reason: collision with root package name */
    public int f86683d;

    /* renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray<Object> f86684e;

    /* renamed from: f, reason: collision with root package name */
    public int f86685f;

    /* renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray<Object> f86686g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f86687h;

    public g(int i11) {
        int b11 = p.b(Math.max(8, i11));
        int i12 = b11 - 1;
        this.f86680a = new AtomicLong();
        this.f86687h = new AtomicLong();
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(b11 + 1);
        this.f86684e = atomicReferenceArray;
        this.f86683d = i12;
        a(b11);
        this.f86686g = atomicReferenceArray;
        this.f86685f = i12;
        this.f86682c = b11 - 2;
        s(0L);
    }

    public static int d(long j11, int i11) {
        return b(((int) j11) & i11);
    }

    public static <E> Object j(AtomicReferenceArray<Object> atomicReferenceArray, int i11) {
        return atomicReferenceArray.get(i11);
    }

    public static void q(AtomicReferenceArray<Object> atomicReferenceArray, int i11, Object obj) {
        atomicReferenceArray.lazySet(i11, obj);
    }

    public final void a(int i11) {
        this.f86681b = Math.min(i11 / 4, f86678i);
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

    public final long f() {
        return this.f86687h.get();
    }

    public final long g() {
        return this.f86680a.get();
    }

    public final long h() {
        return this.f86687h.get();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return l() == h();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    public final AtomicReferenceArray<Object> k(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) j(atomicReferenceArray, b(atomicReferenceArray.length() - 1));
    }

    public final long l() {
        return this.f86680a.get();
    }

    public final T m(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11) {
        this.f86686g = atomicReferenceArray;
        return (T) j(atomicReferenceArray, d(j11, i11));
    }

    public final T n(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11) {
        this.f86686g = atomicReferenceArray;
        int d11 = d(j11, i11);
        T t11 = (T) j(atomicReferenceArray, d11);
        if (t11 == null) {
            return null;
        }
        p(j11 + 1);
        q(atomicReferenceArray, d11, null);
        return t11;
    }

    public final void o(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11, T t11, long j12) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f86684e = atomicReferenceArray2;
        this.f86682c = (j12 + j11) - 1;
        s(j11 + 1);
        q(atomicReferenceArray2, i11, t11);
        r(atomicReferenceArray, atomicReferenceArray2);
        q(atomicReferenceArray, i11, f86679j);
    }

    @Override // java.util.Queue
    public boolean offer(T t11) {
        t11.getClass();
        AtomicReferenceArray<Object> atomicReferenceArray = this.f86684e;
        long g11 = g();
        int i11 = this.f86683d;
        int d11 = d(g11, i11);
        if (g11 < this.f86682c) {
            return t(atomicReferenceArray, t11, g11, d11);
        }
        long j11 = this.f86681b + g11;
        if (j(atomicReferenceArray, d(j11, i11)) == null) {
            this.f86682c = j11 - 1;
            return t(atomicReferenceArray, t11, g11, d11);
        }
        if (j(atomicReferenceArray, d(g11 + 1, i11)) != null) {
            return t(atomicReferenceArray, t11, g11, d11);
        }
        o(atomicReferenceArray, g11, d11, t11, i11);
        return true;
    }

    public final void p(long j11) {
        this.f86687h.lazySet(j11);
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f86686g;
        long f11 = f();
        int i11 = this.f86685f;
        T t11 = (T) j(atomicReferenceArray, d(f11, i11));
        return t11 == f86679j ? m(k(atomicReferenceArray), f11, i11) : t11;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f86686g;
        long f11 = f();
        int i11 = this.f86685f;
        int d11 = d(f11, i11);
        T t11 = (T) j(atomicReferenceArray, d11);
        boolean z11 = t11 == f86679j;
        if (t11 == null || z11) {
            if (z11) {
                return n(k(atomicReferenceArray), f11, i11);
            }
            return null;
        }
        p(f11 + 1);
        q(atomicReferenceArray, d11, null);
        return t11;
    }

    public final void r(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        q(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
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

    public final void s(long j11) {
        this.f86680a.lazySet(j11);
    }

    @Override // java.util.Collection
    public int size() {
        long h11 = h();
        while (true) {
            long l11 = l();
            long h12 = h();
            if (h11 == h12) {
                return (int) (l11 - h12);
            }
            h11 = h12;
        }
    }

    public final boolean t(AtomicReferenceArray<Object> atomicReferenceArray, T t11, long j11, int i11) {
        s(j11 + 1);
        q(atomicReferenceArray, i11, t11);
        return true;
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

    public static int b(int i11) {
        return i11;
    }
}
