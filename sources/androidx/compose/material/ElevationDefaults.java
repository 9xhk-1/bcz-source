package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.unit.Dp;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ElevationDefaults {

    @k
    public static final ElevationDefaults INSTANCE = new ElevationDefaults();

    private ElevationDefaults() {
    }

    @l
    public final AnimationSpec<Dp> incomingAnimationSpecForInteraction(@k Interaction interaction) {
        TweenSpec tweenSpec;
        TweenSpec tweenSpec2;
        TweenSpec tweenSpec3;
        TweenSpec tweenSpec4;
        if (interaction instanceof PressInteraction.Press) {
            tweenSpec4 = ElevationKt.DefaultIncomingSpec;
            return tweenSpec4;
        }
        if (interaction instanceof DragInteraction.Start) {
            tweenSpec3 = ElevationKt.DefaultIncomingSpec;
            return tweenSpec3;
        }
        if (interaction instanceof HoverInteraction.Enter) {
            tweenSpec2 = ElevationKt.DefaultIncomingSpec;
            return tweenSpec2;
        }
        if (!(interaction instanceof FocusInteraction.Focus)) {
            return null;
        }
        tweenSpec = ElevationKt.DefaultIncomingSpec;
        return tweenSpec;
    }

    @l
    public final AnimationSpec<Dp> outgoingAnimationSpecForInteraction(@k Interaction interaction) {
        TweenSpec tweenSpec;
        TweenSpec tweenSpec2;
        TweenSpec tweenSpec3;
        TweenSpec tweenSpec4;
        if (interaction instanceof PressInteraction.Press) {
            tweenSpec4 = ElevationKt.DefaultOutgoingSpec;
            return tweenSpec4;
        }
        if (interaction instanceof DragInteraction.Start) {
            tweenSpec3 = ElevationKt.DefaultOutgoingSpec;
            return tweenSpec3;
        }
        if (interaction instanceof HoverInteraction.Enter) {
            tweenSpec2 = ElevationKt.HoveredOutgoingSpec;
            return tweenSpec2;
        }
        if (!(interaction instanceof FocusInteraction.Focus)) {
            return null;
        }
        tweenSpec = ElevationKt.DefaultOutgoingSpec;
        return tweenSpec;
    }
}
