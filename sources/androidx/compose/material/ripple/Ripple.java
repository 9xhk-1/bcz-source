package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@n(message = "Replaced by the new RippleNode implementation")
@u0({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,530:1\n75#2:531\n696#3:532\n1247#4,6:533\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n*L\n192#1:531\n195#1:532\n206#1:533,6\n*E\n"})
/* loaded from: classes.dex */
public abstract class Ripple implements Indication {
    public static final int $stable = 0;
    private final boolean bounded;

    @k
    private final State<Color> color;
    private final float radius;

    public /* synthetic */ Ripple(boolean z11, float f11, State state, v vVar) {
        this(z11, f11, state);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        return this.bounded == ripple.bounded && Dp.m5120equalsimpl0(this.radius, ripple.radius) && g0.g(this.color, ripple.color);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.bounded) * 31) + Dp.m5121hashCodeimpl(this.radius)) * 31) + this.color.hashCode();
    }

    @Override // androidx.compose.foundation.Indication
    @Composable
    @n(message = "Super method is deprecated")
    @k
    public final IndicationInstance rememberUpdatedInstance(@k InteractionSource interactionSource, @l Composer composer, int i11) {
        long mo1868defaultColorWaAFU9c;
        composer.startReplaceGroup(988743187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(988743187, i11, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:190)");
        }
        RippleTheme rippleTheme = (RippleTheme) composer.consume(RippleThemeKt.getLocalRippleTheme());
        if (this.color.getValue().m2519unboximpl() != 16) {
            composer.startReplaceGroup(-303557454);
            composer.endReplaceGroup();
            mo1868defaultColorWaAFU9c = this.color.getValue().m2519unboximpl();
        } else {
            composer.startReplaceGroup(-303499670);
            mo1868defaultColorWaAFU9c = rippleTheme.mo1868defaultColorWaAFU9c(composer, 0);
            composer.endReplaceGroup();
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(mo1868defaultColorWaAFU9c), composer, 0);
        State<RippleAlpha> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0);
        int i12 = i11 & 14;
        RippleIndicationInstance mo1866rememberUpdatedRippleInstance942rkJo = mo1866rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, rememberUpdatedState, rememberUpdatedState2, composer, i12 | ((i11 << 12) & 458752));
        boolean changedInstance = composer.changedInstance(mo1866rememberUpdatedRippleInstance942rkJo) | (((i12 ^ 6) > 4 && composer.changed(interactionSource)) || (i11 & 6) == 4);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Ripple$rememberUpdatedInstance$1$1(interactionSource, mo1866rememberUpdatedRippleInstance942rkJo, null);
            composer.updateRememberedValue(rememberedValue);
        }
        EffectsKt.LaunchedEffect(mo1866rememberUpdatedRippleInstance942rkJo, interactionSource, (p) rememberedValue, composer, (i11 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mo1866rememberUpdatedRippleInstance942rkJo;
    }

    @Composable
    @k
    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo1866rememberUpdatedRippleInstance942rkJo(@k InteractionSource interactionSource, boolean z11, float f11, @k State<Color> state, @k State<RippleAlpha> state2, @l Composer composer, int i11);

    private Ripple(boolean z11, float f11, State<Color> state) {
        this.bounded = z11;
        this.radius = f11;
        this.color = state;
    }
}
