package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
    final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
    final /* synthetic */ TextFieldSelectionState $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, j00.c<? super TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1> cVar) {
        super(2, cVar);
        this.$this_with = textFieldSelectionState;
        this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(this.$this_with, this.$this_SuspendingPointerInputModifierNode, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            TextFieldSelectionState textFieldSelectionState = this.$this_with;
            PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
            this.label = 1;
            if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == l11) {
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
