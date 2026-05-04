package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;
import rx.d;
import rx.exceptions.MissingBackpressureException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class q2<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.d f85939a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85940b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85941c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements c.b<T, T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f85942a;

        public a(int i11) {
            this.f85942a = i11;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public qb0.g<? super T> call(qb0.g<? super T> gVar) {
            b bVar = new b(bc0.c.d(), gVar, false, this.f85942a);
            bVar.C();
            return bVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85943a;

        /* renamed from: b, reason: collision with root package name */
        public final d.a f85944b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f85945c;

        /* renamed from: d, reason: collision with root package name */
        public final Queue<Object> f85946d;

        /* renamed from: e, reason: collision with root package name */
        public final int f85947e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f85948f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicLong f85949g = new AtomicLong();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicLong f85950h = new AtomicLong();

        /* renamed from: i, reason: collision with root package name */
        public Throwable f85951i;

        /* renamed from: j, reason: collision with root package name */
        public long f85952j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.d {
            public a() {
            }

            @Override // qb0.d
            public void request(long j11) {
                if (j11 > 0) {
                    rx.internal.operators.a.b(b.this.f85949g, j11);
                    b.this.D();
                }
            }
        }

        public b(rx.d dVar, qb0.g<? super T> gVar, boolean z11, int i11) {
            this.f85943a = gVar;
            this.f85944b = dVar.a();
            this.f85945c = z11;
            i11 = i11 <= 0 ? rx.internal.util.j.f86718d : i11;
            this.f85947e = i11 - (i11 >> 2);
            if (rx.internal.util.unsafe.n0.f()) {
                this.f85946d = new rx.internal.util.unsafe.z(i11);
            } else {
                this.f85946d = new rx.internal.util.atomic.d(i11);
            }
            request(i11);
        }

        public void C() {
            qb0.g<? super T> gVar = this.f85943a;
            gVar.setProducer(new a());
            gVar.add(this.f85944b);
            gVar.add(this);
        }

        public void D() {
            if (this.f85950h.getAndIncrement() == 0) {
                this.f85944b.h(this);
            }
        }

        @Override // wb0.a
        public void call() {
            long j11 = this.f85952j;
            Queue<Object> queue = this.f85946d;
            qb0.g<? super T> gVar = this.f85943a;
            long j12 = 1;
            do {
                long j13 = this.f85949g.get();
                while (j13 != j11) {
                    boolean z11 = this.f85948f;
                    Object poll = queue.poll();
                    boolean z12 = poll == null;
                    if (q(z11, z12, gVar, queue)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    gVar.onNext((Object) v.e(poll));
                    j11++;
                    if (j11 == this.f85947e) {
                        long i11 = rx.internal.operators.a.i(this.f85949g, j11);
                        request(j11);
                        j13 = i11;
                        j11 = 0;
                    }
                }
                if (j13 == j11 && q(this.f85948f, queue.isEmpty(), gVar, queue)) {
                    return;
                }
                this.f85952j = j11;
                j12 = this.f85950h.addAndGet(-j12);
            } while (j12 != 0);
        }

        @Override // qb0.c
        public void onCompleted() {
            if (isUnsubscribed() || this.f85948f) {
                return;
            }
            this.f85948f = true;
            D();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (isUnsubscribed() || this.f85948f) {
                ac0.c.I(th2);
                return;
            }
            this.f85951i = th2;
            this.f85948f = true;
            D();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (isUnsubscribed() || this.f85948f) {
                return;
            }
            if (this.f85946d.offer(v.j(t11))) {
                D();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        public boolean q(boolean z11, boolean z12, qb0.g<? super T> gVar, Queue<Object> queue) {
            if (gVar.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            if (this.f85945c) {
                if (!z12) {
                    return false;
                }
                Throwable th2 = this.f85951i;
                try {
                    if (th2 != null) {
                        gVar.onError(th2);
                    } else {
                        gVar.onCompleted();
                    }
                    return false;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Throwable th4 = this.f85951i;
            if (th4 != null) {
                queue.clear();
                try {
                    gVar.onError(th4);
                    return true;
                } finally {
                }
            }
            if (!z12) {
                return false;
            }
            try {
                gVar.onCompleted();
                return true;
            } finally {
            }
        }
    }

    public q2(rx.d dVar, boolean z11) {
        this(dVar, z11, rx.internal.util.j.f86718d);
    }

    public static <T> c.b<T, T> b(int i11) {
        return new a(i11);
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        rx.d dVar = this.f85939a;
        if ((dVar instanceof rx.internal.schedulers.f) || (dVar instanceof rx.internal.schedulers.m)) {
            return gVar;
        }
        b bVar = new b(dVar, gVar, this.f85940b, this.f85941c);
        bVar.C();
        return bVar;
    }

    public q2(rx.d dVar, boolean z11, int i11) {
        this.f85939a = dVar;
        this.f85940b = z11;
        this.f85941c = i11 <= 0 ? rx.internal.util.j.f86718d : i11;
    }
}
