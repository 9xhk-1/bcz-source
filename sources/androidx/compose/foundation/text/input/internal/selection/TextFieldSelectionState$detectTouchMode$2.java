package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j00.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", f = "TextFieldSelectionState.kt", i = {0}, l = {453}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectTouchMode$2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTouchMode$2(TextFieldSelectionState textFieldSelectionState, c<? super TextFieldSelectionState$detectTouchMode$2> cVar) {
        super(2, cVar);
        this.this$0 = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TextFieldSelectionState$detectTouchMode$2 textFieldSelectionState$detectTouchMode$2 = new TextFieldSelectionState$detectTouchMode$2(this.this$0, cVar);
        textFieldSelectionState$detectTouchMode$2.L$0 = obj;
        return textFieldSelectionState$detectTouchMode$2;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
        return ((TextFieldSelectionState$detectTouchMode$2) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002d -> B:5:0x0030). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r4.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e.n(r5)
            goto L30
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1b:
            kotlin.e.n(r5)
            java.lang.Object r5 = r4.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            r1 = r5
        L23:
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r4.L$0 = r1
            r4.label = r2
            java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
            if (r5 != r0) goto L30
            return r0
        L30:
            androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r3 = r4.this$0
            boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r5)
            r5 = r5 ^ r2
            r3.setInTouchMode(r5)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
