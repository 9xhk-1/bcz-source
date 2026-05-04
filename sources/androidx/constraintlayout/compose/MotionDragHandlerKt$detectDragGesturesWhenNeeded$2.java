package androidx.constraintlayout.compose;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2", f = "MotionDragHandler.kt", i = {0, 1, 1, 1}, l = {166, 174, 183}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop"}, s = {"L$0", "L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
public final class MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, j00.c<? super g2>, Object> {
    final /* synthetic */ l<Offset, Boolean> $onAcceptFirstDown;
    final /* synthetic */ p<PointerInputChange, Offset, g2> $onDrag;
    final /* synthetic */ x00.a<g2> $onDragCancel;
    final /* synthetic */ x00.a<g2> $onDragEnd;
    final /* synthetic */ l<Offset, g2> $onDragStart;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(l<? super Offset, Boolean> lVar, l<? super Offset, g2> lVar2, p<? super PointerInputChange, ? super Offset, g2> pVar, x00.a<g2> aVar, x00.a<g2> aVar2, j00.c<? super MotionDragHandlerKt$detectDragGesturesWhenNeeded$2> cVar) {
        super(2, cVar);
        this.$onAcceptFirstDown = lVar;
        this.$onDragStart = lVar2;
        this.$onDrag = pVar;
        this.$onDragCancel = aVar;
        this.$onDragEnd = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 motionDragHandlerKt$detectDragGesturesWhenNeeded$2 = new MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(this.$onAcceptFirstDown, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, cVar);
        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.L$0 = obj;
        return motionDragHandlerKt$detectDragGesturesWhenNeeded$2;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, j00.c<? super g2> cVar) {
        return ((MotionDragHandlerKt$detectDragGesturesWhenNeeded$2) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (r12 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d2, code lost:
    
        if (r12 == r0) goto L31;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0093 -> B:17:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
