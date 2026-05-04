package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1", f = "AnimateBoundsModifier.kt", i = {}, l = {428}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class BoundsTransformDeferredAnimation$animate$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ Animatable<Rect, AnimationVector4D> $anim;
    final /* synthetic */ BoundsTransform $boundsTransform;
    final /* synthetic */ Rect $target;
    int label;
    final /* synthetic */ BoundsTransformDeferredAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundsTransformDeferredAnimation$animate$1(Animatable<Rect, AnimationVector4D> animatable, Rect rect, BoundsTransform boundsTransform, BoundsTransformDeferredAnimation boundsTransformDeferredAnimation, j00.c<? super BoundsTransformDeferredAnimation$animate$1> cVar) {
        super(2, cVar);
        this.$anim = animatable;
        this.$target = rect;
        this.$boundsTransform = boundsTransform;
        this.this$0 = boundsTransformDeferredAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new BoundsTransformDeferredAnimation$animate$1(this.$anim, this.$target, this.$boundsTransform, this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((BoundsTransformDeferredAnimation$animate$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            Animatable<Rect, AnimationVector4D> animatable = this.$anim;
            Rect rect = this.$target;
            BoundsTransform boundsTransform = this.$boundsTransform;
            Rect currentBounds = this.this$0.getCurrentBounds();
            g0.m(currentBounds);
            FiniteAnimationSpec<Rect> transform = boundsTransform.transform(currentBounds, this.$target);
            this.label = 1;
            if (Animatable.animateTo$default(animatable, rect, transform, null, null, this, 12, null) == l11) {
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
