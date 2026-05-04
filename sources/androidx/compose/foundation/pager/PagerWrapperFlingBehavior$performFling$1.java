package androidx.compose.foundation.pager;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", i = {0}, l = {386}, m = "performFling", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class PagerWrapperFlingBehavior$performFling$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PagerWrapperFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerWrapperFlingBehavior$performFling$1(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, c<? super PagerWrapperFlingBehavior$performFling$1> cVar) {
        super(cVar);
        this.this$0 = pagerWrapperFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performFling(null, 0.0f, this);
    }
}
