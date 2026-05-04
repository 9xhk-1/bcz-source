package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DragScope;
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
@d(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", i = {}, l = {1053}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SliderKt$animateToTarget$2 extends SuspendLambda implements p<DragScope, c<? super g2>, Object> {
    final /* synthetic */ float $current;
    final /* synthetic */ float $target;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$animateToTarget$2(float f11, float f12, float f13, c<? super SliderKt$animateToTarget$2> cVar) {
        super(2, cVar);
        this.$current = f11;
        this.$target = f12;
        this.$velocity = f13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.$current, this.$target, this.$velocity, cVar);
        sliderKt$animateToTarget$2.L$0 = obj;
        return sliderKt$animateToTarget$2;
    }

    @Override // x00.p
    public final Object invoke(DragScope dragScope, c<? super g2> cVar) {
        return ((SliderKt$animateToTarget$2) create(dragScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TweenSpec tweenSpec;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final DragScope dragScope = (DragScope) this.L$0;
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            float f11 = this.$current;
            floatRef.element = f11;
            Animatable Animatable$default = AnimatableKt.Animatable$default(f11, 0.0f, 2, null);
            Float e11 = a.e(this.$target);
            tweenSpec = SliderKt.SliderToTickAnimation;
            Float e12 = a.e(this.$velocity);
            l<Animatable<Float, AnimationVector1D>, g2> lVar = new l<Animatable<Float, AnimationVector1D>, g2>() { // from class: androidx.compose.material.SliderKt$animateToTarget$2.1
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
            if (Animatable$default.animateTo(e11, tweenSpec, e12, lVar, this) == l11) {
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
