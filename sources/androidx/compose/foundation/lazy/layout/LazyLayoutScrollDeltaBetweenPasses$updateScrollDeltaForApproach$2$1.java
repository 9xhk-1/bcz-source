package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    int label;
    final /* synthetic */ LazyLayoutScrollDeltaBetweenPasses this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(LazyLayoutScrollDeltaBetweenPasses lazyLayoutScrollDeltaBetweenPasses, c<? super LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1> cVar) {
        super(2, cVar);
        this.this$0 = lazyLayoutScrollDeltaBetweenPasses;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnimationState animationState;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            animationState = this.this$0._scrollDeltaBetweenPasses;
            Float e11 = l00.a.e(0.0f);
            SpringSpec spring$default = AnimationSpecKt.spring$default(0.0f, 400.0f, l00.a.e(0.5f), 1, null);
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, e11, spring$default, true, null, this, 8, null) == l11) {
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
