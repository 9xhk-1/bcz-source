package androidx.constraintlayout.compose;

import c40.r0;
import e40.o;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1", f = "MotionDragHandler.kt", i = {0, 0, 0, 1, 2, 2}, l = {77, 80, 85}, m = "invokeSuspend", n = {"$this$effectScope", "dragState", "isTouchUp", "$this$effectScope", "$this$effectScope", "isTouchUp"}, s = {"L$0", "L$1", "I$0", "L$0", "L$0", "I$0"})
/* loaded from: classes2.dex */
public final class MotionDragHandlerKt$motionPointerInput$2$1$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ o<MotionDragState> $dragChannel;
    final /* synthetic */ TransitionHandler $swipeHandler;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionDragHandlerKt$motionPointerInput$2$1$1(TransitionHandler transitionHandler, o<MotionDragState> oVar, j00.c<? super MotionDragHandlerKt$motionPointerInput$2$1$1> cVar) {
        super(2, cVar);
        this.$swipeHandler = transitionHandler;
        this.$dragChannel = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        MotionDragHandlerKt$motionPointerInput$2$1$1 motionDragHandlerKt$motionPointerInput$2$1$1 = new MotionDragHandlerKt$motionPointerInput$2$1$1(this.$swipeHandler, this.$dragChannel, cVar);
        motionDragHandlerKt$motionPointerInput$2$1$1.L$0 = obj;
        return motionDragHandlerKt$motionPointerInput$2$1$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((MotionDragHandlerKt$motionPointerInput$2$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00aa -> B:7:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ad -> B:8:0x00b6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
