package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
final class DefaultCheckboxColors implements CheckboxColors {
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ DefaultCheckboxColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, v vVar) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22);
    }

    @Override // androidx.compose.material.CheckboxColors
    @Composable
    @k
    public State<Color> borderColor(boolean z11, @k ToggleableState toggleableState, @l Composer composer, int i11) {
        long j11;
        Composer composer2;
        State<Color> rememberUpdatedState;
        composer.startReplaceGroup(-1568341342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1568341342, i11, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:447)");
        }
        if (z11) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i12 == 1 || i12 == 2) {
                j11 = this.checkedBorderColor;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j11 = this.uncheckedBorderColor;
            }
        } else {
            int i13 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    j11 = this.disabledIndeterminateBorderColor;
                } else if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            j11 = this.disabledBorderColor;
        }
        long j12 = j11;
        if (z11) {
            composer.startReplaceGroup(-840498473);
            composer2 = composer;
            rememberUpdatedState = SingleValueAnimationKt.m113animateColorAsStateeuL9pac(j12, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer2, 0, 12);
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(-840317929);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(j12), composer2, 0);
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    @Composable
    @k
    public State<Color> boxColor(boolean z11, @k ToggleableState toggleableState, @l Composer composer, int i11) {
        long j11;
        Composer composer2;
        State<Color> rememberUpdatedState;
        composer.startReplaceGroup(840901029);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(840901029, i11, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:420)");
        }
        if (z11) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i12 == 1 || i12 == 2) {
                j11 = this.checkedBoxColor;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j11 = this.uncheckedBoxColor;
            }
        } else {
            int i13 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i13 == 1) {
                j11 = this.disabledCheckedBoxColor;
            } else if (i13 == 2) {
                j11 = this.disabledIndeterminateBoxColor;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j11 = this.disabledUncheckedBoxColor;
            }
        }
        long j12 = j11;
        if (z11) {
            composer.startReplaceGroup(507535414);
            composer2 = composer;
            rememberUpdatedState = SingleValueAnimationKt.m113animateColorAsStateeuL9pac(j12, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer2, 0, 12);
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(507715958);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(j12), composer2, 0);
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    @Composable
    @k
    public State<Color> checkmarkColor(@k ToggleableState toggleableState, @l Composer composer, int i11) {
        composer.startReplaceGroup(544656267);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(544656267, i11, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:407)");
        }
        ToggleableState toggleableState2 = ToggleableState.Off;
        State<Color> m113animateColorAsStateeuL9pac = SingleValueAnimationKt.m113animateColorAsStateeuL9pac(toggleableState == toggleableState2 ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor, AnimationSpecKt.tween$default(toggleableState == toggleableState2 ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m113animateColorAsStateeuL9pac;
    }

    private DefaultCheckboxColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22) {
        this.checkedCheckmarkColor = j11;
        this.uncheckedCheckmarkColor = j12;
        this.checkedBoxColor = j13;
        this.uncheckedBoxColor = j14;
        this.disabledCheckedBoxColor = j15;
        this.disabledUncheckedBoxColor = j16;
        this.disabledIndeterminateBoxColor = j17;
        this.checkedBorderColor = j18;
        this.uncheckedBorderColor = j19;
        this.disabledBorderColor = j21;
        this.disabledIndeterminateBorderColor = j22;
    }
}
