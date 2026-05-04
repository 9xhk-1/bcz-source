package rx.internal.util.unsafe;

import java.util.Iterator;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public class h0<E> extends j0<E> implements q {

    /* renamed from: u, reason: collision with root package name */
    public static final long f86838u;

    /* renamed from: v, reason: collision with root package name */
    public static final long f86839v;

    /* renamed from: w, reason: collision with root package name */
    public static final long f86840w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f86841x;

    /* renamed from: t, reason: collision with root package name */
    public static final int f86837t = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: y, reason: collision with root package name */
    public static final Object f86842y = new Object();

    static {
        Unsafe unsafe = n0.f86883a;
        int arrayIndexScale = unsafe.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            f86841x = 2;
        } else {
            if (8 != arrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            f86841x = 3;
        }
        f86840w = unsafe.arrayBaseOffset(Object[].class);
        try {
            f86838u = unsafe.objectFieldOffset(m0.class.getDeclaredField("producerIndex"));
            try {
                f86839v = unsafe.objectFieldOffset(j0.class.getDeclaredField("consumerIndex"));
            } catch (NoSuchFieldException e11) {
                InternalError internalError = new InternalError();
                internalError.initCause(e11);
                throw internalError;
            }
        } catch (NoSuchFieldException e12) {
            InternalError internalError2 = new InternalError();
            internalError2.initCause(e12);
            throw internalError2;
        }
    }

    public h0(int i11) {
        int b11 = p.b(i11);
        long j11 = b11 - 1;
        E[] eArr = (E[]) new Object[b11 + 1];
        this.f86878d = eArr;
        this.f86877c = j11;
        d(b11);
        this.f86844s = eArr;
        this.f86843r = j11;
        this.f86876b = j11 - 1;
        s(0L);
    }

    public static long f(long j11) {
        return f86840w + (j11 << f86841x);
    }

    public static long g(long j11, long j12) {
        return f(j11 & j12);
    }

    public static <E> Object j(E[] eArr, long j11) {
        return n0.f86883a.getObjectVolatile(eArr, j11);
    }

    public static void q(Object[] objArr, long j11, Object obj) {
        n0.f86883a.putOrderedObject(objArr, j11, obj);
    }

    @Override // rx.internal.util.unsafe.q
    public long a() {
        return h();
    }

    @Override // rx.internal.util.unsafe.q
    public long b() {
        return l();
    }

    public final void d(int i11) {
        this.f86875a = Math.min(i11 / 4, f86837t);
    }

    public final long h() {
        return n0.f86883a.getLongVolatile(this, f86839v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final E[] k(E[] eArr) {
        return (E[]) ((Object[]) j(eArr, f(eArr.length - 1)));
    }

    public final long l() {
        return n0.f86883a.getLongVolatile(this, f86838u);
    }

    public final E m(E[] eArr, long j11, long j12) {
        this.f86844s = eArr;
        return (E) j(eArr, g(j11, j12));
    }

    public final E n(E[] eArr, long j11, long j12) {
        this.f86844s = eArr;
        long g11 = g(j11, j12);
        E e11 = (E) j(eArr, g11);
        if (e11 == null) {
            return null;
        }
        q(eArr, g11, null);
        p(j11 + 1);
        return e11;
    }

    public final void o(E[] eArr, long j11, long j12, E e11, long j13) {
        E[] eArr2 = (E[]) new Object[eArr.length];
        this.f86878d = eArr2;
        this.f86876b = (j13 + j11) - 1;
        q(eArr2, j12, e11);
        r(eArr, eArr2);
        q(eArr, j12, f86842y);
        s(j11 + 1);
    }

    @Override // java.util.Queue
    public final boolean offer(E e11) {
        if (e11 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        E[] eArr = this.f86878d;
        long j11 = this.producerIndex;
        long j12 = this.f86877c;
        long g11 = g(j11, j12);
        if (j11 < this.f86876b) {
            return t(eArr, e11, j11, g11);
        }
        long j13 = this.f86875a + j11;
        if (j(eArr, g(j13, j12)) == null) {
            this.f86876b = j13 - 1;
            return t(eArr, e11, j11, g11);
        }
        if (j(eArr, g(j11 + 1, j12)) != null) {
            return t(eArr, e11, j11, g11);
        }
        o(eArr, j11, g11, e11, j12);
        return true;
    }

    public final void p(long j11) {
        n0.f86883a.putOrderedLong(this, f86839v, j11);
    }

    @Override // java.util.Queue
    public final E peek() {
        E[] eArr = this.f86844s;
        long j11 = this.consumerIndex;
        long j12 = this.f86843r;
        E e11 = (E) j(eArr, g(j11, j12));
        return e11 == f86842y ? m(k(eArr), j11, j12) : e11;
    }

    @Override // java.util.Queue
    public final E poll() {
        E[] eArr = this.f86844s;
        long j11 = this.consumerIndex;
        long j12 = this.f86843r;
        long g11 = g(j11, j12);
        E e11 = (E) j(eArr, g11);
        boolean z11 = e11 == f86842y;
        if (e11 == null || z11) {
            if (z11) {
                return n(k(eArr), j11, j12);
            }
            return null;
        }
        q(eArr, g11, null);
        p(j11 + 1);
        return e11;
    }

    public final void r(E[] eArr, E[] eArr2) {
        q(eArr, f(eArr.length - 1), eArr2);
    }

    public final void s(long j11) {
        n0.f86883a.putOrderedLong(this, f86838u, j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
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

    public final boolean t(E[] eArr, E e11, long j11, long j12) {
        q(eArr, j12, e11);
        s(j11 + 1);
        return true;
    }
}
