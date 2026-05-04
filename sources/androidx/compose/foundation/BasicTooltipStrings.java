package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.res.StringResources_androidKt;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class BasicTooltipStrings {
    public static final int $stable = 0;

    @m80.k
    public static final BasicTooltipStrings INSTANCE = new BasicTooltipStrings();

    private BasicTooltipStrings() {
    }

    @Composable
    @m80.k
    public final String description(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1416633714, i11, -1, "androidx.compose.foundation.BasicTooltipStrings.description (BasicTooltip.android.kt:26)");
        }
        String stringResource = StringResources_androidKt.stringResource(R.string.tooltip_description, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    @Composable
    @m80.k
    public final String label(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(187295226, i11, -1, "androidx.compose.foundation.BasicTooltipStrings.label (BasicTooltip.android.kt:24)");
        }
        String stringResource = StringResources_androidKt.stringResource(R.string.tooltip_label, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stringResource;
    }
}
