package androidx.constraintlayout.compose;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import g10.u;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class TransitionHandler {
    public static final int $stable = 8;

    @k
    private final MotionMeasurer motionMeasurer;

    @k
    private final MutableFloatState motionProgress;

    public TransitionHandler(@k MotionMeasurer motionMeasurer, @k MutableFloatState mutableFloatState) {
        this.motionMeasurer = motionMeasurer;
        this.motionProgress = mutableFloatState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.motionMeasurer.getTransition();
    }

    /* renamed from: onAcceptFirstDownForOnSwipe-k-4lQ0M, reason: not valid java name */
    public final boolean m5585onAcceptFirstDownForOnSwipek4lQ0M(long j11) {
        return getTransition().isFirstDownAccepted(Offset.m2268getXimpl(j11), Offset.m2269getYimpl(j11));
    }

    @l
    /* renamed from: onTouchUp-sF-c-tU, reason: not valid java name */
    public final Object m5586onTouchUpsFctU(final long j11, @k j00.c<? super g2> cVar) {
        Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(new x00.l<Long, g2>() { // from class: androidx.constraintlayout.compose.TransitionHandler$onTouchUp$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Long l11) {
                invoke(l11.longValue());
                return g2.f100423a;
            }

            public final void invoke(long j12) {
                androidx.constraintlayout.core.state.Transition transition;
                MutableFloatState mutableFloatState;
                transition = TransitionHandler.this.getTransition();
                mutableFloatState = TransitionHandler.this.motionProgress;
                transition.setTouchUp(mutableFloatState.getFloatValue(), j12, Velocity.m5353getXimpl(j11), Velocity.m5354getYimpl(j11));
            }
        }, cVar);
        return withFrameNanos == kotlin.coroutines.intrinsics.b.l() ? withFrameNanos : g2.f100423a;
    }

    public final boolean pendingProgressWhileTouchUp() {
        return getTransition().isTouchNotDone(this.motionProgress.getFloatValue());
    }

    /* renamed from: updateProgressOnDrag-k-4lQ0M, reason: not valid java name */
    public final void m5587updateProgressOnDragk4lQ0M(long j11) {
        this.motionProgress.setFloatValue(u.H(this.motionProgress.getFloatValue() + getTransition().dragToProgress(this.motionProgress.getFloatValue(), this.motionMeasurer.getLayoutCurrentWidth(), this.motionMeasurer.getLayoutCurrentHeight(), Offset.m2268getXimpl(j11), Offset.m2269getYimpl(j11)), 0.0f, 1.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateProgressWhileTouchUp(@m80.k j00.c<? super yz.g2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1 r0 = (androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1 r0 = new androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.constraintlayout.compose.TransitionHandler r0 = (androidx.constraintlayout.compose.TransitionHandler) r0
            kotlin.e.n(r5)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.e.n(r5)
            androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$newProgress$1 r5 = new androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$newProgress$1
            r5.<init>()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r0 = r4
        L49:
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.runtime.MutableFloatState r0 = r0.motionProgress
            r0.setFloatValue(r5)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.TransitionHandler.updateProgressWhileTouchUp(j00.c):java.lang.Object");
    }
}
