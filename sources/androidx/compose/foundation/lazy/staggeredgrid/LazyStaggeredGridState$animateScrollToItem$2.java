package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.ui.unit.Density;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2", f = "LazyStaggeredGridState.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LazyStaggeredGridState$animateScrollToItem$2 extends SuspendLambda implements p<ScrollScope, c<? super g2>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ LazyStaggeredGridMeasureResult $layoutInfo;
    final /* synthetic */ int $numOfItemsToTeleport;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$animateScrollToItem$2(LazyStaggeredGridState lazyStaggeredGridState, int i11, int i12, int i13, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, c<? super LazyStaggeredGridState$animateScrollToItem$2> cVar) {
        super(2, cVar);
        this.this$0 = lazyStaggeredGridState;
        this.$index = i11;
        this.$scrollOffset = i12;
        this.$numOfItemsToTeleport = i13;
        this.$layoutInfo = lazyStaggeredGridMeasureResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        LazyStaggeredGridState$animateScrollToItem$2 lazyStaggeredGridState$animateScrollToItem$2 = new LazyStaggeredGridState$animateScrollToItem$2(this.this$0, this.$index, this.$scrollOffset, this.$numOfItemsToTeleport, this.$layoutInfo, cVar);
        lazyStaggeredGridState$animateScrollToItem$2.L$0 = obj;
        return lazyStaggeredGridState$animateScrollToItem$2;
    }

    @Override // x00.p
    public final Object invoke(ScrollScope scrollScope, c<? super g2> cVar) {
        return ((LazyStaggeredGridState$animateScrollToItem$2) create(scrollScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            LazyLayoutScrollScope LazyLayoutScrollScope = LazyStaggeredGridScrollScopeKt.LazyLayoutScrollScope(this.this$0, (ScrollScope) this.L$0);
            int i12 = this.$index;
            int i13 = this.$scrollOffset;
            int i14 = this.$numOfItemsToTeleport;
            Density density = this.$layoutInfo.getDensity();
            this.label = 1;
            if (LazyLayoutScrollScopeKt.animateScrollToItem(LazyLayoutScrollScope, i12, i13, i14, density, this) == l11) {
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
