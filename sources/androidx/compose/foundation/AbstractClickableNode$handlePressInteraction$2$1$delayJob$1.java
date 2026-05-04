package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", i = {1}, l = {1257, 1260}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $offset;
    Object L$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(AbstractClickableNode abstractClickableNode, long j11, MutableInteractionSource mutableInteractionSource, j00.c<? super AbstractClickableNode$handlePressInteraction$2$1$delayJob$1> cVar) {
        super(2, cVar);
        this.this$0 = abstractClickableNode;
        this.$offset = j11;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((AbstractClickableNode$handlePressInteraction$2$1$delayJob$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (c40.a1.b(r4, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r6.L$0
            androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
            kotlin.e.n(r7)
            goto L50
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.e.n(r7)
            goto L3a
        L22:
            kotlin.e.n(r7)
            androidx.compose.foundation.AbstractClickableNode r7 = r6.this$0
            boolean r7 = androidx.compose.foundation.AbstractClickableNode.access$delayPressInteraction(r7)
            if (r7 == 0) goto L3a
            long r4 = androidx.compose.foundation.Clickable_androidKt.getTapIndicationDelay()
            r6.label = r3
            java.lang.Object r7 = c40.a1.b(r4, r6)
            if (r7 != r0) goto L3a
            goto L4e
        L3a:
            androidx.compose.foundation.interaction.PressInteraction$Press r7 = new androidx.compose.foundation.interaction.PressInteraction$Press
            long r3 = r6.$offset
            r1 = 0
            r7.<init>(r3, r1)
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r6.$interactionSource
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r1 = r1.emit(r7, r6)
            if (r1 != r0) goto L4f
        L4e:
            return r0
        L4f:
            r0 = r7
        L50:
            androidx.compose.foundation.AbstractClickableNode r7 = r6.this$0
            androidx.compose.foundation.AbstractClickableNode.access$setPressInteraction$p(r7, r0)
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
