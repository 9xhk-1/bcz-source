package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,985:1\n85#2:986\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n*L\n972#1:986\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldDefaultsKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final State<BorderStroke> m1834animateBorderStrokeAsStateNuRrP5Q(boolean z11, boolean z12, InteractionSource interactionSource, TextFieldColors textFieldColors, float f11, float f12, Composer composer, int i11) {
        State<Dp> rememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1097899920, i11, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:970)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i11 >> 6) & 14);
        State<Color> indicatorColor = textFieldColors.indicatorColor(z11, z12, interactionSource, composer, i11 & 8190);
        float f13 = animateBorderStrokeAsState_NuRrP5Q$lambda$0(collectIsFocusedAsState) ? f11 : f12;
        if (z11) {
            composer.startReplaceGroup(773088894);
            rememberUpdatedState = AnimateAsStateKt.m125animateDpAsStateAjpBEmI(f13, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(773193116);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Dp.m5113boximpl(f12), composer, (i11 >> 15) & 14);
            composer.endReplaceGroup();
        }
        State<BorderStroke> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new BorderStroke(rememberUpdatedState.getValue().m5129unboximpl(), new SolidColor(indicatorColor.getValue().m2519unboximpl(), null), null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState2;
    }

    private static final boolean animateBorderStrokeAsState_NuRrP5Q$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
