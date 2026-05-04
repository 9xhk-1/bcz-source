package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import l00.d;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {408}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableNode$drag$2<T> extends SuspendLambda implements q<AnchoredDragScope, DraggableAnchors<T>, c<? super g2>, Object> {
    final /* synthetic */ p<l<? super DragEvent.DragDelta, g2>, c<? super g2>, Object> $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableNode$drag$2(p<? super l<? super DragEvent.DragDelta, g2>, ? super c<? super g2>, ? extends Object> pVar, AnchoredDraggableNode<T> anchoredDraggableNode, c<? super AnchoredDraggableNode$drag$2> cVar) {
        super(3, cVar);
        this.$forEachDelta = pVar;
        this.this$0 = anchoredDraggableNode;
    }

    @Override // x00.q
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, c<? super g2> cVar) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.$forEachDelta, this.this$0, cVar);
        anchoredDraggableNode$drag$2.L$0 = anchoredDragScope;
        return anchoredDraggableNode$drag$2.invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            p<l<? super DragEvent.DragDelta, g2>, c<? super g2>, Object> pVar = this.$forEachDelta;
            final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
            l<DragEvent.DragDelta, g2> lVar = new l<DragEvent.DragDelta, g2>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2.1
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
                    long m390reverseIfNeededMKHz9U;
                    float m392toFloatk4lQ0M;
                    OverscrollEffect overscrollEffect;
                    OverscrollEffect overscrollEffect2;
                    long m393toOffsettuRUvjQ;
                    AnchoredDraggableState anchoredDraggableState;
                    AnchoredDraggableNode<T> anchoredDraggableNode2 = anchoredDraggableNode;
                    m390reverseIfNeededMKHz9U = anchoredDraggableNode2.m390reverseIfNeededMKHz9U(dragDelta.m414getDeltaF1C5BW0());
                    m392toFloatk4lQ0M = anchoredDraggableNode2.m392toFloatk4lQ0M(m390reverseIfNeededMKHz9U);
                    overscrollEffect = ((AnchoredDraggableNode) anchoredDraggableNode).overscrollEffect;
                    if (overscrollEffect == null) {
                        AnchoredDragScope anchoredDragScope2 = anchoredDragScope;
                        anchoredDraggableState = ((AnchoredDraggableNode) anchoredDraggableNode).state;
                        AnchoredDragScope.dragTo$default(anchoredDragScope2, anchoredDraggableState.newOffsetForDelta$foundation_release(m392toFloatk4lQ0M), 0.0f, 2, null);
                        return;
                    }
                    overscrollEffect2 = ((AnchoredDraggableNode) anchoredDraggableNode).overscrollEffect;
                    g0.m(overscrollEffect2);
                    m393toOffsettuRUvjQ = anchoredDraggableNode.m393toOffsettuRUvjQ(m392toFloatk4lQ0M);
                    int m3625getUserInputWNlRxjI = NestedScrollSource.Companion.m3625getUserInputWNlRxjI();
                    final AnchoredDraggableNode<T> anchoredDraggableNode3 = anchoredDraggableNode;
                    final AnchoredDragScope anchoredDragScope3 = anchoredDragScope;
                    overscrollEffect2.mo214applyToScrollRhakbz0(m393toOffsettuRUvjQ, m3625getUserInputWNlRxjI, new l<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode.drag.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
                            return Offset.m2257boximpl(m397invokeMKHz9U(offset.m2278unboximpl()));
                        }

                        /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
                        public final long m397invokeMKHz9U(long j11) {
                            AnchoredDraggableState anchoredDraggableState2;
                            float m392toFloatk4lQ0M2;
                            AnchoredDraggableState anchoredDraggableState3;
                            long m393toOffsettuRUvjQ2;
                            anchoredDraggableState2 = ((AnchoredDraggableNode) anchoredDraggableNode3).state;
                            m392toFloatk4lQ0M2 = anchoredDraggableNode3.m392toFloatk4lQ0M(j11);
                            float newOffsetForDelta$foundation_release = anchoredDraggableState2.newOffsetForDelta$foundation_release(m392toFloatk4lQ0M2);
                            AnchoredDraggableNode<T> anchoredDraggableNode4 = anchoredDraggableNode3;
                            anchoredDraggableState3 = ((AnchoredDraggableNode) anchoredDraggableNode4).state;
                            m393toOffsettuRUvjQ2 = anchoredDraggableNode4.m393toOffsettuRUvjQ(newOffsetForDelta$foundation_release - anchoredDraggableState3.requireOffset());
                            AnchoredDragScope.dragTo$default(anchoredDragScope3, newOffsetForDelta$foundation_release, 0.0f, 2, null);
                            return m393toOffsettuRUvjQ2;
                        }
                    });
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
