package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {0, 1, 1}, l = {87, 91}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
@u0({"SMAP\nLongPressTextDragObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,106:1\n102#2,2:107\n34#2,6:109\n104#2:115\n*S KotlinDebug\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n*L\n92#1:107,2\n92#1:109,6\n92#1:115\n*E\n"})
/* loaded from: classes.dex */
public final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, j00.c<? super g2>, Object> {
    final /* synthetic */ TextDragObserver $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(TextDragObserver textDragObserver, j00.c<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2> cVar) {
        super(2, cVar);
        this.$observer = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, cVar);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, j00.c<? super g2> cVar) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r14 != r0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:6:0x0060). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r13.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r13.L$1
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r4 = r13.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
            kotlin.e.n(r14)
            r7 = r13
            goto L60
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L23:
            java.lang.Object r1 = r13.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e.n(r14)
            r7 = r13
            goto L45
        L2c:
            kotlin.e.n(r14)
            java.lang.Object r14 = r13.L$0
            r4 = r14
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
            r13.L$0 = r4
            r13.label = r3
            r5 = 0
            r6 = 0
            r8 = 2
            r9 = 0
            r7 = r13
            java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
            if (r14 != r0) goto L44
            goto L5f
        L44:
            r1 = r4
        L45:
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            androidx.compose.foundation.text.TextDragObserver r4 = r7.$observer
            long r5 = r14.m3732getPositionF1C5BW0()
            r4.mo1132onDownk4lQ0M(r5)
            r4 = r1
            r1 = r14
        L52:
            r7.L$0 = r4
            r7.L$1 = r1
            r7.label = r2
            r14 = 0
            java.lang.Object r14 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r4, r14, r13, r3, r14)
            if (r14 != r0) goto L60
        L5f:
            return r0
        L60:
            androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.ui.input.pointer.PointerEvent) r14
            java.util.List r14 = r14.getChanges()
            r5 = r14
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = 0
        L6e:
            if (r6 >= r5) goto L8e
            java.lang.Object r8 = r14.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            long r9 = r8.m3730getIdJ3iCeTQ()
            long r11 = r1.m3730getIdJ3iCeTQ()
            boolean r9 = androidx.compose.ui.input.pointer.PointerId.m3714equalsimpl0(r9, r11)
            if (r9 == 0) goto L8b
            boolean r8 = r8.getPressed()
            if (r8 == 0) goto L8b
            goto L52
        L8b:
            int r6 = r6 + 1
            goto L6e
        L8e:
            androidx.compose.foundation.text.TextDragObserver r14 = r7.$observer
            r14.onUp()
            yz.g2 r14 = yz.g2.f100423a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
