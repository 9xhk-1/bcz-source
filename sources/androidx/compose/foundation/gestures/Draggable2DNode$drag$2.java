package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", f = "Draggable2D.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class Draggable2DNode$drag$2 extends SuspendLambda implements p<Drag2DScope, c<? super g2>, Object> {
    final /* synthetic */ p<l<? super DragEvent.DragDelta, g2>, c<? super g2>, Object> $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Draggable2DNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Draggable2DNode$drag$2(p<? super l<? super DragEvent.DragDelta, g2>, ? super c<? super g2>, ? extends Object> pVar, Draggable2DNode draggable2DNode, c<? super Draggable2DNode$drag$2> cVar) {
        super(2, cVar);
        this.$forEachDelta = pVar;
        this.this$0 = draggable2DNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        Draggable2DNode$drag$2 draggable2DNode$drag$2 = new Draggable2DNode$drag$2(this.$forEachDelta, this.this$0, cVar);
        draggable2DNode$drag$2.L$0 = obj;
        return draggable2DNode$drag$2;
    }

    @Override // x00.p
    public final Object invoke(Drag2DScope drag2DScope, c<? super g2> cVar) {
        return ((Draggable2DNode$drag$2) create(drag2DScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final Drag2DScope drag2DScope = (Drag2DScope) this.L$0;
            p<l<? super DragEvent.DragDelta, g2>, c<? super g2>, Object> pVar = this.$forEachDelta;
            final Draggable2DNode draggable2DNode = this.this$0;
            l<DragEvent.DragDelta, g2> lVar = new l<DragEvent.DragDelta, g2>() { // from class: androidx.compose.foundation.gestures.Draggable2DNode$drag$2.1
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
                    Drag2DScope drag2DScope2 = Drag2DScope.this;
                    Draggable2DNode draggable2DNode2 = draggable2DNode;
                    long m414getDeltaF1C5BW0 = dragDelta.m414getDeltaF1C5BW0();
                    if (draggable2DNode2.reverseDirection) {
                        m414getDeltaF1C5BW0 = Offset.m2260constructorimpl(m414getDeltaF1C5BW0 ^ (-9223372034707292160L));
                    }
                    drag2DScope2.mo412dragByk4lQ0M(m414getDeltaF1C5BW0);
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
