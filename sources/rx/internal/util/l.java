package rx.internal.util;

import rx.d;
import rx.e;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class l<T> extends rx.e<T> {

    /* renamed from: b, reason: collision with root package name */
    public final T f86742b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements e.t<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f86743a;

        public a(Object obj) {
            this.f86743a = obj;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.f<? super T> fVar) {
            fVar.h((Object) this.f86743a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<R> implements e.t<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f86744a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.f<R> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ qb0.f f86746b;

            public a(qb0.f fVar) {
                this.f86746b = fVar;
            }

            @Override // qb0.f
            public void h(R r11) {
                this.f86746b.h(r11);
            }

            @Override // qb0.f
            public void onError(Throwable th2) {
                this.f86746b.onError(th2);
            }
        }

        public b(p pVar) {
            this.f86744a = pVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.f<? super R> fVar) {
            rx.e eVar = (rx.e) this.f86744a.call(l.this.f86742b);
            if (eVar instanceof l) {
                fVar.h(((l) eVar).f86742b);
                return;
            }
            a aVar = new a(fVar);
            fVar.b(aVar);
            eVar.j0(aVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> implements e.t<T> {

        /* renamed from: a, reason: collision with root package name */
        public final rx.internal.schedulers.b f86748a;

        /* renamed from: b, reason: collision with root package name */
        public final T f86749b;

        public c(rx.internal.schedulers.b bVar, T t11) {
            this.f86748a = bVar;
            this.f86749b = t11;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.f<? super T> fVar) {
            fVar.b(this.f86748a.d(new e(fVar, this.f86749b)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> implements e.t<T> {

        /* renamed from: a, reason: collision with root package name */
        public final rx.d f86750a;

        /* renamed from: b, reason: collision with root package name */
        public final T f86751b;

        public d(rx.d dVar, T t11) {
            this.f86750a = dVar;
            this.f86751b = t11;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.f<? super T> fVar) {
            d.a a11 = this.f86750a.a();
            fVar.b(a11);
            a11.h(new e(fVar, this.f86751b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<T> implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.f<? super T> f86752a;

        /* renamed from: b, reason: collision with root package name */
        public final T f86753b;

        public e(qb0.f<? super T> fVar, T t11) {
            this.f86752a = fVar;
            this.f86753b = t11;
        }

        @Override // wb0.a
        public void call() {
            try {
                this.f86752a.h(this.f86753b);
            } catch (Throwable th2) {
                this.f86752a.onError(th2);
            }
        }
    }

    public l(T t11) {
        super(new a(t11));
        this.f86742b = t11;
    }

    public static <T> l<T> P0(T t11) {
        return new l<>(t11);
    }

    public T Q0() {
        return this.f86742b;
    }

    public <R> rx.e<R> R0(p<? super T, ? extends rx.e<? extends R>> pVar) {
        return rx.e.n(new b(pVar));
    }

    public rx.e<T> S0(rx.d dVar) {
        return dVar instanceof rx.internal.schedulers.b ? rx.e.n(new c((rx.internal.schedulers.b) dVar, this.f86742b)) : rx.e.n(new d(dVar, this.f86742b));
    }
}
