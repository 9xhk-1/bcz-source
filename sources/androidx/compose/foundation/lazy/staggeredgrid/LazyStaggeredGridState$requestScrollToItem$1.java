package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1", f = "LazyStaggeredGridState.kt", i = {}, l = {388}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LazyStaggeredGridState$requestScrollToItem$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    int label;
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$requestScrollToItem$1(LazyStaggeredGridState lazyStaggeredGridState, c<? super LazyStaggeredGridState$requestScrollToItem$1> cVar) {
        super(2, cVar);
        this.this$0 = lazyStaggeredGridState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new LazyStaggeredGridState$requestScrollToItem$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((LazyStaggeredGridState$requestScrollToItem$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            LazyStaggeredGridState lazyStaggeredGridState = this.this$0;
            this.label = 1;
            if (ScrollExtensionsKt.stopScroll$default(lazyStaggeredGridState, null, this, 1, null) == l11) {
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
