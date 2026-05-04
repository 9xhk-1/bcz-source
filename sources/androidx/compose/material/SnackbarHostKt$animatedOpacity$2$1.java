package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SnackbarHostKt$animatedOpacity$2$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $alpha;
    final /* synthetic */ AnimationSpec<Float> $animation;
    final /* synthetic */ a<g2> $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedOpacity$2$1(Animatable<Float, AnimationVector1D> animatable, boolean z11, AnimationSpec<Float> animationSpec, a<g2> aVar, c<? super SnackbarHostKt$animatedOpacity$2$1> cVar) {
        super(2, cVar);
        this.$alpha = animatable;
        this.$visible = z11;
        this.$animation = animationSpec;
        this.$onAnimationFinish = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new SnackbarHostKt$animatedOpacity$2$1(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((SnackbarHostKt$animatedOpacity$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SnackbarHostKt$animatedOpacity$2$1 snackbarHostKt$animatedOpacity$2$1;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            Animatable<Float, AnimationVector1D> animatable = this.$alpha;
            Float e11 = l00.a.e(this.$visible ? 1.0f : 0.0f);
            AnimationSpec<Float> animationSpec = this.$animation;
            this.label = 1;
            snackbarHostKt$animatedOpacity$2$1 = this;
            if (Animatable.animateTo$default(animatable, e11, animationSpec, null, null, snackbarHostKt$animatedOpacity$2$1, 12, null) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            snackbarHostKt$animatedOpacity$2$1 = this;
        }
        snackbarHostKt$animatedOpacity$2$1.$onAnimationFinish.invoke();
        return g2.f100423a;
    }
}
