package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@ExperimentalLayoutApi
@Stable
@n(message = "ContextualFlowLayouts are no longer maintained")
/* loaded from: classes.dex */
public interface ContextualFlowRowScope extends RowScope {
    static /* synthetic */ Modifier fillMaxRowHeight$default(ContextualFlowRowScope contextualFlowRowScope, Modifier modifier, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxRowHeight");
        }
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return contextualFlowRowScope.fillMaxRowHeight(modifier, f11);
    }

    @ExperimentalLayoutApi
    @m80.k
    Modifier fillMaxRowHeight(@m80.k Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f11);

    int getIndexInLine();

    int getLineIndex();

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    float mo644getMaxHeightD9Ej5fM();

    /* renamed from: getMaxWidthInLine-D9Ej5fM, reason: not valid java name */
    float mo645getMaxWidthInLineD9Ej5fM();
}
