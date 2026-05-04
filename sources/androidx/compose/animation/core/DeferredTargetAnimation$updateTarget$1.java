package androidx.compose.animation.core;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1", f = "DeferredTargetAnimation.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DeferredTargetAnimation$updateTarget$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ Animatable<T, V> $anim;
    final /* synthetic */ FiniteAnimationSpec<T> $animationSpec;
    final /* synthetic */ T $target;
    int label;
    final /* synthetic */ DeferredTargetAnimation<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredTargetAnimation$updateTarget$1(Animatable<T, V> animatable, DeferredTargetAnimation<T, V> deferredTargetAnimation, T t11, FiniteAnimationSpec<T> finiteAnimationSpec, j00.c<? super DeferredTargetAnimation$updateTarget$1> cVar) {
        super(2, cVar);
        this.$anim = animatable;
        this.this$0 = deferredTargetAnimation;
        this.$target = t11;
        this.$animationSpec = finiteAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new DeferredTargetAnimation$updateTarget$1(this.$anim, this.this$0, this.$target, this.$animationSpec, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((DeferredTargetAnimation$updateTarget$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            Object targetValue = this.$anim.getTargetValue();
            obj2 = this.this$0.get_pendingTarget();
            if (!g0.g(targetValue, obj2)) {
                Animatable<T, V> animatable = this.$anim;
                T t11 = this.$target;
                AnimationSpec animationSpec = this.$animationSpec;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, t11, animationSpec, null, null, this, 12, null) == l11) {
                    return l11;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
