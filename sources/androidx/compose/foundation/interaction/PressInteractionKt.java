package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import c40.r0;
import j00.c;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPressInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressInteraction.kt\nandroidx/compose/foundation/interaction/PressInteractionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,96:1\n1247#2,6:97\n1247#2,6:103\n*S KotlinDebug\n*F\n+ 1 PressInteraction.kt\nandroidx/compose/foundation/interaction/PressInteractionKt\n*L\n82#1:97,6\n83#1:103,6\n*E\n"})
/* loaded from: classes.dex */
public final class PressInteractionKt {
    @Composable
    @k
    public static final State<Boolean> collectIsPressedAsState(@k InteractionSource interactionSource, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1692965168, i11, -1, "androidx.compose.foundation.interaction.collectIsPressedAsState (PressInteraction.kt:80)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        int i12 = i11 & 14;
        boolean z11 = ((i12 ^ 6) > 4 && composer.changed(interactionSource)) || (i11 & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z11 || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new PressInteractionKt$collectIsPressedAsState$1$1(interactionSource, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(interactionSource, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue2, composer, i12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
