package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements p<ScrollScope, c<? super g2>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Ref.FloatRef $previousValue;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(float f11, AnimationSpec<Float> animationSpec, Ref.FloatRef floatRef, c<? super ScrollExtensionsKt$animateScrollBy$2> cVar) {
        super(2, cVar);
        this.$value = f11;
        this.$animationSpec = animationSpec;
        this.$previousValue = floatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$value, this.$animationSpec, this.$previousValue, cVar);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // x00.p
    public final Object invoke(ScrollScope scrollScope, c<? super g2> cVar) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(scrollScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final ScrollScope scrollScope = (ScrollScope) this.L$0;
            float f11 = this.$value;
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            final Ref.FloatRef floatRef = this.$previousValue;
            p<Float, Float, g2> pVar = new p<Float, Float, g2>() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Float f12, Float f13) {
                    invoke(f12.floatValue(), f13.floatValue());
                    return g2.f100423a;
                }

                public final void invoke(float f12, float f13) {
                    Ref.FloatRef floatRef2 = Ref.FloatRef.this;
                    float f14 = floatRef2.element;
                    floatRef2.element = f14 + scrollScope.scrollBy(f12 - f14);
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animate$default(0.0f, f11, 0.0f, animationSpec, pVar, this, 4, null) == l11) {
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
