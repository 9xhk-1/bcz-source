package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ScrollingContainerKt {
    @m80.k
    public static final Modifier scrollingContainer(@m80.k Modifier modifier, @m80.k ScrollableState scrollableState, @m80.k Orientation orientation, boolean z11, boolean z12, @l FlingBehavior flingBehavior, @l MutableInteractionSource mutableInteractionSource, boolean z13, @l OverscrollEffect overscrollEffect, @l BringIntoViewSpec bringIntoViewSpec) {
        return ClipScrollableContainerKt.clipScrollableContainer(modifier, orientation).then(new ScrollingContainerElement(scrollableState, orientation, z11, z12, flingBehavior, mutableInteractionSource, bringIntoViewSpec, z13, overscrollEffect));
    }
}
