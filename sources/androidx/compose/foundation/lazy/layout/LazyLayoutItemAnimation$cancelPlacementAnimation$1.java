package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.unit.IntOffset;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation$cancelPlacementAnimation$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$cancelPlacementAnimation$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, c<? super LazyLayoutItemAnimation$cancelPlacementAnimation$1> cVar) {
        super(2, cVar);
        this.this$0 = lazyLayoutItemAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((LazyLayoutItemAnimation$cancelPlacementAnimation$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            animatable = this.this$0.placementDeltaAnimation;
            IntOffset m5234boximpl = IntOffset.m5234boximpl(IntOffset.Companion.m5254getZeronOccac());
            this.label = 1;
            if (animatable.snapTo(m5234boximpl, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        this.this$0.m884setPlacementDeltagyyYBs(IntOffset.Companion.m5254getZeronOccac());
        this.this$0.setPlacementAnimationInProgress(false);
        return g2.f100423a;
    }
}
