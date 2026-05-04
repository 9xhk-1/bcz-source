package rx.internal.util;

import rx.Notification;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a<T> implements qb0.c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.b<Notification<? super T>> f86658a;

    public a(wb0.b<Notification<? super T>> bVar) {
        this.f86658a = bVar;
    }

    @Override // qb0.c
    public void onCompleted() {
        this.f86658a.call(Notification.b());
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.f86658a.call(Notification.d(th2));
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f86658a.call(Notification.e(t11));
    }
}
