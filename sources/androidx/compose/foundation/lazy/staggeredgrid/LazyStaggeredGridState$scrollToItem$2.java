package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.ScrollScope;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LazyStaggeredGridState$scrollToItem$2 extends SuspendLambda implements p<ScrollScope, c<? super g2>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$scrollToItem$2(LazyStaggeredGridState lazyStaggeredGridState, int i11, int i12, c<? super LazyStaggeredGridState$scrollToItem$2> cVar) {
        super(2, cVar);
        this.this$0 = lazyStaggeredGridState;
        this.$index = i11;
        this.$scrollOffset = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new LazyStaggeredGridState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, cVar);
    }

    @Override // x00.p
    public final Object invoke(ScrollScope scrollScope, c<? super g2> cVar) {
        return ((LazyStaggeredGridState$scrollToItem$2) create(scrollScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        this.this$0.snapToItemInternal$foundation_release(this.$index, this.$scrollOffset, true);
        return g2.f100423a;
    }
}
