package androidx.room;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2", f = "RoomDatabase.android.kt", i = {}, l = {2001}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2<R> extends SuspendLambda implements x00.l<j00.c<? super R>, Object> {
    final /* synthetic */ x00.l<j00.c<? super R>, Object> $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2(RoomDatabase roomDatabase, x00.l<? super j00.c<? super R>, ? extends Object> lVar, j00.c<? super RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2> cVar) {
        super(1, cVar);
        this.$this_withTransaction = roomDatabase;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2(this.$this_withTransaction, this.$block, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super R> cVar) {
        return ((RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.$this_withTransaction.beginTransaction();
                x00.l<j00.c<? super R>, Object> lVar = this.$block;
                this.label = 1;
                obj = lVar.invoke(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.$this_withTransaction.setTransactionSuccessful();
            return obj;
        } finally {
            this.$this_withTransaction.endTransaction();
        }
    }
}
