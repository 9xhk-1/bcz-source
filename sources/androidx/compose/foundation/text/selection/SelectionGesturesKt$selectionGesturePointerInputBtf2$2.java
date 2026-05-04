package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.u0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", f = "SelectionGestures.kt", i = {0}, l = {209, 217, R.styleable.Theme_drawable_share, R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
@u0({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,449:1\n87#2,2:450\n34#2,6:452\n89#2:458\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2\n*L\n215#1:450,2\n215#1:452,6\n215#1:458\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionGesturesKt$selectionGesturePointerInputBtf2$2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, j00.c<? super g2>, Object> {
    final /* synthetic */ ClicksCounter $clicksCounter;
    final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
    final /* synthetic */ TextDragObserver $textDragObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$selectionGesturePointerInputBtf2$2(ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, j00.c<? super SelectionGesturesKt$selectionGesturePointerInputBtf2$2> cVar) {
        super(2, cVar);
        this.$clicksCounter = clicksCounter;
        this.$mouseSelectionObserver = mouseSelectionObserver;
        this.$textDragObserver = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        SelectionGesturesKt$selectionGesturePointerInputBtf2$2 selectionGesturesKt$selectionGesturePointerInputBtf2$2 = new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, cVar);
        selectionGesturesKt$selectionGesturePointerInputBtf2$2.L$0 = obj;
        return selectionGesturesKt$selectionGesturePointerInputBtf2$2;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, j00.c<? super g2> cVar) {
        return ((SelectionGesturesKt$selectionGesturePointerInputBtf2$2) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r13 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r13 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        if (r13 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003a, code lost:
    
        if (r13 == r0) goto L37;
     */
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
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            kotlin.e.n(r13)
            goto La6
        L22:
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e.n(r13)
            goto L3d
        L2a:
            kotlin.e.n(r13)
            java.lang.Object r13 = r12.L$0
            r1 = r13
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            r12.L$0 = r1
            r12.label = r5
            java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(r1, r12)
            if (r13 != r0) goto L3d
            goto La5
        L3d:
            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
            androidx.compose.foundation.text.selection.ClicksCounter r6 = r12.$clicksCounter
            r6.update(r13)
            boolean r6 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r13)
            r7 = 0
            if (r6 == 0) goto L82
            int r8 = r13.m3672getButtonsry648PA()
            boolean r8 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m3705isPrimaryPressedaHzCxE(r8)
            if (r8 == 0) goto L82
            java.util.List r8 = r13.getChanges()
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r10 = 0
        L61:
            if (r10 >= r9) goto L73
            java.lang.Object r11 = r8.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.isConsumed()
            if (r11 == 0) goto L70
            goto L82
        L70:
            int r10 = r10 + 1
            goto L61
        L73:
            androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r12.$mouseSelectionObserver
            androidx.compose.foundation.text.selection.ClicksCounter r3 = r12.$clicksCounter
            r12.L$0 = r7
            r12.label = r4
            java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$mouseSelectionBtf2(r1, r2, r3, r13, r12)
            if (r13 != r0) goto La6
            goto La5
        L82:
            if (r6 != 0) goto La6
            androidx.compose.foundation.text.selection.ClicksCounter r4 = r12.$clicksCounter
            int r4 = r4.getClicks()
            if (r4 != r5) goto L99
            androidx.compose.foundation.text.TextDragObserver r2 = r12.$textDragObserver
            r12.L$0 = r7
            r12.label = r3
            java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionFirstPress(r1, r2, r13, r12)
            if (r13 != r0) goto La6
            goto La5
        L99:
            androidx.compose.foundation.text.TextDragObserver r3 = r12.$textDragObserver
            r12.L$0 = r7
            r12.label = r2
            java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionSubsequentPress(r1, r3, r13, r12)
            if (r13 != r0) goto La6
        La5:
            return r0
        La6:
            yz.g2 r13 = yz.g2.f100423a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
