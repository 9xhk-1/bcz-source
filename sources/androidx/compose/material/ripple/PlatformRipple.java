package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@n(message = "Replaced by the new RippleNode implementation")
@u0({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,362:1\n75#2:363\n1247#3,6:364\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n*L\n86#1:363\n87#1:364,6\n*E\n"})
/* loaded from: classes.dex */
public final class PlatformRipple extends Ripple {
    public static final int $stable = 0;

    public /* synthetic */ PlatformRipple(boolean z11, float f11, State state, v vVar) {
        this(z11, f11, state);
    }

    @Override // androidx.compose.material.ripple.Ripple
    @Composable
    @k
    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public RippleIndicationInstance mo1866rememberUpdatedRippleInstance942rkJo(@k InteractionSource interactionSource, boolean z11, float f11, @k State<Color> state, @k State<RippleAlpha> state2, @l Composer composer, int i11) {
        ViewGroup findNearestViewGroup;
        composer.startReplaceGroup(331259447);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(331259447, i11, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:84)");
        }
        findNearestViewGroup = Ripple_androidKt.findNearestViewGroup((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        boolean changed = ((((i11 & 14) ^ 6) > 4 && composer.changed(interactionSource)) || (i11 & 6) == 4) | ((((458752 & i11) ^ 196608) > 131072 && composer.changed(this)) || (i11 & 196608) == 131072) | composer.changed(findNearestViewGroup);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            Object androidRippleIndicationInstance = new AndroidRippleIndicationInstance(z11, f11, state, state2, findNearestViewGroup, null);
            composer.updateRememberedValue(androidRippleIndicationInstance);
            rememberedValue = androidRippleIndicationInstance;
        }
        AndroidRippleIndicationInstance androidRippleIndicationInstance2 = (AndroidRippleIndicationInstance) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return androidRippleIndicationInstance2;
    }

    private PlatformRipple(boolean z11, float f11, State<Color> state) {
        super(z11, f11, state, null);
    }
}
