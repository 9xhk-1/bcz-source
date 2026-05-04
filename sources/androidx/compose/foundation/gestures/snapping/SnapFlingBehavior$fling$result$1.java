package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {0}, l = {135, 151}, m = "invokeSuspend", n = {"remainingScrollOffset"}, s = {"L$0"})
@u0({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n1#1,485:1\n50#2,5:486\n50#2,5:491\n481#3,4:496\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n*L\n125#1:486,5\n143#1:491,5\n149#1:496,4\n*E\n"})
/* loaded from: classes.dex */
public final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements p<r0, c<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ l<Float, g2> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapFlingBehavior$fling$result$1(SnapFlingBehavior snapFlingBehavior, float f11, l<? super Float, g2> lVar, ScrollScope scrollScope, c<? super SnapFlingBehavior$fling$result$1> cVar) {
        super(2, cVar);
        this.this$0 = snapFlingBehavior;
        this.$initialVelocity = f11;
        this.$onRemainingScrollOffsetUpdate = lVar;
        this.$this_fling = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super AnimationResult<Float, AnimationVector1D>> cVar) {
        return ((SnapFlingBehavior$fling$result$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r0 == r7) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r5 = r19
            java.lang.Object r7 = kotlin.coroutines.intrinsics.b.l()
            int r0 = r5.label
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 == r1) goto L1c
            if (r0 != r6) goto L14
            kotlin.e.n(r20)
            return r20
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1c:
            java.lang.Object r0 = r5.L$0
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            kotlin.e.n(r20)
            r8 = r0
            r0 = r20
            goto L87
        L27:
            kotlin.e.n(r20)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r0 = r5.this$0
            androidx.compose.animation.core.DecayAnimationSpec r0 = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.access$getDecayAnimationSpec$p(r0)
            r2 = 0
            float r3 = r5.$initialVelocity
            float r0 = androidx.compose.animation.core.DecayAnimationSpecKt.calculateTargetValue(r0, r2, r3)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r2 = r5.this$0
            androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r2 = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.access$getSnapLayoutInfoProvider$p(r2)
            float r3 = r5.$initialVelocity
            float r0 = r2.calculateApproachOffset(r3, r0)
            boolean r2 = java.lang.Float.isNaN(r0)
            if (r2 == 0) goto L4e
            java.lang.String r2 = "calculateApproachOffset returned NaN. Please use a valid value."
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException(r2)
        L4e:
            kotlin.jvm.internal.Ref$FloatRef r8 = new kotlin.jvm.internal.Ref$FloatRef
            r8.<init>()
            float r0 = java.lang.Math.abs(r0)
            float r2 = r5.$initialVelocity
            float r2 = java.lang.Math.signum(r2)
            float r0 = r0 * r2
            r8.element = r0
            x00.l<java.lang.Float, yz.g2> r2 = r5.$onRemainingScrollOffsetUpdate
            java.lang.Float r0 = l00.a.e(r0)
            r2.invoke(r0)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r0 = r5.this$0
            androidx.compose.foundation.gestures.ScrollScope r2 = r5.$this_fling
            r3 = r2
            float r2 = r8.element
            r4 = r3
            float r3 = r5.$initialVelocity
            r9 = r4
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$animationState$1 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$animationState$1
            x00.l<java.lang.Float, yz.g2> r10 = r5.$onRemainingScrollOffsetUpdate
            r4.<init>()
            r5.L$0 = r8
            r5.label = r1
            r1 = r9
            java.lang.Object r0 = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.access$tryApproach(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L87
            goto Ld9
        L87:
            r9 = r0
            androidx.compose.animation.core.AnimationState r9 = (androidx.compose.animation.core.AnimationState) r9
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r0 = r5.this$0
            androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r0 = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.access$getSnapLayoutInfoProvider$p(r0)
            java.lang.Object r1 = r9.getVelocity()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = r0.calculateSnapOffset(r1)
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto La9
            java.lang.String r0 = "calculateSnapOffset returned NaN. Please use a valid value."
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException(r0)
        La9:
            r8.element = r1
            androidx.compose.foundation.gestures.ScrollScope r0 = r5.$this_fling
            r17 = 30
            r18 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            androidx.compose.animation.core.AnimationState r3 = androidx.compose.animation.core.AnimationStateKt.copy$default(r9, r10, r11, r12, r14, r16, r17, r18)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r2 = r5.this$0
            androidx.compose.animation.core.AnimationSpec r4 = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.access$getSnapAnimationSpec$p(r2)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$4 r2 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$4
            x00.l<java.lang.Float, yz.g2> r9 = r5.$onRemainingScrollOffsetUpdate
            r2.<init>()
            r8 = 0
            r5.L$0 = r8
            r5.label = r6
            r5 = r2
            r2 = r1
            r6 = r19
            java.lang.Object r0 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.access$animateWithTarget(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto Lda
        Ld9:
            return r7
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
