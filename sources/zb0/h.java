package zb0;

import rx.exceptions.OnErrorNotImplementedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.c f102522a;

        public a(qb0.c cVar) {
            this.f102522a = cVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f102522a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f102522a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f102522a.onNext(t11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.a f102526a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.b f102527b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wb0.b f102528c;

        public d(wb0.a aVar, wb0.b bVar, wb0.b bVar2) {
            this.f102526a = aVar;
            this.f102527b = bVar;
            this.f102528c = bVar2;
        }

        @Override // qb0.c
        public final void onCompleted() {
            this.f102526a.call();
        }

        @Override // qb0.c
        public final void onError(Throwable th2) {
            this.f102527b.call(th2);
        }

        @Override // qb0.c
        public final void onNext(T t11) {
            this.f102528c.call(t11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f102529a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f102529a = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f102529a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f102529a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f102529a.onNext(t11);
        }
    }

    public h() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> qb0.g<T> a(wb0.b<? super T> bVar) {
        if (bVar != null) {
            return new b(bVar);
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> qb0.g<T> b(wb0.b<? super T> bVar, wb0.b<Throwable> bVar2) {
        if (bVar == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (bVar2 != null) {
            return new c(bVar2, bVar);
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public static <T> qb0.g<T> c(wb0.b<? super T> bVar, wb0.b<Throwable> bVar2, wb0.a aVar) {
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

    public static <T> qb0.g<T> d() {
        return e(zb0.c.d());
    }

    public static <T> qb0.g<T> e(qb0.c<? super T> cVar) {
        return new a(cVar);
    }

    public static <T> qb0.g<T> f(qb0.g<? super T> gVar) {
        return new e(gVar, gVar);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f102523a;

        public b(wb0.b bVar) {
            this.f102523a = bVar;
        }

        @Override // qb0.c
        public final void onError(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }

        @Override // qb0.c
        public final void onNext(T t11) {
            this.f102523a.call(t11);
        }

        @Override // qb0.c
        public final void onCompleted() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f102524a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.b f102525b;

        public c(wb0.b bVar, wb0.b bVar2) {
            this.f102524a = bVar;
            this.f102525b = bVar2;
        }

        @Override // qb0.c
        public final void onError(Throwable th2) {
            this.f102524a.call(th2);
        }

        @Override // qb0.c
        public final void onNext(T t11) {
            this.f102525b.call(t11);
        }

        @Override // qb0.c
        public final void onCompleted() {
        }
    }
}
