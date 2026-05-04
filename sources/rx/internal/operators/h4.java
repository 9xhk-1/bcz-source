package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.d;
import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e.t<T> f85455a;

    /* renamed from: b, reason: collision with root package name */
    public final long f85456b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f85457c;

    /* renamed from: d, reason: collision with root package name */
    public final rx.d f85458d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.f<T> implements wb0.a {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.f<? super T> f85459b;

        /* renamed from: c, reason: collision with root package name */
        public final d.a f85460c;

        /* renamed from: d, reason: collision with root package name */
        public final long f85461d;

        /* renamed from: e, reason: collision with root package name */
        public final TimeUnit f85462e;

        /* renamed from: f, reason: collision with root package name */
        public T f85463f;

        /* renamed from: g, reason: collision with root package name */
        public Throwable f85464g;

        public a(qb0.f<? super T> fVar, d.a aVar, long j11, TimeUnit timeUnit) {
            this.f85459b = fVar;
            this.f85460c = aVar;
            this.f85461d = j11;
            this.f85462e = timeUnit;
        }

        @Override // wb0.a
        public void call() {
            try {
                Throwable th2 = this.f85464g;
                if (th2 != null) {
                    this.f85464g = null;
                    this.f85459b.onError(th2);
                } else {
                    T t11 = this.f85463f;
                    this.f85463f = null;
                    this.f85459b.h(t11);
                }
                this.f85460c.unsubscribe();
            } catch (Throwable th3) {
                this.f85460c.unsubscribe();
                throw th3;
            }
        }

        @Override // qb0.f
        public void h(T t11) {
            this.f85463f = t11;
            this.f85460c.j(this, this.f85461d, this.f85462e);
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            this.f85464g = th2;
            this.f85460c.j(this, this.f85461d, this.f85462e);
        }
    }

    public h4(e.t<T> tVar, long j11, TimeUnit timeUnit, rx.d dVar) {
        this.f85455a = tVar;
        this.f85458d = dVar;
        this.f85456b = j11;
        this.f85457c = timeUnit;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        d.a a11 = this.f85458d.a();
        a aVar = new a(fVar, a11, this.f85456b, this.f85457c);
        fVar.b(a11);
        fVar.b(aVar);
        this.f85455a.call(aVar);
    }
}
