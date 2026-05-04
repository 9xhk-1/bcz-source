package androidx.compose.foundation;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", i = {0, 0}, l = {908, 912}, m = "invokeSuspend", n = {"minTime", com.alipay.sdk.m.m.a.f10784h0}, s = {"J$0", "J$1"})
/* loaded from: classes.dex */
public final class CombinedClickableNode$onClickKeyUpEvent$2 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ long $keyCode;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ CombinedClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$onClickKeyUpEvent$2(CombinedClickableNode combinedClickableNode, long j11, j00.c<? super CombinedClickableNode$onClickKeyUpEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = combinedClickableNode;
        this.$keyCode = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(this.this$0, this.$keyCode, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (c40.a1.b(r4 - r6, r10) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (c40.a1.b(r6, r10) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r11)
            goto L64
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            long r4 = r10.J$1
            long r6 = r10.J$0
            kotlin.e.n(r11)
            goto L46
        L22:
            kotlin.e.n(r11)
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r11 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(r11, r1)
            androidx.compose.ui.platform.ViewConfiguration r11 = (androidx.compose.ui.platform.ViewConfiguration) r11
            long r6 = r11.getDoubleTapMinTimeMillis()
            long r4 = r11.getDoubleTapTimeoutMillis()
            r10.J$0 = r6
            r10.J$1 = r4
            r10.label = r3
            java.lang.Object r11 = c40.a1.b(r6, r10)
            if (r11 != r0) goto L46
            goto L63
        L46:
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            androidx.collection.MutableLongObjectMap r11 = androidx.compose.foundation.CombinedClickableNode.access$getDoubleKeyClickStates$p(r11)
            long r8 = r10.$keyCode
            java.lang.Object r11 = r11.get(r8)
            androidx.compose.foundation.CombinedClickableNode$DoubleKeyClickState r11 = (androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState) r11
            if (r11 != 0) goto L57
            goto L5a
        L57:
            r11.setDoubleTapMinTimeMillisElapsed(r3)
        L5a:
            long r4 = r4 - r6
            r10.label = r2
            java.lang.Object r11 = c40.a1.b(r4, r10)
            if (r11 != r0) goto L64
        L63:
            return r0
        L64:
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            x00.a r11 = r11.getOnClick()
            r11.invoke()
            yz.g2 r11 = yz.g2.f100423a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
