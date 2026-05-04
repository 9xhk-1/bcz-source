package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface ChipColors {
    @Composable
    @k
    State<Color> backgroundColor(boolean z11, @l Composer composer, int i11);

    @Composable
    @k
    State<Color> contentColor(boolean z11, @l Composer composer, int i11);

    @Composable
    @k
    State<Color> leadingIconContentColor(boolean z11, @l Composer composer, int i11);
}
