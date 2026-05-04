package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
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
@d(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SwipeableState$animateInternalToOffset$2 extends SuspendLambda implements p<DragScope, c<? super g2>, Object> {
    final /* synthetic */ AnimationSpec<Float> $spec;
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateInternalToOffset$2(SwipeableState<T> swipeableState, float f11, AnimationSpec<Float> animationSpec, c<? super SwipeableState$animateInternalToOffset$2> cVar) {
        super(2, cVar);
        this.this$0 = swipeableState;
        this.$target = f11;
        this.$spec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.this$0, this.$target, this.$spec, cVar);
        swipeableState$animateInternalToOffset$2.L$0 = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    @Override // x00.p
    public final Object invoke(DragScope dragScope, c<? super g2> cVar) {
        return ((SwipeableState$animateInternalToOffset$2) create(dragScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        MutableFloatState mutableFloatState;
        MutableState mutableState2;
        MutableState mutableState3;
        Object l11 = b.l();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                e.n(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                mutableFloatState = ((SwipeableState) this.this$0).absoluteOffset;
                floatRef.element = mutableFloatState.getFloatValue();
                mutableState2 = ((SwipeableState) this.this$0).animationTarget;
                mutableState2.setValue(a.e(this.$target));
                this.this$0.setAnimationRunning(true);
                Animatable Animatable$default = AnimatableKt.Animatable$default(floatRef.element, 0.0f, 2, null);
                Float e11 = a.e(this.$target);
                AnimationSpec<Float> animationSpec = this.$spec;
                l<Animatable<Float, AnimationVector1D>, g2> lVar = new l<Animatable<Float, AnimationVector1D>, g2>() { // from class: androidx.compose.material.SwipeableState$animateInternalToOffset$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Animatable<Float, AnimationVector1D> animatable) {
                        invoke2(animatable);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Animatable<Float, AnimationVector1D> animatable) {
                        DragScope.this.dragBy(animatable.getValue().floatValue() - floatRef.element);
                        floatRef.element = animatable.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (Animatable.animateTo$default(Animatable$default, e11, animationSpec, null, lVar, this, 4, null) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
            }
            mutableState3 = ((SwipeableState) this.this$0).animationTarget;
            mutableState3.setValue(null);
            this.this$0.setAnimationRunning(false);
            return g2.f100423a;
        } catch (Throwable th2) {
            mutableState = ((SwipeableState) this.this$0).animationTarget;
            mutableState.setValue(null);
            this.this$0.setAnimationRunning(false);
            throw th2;
        }
    }
}
