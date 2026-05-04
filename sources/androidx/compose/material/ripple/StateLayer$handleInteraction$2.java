package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import c40.r0;
import com.vivo.push.BuildConfig;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", i = {}, l = {BuildConfig.VERSION_CODE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class StateLayer$handleInteraction$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ AnimationSpec<Float> $outgoingAnimationSpec;
    int label;
    final /* synthetic */ StateLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateLayer$handleInteraction$2(StateLayer stateLayer, AnimationSpec<Float> animationSpec, c<? super StateLayer$handleInteraction$2> cVar) {
        super(2, cVar);
        this.this$0 = stateLayer;
        this.$outgoingAnimationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new StateLayer$handleInteraction$2(this.this$0, this.$outgoingAnimationSpec, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((StateLayer$handleInteraction$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            animatable = this.this$0.animatedAlpha;
            Float e11 = l00.a.e(0.0f);
            AnimationSpec<Float> animationSpec = this.$outgoingAnimationSpec;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, e11, animationSpec, null, null, this, 12, null) == l11) {
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
