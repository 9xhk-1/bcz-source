package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/DefaultTextFieldColors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,985:1\n85#2:986\n85#2:987\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/DefaultTextFieldColors\n*L\n852#1:986\n884#1:987\n*E\n"})
/* loaded from: classes.dex */
final class DefaultTextFieldColors implements TextFieldColors {
    private final long backgroundColor;
    private final long cursorColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorTrailingIconColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long leadingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final long trailingIconColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;

    public /* synthetic */ DefaultTextFieldColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, v vVar) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, j24, j25, j26, j27, j28, j29, j31, j32, j33);
    }

    private static final boolean indicatorColor$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean labelColor$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> backgroundColor(boolean z11, @l Composer composer, int i11) {
        composer.startReplaceGroup(-1423938813);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1423938813, i11, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:868)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(this.backgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> cursorColor(boolean z11, @l Composer composer, int i11) {
        composer.startReplaceGroup(-1446422485);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1446422485, i11, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:901)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z11 ? this.errorCursorColor : this.cursorColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultTextFieldColors.class != obj.getClass()) {
            return false;
        }
        DefaultTextFieldColors defaultTextFieldColors = (DefaultTextFieldColors) obj;
        return Color.m2510equalsimpl0(this.textColor, defaultTextFieldColors.textColor) && Color.m2510equalsimpl0(this.disabledTextColor, defaultTextFieldColors.disabledTextColor) && Color.m2510equalsimpl0(this.cursorColor, defaultTextFieldColors.cursorColor) && Color.m2510equalsimpl0(this.errorCursorColor, defaultTextFieldColors.errorCursorColor) && Color.m2510equalsimpl0(this.focusedIndicatorColor, defaultTextFieldColors.focusedIndicatorColor) && Color.m2510equalsimpl0(this.unfocusedIndicatorColor, defaultTextFieldColors.unfocusedIndicatorColor) && Color.m2510equalsimpl0(this.errorIndicatorColor, defaultTextFieldColors.errorIndicatorColor) && Color.m2510equalsimpl0(this.disabledIndicatorColor, defaultTextFieldColors.disabledIndicatorColor) && Color.m2510equalsimpl0(this.leadingIconColor, defaultTextFieldColors.leadingIconColor) && Color.m2510equalsimpl0(this.disabledLeadingIconColor, defaultTextFieldColors.disabledLeadingIconColor) && Color.m2510equalsimpl0(this.errorLeadingIconColor, defaultTextFieldColors.errorLeadingIconColor) && Color.m2510equalsimpl0(this.trailingIconColor, defaultTextFieldColors.trailingIconColor) && Color.m2510equalsimpl0(this.disabledTrailingIconColor, defaultTextFieldColors.disabledTrailingIconColor) && Color.m2510equalsimpl0(this.errorTrailingIconColor, defaultTextFieldColors.errorTrailingIconColor) && Color.m2510equalsimpl0(this.backgroundColor, defaultTextFieldColors.backgroundColor) && Color.m2510equalsimpl0(this.focusedLabelColor, defaultTextFieldColors.focusedLabelColor) && Color.m2510equalsimpl0(this.unfocusedLabelColor, defaultTextFieldColors.unfocusedLabelColor) && Color.m2510equalsimpl0(this.disabledLabelColor, defaultTextFieldColors.disabledLabelColor) && Color.m2510equalsimpl0(this.errorLabelColor, defaultTextFieldColors.errorLabelColor) && Color.m2510equalsimpl0(this.placeholderColor, defaultTextFieldColors.placeholderColor) && Color.m2510equalsimpl0(this.disabledPlaceholderColor, defaultTextFieldColors.disabledPlaceholderColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Color.m2516hashCodeimpl(this.textColor) * 31) + Color.m2516hashCodeimpl(this.disabledTextColor)) * 31) + Color.m2516hashCodeimpl(this.cursorColor)) * 31) + Color.m2516hashCodeimpl(this.errorCursorColor)) * 31) + Color.m2516hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m2516hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m2516hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m2516hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m2516hashCodeimpl(this.leadingIconColor)) * 31) + Color.m2516hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m2516hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m2516hashCodeimpl(this.trailingIconColor)) * 31) + Color.m2516hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m2516hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m2516hashCodeimpl(this.backgroundColor)) * 31) + Color.m2516hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m2516hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m2516hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m2516hashCodeimpl(this.errorLabelColor)) * 31) + Color.m2516hashCodeimpl(this.placeholderColor)) * 31) + Color.m2516hashCodeimpl(this.disabledPlaceholderColor);
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> indicatorColor(boolean z11, boolean z12, @k InteractionSource interactionSource, @l Composer composer, int i11) {
        Composer composer2;
        State<Color> rememberUpdatedState;
        composer.startReplaceGroup(998675979);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(998675979, i11, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:850)");
        }
        long j11 = !z11 ? this.disabledIndicatorColor : z12 ? this.errorIndicatorColor : indicatorColor$lambda$0(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i11 >> 6) & 14)) ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        if (z11) {
            composer.startReplaceGroup(1614254271);
            composer2 = composer;
            rememberUpdatedState = SingleValueAnimationKt.m113animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(1614357129);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(j11), composer2, 0);
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> labelColor(boolean z11, boolean z12, @k InteractionSource interactionSource, @l Composer composer, int i11) {
        composer.startReplaceGroup(727091888);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(727091888, i11, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:882)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(!z11 ? this.disabledLabelColor : z12 ? this.errorLabelColor : labelColor$lambda$1(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i11 >> 6) & 14)) ? this.focusedLabelColor : this.unfocusedLabelColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> leadingIconColor(boolean z11, boolean z12, @l Composer composer, int i11) {
        composer.startReplaceGroup(1016171324);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016171324, i11, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:793)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(!z11 ? this.disabledLeadingIconColor : z12 ? this.errorLeadingIconColor : this.leadingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> placeholderColor(boolean z11, @l Composer composer, int i11) {
        composer.startReplaceGroup(264799724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(264799724, i11, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:873)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z11 ? this.placeholderColor : this.disabledPlaceholderColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> textColor(boolean z11, @l Composer composer, int i11) {
        composer.startReplaceGroup(9804418);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(9804418, i11, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:896)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z11 ? this.textColor : this.disabledTextColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> trailingIconColor(boolean z11, boolean z12, @l Composer composer, int i11) {
        composer.startReplaceGroup(225259054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(225259054, i11, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:820)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(!z11 ? this.disabledTrailingIconColor : z12 ? this.errorTrailingIconColor : this.trailingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    private DefaultTextFieldColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33) {
        this.textColor = j11;
        this.disabledTextColor = j12;
        this.cursorColor = j13;
        this.errorCursorColor = j14;
        this.focusedIndicatorColor = j15;
        this.unfocusedIndicatorColor = j16;
        this.errorIndicatorColor = j17;
        this.disabledIndicatorColor = j18;
        this.leadingIconColor = j19;
        this.disabledLeadingIconColor = j21;
        this.errorLeadingIconColor = j22;
        this.trailingIconColor = j23;
        this.disabledTrailingIconColor = j24;
        this.errorTrailingIconColor = j25;
        this.backgroundColor = j26;
        this.focusedLabelColor = j27;
        this.unfocusedLabelColor = j28;
        this.disabledLabelColor = j29;
        this.errorLabelColor = j31;
        this.placeholderColor = j32;
        this.disabledPlaceholderColor = j33;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> leadingIconColor(boolean z11, boolean z12, @k InteractionSource interactionSource, @l Composer composer, int i11) {
        long j11;
        composer.startReplaceGroup(-1519634405);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519634405, i11, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:808)");
        }
        if (!z11) {
            j11 = this.disabledLeadingIconColor;
        } else if (z12) {
            j11 = this.errorLeadingIconColor;
        } else {
            j11 = this.leadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(j11), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> trailingIconColor(boolean z11, boolean z12, @k InteractionSource interactionSource, @l Composer composer, int i11) {
        long j11;
        composer.startReplaceGroup(1383318157);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1383318157, i11, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:835)");
        }
        if (!z11) {
            j11 = this.disabledTrailingIconColor;
        } else if (z12) {
            j11 = this.errorTrailingIconColor;
        } else {
            j11 = this.trailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(j11), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }
}
