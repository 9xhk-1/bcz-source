package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextPreparedSelectionState {
    public static final int $stable = 8;

    @l
    private Float cachedX;

    @l
    public final Float getCachedX() {
        return this.cachedX;
    }

    public final void resetCachedX() {
        this.cachedX = null;
    }

    public final void setCachedX(@l Float f11) {
        this.cachedX = f11;
    }
}
