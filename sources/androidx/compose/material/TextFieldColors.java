package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.DeprecationLevel;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface TextFieldColors {
    @Composable
    @k
    State<Color> backgroundColor(boolean z11, @l Composer composer, int i11);

    @Composable
    @k
    State<Color> cursorColor(boolean z11, @l Composer composer, int i11);

    @Composable
    @k
    State<Color> indicatorColor(boolean z11, boolean z12, @k InteractionSource interactionSource, @l Composer composer, int i11);

    @Composable
    @k
    State<Color> labelColor(boolean z11, boolean z12, @k InteractionSource interactionSource, @l Composer composer, int i11);

    @Composable
    @k
    default State<Color> leadingIconColor(boolean z11, boolean z12, @k InteractionSource interactionSource, @l Composer composer, int i11) {
        composer.startReplaceGroup(-1036335134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1036335134, i11, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:124)");
        }
        State<Color> leadingIconColor = leadingIconColor(z11, z12, composer, (i11 & 126) | ((i11 >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return leadingIconColor;
    }

    @Composable
    @n(level = DeprecationLevel.WARNING, message = "Use/implement overload with interactionSource parameter", replaceWith = @w0(expression = "leadingIconColor(enabled, isError, interactionSource)", imports = {}))
    @k
    State<Color> leadingIconColor(boolean z11, boolean z12, @l Composer composer, int i11);

    @Composable
    @k
    State<Color> placeholderColor(boolean z11, @l Composer composer, int i11);

    @Composable
    @k
    State<Color> textColor(boolean z11, @l Composer composer, int i11);

    @Composable
    @k
    default State<Color> trailingIconColor(boolean z11, boolean z12, @k InteractionSource interactionSource, @l Composer composer, int i11) {
        composer.startReplaceGroup(454310320);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(454310320, i11, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:155)");
        }
        State<Color> trailingIconColor = trailingIconColor(z11, z12, composer, (i11 & 126) | ((i11 >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return trailingIconColor;
    }

    @Composable
    @n(level = DeprecationLevel.WARNING, message = "Use/implement overload with interactionSource parameter", replaceWith = @w0(expression = "trailingIconColor(enabled, isError, interactionSource)", imports = {}))
    @k
    State<Color> trailingIconColor(boolean z11, boolean z12, @l Composer composer, int i11);
}
