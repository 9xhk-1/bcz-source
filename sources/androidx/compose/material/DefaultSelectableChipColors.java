package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
final class DefaultSelectableChipColors implements SelectableChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconColor;
    private final long leadingIconColor;
    private final long selectedBackgroundColor;
    private final long selectedContentColor;
    private final long selectedLeadingIconColor;

    public /* synthetic */ DefaultSelectableChipColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, v vVar) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19);
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    @k
    public State<Color> backgroundColor(boolean z11, boolean z12, @l Composer composer, int i11) {
        composer.startReplaceGroup(-403836585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-403836585, i11, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:638)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(!z11 ? this.disabledBackgroundColor : !z12 ? this.backgroundColor : this.selectedBackgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    @k
    public State<Color> contentColor(boolean z11, boolean z12, @l Composer composer, int i11) {
        composer.startReplaceGroup(2025240134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025240134, i11, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:649)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(!z11 ? this.disabledContentColor : !z12 ? this.contentColor : this.selectedContentColor), composer, 0);
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
        if (obj == null || DefaultSelectableChipColors.class != obj.getClass()) {
            return false;
        }
        DefaultSelectableChipColors defaultSelectableChipColors = (DefaultSelectableChipColors) obj;
        return Color.m2510equalsimpl0(this.backgroundColor, defaultSelectableChipColors.backgroundColor) && Color.m2510equalsimpl0(this.contentColor, defaultSelectableChipColors.contentColor) && Color.m2510equalsimpl0(this.leadingIconColor, defaultSelectableChipColors.leadingIconColor) && Color.m2510equalsimpl0(this.disabledBackgroundColor, defaultSelectableChipColors.disabledBackgroundColor) && Color.m2510equalsimpl0(this.disabledContentColor, defaultSelectableChipColors.disabledContentColor) && Color.m2510equalsimpl0(this.disabledLeadingIconColor, defaultSelectableChipColors.disabledLeadingIconColor) && Color.m2510equalsimpl0(this.selectedBackgroundColor, defaultSelectableChipColors.selectedBackgroundColor) && Color.m2510equalsimpl0(this.selectedContentColor, defaultSelectableChipColors.selectedContentColor) && Color.m2510equalsimpl0(this.selectedLeadingIconColor, defaultSelectableChipColors.selectedLeadingIconColor);
    }

    public int hashCode() {
        return (((((((((((((((Color.m2516hashCodeimpl(this.backgroundColor) * 31) + Color.m2516hashCodeimpl(this.contentColor)) * 31) + Color.m2516hashCodeimpl(this.leadingIconColor)) * 31) + Color.m2516hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m2516hashCodeimpl(this.disabledContentColor)) * 31) + Color.m2516hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m2516hashCodeimpl(this.selectedBackgroundColor)) * 31) + Color.m2516hashCodeimpl(this.selectedContentColor)) * 31) + Color.m2516hashCodeimpl(this.selectedLeadingIconColor);
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    @k
    public State<Color> leadingIconColor(boolean z11, boolean z12, @l Composer composer, int i11) {
        composer.startReplaceGroup(189838188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(189838188, i11, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:660)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(!z11 ? this.disabledLeadingIconColor : !z12 ? this.leadingIconColor : this.selectedLeadingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    private DefaultSelectableChipColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.backgroundColor = j11;
        this.contentColor = j12;
        this.leadingIconColor = j13;
        this.disabledBackgroundColor = j14;
        this.disabledContentColor = j15;
        this.disabledLeadingIconColor = j16;
        this.selectedBackgroundColor = j17;
        this.selectedContentColor = j18;
        this.selectedLeadingIconColor = j19;
    }
}
