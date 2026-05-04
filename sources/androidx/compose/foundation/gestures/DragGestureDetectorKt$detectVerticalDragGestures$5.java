package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import j00.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import l00.d;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {TypedValues.PositionType.TYPE_POSITION_TYPE, 513, 521}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectVerticalDragGestures$5 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
    final /* synthetic */ a<g2> $onDragCancel;
    final /* synthetic */ a<g2> $onDragEnd;
    final /* synthetic */ l<Offset, g2> $onDragStart;
    final /* synthetic */ p<PointerInputChange, Float, g2> $onVerticalDrag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectVerticalDragGestures$5(l<? super Offset, g2> lVar, p<? super PointerInputChange, ? super Float, g2> pVar, a<g2> aVar, a<g2> aVar2, c<? super DragGestureDetectorKt$detectVerticalDragGestures$5> cVar) {
        super(2, cVar);
        this.$onDragStart = lVar;
        this.$onVerticalDrag = pVar;
        this.$onDragEnd = aVar;
        this.$onDragCancel = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5 = new DragGestureDetectorKt$detectVerticalDragGestures$5(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, cVar);
        dragGestureDetectorKt$detectVerticalDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectVerticalDragGestures$5;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
        return ((DragGestureDetectorKt$detectVerticalDragGestures$5) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L36
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.e.n(r13)
            r8 = r12
            goto La8
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            java.lang.Object r1 = r12.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r3 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
            kotlin.e.n(r13)
            r8 = r12
            goto L73
        L2c:
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e.n(r13)
            r8 = r12
            r6 = r1
            goto L4f
        L36:
            kotlin.e.n(r13)
            java.lang.Object r13 = r12.L$0
            r5 = r13
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            r12.L$0 = r5
            r12.label = r4
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r8 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
            if (r13 != r0) goto L4e
            goto La7
        L4e:
            r6 = r5
        L4f:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r11 = r8
            long r7 = r13.m3730getIdJ3iCeTQ()
            int r9 = r13.m3735getTypeT8wyACA()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1 r10 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1
            r10.<init>()
            r11.L$0 = r6
            r11.L$1 = r1
            r11.label = r3
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m429awaitVerticalPointerSlopOrCancellationgDDlDlE(r6, r7, r9, r10, r11)
            r8 = r11
            if (r13 != r0) goto L72
            goto La7
        L72:
            r3 = r6
        L73:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            if (r13 == 0) goto Lbb
            x00.l<androidx.compose.ui.geometry.Offset, yz.g2> r4 = r8.$onDragStart
            long r5 = r13.m3732getPositionF1C5BW0()
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.m2257boximpl(r5)
            r4.invoke(r5)
            x00.p<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, yz.g2> r4 = r8.$onVerticalDrag
            float r1 = r1.element
            java.lang.Float r1 = l00.a.e(r1)
            r4.invoke(r13, r1)
            long r4 = r13.m3730getIdJ3iCeTQ()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1
            x00.p<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, yz.g2> r1 = r8.$onVerticalDrag
            r13.<init>()
            r1 = 0
            r8.L$0 = r1
            r8.L$1 = r1
            r8.label = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m437verticalDragjO51t88(r3, r4, r13, r12)
            if (r13 != r0) goto La8
        La7:
            return r0
        La8:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lb6
            x00.a<yz.g2> r13 = r8.$onDragEnd
            r13.invoke()
            goto Lbb
        Lb6:
            x00.a<yz.g2> r13 = r8.$onDragCancel
            r13.invoke()
        Lbb:
            yz.g2 r13 = yz.g2.f100423a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
