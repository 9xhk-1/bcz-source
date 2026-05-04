package androidx.compose.material;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.r;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$snapTo$2<T> extends SuspendLambda implements r<AnchoredDragScope, DraggableAnchors<T>, T, c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    public AnchoredDraggableKt$snapTo$2(c<? super AnchoredDraggableKt$snapTo$2> cVar) {
        super(4, cVar);
    }

    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t11, c<? super g2> cVar) {
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(cVar);
        anchoredDraggableKt$snapTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$snapTo$2.L$1 = draggableAnchors;
        anchoredDraggableKt$snapTo$2.L$2 = t11;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
        float positionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
        if (!Float.isNaN(positionOf)) {
            AnchoredDragScope.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
        }
        return g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x00.r
    public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, c<? super g2> cVar) {
        return invoke(anchoredDragScope, (DraggableAnchors<DraggableAnchors<T>>) obj, (DraggableAnchors<T>) obj2, cVar);
    }
}
