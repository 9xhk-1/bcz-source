package rx.internal.subscriptions;

import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public enum Unsubscribed implements h {
    INSTANCE;

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return true;
    }

    @Override // qb0.h
    public void unsubscribe() {
    }
}
