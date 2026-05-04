package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@n(message = "Replaced by the new RippleNode implementation")
@u0({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRipple\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,173:1\n1247#2,6:174\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRipple\n*L\n58#1:174,6\n*E\n"})
/* loaded from: classes.dex */
public final class CommonRipple extends Ripple {
    public static final int $stable = 0;

    public /* synthetic */ CommonRipple(boolean z11, float f11, State state, v vVar) {
        this(z11, f11, state);
    }

    @Override // androidx.compose.material.ripple.Ripple
    @Composable
    @k
    /* renamed from: rememberUpdatedRippleInstance-942rkJo, reason: not valid java name */
    public RippleIndicationInstance mo1866rememberUpdatedRippleInstance942rkJo(@k InteractionSource interactionSource, boolean z11, float f11, @k State<Color> state, @k State<RippleAlpha> state2, @l Composer composer, int i11) {
        composer.startReplaceGroup(-1768051227);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1768051227, i11, -1, "androidx.compose.material.ripple.CommonRipple.rememberUpdatedRippleInstance (CommonRipple.kt:56)");
        }
        boolean z12 = ((((i11 & 14) ^ 6) > 4 && composer.changed(interactionSource)) || (i11 & 6) == 4) | ((((458752 & i11) ^ 196608) > 131072 && composer.changed(this)) || (i11 & 196608) == 131072);
        Object rememberedValue = composer.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            CommonRippleIndicationInstance commonRippleIndicationInstance = new CommonRippleIndicationInstance(z11, f11, state, state2, null);
            composer.updateRememberedValue(commonRippleIndicationInstance);
            rememberedValue = commonRippleIndicationInstance;
        }
        CommonRippleIndicationInstance commonRippleIndicationInstance2 = (CommonRippleIndicationInstance) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return commonRippleIndicationInstance2;
    }

    private CommonRipple(boolean z11, float f11, State<Color> state) {
        super(z11, f11, state, null);
    }
}
