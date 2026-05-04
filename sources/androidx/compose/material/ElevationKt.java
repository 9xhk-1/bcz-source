package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ElevationKt {

    @k
    private static final TweenSpec<Dp> DefaultIncomingSpec = new TweenSpec<>(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    @k
    private static final TweenSpec<Dp> DefaultOutgoingSpec = new TweenSpec<>(150, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    @k
    private static final TweenSpec<Dp> HoveredOutgoingSpec = new TweenSpec<>(120, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    @l
    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m1664animateElevationrAjV9yQ(@k Animatable<Dp, ?> animatable, float f11, @l Interaction interaction, @l Interaction interaction2, @k c<? super g2> cVar) {
        AnimationSpec<Dp> incomingAnimationSpecForInteraction = interaction2 != null ? ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2) : interaction != null ? ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction) : null;
        if (incomingAnimationSpecForInteraction != null) {
            Object animateTo$default = Animatable.animateTo$default(animatable, Dp.m5113boximpl(f11), incomingAnimationSpecForInteraction, null, null, cVar, 12, null);
            return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
        }
        Object snapTo = animatable.snapTo(Dp.m5113boximpl(f11), cVar);
        return snapTo == b.l() ? snapTo : g2.f100423a;
    }

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m1665animateElevationrAjV9yQ$default(Animatable animatable, float f11, Interaction interaction, Interaction interaction2, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interaction = null;
        }
        if ((i11 & 4) != 0) {
            interaction2 = null;
        }
        return m1664animateElevationrAjV9yQ(animatable, f11, interaction, interaction2, cVar);
    }
}
