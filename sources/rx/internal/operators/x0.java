package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class x0<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f86331a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.q<T, T, T> f86332b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f86333a;

        public a(b bVar) {
            this.f86333a = bVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            this.f86333a.q(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> {

        /* renamed from: e, reason: collision with root package name */
        public static final Object f86335e = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f86336a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.q<T, T, T> f86337b;

        /* renamed from: c, reason: collision with root package name */
        public T f86338c = (T) f86335e;

        /* renamed from: d, reason: collision with root package name */
        public boolean f86339d;

        public b(qb0.g<? super T> gVar, wb0.q<T, T, T> qVar) {
            this.f86336a = gVar;
            this.f86337b = qVar;
            request(0L);
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86339d) {
                return;
            }
            this.f86339d = true;
            T t11 = this.f86338c;
            if (t11 == f86335e) {
                this.f86336a.onError(new NoSuchElementException());
            } else {
                this.f86336a.onNext(t11);
                this.f86336a.onCompleted();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f86339d) {
                ac0.c.I(th2);
            } else {
                this.f86339d = true;
                this.f86336a.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f86339d) {
                return;
            }
            T t12 = this.f86338c;
            if (t12 == f86335e) {
                this.f86338c = t11;
                return;
            }
            try {
                this.f86338c = this.f86337b.call(t12, t11);
            } catch (Throwable th2) {
                vb0.a.e(th2);
                unsubscribe();
                onError(th2);
            }
        }

        public void q(long j11) {
            if (j11 >= 0) {
                if (j11 != 0) {
                    request(Long.MAX_VALUE);
                }
            } else {
                throw new IllegalArgumentException("n >= 0 required but it was " + j11);
            }
        }
    }

    public x0(rx.c<T> cVar, wb0.q<T, T, T> qVar) {
        this.f86331a = cVar;
        this.f86332b = qVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        b bVar = new b(gVar, this.f86332b);
        gVar.add(bVar);
        gVar.setProducer(new a(bVar));
        this.f86331a.J6(bVar);
    }
}
