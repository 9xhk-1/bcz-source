package androidx.room;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2", f = "RoomDatabase.kt", i = {}, l = {496}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2<R> extends SuspendLambda implements x00.p<r0, j00.c<? super R>, Object> {
    final /* synthetic */ x00.p<Transactor, j00.c<? super R>, Object> $block;
    final /* synthetic */ RoomDatabase $this_useWriterConnection;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2(RoomDatabase roomDatabase, x00.p<? super Transactor, ? super j00.c<? super R>, ? extends Object> pVar, j00.c<? super RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2> cVar) {
        super(2, cVar);
        this.$this_useWriterConnection = roomDatabase;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2(this.$this_useWriterConnection, this.$block, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super R> cVar) {
        return ((RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return obj;
        }
        kotlin.e.n(obj);
        RoomDatabase roomDatabase = this.$this_useWriterConnection;
        x00.p<Transactor, j00.c<? super R>, Object> pVar = this.$block;
        this.label = 1;
        Object useConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(false, pVar, this);
        return useConnection$room_runtime_release == l11 ? l11 : useConnection$room_runtime_release;
    }
}
