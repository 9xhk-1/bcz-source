package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@Immutable
/* loaded from: classes.dex */
public interface RowScope {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Modifier weight$default(RowScope rowScope, Modifier modifier, float f11, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return rowScope.weight(modifier, f11, z11);
    }

    @Stable
    @m80.k
    Modifier align(@m80.k Modifier modifier, @m80.k Alignment.Vertical vertical);

    @Stable
    @m80.k
    Modifier alignBy(@m80.k Modifier modifier, @m80.k HorizontalAlignmentLine horizontalAlignmentLine);

    @Stable
    @m80.k
    Modifier alignBy(@m80.k Modifier modifier, @m80.k l<? super Measured, Integer> lVar);

    @Stable
    @m80.k
    Modifier alignByBaseline(@m80.k Modifier modifier);

    @Stable
    @m80.k
    Modifier weight(@m80.k Modifier modifier, @FloatRange(from = 0.0d, fromInclusive = false) float f11, boolean z11);
}
