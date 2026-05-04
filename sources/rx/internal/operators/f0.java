package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f0<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f85311a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements qb0.d, qb0.h {

        /* renamed from: a, reason: collision with root package name */
        public final b<T> f85312a;

        public a(b<T> bVar) {
            this.f85312a = bVar;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f85312a.isUnsubscribed();
        }

        @Override // qb0.d
        public void request(long j11) {
            this.f85312a.q(j11);
        }

        @Override // qb0.h
        public void unsubscribe() {
            this.f85312a.C();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReference<qb0.g<? super T>> f85313a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<qb0.d> f85314b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f85315c = new AtomicLong();

        public b(qb0.g<? super T> gVar) {
            this.f85313a = new AtomicReference<>(gVar);
        }

        public void C() {
            this.f85314b.lazySet(c.INSTANCE);
            this.f85313a.lazySet(null);
            unsubscribe();
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85314b.lazySet(c.INSTANCE);
            qb0.g<? super T> andSet = this.f85313a.getAndSet(null);
            if (andSet != null) {
                andSet.onCompleted();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85314b.lazySet(c.INSTANCE);
            qb0.g<? super T> andSet = this.f85313a.getAndSet(null);
            if (andSet != null) {
                andSet.onError(th2);
            } else {
                ac0.c.I(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            qb0.g<? super T> gVar = this.f85313a.get();
            if (gVar != null) {
                gVar.onNext(t11);
            }
        }

        public void q(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j11);
            }
            qb0.d dVar = this.f85314b.get();
            if (dVar != null) {
                dVar.request(j11);
                return;
            }
            rx.internal.operators.a.b(this.f85315c, j11);
            qb0.d dVar2 = this.f85314b.get();
            if (dVar2 == null || dVar2 == c.INSTANCE) {
                return;
            }
            dVar2.request(this.f85315c.getAndSet(0L));
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            if (androidx.camera.view.q.a(this.f85314b, null, dVar)) {
                dVar.request(this.f85315c.getAndSet(0L));
            } else if (this.f85314b.get() != c.INSTANCE) {
                throw new IllegalStateException("Producer already set!");
            }
        }
    }

    public f0(rx.c<T> cVar) {
        this.f85311a = cVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        b bVar = new b(gVar);
        a aVar = new a(bVar);
        gVar.add(aVar);
        gVar.setProducer(aVar);
        this.f85311a.J6(bVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c implements qb0.d {
        INSTANCE;

        @Override // qb0.d
        public void request(long j11) {
        }
    }
}
