package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import c40.r0;
import j00.c;
import java.util.concurrent.CancellationException;
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
@d(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {953}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements p<r0, c<? super Float>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ ScrollScope $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f11, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, c<? super DefaultFlingBehavior$performFling$2> cVar) {
        super(2, cVar);
        this.$initialVelocity = f11;
        this.this$0 = defaultFlingBehavior;
        this.$this_performFling = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super Float> cVar) {
        return ((DefaultFlingBehavior$performFling$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f11;
        AnimationState animationState;
        Ref.FloatRef floatRef;
        DecayAnimationSpec decayAnimationSpec;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            if (Math.abs(this.$initialVelocity) <= 1.0f) {
                f11 = this.$initialVelocity;
                return a.e(f11);
            }
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            floatRef2.element = this.$initialVelocity;
            final Ref.FloatRef floatRef3 = new Ref.FloatRef();
            AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
            try {
                decayAnimationSpec = this.this$0.flingDecay;
                final ScrollScope scrollScope = this.$this_performFling;
                final DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                l<AnimationScope<Float, AnimationVector1D>, g2> lVar = new l<AnimationScope<Float, AnimationVector1D>, g2>() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2.1
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
                        float floatValue = animationScope.getValue().floatValue() - Ref.FloatRef.this.element;
                        float scrollBy = scrollScope.scrollBy(floatValue);
                        Ref.FloatRef.this.element = animationScope.getValue().floatValue();
                        floatRef2.element = animationScope.getVelocity().floatValue();
                        if (Math.abs(floatValue - scrollBy) > 0.5f) {
                            animationScope.cancelAnimation();
                        }
                        DefaultFlingBehavior defaultFlingBehavior2 = defaultFlingBehavior;
                        defaultFlingBehavior2.setLastAnimationCycleCount(defaultFlingBehavior2.getLastAnimationCycleCount() + 1);
                    }
                };
                this.L$0 = floatRef2;
                this.L$1 = AnimationState$default;
                this.label = 1;
                animationState = AnimationState$default;
                try {
                    if (SuspendAnimationKt.animateDecay$default(animationState, decayAnimationSpec, false, lVar, this, 2, null) == l11) {
                        return l11;
                    }
                    floatRef = floatRef2;
                } catch (CancellationException unused) {
                    floatRef = floatRef2;
                    floatRef.element = ((Number) animationState.getVelocity()).floatValue();
                    f11 = floatRef.element;
                    return a.e(f11);
                }
            } catch (CancellationException unused2) {
                animationState = AnimationState$default;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            animationState = (AnimationState) this.L$1;
            floatRef = (Ref.FloatRef) this.L$0;
            try {
                e.n(obj);
            } catch (CancellationException unused3) {
                floatRef.element = ((Number) animationState.getVelocity()).floatValue();
                f11 = floatRef.element;
                return a.e(f11);
            }
        }
        f11 = floatRef.element;
        return a.e(f11);
    }
}
