package androidx.compose.ui.layout;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import kotlin.DeprecationLevel;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(level = DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class TestModifierUpdater {
    public static final int $stable = 8;

    @k
    private final LayoutNode node;

    public TestModifierUpdater(@k LayoutNode layoutNode) {
        this.node = layoutNode;
    }

    public final void updateModifier(@k Modifier modifier) {
        this.node.setModifier(modifier);
    }
}
