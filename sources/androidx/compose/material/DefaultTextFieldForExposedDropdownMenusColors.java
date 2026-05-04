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
@u0({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,671:1\n85#2:672\n85#2:673\n85#2:674\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors\n*L\n533#1:672\n551#1:673\n583#1:674\n*E\n"})
/* loaded from: classes.dex */
final class DefaultTextFieldForExposedDropdownMenusColors implements TextFieldColors {
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
    private final long focusedTrailingIconColor;
    private final long leadingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final long trailingIconColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;

    public /* synthetic */ DefaultTextFieldForExposedDropdownMenusColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34, v vVar) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, j24, j25, j26, j27, j28, j29, j31, j32, j33, j34);
    }

    private static final boolean indicatorColor$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean labelColor$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean trailingIconColor$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> backgroundColor(boolean z11, @l Composer composer, int i11) {
        composer.startReplaceGroup(-28962788);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-28962788, i11, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.backgroundColor (ExposedDropdownMenu.kt:567)");
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
        composer.startReplaceGroup(-930693132);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-930693132, i11, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.cursorColor (ExposedDropdownMenu.kt:600)");
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
        if (obj == null || DefaultTextFieldForExposedDropdownMenusColors.class != obj.getClass()) {
            return false;
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = (DefaultTextFieldForExposedDropdownMenusColors) obj;
        return Color.m2510equalsimpl0(this.textColor, defaultTextFieldForExposedDropdownMenusColors.textColor) && Color.m2510equalsimpl0(this.disabledTextColor, defaultTextFieldForExposedDropdownMenusColors.disabledTextColor) && Color.m2510equalsimpl0(this.cursorColor, defaultTextFieldForExposedDropdownMenusColors.cursorColor) && Color.m2510equalsimpl0(this.errorCursorColor, defaultTextFieldForExposedDropdownMenusColors.errorCursorColor) && Color.m2510equalsimpl0(this.focusedIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.focusedIndicatorColor) && Color.m2510equalsimpl0(this.unfocusedIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.unfocusedIndicatorColor) && Color.m2510equalsimpl0(this.errorIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.errorIndicatorColor) && Color.m2510equalsimpl0(this.disabledIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.disabledIndicatorColor) && Color.m2510equalsimpl0(this.leadingIconColor, defaultTextFieldForExposedDropdownMenusColors.leadingIconColor) && Color.m2510equalsimpl0(this.disabledLeadingIconColor, defaultTextFieldForExposedDropdownMenusColors.disabledLeadingIconColor) && Color.m2510equalsimpl0(this.errorLeadingIconColor, defaultTextFieldForExposedDropdownMenusColors.errorLeadingIconColor) && Color.m2510equalsimpl0(this.trailingIconColor, defaultTextFieldForExposedDropdownMenusColors.trailingIconColor) && Color.m2510equalsimpl0(this.focusedTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.focusedTrailingIconColor) && Color.m2510equalsimpl0(this.disabledTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.disabledTrailingIconColor) && Color.m2510equalsimpl0(this.errorTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.errorTrailingIconColor) && Color.m2510equalsimpl0(this.backgroundColor, defaultTextFieldForExposedDropdownMenusColors.backgroundColor) && Color.m2510equalsimpl0(this.focusedLabelColor, defaultTextFieldForExposedDropdownMenusColors.focusedLabelColor) && Color.m2510equalsimpl0(this.unfocusedLabelColor, defaultTextFieldForExposedDropdownMenusColors.unfocusedLabelColor) && Color.m2510equalsimpl0(this.disabledLabelColor, defaultTextFieldForExposedDropdownMenusColors.disabledLabelColor) && Color.m2510equalsimpl0(this.errorLabelColor, defaultTextFieldForExposedDropdownMenusColors.errorLabelColor) && Color.m2510equalsimpl0(this.placeholderColor, defaultTextFieldForExposedDropdownMenusColors.placeholderColor) && Color.m2510equalsimpl0(this.disabledPlaceholderColor, defaultTextFieldForExposedDropdownMenusColors.disabledPlaceholderColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.m2516hashCodeimpl(this.textColor) * 31) + Color.m2516hashCodeimpl(this.disabledTextColor)) * 31) + Color.m2516hashCodeimpl(this.cursorColor)) * 31) + Color.m2516hashCodeimpl(this.errorCursorColor)) * 31) + Color.m2516hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m2516hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m2516hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m2516hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m2516hashCodeimpl(this.leadingIconColor)) * 31) + Color.m2516hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m2516hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m2516hashCodeimpl(this.trailingIconColor)) * 31) + Color.m2516hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m2516hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m2516hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m2516hashCodeimpl(this.backgroundColor)) * 31) + Color.m2516hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m2516hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m2516hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m2516hashCodeimpl(this.errorLabelColor)) * 31) + Color.m2516hashCodeimpl(this.placeholderColor)) * 31) + Color.m2516hashCodeimpl(this.disabledPlaceholderColor);
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> indicatorColor(boolean z11, boolean z12, @k InteractionSource interactionSource, @l Composer composer, int i11) {
        Composer composer2;
        State<Color> rememberUpdatedState;
        composer.startReplaceGroup(476110356);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(476110356, i11, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.indicatorColor (ExposedDropdownMenu.kt:549)");
        }
        long j11 = !z11 ? this.disabledIndicatorColor : z12 ? this.errorIndicatorColor : indicatorColor$lambda$1(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i11 >> 6) & 14)) ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        if (z11) {
            composer.startReplaceGroup(-889472281);
            composer2 = composer;
            rememberUpdatedState = SingleValueAnimationKt.m113animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(-889369423);
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
        composer.startReplaceGroup(-1749156593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749156593, i11, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.labelColor (ExposedDropdownMenu.kt:581)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(!z11 ? this.disabledLabelColor : z12 ? this.errorLabelColor : labelColor$lambda$2(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i11 >> 6) & 14)) ? this.focusedLabelColor : this.unfocusedLabelColor), composer, 0);
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
        composer.startReplaceGroup(-776179197);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-776179197, i11, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.leadingIconColor (ExposedDropdownMenu.kt:504)");
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
        composer.startReplaceGroup(1742462291);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1742462291, i11, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.placeholderColor (ExposedDropdownMenu.kt:572)");
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
        composer.startReplaceGroup(394526077);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394526077, i11, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.textColor (ExposedDropdownMenu.kt:595)");
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
        composer.startReplaceGroup(1665901393);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1665901393, i11, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:516)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(!z11 ? this.disabledTrailingIconColor : z12 ? this.errorTrailingIconColor : this.trailingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    private DefaultTextFieldForExposedDropdownMenusColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34) {
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
        this.focusedTrailingIconColor = j24;
        this.disabledTrailingIconColor = j25;
        this.errorTrailingIconColor = j26;
        this.backgroundColor = j27;
        this.focusedLabelColor = j28;
        this.unfocusedLabelColor = j29;
        this.disabledLabelColor = j31;
        this.errorLabelColor = j32;
        this.placeholderColor = j33;
        this.disabledPlaceholderColor = j34;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @k
    public State<Color> trailingIconColor(boolean z11, boolean z12, @k InteractionSource interactionSource, @l Composer composer, int i11) {
        long j11;
        composer.startReplaceGroup(79259602);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(79259602, i11, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:531)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i11 >> 6) & 14);
        if (!z11) {
            j11 = this.disabledTrailingIconColor;
        } else if (z12) {
            j11 = this.errorTrailingIconColor;
        } else {
            j11 = trailingIconColor$lambda$0(collectIsFocusedAsState) ? this.focusedTrailingIconColor : this.trailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(j11), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }
}
