package androidx.compose.material.pullrefresh;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", i = {}, l = {98}, m = "onPreFling-QWom1Mo", n = {}, s = {})
/* loaded from: classes.dex */
public final class PullRefreshNestedScrollConnection$onPreFling$1 extends ContinuationImpl {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullRefreshNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshNestedScrollConnection$onPreFling$1(PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, c<? super PullRefreshNestedScrollConnection$onPreFling$1> cVar) {
        super(cVar);
        this.this$0 = pullRefreshNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo803onPreFlingQWom1Mo(0L, this);
    }
}
