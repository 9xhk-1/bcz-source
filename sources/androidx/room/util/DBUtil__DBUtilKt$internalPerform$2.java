package androidx.room.util;

import androidx.room.InvalidationTracker;
import androidx.room.PooledConnection;
import androidx.room.RoomDatabase;
import androidx.room.Transactor;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.d0;
import l00.d;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2", f = "DBUtil.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60, 65}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes3.dex */
public final class DBUtil__DBUtilKt$internalPerform$2<R> extends SuspendLambda implements p<Transactor, c<? super R>, Object> {
    final /* synthetic */ p<PooledConnection, c<? super R>, Object> $block;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ RoomDatabase $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DBUtil__DBUtilKt$internalPerform$2(boolean z11, boolean z12, RoomDatabase roomDatabase, p<? super PooledConnection, ? super c<? super R>, ? extends Object> pVar, c<? super DBUtil__DBUtilKt$internalPerform$2> cVar) {
        super(2, cVar);
        this.$inTransaction = z11;
        this.$isReadOnly = z12;
        this.$this_internalPerform = roomDatabase;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        DBUtil__DBUtilKt$internalPerform$2 dBUtil__DBUtilKt$internalPerform$2 = new DBUtil__DBUtilKt$internalPerform$2(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, this.$block, cVar);
        dBUtil__DBUtilKt$internalPerform$2.L$0 = obj;
        return dBUtil__DBUtilKt$internalPerform$2;
    }

    @Override // x00.p
    public final Object invoke(Transactor transactor, c<? super R> cVar) {
        return ((DBUtil__DBUtilKt$internalPerform$2) create(transactor, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (r9 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (r9.sync$room_runtime_release(r8) == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtilKt$internalPerform$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        Transactor transactor = (Transactor) this.L$0;
        if (!this.$inTransaction) {
            return this.$block.invoke(transactor, this);
        }
        boolean z11 = this.$isReadOnly;
        Transactor.SQLiteTransactionType sQLiteTransactionType = z11 ? Transactor.SQLiteTransactionType.DEFERRED : Transactor.SQLiteTransactionType.IMMEDIATE;
        if (!z11) {
            d0.e(0);
            Object inTransaction = transactor.inTransaction(this);
            d0.e(1);
            if (!((Boolean) inTransaction).booleanValue()) {
                InvalidationTracker invalidationTracker = this.$this_internalPerform.getInvalidationTracker();
                d0.e(0);
                invalidationTracker.sync$room_runtime_release(this);
                d0.e(1);
            }
        }
        DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, null);
        d0.e(0);
        Object withTransaction = transactor.withTransaction(sQLiteTransactionType, dBUtil__DBUtilKt$internalPerform$2$result$1, this);
        d0.e(1);
        if (!this.$isReadOnly) {
            d0.e(0);
            Object inTransaction2 = transactor.inTransaction(this);
            d0.e(1);
            if (!((Boolean) inTransaction2).booleanValue()) {
                this.$this_internalPerform.getInvalidationTracker().refreshAsync();
            }
        }
        return withTransaction;
    }
}
