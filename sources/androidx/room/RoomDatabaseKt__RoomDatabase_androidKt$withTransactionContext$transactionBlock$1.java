package androidx.room;

import c40.r0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", f = "RoomDatabase.android.kt", i = {0}, l = {2015}, m = "invokeSuspend", n = {"transactionElement"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1<R> extends SuspendLambda implements x00.p<r0, j00.c<? super R>, Object> {
    final /* synthetic */ x00.l<j00.c<? super R>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(x00.l<? super j00.c<? super R>, ? extends Object> lVar, j00.c<? super RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1> cVar) {
        super(2, cVar);
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 = new RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(this.$block, cVar);
        roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1.L$0 = obj;
        return roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super R> cVar) {
        return ((RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TransactionElement transactionElement;
        Throwable th2;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            d.b bVar = ((r0) this.L$0).getCoroutineContext().get(TransactionElement.Key);
            g0.m(bVar);
            TransactionElement transactionElement2 = (TransactionElement) bVar;
            transactionElement2.acquire();
            try {
                x00.l<j00.c<? super R>, Object> lVar = this.$block;
                this.L$0 = transactionElement2;
                this.label = 1;
                Object invoke = lVar.invoke(this);
                if (invoke == l11) {
                    return l11;
                }
                transactionElement = transactionElement2;
                obj = invoke;
            } catch (Throwable th3) {
                transactionElement = transactionElement2;
                th2 = th3;
                transactionElement.release();
                throw th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transactionElement = (TransactionElement) this.L$0;
            try {
                kotlin.e.n(obj);
            } catch (Throwable th4) {
                th2 = th4;
                transactionElement.release();
                throw th2;
            }
        }
        transactionElement.release();
        return obj;
    }
}
