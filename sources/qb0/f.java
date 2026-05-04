package qb0;

import rx.internal.util.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class f<T> implements h {

    /* renamed from: a, reason: collision with root package name */
    public final m f82038a = new m();

    public final void b(h hVar) {
        this.f82038a.a(hVar);
    }

    public abstract void h(T t11);

    @Override // qb0.h
    public final boolean isUnsubscribed() {
        return this.f82038a.isUnsubscribed();
    }

    public abstract void onError(Throwable th2);

    @Override // qb0.h
    public final void unsubscribe() {
        this.f82038a.unsubscribe();
    }
}
