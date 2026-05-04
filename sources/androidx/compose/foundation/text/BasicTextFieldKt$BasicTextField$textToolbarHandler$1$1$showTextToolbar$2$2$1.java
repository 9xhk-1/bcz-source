package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$2$1", f = "BasicTextField.kt", i = {}, l = {323}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$2$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ TextFieldSelectionState $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$2$1(TextFieldSelectionState textFieldSelectionState, j00.c<? super BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$2$1> cVar) {
        super(2, cVar);
        this.$this_with = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$2$1(this.$this_with, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            TextFieldSelectionState textFieldSelectionState = this.$this_with;
            this.label = 1;
            if (textFieldSelectionState.paste(this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
