package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import j00.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", i = {0, 1, 2}, l = {354, 355, 360}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0", "L$0"})
@u0({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1045:1\n34#2,6:1046\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n*L\n366#1:1046,6\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
    final /* synthetic */ p<PointerInputChange, Offset, g2> $onDrag;
    final /* synthetic */ a<g2> $onDragCancel;
    final /* synthetic */ a<g2> $onDragEnd;
    final /* synthetic */ l<Offset, g2> $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(l<? super Offset, g2> lVar, a<g2> aVar, a<g2> aVar2, p<? super PointerInputChange, ? super Offset, g2> pVar, c<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> cVar) {
        super(2, cVar);
        this.$onDragStart = lVar;
        this.$onDragEnd = aVar;
        this.$onDragCancel = aVar2;
        this.$onDrag = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, cVar);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[Catch: CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:22:0x008c, B:24:0x0094, B:26:0x00a6, B:28:0x00b2, B:30:0x00b9, B:33:0x00bc, B:34:0x00c2, B:17:0x0064, B:19:0x0068, B:14:0x0053, B:8:0x004b), top: B:7:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[Catch: CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:22:0x008c, B:24:0x0094, B:26:0x00a6, B:28:0x00b2, B:30:0x00b9, B:33:0x00bc, B:34:0x00c2, B:17:0x0064, B:19:0x0068, B:14:0x0053, B:8:0x004b), top: B:7:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2 A[Catch: CancellationException -> 0x00b6, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:22:0x008c, B:24:0x0094, B:26:0x00a6, B:28:0x00b2, B:30:0x00b9, B:33:0x00bc, B:34:0x00c2, B:17:0x0064, B:19:0x0068, B:14:0x0053, B:8:0x004b), top: B:7:0x004b }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
