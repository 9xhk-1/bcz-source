package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", i = {0, 1, 2}, l = {1263, 1265, 1272, 1273, com.badlogic.gdx.graphics.i.f12418se}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"})
/* loaded from: classes.dex */
public final class AbstractClickableNode$handlePressInteraction$2$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ PressGestureScope $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1(PressGestureScope pressGestureScope, long j11, MutableInteractionSource mutableInteractionSource, AbstractClickableNode abstractClickableNode, j00.c<? super AbstractClickableNode$handlePressInteraction$2$1> cVar) {
        super(2, cVar);
        this.$this_handlePressInteraction = pressGestureScope;
        this.$offset = j11;
        this.$interactionSource = mutableInteractionSource;
        this.this$0 = abstractClickableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.$this_handlePressInteraction, this.$offset, this.$interactionSource, this.this$0, cVar);
        abstractClickableNode$handlePressInteraction$2$1.L$0 = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        if (r3.emit(r2, r16) != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        if (r4.emit(r5, r16) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0068, code lost:
    
        if (r7 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
