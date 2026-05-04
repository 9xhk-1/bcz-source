package androidx.compose.foundation.lazy.layout;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", i = {0, 0}, l = {49}, m = "waitForFirstLayout", n = {"this", "oldContinuation"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class AwaitFirstLayoutModifier$waitForFirstLayout$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AwaitFirstLayoutModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwaitFirstLayoutModifier$waitForFirstLayout$1(AwaitFirstLayoutModifier awaitFirstLayoutModifier, c<? super AwaitFirstLayoutModifier$waitForFirstLayout$1> cVar) {
        super(cVar);
        this.this$0 = awaitFirstLayoutModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.waitForFirstLayout(this);
    }
}
