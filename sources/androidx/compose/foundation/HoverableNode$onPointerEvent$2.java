package androidx.compose.foundation;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class HoverableNode$onPointerEvent$2 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ HoverableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$onPointerEvent$2(HoverableNode hoverableNode, j00.c<? super HoverableNode$onPointerEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new HoverableNode$onPointerEvent$2(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((HoverableNode$onPointerEvent$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object emitExit;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            HoverableNode hoverableNode = this.this$0;
            this.label = 1;
            emitExit = hoverableNode.emitExit(this);
            if (emitExit == l11) {
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
