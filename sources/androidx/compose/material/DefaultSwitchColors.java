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
/* loaded from: classes.dex */
final class DefaultSwitchColors implements SwitchColors {
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    public /* synthetic */ DefaultSwitchColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, v vVar) {
        this(j11, j12, j13, j14, j15, j16, j17, j18);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSwitchColors.class != obj.getClass()) {
            return false;
        }
        DefaultSwitchColors defaultSwitchColors = (DefaultSwitchColors) obj;
        return Color.m2510equalsimpl0(this.checkedThumbColor, defaultSwitchColors.checkedThumbColor) && Color.m2510equalsimpl0(this.checkedTrackColor, defaultSwitchColors.checkedTrackColor) && Color.m2510equalsimpl0(this.uncheckedThumbColor, defaultSwitchColors.uncheckedThumbColor) && Color.m2510equalsimpl0(this.uncheckedTrackColor, defaultSwitchColors.uncheckedTrackColor) && Color.m2510equalsimpl0(this.disabledCheckedThumbColor, defaultSwitchColors.disabledCheckedThumbColor) && Color.m2510equalsimpl0(this.disabledCheckedTrackColor, defaultSwitchColors.disabledCheckedTrackColor) && Color.m2510equalsimpl0(this.disabledUncheckedThumbColor, defaultSwitchColors.disabledUncheckedThumbColor) && Color.m2510equalsimpl0(this.disabledUncheckedTrackColor, defaultSwitchColors.disabledUncheckedTrackColor);
    }

    public int hashCode() {
        return (((((((((((((Color.m2516hashCodeimpl(this.checkedThumbColor) * 31) + Color.m2516hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m2516hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m2516hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m2516hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m2516hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m2516hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m2516hashCodeimpl(this.disabledUncheckedTrackColor);
    }

    @Override // androidx.compose.material.SwitchColors
    @Composable
    @k
    public State<Color> thumbColor(boolean z11, boolean z12, @l Composer composer, int i11) {
        composer.startReplaceGroup(-66424183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-66424183, i11, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:368)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z11 ? z12 ? this.checkedThumbColor : this.uncheckedThumbColor : z12 ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SwitchColors
    @Composable
    @k
    public State<Color> trackColor(boolean z11, boolean z12, @l Composer composer, int i11) {
        composer.startReplaceGroup(-1176343362);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1176343362, i11, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:379)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z11 ? z12 ? this.checkedTrackColor : this.uncheckedTrackColor : z12 ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    private DefaultSwitchColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.checkedThumbColor = j11;
        this.checkedTrackColor = j12;
        this.uncheckedThumbColor = j13;
        this.uncheckedTrackColor = j14;
        this.disabledCheckedThumbColor = j15;
        this.disabledCheckedTrackColor = j16;
        this.disabledUncheckedThumbColor = j17;
        this.disabledUncheckedTrackColor = j18;
    }
}
