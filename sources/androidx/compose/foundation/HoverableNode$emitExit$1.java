package androidx.compose.foundation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0}, l = {114}, m = "emitExit", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class HoverableNode$emitExit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HoverableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitExit$1(HoverableNode hoverableNode, j00.c<? super HoverableNode$emitExit$1> cVar) {
        super(cVar);
        this.this$0 = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@m80.k Object obj) {
        Object emitExit;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        emitExit = this.this$0.emitExit(this);
        return emitExit;
    }
}
