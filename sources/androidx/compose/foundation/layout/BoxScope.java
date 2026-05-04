package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@Immutable
/* loaded from: classes.dex */
public interface BoxScope {
    @Stable
    @m80.k
    Modifier align(@m80.k Modifier modifier, @m80.k Alignment alignment);

    @Stable
    @m80.k
    Modifier matchParentSize(@m80.k Modifier modifier);
}
