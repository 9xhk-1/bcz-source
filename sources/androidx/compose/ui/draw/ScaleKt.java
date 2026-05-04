package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ScaleKt {
    @Stable
    @k
    public static final Modifier scale(@k Modifier modifier, float f11, float f12) {
        return (f11 == 1.0f && f12 == 1.0f) ? modifier : GraphicsLayerModifierKt.m2669graphicsLayerAp8cVGQ$default(modifier, f11, f12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131068, null);
    }

    @Stable
    @k
    public static final Modifier scale(@k Modifier modifier, float f11) {
        return scale(modifier, f11, f11);
    }
}
