package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.e;
import rx.internal.subscriptions.CancellableSubscription;
import rx.internal.subscriptions.SequentialSubscription;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class n4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.b<qb0.e<T>> f85788a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends AtomicBoolean implements qb0.e<T>, qb0.h {
        private static final long serialVersionUID = 8082834163465882809L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.f<? super T> f85789a;

        /* renamed from: b, reason: collision with root package name */
        public final SequentialSubscription f85790b = new SequentialSubscription();

        public a(qb0.f<? super T> fVar) {
            this.f85789a = fVar;
        }

        @Override // qb0.e
        public void a(qb0.h hVar) {
            this.f85790b.update(hVar);
        }

        @Override // qb0.e
        public void b(wb0.n nVar) {
            a(new CancellableSubscription(nVar));
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // qb0.e
        public void onError(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException();
            }
            if (!compareAndSet(false, true)) {
                ac0.c.I(th2);
                return;
            }
            try {
                this.f85789a.onError(th2);
            } finally {
                this.f85790b.unsubscribe();
            }
        }

        @Override // qb0.e
        public void onSuccess(T t11) {
            if (compareAndSet(false, true)) {
                try {
                    this.f85789a.h(t11);
                } finally {
                    this.f85790b.unsubscribe();
                }
            }
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f85790b.unsubscribe();
            }
        }
    }

    public n4(wb0.b<qb0.e<T>> bVar) {
        this.f85788a = bVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        a aVar = new a(fVar);
        fVar.b(aVar);
        try {
            this.f85788a.call(aVar);
        } catch (Throwable th2) {
            vb0.a.e(th2);
            aVar.onError(th2);
        }
    }
}
