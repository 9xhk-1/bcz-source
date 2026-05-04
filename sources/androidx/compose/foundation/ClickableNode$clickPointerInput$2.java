package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", f = "Clickable.kt", i = {}, l = {696}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ClickableNode$clickPointerInput$2 extends SuspendLambda implements q<PressGestureScope, Offset, j00.c<? super g2>, Object> {
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableNode$clickPointerInput$2(ClickableNode clickableNode, j00.c<? super ClickableNode$clickPointerInput$2> cVar) {
        super(3, cVar);
        this.this$0 = clickableNode;
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, j00.c<? super g2> cVar) {
        return m282invoked4ec7I(pressGestureScope, offset.m2278unboximpl(), cVar);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m282invoked4ec7I(PressGestureScope pressGestureScope, long j11, j00.c<? super g2> cVar) {
        ClickableNode$clickPointerInput$2 clickableNode$clickPointerInput$2 = new ClickableNode$clickPointerInput$2(this.this$0, cVar);
        clickableNode$clickPointerInput$2.L$0 = pressGestureScope;
        clickableNode$clickPointerInput$2.J$0 = j11;
        return clickableNode$clickPointerInput$2.invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
            long j11 = this.J$0;
            if (this.this$0.getEnabled()) {
                ClickableNode clickableNode = this.this$0;
                this.label = 1;
                if (clickableNode.m201handlePressInteractiond4ec7I(pressGestureScope, j11, this) == l11) {
                    return l11;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
