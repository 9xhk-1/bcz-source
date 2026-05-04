package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.DefaultButtonElevation$elevation$2$1", f = "Button.kt", i = {}, l = {554, 563}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DefaultButtonElevation$elevation$2$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ DefaultButtonElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultButtonElevation$elevation$2$1(Animatable<Dp, AnimationVector1D> animatable, float f11, boolean z11, DefaultButtonElevation defaultButtonElevation, Interaction interaction, c<? super DefaultButtonElevation$elevation$2$1> cVar) {
        super(2, cVar);
        this.$animatable = animatable;
        this.$target = f11;
        this.$enabled = z11;
        this.this$0 = defaultButtonElevation;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new DefaultButtonElevation$elevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((DefaultButtonElevation$elevation$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r7.snapTo(r1, r6) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
    
        if (androidx.compose.material.ElevationKt.m1664animateElevationrAjV9yQ(r7, r1, r3, r4, r6) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            kotlin.e.n(r7)
            goto La0
        L1c:
            kotlin.e.n(r7)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            java.lang.Object r7 = r7.getTargetValue()
            androidx.compose.ui.unit.Dp r7 = (androidx.compose.ui.unit.Dp) r7
            float r7 = r7.m5129unboximpl()
            float r1 = r6.$target
            boolean r7 = androidx.compose.ui.unit.Dp.m5120equalsimpl0(r7, r1)
            if (r7 != 0) goto La0
            boolean r7 = r6.$enabled
            if (r7 != 0) goto L48
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            float r1 = r6.$target
            androidx.compose.ui.unit.Dp r1 = androidx.compose.ui.unit.Dp.m5113boximpl(r1)
            r6.label = r3
            java.lang.Object r7 = r7.snapTo(r1, r6)
            if (r7 != r0) goto La0
            goto L9f
        L48:
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            java.lang.Object r7 = r7.getTargetValue()
            androidx.compose.ui.unit.Dp r7 = (androidx.compose.ui.unit.Dp) r7
            float r7 = r7.m5129unboximpl()
            androidx.compose.material.DefaultButtonElevation r1 = r6.this$0
            float r1 = androidx.compose.material.DefaultButtonElevation.access$getPressedElevation$p(r1)
            boolean r1 = androidx.compose.ui.unit.Dp.m5120equalsimpl0(r7, r1)
            r3 = 0
            if (r1 == 0) goto L6e
            androidx.compose.foundation.interaction.PressInteraction$Press r7 = new androidx.compose.foundation.interaction.PressInteraction$Press
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.Companion
            long r4 = r1.m2284getZeroF1C5BW0()
            r7.<init>(r4, r3)
            r3 = r7
            goto L91
        L6e:
            androidx.compose.material.DefaultButtonElevation r1 = r6.this$0
            float r1 = androidx.compose.material.DefaultButtonElevation.access$getHoveredElevation$p(r1)
            boolean r1 = androidx.compose.ui.unit.Dp.m5120equalsimpl0(r7, r1)
            if (r1 == 0) goto L80
            androidx.compose.foundation.interaction.HoverInteraction$Enter r3 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
            r3.<init>()
            goto L91
        L80:
            androidx.compose.material.DefaultButtonElevation r1 = r6.this$0
            float r1 = androidx.compose.material.DefaultButtonElevation.access$getFocusedElevation$p(r1)
            boolean r7 = androidx.compose.ui.unit.Dp.m5120equalsimpl0(r7, r1)
            if (r7 == 0) goto L91
            androidx.compose.foundation.interaction.FocusInteraction$Focus r3 = new androidx.compose.foundation.interaction.FocusInteraction$Focus
            r3.<init>()
        L91:
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            float r1 = r6.$target
            androidx.compose.foundation.interaction.Interaction r4 = r6.$interaction
            r6.label = r2
            java.lang.Object r7 = androidx.compose.material.ElevationKt.m1664animateElevationrAjV9yQ(r7, r1, r3, r4, r6)
            if (r7 != r0) goto La0
        L9f:
            return r0
        La0:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DefaultButtonElevation$elevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
