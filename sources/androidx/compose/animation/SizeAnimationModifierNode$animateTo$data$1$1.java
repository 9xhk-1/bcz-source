package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifierNode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.unit.IntSize;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", i = {}, l = {com.jiongji.andriod.card.R.styleable.Theme_drawable_tab_friends}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ SizeAnimationModifierNode.AnimData $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.AnimData animData, long j11, SizeAnimationModifierNode sizeAnimationModifierNode, j00.c<? super SizeAnimationModifierNode$animateTo$data$1$1> cVar) {
        super(2, cVar);
        this.$this_apply = animData;
        this.$targetSize = j11;
        this.this$0 = sizeAnimationModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SizeAnimationModifierNode$animateTo$data$1$1 sizeAnimationModifierNode$animateTo$data$1$1;
        p<IntSize, IntSize, g2> listener;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            Animatable<IntSize, AnimationVector2D> anim = this.$this_apply.getAnim();
            IntSize m5278boximpl = IntSize.m5278boximpl(this.$targetSize);
            AnimationSpec<IntSize> animationSpec = this.this$0.getAnimationSpec();
            this.label = 1;
            sizeAnimationModifierNode$animateTo$data$1$1 = this;
            obj = Animatable.animateTo$default(anim, m5278boximpl, animationSpec, null, null, sizeAnimationModifierNode$animateTo$data$1$1, 12, null);
            if (obj == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            sizeAnimationModifierNode$animateTo$data$1$1 = this;
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.Finished && (listener = sizeAnimationModifierNode$animateTo$data$1$1.this$0.getListener()) != 0) {
            listener.invoke(IntSize.m5278boximpl(sizeAnimationModifierNode$animateTo$data$1$1.$this_apply.m120getStartSizeYbymL2g()), animationResult.getEndState().getValue());
        }
        return g2.f100423a;
    }
}
