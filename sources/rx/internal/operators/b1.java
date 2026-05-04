package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b1<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final long f85131a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f85132b;

    /* renamed from: c, reason: collision with root package name */
    public final rx.d f85133c;

    /* renamed from: d, reason: collision with root package name */
    public final rx.c<T> f85134d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85135a;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f85136b;

        public a(qb0.g<? super T> gVar) {
            this.f85135a = gVar;
        }

        @Override // wb0.a
        public void call() {
            this.f85136b = true;
        }

        @Override // qb0.c
        public void onCompleted() {
            try {
                this.f85135a.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            try {
                this.f85135a.onError(th2);
            } finally {
                unsubscribe();
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85136b) {
                this.f85135a.onNext(t11);
            }
        }
    }

    public b1(rx.c<T> cVar, long j11, TimeUnit timeUnit, rx.d dVar) {
        this.f85134d = cVar;
        this.f85131a = j11;
        this.f85132b = timeUnit;
        this.f85133c = dVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        d.a a11 = this.f85133c.a();
        a aVar = new a(gVar);
        aVar.add(a11);
        gVar.add(aVar);
        a11.j(aVar, this.f85131a, this.f85132b);
        this.f85134d.J6(aVar);
    }
}
