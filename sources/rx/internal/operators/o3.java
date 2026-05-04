package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class o3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final long f85860a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f85861b;

    /* renamed from: c, reason: collision with root package name */
    public final rx.d f85862c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85863a;

        public a(qb0.g<? super T> gVar) {
            super(gVar);
            this.f85863a = gVar;
        }

        @Override // wb0.a
        public void call() {
            onCompleted();
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85863a.onCompleted();
            unsubscribe();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85863a.onError(th2);
            unsubscribe();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85863a.onNext(t11);
        }
    }

    public o3(long j11, TimeUnit timeUnit, rx.d dVar) {
        this.f85860a = j11;
        this.f85861b = timeUnit;
        this.f85862c = dVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        d.a a11 = this.f85862c.a();
        gVar.add(a11);
        a aVar = new a(new zb0.g(gVar));
        a11.j(aVar, this.f85860a, this.f85861b);
        return aVar;
    }
}
