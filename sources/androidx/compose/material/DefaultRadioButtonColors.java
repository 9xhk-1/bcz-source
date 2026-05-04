package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
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
final class DefaultRadioButtonColors implements RadioButtonColors {
    private final long disabledColor;
    private final long selectedColor;
    private final long unselectedColor;

    public /* synthetic */ DefaultRadioButtonColors(long j11, long j12, long j13, v vVar) {
        this(j11, j12, j13);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultRadioButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) obj;
        return Color.m2510equalsimpl0(this.selectedColor, defaultRadioButtonColors.selectedColor) && Color.m2510equalsimpl0(this.unselectedColor, defaultRadioButtonColors.unselectedColor) && Color.m2510equalsimpl0(this.disabledColor, defaultRadioButtonColors.disabledColor);
    }

    public int hashCode() {
        return (((Color.m2516hashCodeimpl(this.selectedColor) * 31) + Color.m2516hashCodeimpl(this.unselectedColor)) * 31) + Color.m2516hashCodeimpl(this.disabledColor);
    }

    @Override // androidx.compose.material.RadioButtonColors
    @Composable
    @k
    public State<Color> radioColor(boolean z11, boolean z12, @l Composer composer, int i11) {
        Composer composer2;
        State<Color> rememberUpdatedState;
        composer.startReplaceGroup(1243421834);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1243421834, i11, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:177)");
        }
        long j11 = !z11 ? this.disabledColor : !z12 ? this.unselectedColor : this.selectedColor;
        if (z11) {
            composer.startReplaceGroup(1872435883);
            composer2 = composer;
            rememberUpdatedState = SingleValueAnimationKt.m113animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(1872538586);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(j11), composer2, 0);
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return rememberUpdatedState;
    }

    private DefaultRadioButtonColors(long j11, long j12, long j13) {
        this.selectedColor = j11;
        this.unselectedColor = j12;
        this.disabledColor = j13;
    }
}
