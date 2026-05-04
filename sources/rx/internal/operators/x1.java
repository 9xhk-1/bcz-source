package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class x1<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final long f86340a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f86341b;

    /* renamed from: c, reason: collision with root package name */
    public final rx.d f86342c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f86343a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.a f86344b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86345c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.x1$a$a, reason: collision with other inner class name */
        public class C1105a implements wb0.a {
            public C1105a() {
            }

            @Override // wb0.a
            public void call() {
                a aVar = a.this;
                if (aVar.f86343a) {
                    return;
                }
                aVar.f86343a = true;
                aVar.f86345c.onCompleted();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Throwable f86348a;

            public b(Throwable th2) {
                this.f86348a = th2;
            }

            @Override // wb0.a
            public void call() {
                a aVar = a.this;
                if (aVar.f86343a) {
                    return;
                }
                aVar.f86343a = true;
                aVar.f86345c.onError(this.f86348a);
                a.this.f86344b.unsubscribe();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f86350a;

            public c(Object obj) {
                this.f86350a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // wb0.a
            public void call() {
                a aVar = a.this;
                if (aVar.f86343a) {
                    return;
                }
                aVar.f86345c.onNext(this.f86350a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, d.a aVar, qb0.g gVar2) {
            super(gVar);
            this.f86344b = aVar;
            this.f86345c = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            d.a aVar = this.f86344b;
            C1105a c1105a = new C1105a();
            x1 x1Var = x1.this;
            aVar.j(c1105a, x1Var.f86340a, x1Var.f86341b);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86344b.h(new b(th2));
        }

        @Override // qb0.c
        public void onNext(T t11) {
            d.a aVar = this.f86344b;
            c cVar = new c(t11);
            x1 x1Var = x1.this;
            aVar.j(cVar, x1Var.f86340a, x1Var.f86341b);
        }
    }

    public x1(long j11, TimeUnit timeUnit, rx.d dVar) {
        this.f86340a = j11;
        this.f86341b = timeUnit;
        this.f86342c = dVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        d.a a11 = this.f86342c.a();
        gVar.add(a11);
        return new a(gVar, a11, gVar);
    }
}
