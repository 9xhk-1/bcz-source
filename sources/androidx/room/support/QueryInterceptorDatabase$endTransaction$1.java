package androidx.room.support;

import a00.h0;
import androidx.room.RoomDatabase;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.support.QueryInterceptorDatabase$endTransaction$1", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class QueryInterceptorDatabase$endTransaction$1 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ QueryInterceptorDatabase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryInterceptorDatabase$endTransaction$1(QueryInterceptorDatabase queryInterceptorDatabase, j00.c<? super QueryInterceptorDatabase$endTransaction$1> cVar) {
        super(2, cVar);
        this.this$0 = queryInterceptorDatabase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new QueryInterceptorDatabase$endTransaction$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((QueryInterceptorDatabase$endTransaction$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RoomDatabase.QueryCallback queryCallback;
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        queryCallback = this.this$0.queryCallback;
        queryCallback.onQuery("END TRANSACTION", h0.J());
        return g2.f100423a;
    }
}
