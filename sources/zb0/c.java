package zb0;

import rx.exceptions.OnErrorNotImplementedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final qb0.c<Object> f102503a = new a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<T> implements qb0.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.a f102507a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.b f102508b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wb0.b f102509c;

        public d(wb0.a aVar, wb0.b bVar, wb0.b bVar2) {
            this.f102507a = aVar;
            this.f102508b = bVar;
            this.f102509c = bVar2;
        }

        @Override // qb0.c
        public final void onCompleted() {
            this.f102507a.call();
        }

        @Override // qb0.c
        public final void onError(Throwable th2) {
            this.f102508b.call(th2);
        }

        @Override // qb0.c
        public final void onNext(T t11) {
            this.f102509c.call(t11);
        }
    }

    public c() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> qb0.c<T> a(wb0.b<? super T> bVar) {
        if (bVar != null) {
            return new b(bVar);
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> qb0.c<T> b(wb0.b<? super T> bVar, wb0.b<Throwable> bVar2) {
        if (bVar == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (bVar2 != null) {
            return new C1393c(bVar2, bVar);
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public static <T> qb0.c<T> c(wb0.b<? super T> bVar, wb0.b<Throwable> bVar2, wb0.a aVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (bVar2 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        if (aVar != null) {
            return new d(aVar, bVar2, bVar);
        }
        throw new IllegalArgumentException("onComplete can not be null");
    }

    public static <T> qb0.c<T> d() {
        return (qb0.c<T>) f102503a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements qb0.c<Object> {
        @Override // qb0.c
        public final void onError(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }

        @Override // qb0.c
        public final void onCompleted() {
        }

        @Override // qb0.c
        public final void onNext(Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> implements qb0.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f102504a;

        public b(wb0.b bVar) {
            this.f102504a = bVar;
        }

        @Override // qb0.c
        public final void onError(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }

        @Override // qb0.c
        public final void onNext(T t11) {
            this.f102504a.call(t11);
        }

        @Override // qb0.c
        public final void onCompleted() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: zb0.c$c, reason: collision with other inner class name */
    public static class C1393c<T> implements qb0.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f102505a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.b f102506b;

        public C1393c(wb0.b bVar, wb0.b bVar2) {
            this.f102505a = bVar;
            this.f102506b = bVar2;
        }

        @Override // qb0.c
        public final void onError(Throwable th2) {
            this.f102505a.call(th2);
        }

        @Override // qb0.c
        public final void onNext(T t11) {
            this.f102506b.call(t11);
        }

        @Override // qb0.c
        public final void onCompleted() {
        }
    }
}
