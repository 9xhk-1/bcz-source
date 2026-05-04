package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DraggableNode$drag$2 extends SuspendLambda implements p<DragScope, c<? super g2>, Object> {
    final /* synthetic */ p<l<? super DragEvent.DragDelta, g2>, c<? super g2>, Object> $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableNode$drag$2(p<? super l<? super DragEvent.DragDelta, g2>, ? super c<? super g2>, ? extends Object> pVar, DraggableNode draggableNode, c<? super DraggableNode$drag$2> cVar) {
        super(2, cVar);
        this.$forEachDelta = pVar;
        this.this$0 = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.$forEachDelta, this.this$0, cVar);
        draggableNode$drag$2.L$0 = obj;
        return draggableNode$drag$2;
    }

    @Override // x00.p
    public final Object invoke(DragScope dragScope, c<? super g2> cVar) {
        return ((DraggableNode$drag$2) create(dragScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final DragScope dragScope = (DragScope) this.L$0;
            p<l<? super DragEvent.DragDelta, g2>, c<? super g2>, Object> pVar = this.$forEachDelta;
            final DraggableNode draggableNode = this.this$0;
            l<DragEvent.DragDelta, g2> lVar = new l<DragEvent.DragDelta, g2>() { // from class: androidx.compose.foundation.gestures.DraggableNode$drag$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(DragEvent.DragDelta dragDelta) {
                    invoke2(dragDelta);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DragEvent.DragDelta dragDelta) {
                    long m459reverseIfNeededMKHz9U;
                    Orientation orientation;
                    float m452toFloat3MmeM6k;
                    DragScope dragScope2 = DragScope.this;
                    m459reverseIfNeededMKHz9U = draggableNode.m459reverseIfNeededMKHz9U(dragDelta.m414getDeltaF1C5BW0());
                    orientation = draggableNode.orientation;
                    m452toFloat3MmeM6k = DraggableKt.m452toFloat3MmeM6k(m459reverseIfNeededMKHz9U, orientation);
                    dragScope2.dragBy(m452toFloat3MmeM6k);
                }
            };
            this.label = 1;
            if (pVar.invoke(lVar, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
