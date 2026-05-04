package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class e<T> implements Queue<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f86668i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f86669j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f86670a;

    /* renamed from: b, reason: collision with root package name */
    public int f86671b;

    /* renamed from: c, reason: collision with root package name */
    public long f86672c;

    /* renamed from: d, reason: collision with root package name */
    public int f86673d;

    /* renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray<Object> f86674e;

    /* renamed from: f, reason: collision with root package name */
    public int f86675f;

    /* renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray<Object> f86676g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f86677h;

    public e(int i11) {
        int b11 = p.b(i11);
        int i12 = b11 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(b11 + 1);
        this.f86674e = atomicReferenceArray;
        this.f86673d = i12;
        a(b11);
        this.f86676g = atomicReferenceArray;
        this.f86675f = i12;
        this.f86672c = b11 - 2;
        this.f86670a = new AtomicLong();
        this.f86677h = new AtomicLong();
    }

    public static int d(long j11, int i11) {
        return b(((int) j11) & i11);
    }

    public static <E> Object j(AtomicReferenceArray<Object> atomicReferenceArray, int i11) {
        return atomicReferenceArray.get(i11);
    }

    public static void r(AtomicReferenceArray<Object> atomicReferenceArray, int i11, Object obj) {
        atomicReferenceArray.lazySet(i11, obj);
    }

    public final void a(int i11) {
        this.f86671b = Math.min(i11 / 4, f86668i);
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
        return this.f86677h.get();
    }

    public final long g() {
        return this.f86670a.get();
    }

    public final long h() {
        return this.f86677h.get();
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
        return this.f86670a.get();
    }

    public final T m(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11) {
        this.f86676g = atomicReferenceArray;
        return (T) j(atomicReferenceArray, d(j11, i11));
    }

    public final T n(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11) {
        this.f86676g = atomicReferenceArray;
        int d11 = d(j11, i11);
        T t11 = (T) j(atomicReferenceArray, d11);
        if (t11 == null) {
            return null;
        }
        r(atomicReferenceArray, d11, null);
        q(j11 + 1);
        return t11;
    }

    public boolean o(T t11, T t12) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f86674e;
        long l11 = l();
        int i11 = this.f86673d;
        long j11 = 2 + l11;
        if (j(atomicReferenceArray, d(j11, i11)) == null) {
            int d11 = d(l11, i11);
            r(atomicReferenceArray, d11 + 1, t12);
            r(atomicReferenceArray, d11, t11);
            t(j11);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f86674e = atomicReferenceArray2;
        int d12 = d(l11, i11);
        r(atomicReferenceArray2, d12 + 1, t12);
        r(atomicReferenceArray2, d12, t11);
        s(atomicReferenceArray, atomicReferenceArray2);
        r(atomicReferenceArray, d12, f86669j);
        t(j11);
        return true;
    }

    @Override // java.util.Queue
    public boolean offer(T t11) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f86674e;
        long g11 = g();
        int i11 = this.f86673d;
        int d11 = d(g11, i11);
        if (g11 < this.f86672c) {
            return u(atomicReferenceArray, t11, g11, d11);
        }
        long j11 = this.f86671b + g11;
        if (j(atomicReferenceArray, d(j11, i11)) == null) {
            this.f86672c = j11 - 1;
            return u(atomicReferenceArray, t11, g11, d11);
        }
        if (j(atomicReferenceArray, d(g11 + 1, i11)) == null) {
            return u(atomicReferenceArray, t11, g11, d11);
        }
        p(atomicReferenceArray, g11, d11, t11, i11);
        return true;
    }

    public final void p(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11, T t11, long j12) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f86674e = atomicReferenceArray2;
        this.f86672c = (j12 + j11) - 1;
        r(atomicReferenceArray2, i11, t11);
        s(atomicReferenceArray, atomicReferenceArray2);
        r(atomicReferenceArray, i11, f86669j);
        t(j11 + 1);
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f86676g;
        long f11 = f();
        int i11 = this.f86675f;
        T t11 = (T) j(atomicReferenceArray, d(f11, i11));
        return t11 == f86669j ? m(k(atomicReferenceArray), f11, i11) : t11;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f86676g;
        long f11 = f();
        int i11 = this.f86675f;
        int d11 = d(f11, i11);
        T t11 = (T) j(atomicReferenceArray, d11);
        boolean z11 = t11 == f86669j;
        if (t11 == null || z11) {
            if (z11) {
                return n(k(atomicReferenceArray), f11, i11);
            }
            return null;
        }
        r(atomicReferenceArray, d11, null);
        q(f11 + 1);
        return t11;
    }

    public final void q(long j11) {
        this.f86677h.lazySet(j11);
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

    public final void s(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        r(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
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

    public final void t(long j11) {
        this.f86670a.lazySet(j11);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public final boolean u(AtomicReferenceArray<Object> atomicReferenceArray, T t11, long j11, int i11) {
        r(atomicReferenceArray, i11, t11);
        t(j11 + 1);
        return true;
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
