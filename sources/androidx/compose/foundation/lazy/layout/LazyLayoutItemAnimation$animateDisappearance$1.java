package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation$animateDisappearance$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ GraphicsLayer $layer;
    final /* synthetic */ FiniteAnimationSpec<Float> $spec;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateDisappearance$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<Float> finiteAnimationSpec, GraphicsLayer graphicsLayer, c<? super LazyLayoutItemAnimation$animateDisappearance$1> cVar) {
        super(2, cVar);
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = finiteAnimationSpec;
        this.$layer = graphicsLayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new LazyLayoutItemAnimation$animateDisappearance$1(this.this$0, this.$spec, this.$layer, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((LazyLayoutItemAnimation$animateDisappearance$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LazyLayoutItemAnimation$animateDisappearance$1 lazyLayoutItemAnimation$animateDisappearance$1;
        Animatable animatable;
        Throwable th2;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            try {
                animatable = this.this$0.visibilityAnimation;
                Float e11 = l00.a.e(0.0f);
                FiniteAnimationSpec<Float> finiteAnimationSpec = this.$spec;
                final GraphicsLayer graphicsLayer = this.$layer;
                final LazyLayoutItemAnimation lazyLayoutItemAnimation = this.this$0;
                l<Animatable<Float, AnimationVector1D>, g2> lVar = new l<Animatable<Float, AnimationVector1D>, g2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Animatable<Float, AnimationVector1D> animatable2) {
                        invoke2(animatable2);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Animatable<Float, AnimationVector1D> animatable2) {
                        x00.a aVar;
                        GraphicsLayer.this.setAlpha(animatable2.getValue().floatValue());
                        aVar = lazyLayoutItemAnimation.onLayerPropertyChanged;
                        aVar.invoke();
                    }
                };
                this.label = 1;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                try {
                    if (Animatable.animateTo$default(animatable, e11, finiteAnimationSpec, null, lVar, lazyLayoutItemAnimation$animateDisappearance$1, 4, null) == l11) {
                        return l11;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    lazyLayoutItemAnimation$animateDisappearance$1.this$0.setDisappearanceAnimationInProgress(false);
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                th2 = th;
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.setDisappearanceAnimationInProgress(false);
                throw th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                e.n(obj);
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
            } catch (Throwable th5) {
                th2 = th5;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.setDisappearanceAnimationInProgress(false);
                throw th2;
            }
        }
        lazyLayoutItemAnimation$animateDisappearance$1.this$0.setDisappearanceAnimationFinished(true);
        lazyLayoutItemAnimation$animateDisappearance$1.this$0.setDisappearanceAnimationInProgress(false);
        return g2.f100423a;
    }
}
