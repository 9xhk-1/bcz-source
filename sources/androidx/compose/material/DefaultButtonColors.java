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
final class DefaultButtonColors implements ButtonColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;

    public /* synthetic */ DefaultButtonColors(long j11, long j12, long j13, long j14, v vVar) {
        this(j11, j12, j13, j14);
    }

    @Override // androidx.compose.material.ButtonColors
    @Composable
    @k
    public State<Color> backgroundColor(boolean z11, @l Composer composer, int i11) {
        composer.startReplaceGroup(-655254499);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-655254499, i11, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:584)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z11 ? this.backgroundColor : this.disabledBackgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.ButtonColors
    @Composable
    @k
    public State<Color> contentColor(boolean z11, @l Composer composer, int i11) {
        composer.startReplaceGroup(-2133647540);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2133647540, i11, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:589)");
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
        if (obj == null || DefaultButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultButtonColors defaultButtonColors = (DefaultButtonColors) obj;
        return Color.m2510equalsimpl0(this.backgroundColor, defaultButtonColors.backgroundColor) && Color.m2510equalsimpl0(this.contentColor, defaultButtonColors.contentColor) && Color.m2510equalsimpl0(this.disabledBackgroundColor, defaultButtonColors.disabledBackgroundColor) && Color.m2510equalsimpl0(this.disabledContentColor, defaultButtonColors.disabledContentColor);
    }

    public int hashCode() {
        return (((((Color.m2516hashCodeimpl(this.backgroundColor) * 31) + Color.m2516hashCodeimpl(this.contentColor)) * 31) + Color.m2516hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m2516hashCodeimpl(this.disabledContentColor);
    }

    private DefaultButtonColors(long j11, long j12, long j13, long j14) {
        this.backgroundColor = j11;
        this.contentColor = j12;
        this.disabledBackgroundColor = j13;
        this.disabledContentColor = j14;
    }
}
