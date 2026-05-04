package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", i = {}, l = {309}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DraggableNode$onDragStarted$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ long $startedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$onDragStarted$1(DraggableNode draggableNode, long j11, c<? super DraggableNode$onDragStarted$1> cVar) {
        super(2, cVar);
        this.this$0 = draggableNode;
        this.$startedPosition = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        DraggableNode$onDragStarted$1 draggableNode$onDragStarted$1 = new DraggableNode$onDragStarted$1(this.this$0, this.$startedPosition, cVar);
        draggableNode$onDragStarted$1.L$0 = obj;
        return draggableNode$onDragStarted$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((DraggableNode$onDragStarted$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q qVar;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            r0 r0Var = (r0) this.L$0;
            qVar = this.this$0.onDragStarted;
            Offset m2257boximpl = Offset.m2257boximpl(this.$startedPosition);
            this.label = 1;
            if (qVar.invoke(r0Var, m2257boximpl, this) == l11) {
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
