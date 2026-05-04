package androidx.compose.material;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntRect;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class WindowBoundsCalculator {
    public static final int $stable = 8;

    @k
    private final View view;

    public WindowBoundsCalculator(@k View view) {
        this.view = view;
    }

    @k
    public final IntRect getVisibleWindowBounds() {
        IntRect windowBounds;
        windowBounds = ExposedDropdownMenu_android.getWindowBounds(this.view);
        return windowBounds;
    }
}
