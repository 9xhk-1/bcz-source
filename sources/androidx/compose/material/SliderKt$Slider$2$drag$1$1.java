package androidx.compose.material;

import androidx.compose.runtime.State;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.a;
import l00.d;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SliderKt$Slider$2$drag$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SliderKt$Slider$2$drag$1$1 extends SuspendLambda implements q<r0, Float, c<? super g2>, Object> {
    final /* synthetic */ State<l<Float, g2>> $gestureEndAction;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$2$drag$1$1(State<? extends l<? super Float, g2>> state, c<? super SliderKt$Slider$2$drag$1$1> cVar) {
        super(3, cVar);
        this.$gestureEndAction = state;
    }

    public final Object invoke(r0 r0Var, float f11, c<? super g2> cVar) {
        SliderKt$Slider$2$drag$1$1 sliderKt$Slider$2$drag$1$1 = new SliderKt$Slider$2$drag$1$1(this.$gestureEndAction, cVar);
        sliderKt$Slider$2$drag$1$1.F$0 = f11;
        return sliderKt$Slider$2$drag$1$1.invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        this.$gestureEndAction.getValue().invoke(a.e(this.F$0));
        return g2.f100423a;
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, Float f11, c<? super g2> cVar) {
        return invoke(r0Var, f11.floatValue(), cVar);
    }
}
