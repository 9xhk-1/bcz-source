package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import l00.d;
import x00.q;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", i = {}, l = {469}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableNode$fling$2<T> extends SuspendLambda implements q<AnchoredDragScope, DraggableAnchors<T>, c<? super g2>, Object> {
    final /* synthetic */ Ref.FloatRef $leftoverVelocity;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$2(AnchoredDraggableNode<T> anchoredDraggableNode, Ref.FloatRef floatRef, float f11, c<? super AnchoredDraggableNode$fling$2> cVar) {
        super(3, cVar);
        this.this$0 = anchoredDraggableNode;
        this.$leftoverVelocity = floatRef;
        this.$velocity = f11;
    }

    @Override // x00.q
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, c<? super g2> cVar) {
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this.this$0, this.$leftoverVelocity, this.$velocity, cVar);
        anchoredDraggableNode$fling$2.L$0 = anchoredDragScope;
        return anchoredDraggableNode$fling$2.invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.FloatRef floatRef;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2$scrollScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f11) {
                    AnchoredDraggableState anchoredDraggableState;
                    AnchoredDraggableState anchoredDraggableState2;
                    anchoredDraggableState = ((AnchoredDraggableNode) anchoredDraggableNode).state;
                    float newOffsetForDelta$foundation_release = anchoredDraggableState.newOffsetForDelta$foundation_release(f11);
                    anchoredDraggableState2 = ((AnchoredDraggableNode) anchoredDraggableNode).state;
                    float offset = newOffsetForDelta$foundation_release - anchoredDraggableState2.getOffset();
                    AnchoredDragScope.dragTo$default(anchoredDragScope, newOffsetForDelta$foundation_release, 0.0f, 2, null);
                    return offset;
                }
            };
            FlingBehavior resolvedFlingBehavior = this.this$0.getResolvedFlingBehavior();
            Ref.FloatRef floatRef2 = this.$leftoverVelocity;
            float f11 = this.$velocity;
            this.L$0 = floatRef2;
            this.label = 1;
            obj = resolvedFlingBehavior.performFling(scrollScope, f11, this);
            if (obj == l11) {
                return l11;
            }
            floatRef = floatRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) this.L$0;
            e.n(obj);
        }
        floatRef.element = ((Number) obj).floatValue();
        return g2.f100423a;
    }
}
