package androidx.compose.ui.input.pointer;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1 extends SuspendLambda implements p<PointerInputScope, j00.c<? super g2>, Object> {
    int label;

    public SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(j00.c<? super SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(cVar);
    }

    @Override // x00.p
    public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
        return ((SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1) create(pointerInputScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        return g2.f100423a;
    }
}
