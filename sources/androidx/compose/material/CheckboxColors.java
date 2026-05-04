package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface CheckboxColors {
    @Composable
    @k
    State<Color> borderColor(boolean z11, @k ToggleableState toggleableState, @l Composer composer, int i11);

    @Composable
    @k
    State<Color> boxColor(boolean z11, @k ToggleableState toggleableState, @l Composer composer, int i11);

    @Composable
    @k
    State<Color> checkmarkColor(@k ToggleableState toggleableState, @l Composer composer, int i11);
}
