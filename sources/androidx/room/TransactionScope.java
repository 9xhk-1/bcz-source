package androidx.room;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface TransactionScope<T> extends PooledConnection {
    @m80.l
    Object rollback(T t11, @m80.k j00.c<?> cVar);

    @m80.l
    <R> Object withNestedTransaction(@m80.k x00.p<? super TransactionScope<R>, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar);
}
