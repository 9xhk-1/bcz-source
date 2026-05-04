package androidx.room.util;

import androidx.room.PooledConnection;
import androidx.room.TransactionScope;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1", f = "DBUtil.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class DBUtil__DBUtilKt$internalPerform$2$result$1<R> extends SuspendLambda implements p<TransactionScope<R>, c<? super R>, Object> {
    final /* synthetic */ p<PooledConnection, c<? super R>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DBUtil__DBUtilKt$internalPerform$2$result$1(p<? super PooledConnection, ? super c<? super R>, ? extends Object> pVar, c<? super DBUtil__DBUtilKt$internalPerform$2$result$1> cVar) {
        super(2, cVar);
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, cVar);
        dBUtil__DBUtilKt$internalPerform$2$result$1.L$0 = obj;
        return dBUtil__DBUtilKt$internalPerform$2$result$1;
    }

    @Override // x00.p
    public final Object invoke(TransactionScope<R> transactionScope, c<? super R> cVar) {
        return ((DBUtil__DBUtilKt$internalPerform$2$result$1) create(transactionScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            return obj;
        }
        e.n(obj);
        TransactionScope transactionScope = (TransactionScope) this.L$0;
        p<PooledConnection, c<? super R>, Object> pVar = this.$block;
        this.label = 1;
        Object invoke = pVar.invoke(transactionScope, this);
        return invoke == l11 ? l11 : invoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$block.invoke((TransactionScope) this.L$0, this);
    }
}
