package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import c40.r0;
import j00.c;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/DefaultFloatingActionButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,398:1\n1247#2,6:399\n1247#2,6:405\n1247#2,6:411\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/DefaultFloatingActionButtonElevation\n*L\n262#1:399,6\n271#1:405,6\n280#1:411,6\n*E\n"})
/* loaded from: classes.dex */
final class DefaultFloatingActionButtonElevation implements FloatingActionButtonElevation {
    private final float defaultElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ DefaultFloatingActionButtonElevation(float f11, float f12, float f13, float f14, v vVar) {
        this(f11, f12, f13, f14);
    }

    @Override // androidx.compose.material.FloatingActionButtonElevation
    @Composable
    @k
    public State<Dp> elevation(@k InteractionSource interactionSource, @l Composer composer, int i11) {
        composer.startReplaceGroup(-478475335);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-478475335, i11, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:259)");
        }
        int i12 = i11 & 14;
        int i13 = i12 ^ 6;
        boolean z11 = (i13 > 4 && composer.changed(interactionSource)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            Object floatingActionButtonElevationAnimatable = new FloatingActionButtonElevationAnimatable(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            composer.updateRememberedValue(floatingActionButtonElevationAnimatable);
            rememberedValue = floatingActionButtonElevationAnimatable;
        }
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable2 = (FloatingActionButtonElevationAnimatable) rememberedValue;
        boolean changedInstance = composer.changedInstance(floatingActionButtonElevationAnimatable2) | ((((i11 & 112) ^ 48) > 32 && composer.changed(this)) || (i11 & 48) == 32);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new DefaultFloatingActionButtonElevation$elevation$1$1(floatingActionButtonElevationAnimatable2, this, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(this, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue2, composer, (i11 >> 3) & 14);
        boolean changedInstance2 = composer.changedInstance(floatingActionButtonElevationAnimatable2) | ((i13 > 4 && composer.changed(interactionSource)) || (i11 & 6) == 4);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new DefaultFloatingActionButtonElevation$elevation$2$1(interactionSource, floatingActionButtonElevationAnimatable2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.LaunchedEffect(interactionSource, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue3, composer, i12);
        State<Dp> asState = floatingActionButtonElevationAnimatable2.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return asState;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultFloatingActionButtonElevation)) {
            return false;
        }
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) obj;
        if (Dp.m5120equalsimpl0(this.defaultElevation, defaultFloatingActionButtonElevation.defaultElevation) && Dp.m5120equalsimpl0(this.pressedElevation, defaultFloatingActionButtonElevation.pressedElevation) && Dp.m5120equalsimpl0(this.hoveredElevation, defaultFloatingActionButtonElevation.hoveredElevation)) {
            return Dp.m5120equalsimpl0(this.focusedElevation, defaultFloatingActionButtonElevation.focusedElevation);
        }
        return false;
    }

    public int hashCode() {
        return (((((Dp.m5121hashCodeimpl(this.defaultElevation) * 31) + Dp.m5121hashCodeimpl(this.pressedElevation)) * 31) + Dp.m5121hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m5121hashCodeimpl(this.focusedElevation);
    }

    private DefaultFloatingActionButtonElevation(float f11, float f12, float f13, float f14) {
        this.defaultElevation = f11;
        this.pressedElevation = f12;
        this.hoveredElevation = f13;
        this.focusedElevation = f14;
    }
}
