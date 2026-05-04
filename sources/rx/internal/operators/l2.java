package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class l2<T, R> implements c.b<R, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super T, ? extends R> f85693a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super Throwable, ? extends R> f85694b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.o<? extends R> f85695c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f85696a;

        public a(b bVar) {
            this.f85696a = bVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            this.f85696a.C(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T, R> extends qb0.g<T> {

        /* renamed from: j, reason: collision with root package name */
        public static final long f85698j = Long.MIN_VALUE;

        /* renamed from: k, reason: collision with root package name */
        public static final long f85699k = Long.MAX_VALUE;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super R> f85700a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.p<? super T, ? extends R> f85701b;

        /* renamed from: c, reason: collision with root package name */
        public final wb0.p<? super Throwable, ? extends R> f85702c;

        /* renamed from: d, reason: collision with root package name */
        public final wb0.o<? extends R> f85703d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f85704e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicLong f85705f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<qb0.d> f85706g = new AtomicReference<>();

        /* renamed from: h, reason: collision with root package name */
        public long f85707h;

        /* renamed from: i, reason: collision with root package name */
        public R f85708i;

        public b(qb0.g<? super R> gVar, wb0.p<? super T, ? extends R> pVar, wb0.p<? super Throwable, ? extends R> pVar2, wb0.o<? extends R> oVar) {
            this.f85700a = gVar;
            this.f85701b = pVar;
            this.f85702c = pVar2;
            this.f85703d = oVar;
        }

        public void C(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j11);
            }
            if (j11 == 0) {
                return;
            }
            while (true) {
                long j12 = this.f85704e.get();
                if ((j12 & Long.MIN_VALUE) != 0) {
                    long j13 = Long.MAX_VALUE & j12;
                    if (this.f85704e.compareAndSet(j12, Long.MIN_VALUE | rx.internal.operators.a.a(j13, j11))) {
                        if (j13 == 0) {
                            if (!this.f85700a.isUnsubscribed()) {
                                this.f85700a.onNext(this.f85708i);
                            }
                            if (this.f85700a.isUnsubscribed()) {
                                return;
                            }
                            this.f85700a.onCompleted();
                            return;
                        }
                        return;
                    }
                } else {
                    if (this.f85704e.compareAndSet(j12, rx.internal.operators.a.a(j12, j11))) {
                        AtomicReference<qb0.d> atomicReference = this.f85706g;
                        qb0.d dVar = atomicReference.get();
                        if (dVar != null) {
                            dVar.request(j11);
                            return;
                        }
                        rx.internal.operators.a.b(this.f85705f, j11);
                        qb0.d dVar2 = atomicReference.get();
                        if (dVar2 != null) {
                            long andSet = this.f85705f.getAndSet(0L);
                            if (andSet != 0) {
                                dVar2.request(andSet);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }

        public void D() {
            long j11;
            do {
                j11 = this.f85704e.get();
                if ((j11 & Long.MIN_VALUE) != 0) {
                    return;
                }
            } while (!this.f85704e.compareAndSet(j11, Long.MIN_VALUE | j11));
            if (j11 != 0 || this.f85706g.get() == null) {
                if (!this.f85700a.isUnsubscribed()) {
                    this.f85700a.onNext(this.f85708i);
                }
                if (this.f85700a.isUnsubscribed()) {
                    return;
                }
                this.f85700a.onCompleted();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            q();
            try {
                this.f85708i = this.f85703d.call();
            } catch (Throwable th2) {
                vb0.a.f(th2, this.f85700a);
            }
            D();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            q();
            try {
                this.f85708i = this.f85702c.call(th2);
            } catch (Throwable th3) {
                vb0.a.g(th3, this.f85700a, th2);
            }
            D();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                this.f85707h++;
                this.f85700a.onNext(this.f85701b.call(t11));
            } catch (Throwable th2) {
                vb0.a.g(th2, this.f85700a, t11);
            }
        }

        public void q() {
            long j11 = this.f85707h;
            if (j11 == 0 || this.f85706g.get() == null) {
                return;
            }
            rx.internal.operators.a.i(this.f85704e, j11);
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            if (!androidx.camera.view.q.a(this.f85706g, null, dVar)) {
                throw new IllegalStateException("Producer already set!");
            }
            long andSet = this.f85705f.getAndSet(0L);
            if (andSet != 0) {
                dVar.request(andSet);
            }
        }
    }

    public l2(wb0.p<? super T, ? extends R> pVar, wb0.p<? super Throwable, ? extends R> pVar2, wb0.o<? extends R> oVar) {
        this.f85693a = pVar;
        this.f85694b = pVar2;
        this.f85695c = oVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super R> gVar) {
        b bVar = new b(gVar, this.f85693a, this.f85694b, this.f85695c);
        gVar.add(bVar);
        gVar.setProducer(new a(bVar));
        return bVar;
    }
}
