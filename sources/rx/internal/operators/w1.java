package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class w1<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final long f86247a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f86248b;

    /* renamed from: c, reason: collision with root package name */
    public final rx.d f86249c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final b<T> f86250a;

        /* renamed from: b, reason: collision with root package name */
        public final qb0.g<?> f86251b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ec0.e f86252c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d.a f86253d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ zb0.g f86254e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.w1$a$a, reason: collision with other inner class name */
        public class C1104a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f86256a;

            public C1104a(int i11) {
                this.f86256a = i11;
            }

            @Override // wb0.a
            public void call() {
                a aVar = a.this;
                aVar.f86250a.b(this.f86256a, aVar.f86254e, aVar.f86251b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, ec0.e eVar, d.a aVar, zb0.g gVar2) {
            super(gVar);
            this.f86252c = eVar;
            this.f86253d = aVar;
            this.f86254e = gVar2;
            this.f86250a = new b<>();
            this.f86251b = this;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86250a.c(this.f86254e, this);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86254e.onError(th2);
            unsubscribe();
            this.f86250a.a();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            int d11 = this.f86250a.d(t11);
            ec0.e eVar = this.f86252c;
            d.a aVar = this.f86253d;
            C1104a c1104a = new C1104a(d11);
            w1 w1Var = w1.this;
            eVar.b(aVar.j(c1104a, w1Var.f86247a, w1Var.f86248b));
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f86258a;

        /* renamed from: b, reason: collision with root package name */
        public T f86259b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f86260c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f86261d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f86262e;

        public synchronized void a() {
            this.f86258a++;
            this.f86259b = null;
            this.f86260c = false;
        }

        public void b(int i11, qb0.g<T> gVar, qb0.g<?> gVar2) {
            synchronized (this) {
                if (!this.f86262e && this.f86260c && i11 == this.f86258a) {
                    T t11 = this.f86259b;
                    this.f86259b = null;
                    this.f86260c = false;
                    this.f86262e = true;
                    try {
                        gVar.onNext(t11);
                        synchronized (this) {
                            try {
                                if (this.f86261d) {
                                    gVar.onCompleted();
                                } else {
                                    this.f86262e = false;
                                }
                            } finally {
                            }
                        }
                    } catch (Throwable th2) {
                        vb0.a.g(th2, gVar2, t11);
                    }
                }
            }
        }

        public void c(qb0.g<T> gVar, qb0.g<?> gVar2) {
            synchronized (this) {
                try {
                    if (this.f86262e) {
                        this.f86261d = true;
                        return;
                    }
                    T t11 = this.f86259b;
                    boolean z11 = this.f86260c;
                    this.f86259b = null;
                    this.f86260c = false;
                    this.f86262e = true;
                    if (z11) {
                        try {
                            gVar.onNext(t11);
                        } catch (Throwable th2) {
                            vb0.a.g(th2, gVar2, t11);
                            return;
                        }
                    }
                    gVar.onCompleted();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public synchronized int d(T t11) {
            int i11;
            this.f86259b = t11;
            this.f86260c = true;
            i11 = this.f86258a + 1;
            this.f86258a = i11;
            return i11;
        }
    }

    public w1(long j11, TimeUnit timeUnit, rx.d dVar) {
        this.f86247a = j11;
        this.f86248b = timeUnit;
        this.f86249c = dVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        d.a a11 = this.f86249c.a();
        zb0.g gVar2 = new zb0.g(gVar);
        ec0.e eVar = new ec0.e();
        gVar2.add(a11);
        gVar2.add(eVar);
        return new a(gVar, eVar, a11, gVar2);
    }
}
