package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import j00.c;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n+ 2 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,485:1\n481#2,4:486\n481#2,4:490\n481#2,4:494\n481#2,4:498\n1#3:502\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n*L\n103#1:486,4\n187#1:490,4\n190#1:494,4\n200#1:498,4\n*E\n"})
/* loaded from: classes.dex */
public final class SnapFlingBehavior implements TargetedFlingBehavior {
    public static final int $stable = 0;

    @k
    private final DecayAnimationSpec<Float> decayAnimationSpec;

    @k
    private MotionDurationScale motionScaleDuration = ScrollableKt.getDefaultScrollMotionDurationScale();

    @k
    private final AnimationSpec<Float> snapAnimationSpec;

    @k
    private final SnapLayoutInfoProvider snapLayoutInfoProvider;

    public SnapFlingBehavior(@k SnapLayoutInfoProvider snapLayoutInfoProvider, @k DecayAnimationSpec<Float> decayAnimationSpec, @k AnimationSpec<Float> animationSpec) {
        this.snapLayoutInfoProvider = snapLayoutInfoProvider;
        this.decayAnimationSpec = decayAnimationSpec;
        this.snapAnimationSpec = animationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fling(androidx.compose.foundation.gestures.ScrollScope r11, float r12, x00.l<? super java.lang.Float, yz.g2> r13, j00.c<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.L$0
            r13 = r11
            x00.l r13 = (x00.l) r13
            kotlin.e.n(r14)
            goto L51
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            kotlin.e.n(r14)
            androidx.compose.ui.MotionDurationScale r14 = r10.motionScaleDuration
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r14 = c40.i.h(r14, r4, r0)
            if (r14 != r1) goto L50
            return r1
        L50:
            r13 = r7
        L51:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            r11 = 0
            java.lang.Float r11 = l00.a.e(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling(androidx.compose.foundation.gestures.ScrollScope, float, x00.l, j00.c):java.lang.Object");
    }

    private final boolean isDecayApproachPossible(float f11, float f12) {
        return Math.abs(DecayAnimationSpecKt.calculateTargetValue(this.decayAnimationSpec, 0.0f, f12)) >= Math.abs(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runApproach(ScrollScope scrollScope, float f11, float f12, l<? super Float, g2> lVar, c<? super AnimationResult<Float, AnimationVector1D>> cVar) {
        Object approach;
        approach = SnapFlingBehaviorKt.approach(scrollScope, f11, f12, isDecayApproachPossible(f11, f12) ? new DecayApproachAnimation(this.decayAnimationSpec) : new TargetApproachAnimation(this.snapAnimationSpec), lVar, cVar);
        return approach;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tryApproach(androidx.compose.foundation.gestures.ScrollScope r18, float r19, float r20, x00.l<? super java.lang.Float, yz.g2> r21, j00.c<? super androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r22) {
        /*
            r17 = this;
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            if (r1 == 0) goto L18
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.label = r2
            r2 = r17
        L16:
            r7 = r1
            goto L20
        L18:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            r2 = r17
            r1.<init>(r2, r0)
            goto L16
        L20:
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r7.label
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            kotlin.e.n(r0)
            goto L71
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.e.n(r0)
            float r0 = java.lang.Math.abs(r19)
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L46
            goto L4e
        L46:
            float r0 = java.lang.Math.abs(r20)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L60
        L4e:
            r15 = 28
            r16 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r8 = r19
            r9 = r20
            androidx.compose.animation.core.AnimationState r0 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(r8, r9, r10, r12, r14, r15, r16)
            return r0
        L60:
            r7.label = r4
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            java.lang.Object r0 = r2.runApproach(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L71
            return r1
        L71:
            androidx.compose.foundation.gestures.snapping.AnimationResult r0 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r0
            androidx.compose.animation.core.AnimationState r0 = r0.getCurrentAnimationState()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.tryApproach(androidx.compose.foundation.gestures.ScrollScope, float, float, x00.l, j00.c):java.lang.Object");
    }

    public boolean equals(@m80.l Object obj) {
        if (obj instanceof SnapFlingBehavior) {
            SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
            if (g0.g(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) && g0.g(snapFlingBehavior.decayAnimationSpec, this.decayAnimationSpec) && g0.g(snapFlingBehavior.snapLayoutInfoProvider, this.snapLayoutInfoProvider)) {
                return true;
            }
        }
        return false;
    }

    @k
    public final MotionDurationScale getMotionScaleDuration$foundation_release() {
        return this.motionScaleDuration;
    }

    public int hashCode() {
        return (((this.snapAnimationSpec.hashCode() * 31) + this.decayAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.TargetedFlingBehavior
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performFling(@m80.k androidx.compose.foundation.gestures.ScrollScope r5, float r6, @m80.k x00.l<? super java.lang.Float, yz.g2> r7, @m80.k j00.c<? super java.lang.Float> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r8)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r8)
            r0.label = r3
            java.lang.Object r8 = r4.fling(r5, r6, r7, r0)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r8
            java.lang.Object r5 = r8.component1()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.AnimationState r6 = r8.component2()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L5d
        L53:
            java.lang.Object r5 = r6.getVelocity()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L5d:
            java.lang.Float r5 = l00.a.e(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, x00.l, j00.c):java.lang.Object");
    }

    public final void setMotionScaleDuration$foundation_release(@k MotionDurationScale motionDurationScale) {
        this.motionScaleDuration = motionDurationScale;
    }
}
