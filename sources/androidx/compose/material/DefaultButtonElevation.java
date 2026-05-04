package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
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
@u0({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/DefaultButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,616:1\n1247#2,6:617\n1247#2,6:623\n1247#2,6:629\n1247#2,6:635\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/DefaultButtonElevation\n*L\n505#1:617,6\n506#1:623,6\n548#1:629,6\n550#1:635,6\n*E\n"})
/* loaded from: classes.dex */
final class DefaultButtonElevation implements ButtonElevation {
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ DefaultButtonElevation(float f11, float f12, float f13, float f14, float f15, v vVar) {
        this(f11, f12, f13, f14, f15);
    }

    @Override // androidx.compose.material.ButtonElevation
    @Composable
    @k
    public State<Dp> elevation(boolean z11, @k InteractionSource interactionSource, @l Composer composer, int i11) {
        Animatable animatable;
        composer.startReplaceGroup(-1588756907);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1588756907, i11, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:503)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(rememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
        boolean z12 = true;
        boolean z13 = (((i11 & 112) ^ 48) > 32 && composer.changed(interactionSource)) || (i11 & 48) == 32;
        Object rememberedValue2 = composer.rememberedValue();
        if (z13 || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new DefaultButtonElevation$elevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(interactionSource, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue2, composer, (i11 >> 3) & 14);
        Interaction interaction = (Interaction) a00.r0.A3(snapshotStateList);
        float f11 = !z11 ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            Object animatable2 = new Animatable(Dp.m5113boximpl(f11), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(animatable2);
            rememberedValue3 = animatable2;
        }
        Animatable animatable3 = (Animatable) rememberedValue3;
        Dp m5113boximpl = Dp.m5113boximpl(f11);
        boolean changedInstance = composer.changedInstance(animatable3) | composer.changed(f11) | ((((i11 & 14) ^ 6) > 4 && composer.changed(z11)) || (i11 & 6) == 4);
        if ((((i11 & 896) ^ 384) <= 256 || !composer.changed(this)) && (i11 & 384) != 256) {
            z12 = false;
        }
        boolean changedInstance2 = changedInstance | z12 | composer.changedInstance(interaction);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
            animatable = animatable3;
            Object defaultButtonElevation$elevation$2$1 = new DefaultButtonElevation$elevation$2$1(animatable, f11, z11, this, interaction, null);
            composer.updateRememberedValue(defaultButtonElevation$elevation$2$1);
            rememberedValue4 = defaultButtonElevation$elevation$2$1;
        } else {
            animatable = animatable3;
        }
        EffectsKt.LaunchedEffect(m5113boximpl, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue4, composer, 0);
        State<Dp> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return asState;
    }

    private DefaultButtonElevation(float f11, float f12, float f13, float f14, float f15) {
        this.defaultElevation = f11;
        this.pressedElevation = f12;
        this.disabledElevation = f13;
        this.hoveredElevation = f14;
        this.focusedElevation = f15;
    }
}
