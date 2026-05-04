package androidx.room.support;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.support.QueryInterceptorDatabase$query$4", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class QueryInterceptorDatabase$query$4 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ SupportSQLiteQuery $query;
    final /* synthetic */ QueryInterceptorProgram $queryInterceptorProgram;
    int label;
    final /* synthetic */ QueryInterceptorDatabase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryInterceptorDatabase$query$4(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram, j00.c<? super QueryInterceptorDatabase$query$4> cVar) {
        super(2, cVar);
        this.this$0 = queryInterceptorDatabase;
        this.$query = supportSQLiteQuery;
        this.$queryInterceptorProgram = queryInterceptorProgram;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new QueryInterceptorDatabase$query$4(this.this$0, this.$query, this.$queryInterceptorProgram, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((QueryInterceptorDatabase$query$4) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
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
        queryCallback.onQuery(this.$query.getSql(), this.$queryInterceptorProgram.getBindArgsCache$room_runtime_release());
        return g2.f100423a;
    }
}
