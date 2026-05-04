package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ShadowKt {
    @Stable
    @m80.k
    public static final Shadow lerp(@m80.k Shadow shadow, @m80.k Shadow shadow2, float f11) {
        return new Shadow(ColorKt.m2560lerpjxsXWHM(shadow.m2834getColor0d7_KjU(), shadow2.m2834getColor0d7_KjU(), f11), OffsetKt.m2291lerpWko1d7g(shadow.m2835getOffsetF1C5BW0(), shadow2.m2835getOffsetF1C5BW0(), f11), MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f11), null);
    }
}
