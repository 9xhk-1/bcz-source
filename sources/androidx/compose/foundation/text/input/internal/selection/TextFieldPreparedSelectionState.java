package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldPreparedSelectionState {
    public static final int $stable = 8;
    private float cachedX = Float.NaN;

    public final float getCachedX() {
        return this.cachedX;
    }

    public final void resetCachedX() {
        this.cachedX = Float.NaN;
    }

    public final void setCachedX(float f11) {
        this.cachedX = f11;
    }
}
