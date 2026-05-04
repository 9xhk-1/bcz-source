package androidx.compose.foundation.text.input.internal.selection;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {1280}, m = "cut", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$cut$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$cut$1(TextFieldSelectionState textFieldSelectionState, c<? super TextFieldSelectionState$cut$1> cVar) {
        super(cVar);
        this.this$0 = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.cut(this);
    }
}
