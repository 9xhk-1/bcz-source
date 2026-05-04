package androidx.compose.material.ripple;

import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.DrawModifierNodeKt;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.ripple.CommonRippleNode$addRipple$2", f = "CommonRipple.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class CommonRippleNode$addRipple$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ PressInteraction.Press $interaction;
    final /* synthetic */ RippleAnimation $rippleAnimation;
    int label;
    final /* synthetic */ CommonRippleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRippleNode$addRipple$2(RippleAnimation rippleAnimation, CommonRippleNode commonRippleNode, PressInteraction.Press press, c<? super CommonRippleNode$addRipple$2> cVar) {
        super(2, cVar);
        this.$rippleAnimation = rippleAnimation;
        this.this$0 = commonRippleNode;
        this.$interaction = press;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new CommonRippleNode$addRipple$2(this.$rippleAnimation, this.this$0, this.$interaction, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((CommonRippleNode$addRipple$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableScatterMap mutableScatterMap;
        MutableScatterMap mutableScatterMap2;
        Object l11 = b.l();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                e.n(obj);
                RippleAnimation rippleAnimation = this.$rippleAnimation;
                this.label = 1;
                if (rippleAnimation.animate(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
            }
            mutableScatterMap2 = this.this$0.ripples;
            mutableScatterMap2.remove(this.$interaction);
            DrawModifierNodeKt.invalidateDraw(this.this$0);
            return g2.f100423a;
        } catch (Throwable th2) {
            mutableScatterMap = this.this$0.ripples;
            mutableScatterMap.remove(this.$interaction);
            DrawModifierNodeKt.invalidateDraw(this.this$0);
            throw th2;
        }
    }
}
