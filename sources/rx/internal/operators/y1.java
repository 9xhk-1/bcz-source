package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class y1<T, V> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<? extends T> f86402a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, ? extends rx.c<V>> f86403b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dc0.c f86404a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zb0.g f86405b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.y1$a$a, reason: collision with other inner class name */
        public class C1108a implements wb0.p<V, T> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f86407a;

            public C1108a(Object obj) {
                this.f86407a = obj;
            }

            @Override // wb0.p
            public T call(V v11) {
                return (T) this.f86407a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, dc0.c cVar, zb0.g gVar2) {
            super(gVar);
            this.f86404a = cVar;
            this.f86405b = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86404a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86405b.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qb0.c
        public void onNext(T t11) {
            try {
                this.f86404a.onNext(y1.this.f86403b.call(t11).D5(1).q1(null).c3(new C1108a(t11)));
            } catch (Throwable th2) {
                vb0.a.f(th2, this);
            }
        }
    }

    public y1(rx.c<? extends T> cVar, wb0.p<? super T, ? extends rx.c<V>> pVar) {
        this.f86402a = cVar;
        this.f86403b = pVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        zb0.g gVar2 = new zb0.g(gVar);
        dc0.c y72 = dc0.c.y7();
        gVar.add(rx.c.h3(y72).J6(zb0.h.e(gVar2)));
        return new a(gVar, y72, gVar2);
    }
}
