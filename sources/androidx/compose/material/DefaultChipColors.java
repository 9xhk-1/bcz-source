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
final class DefaultChipColors implements ChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconContentColor;
    private final long leadingIconContentColor;

    public /* synthetic */ DefaultChipColors(long j11, long j12, long j13, long j14, long j15, long j16, v vVar) {
        this(j11, j12, j13, j14, j15, j16);
    }

    @Override // androidx.compose.material.ChipColors
    @Composable
    @k
    public State<Color> backgroundColor(boolean z11, @l Composer composer, int i11) {
        composer.startReplaceGroup(-1593588247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1593588247, i11, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:578)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z11 ? this.backgroundColor : this.disabledBackgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.ChipColors
    @Composable
    @k
    public State<Color> contentColor(boolean z11, @l Composer composer, int i11) {
        composer.startReplaceGroup(483145880);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(483145880, i11, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:583)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z11 ? this.contentColor : this.disabledContentColor), composer, 0);
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
        if (obj == null || DefaultChipColors.class != obj.getClass()) {
            return false;
        }
        DefaultChipColors defaultChipColors = (DefaultChipColors) obj;
        return Color.m2510equalsimpl0(this.backgroundColor, defaultChipColors.backgroundColor) && Color.m2510equalsimpl0(this.contentColor, defaultChipColors.contentColor) && Color.m2510equalsimpl0(this.leadingIconContentColor, defaultChipColors.leadingIconContentColor) && Color.m2510equalsimpl0(this.disabledBackgroundColor, defaultChipColors.disabledBackgroundColor) && Color.m2510equalsimpl0(this.disabledContentColor, defaultChipColors.disabledContentColor) && Color.m2510equalsimpl0(this.disabledLeadingIconContentColor, defaultChipColors.disabledLeadingIconContentColor);
    }

    public int hashCode() {
        return (((((((((Color.m2516hashCodeimpl(this.backgroundColor) * 31) + Color.m2516hashCodeimpl(this.contentColor)) * 31) + Color.m2516hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m2516hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m2516hashCodeimpl(this.disabledContentColor)) * 31) + Color.m2516hashCodeimpl(this.disabledLeadingIconContentColor);
    }

    @Override // androidx.compose.material.ChipColors
    @Composable
    @k
    public State<Color> leadingIconContentColor(boolean z11, @l Composer composer, int i11) {
        composer.startReplaceGroup(1955749013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1955749013, i11, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:588)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z11 ? this.leadingIconContentColor : this.disabledLeadingIconContentColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    private DefaultChipColors(long j11, long j12, long j13, long j14, long j15, long j16) {
        this.backgroundColor = j11;
        this.contentColor = j12;
        this.leadingIconContentColor = j13;
        this.disabledBackgroundColor = j14;
        this.disabledContentColor = j15;
        this.disabledLeadingIconContentColor = j16;
    }
}
