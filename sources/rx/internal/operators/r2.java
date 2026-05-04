package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.a;
import rx.c;
import rx.internal.util.BackpressureDrainManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class r2<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final Long f85994a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.a f85995b;

    /* renamed from: c, reason: collision with root package name */
    public final a.d f85996c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> implements BackpressureDrainManager.a {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicLong f85998b;

        /* renamed from: c, reason: collision with root package name */
        public final qb0.g<? super T> f85999c;

        /* renamed from: e, reason: collision with root package name */
        public final BackpressureDrainManager f86001e;

        /* renamed from: f, reason: collision with root package name */
        public final wb0.a f86002f;

        /* renamed from: g, reason: collision with root package name */
        public final a.d f86003g;

        /* renamed from: a, reason: collision with root package name */
        public final ConcurrentLinkedQueue<Object> f85997a = new ConcurrentLinkedQueue<>();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f86000d = new AtomicBoolean(false);

        public a(qb0.g<? super T> gVar, Long l11, wb0.a aVar, a.d dVar) {
            this.f85999c = gVar;
            this.f85998b = l11 != null ? new AtomicLong(l11.longValue()) : null;
            this.f86002f = aVar;
            this.f86001e = new BackpressureDrainManager(this);
            this.f86003g = dVar;
        }

        public qb0.d C() {
            return this.f86001e;
        }

        @Override // rx.internal.util.BackpressureDrainManager.a
        public boolean accept(Object obj) {
            return v.a(this.f85999c, obj);
        }

        @Override // rx.internal.util.BackpressureDrainManager.a
        public void h(Throwable th2) {
            if (th2 != null) {
                this.f85999c.onError(th2);
            } else {
                this.f85999c.onCompleted();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86000d.get()) {
                return;
            }
            this.f86001e.terminateAndDrain();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f86000d.get()) {
                return;
            }
            this.f86001e.terminateAndDrain(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (q()) {
                this.f85997a.offer(v.j(t11));
                this.f86001e.drain();
            }
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.internal.util.BackpressureDrainManager.a
        public Object peek() {
            return this.f85997a.peek();
        }

        @Override // rx.internal.util.BackpressureDrainManager.a
        public Object poll() {
            Object poll = this.f85997a.poll();
            AtomicLong atomicLong = this.f85998b;
            if (atomicLong != null && poll != null) {
                atomicLong.incrementAndGet();
            }
            return poll;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean q() {
            /*
                r6 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r6.f85998b
                r1 = 1
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f85998b
                long r2 = r0.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L4a
                r0 = 0
                rx.a$d r4 = r6.f86003g     // Catch: rx.exceptions.MissingBackpressureException -> L23
                boolean r4 = r4.a()     // Catch: rx.exceptions.MissingBackpressureException -> L23
                if (r4 == 0) goto L34
                java.lang.Object r4 = r6.poll()     // Catch: rx.exceptions.MissingBackpressureException -> L23
                if (r4 == 0) goto L34
                r4 = r1
                goto L35
            L23:
                r4 = move-exception
                java.util.concurrent.atomic.AtomicBoolean r5 = r6.f86000d
                boolean r5 = r5.compareAndSet(r0, r1)
                if (r5 == 0) goto L34
                r6.unsubscribe()
                qb0.g<? super T> r5 = r6.f85999c
                r5.onError(r4)
            L34:
                r4 = r0
            L35:
                wb0.a r5 = r6.f86002f
                if (r5 == 0) goto L47
                r5.call()     // Catch: java.lang.Throwable -> L3d
                goto L47
            L3d:
                r1 = move-exception
                vb0.a.e(r1)
                rx.internal.util.BackpressureDrainManager r2 = r6.f86001e
                r2.terminateAndDrain(r1)
                return r0
            L47:
                if (r4 != 0) goto L4a
                return r0
            L4a:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f85998b
                r4 = 1
                long r4 = r2 - r4
                boolean r0 = r0.compareAndSet(r2, r4)
                if (r0 == 0) goto L6
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.r2.a.q():boolean");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final r2<?> f86004a = new r2<>();
    }

    public r2() {
        this.f85994a = null;
        this.f85995b = null;
        this.f85996c = rx.a.f84852b;
    }

    public static <T> r2<T> b() {
        return (r2<T>) b.f86004a;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        a aVar = new a(gVar, this.f85994a, this.f85995b, this.f85996c);
        gVar.add(aVar);
        gVar.setProducer(aVar.C());
        return aVar;
    }

    public r2(long j11) {
        this(j11, null, rx.a.f84852b);
    }

    public r2(long j11, wb0.a aVar) {
        this(j11, aVar, rx.a.f84852b);
    }

    public r2(long j11, wb0.a aVar, a.d dVar) {
        if (j11 <= 0) {
            throw new IllegalArgumentException("Buffer capacity must be > 0");
        }
        if (dVar != null) {
            this.f85994a = Long.valueOf(j11);
            this.f85995b = aVar;
            this.f85996c = dVar;
            return;
        }
        throw new NullPointerException("The BackpressureOverflow strategy must not be null");
    }
}
