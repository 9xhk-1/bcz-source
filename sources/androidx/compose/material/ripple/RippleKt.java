package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,530:1\n1247#2,6:531\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n*L\n147#1:531,6\n*E\n"})
/* loaded from: classes.dex */
public final class RippleKt {

    @k
    private static final TweenSpec<Float> DefaultTweenSpec = new TweenSpec<>(15, 0, EasingKt.getLinearEasing(), 2, null);

    @k
    /* renamed from: createRippleModifierNode-TDGSqEk, reason: not valid java name */
    public static final DelegatableNode m1875createRippleModifierNodeTDGSqEk(@k InteractionSource interactionSource, boolean z11, float f11, @k ColorProducer colorProducer, @k x00.a<RippleAlpha> aVar) {
        return Ripple_androidKt.m1881createPlatformRippleNodeTDGSqEk(interactionSource, z11, f11, colorProducer, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec<Float> incomingStateLayerAnimationSpecFor(Interaction interaction) {
        return interaction instanceof HoverInteraction.Enter ? DefaultTweenSpec : interaction instanceof FocusInteraction.Focus ? new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null) : interaction instanceof DragInteraction.Start ? new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null) : DefaultTweenSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec<Float> outgoingStateLayerAnimationSpecFor(Interaction interaction) {
        return interaction instanceof HoverInteraction.Enter ? DefaultTweenSpec : interaction instanceof FocusInteraction.Focus ? DefaultTweenSpec : interaction instanceof DragInteraction.Start ? new TweenSpec(150, 0, EasingKt.getLinearEasing(), 2, null) : DefaultTweenSpec;
    }

    @Composable
    @n(level = DeprecationLevel.ERROR, message = "rememberRipple has been deprecated - it returns an old Indication implementation that is not compatible with the new Indication APIs that provide notable performance improvements. Instead, use the new ripple APIs provided by design system libraries, such as material and material3. If you are implementing your own design system library, use createRippleNode to create your own custom ripple implementation that queries your own theme values. For a migration guide and background information, please visit developer.android.com")
    @k
    /* renamed from: rememberRipple-9IZ8Weo, reason: not valid java name */
    public static final Indication m1876rememberRipple9IZ8Weo(boolean z11, float f11, long j11, @l Composer composer, int i11, int i12) {
        boolean z12 = true;
        if ((i12 & 1) != 0) {
            z11 = true;
        }
        if ((i12 & 2) != 0) {
            f11 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i12 & 4) != 0) {
            j11 = Color.Companion.m2545getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1635163520, i11, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:144)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(j11), composer, (i11 >> 6) & 14);
        boolean z13 = (((i11 & 14) ^ 6) > 4 && composer.changed(z11)) || (i11 & 6) == 4;
        if ((((i11 & 112) ^ 48) <= 32 || !composer.changed(f11)) && (i11 & 48) != 32) {
            z12 = false;
        }
        boolean z14 = z13 | z12;
        Object rememberedValue = composer.rememberedValue();
        if (z14 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PlatformRipple(z11, f11, rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue);
        }
        PlatformRipple platformRipple = (PlatformRipple) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return platformRipple;
    }
}
