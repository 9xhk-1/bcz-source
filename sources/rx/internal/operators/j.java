package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.b;
import rx.internal.subscriptions.CancellableSubscription;
import rx.internal.subscriptions.SequentialSubscription;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class j implements b.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.b<qb0.a> f85537a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends AtomicBoolean implements qb0.a, qb0.h {
        private static final long serialVersionUID = 5539301318568668881L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.b f85538a;

        /* renamed from: b, reason: collision with root package name */
        public final SequentialSubscription f85539b = new SequentialSubscription();

        public a(qb0.b bVar) {
            this.f85538a = bVar;
        }

        @Override // qb0.a
        public void a(qb0.h hVar) {
            this.f85539b.update(hVar);
        }

        @Override // qb0.a
        public void b(wb0.n nVar) {
            a(new CancellableSubscription(nVar));
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // qb0.a
        public void onCompleted() {
            if (compareAndSet(false, true)) {
                try {
                    this.f85538a.onCompleted();
                } finally {
                    this.f85539b.unsubscribe();
                }
            }
        }

        @Override // qb0.a
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                ac0.c.I(th2);
                return;
            }
            try {
                this.f85538a.onError(th2);
            } finally {
                this.f85539b.unsubscribe();
            }
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f85539b.unsubscribe();
            }
        }
    }

    public j(wb0.b<qb0.a> bVar) {
        this.f85537a = bVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.b bVar) {
        a aVar = new a(bVar);
        bVar.a(aVar);
        try {
            this.f85537a.call(aVar);
        } catch (Throwable th2) {
            vb0.a.e(th2);
            aVar.onError(th2);
        }
    }
}
