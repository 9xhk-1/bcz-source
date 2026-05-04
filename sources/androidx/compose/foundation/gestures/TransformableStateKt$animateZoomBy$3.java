package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import l00.a;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TransformableStateKt$animateZoomBy$3 extends SuspendLambda implements p<TransformScope, c<? super g2>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Ref.FloatRef $previous;
    final /* synthetic */ float $zoomFactor;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateZoomBy$3(Ref.FloatRef floatRef, float f11, AnimationSpec<Float> animationSpec, c<? super TransformableStateKt$animateZoomBy$3> cVar) {
        super(2, cVar);
        this.$previous = floatRef;
        this.$zoomFactor = f11;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TransformableStateKt$animateZoomBy$3 transformableStateKt$animateZoomBy$3 = new TransformableStateKt$animateZoomBy$3(this.$previous, this.$zoomFactor, this.$animationSpec, cVar);
        transformableStateKt$animateZoomBy$3.L$0 = obj;
        return transformableStateKt$animateZoomBy$3;
    }

    @Override // x00.p
    public final Object invoke(TransformScope transformScope, c<? super g2> cVar) {
        return ((TransformableStateKt$animateZoomBy$3) create(transformScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.element, 0.0f, 0L, 0L, false, 30, null);
            Float e11 = a.e(this.$zoomFactor);
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            final Ref.FloatRef floatRef = this.$previous;
            l<AnimationScope<Float, AnimationVector1D>, g2> lVar = new l<AnimationScope<Float, AnimationVector1D>, g2>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                    TransformScope.m527transformByd4ec7I$default(transformScope, Ref.FloatRef.this.element == 0.0f ? 1.0f : animationScope.getValue().floatValue() / Ref.FloatRef.this.element, 0L, 0.0f, 6, null);
                    Ref.FloatRef.this.element = animationScope.getValue().floatValue();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, e11, animationSpec, false, lVar, this, 4, null) == l11) {
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
