package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$draggableState$1 implements DraggableState {
    private final AnchoredDraggableState$draggableState$1$dragScope$1 dragScope;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material.AnchoredDraggableState$draggableState$1$dragScope$1] */
    public AnchoredDraggableState$draggableState$1(final AnchoredDraggableState<T> anchoredDraggableState) {
        this.this$0 = anchoredDraggableState;
        this.dragScope = new DragScope() { // from class: androidx.compose.material.AnchoredDraggableState$draggableState$1$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f11) {
                AnchoredDragScope anchoredDragScope;
                anchoredDragScope = ((AnchoredDraggableState) anchoredDraggableState).anchoredDragScope;
                AnchoredDragScope.dragTo$default(anchoredDragScope, anchoredDraggableState.newOffsetForDelta$material_release(f11), 0.0f, 2, null);
            }
        };
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f11) {
        this.this$0.dispatchRawDelta(f11);
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, p<? super DragScope, ? super c<? super g2>, ? extends Object> pVar, c<? super g2> cVar) {
        Object anchoredDrag = this.this$0.anchoredDrag(mutatePriority, new AnchoredDraggableState$draggableState$1$drag$2(this, pVar, null), cVar);
        return anchoredDrag == b.l() ? anchoredDrag : g2.f100423a;
    }
}
