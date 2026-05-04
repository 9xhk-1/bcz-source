package androidx.compose.material;

import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.runtime.MutableFloatState;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SwipeableState$snapInternalToOffset$2 extends SuspendLambda implements p<DragScope, c<? super g2>, Object> {
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$snapInternalToOffset$2(float f11, SwipeableState<T> swipeableState, c<? super SwipeableState$snapInternalToOffset$2> cVar) {
        super(2, cVar);
        this.$target = f11;
        this.this$0 = swipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new SwipeableState$snapInternalToOffset$2(this.$target, this.this$0, cVar);
        swipeableState$snapInternalToOffset$2.L$0 = obj;
        return swipeableState$snapInternalToOffset$2;
    }

    @Override // x00.p
    public final Object invoke(DragScope dragScope, c<? super g2> cVar) {
        return ((SwipeableState$snapInternalToOffset$2) create(dragScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableFloatState mutableFloatState;
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        DragScope dragScope = (DragScope) this.L$0;
        float f11 = this.$target;
        mutableFloatState = ((SwipeableState) this.this$0).absoluteOffset;
        dragScope.dragBy(f11 - mutableFloatState.getFloatValue());
        return g2.f100423a;
    }
}
