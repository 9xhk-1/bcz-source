package androidx.compose.foundation.text.input.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", i = {0, 0}, l = {747}, m = "collectImeNotifications", n = {"this", "transformedNotifyImeListener"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class TransformedTextFieldState$collectImeNotifications$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransformedTextFieldState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$collectImeNotifications$1(TransformedTextFieldState transformedTextFieldState, j00.c<? super TransformedTextFieldState$collectImeNotifications$1> cVar) {
        super(cVar);
        this.this$0 = transformedTextFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@m80.k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collectImeNotifications(null, this);
    }
}
