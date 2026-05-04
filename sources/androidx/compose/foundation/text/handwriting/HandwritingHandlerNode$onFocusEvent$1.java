package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1", f = "HandwritingHandler.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class HandwritingHandlerNode$onFocusEvent$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    int label;
    final /* synthetic */ HandwritingHandlerNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandwritingHandlerNode$onFocusEvent$1(HandwritingHandlerNode handwritingHandlerNode, c<? super HandwritingHandlerNode$onFocusEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = handwritingHandlerNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new HandwritingHandlerNode$onFocusEvent$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((HandwritingHandlerNode$onFocusEvent$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ComposeInputMethodManager composeImm;
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        composeImm = this.this$0.getComposeImm();
        composeImm.acceptStylusHandwritingDelegation();
        return g2.f100423a;
    }
}
