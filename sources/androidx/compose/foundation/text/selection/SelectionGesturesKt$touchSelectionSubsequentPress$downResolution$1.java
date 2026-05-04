package androidx.compose.foundation.text.selection;

import a00.r0;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", i = {0}, l = {283}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull"}, s = {"L$0"})
@u0({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,449:1\n273#2:450\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1\n*L\n289#1:450\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, j00.c<? super DownResolution>, Object> {
    final /* synthetic */ Ref.LongRef $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long j11, Ref.LongRef longRef, j00.c<? super SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1> cVar) {
        super(2, cVar);
        this.$pointerId = j11;
        this.$overSlop = longRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.$pointerId, this.$overSlop, cVar);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.L$0 = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, j00.c<? super DownResolution> cVar) {
        return ((SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            long j11 = this.$pointerId;
            final Ref.LongRef longRef = this.$overSlop;
            p<PointerInputChange, Offset, g2> pVar = new p<PointerInputChange, Offset, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(PointerInputChange pointerInputChange, Offset offset) {
                    m1444invokeUv8p0NA(pointerInputChange, offset.m2278unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m1444invokeUv8p0NA(PointerInputChange pointerInputChange, long j12) {
                    pointerInputChange.consume();
                    Ref.LongRef.this.element = j12;
                }
            };
            this.L$0 = awaitPointerEventScope2;
            this.label = 1;
            Object m427awaitTouchSlopOrCancellationjO51t88 = DragGestureDetectorKt.m427awaitTouchSlopOrCancellationjO51t88(awaitPointerEventScope2, j11, pVar, this);
            if (m427awaitTouchSlopOrCancellationjO51t88 == l11) {
                return l11;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj = m427awaitTouchSlopOrCancellationjO51t88;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            kotlin.e.n(obj);
        }
        if (((PointerInputChange) obj) != null && (this.$overSlop.element & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            return DownResolution.Drag;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) r0.G2(awaitPointerEventScope.getCurrentEvent().getChanges());
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            return DownResolution.Cancel;
        }
        pointerInputChange.consume();
        return DownResolution.Up;
    }
}
