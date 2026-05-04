package androidx.compose.material;

import androidx.compose.foundation.gestures.DragScope;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import x00.q;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState$draggableState$1$drag$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,879:1\n1#2:880\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableState$draggableState$1$drag$2<T> extends SuspendLambda implements q<AnchoredDragScope, DraggableAnchors<T>, c<? super g2>, Object> {
    final /* synthetic */ p<DragScope, c<? super g2>, Object> $block;
    int label;
    final /* synthetic */ AnchoredDraggableState$draggableState$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, p<? super DragScope, ? super c<? super g2>, ? extends Object> pVar, c<? super AnchoredDraggableState$draggableState$1$drag$2> cVar) {
        super(3, cVar);
        this.this$0 = anchoredDraggableState$draggableState$1;
        this.$block = pVar;
    }

    @Override // x00.q
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, c<? super g2> cVar) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, cVar).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnchoredDraggableState$draggableState$1$dragScope$1 anchoredDraggableState$draggableState$1$dragScope$1;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            anchoredDraggableState$draggableState$1$dragScope$1 = this.this$0.dragScope;
            p<DragScope, c<? super g2>, Object> pVar = this.$block;
            this.label = 1;
            if (pVar.invoke(anchoredDraggableState$draggableState$1$dragScope$1, this) == l11) {
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
