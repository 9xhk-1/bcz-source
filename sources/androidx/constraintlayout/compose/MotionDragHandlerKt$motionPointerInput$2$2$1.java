package androidx.constraintlayout.compose;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import e40.o;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1", f = "MotionDragHandler.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class MotionDragHandlerKt$motionPointerInput$2$2$1 extends SuspendLambda implements p<PointerInputScope, j00.c<? super g2>, Object> {
    final /* synthetic */ o<MotionDragState> $dragChannel;
    final /* synthetic */ TransitionHandler $swipeHandler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionDragHandlerKt$motionPointerInput$2$2$1(TransitionHandler transitionHandler, o<MotionDragState> oVar, j00.c<? super MotionDragHandlerKt$motionPointerInput$2$2$1> cVar) {
        super(2, cVar);
        this.$swipeHandler = transitionHandler;
        this.$dragChannel = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        MotionDragHandlerKt$motionPointerInput$2$2$1 motionDragHandlerKt$motionPointerInput$2$2$1 = new MotionDragHandlerKt$motionPointerInput$2$2$1(this.$swipeHandler, this.$dragChannel, cVar);
        motionDragHandlerKt$motionPointerInput$2$2$1.L$0 = obj;
        return motionDragHandlerKt$motionPointerInput$2$2$1;
    }

    @Override // x00.p
    public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
        return ((MotionDragHandlerKt$motionPointerInput$2$2$1) create(pointerInputScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object detectDragGesturesWhenNeeded;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final VelocityTracker velocityTracker = new VelocityTracker();
            final TransitionHandler transitionHandler = this.$swipeHandler;
            l<Offset, Boolean> lVar = new l<Offset, Boolean>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.1
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
                    return m5519invokek4lQ0M(offset.m2278unboximpl());
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final Boolean m5519invokek4lQ0M(long j11) {
                    return Boolean.valueOf(TransitionHandler.this.m5585onAcceptFirstDownForOnSwipek4lQ0M(j11));
                }
            };
            l<Offset, g2> lVar2 = new l<Offset, g2>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.2
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                    m5520invokek4lQ0M(offset.m2278unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m5520invokek4lQ0M(long j11) {
                    VelocityTracker.this.resetTracking();
                }
            };
            final o<MotionDragState> oVar = this.$dragChannel;
            x00.a<g2> aVar = new x00.a<g2>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    oVar.m(MotionDragState.Companion.m5529onDragEndTH1AsA0(velocityTracker.m3829calculateVelocity9UxMQ8M()));
                }
            };
            final o<MotionDragState> oVar2 = this.$dragChannel;
            x00.a<g2> aVar2 = new x00.a<g2>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    oVar2.m(MotionDragState.Companion.m5529onDragEndTH1AsA0(velocityTracker.m3829calculateVelocity9UxMQ8M()));
                }
            };
            final o<MotionDragState> oVar3 = this.$dragChannel;
            p<PointerInputChange, Offset, g2> pVar = new p<PointerInputChange, Offset, g2>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(PointerInputChange pointerInputChange, Offset offset) {
                    m5521invokeUv8p0NA(pointerInputChange, offset.m2278unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m5521invokeUv8p0NA(PointerInputChange pointerInputChange, long j11) {
                    VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, pointerInputChange);
                    oVar3.m(MotionDragState.Companion.m5528onDragk4lQ0M(j11));
                }
            };
            this.label = 1;
            detectDragGesturesWhenNeeded = MotionDragHandlerKt.detectDragGesturesWhenNeeded(pointerInputScope, lVar, lVar2, aVar, aVar2, pVar, this);
            if (detectDragGesturesWhenNeeded == l11) {
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
