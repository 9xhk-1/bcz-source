package androidx.compose.foundation.relocation;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {100}, m = "bringIntoView", n = {"rect", "content$iv", "i$iv", "size$iv"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes.dex */
public final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BringIntoViewRequesterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, c<? super BringIntoViewRequesterImpl$bringIntoView$1> cVar) {
        super(cVar);
        this.this$0 = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.bringIntoView(null, this);
    }
}
