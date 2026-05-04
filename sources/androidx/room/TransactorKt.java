package androidx.room;

import androidx.room.Transactor;
import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class TransactorKt {
    @m80.l
    public static final <R> Object deferredTransaction(@m80.k Transactor transactor, @m80.k x00.p<? super TransactionScope<R>, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.DEFERRED, pVar, cVar);
    }

    @m80.l
    public static final <R> Object exclusiveTransaction(@m80.k Transactor transactor, @m80.k x00.p<? super TransactionScope<R>, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.EXCLUSIVE, pVar, cVar);
    }

    @m80.l
    public static final Object execSQL(@m80.k PooledConnection pooledConnection, @m80.k String str, @m80.k j00.c<? super g2> cVar) {
        Object usePrepared = pooledConnection.usePrepared(str, new x00.l() { // from class: androidx.room.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean execSQL$lambda$0;
                execSQL$lambda$0 = TransactorKt.execSQL$lambda$0((SQLiteStatement) obj);
                return Boolean.valueOf(execSQL$lambda$0);
            }
        }, cVar);
        return usePrepared == kotlin.coroutines.intrinsics.b.l() ? usePrepared : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean execSQL$lambda$0(SQLiteStatement it) {
        g0.p(it, "it");
        return it.step();
    }

    @m80.l
    public static final <R> Object immediateTransaction(@m80.k Transactor transactor, @m80.k x00.p<? super TransactionScope<R>, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.IMMEDIATE, pVar, cVar);
    }
}
