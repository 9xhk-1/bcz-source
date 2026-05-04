package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import l00.d;
import x00.p;
import x00.r;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {693}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateTo$2<T> extends SuspendLambda implements r<AnchoredDragScope, DraggableAnchors<T>, T, c<? super g2>, Object> {
    final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState<T> anchoredDraggableState, float f11, c<? super AnchoredDraggableKt$animateTo$2> cVar) {
        super(4, cVar);
        this.$this_animateTo = anchoredDraggableState;
        this.$velocity = f11;
    }

    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t11, c<? super g2> cVar) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.$this_animateTo, this.$velocity, cVar);
        anchoredDraggableKt$animateTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$animateTo$2.L$1 = draggableAnchors;
        anchoredDraggableKt$animateTo$2.L$2 = t11;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float positionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(positionOf)) {
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                float offset = Float.isNaN(this.$this_animateTo.getOffset()) ? 0.0f : this.$this_animateTo.getOffset();
                floatRef.element = offset;
                float f11 = this.$velocity;
                AnimationSpec<Float> animationSpec = this.$this_animateTo.getAnimationSpec();
                p<Float, Float, g2> pVar = new p<Float, Float, g2>() { // from class: androidx.compose.material.AnchoredDraggableKt$animateTo$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // x00.p
                    public /* bridge */ /* synthetic */ g2 invoke(Float f12, Float f13) {
                        invoke(f12.floatValue(), f13.floatValue());
                        return g2.f100423a;
                    }

                    public final void invoke(float f12, float f13) {
                        AnchoredDragScope.this.dragTo(f12, f13);
                        floatRef.element = f12;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (SuspendAnimationKt.animate(offset, positionOf, f11, animationSpec, pVar, this) == l11) {
                    return l11;
                }
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
