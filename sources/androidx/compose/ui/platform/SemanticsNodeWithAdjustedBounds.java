package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SemanticsNodeWithAdjustedBounds {
    public static final int $stable = 8;

    @m80.k
    private final Rect adjustedBounds;

    @m80.k
    private final SemanticsNode semanticsNode;

    public SemanticsNodeWithAdjustedBounds(@m80.k SemanticsNode semanticsNode, @m80.k Rect rect) {
        this.semanticsNode = semanticsNode;
        this.adjustedBounds = rect;
    }

    @m80.k
    public final Rect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    @m80.k
    public final SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }
}
