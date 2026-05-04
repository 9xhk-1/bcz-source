package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", i = {}, l = {619}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class PagerState$animateScrollToPage$3 extends SuspendLambda implements p<ScrollScope, c<? super g2>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3(PagerState pagerState, int i11, float f11, AnimationSpec<Float> animationSpec, c<? super PagerState$animateScrollToPage$3> cVar) {
        super(2, cVar);
        this.this$0 = pagerState;
        this.$targetPage = i11;
        this.$targetPageOffsetToSnappedPosition = f11;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this.this$0, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, cVar);
        pagerState$animateScrollToPage$3.L$0 = obj;
        return pagerState$animateScrollToPage$3;
    }

    @Override // x00.p
    public final Object invoke(ScrollScope scrollScope, c<? super g2> cVar) {
        return ((PagerState$animateScrollToPage$3) create(scrollScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object animateScrollToPage;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            LazyLayoutScrollScope LazyLayoutScrollScope = PagerScrollScopeKt.LazyLayoutScrollScope(this.this$0, (ScrollScope) this.L$0);
            int i12 = this.$targetPage;
            float f11 = this.$targetPageOffsetToSnappedPosition;
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            final PagerState pagerState = this.this$0;
            p<ScrollScope, Integer, g2> pVar = new p<ScrollScope, Integer, g2>() { // from class: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3.1
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(ScrollScope scrollScope, Integer num) {
                    invoke(scrollScope, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(ScrollScope scrollScope, int i13) {
                    PagerState.this.updateTargetPage(scrollScope, i13);
                }
            };
            this.label = 1;
            animateScrollToPage = PagerStateKt.animateScrollToPage(LazyLayoutScrollScope, i12, f11, animationSpec, pVar, this);
            if (animateScrollToPage == l11) {
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
