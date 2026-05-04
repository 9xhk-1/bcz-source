package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntOffset;
import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", i = {0}, l = {141, 148}, m = "invokeSuspend", n = {"finalSpec"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, long j11, c<? super LazyLayoutItemAnimation$animatePlacementDelta$1> cVar) {
        super(2, cVar);
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:2)|(1:(1:(5:6|7|8|9|10)(2:14|15))(2:16|17))(10:25|26|(2:28|(1:30)(1:37))(1:38)|31|32|(2:34|(2:36|24))|19|20|21|22)|18|19|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r12, r4, r5, null, r7, r8, 4, null) != r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.e.n(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            r8 = r11
            goto Lb0
        L14:
            r8 = r11
            goto Lbb
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            java.lang.Object r1 = r11.L$0
            androidx.compose.animation.core.FiniteAnimationSpec r1 = (androidx.compose.animation.core.FiniteAnimationSpec) r1
            kotlin.e.n(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            goto L6c
        L27:
            kotlin.e.n(r12)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            boolean r12 = r12.isRunning()     // Catch: java.util.concurrent.CancellationException -> L14
            if (r12 == 0) goto L45
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> r12 = r11.$spec     // Catch: java.util.concurrent.CancellationException -> L14
            boolean r1 = r12 instanceof androidx.compose.animation.core.SpringSpec     // Catch: java.util.concurrent.CancellationException -> L14
            if (r1 == 0) goto L3f
            androidx.compose.animation.core.SpringSpec r12 = (androidx.compose.animation.core.SpringSpec) r12     // Catch: java.util.concurrent.CancellationException -> L14
            goto L43
        L3f:
            androidx.compose.animation.core.SpringSpec r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimationKt.access$getInterruptionSpec$p()     // Catch: java.util.concurrent.CancellationException -> L14
        L43:
            r1 = r12
            goto L48
        L45:
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> r12 = r11.$spec     // Catch: java.util.concurrent.CancellationException -> L14
            goto L43
        L48:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            boolean r12 = r12.isRunning()     // Catch: java.util.concurrent.CancellationException -> L14
            if (r12 != 0) goto L75
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            long r4 = r11.$totalDelta     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.ui.unit.IntOffset r4 = androidx.compose.ui.unit.IntOffset.m5234boximpl(r4)     // Catch: java.util.concurrent.CancellationException -> L14
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L14
            r11.label = r3     // Catch: java.util.concurrent.CancellationException -> L14
            java.lang.Object r12 = r12.snapTo(r4, r11)     // Catch: java.util.concurrent.CancellationException -> L14
            if (r12 != r0) goto L6c
            r8 = r11
            goto Laf
        L6c:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            x00.a r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getOnLayerPropertyChanged$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L14
        L75:
            r5 = r1
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            java.lang.Object r12 = r12.getValue()     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.ui.unit.IntOffset r12 = (androidx.compose.ui.unit.IntOffset) r12     // Catch: java.util.concurrent.CancellationException -> L14
            long r3 = r12.m5252unboximpl()     // Catch: java.util.concurrent.CancellationException -> L14
            long r6 = r11.$totalDelta     // Catch: java.util.concurrent.CancellationException -> L14
            long r3 = androidx.compose.ui.unit.IntOffset.m5246minusqkQi6aY(r3, r6)     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            r6 = r3
            androidx.compose.ui.unit.IntOffset r4 = androidx.compose.ui.unit.IntOffset.m5234boximpl(r6)     // Catch: java.util.concurrent.CancellationException -> L14
            r8 = r6
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1 r7 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r1 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L14
            r1 = 0
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L14
            r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L14
            r6 = 0
            r9 = 4
            r10 = 0
            r8 = r11
            r3 = r12
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> Lbb
            if (r12 != r0) goto Lb0
        Laf:
            return r0
        Lb0:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r8.this$0     // Catch: java.util.concurrent.CancellationException -> Lbb
            r0 = 0
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setPlacementAnimationInProgress(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r8.this$0     // Catch: java.util.concurrent.CancellationException -> Lbb
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setRunningMovingAwayAnimation$p(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
        Lbb:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
