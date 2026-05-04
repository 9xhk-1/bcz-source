package androidx.room.support;

import androidx.room.RoomDatabase;
import c40.r0;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.support.QueryInterceptorStatement$executeInsert$1", f = "QueryInterceptorStatement.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class QueryInterceptorStatement$executeInsert$1 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ List<Object> $argsCopy;
    int label;
    final /* synthetic */ QueryInterceptorStatement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryInterceptorStatement$executeInsert$1(QueryInterceptorStatement queryInterceptorStatement, List<? extends Object> list, j00.c<? super QueryInterceptorStatement$executeInsert$1> cVar) {
        super(2, cVar);
        this.this$0 = queryInterceptorStatement;
        this.$argsCopy = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new QueryInterceptorStatement$executeInsert$1(this.this$0, this.$argsCopy, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((QueryInterceptorStatement$executeInsert$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RoomDatabase.QueryCallback queryCallback;
        String str;
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        queryCallback = this.this$0.queryCallback;
        str = this.this$0.sqlStatement;
        queryCallback.onQuery(str, this.$argsCopy);
        return g2.f100423a;
    }
}
