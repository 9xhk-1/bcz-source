package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import c40.r0;
import com.badlogic.gdx.graphics.f;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SliderDraggableState$drag$2", f = "Slider.kt", i = {}, l = {f.f11630n0}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SliderDraggableState$drag$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ p<DragScope, c<? super g2>, Object> $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ SliderDraggableState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderDraggableState$drag$2(SliderDraggableState sliderDraggableState, MutatePriority mutatePriority, p<? super DragScope, ? super c<? super g2>, ? extends Object> pVar, c<? super SliderDraggableState$drag$2> cVar) {
        super(2, cVar);
        this.this$0 = sliderDraggableState;
        this.$dragPriority = mutatePriority;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new SliderDraggableState$drag$2(this.this$0, this.$dragPriority, this.$block, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((SliderDraggableState$drag$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        DragScope dragScope;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            this.this$0.setDragging(true);
            mutatorMutex = this.this$0.scrollMutex;
            dragScope = this.this$0.dragScope;
            MutatePriority mutatePriority = this.$dragPriority;
            p<DragScope, c<? super g2>, Object> pVar = this.$block;
            this.label = 1;
            if (mutatorMutex.mutateWith(dragScope, mutatePriority, pVar, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        this.this$0.setDragging(false);
        return g2.f100423a;
    }
}
