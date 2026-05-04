package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.r;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", i = {}, l = {1344}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateTo$4<T> extends SuspendLambda implements r<AnchoredDragScope, DraggableAnchors<T>, T, c<? super g2>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$4(AnchoredDraggableState<T> anchoredDraggableState, AnimationSpec<Float> animationSpec, c<? super AnchoredDraggableKt$animateTo$4> cVar) {
        super(4, cVar);
        this.$this_animateTo = anchoredDraggableState;
        this.$animationSpec = animationSpec;
    }

    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t11, c<? super g2> cVar) {
        AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new AnchoredDraggableKt$animateTo$4(this.$this_animateTo, this.$animationSpec, cVar);
        anchoredDraggableKt$animateTo$4.L$0 = anchoredDragScope;
        anchoredDraggableKt$animateTo$4.L$1 = draggableAnchors;
        anchoredDraggableKt$animateTo$4.L$2 = t11;
        return anchoredDraggableKt$animateTo$4.invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object animateTo;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$1;
            Object obj2 = this.L$2;
            AnchoredDraggableState<T> anchoredDraggableState = this.$this_animateTo;
            float lastVelocity = anchoredDraggableState.getLastVelocity();
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            animateTo = AnchoredDraggableKt.animateTo(anchoredDraggableState, lastVelocity, anchoredDragScope, draggableAnchors, obj2, animationSpec, this);
            if (animateTo == l11) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x00.r
    public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, c<? super g2> cVar) {
        return invoke(anchoredDragScope, (DraggableAnchors<DraggableAnchors<T>>) obj, (DraggableAnchors<T>) obj2, cVar);
    }
}
