package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public enum EmptyObservableHolder implements c.a<Object> {
    INSTANCE;

    static final rx.c<Object> EMPTY = rx.c.I6(INSTANCE);

    public static <T> rx.c<T> instance() {
        return (rx.c<T>) EMPTY;
    }

    @Override // wb0.b
    public void call(qb0.g<? super Object> gVar) {
        gVar.onCompleted();
    }
}
