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
final class DefaultSliderColors implements SliderColors {
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    public /* synthetic */ DefaultSliderColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, v vVar) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSliderColors.class != obj.getClass()) {
            return false;
        }
        DefaultSliderColors defaultSliderColors = (DefaultSliderColors) obj;
        return Color.m2510equalsimpl0(this.thumbColor, defaultSliderColors.thumbColor) && Color.m2510equalsimpl0(this.disabledThumbColor, defaultSliderColors.disabledThumbColor) && Color.m2510equalsimpl0(this.activeTrackColor, defaultSliderColors.activeTrackColor) && Color.m2510equalsimpl0(this.inactiveTrackColor, defaultSliderColors.inactiveTrackColor) && Color.m2510equalsimpl0(this.disabledActiveTrackColor, defaultSliderColors.disabledActiveTrackColor) && Color.m2510equalsimpl0(this.disabledInactiveTrackColor, defaultSliderColors.disabledInactiveTrackColor) && Color.m2510equalsimpl0(this.activeTickColor, defaultSliderColors.activeTickColor) && Color.m2510equalsimpl0(this.inactiveTickColor, defaultSliderColors.inactiveTickColor) && Color.m2510equalsimpl0(this.disabledActiveTickColor, defaultSliderColors.disabledActiveTickColor) && Color.m2510equalsimpl0(this.disabledInactiveTickColor, defaultSliderColors.disabledInactiveTickColor);
    }

    public int hashCode() {
        return (((((((((((((((((Color.m2516hashCodeimpl(this.thumbColor) * 31) + Color.m2516hashCodeimpl(this.disabledThumbColor)) * 31) + Color.m2516hashCodeimpl(this.activeTrackColor)) * 31) + Color.m2516hashCodeimpl(this.inactiveTrackColor)) * 31) + Color.m2516hashCodeimpl(this.disabledActiveTrackColor)) * 31) + Color.m2516hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + Color.m2516hashCodeimpl(this.activeTickColor)) * 31) + Color.m2516hashCodeimpl(this.inactiveTickColor)) * 31) + Color.m2516hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m2516hashCodeimpl(this.disabledInactiveTickColor);
    }

    @Override // androidx.compose.material.SliderColors
    @Composable
    @k
    public State<Color> thumbColor(boolean z11, @l Composer composer, int i11) {
        composer.startReplaceGroup(-1733795637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1733795637, i11, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1188)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z11 ? this.thumbColor : this.disabledThumbColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    @Composable
    @k
    public State<Color> tickColor(boolean z11, boolean z12, @l Composer composer, int i11) {
        composer.startReplaceGroup(-1491563694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1491563694, i11, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1204)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z11 ? z12 ? this.activeTickColor : this.inactiveTickColor : z12 ? this.disabledActiveTickColor : this.disabledInactiveTickColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    @Composable
    @k
    public State<Color> trackColor(boolean z11, boolean z12, @l Composer composer, int i11) {
        composer.startReplaceGroup(1575395620);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575395620, i11, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1193)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z11 ? z12 ? this.activeTrackColor : this.inactiveTrackColor : z12 ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    private DefaultSliderColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21) {
        this.thumbColor = j11;
        this.disabledThumbColor = j12;
        this.activeTrackColor = j13;
        this.inactiveTrackColor = j14;
        this.disabledActiveTrackColor = j15;
        this.disabledInactiveTrackColor = j16;
        this.activeTickColor = j17;
        this.inactiveTickColor = j18;
        this.disabledActiveTickColor = j19;
        this.disabledInactiveTickColor = j21;
    }
}
