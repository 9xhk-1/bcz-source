package androidx.compose.material;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@n(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface ThresholdConfig {
    float computeThreshold(@k Density density, float f11, float f12);
}
