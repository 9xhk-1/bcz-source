package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f85041a = Long.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public static final long f85042b = Long.MAX_VALUE;

    public a() {
        throw new IllegalStateException("No instances!");
    }

    public static long a(long j11, long j12) {
        long j13 = j11 + j12;
        if (j13 < 0) {
            return Long.MAX_VALUE;
        }
        return j13;
    }

    public static long b(AtomicLong atomicLong, long j11) {
        long j12;
        do {
            j12 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j12, a(j12, j11)));
        return j12;
    }

    public static long c(long j11, long j12) {
        long j13 = j11 * j12;
        if (((j11 | j12) >>> 31) == 0 || j12 == 0 || j13 / j12 == j11) {
            return j13;
        }
        return Long.MAX_VALUE;
    }

    public static <T> void d(AtomicLong atomicLong, Queue<T> queue, qb0.g<? super T> gVar) {
        e(atomicLong, queue, gVar, rx.internal.util.o.c());
    }

    public static <T, R> void e(AtomicLong atomicLong, Queue<T> queue, qb0.g<? super R> gVar, wb0.p<? super T, ? extends R> pVar) {
        long j11;
        do {
            j11 = atomicLong.get();
            if ((j11 & Long.MIN_VALUE) != 0) {
                return;
            }
        } while (!atomicLong.compareAndSet(j11, Long.MIN_VALUE | j11));
        if (j11 != 0) {
            f(atomicLong, queue, gVar, pVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        r0 = r10.addAndGet(-(r6 & Long.MAX_VALUE));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T, R> void f(java.util.concurrent.atomic.AtomicLong r10, java.util.Queue<T> r11, qb0.g<? super R> r12, wb0.p<? super T, ? extends R> r13) {
        /*
            long r0 = r10.get()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L26
        Ld:
            boolean r10 = r12.isUnsubscribed()
            if (r10 == 0) goto L14
            goto L6f
        L14:
            java.lang.Object r10 = r11.poll()
            if (r10 != 0) goto L1e
            r12.onCompleted()
            return
        L1e:
            java.lang.Object r10 = r13.call(r10)
            r12.onNext(r10)
            goto Ld
        L26:
            r4 = -9223372036854775808
        L28:
            r6 = r4
        L29:
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L49
            boolean r8 = r12.isUnsubscribed()
            if (r8 == 0) goto L34
            goto L6f
        L34:
            java.lang.Object r8 = r11.poll()
            if (r8 != 0) goto L3e
            r12.onCompleted()
            return
        L3e:
            java.lang.Object r8 = r13.call(r8)
            r12.onNext(r8)
            r8 = 1
            long r6 = r6 + r8
            goto L29
        L49:
            if (r8 != 0) goto L5c
            boolean r0 = r12.isUnsubscribed()
            if (r0 == 0) goto L52
            goto L6f
        L52:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L5c
            r12.onCompleted()
            return
        L5c:
            long r0 = r10.get()
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 != 0) goto L29
            long r0 = r6 & r2
            long r0 = -r0
            long r0 = r10.addAndGet(r0)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L28
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.a.f(java.util.concurrent.atomic.AtomicLong, java.util.Queue, qb0.g, wb0.p):void");
    }

    public static <T> boolean g(AtomicLong atomicLong, long j11, Queue<T> queue, qb0.g<? super T> gVar) {
        return h(atomicLong, j11, queue, gVar, rx.internal.util.o.c());
    }

    public static <T, R> boolean h(AtomicLong atomicLong, long j11, Queue<T> queue, qb0.g<? super R> gVar, wb0.p<? super T, ? extends R> pVar) {
        long j12;
        long j13;
        if (j11 < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return (atomicLong.get() & Long.MIN_VALUE) == 0;
        }
        do {
            j12 = atomicLong.get();
            j13 = j12 & Long.MIN_VALUE;
        } while (!atomicLong.compareAndSet(j12, a(Long.MAX_VALUE & j12, j11) | j13));
        if (j12 != Long.MIN_VALUE) {
            return j13 == 0;
        }
        f(atomicLong, queue, gVar, pVar);
        return false;
    }

    public static long i(AtomicLong atomicLong, long j11) {
        long j12;
        long j13;
        do {
            j12 = atomicLong.get();
            if (j12 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j13 = j12 - j11;
            if (j13 < 0) {
                throw new IllegalStateException("More produced than requested: " + j13);
            }
        } while (!atomicLong.compareAndSet(j12, j13));
        return j13;
    }

    public static boolean j(long j11) {
        if (j11 >= 0) {
            return j11 != 0;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + j11);
    }
}
