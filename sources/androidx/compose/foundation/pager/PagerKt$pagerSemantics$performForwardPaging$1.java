package androidx.compose.foundation.pager;

import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", f = "Pager.kt", i = {}, l = {545}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class PagerKt$pagerSemantics$performForwardPaging$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ PagerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$pagerSemantics$performForwardPaging$1(PagerState pagerState, c<? super PagerKt$pagerSemantics$performForwardPaging$1> cVar) {
        super(2, cVar);
        this.$state = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new PagerKt$pagerSemantics$performForwardPaging$1(this.$state, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((PagerKt$pagerSemantics$performForwardPaging$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            PagerState pagerState = this.$state;
            this.label = 1;
            if (PagerStateKt.animateToNextPage(pagerState, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
