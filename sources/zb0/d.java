package zb0;

import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d implements qb0.b, qb0.h {

    /* renamed from: a, reason: collision with root package name */
    public final qb0.b f102510a;

    /* renamed from: b, reason: collision with root package name */
    public qb0.h f102511b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f102512c;

    public d(qb0.b bVar) {
        this.f102510a = bVar;
    }

    @Override // qb0.b
    public void a(qb0.h hVar) {
        this.f102511b = hVar;
        try {
            this.f102510a.a(this);
        } catch (Throwable th2) {
            vb0.a.e(th2);
            hVar.unsubscribe();
            onError(th2);
        }
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return this.f102512c || this.f102511b.isUnsubscribed();
    }

    @Override // qb0.b
    public void onCompleted() {
        if (this.f102512c) {
            return;
        }
        this.f102512c = true;
        try {
            this.f102510a.onCompleted();
        } catch (Throwable th2) {
            vb0.a.e(th2);
            throw new OnCompletedFailedException(th2);
        }
    }

    @Override // qb0.b
    public void onError(Throwable th2) {
        if (this.f102512c) {
            ac0.c.I(th2);
            return;
        }
        this.f102512c = true;
        try {
            this.f102510a.onError(th2);
        } catch (Throwable th3) {
            vb0.a.e(th3);
            throw new OnErrorFailedException(new CompositeException(th2, th3));
        }
    }

    @Override // qb0.h
    public void unsubscribe() {
        this.f102511b.unsubscribe();
    }
}
