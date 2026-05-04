package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", i = {}, l = {834}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ScrollingLogic$scroll$2 extends SuspendLambda implements p<ScrollScope, c<? super g2>, Object> {
    final /* synthetic */ p<NestedScrollScope, c<? super g2>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollingLogic$scroll$2(ScrollingLogic scrollingLogic, p<? super NestedScrollScope, ? super c<? super g2>, ? extends Object> pVar, c<? super ScrollingLogic$scroll$2> cVar) {
        super(2, cVar);
        this.this$0 = scrollingLogic;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ScrollingLogic$scroll$2 scrollingLogic$scroll$2 = new ScrollingLogic$scroll$2(this.this$0, this.$block, cVar);
        scrollingLogic$scroll$2.L$0 = obj;
        return scrollingLogic$scroll$2;
    }

    @Override // x00.p
    public final Object invoke(ScrollScope scrollScope, c<? super g2> cVar) {
        return ((ScrollingLogic$scroll$2) create(scrollScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            this.this$0.outerStateScope = (ScrollScope) this.L$0;
            p<NestedScrollScope, c<? super g2>, Object> pVar = this.$block;
            scrollingLogic$nestedScrollScope$1 = this.this$0.nestedScrollScope;
            this.label = 1;
            if (pVar.invoke(scrollingLogic$nestedScrollScope$1, this) == l11) {
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
