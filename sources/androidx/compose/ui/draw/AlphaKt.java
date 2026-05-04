package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AlphaKt {
    @Stable
    @k
    public static final Modifier alpha(@k Modifier modifier, float f11) {
        return f11 == 1.0f ? modifier : GraphicsLayerModifierKt.m2669graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, f11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 126971, null);
    }
}
