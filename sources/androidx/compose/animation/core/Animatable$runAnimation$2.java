package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import x00.l;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T, V] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {305}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class Animatable$runAnimation$2<T, V> extends SuspendLambda implements l<j00.c<? super AnimationResult<T, V>>, Object> {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ l<Animatable<T, V>, g2> $block;
    final /* synthetic */ T $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Animatable$runAnimation$2(Animatable<T, V> animatable, T t11, Animation<T, V> animation, long j11, l<? super Animatable<T, V>, g2> lVar, j00.c<? super Animatable$runAnimation$2> cVar) {
        super(1, cVar);
        this.this$0 = animatable;
        this.$initialVelocity = t11;
        this.$animation = animation;
        this.$startTime = j11;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super AnimationResult<T, V>> cVar) {
        return ((Animatable$runAnimation$2) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnimationState animationState;
        Ref.BooleanRef booleanRef;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                this.this$0.setTargetValue(this.$animation.getTargetValue());
                this.this$0.setRunning(true);
                final AnimationState copy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Animation<T, V> animation = this.$animation;
                long j11 = this.$startTime;
                final Animatable<T, V> animatable = this.this$0;
                final l<Animatable<T, V>, g2> lVar = this.$block;
                l<AnimationScope<T, V>, g2> lVar2 = new l<AnimationScope<T, V>, g2>() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Object obj2) {
                        invoke((AnimationScope) obj2);
                        return g2.f100423a;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(AnimationScope<T, V> animationScope) {
                        Object clampToBounds;
                        SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core_release());
                        clampToBounds = animatable.clampToBounds(animationScope.getValue());
                        if (g0.g(clampToBounds, animationScope.getValue())) {
                            l<Animatable<T, V>, g2> lVar3 = lVar;
                            if (lVar3 != null) {
                                lVar3.invoke(animatable);
                                return;
                            }
                            return;
                        }
                        animatable.getInternalState$animation_core_release().setValue$animation_core_release(clampToBounds);
                        copy$default.setValue$animation_core_release(clampToBounds);
                        l<Animatable<T, V>, g2> lVar4 = lVar;
                        if (lVar4 != null) {
                            lVar4.invoke(animatable);
                        }
                        animationScope.cancelAnimation();
                        booleanRef2.element = true;
                    }
                };
                this.L$0 = copy$default;
                this.L$1 = booleanRef2;
                this.label = 1;
                if (SuspendAnimationKt.animate(copy$default, animation, j11, lVar2, this) == l11) {
                    return l11;
                }
                animationState = copy$default;
                booleanRef = booleanRef2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.L$1;
                animationState = (AnimationState) this.L$0;
                kotlin.e.n(obj);
            }
            AnimationEndReason animationEndReason = booleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            this.this$0.endAnimation();
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e11) {
            this.this$0.endAnimation();
            throw e11;
        }
    }
}
