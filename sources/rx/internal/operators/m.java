package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b;
import rx.internal.subscriptions.SequentialSubscription;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class m implements b.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable<? extends rx.b> f85719a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends AtomicInteger implements qb0.b {
        private static final long serialVersionUID = -7965400327305809232L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.b f85720a;

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<? extends rx.b> f85721b;

        /* renamed from: c, reason: collision with root package name */
        public final SequentialSubscription f85722c = new SequentialSubscription();

        public a(qb0.b bVar, Iterator<? extends rx.b> it) {
            this.f85720a = bVar;
            this.f85721b = it;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            this.f85722c.replace(hVar);
        }

        public void b() {
            if (!this.f85722c.isUnsubscribed() && getAndIncrement() == 0) {
                Iterator<? extends rx.b> it = this.f85721b;
                while (!this.f85722c.isUnsubscribed()) {
                    try {
                        if (!it.hasNext()) {
                            this.f85720a.onCompleted();
                            return;
                        }
                        try {
                            rx.b next = it.next();
                            if (next == null) {
                                this.f85720a.onError(new NullPointerException("The completable returned is null"));
                                return;
                            } else {
                                next.G0(this);
                                if (decrementAndGet() == 0) {
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            this.f85720a.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        this.f85720a.onError(th3);
                        return;
                    }
                }
            }
        }

        @Override // qb0.b
        public void onCompleted() {
            b();
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            this.f85720a.onError(th2);
        }
    }

    public m(Iterable<? extends rx.b> iterable) {
        this.f85719a = iterable;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.b bVar) {
        try {
            Iterator<? extends rx.b> it = this.f85719a.iterator();
            if (it == null) {
                bVar.a(ec0.f.e());
                bVar.onError(new NullPointerException("The iterator returned is null"));
            } else {
                a aVar = new a(bVar, it);
                bVar.a(aVar.f85722c);
                aVar.b();
            }
        } catch (Throwable th2) {
            bVar.a(ec0.f.e());
            bVar.onError(th2);
        }
    }
}
