package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class q3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super T, Boolean> f85954a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f85955a;

        public a(b bVar) {
            this.f85955a = bVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            this.f85955a.q(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85957a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f85958b;

        public b(qb0.g<? super T> gVar) {
            this.f85957a = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85958b) {
                return;
            }
            this.f85957a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85958b) {
                return;
            }
            this.f85957a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85957a.onNext(t11);
            try {
                if (q3.this.f85954a.call(t11).booleanValue()) {
                    this.f85958b = true;
                    this.f85957a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th2) {
                this.f85958b = true;
                vb0.a.g(th2, this.f85957a, t11);
                unsubscribe();
            }
        }

        public void q(long j11) {
            request(j11);
        }
    }

    public q3(wb0.p<? super T, Boolean> pVar) {
        this.f85954a = pVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        b bVar = new b(gVar);
        gVar.add(bVar);
        gVar.setProducer(new a(bVar));
        return bVar;
    }
}
