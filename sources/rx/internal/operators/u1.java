package rx.internal.operators;

import rx.c;
import rx.exceptions.OnErrorThrowable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class u1<T, R> implements c.b<R, T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<R> f86126a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, R> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super R> f86127a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<R> f86128b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f86129c;

        public a(qb0.g<? super R> gVar, Class<R> cls) {
            this.f86127a = gVar;
            this.f86128b = cls;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86129c) {
                return;
            }
            this.f86127a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f86129c) {
                ac0.c.I(th2);
            } else {
                this.f86129c = true;
                this.f86127a.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                this.f86127a.onNext(this.f86128b.cast(t11));
            } catch (Throwable th2) {
                vb0.a.e(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, t11));
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f86127a.setProducer(dVar);
        }
    }

    public u1(Class<R> cls) {
        this.f86126a = cls;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super R> gVar) {
        a aVar = new a(gVar, this.f86126a);
        gVar.add(aVar);
        return aVar;
    }
}
