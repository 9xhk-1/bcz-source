package ec0;

import qb0.h;
import rx.internal.subscriptions.SequentialSubscription;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final SequentialSubscription f49634a = new SequentialSubscription();

    public h a() {
        return this.f49634a.current();
    }

    public void b(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        this.f49634a.replace(hVar);
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return this.f49634a.isUnsubscribed();
    }

    @Override // qb0.h
    public void unsubscribe() {
        this.f49634a.unsubscribe();
    }
}
