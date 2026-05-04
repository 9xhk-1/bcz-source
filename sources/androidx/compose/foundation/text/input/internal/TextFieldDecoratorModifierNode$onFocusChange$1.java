package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {661}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$onFocusChange$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$onFocusChange$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, j00.c<? super TextFieldDecoratorModifierNode$onFocusChange$1> cVar) {
        super(2, cVar);
        this.this$0 = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new TextFieldDecoratorModifierNode$onFocusChange$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((TextFieldDecoratorModifierNode$onFocusChange$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
            this.label = 1;
            if (textFieldSelectionState.observeChanges(this) == l11) {
                return l11;
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
