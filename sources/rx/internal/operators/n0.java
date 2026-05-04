package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class n0<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable<? extends T> f85760a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends AtomicLong implements qb0.d {
        private static final long serialVersionUID = -8730475647105475802L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85761a;

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<? extends T> f85762b;

        public a(qb0.g<? super T> gVar, Iterator<? extends T> it) {
            this.f85761a = gVar;
            this.f85762b = it;
        }

        public void a() {
            qb0.g<? super T> gVar = this.f85761a;
            Iterator<? extends T> it = this.f85762b;
            while (!gVar.isUnsubscribed()) {
                try {
                    gVar.onNext(it.next());
                    if (gVar.isUnsubscribed()) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (gVar.isUnsubscribed()) {
                                return;
                            }
                            gVar.onCompleted();
                            return;
                        }
                    } catch (Throwable th2) {
                        vb0.a.f(th2, gVar);
                        return;
                    }
                } catch (Throwable th3) {
                    vb0.a.f(th3, gVar);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
        
            r9 = rx.internal.operators.a.i(r8, r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(long r9) {
            /*
                r8 = this;
                qb0.g<? super T> r0 = r8.f85761a
                java.util.Iterator<? extends T> r1 = r8.f85762b
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L3e
                boolean r6 = r0.isUnsubscribed()
                if (r6 == 0) goto L12
                goto L4e
            L12:
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L39
                r0.onNext(r6)
                boolean r6 = r0.isUnsubscribed()
                if (r6 == 0) goto L20
                goto L4e
            L20:
                boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L34
                if (r6 != 0) goto L30
                boolean r9 = r0.isUnsubscribed()
                if (r9 != 0) goto L4e
                r0.onCompleted()
                return
            L30:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L34:
                r9 = move-exception
                vb0.a.f(r9, r0)
                return
            L39:
                r9 = move-exception
                vb0.a.f(r9, r0)
                return
            L3e:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = rx.internal.operators.a.i(r8, r4)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
            L4e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.n0.a.b(long):void");
        }

        @Override // qb0.d
        public void request(long j11) {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j11 == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                a();
            } else {
                if (j11 <= 0 || rx.internal.operators.a.b(this, j11) != 0) {
                    return;
                }
                b(j11);
            }
        }
    }

    public n0(Iterable<? extends T> iterable) {
        if (iterable == null) {
            throw new NullPointerException("iterable must not be null");
        }
        this.f85760a = iterable;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        try {
            Iterator<? extends T> it = this.f85760a.iterator();
            boolean hasNext = it.hasNext();
            if (gVar.isUnsubscribed()) {
                return;
            }
            if (hasNext) {
                gVar.setProducer(new a(gVar, it));
            } else {
                gVar.onCompleted();
            }
        } catch (Throwable th2) {
            vb0.a.f(th2, gVar);
        }
    }
}
