package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Rect;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", i = {}, l = {447, 450}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode$updateScrollState$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
    final /* synthetic */ float $offsetDifference;
    final /* synthetic */ Rect $rawCursorRect;
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$updateScrollState$1(TextFieldCoreModifierNode textFieldCoreModifierNode, float f11, Rect rect, j00.c<? super TextFieldCoreModifierNode$updateScrollState$1> cVar) {
        super(2, cVar);
        this.this$0 = textFieldCoreModifierNode;
        this.$offsetDifference = f11;
        this.$rawCursorRect = rect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new TextFieldCoreModifierNode$updateScrollState$1(this.this$0, this.$offsetDifference, this.$rawCursorRect, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((TextFieldCoreModifierNode$updateScrollState$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r5.bringIntoView(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r5, r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r5)
            goto L4b
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.e.n(r5)
            goto L36
        L1e:
            kotlin.e.n(r5)
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r5 = r4.this$0
            androidx.compose.foundation.ScrollState r5 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getScrollState$p(r5)
            float r1 = r4.$offsetDifference
            float r1 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierKt.access$roundToNext(r1)
            r4.label = r3
            java.lang.Object r5 = androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r5, r1, r4)
            if (r5 != r0) goto L36
            goto L4a
        L36:
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r5 = r4.this$0
            androidx.compose.foundation.text.input.internal.TextLayoutState r5 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getTextLayoutState$p(r5)
            androidx.compose.foundation.relocation.BringIntoViewRequester r5 = r5.getBringIntoViewRequester()
            androidx.compose.ui.geometry.Rect r1 = r4.$rawCursorRect
            r4.label = r2
            java.lang.Object r5 = r5.bringIntoView(r1, r4)
            if (r5 != r0) goto L4b
        L4a:
            return r0
        L4b:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
