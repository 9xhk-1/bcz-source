package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@Stable
/* loaded from: classes.dex */
public interface FlowColumnScope extends ColumnScope {
    static /* synthetic */ Modifier fillMaxColumnWidth$default(FlowColumnScope flowColumnScope, Modifier modifier, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxColumnWidth");
        }
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return flowColumnScope.fillMaxColumnWidth(modifier, f11);
    }

    @ExperimentalLayoutApi
    @m80.k
    Modifier fillMaxColumnWidth(@m80.k Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f11);
}
